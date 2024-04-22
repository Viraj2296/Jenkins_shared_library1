def call() {
    sh 'trivy image sevenajay/youtube:latest > trivyimage.txt'
    sh "trivy image --format html -o ${env.WORKSPACE}/trivy-image-report.html sevenajay/youtube:latest"  // HTML report
}