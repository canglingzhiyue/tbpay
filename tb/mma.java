package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.utils.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.mkh;

/* loaded from: classes7.dex */
public abstract class mma<TCollector extends mkh<CollectResult>, CollectResult> extends mmc<TCollector, CollectResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final List<CollectResult> f31104a;

    public static /* synthetic */ Object ipc$super(mma mmaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -302089963) {
            super.b((MetricContext) objArr[0]);
            return null;
        } else if (hashCode == -294330604) {
            super.a((MetricContext) objArr[0]);
            return null;
        } else if (hashCode != 2143895178) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a(((Number) objArr[0]).intValue(), (Map) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ void lambda$ArJ5T46ahg9LntNpPQQ0J9dd6g4(mma mmaVar, int i, Map map) {
        mmaVar.c(i, map);
    }

    public abstract void a(int i, Map<String, ?> map, List<CollectResult> list);

    public abstract int[] b();

    public mma(MetricContext metricContext, mly mlyVar, TCollector tcollector) {
        super(metricContext, mlyVar, tcollector);
        this.f31104a = new ArrayList();
    }

    @Override // tb.mmc
    public void a(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee74df14", new Object[]{this, metricContext});
        } else {
            super.a(metricContext);
        }
    }

    @Override // tb.mmc
    public void b(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfe7915", new Object[]{this, metricContext});
            return;
        }
        super.b(metricContext);
        metricContext.getEventCenter().a(b(), this);
    }

    @Override // tb.mmc, com.taobao.metrickit.event.d
    public void a(final int i, final Map<String, ?> map) {
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
        if (!a.a(b(), i)) {
            return;
        }
        if (c() instanceof mkg) {
            mkg mkgVar = (mkg) c();
            if (mkgVar.a().getLooper().getThread() == Thread.currentThread()) {
                a(i, map, this.f31104a);
                this.f31104a.clear();
                return;
            }
            mkgVar.a().post(new Runnable() { // from class: tb.-$$Lambda$mma$ArJ5T46ahg9LntNpPQQ0J9dd6g4
                @Override // java.lang.Runnable
                public final void run() {
                    mma.lambda$ArJ5T46ahg9LntNpPQQ0J9dd6g4(mma.this, i, map);
                }
            });
            return;
        }
        a(i, map, this.f31104a);
        this.f31104a.clear();
    }

    public /* synthetic */ void c(int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fb298c", new Object[]{this, new Integer(i), map});
            return;
        }
        a(i, map, this.f31104a);
        this.f31104a.clear();
    }

    @Override // tb.mmc
    public void a(CollectResult collectresult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, collectresult});
        } else {
            this.f31104a.add(collectresult);
        }
    }
}
