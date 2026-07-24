import axios from "axios";

class GitClient {

  getRepositories(username) {
    return axios.get(`https://api.github.com/users/${username}/repos`);
  }

}

const gitClient = new GitClient();

export default gitClient;