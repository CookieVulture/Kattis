class Main{
    public static Kattio io;
    public static void evaluateNext() {
        io.print(io.getWord());
        if (Integer.parseInt(io.getWord().split("/")[0]) > 2009) {
            io.println(" eligible");
            io.getWord();io.getWord();
        } else if (Integer.parseInt(io.getWord().split("/")[0]) > 1990){
            io.println(" eligible");
            io.getWord();
        } else if (Integer.parseInt(io.getWord()) > 40) {
            io.println(" ineligible");
        } else {
            io.println(" coach petitions");
        }
    }
    public static void main(String[] args) {
        io = new Kattio(System.in, System.out);
        int tot = io.getInt();
        for (int i = 0; i < tot; i++) {
            evaluateNext();
        }
        io.close();
    }
}