FROM fluent/fluentd:v1.16-1

USER root

COPY SYN-RootCA.crt /usr/local/share/ca-certificates/SYN-RootCA.crt
COPY zscaler.crt /usr/local/share/ca-certificates/zscaler.crt


RUN update-ca-certificates

RUN apk add --no-cache --update \
    build-base \
    ruby-dev \
    librdkafka-dev \
    gcc \
    musl-dev \
    make \
    bash \
    && gem install  fluent-plugin-elasticsearch --no-document

USER fluent