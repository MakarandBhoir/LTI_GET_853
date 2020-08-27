class Student {
    rollNumber: string;
    studentName: string;
    studentScore: string;
    static students:Student[] = new Array();
    constructor(rollNumber: string, studentName: string, studentScore: string) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.studentScore = studentScore;
    }
    addStudent(student: Student): string {
        Student.students.push(student);
        let html: string = "";
        html += "<table>";
        html += "<tr>";
        html += "<th>Roll Number</th>";
        html += "<th>Student Name</th>";
        html += "<th>Student Score</th>";
        html += "</tr>";
        for(let i=0; i<Student.students.length; i++){
            html += "<tr>";
            html += "<td>"+Student.students[i].rollNumber+"</td>";
            html += "<td>"+Student.students[i].studentName+"</td>";
            html += "<td>"+Student.students[i].studentScore+"</td>";
            html += "</tr>";
        }
        html += "</table>";
        return html;
    }
}

function main() {
    let rollNumber: string = (<HTMLInputElement>document.getElementById("rollno")).value;
    let studentName: string = (<HTMLInputElement>document.getElementById("studentName")).value;
    let studentScore: string = (<HTMLInputElement>document.getElementById("studentScore")).value;
    let student:Student = new Student(rollNumber, studentName, studentScore);   
    let result:string = student.addStudent(student);
    document.getElementById("result").innerHTML = result;
}