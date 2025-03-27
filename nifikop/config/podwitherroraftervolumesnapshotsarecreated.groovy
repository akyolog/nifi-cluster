kind: Pod
apiVersion: v1
metadata:
  generateName: nifidemo-2-node
  annotations:
    banzaicloud.com/last-applied: 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
    k8s.ovn.org/pod-networks: '{"default":{"ip_addresses":["10.130.3.76/23"],"mac_address":"0a:58:0a:82:03:4c","gateway_ips":["10.130.2.1"],"routes":[{"dest":"10.128.0.0/14","nextHop":"10.130.2.1"},{"dest":"172.30.0.0/16","nextHop":"10.130.2.1"},{"dest":"169.254.169.5/32","nextHop":"10.130.2.1"},{"dest":"100.64.0.0/16","nextHop":"10.130.2.1"}],"ip_address":"10.130.3.76/23","gateway_ip":"10.130.2.1","role":"primary"}}'
    openshift.io/scc: restricted-v2
    prometheus.io/port: '9090'
    prometheus.io/scrape: 'true'
    seccomp.security.alpha.kubernetes.io/pod: runtime/default
  resourceVersion: '3745975969'
  name: nifidemo-2-nodes67bx
  uid: e78a0a2a-1386-454b-a1ca-41335221c42a
  creationTimestamp: '2025-03-25T10:21:17Z'
  managedFields:
    - manager: manager
      operation: Update
      apiVersion: v1
      time: '2025-03-25T10:21:17Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:annotations':
            .: {}
            'f:banzaicloud.com/last-applied': {}
            'f:prometheus.io/port': {}
            'f:prometheus.io/scrape': {}
          'f:generateName': {}
          'f:labels':
            .: {}
            'f:app': {}
            'f:cluster-name': {}
            'f:nifi_cr': {}
            'f:nodeId': {}
          'f:ownerReferences':
            .: {}
            'k:{"uid":"bf57df6e-bdff-4328-8b8b-6a715bb8f52e"}': {}
        'f:spec':
          'f:volumes':
            'k:{"name":"content-repository"}':
              .: {}
              'f:name': {}
              'f:persistentVolumeClaim':
                .: {}
                'f:claimName': {}
            'k:{"name":"provenance-repository"}':
              .: {}
              'f:name': {}
              'f:persistentVolumeClaim':
                .: {}
                'f:claimName': {}
            'k:{"name":"conf"}':
              .: {}
              'f:name': {}
              'f:persistentVolumeClaim':
                .: {}
                'f:claimName': {}
            .: {}
            'k:{"name":"data"}':
              .: {}
              'f:name': {}
              'f:persistentVolumeClaim':
                .: {}
                'f:claimName': {}
            'k:{"name":"node-tmp"}':
              .: {}
              'f:emptyDir': {}
              'f:name': {}
            'k:{"name":"logs"}':
              .: {}
              'f:name': {}
              'f:persistentVolumeClaim':
                .: {}
                'f:claimName': {}
            'k:{"name":"extensions-repository"}':
              .: {}
              'f:name': {}
              'f:persistentVolumeClaim':
                .: {}
                'f:claimName': {}
            'k:{"name":"node-config"}':
              .: {}
              'f:name': {}
              'f:secret':
                .: {}
                'f:defaultMode': {}
                'f:secretName': {}
            'k:{"name":"flowfile-repository"}':
              .: {}
              'f:name': {}
              'f:persistentVolumeClaim':
                .: {}
                'f:claimName': {}
          'f:containers':
            'k:{"name":"nifi"}':
              'f:image': {}
              'f:volumeMounts':
                'k:{"mountPath":"/tmp"}':
                  .: {}
                  'f:mountPath': {}
                  'f:name': {}
                'k:{"mountPath":"/opt/nifi/nifi-current/logs"}':
                  .: {}
                  'f:mountPath': {}
                  'f:name': {}
                'k:{"mountPath":"/opt/nifi/data"}':
                  .: {}
                  'f:mountPath': {}
                  'f:name': {}
                .: {}
                'k:{"mountPath":"/opt/nifi/flowfile_repository"}':
                  .: {}
                  'f:mountPath': {}
                  'f:name': {}
                'k:{"mountPath":"/opt/nifi/content_repository"}':
                  .: {}
                  'f:mountPath': {}
                  'f:name': {}
                'k:{"mountPath":"/opt/nifi/nifi-current/tmp"}':
                  .: {}
                  'f:mountPath': {}
                  'f:name': {}
                'k:{"mountPath":"/opt/nifi/extensions"}':
                  .: {}
                  'f:mountPath': {}
                  'f:name': {}
                'k:{"mountPath":"/opt/nifi/provenance_repository"}':
                  .: {}
                  'f:mountPath': {}
                  'f:name': {}
                'k:{"mountPath":"/opt/nifi/nifi-current/conf"}':
                  .: {}
                  'f:mountPath': {}
                  'f:name': {}
              'f:terminationMessagePolicy': {}
              .: {}
              'f:resources':
                .: {}
                'f:limits':
                  .: {}
                  'f:cpu': {}
                  'f:memory': {}
                'f:requests':
                  .: {}
                  'f:cpu': {}
                  'f:memory': {}
              'f:lifecycle':
                .: {}
                'f:preStop':
                  .: {}
                  'f:exec':
                    .: {}
                    'f:command': {}
              'f:command': {}
              'f:livenessProbe':
                .: {}
                'f:failureThreshold': {}
                'f:initialDelaySeconds': {}
                'f:periodSeconds': {}
                'f:successThreshold': {}
                'f:tcpSocket':
                  .: {}
                  'f:port': {}
                'f:timeoutSeconds': {}
              'f:env':
                .: {}
                'k:{"name":"NIFI_ZOOKEEPER_CONNECT_STRING"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"POD_IP"}':
                  .: {}
                  'f:name': {}
                  'f:valueFrom':
                    .: {}
                    'f:fieldRef': {}
              'f:readinessProbe':
                .: {}
                'f:exec':
                  .: {}
                  'f:command': {}
                'f:failureThreshold': {}
                'f:initialDelaySeconds': {}
                'f:periodSeconds': {}
                'f:successThreshold': {}
                'f:timeoutSeconds': {}
              'f:securityContext':
                .: {}
                'f:allowPrivilegeEscalation': {}
                'f:capabilities':
                  .: {}
                  'f:drop': {}
              'f:terminationMessagePath': {}
              'f:imagePullPolicy': {}
              'f:ports':
                .: {}
                'k:{"containerPort":6007,"protocol":"TCP"}':
                  .: {}
                  'f:containerPort': {}
                  'f:name': {}
                  'f:protocol': {}
                'k:{"containerPort":6342,"protocol":"TCP"}':
                  .: {}
                  'f:containerPort': {}
                  'f:name': {}
                  'f:protocol': {}
                'k:{"containerPort":8081,"protocol":"TCP"}':
                  .: {}
                  'f:containerPort': {}
                  'f:name': {}
                  'f:protocol': {}
                'k:{"containerPort":9090,"protocol":"TCP"}':
                  .: {}
                  'f:containerPort': {}
                  'f:name': {}
                  'f:protocol': {}
                'k:{"containerPort":10000,"protocol":"TCP"}':
                  .: {}
                  'f:containerPort': {}
                  'f:name': {}
                  'f:protocol': {}
              'f:name': {}
          'f:hostname': {}
          'f:dnsPolicy': {}
          'f:serviceAccount': {}
          'f:restartPolicy': {}
          'f:subdomain': {}
          'f:schedulerName': {}
          'f:terminationGracePeriodSeconds': {}
          'f:serviceAccountName': {}
          'f:enableServiceLinks': {}
          'f:securityContext':
            .: {}
            'f:fsGroup': {}
            'f:runAsNonRoot': {}
            'f:runAsUser': {}
            'f:seccompProfile':
              .: {}
              'f:type': {}
          'f:affinity':
            .: {}
            'f:podAntiAffinity':
              .: {}
              'f:requiredDuringSchedulingIgnoredDuringExecution': {}
    - manager: kubelet
      operation: Update
      apiVersion: v1
      time: '2025-03-25T10:21:22Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:status':
          'f:conditions':
            'k:{"type":"ContainersReady"}':
              .: {}
              'f:lastProbeTime': {}
              'f:lastTransitionTime': {}
              'f:message': {}
              'f:reason': {}
              'f:status': {}
              'f:type': {}
            'k:{"type":"Initialized"}':
              .: {}
              'f:lastProbeTime': {}
              'f:lastTransitionTime': {}
              'f:status': {}
              'f:type': {}
            'k:{"type":"PodReadyToStartContainers"}':
              .: {}
              'f:lastProbeTime': {}
              'f:lastTransitionTime': {}
              'f:status': {}
              'f:type': {}
            'k:{"type":"Ready"}':
              .: {}
              'f:lastProbeTime': {}
              'f:lastTransitionTime': {}
              'f:message': {}
              'f:reason': {}
              'f:status': {}
              'f:type': {}
          'f:containerStatuses': {}
          'f:hostIP': {}
          'f:hostIPs': {}
          'f:startTime': {}
      subresource: status
    - manager: mgmt-qtr7s-worker-6jhr6
      operation: Update
      apiVersion: v1
      time: '2025-03-25T10:21:22Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:annotations':
            'f:k8s.ovn.org/pod-networks': {}
      subresource: status
  namespace: test-java-playground
  ownerReferences:
    - apiVersion: nifi.konpyutaika.com/v1
      kind: NifiCluster
      name: nifidemo
      uid: bf57df6e-bdff-4328-8b8b-6a715bb8f52e
      controller: true
      blockOwnerDeletion: true
  labels:
    app: nifi
    cluster-name: nifidemo
    nifi_cr: nifidemo
    nodeId: '2'
spec:
  restartPolicy: Never
  serviceAccountName: nifikop
  imagePullSecrets:
    - name: nifikop-dockercfg-scfkr
  priority: 0
  subdomain: nifidemo-headless
  schedulerName: default-scheduler
  enableServiceLinks: true
  affinity:
    podAntiAffinity:
      requiredDuringSchedulingIgnoredDuringExecution:
        - labelSelector:
            matchLabels:
              app: nifi
              nifi_cr: nifidemo
          topologyKey: kubernetes.io/hostname
  terminationGracePeriodSeconds: 120
  preemptionPolicy: PreemptLowerPriority
  nodeName: mgmt-qtr7s-worker-6jhr6
  securityContext:
    seLinuxOptions:
      level: 's0:c36,c5'
    runAsUser: 1001270000
    runAsNonRoot: true
    fsGroup: 1001270000
    seccompProfile:
      type: RuntimeDefault
  containers:
    - resources:
        limits:
          cpu: '1'
          memory: 2Gi
        requests:
          cpu: '1'
          memory: 2Gi
      readinessProbe:
        exec:
          command:
            - bash
            - '-c'
            - 'curl -kv http://$(hostname -f):8081/nifi-api'
        initialDelaySeconds: 60
        timeoutSeconds: 10
        periodSeconds: 20
        successThreshold: 1
        failureThreshold: 5
      terminationMessagePath: /dev/termination-log
      lifecycle:
        preStop:
          exec:
            command:
              - bash
              - '-c'
              - $NIFI_HOME/bin/nifi.sh stop
      name: nifi
      command:
        - bash
        - '-ce'
        - "cp ${NIFI_HOME}/tmp/* ${NIFI_HOME}/conf/\necho \"Trying to contact Zookeeper using connection string: ${NIFI_ZOOKEEPER_CONNECT_STRING}\"\n\nconnected=0\nIFS=',' read -r -a zk_hosts <<< \"${NIFI_ZOOKEEPER_CONNECT_STRING}\"\nuntil [ $connected -eq 1 ]\ndo\n\tfor zk_host in \"${zk_hosts[@]}\"\n\tdo\n\t\tIFS=':' read -r -a zk_host_port <<< \"${zk_host}\"\n\n\t\techo \"Checking Zookeeper Host: [${zk_host_port[0]}] Port: [${zk_host_port[1]}]\"\n\t\tset +e\n\t\tcurl --telnet-option 'BOGUS=1' --connect-timeout 2 -s telnet://${zk_host_port[0]}:${zk_host_port[1]} < /dev/null\n\t\tif [ $? -eq 48 ]; then\n\t\t\techo \"Connected to ${zk_host_port}\"\n\t\t\tconnected=1\n\t\tfi\n\t\tset -e\n\tdone\n\n\tsleep 1\ndone\necho \"Waiting for host to be reachable\"\nnotMatchedIp=true\nwhile $notMatchedIp\ndo\n\techo \"failed to reach nifidemo-2-node.nifidemo-headless.test-java-playground.svc.cluster.local:8081\"\n\techo \"Found: $ipResolved, expecting: $POD_IP\"\n    sleep 5\n\n\tipResolved=$(curl -v -4 -m 1 --connect-timeout 1 nifidemo-2-node.nifidemo-headless.test-java-playground.svc.cluster.local:8081 2>&1 | grep -o 'Trying [0-9.]*' | awk '{gsub(/\\.\\.\\./, \"\"); print $2}' | head -n 1)\n\techo \"Found: $ipResolved\"\n    if [[ \"$ipResolved\" == \"$POD_IP\" ]]; then\n\t\techo Ip match for $POD_IP\n\t\tnotMatchedIp=false\n\tfi\ndone\necho \"Hostname is successfully binded with IP address\"\n\nexec bin/nifi.sh run"
      livenessProbe:
        tcpSocket:
          port: 8081
        initialDelaySeconds: 90
        timeoutSeconds: 20
        periodSeconds: 60
        successThreshold: 1
        failureThreshold: 5
      env:
        - name: NIFI_ZOOKEEPER_CONNECT_STRING
          value: 'zookeeper.test-java-playground.svc.cluster.local:2181'
        - name: POD_IP
          valueFrom:
            fieldRef:
              apiVersion: v1
              fieldPath: status.podIP
      securityContext:
        capabilities:
          drop:
            - ALL
        allowPrivilegeEscalation: false
      ports:
        - name: http
          containerPort: 8081
          protocol: TCP
        - name: cluster
          containerPort: 6007
          protocol: TCP
        - name: s2s
          containerPort: 10000
          protocol: TCP
        - name: prometheus
          containerPort: 9090
          protocol: TCP
        - name: load-balance
          containerPort: 6342
          protocol: TCP
      imagePullPolicy: IfNotPresent
      volumeMounts:
        - name: conf
          mountPath: /opt/nifi/nifi-current/conf
        - name: content-repository
          mountPath: /opt/nifi/content_repository
        - name: data
          mountPath: /opt/nifi/data
        - name: extensions-repository
          mountPath: /opt/nifi/extensions
        - name: flowfile-repository
          mountPath: /opt/nifi/flowfile_repository
        - name: logs
          mountPath: /opt/nifi/nifi-current/logs
        - name: node-config
          mountPath: /opt/nifi/nifi-current/tmp
        - name: node-tmp
          mountPath: /tmp
        - name: provenance-repository
          mountPath: /opt/nifi/provenance_repository
        - name: kube-api-access-spnt6
          readOnly: true
          mountPath: /var/run/secrets/kubernetes.io/serviceaccount
      terminationMessagePolicy: File
      image: 'apache/nifi:2.3.0'
  hostname: nifidemo-2-node
  serviceAccount: nifikop
  volumes:
    - name: conf
      persistentVolumeClaim:
        claimName: nifidemo-2-conf-storage-94sm8
    - name: content-repository
      persistentVolumeClaim:
        claimName: nifidemo-2-content-repository-storage-tdhtx
    - name: data
      persistentVolumeClaim:
        claimName: nifidemo-2-data-storage-bpfg9
    - name: extensions-repository
      persistentVolumeClaim:
        claimName: nifidemo-2-extensions-repository-storage-7mgwq
    - name: flowfile-repository
      persistentVolumeClaim:
        claimName: nifidemo-2-flowfile-repository-storage-6p54b
    - name: logs
      persistentVolumeClaim:
        claimName: nifidemo-2-logs-storage-kfltg
    - name: node-config
      secret:
        secretName: nifidemo-config-2
        defaultMode: 420
    - name: node-tmp
      emptyDir: {}
    - name: provenance-repository
      persistentVolumeClaim:
        claimName: nifidemo-2-provenance-repository-storage-ccnf4
    - name: kube-api-access-spnt6
      projected:
        sources:
          - serviceAccountToken:
              expirationSeconds: 3607
              path: token
          - configMap:
              name: kube-root-ca.crt
              items:
                - key: ca.crt
                  path: ca.crt
          - downwardAPI:
              items:
                - path: namespace
                  fieldRef:
                    apiVersion: v1
                    fieldPath: metadata.namespace
          - configMap:
              name: openshift-service-ca.crt
              items:
                - key: service-ca.crt
                  path: service-ca.crt
        defaultMode: 420
  dnsPolicy: ClusterFirst
  tolerations:
    - key: node.kubernetes.io/not-ready
      operator: Exists
      effect: NoExecute
      tolerationSeconds: 300
    - key: node.kubernetes.io/unreachable
      operator: Exists
      effect: NoExecute
      tolerationSeconds: 300
    - key: node.kubernetes.io/memory-pressure
      operator: Exists
      effect: NoSchedule
status:
  phase: Pending
  conditions:
    - type: PodReadyToStartContainers
      status: 'False'
      lastProbeTime: null
      lastTransitionTime: '2025-03-25T10:21:22Z'
    - type: Initialized
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2025-03-25T10:21:22Z'
    - type: Ready
      status: 'False'
      lastProbeTime: null
      lastTransitionTime: '2025-03-25T10:21:22Z'
      reason: ContainersNotReady
      message: 'containers with unready status: [nifi]'
    - type: ContainersReady
      status: 'False'
      lastProbeTime: null
      lastTransitionTime: '2025-03-25T10:21:22Z'
      reason: ContainersNotReady
      message: 'containers with unready status: [nifi]'
    - type: PodScheduled
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2025-03-25T10:21:22Z'
  hostIP: 10.22.59.231
  hostIPs:
    - ip: 10.22.59.231
  startTime: '2025-03-25T10:21:22Z'
  containerStatuses:
    - name: nifi
      state:
        waiting:
          reason: ContainerCreating
      lastState: {}
      ready: false
      restartCount: 0
      image: 'apache/nifi:2.3.0'
      imageID: ''
      started: false
  qosClass: Guaranteed
------------------
AttachVolume.Attach failed for volume "pvc-770e31c0-6a66-4f31-ac2a-d0db518386ed" : rpc error: code = Internal desc = failed to attach disk: "c03c063d-dfc2-4047-b84f-1ceafd62a729" with node: "42346302-6a08-aaa4-baae-e0b0f8357785" err ServerFaultCode: CNS: Failed to retrieve datastore for vol c03c063d-dfc2-4047-b84f-1ceafd62a729. (vim.fault.NotFound) { faultCause = (vmodl.MethodFault) null, faultMessage = <unset> msg = "The vStorageObject (vim.vslm.ID) { dynamicType = null, dynamicProperty = null, id = c03c063d-dfc2-4047-b84f-1ceafd62a729 } was not found" }
--------------------
Trying to contact Zookeeper using connection string: zookeeper.test-java-playground.svc.cluster.local:2181
Checking Zookeeper Host: [zookeeper.test-java-playground.svc.cluster.local] Port: [2181]
Connected to zookeeper.test-java-playground.svc.cluster.local
Waiting for host to be reachable
failed to reach nifidemo-1-node.nifidemo-headless.test-java-playground.svc.cluster.local:8081
Found: , expecting: 10.128.7.212
Found: 10.128.7.212
Ip match for 10.128.7.212
Hostname is successfully binded with IP address
bash: line 41: /opt/nifi/nifi-current/bin/nifi.sh: Permission denied