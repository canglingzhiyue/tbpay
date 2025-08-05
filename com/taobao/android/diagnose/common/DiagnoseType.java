package com.taobao.android.diagnose.common;

import com.alipay.mobile.common.logging.util.avail.ExceptionData;

/* loaded from: classes5.dex */
public enum DiagnoseType {
    UNKNOWN("UNKNOWN", 0),
    JavaCrash("JavaCrash", 1),
    NativeCrash("NativeCrash", 2),
    ANR(ExceptionData.TYPE_ANR, 3),
    BizError("BizError", 4),
    Feedback("Feedback", 5),
    CustomError("CustomError", 6);
    
    private int index;
    private String name;

    DiagnoseType(String str, int i) {
        this.name = str;
        this.index = i;
    }

    protected static String getName(int i) {
        DiagnoseType[] values;
        for (DiagnoseType diagnoseType : values()) {
            if (diagnoseType.getIndex() == i) {
                return diagnoseType.name;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static DiagnoseType parseByType(String str) {
        char c;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 50:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 51:
                if (str.equals("3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 52:
                if (str.equals("4")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 53:
                if (str.equals("5")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 54:
                if (str.equals("6")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? UNKNOWN : CustomError : Feedback : BizError : ANR : NativeCrash : JavaCrash;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }
}
