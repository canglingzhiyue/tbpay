package com.taobao.taolive.sdk.model;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes8.dex */
public class f extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f21853a;

    static {
        kge.a(-1446520061);
    }

    public f(a aVar) {
        super(Looper.getMainLooper());
        this.f21853a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        WeakReference<a> weakReference = this.f21853a;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            return;
        }
        aVar.handleMessage(message);
    }
}
