## General info
This is simple springboot web app to demonstrate deployment using docker.


<br><br>
###Create image with name *suzipats/dockerdemo* with tag *1.0.0*

`docker build -t suzipats/dockerdemo:b1 /mnt/d/study/project/intellijcode/dockerdemo
`

<br><br>
###To run the container from the image; 
-d: run in detacked mode<br>
-v : mount a directory on host(/home/sushil/logs) on the container(/home/logs). When container writes its logs to /home/logs these log files are persisted on the host machine location and are not removed when container is stopped/removed<br>
-p map the host machines port 5555 to containers 8080 port<br>
`docker run -d -v /home/sushil/logs:/home/logs -p 5555:8080 suzipats/dockerdemo:b1`

Go to http://localhost:5555 to see the webpage created by the application

###Docker file and image creation
Dockerfile: Expects the spring fat jar to be already present.