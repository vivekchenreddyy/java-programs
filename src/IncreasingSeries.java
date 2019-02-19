class IncreasingSeries {
    public static void main(String args[]) {
        int no, i, max = 0, counter = 0, temp = 0;
        System.out.println("The values are ");

        for (i = 1; i <= 10; i++) {
            no = (int)(Math.random() * 10);
            System.out.print(no+" ");
            if (no > max) {
                max = no;
                counter++;
            } else {
                if (temp < counter)
                    temp = counter;
                max = 0;
                counter = 1;
            }
        }
        if (counter >= temp)
            System.out.println("\n The length of the longest increasing series is " + counter);
        else

            System.out.println("\n The length of the longest increasing series is " + temp);
    }
}
