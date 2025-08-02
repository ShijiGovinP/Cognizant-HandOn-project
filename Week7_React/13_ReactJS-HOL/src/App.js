import React from "react";
import BookDetails from "./components/BookDetails";
import CourseDetails from "./components/CourseDetails";
import BlogDetails from "./components/BlogDetails";
import "./App.css";

function App() {
  const books = [
    { id: 1, bname: "Master React", price: 670 },
    { id: 2, bname: "Deep Dive into Angular 11", price: 800 },
    { id: 3, bname: "Mongo Essentials", price: 450 },
  ];

  const courses = [
    { id: 1, name: "Angular", date: "4/5/2021" },
    { id: 2, name: "React", date: "6/3/2021" },
  ];

  const blogs = [
    {
      title: "React Learning",
      author: "Stephen Biz",
      desc: "Welcome to learning React!",
    },
    {
      title: "Installation",
      author: "Schewzdenier",
      desc: "You can install React from npm.",
    },
  ];

  return (
    <div className="main-container">
      <div className="mystyle1">
        <h1>Course Details</h1>
        <CourseDetails courses={courses} />
      </div>

      <div className="st2">
        <h1>Book Details</h1>
        <BookDetails books={books} />
      </div>

      <div className="v1">
        <h1>Blog Details</h1>
        <BlogDetails blogs={blogs} />
      </div>
    </div>
  );
}

export default App;

