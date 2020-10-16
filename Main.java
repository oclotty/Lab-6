class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
    Tree tree2 = new Tree("maple", "broadleaf", true, "red");
    System.out.println();
    tree1.print();
    System.out.println();
    tree2.print();
    System.out.println();
    tree1.setName("spruce");
    tree1.setType("conifer");
    tree1.print();
  }
}