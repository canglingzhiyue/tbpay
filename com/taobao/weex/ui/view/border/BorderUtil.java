package com.taobao.weex.ui.view.border;

import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.dom.CSSShorthand;
import tb.kge;

/* loaded from: classes9.dex */
public class BorderUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1211850631);
    }

    public static int fetchFromSparseArray(SparseIntArray sparseIntArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4517bd21", new Object[]{sparseIntArray, new Integer(i), new Integer(i2)})).intValue() : sparseIntArray == null ? i2 : sparseIntArray.get(i, sparseIntArray.get(CSSShorthand.EDGE.ALL.ordinal()));
    }

    public static void updateSparseArray(SparseIntArray sparseIntArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6825fb3", new Object[]{sparseIntArray, new Integer(i), new Integer(i2)});
        } else if (i == CSSShorthand.EDGE.ALL.ordinal()) {
            sparseIntArray.put(CSSShorthand.EDGE.ALL.ordinal(), i2);
            sparseIntArray.put(CSSShorthand.EDGE.TOP.ordinal(), i2);
            sparseIntArray.put(CSSShorthand.EDGE.LEFT.ordinal(), i2);
            sparseIntArray.put(CSSShorthand.EDGE.RIGHT.ordinal(), i2);
            sparseIntArray.put(CSSShorthand.EDGE.BOTTOM.ordinal(), i2);
        } else {
            sparseIntArray.put(i, i2);
        }
    }
}
