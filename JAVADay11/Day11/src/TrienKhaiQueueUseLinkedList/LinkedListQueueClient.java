package TrienKhaiQueueUseLinkedList;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue themList = new MyLinkedListQueue();
        themList.themVaoHangDoi(10);
        themList.themVaoHangDoi(20);
        System.out.println("A "+themList.layPhanTuCuoiTrongHangDoi().key);
     //   System.out.println("B "+themList.layPhanTuCuoiTrongHangDoi().key);
        themList.themVaoHangDoi(30);
        themList.themVaoHangDoi(40);
        themList.themVaoHangDoi(50);
        themList.themVaoHangDoi(60);
        System.out.println("Các PT Lấy Khỏi Hàng Đợi Là: "+themList.layPhanTuCuoiTrongHangDoi().key);
    }
}
