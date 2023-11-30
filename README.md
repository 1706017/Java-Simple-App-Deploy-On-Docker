# Java-Simple-App-Deploy-On-Docker
Here we are deploying the simple Java App on Docker Container 

1) First step: we have created a Dockerfile 

2) Second step : we have build an image from Dockerfile 

**Command used for building image from Dockerfile :**
 <syntax>
 $docker build . -t <dockerhubAccountName>/image_name:latest
 <Actual used>
 $docker build . -t amrit1997/simplejavaapp:latest

3) Third step: Now we will push this images to docker Hub which is actually a registry for keeping/storing docker images

$docker login 
$docker push <image_name>

4) Fourth step : to run container from the image
  $docker run <image_name>

  

 

