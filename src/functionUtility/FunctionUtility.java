//FunctionUtility Class
//Contains mathematical functions
package functionUtility;

public class FunctionUtility {

    /*
     * Class: PolyFunction
     * Use: Generates y points for Polynomial graph
     * Parameters: a, b, c, x
     * Returns: float
     */
    public static float PolyFunction(float a, float b, float c, float x) {
        return (a * x * x * x) + (b * x * x) + c;
    }

    /*
     * Class: TrigFunction
     * Use: Generates y points for Trigonometric graph A sin Bx + c
     * Parameters: (floats) a, b, c, fX
     * Returns: float
     */
    public static float TrigFunction(float a, float b, float c, float fX) {
        //as java deals in radians, you must convert C
        double degToRad = Math.PI / 180;
        double res = ((b * fX) + c);
        res = res * degToRad;
        return (a * (float) Math.sin(res));
    }

    /*
     * Class: ParametricFunctionX
     * Use: Generates x points for Parametric graph A cos Bt
     * Parameters:(floats) a, b, t
     * Returns: float
     */
    public static float ParametricFunctionX(float a, float b, float t) {
        //as java deals in radians, you must convert degrees
        float degToRad = (float) (Math.PI / 180);
        float res = (b * t);      
        res = res * degToRad;
       // System.out.println("X:" + res);
        return (a *(float) Math.cos(res));
    }

    /*
     * Class: ParametricFunctionY
     * Use: Generates x points for Parametric graph C sin Dt
     * Parameters: (floats) c, d, t
     * Returns: float
     */
    public static float ParametricFunctionY(float c,
            float d, float t) {
        //as java deals in radians, you must convert degrees
        float degToRad = (float) (Math.PI / 180);
        double res = (d * t);     
        res = res * degToRad;
        return (float) (c *(double) Math.sin(res));
        
    }

    /*
     * Class: ExponFunction
     * Use: Generates y points for Exponential graph A^x
     * Parameters: (floats) a, b, c, fX
     * Returns: float
     * 
     */
    public static float ExponFunction(float a, float x) {
        
        return (float)Math.pow(a, x);
        
    }
}
