package com.taobao.android.zlz.service;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WebServiceImpl";
    private static a b = new a();

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f16283a;

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("acf6a370", new Object[0]) : b;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.f16283a;
        if (weakReference != null && weakReference.get() != null) {
            return this.f16283a.get();
        }
        return null;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f16283a = new WeakReference<>(context);
        }
    }
}
