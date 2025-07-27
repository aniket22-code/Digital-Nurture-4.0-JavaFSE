import '../StyleSheets/mystyle.css'

const percentToDecimal = (percentage) => {
    return (percentage.toFixed(2) + '%')
}

const calcScore = (total, maxMarks) => {
    const percentage = (total / maxMarks) * 100;
    return percentToDecimal(percentage);
}

export const CalculateScore = ({Name, School, total, goal}) => {
    console.log("entering the calcscore");
    
    return (
        <div className='formatstyle'>
            <h1 className="student-title">Student Details</h1>
            <div className="Name">
                <b><span>Name: </span></b>
                <span>{Name}</span>
            </div>
            <div className='School'>
                <b><span>School: </span></b>
                <span>{School}</span>
            </div>
            <div className='Total'>
                <b><span>Total: </span></b>
                <span>{total} </span>
                <span>Marks</span>
            </div>
            <div className='Score'>
                <b>Score: </b>
                <span>
                    {calcScore(total, goal)}
                </span>
            </div>
        </div>
    );
}

export default CalculateScore;