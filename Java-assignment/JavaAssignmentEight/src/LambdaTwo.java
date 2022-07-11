
public class LambdaTwo{
        private int price;
        private String status;

        public LambdaTwo(int price,String status){
            this.price = price;
            this.status = status;
        }

        public int getPrice() {
            return price;
        }

        public String getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return getStatus() +" " + getPrice();
        }
    }
