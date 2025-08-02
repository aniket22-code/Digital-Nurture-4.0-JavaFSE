import React from 'react';
import CourseDetails from './pages/CourseDetails';
import BookDetails from './pages/Blogs';
import BlogDetails from './pages/BookDetails';
import './App.css';

function App() {
  return (
    <div className="container">
      <CourseDetails />
      <BookDetails />
      <BlogDetails />
    </div>
  );
}

export default App;
