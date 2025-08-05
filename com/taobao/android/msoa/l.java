package com.taobao.android.msoa;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Object a(Object obj, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("946902d9", new Object[]{obj, cls});
        }
        if (obj == null || cls == null) {
            return null;
        }
        return (obj.getClass() != cls && cls == String.class) ? obj.toString() : obj;
    }
}
