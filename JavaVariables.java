public class JavaVariables {
    static int memberVar = 123;
    public static void main(String[] args) {
        int twoLine = 15;
        int oneLine=1;
        int fromExpression=2+3;
        final int finalVar=10;
        int myVar=getInt();
        int myInnerVar=memberVar+10;
        System.out.println(myInnerVar);

    }

    public static int getInt(){
        int methodScope = 22;
        return methodScope;
    }


}
