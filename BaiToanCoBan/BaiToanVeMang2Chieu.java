package BaiToanCoBan;

import java.util.Scanner;

public class BaiToanVeMang2Chieu {

    public static void main(String[] args) {
        int dxq[]={-1,-1,0,1,1,1,0,-1};
        int dyq[] = {0,1,1,1,0,-1,-1,-1};

        int dxk[]={-2,-2,-1,1,2,2,1,-1};
        int dyk[]={-1,1,2,2,1,-1,-2,-2};
        int m,n;
        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        while (true){
            if (m==0&&n==0){
                break;
            }
            int[][] broad = new int[100][100];
            int q, k, p;
            int[][] nq=new int[2][100];
            int [][] nk=new int[2][100];
            q=sc.nextInt();
            k=sc.nextInt();
            //Q=1
            //k=2
            //p=3
            for (int i = 0; i < q; i++) {
                nq[0][i]=sc.nextInt();
                nq[1][i]=sc.nextInt();
                broad[nq[0][i]][nq[1][i]]=1;
            }
            for (int i = 0; i < k; i++) {
                nk[0][i] = sc.nextInt();
                nk[1][i] = sc.nextInt();
                broad[nk[0][i]][nk[1][i]]=2;
            }
            p=sc.nextInt();
            for (int i = 0; i < p; i++) {
                int x,y;
                x=sc.nextInt();
                y=sc.nextInt();
                broad[x][y]=3;
            }
            // quan queen
            for (int i = 0; i < q; i++) {
                for (int j = 0; j < 8; j++) {// duyet 8 huong
                    for (int l = 1;;) {
                        int x=nq[0][i] + dxq[j]*l;
                        int y=nq[1][i] +dyq[j]*l;
                        if(x<0||x>=n||y<0||y>=m){
                            break;
                        }
                        if(broad[x][y] !=0){
                            broad[x][y] =-1;
                        }else {
                            break;
                        }
                    }
                    
                }
            }
            // quan k
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < 8; j++) {// duyet 8 huong
                    for (int l = 1;;) {
                        int x=nk[0][i] + dxk[j]*l;
                        int y=nk[1][i] +dyk[j]*l;
                        if(x<0&&x>=n&&y<0&&y>=m){
                            if(broad[x][y]==1||broad[x][y]==2||broad[x][y]==3){
                                broad[x][y] =-1;
                            }else {
                                break;
                            }
                        }
                    }
                }
            }
            int res=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (broad[i][j]==0){
                        res++;
                    }
                }
            }
            System.out.println("res:  "+ res);
        }
    }
}
