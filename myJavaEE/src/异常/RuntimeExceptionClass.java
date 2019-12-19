package 异常;

public class RuntimeExceptionClass extends RuntimeException{
    private String msg;
    public RuntimeExceptionClass(String msg) {
        this.msg=msg;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
}
