public enum Catergory {
    FOOD ("Thực phẩm"), HOUSEWARE ("Đồ gia dụng"), COMETICS ( "Mỹ phẩm"), FASHION ("Thời trang");

    private String value;

    private Catergory(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }


}
