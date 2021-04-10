package mymvc;

public class ControllerNotFoundException extends RuntimeException {

    // 自定义异常
    public ControllerNotFoundException(){}
    public ControllerNotFoundException(String message){
        super(message);
    }
}
