package com.taobao.homepage.view.manager;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f17303a = new AtomicBoolean(false);
    private AtomicBoolean b = new AtomicBoolean(false);
    private C0664a d = new C0664a(false);

    static {
        kge.a(1467052522);
    }

    public AtomicBoolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("49f1dfa8", new Object[]{this}) : this.f17303a;
    }

    public AtomicBoolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("bf6c05e9", new Object[]{this}) : this.b;
    }

    public C0664a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0664a) ipChange.ipc$dispatch("48f6f89b", new Object[]{this}) : this.d;
    }

    /* renamed from: com.taobao.homepage.view.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0664a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean c;

        static {
            kge.a(1928785028);
        }

        public C0664a(boolean z) {
            this.c = z;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }
    }
}
