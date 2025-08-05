package com.taobao.aranger.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* loaded from: classes6.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicLong f16377a;

    static {
        kge.a(32416871);
        f16377a = new AtomicLong();
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : a(c.a());
    }

    public static String a(String str) {
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null) {
            substring = "";
        } else {
            int indexOf = str.indexOf(":");
            substring = indexOf > 0 ? str.substring(indexOf) : "main";
        }
        return substring + "." + System.currentTimeMillis() + "." + f16377a.incrementAndGet();
    }
}
