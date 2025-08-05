package com.taobao.tao.shop.rule;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean mInit = true;

    static {
        kge.a(899614268);
    }

    public static void a(Application application, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcae9f58", new Object[]{application, str, str2, new Integer(i)});
        } else {
            com.taobao.tao.shop.g.a().a(application, str, str2, i);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : com.taobao.tao.shop.g.a().b();
    }
}
