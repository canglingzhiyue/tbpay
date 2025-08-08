package tb;

import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kml;

/* loaded from: classes7.dex */
public class knf implements kms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private kmm f30183a;
    private kml b;
    private long c;
    private long d;
    private int e;
    private HashMap<String, Long> f = new HashMap<>();
    private String g;
    private kne h;
    private Handler i;

    public static /* synthetic */ kne a(knf knfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kne) ipChange.ipc$dispatch("4d42d12f", new Object[]{knfVar}) : knfVar.h;
    }

    public knf(kmm kmmVar, kml kmlVar, Handler handler) {
        this.f30183a = kmmVar;
        this.b = kmlVar;
        this.g = kmmVar.b.f30169a;
        this.h = new kne(this.g, kmmVar, this.b);
        this.i = handler;
        this.e = kmmVar.f30166a.size();
    }

    @Override // tb.klo
    public synchronized void a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a2226", new Object[]{this, new Long(j), str});
            return;
        }
        a();
        if (0 == this.c) {
            return;
        }
        long b = b(j, str);
        if (this.b != null) {
            int i = (int) ((b * 100) / this.c);
            int i2 = 100;
            if (i <= 100) {
                i2 = i;
            }
            this.b.onDownloadProgress(i2);
        }
    }

    private long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
        }
        long j = this.c;
        if (0 != j) {
            return j;
        }
        long j2 = 0;
        for (kmo kmoVar : this.f30183a.f30166a) {
            if (kmoVar.b <= 0) {
                return 0L;
            }
            j2 += kmoVar.b;
            this.f.put(kmoVar.f30167a, 0L);
        }
        this.c = j2;
        return this.c;
    }

    private long b(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("298bb0f9", new Object[]{this, new Long(j), str})).longValue();
        }
        if (this.e == 1) {
            return j + this.d;
        }
        long j2 = 0;
        HashMap<String, Long> hashMap = this.f;
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry<String, Long> entry : this.f.entrySet()) {
                if (StringUtils.equals(str, entry.getKey())) {
                    entry.setValue(Long.valueOf(j));
                }
                j2 += entry.getValue().longValue();
            }
        }
        return j2;
    }

    @Override // tb.klo
    public synchronized void a(final kmr kmrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1604d88", new Object[]{this, kmrVar});
            return;
        }
        this.d += kmrVar.e.b;
        if (this.b == null) {
            return;
        }
        if (this.i != null) {
            this.i.post(new Runnable() { // from class: tb.knf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        knf.a(knf.this).a(kmrVar);
                    }
                }
            });
        } else {
            knd.a(new Runnable() { // from class: tb.knf.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        knf.a(knf.this).a(kmrVar);
                    }
                }
            }, true);
        }
    }

    @Override // tb.kms
    public void a(int i, kmq kmqVar, kml.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06cffe5", new Object[]{this, new Integer(i), kmqVar, aVar});
        } else {
            this.b.onNetworkLimit(i, kmqVar, aVar);
        }
    }

    @Override // tb.kms
    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            this.b.onDownloadStateChange(str, z);
        }
    }
}
