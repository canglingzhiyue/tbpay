package com.taobao.themis.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f22877a;
    public static String b;
    public static String c;
    public static String d;

    static {
        kge.a(-2134110633);
        f22877a = "data:image/gif;base64,";
        b = "data:image/png;base64,";
        c = "data:image/jpeg;base64,";
        d = "data:image/x-icon;base64,";
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(f22877a) || str.startsWith(b) || str.startsWith(c) || str.startsWith(d);
    }
}
