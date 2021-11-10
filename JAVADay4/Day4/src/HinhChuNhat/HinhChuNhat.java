package HinhChuNhat;

    public class HinhChuNhat {
        double width;
        double height;

        public HinhChuNhat() {
        }

        public HinhChuNhat(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
        double DienTich(){
            return width * height;
        }
        double ChuVi(){
            return (width+height)*2;
        }

        @Override
        public String toString() {
            return "HinhChuNhat: " + "width=" + width + ", height=" + height + "Có Diện Tích Là: "+DienTich()+" : Chu Vi Là: "+ChuVi();
        }
    }

