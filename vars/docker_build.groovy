def call(String Projectname, String ImageTag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${Projectname}:${ImageTag} ."
}
