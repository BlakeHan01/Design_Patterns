class Main {
  public static void main(String[] args) {
    // Computer c = new LaptopBuilder().setRAM("64GB").setCPU("2GHz").setSpeaker("").build();
    Computer c =new PCBuilder().setRAM("").setCPU("").build();
    System.out.println(c);
  }
}