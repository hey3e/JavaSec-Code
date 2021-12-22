package javasec1;

public class Reflection {
    public static void main(String[] args) throws Exception{
//        Runtime.getRuntime().exec("/System/Applications/Calculator.app/Contents/MacOS/Calculator");

//        Class clz = Class.forName("java.lang.Runtime");
//        Method getRuntime = clz.getMethod("getRuntime");
//        Runtime runtime = (Runtime) getRuntime.invoke(clz);
//        clz.getMethod("exec", String.class).invoke(runtime, "/System/Applications/Calculator.app/Contents/MacOS/Calculator");

        Class clz = Class.forName("javasec1.ReflectionClass");
        clz.newInstance();
    }
}
