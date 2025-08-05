package com.taobao.android.behavix.utils;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class e extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f9215a;

    static {
        kge.a(-1619376902);
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d4a2976f", new Object[0]);
        }
        if (f9215a == null) {
            synchronized (e.class) {
                if (f9215a == null) {
                    f9215a = new e();
                }
            }
        }
        return f9215a;
    }

    private e() {
        super(Looper.getMainLooper());
    }
}
