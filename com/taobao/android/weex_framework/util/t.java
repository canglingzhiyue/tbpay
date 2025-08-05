package com.taobao.android.weex_framework.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import tb.kge;

/* loaded from: classes6.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-151200321);
    }

    public static WeexValue a(String str, String str2, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("26083d0f", new Object[]{str, str2, weexValueArr});
        }
        return null;
    }

    public static void a(int i, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6848a6c", new Object[]{new Integer(i), str, objArr});
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        return false;
    }

    public static WeexValue b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("40c1fb2f", new Object[]{str});
        }
        return null;
    }
}
