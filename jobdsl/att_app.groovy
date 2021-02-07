pipelineJob('testjobs/att-app') {
  definition {
    cpsScm {
      scm {
        git{
          remote{
            url('https://github.com/jngirakwizera/video-stream')
          }
          branch('*/main')
        }
        scriptPath('Jenkinsfile')
      }
    }
  }
}
