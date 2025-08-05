package com.taobao.search.m3.flash;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0763a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet<e> f19094a;
    private static final b b;

    /* loaded from: classes7.dex */
    public static final class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            Iterator it = a.a().iterator();
            while (it.hasNext()) {
                ((e) it.next()).onCountDown();
            }
            if (!(!a.a().isEmpty())) {
                return;
            }
            C0763a.a(a.Companion);
        }
    }

    /* renamed from: com.taobao.search.m3.flash.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0763a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1832663832);
        }

        private C0763a() {
        }

        public /* synthetic */ C0763a(o oVar) {
            this();
        }

        public static final /* synthetic */ void a(C0763a c0763a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68fc3a0d", new Object[]{c0763a});
            } else {
                c0763a.a();
            }
        }

        public final void a(e listener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("600485e6", new Object[]{this, listener});
                return;
            }
            q.c(listener, "listener");
            if (a.a().isEmpty()) {
                a();
            }
            a.a().add(listener);
        }

        public final void b(e listener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6dd45a7", new Object[]{this, listener});
                return;
            }
            q.c(listener, "listener");
            a.a().remove(listener);
            if (!a.a().isEmpty()) {
                return;
            }
            a.b().removeMessages(0);
        }

        private final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            a.b().removeMessages(0);
            a.b().sendEmptyMessageDelayed(0, 1000L);
        }
    }

    public static final /* synthetic */ HashSet a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("be7f2185", new Object[0]) : f19094a;
    }

    public static final /* synthetic */ b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7220e911", new Object[0]) : b;
    }

    static {
        kge.a(-972631088);
        Companion = new C0763a(null);
        f19094a = new HashSet<>();
        b = new b(Looper.getMainLooper());
    }
}
