package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.event.d;
import com.taobao.metrickit.utils.a;
import java.util.HashSet;
import java.util.Map;
import tb.mkh;
import tb.mmc;

/* loaded from: classes.dex */
public abstract class mmc<TCollector extends mkh<CollectResult>, CollectResult> implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final MetricContext f31105a;
    private final mly b;
    private final TCollector c;
    private mkf<CollectResult> d;

    public abstract void a(CollectResult collectresult);

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        }
    }

    public abstract int[] a();

    public mmb f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mmb) ipChange.ipc$dispatch("35801177", new Object[]{this});
        }
        return null;
    }

    public mmc(MetricContext metricContext, mly mlyVar, TCollector tcollector) {
        this.f31105a = metricContext;
        this.b = mlyVar;
        this.c = tcollector;
        a(metricContext);
        b(metricContext);
    }

    /* renamed from: tb.mmc$1 */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 implements mkf<CollectResult> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void lambda$S1nqye3Iec6oE3TEA1KnrJtEkKI(AnonymousClass1 anonymousClass1, Object obj) {
            anonymousClass1.b(obj);
        }

        /* renamed from: lambda$rEg4GrwymKsQ-60bbwiBrgypNo0 */
        public static /* synthetic */ void m2467lambda$rEg4GrwymKsQ60bbwiBrgypNo0(AnonymousClass1 anonymousClass1, String str, Map map) {
            anonymousClass1.b(str, map);
        }

        public AnonymousClass1() {
            mmc.this = r1;
        }

        @Override // tb.mkf
        public void a(final CollectResult collectresult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, collectresult});
                return;
            }
            mkg mkgVar = (mkg) mmc.this.c();
            if (mkgVar.a().getLooper().getThread() == Thread.currentThread()) {
                mmc.this.a((mmc) collectresult);
            } else {
                mkgVar.a().post(new Runnable() { // from class: tb.-$$Lambda$mmc$1$S1nqye3Iec6oE3TEA1KnrJtEkKI
                    @Override // java.lang.Runnable
                    public final void run() {
                        mmc.AnonymousClass1.lambda$S1nqye3Iec6oE3TEA1KnrJtEkKI(mmc.AnonymousClass1.this, collectresult);
                    }
                });
            }
        }

        public /* synthetic */ void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            } else {
                mmc.this.a((mmc) obj);
            }
        }

        @Override // tb.mkf
        public void a(final String str, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
                return;
            }
            mkg mkgVar = (mkg) mmc.this.c();
            if (mkgVar.a().getLooper().getThread() == Thread.currentThread()) {
                mmc.this.a(str, map);
            } else {
                mkgVar.a().post(new Runnable() { // from class: tb.-$$Lambda$mmc$1$rEg4GrwymKsQ-60bbwiBrgypNo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mmc.AnonymousClass1.m2467lambda$rEg4GrwymKsQ60bbwiBrgypNo0(mmc.AnonymousClass1.this, str, map);
                    }
                });
            }
        }

        public /* synthetic */ void b(String str, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            } else {
                mmc.this.a(str, map);
            }
        }
    }

    public void a(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee74df14", new Object[]{this, metricContext});
        } else if (!(c() instanceof mkg)) {
        } else {
            this.d = new AnonymousClass1();
        }
    }

    public void b(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfe7915", new Object[]{this, metricContext});
            return;
        }
        HashSet hashSet = new HashSet();
        a.a(hashSet, a());
        a.a(hashSet, c().c());
        metricContext.getEventCenter().a(a.a(hashSet), this);
    }

    public TCollector c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TCollector) ipChange.ipc$dispatch("1e6b1a92", new Object[]{this}) : this.c;
    }

    public MetricContext d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetricContext) ipChange.ipc$dispatch("c943ac77", new Object[]{this}) : this.f31105a;
    }

    public mly e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mly) ipChange.ipc$dispatch("2dce6b20", new Object[]{this});
        }
        mly mlyVar = this.b;
        if (mlyVar == null) {
            throw new RuntimeException("{@link IDomainStorage} related implementation is not injected.");
        }
        return mlyVar;
    }

    @Override // com.taobao.metrickit.event.d
    public void a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
        } else if (b(i, map)) {
        } else {
            if (a.a(c().c(), i)) {
                this.c.b(i, map);
            } else if (c() instanceof mkg) {
                ((mkg) c()).a(i, map, this.d);
            } else {
                a((mmc<TCollector, CollectResult>) this.c.a(i, map));
            }
        }
    }

    public boolean b(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c62340f", new Object[]{this, new Integer(i), map})).booleanValue();
        }
        mmb f = f();
        return f != null && f.isFilter(i, map);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.f31105a.getEventCenter().b(a(), this);
        if (this.c == null) {
            return;
        }
        d().getEventCenter().b(this.c.c(), this);
        this.c.b();
    }
}
