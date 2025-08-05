package com.tmall.stylekit.datatype;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class GradientColorVO implements Serializable {
    public static int HORIZONTAL;
    public static int VERTICAL;
    public int[] colors;
    public int type = HORIZONTAL;

    static {
        kge.a(-1152832842);
        kge.a(1028243835);
        VERTICAL = 1;
        HORIZONTAL = 0;
    }
}
