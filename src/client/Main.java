package client;

public class Main {
    public static void main(String[] args) {
        model m = new model("10.80.47.216",1234);
        view v = new view();
        controller c = new controller(m, v);

    }
}
