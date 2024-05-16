package Java6thAssignment;

public class EncapsulaMain {
    public static void main(String[] args) {
        ReadonlyEncapsulation read = new ReadonlyEncapsulation();
        System.out.println("Encapsulation Read or getter: "+read.getName());

        WriteonlyEncapsulation write = new WriteonlyEncapsulation();
        write.setName("Arafat");
        ReadandWriteEncapsulation readandwrite = new ReadandWriteEncapsulation();
        readandwrite.setCoursename("SQA");
        System.out.println("Read and Write: "+readandwrite.getCoursename());

    }

}
