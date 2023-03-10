package org.example.rpc;
import java.io.*;
import java.net.*;

import example.myapp.helloworld.grpc.*;

class RPCServer {
	
    private ServerSocket serverSocket;
    private Socket connection;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        connection = serverSocket.accept();
       
        HelloRequest requestDeserial = 
        		HelloRequest.parseDelimitedFrom(connection.getInputStream());
        
        System.out.println("greeting:"+requestDeserial.getFirstname());
        
        
        //do storage to the NoSQL database
        //call data access object to perform the task; 
         
    }

    public void stop() throws IOException {
        in.close();
        out.close();
        connection.close();
        serverSocket.close();
    }
//    public static void main(String[] args) throws IOException {
//        RPCServer server=new RPCServer();
//        server.start(3000);
//    }
//}

    public static void main(String[] args) throws Exception {
        ServerSocket sersock = new ServerSocket(1010);
        System.out.println("Server ready");
        Socket sock = sersock.accept();
       // BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        OutputStream ostream = sock.getOutputStream();
       PrintWriter pwrite = new PrintWriter(ostream, true);
       
        InputStream istream = sock.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
        String read = receiveRead.readLine();
        System.out.println("client's request :" + read);
        ostream.write(read.getBytes());
        ostream.flush();
        
        String receiveMessage, sendMessage, fun;
        int a, b, c;
        while (true) {
            fun = receiveRead.readLine();
            if (fun != null) {
                System.out.println("Operation : " + fun);
            }
            a = Integer.parseInt(receiveRead.readLine());
            System.out.println("Parameter 1 : " + a);
            b = Integer.parseInt(receiveRead.readLine());
            System.out.println("Parameter 2 : " + b);
            System.out.println(fun.compareTo("add"));
            if (fun.compareTo("add") == 0) {
                c = a + b;
                System.out.println("Addition = " + c);
                pwrite.println("Addition = " + c);
            }
            if (fun.compareTo("sub") == 0) {
                c = a - b;
                System.out.println("Substraction = " + c);
                pwrite.println("Substraction = " + c);
            }
            if (fun.compareTo("mul") == 0) {
                c = a * b;
                System.out.println("Multiplication = " + c);
                pwrite.println("Multiplication = " + c);
            }
            if (fun.compareTo("div") == 0) {
                c = a / b;
                System.out.println("Division = " + c);
                pwrite.println("Division = " + c);
            }
            System.out.flush();
        }
    }

}