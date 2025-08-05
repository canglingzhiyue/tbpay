package com.alibaba.android.umbrella.link;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f2826a = null;

    public static /* synthetic */ Handler a(g gVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7b7f7579", new Object[]{gVar, handler});
        }
        gVar.f2826a = handler;
        return handler;
    }

    public g() {
        new HandlerThread("UM_SDK_LINK_LOG", 10) { // from class: com.alibaba.android.umbrella.link.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 628981620) {
                    super.onLooperPrepared();
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.os.HandlerThread
            public void onLooperPrepared() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("257d7f74", new Object[]{this});
                    return;
                }
                super.onLooperPrepared();
                Looper looper = getLooper();
                if (looper == null) {
                    return;
                }
                g.a(g.this, new Handler(looper));
            }
        }.start();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e36a660", new Object[]{this, aVar});
            return;
        }
        Handler handler = this.f2826a;
        if (handler == null) {
            aVar.run();
        } else {
            handler.post(aVar);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2828a;
        private String b;
        private String c;
        private String d;
        private String e;

        public abstract void a();

        public void a(String str, String str2, String str3, String str4, String str5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
                return;
            }
            this.f2828a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                a();
            } catch (Throwable th) {
                com.alibaba.android.umbrella.link.a.a(th, this.f2828a, this.b, this.c, this.d, this.e);
            }
        }
    }
}
