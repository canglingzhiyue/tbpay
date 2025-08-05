package com.taobao.share.taopassword.constants;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f19661a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;

    static {
        kge.a(-965460309);
        f19661a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f19661a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
    }
}
