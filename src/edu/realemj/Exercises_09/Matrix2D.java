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

    public String toCoordString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                sb.append(data[i][j] + ",");
            }            
        }
        sb.append(")");
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
        Matrix2D result = new Matrix2D( this.getRowCnt(), 
                                        other.getColCnt());
        for(int i = 0; i < this.getRowCnt(); i++) {
            for(int j = 0; j < other.getColCnt(); j++) {
                // Destination: result[i][j]
                for(int k = 0; k < this.getColCnt(); k++) {
                    result.data[i][j] += 
                        this.getValue(i,k)*other.getValue(k,j);
                }
            }
        }

        return result;
    }

    public String makePoint3DString() {
        return data[0][0] + " " + data[1][0] + " " + data[2][0];
    }
    
    public static Matrix2D makePoint2D(double x, double y) {
        Matrix2D v = new Matrix2D(3, 1);
        v.setValue(0,0,x);
        v.setValue(1,0,y);
        v.setValue(2,0,1);
        return v;
    }

    public static Matrix2D makePoint3D(double x, double y, double z) {
        Matrix2D v = new Matrix2D(4, 1);
        v.setValue(0,0,x);
        v.setValue(1,0,y);
        v.setValue(2, 0, z);
        v.setValue(3,0,1);
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

    public static Matrix2D makeScale3D(double sx, double sy, double sz) {
        Matrix2D m = new Matrix2D(4,4);
        m.setValue(0, 0, sx);
        m.setValue(1, 1, sy);
        m.setValue(2, 2, sz);
        m.setValue(3, 3, 1.0);        
        return m;
    }

    @Override
    public boolean equals(Object other) {
        boolean isEqual = false;
        if(other instanceof Matrix2D mo) {
            if(getRowCnt() == mo.getRowCnt() &&
                getColCnt() == mo.getColCnt()) {

                boolean valuesSame = true;

                for(int i = 0; i < getRowCnt(); i++) {
                    for(int j = 0; j < getColCnt(); j++) {
                        if(Math.abs(data[i][j] - mo.data[i][j]) >= 1e-15) {
                            valuesSame = false;
                        }
                    }
                }

                isEqual = valuesSame;
            }
        }

        return isEqual;
    }
}
