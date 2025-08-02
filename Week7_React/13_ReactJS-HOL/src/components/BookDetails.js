import React from "react";

function BlogDetails({ blogs }) {
  return (
    <div>
      {blogs.map((blog, index) => (
        <div key={index}>
          <h3>{blog.title}</h3>
          <b>{blog.author}</b>
          <p>{blog.desc}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;

