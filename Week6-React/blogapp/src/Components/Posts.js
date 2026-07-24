import React, { Component } from 'react';
import Post from '../Models/Post';

class Posts extends Component {

  constructor(props) {
    super(props);

    this.state = {
      posts: []
    };
  }

  // 👇 Paste loadPosts() HERE
  loadPosts() {

    fetch("https://jsonplaceholder.typicode.com/posts")
      .then(response => response.json())
      .then(data => {

        const posts = data.map(item =>
          new Post(
            item.userId,
            item.id,
            item.title,
            item.body
          )
        );

        this.setState({
          posts: posts
        });

      });

  }

  // 👇 Then paste componentDidMount() HERE
  componentDidMount() {
    this.loadPosts();

    
  }
  render() {
  return (
    <div>
      <h1>Posts</h1>

      {
        this.state.posts.map(post => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
            <hr />
          </div>
        ))
      }

    </div>
  );
}

}

export default Posts;