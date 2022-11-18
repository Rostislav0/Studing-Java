public class Lesson19 {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.hashCode() == b.hashCode());
    }
    public static final class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }



        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || this.getClass() != obj.getClass()){
                return false;
            }
            if (this.getClass() == obj.getClass()){
                ComplexNumber other = (ComplexNumber) obj;
                if (other.re == this.re && other.im == this.im){
                    return true;
                }

            }
            return false;
        }
        @Override
        public int hashCode(){
            //final int prime = 31;
            int reInt = Double.hashCode(re);
            int imInt = Double.hashCode(im);
            //int result = 1;
            int result = reInt;
            result = result + imInt;
            return result;
        }
    }
}


