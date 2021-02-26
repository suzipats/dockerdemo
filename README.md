## General info
This is a simple springboot webapp to demonstrate deployment using docker.


<br><br>
###Create image with name *suzipats/dockerdemo* with tag *b1*
Make sure that project is compiled and jar file is created in 'target' directory
Go to location where 'DockerFile' is located and run below<br>

    docker build -t dockerdemo:b1
Or go provide absolute path of 'Dockerfile'<br>

    docker build -t dockerdemo:b1 /mnt/d/study/project/intellijcode/dockerdemo


<br><br>
###To run the container from the image
-d: run in detacked mode<br>
-v : mount a directory on host(/home/sushil/logs) on the container(/home/logs). When container writes its logs to /home/logs these log files are persisted on the host machine location and are not removed when container is stopped/removed<br>
-p map the host machines port 5555 to containers 8080 port<br>
`docker run -d -v /home/sushil/logs:/home/logs -p 5555:8080 suzipats/dockerdemo:b1`

Go to http://localhost:5555 to see the webpage created by the application


<br><br>
###Push the image to dockerhub
Below command will push the image 'dockerdemo' with tag 'b1' to repository called as 'dockerdemo' under user 'suzipats'
    docker push  -t suzipats/dockerdemo:b1

