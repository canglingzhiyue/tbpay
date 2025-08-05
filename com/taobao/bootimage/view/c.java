package com.taobao.bootimage.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import java.lang.ref.WeakReference;
import tb.kej;
import tb.kem;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class c implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a d;
    public android.taobao.util.i f;
    public ViewGroup g;
    public final BootImageInfo h;
    public final WeakReference<Context> i;
    public boolean e = false;
    public final int j = 100;
    public final int k = 101;
    public final int l = 102;

    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void a(int i);

        void a(String str);

        void b(String str);
    }

    static {
        kge.a(-1774955009);
        kge.a(-1043440182);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        return true;
    }

    public c(Context context, BootImageInfo bootImageInfo) {
        this.h = bootImageInfo;
        this.i = new WeakReference<>(context);
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        android.taobao.util.i iVar = this.f;
        if (iVar == null) {
            return;
        }
        iVar.post(runnable);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.e) {
            kej.a(kem.TAG, "show abstract: show is play");
            a();
        }
        this.e = true;
        this.f = new android.taobao.util.i(Looper.getMainLooper(), this);
        return true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = false;
        android.taobao.util.i iVar = this.f;
        if (iVar == null) {
            return;
        }
        iVar.a();
        this.f = null;
    }
}
