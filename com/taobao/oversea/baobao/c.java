package com.taobao.oversea.baobao;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f18626a;
    private Handler b = new Handler(Looper.getMainLooper());

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("78faea1e", new Object[0]);
        }
        if (f18626a == null) {
            synchronized (c.class) {
                if (f18626a == null) {
                    f18626a = new c();
                }
            }
        }
        return f18626a;
    }

    private c() {
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.b.post(runnable);
        }
    }
}
