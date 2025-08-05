package com.alibaba.android.patronus.simplecookie;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class e implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int c = 100;
    private static int d = 300000;

    /* renamed from: a  reason: collision with root package name */
    public Handler f2419a;
    public f b;
    private Thread e;
    private String f;

    public abstract void e();

    public static /* synthetic */ int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : d;
    }

    /* loaded from: classes2.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 101) {
            } else {
                try {
                    e.this.e();
                    sendMessageDelayed(obtainMessage(101), e.g());
                } catch (Throwable th) {
                    Log.wtf("websync", th);
                }
            }
        }
    }

    public e(Context context, String str) {
        this.f = str;
        if (context != null) {
            this.b = f.a(context);
            this.e = new Thread(this);
            this.e.setName(this.f);
            this.e.start();
            return;
        }
        throw new IllegalStateException("WebSyncManager can't be created without context");
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        throw new CloneNotSupportedException("doesn't implement Cloneable");
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Looper.prepare();
        this.f2419a = new a();
        Process.setThreadPriority(10);
        this.f2419a.sendMessageDelayed(this.f2419a.obtainMessage(101), d);
        Looper.loop();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Handler handler = this.f2419a;
        if (handler == null) {
            return;
        }
        handler.removeMessages(101);
        this.f2419a.sendMessageDelayed(this.f2419a.obtainMessage(101), c);
    }
}
