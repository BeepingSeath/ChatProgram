package client;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
    Socket socket;

    PrintWriter out;
    BufferedReader in;

    public static void main(String[] args) throws InterruptedException {
        model m = new model("10.80.47.216",1234);
        view v = new view();
        controller c = new controller(m, v);
        m.getStreams();
        ListenerThread l = new ListenerThread(m.in, System.out);
        Thread listener = new Thread(l);
        listener.start();
        m.runProtocol();
        listener.join();
        m.shutDown();
    }
}
