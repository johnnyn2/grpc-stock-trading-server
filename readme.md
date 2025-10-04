### React (Vite) + Envoy (Proxy) + Spring Boot (gRPC)
This repository demostrate how Spring Boot backend serve gRPC HTTP/2 request by query data from MySQL database. 

Four modes:
1. Unary (Like REST API, 1 request, 1 response)
2. Server Streaming (1 request, Many response)
3. Client Streaming (Many request, 1 response)
4. Bidirectional (Like WebSocket)

### Repository
- [grpc-stock-trading-vite-client](https://github.com/johnnyn2/grpc-stock-trading-vite-client) : Browser frontend
- [grpc-stock-trading-envoy](https://github.com/johnnyn2/grpc-stock-trading-envoy) : Envoy Proxy
- [grpc-stock-trading-server](https://github.com/johnnyn2/grpc-stock-trading-server) : gRPC backend server
- [grpc-stock-trading-client](https://github.com/johnnyn2/grpc-stock-trading-client) : gRPC service client