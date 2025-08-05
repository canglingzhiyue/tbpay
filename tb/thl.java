package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.q;
import tb.thk;

/* loaded from: classes9.dex */
public final class thl implements thk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f34094a;
    private final ConcurrentHashMap<String, Long> b;
    private final f c;
    private shc d;

    static {
        kge.a(646323683);
        kge.a(-800177796);
    }

    public thl(f instance) {
        q.d(instance, "instance");
        this.c = instance;
        this.f34094a = new ConcurrentHashMap<>();
        this.b = new ConcurrentHashMap<>();
    }

    @Override // tb.sud
    public void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        thk.a.a(this, instance);
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            thk.a.b(this);
        }
    }

    @Override // tb.thk
    public void a(String stage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, stage});
            return;
        }
        q.d(stage, "stage");
        this.b.put(stage, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // tb.thk
    public void a(String stage, String value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, stage, value});
            return;
        }
        q.d(stage, "stage");
        q.d(value, "value");
        this.f34094a.put(stage, value);
    }

    @Override // tb.thk
    public boolean b(String stage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, stage})).booleanValue();
        }
        q.d(stage, "stage");
        return this.f34094a.containsKey(stage);
    }

    @Override // tb.thk
    public String c(String stage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, stage});
        }
        q.d(stage, "stage");
        String str = this.f34094a.get(stage);
        return str == null ? "" : str;
    }

    @Override // tb.thk
    public boolean d(String stage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, stage})).booleanValue();
        }
        q.d(stage, "stage");
        return this.b.containsKey(stage);
    }

    @Override // tb.thk
    public void a(String stage, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, stage, new Long(j)});
            return;
        }
        q.d(stage, "stage");
        this.b.put(stage, Long.valueOf(j));
    }

    @Override // tb.thk
    public long e(String stage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb12a", new Object[]{this, stage})).longValue();
        }
        q.d(stage, "stage");
        Long l = this.b.get(stage);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // tb.thk
    public void a(shc span) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb9cb6a", new Object[]{this, span});
            return;
        }
        q.d(span, "span");
        if (this.d != null) {
            return;
        }
        this.d = span;
    }

    @Override // tb.thk
    public shc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shc) ipChange.ipc$dispatch("f0a7e30", new Object[]{this}) : this.d;
    }
}
