def call(String project) {



        
  sh 'docker build . -t 17hema/devops-training:$Docker_tag'
		   withCredentials([string(credentialsId: 'docker_password', variable: 'docker_password')]) {
				    
				  sh 'docker login -u 17hema -p $docker_password'
				  sh 'docker push docker push 17hema/devops-training:$Docker_tag'
			}
}
