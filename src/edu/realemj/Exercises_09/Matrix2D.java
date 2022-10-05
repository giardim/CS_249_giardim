package edu.realemj.Exercises_09;

public class Matrix2D {
    private double [][] data;

    public Matrix2D(int rows, int cols) {
        data = new double[rows][cols];        
    }

    public Matrix2D(double [][] other) {
        data = new double[other.length][];
        for(int i = 0; i < data.length; i++) {
            data[i] = new double[other[i].length];
            for(int j = 0; j < data[i].length; j++) {
                data[i][j] = other[i][j];
            }
        }
    }

    public Matrix2D(Matrix2D other) {
        data = new double[other.getRowCnt()][other.getColCnt()];
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                data[i][j] = other.getValue(i,j);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                sb.append(data[i][j] + "\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean isInBounds(int r, int c) {
        return (r < data.length && 
                r >= 0 && 
                c < data[r].length && 
                c >= 0);
    }

    public void setValue(int r, int c, double val) {
        if(isInBounds(r,c)) {
            data[r][c] = val;
        }
    }

    public double getValue(int r, int c) {
        if(isInBounds(r,c)) {
            return data[r][c];
        }
        else {
            return 0;
        }
    } 
    
    public int getRowCnt() {
        return data.length;
    }

    public int getColCnt() {
        return data[0].length;
    }

    public Matrix2D multiply(Matrix2D other) {
        // (a x b) * (b x c) = (a x c)
        // (3 x 3) * (3 x 1) = (3 x 1)
        Matrix2D result = new Matrix2D( getRowCnt(), 
                                        other.getColCnt());
        for(int i = 0; i < getRowCnt(); i++) {
            for(int j = 0; j < other.getColCnt(); j++) {
                // Destination: result[i][j]
                for(int k = 0; k < getColCnt(); k++) {
                    result.data[i][j] += 
                        getValue(i,k)*other.getValue(k,j);
                }
            }
        }

        return result;
    }
    
    public static Matrix2D makePoint2D(double x, double y) {
        Matrix2D v = new Matrix2D(3, 1);
        v.setValue(0,0,x);
        v.setValue(1,0,y);
        v.setValue(2,0,1);
        return v;
    }

    public static Matrix2D makeTranslate2D(double xoff, double yoff) {
        Matrix2D m = new Matrix2D(3,3);
        m.setValue(0, 0, 1);
        m.setValue(1, 1, 1);
        m.setValue(2, 2, 1);
        m.setValue(0, 2, xoff);
        m.setValue(1, 2, yoff);
        return m;
    }
}
