def call(String project) {



        
  sh 'docker build . -t 17hema/devops-training:latest'
		   withCredentials([string(credentialsId: 'docker_password', variable: 'docker_password')]) {
				    
				  sh 'docker login -u 17hema -p jachin2103'
				  sh 'docker push docker push 17hema/devops-training:latest'
			}
}
