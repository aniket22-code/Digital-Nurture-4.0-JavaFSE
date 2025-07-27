// Posts.js
import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    
    
    this.state = {
      posts: []
    };
  }

 
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => {
        if (!response.ok) {
          throw new Error('Network response was not ok');
        }
        return response.json();
      })
      .then(data => {
        
        const posts = data.map(postData => 
          new Post(postData.id, postData.title, postData.body, postData.userId)
        );
        
       
        this.setState({ posts: posts });
      })
      .catch(error => {
        console.error('Error fetching posts:', error);
        throw error; 
      });
  }

  
  componentDidMount() {
    console.log('Component mounted, loading posts...');
    this.loadPosts();
  }


  componentDidCatch(error, errorInfo) {
    console.error('Error caught by componentDidCatch:', error, errorInfo);
    alert(`An error occurred: ${error.message}`);
  }


  render() {
    const { posts } = this.state;

    return (
      <div className="posts-container">
        <h1>Blog Posts</h1>
        {posts.length === 0 ? (
          <p>Loading posts...</p>
        ) : (
          posts.map(post => (
            <div key={post.id} className="post">
              <h3>{post.title}</h3>
              <p>{post.body}</p>
              <small>Post ID: {post.id} | User ID: {post.userId}</small>
              <hr />
            </div>
          ))
        )}
      </div>
    );
  }
}

export default Posts;