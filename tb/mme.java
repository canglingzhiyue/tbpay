package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.utils.a;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.mkh;

/* loaded from: classes.dex */
public abstract class mme<TCollector extends mkh<CollectResult>, CollectResult> extends mmc<TCollector, CollectResult> implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f31108a;
    private Map<String, ?> b;

    public static /* synthetic */ Object ipc$super(mme mmeVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 96532846) {
            super.g();
            return null;
        } else if (hashCode != 2143895178) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a(((Number) objArr[0]).intValue(), (Map) objArr[1]);
            return null;
        }
    }

    public abstract long a(int i);

    public abstract TimeUnit b();

    public abstract int[] h();

    public abstract int[] i();

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        }
    }

    public mme(MetricContext metricContext, mly mlyVar, TCollector tcollector) {
        super(metricContext, mlyVar, tcollector);
    }

    @Override // tb.mmc
    public final void b(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfe7915", new Object[]{this, metricContext});
            return;
        }
        HashSet hashSet = new HashSet();
        a.a(hashSet, a());
        a.a(hashSet, c().c());
        a.a(hashSet, h());
        a.a(hashSet, i());
        metricContext.getEventCenter().a(a.a(hashSet), this);
    }

    @Override // tb.mmc
    public int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : new int[0];
    }

    @Override // tb.mmc, com.taobao.metrickit.event.d
    public void a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
            return;
        }
        if (a.a(c().c(), i)) {
            super.a(i, map);
        }
        if (a.a(a(), i)) {
            super.a(i, map);
        }
        if (a.a(i(), i)) {
            d().getDefaultInnerHandler().removeCallbacks(this);
            l();
            this.b = null;
        }
        if (!a.a(h(), i)) {
            return;
        }
        this.f31108a = i;
        this.b = map;
        k();
        if (j()) {
            run();
        } else {
            b(i);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        b(this.f31108a);
        a((mme<TCollector, CollectResult>) c().a(this.f31108a, this.b));
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        long a2 = a(i);
        if (a2 <= 0 || b() == null) {
            throw new RuntimeException("getRepeatInterval or getRepeatIntervalTimeUnit parse error.");
        }
        d().getDefaultInnerHandler().postDelayed(this, b().toMillis(a2));
    }

    @Override // tb.mmc
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        d().getEventCenter().b(h(), this);
        d().getEventCenter().b(i(), this);
        d().getDefaultInnerHandler().removeCallbacks(this);
    }
}
