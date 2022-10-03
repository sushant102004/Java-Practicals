class AddMatrix {
    public static void main(String[] args){
        int[][] matrixOne = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrixTwo = {{1, 2}, {3, 4}, {5, 6}};

        int sum[][] = new int[3][2];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                sum[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}