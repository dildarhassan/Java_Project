public class Pattern2 {
    public Pattern2() {
    }

    public static void hollowRectangle(int totalRows, int totalColumns) {
        for(int i = 1; i <= totalRows; ++i) {
            for(int j = 1; j <= totalColumns; ++j) {
                if (i != 1 && i != totalRows && j != 1 && j != totalColumns) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }

    public static void inverted_halfPyramid(int n) {
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n - i + 1; ++j) {
                System.out.print(j);
            }

            System.out.println();
        }

    }

    public static void invertedAnd_rotated_halfPyramid(int n) {
        for(int i = 1; i <= n; ++i) {
            int j;
            for(j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void floydTriangle(int n) {
        int x = 1;

        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("" + x + " ");
                ++x;
            }

            System.out.println();
        }

    }

    public static void zero_oneTriangle(int n) {
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= i; ++j) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }

    }

    public static void butterflyPattern(int n) {
        int i;
        int l;
        for(i = 1; i <= n; ++i) {
            for(l = 1; l <= i; ++l) {
                System.out.print("*");
            }

            for(l = 1; l <= 2 * (n - i); ++l) {
                System.out.print(" ");
            }

            for(l = 1; l <= i; ++l) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(i = 4; i >= 1; --i) {
            for(l = 1; l <= i; ++l) {
                System.out.print("*");
            }

            for(l = 1; l <= 2 * (n - i); ++l) {
                System.out.print(" ");
            }

            for(l = 1; l <= i; ++l) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void solidRhombus(int n) {
        for(int i = 1; i <= n; ++i) {
            int j;
            for(j = 1; j <= n - i + 1; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= n; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void hollowRhombus(int n) {
        for(int i = 1; i <= n; ++i) {
            int j;
            for(j = 1; j <= n - i + 1; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= n; ++j) {
                if (i != 1 && i != n && j != 1 && j != n) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }

    public static void diamondPattern(int n) {
        int i;
        int j;
        for(i = 1; i <= n; ++i) {
            for(j = 1; j <= n - i; ++j) {
                System.out.print("h");
            }

            for(j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(i = n; i >= 1; --i) {
            for(j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
