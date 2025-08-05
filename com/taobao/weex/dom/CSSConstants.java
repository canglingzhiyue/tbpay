package com.taobao.weex.dom;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class CSSConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float UNDEFINED = Float.NaN;

    static {
        kge.a(1839727188);
    }

    public static boolean isUndefined(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("711fec97", new Object[]{new Float(f)})).booleanValue() : Float.compare(f, Float.NaN) == 0;
    }
}
