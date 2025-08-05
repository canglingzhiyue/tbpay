package com.flybird.worker;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class a implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public InterfaceC0257a f7240a;
    public AtomicInteger b = new AtomicInteger(0);
    public Handler c = new Handler(Looper.getMainLooper(), this);

    /* renamed from: com.flybird.worker.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0257a {
        void handleTick(b bVar);
    }

    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f7241a;
        public int b;
        public boolean c;
        public long d;

        public b(a aVar) {
        }
    }

    public a(InterfaceC0257a interfaceC0257a) {
        this.f7240a = interfaceC0257a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        b bVar = (b) message.obj;
        this.f7240a.handleTick(bVar);
        if (bVar.c) {
            this.c.sendMessageDelayed(Message.obtain(message), bVar.b);
        }
        return true;
    }
}
