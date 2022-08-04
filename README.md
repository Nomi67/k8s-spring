#################    Java springboot microserivces


    git clone https://github.com/farhanaliali/k8s-spring.git


########## deploying resource via kustomize


    kubectl kustomize  k8s | kubectl apply -f -


This will deploy 3 microservices 

    1. service-a
    2. service-b
    3. service-c


You can access both service B and C form service a

    kubectl get svc service-a   #### get the external ip

    http://externalIP/service/b
    http://externalIP/service/c


################################################################################
