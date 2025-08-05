package com.taobao.android.detail.ttdetail.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import tb.kge;

/* loaded from: classes5.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1941033943);
    }

    public static <T> T[] a(T[] tArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("385760a", new Object[]{tArr, new Integer(i), new Integer(i2)}));
        }
        if (tArr == null || tArr.length == 0) {
            return tArr;
        }
        if (i >= tArr.length || i2 <= i) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > tArr.length) {
            i2 = tArr.length;
        }
        int i4 = i2 - i;
        Class<?> cls = tArr.getClass();
        T[] tArr2 = (T[]) ((Object[]) (cls == Object[].class ? new Object[i4] : Array.newInstance(cls.getComponentType(), i4)));
        while (i < i2) {
            tArr2[i3] = tArr[i];
            i++;
            i3++;
        }
        return tArr2;
    }
}
