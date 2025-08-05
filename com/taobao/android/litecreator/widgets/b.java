package com.taobao.android.litecreator.widgets;

import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.widgets.LCBubble;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Comparator<C0525b> b;
    private C0525b c;
    private boolean e;
    private Queue<C0525b> d = new PriorityQueue();
    private LCBubble.d f = new LCBubble.d() { // from class: com.taobao.android.litecreator.widgets.b.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.litecreator.widgets.LCBubble.d
        public void a(LCBubble lCBubble) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe436e32", new Object[]{this, lCBubble});
            } else {
                b.a(b.this, true);
            }
        }

        @Override // com.taobao.android.litecreator.widgets.LCBubble.d
        public void b(LCBubble lCBubble) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("185eecd1", new Object[]{this, lCBubble});
                return;
            }
            b.a(b.this);
            b.a(b.this, false);
        }

        @Override // com.taobao.android.litecreator.widgets.LCBubble.d
        public void c(LCBubble lCBubble) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("327a6b70", new Object[]{this, lCBubble});
            } else {
                b.a(b.this);
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public a f13526a = new a(this);

    public static /* synthetic */ C0525b a(b bVar, C0525b c0525b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0525b) ipChange.ipc$dispatch("755254bd", new Object[]{bVar, c0525b});
        }
        bVar.c = c0525b;
        return c0525b;
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45492899", new Object[]{bVar});
        } else {
            bVar.a();
        }
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63dc9d5f", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.e = z;
        return z;
    }

    public static /* synthetic */ Queue b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("206dd27a", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ C0525b c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0525b) ipChange.ipc$dispatch("50b5a5ce", new Object[]{bVar}) : bVar.c;
    }

    static {
        kge.a(-1293497626);
        b = new Comparator<C0525b>() { // from class: com.taobao.android.litecreator.widgets.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(C0525b c0525b, C0525b c0525b2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, c0525b, c0525b2})).intValue() : a(c0525b, c0525b2);
            }

            public int a(C0525b c0525b, C0525b c0525b2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c43798c1", new Object[]{this, c0525b, c0525b2})).intValue() : c0525b2.b.c - c0525b.b.c;
            }
        };
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c = null;
        this.f13526a.sendEmptyMessage(1);
    }

    public void a(LCBubble lCBubble, LCBubble.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d43442a", new Object[]{this, lCBubble, bVar});
            return;
        }
        C0525b c0525b = new C0525b(lCBubble, bVar);
        lCBubble.a(this.f);
        this.d.add(c0525b);
        if (this.e || this.f13526a.hasMessages(1)) {
            return;
        }
        this.f13526a.sendEmptyMessage(1);
    }

    /* loaded from: classes5.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<b> f13528a;

        static {
            kge.a(-479555648);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(b bVar) {
            this.f13528a = new WeakReference<>(bVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            b bVar = this.f13528a.get();
            if (bVar == null) {
                return;
            }
            C0525b c0525b = (C0525b) b.b(bVar).peek();
            if (b.c(bVar) == null) {
                if (c0525b != null) {
                    b.b(bVar).remove(c0525b);
                    b.a(bVar, c0525b);
                    b.a(bVar, true);
                    c0525b.f13529a.a(c0525b.b);
                    removeMessages(1);
                }
            } else if (c0525b != null && c0525b.b.c < b.c(bVar).b.c) {
                b.c(bVar).f13529a.a();
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: com.taobao.android.litecreator.widgets.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0525b implements Comparable<C0525b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public LCBubble f13529a;
        public LCBubble.b b;

        static {
            kge.a(673443832);
            kge.a(415966670);
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(C0525b c0525b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, c0525b})).intValue() : a(c0525b);
        }

        public C0525b(LCBubble lCBubble, LCBubble.b bVar) {
            this.f13529a = lCBubble;
            this.b = bVar;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj == null || !(obj instanceof C0525b)) {
                return false;
            }
            C0525b c0525b = (C0525b) obj;
            return c0525b.f13529a == this.f13529a && c0525b.b == this.b;
        }

        public int a(C0525b c0525b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1676d2ce", new Object[]{this, c0525b})).intValue();
            }
            if (this != c0525b) {
                return this.b.c - c0525b.b.c;
            }
            return 0;
        }
    }
}
