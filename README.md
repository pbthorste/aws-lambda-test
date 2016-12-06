# aws-lambda-test
Some tests on AWS lambda using Apex 

This project has AWS Lambda functions written in:

* Python
* Node.js
* Java

# AWS Setup

Create a role in AWS with the policy:

    {
      "Version": "2012-10-17",
      "Statement": [
        {
            "Effect": "Allow",
            "Action": [
                "logs:CreateLogGroup",
                "logs:CreateLogStream",
                "logs:PutLogEvents",
                "logs:DescribeLogStreams"
            ],
            "Resource": "arn:aws:logs:*:<my accound id or *>:*"
        }
      ]
    }

# Operations
## Deploy
    apex deploy -e dev
    apex deploy node-hello -e dev
## Invoke
    apex invoke -e dev
    apex invoke java-hello -e dev

