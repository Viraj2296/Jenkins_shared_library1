def call() {
    sh 'trivy fs . > trivyfs.txt'
    sh "trivy fs --format html -o ${env.WORKSPACE}/trivy-fs-report.html ."  // HTML report
}