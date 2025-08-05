package com.taobao.taolive.room.adapter.alphavideo;

/* loaded from: classes8.dex */
public enum ScaleType {
    ScaleToFill(0),
    ScaleAspectFitCenter(1),
    ScaleAspectFill(2),
    TopFill(3),
    BottomFill(4),
    LeftFill(5),
    RightFill(6),
    TopFit(7),
    BottomFit(8),
    LeftFit(9),
    RightFit(10);
    
    private int index;

    ScaleType(int i) {
        this.index = i;
    }

    public static ScaleType convertFrom(int i) {
        switch (i) {
            case 1:
                return ScaleAspectFitCenter;
            case 2:
                return ScaleAspectFill;
            case 3:
                return TopFill;
            case 4:
                return BottomFill;
            case 5:
                return LeftFill;
            case 6:
                return RightFill;
            case 7:
                return TopFit;
            case 8:
                return BottomFit;
            case 9:
                return LeftFit;
            case 10:
                return RightFit;
            default:
                return ScaleToFill;
        }
    }
}
