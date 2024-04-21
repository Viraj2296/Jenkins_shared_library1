def call(String dockerHubUsername, String imageName) {
    // Build the Docker image
    sh "sudo docker build --build-arg REACT_APP_RAPID_API_KEY=869be490d8mshaedf30c3e5c2ca2p1011afjsn7c2f0ce295c6 -t ${imageName} ."
     // Tag the Docker image
    sh "sudo docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    // Push the Docker image
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'docker']) {
        sh "sudo docker push ${dockerHubUsername}/${imageName}:latest"
    }
}