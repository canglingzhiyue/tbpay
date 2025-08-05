package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.performance.cpu.b;
import com.taobao.monitor.performance.cpu.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mkr extends mky<mkq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public final e f31073a;
    public volatile long b;
    private final Handler n;
    private final Map<String, Integer> o = new HashMap();

    /* renamed from: lambda$nXaym6ZW7-kEe6icR87D6I1SkWU */
    public static /* synthetic */ void m2464lambda$nXaym6ZW7kEe6icR87D6I1SkWU(mkr mkrVar) {
        mkrVar.a();
    }

    @Override // tb.mkh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, tb.mkq] */
    @Override // tb.mky
    public /* synthetic */ mkq b(mkx mkxVar, int i, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b9bd78b1", new Object[]{this, mkxVar, new Integer(i), map}) : a(mkxVar, i, map);
    }

    public static /* synthetic */ Map a(mkr mkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6e86faf9", new Object[]{mkrVar}) : mkrVar.o;
    }

    public mkr(String str, Handler handler) {
        this.f31073a = new e(str);
        this.n = handler;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.-$$Lambda$mkr$nXaym6ZW7-kEe6icR87D6I1SkWU
            @Override // java.lang.Runnable
            public final void run() {
                mkr.m2464lambda$nXaym6ZW7kEe6icR87D6I1SkWU(mkr.this);
            }
        });
    }

    public /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = Process.myTid();
        }
    }

    public void a(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else {
            this.n.post(new Runnable() { // from class: tb.mkr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    mkr.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        mkr.a(mkr.this).put(str, Integer.valueOf(i));
                    }
                }
            });
        }
    }

    public mkq a(mkx mkxVar, int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkq) ipChange.ipc$dispatch("f237ae33", new Object[]{this, mkxVar, new Integer(i), map});
        }
        if (this.b <= 0) {
            return new mkq(i, map, mkxVar, b.f(), e.a(), 0L, 0L, null, null, Collections.emptyMap());
        }
        long[] a2 = b.a();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Integer> entry : this.o.entrySet()) {
            hashMap.put(entry.getKey(), this.f31073a.a(entry.getValue().intValue()));
        }
        return new mkq(i, map, mkxVar, b.f(), e.a(), a2[0], a2[1], this.f31073a.b(), this.f31073a.a(this.b), hashMap);
    }
}
