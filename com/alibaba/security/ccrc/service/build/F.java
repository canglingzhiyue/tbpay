package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.client.smart.core.algo.ClientAlgoResult;
import com.alibaba.security.client.smart.core.constants.BaseConfigKey;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;

/* loaded from: classes3.dex */
public class F {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3237a = "AggregationEngine";
    public final ConcurrentHashMap<C1265ya<String, String>, O> b = new ConcurrentHashMap<>();
    public final DelayQueue<O> c = new DelayQueue<>();
    public final String d;
    public b e;
    public B f;
    public Map<String, Integer> g;
    public a h;

    /* loaded from: classes3.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
            StringBuilder a2 = Yb.a("CcrcDataThread#");
            a2.append(F.a(F.this));
            setName(a2.toString());
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    O o = (O) F.b(F.this).take();
                    o.a(true);
                    ConcurrentHashMap<String, Object> a2 = o.a();
                    a2.put(BaseConfigKey.KEY_SAMPLE_DATA, o.c());
                    F.a(F.this, o, a2, ((O) F.c(F.this).remove(new C1265ya(o.d(), o.f()))) != null);
                    F.d(F.this).b(o.b(), o.f(), a2);
                } catch (Throwable th) {
                    Logging.e(F.f3237a, "Data aggregation fail", th);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        String b(String str);

        void b(CcrcService.Config config, String str, Map<String, Object> map);
    }

    public F(String str) {
        this.d = str;
    }

    public static /* synthetic */ String a(F f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b73c0122", new Object[]{f}) : f.d;
    }

    public static /* synthetic */ DelayQueue b(F f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DelayQueue) ipChange.ipc$dispatch("b96e2b88", new Object[]{f}) : f.c;
    }

    public static /* synthetic */ ConcurrentHashMap c(F f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("f68cf16a", new Object[]{f}) : f.b;
    }

    public static /* synthetic */ b d(F f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("48597ab3", new Object[]{f}) : f.e;
    }

    public static /* synthetic */ void a(F f, O o, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("346c3ee", new Object[]{f, o, map, new Boolean(z)});
        } else {
            f.a(o, map, z);
        }
    }

    public void a(Map<String, Integer> map, b bVar, B b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa27d9f", new Object[]{this, map, bVar, b2});
            return;
        }
        this.g = map;
        this.f = b2;
        this.e = bVar;
    }

    public void a(CcrcService.Config config, ClientAlgoResult clientAlgoResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47df2eb7", new Object[]{this, config, clientAlgoResult});
            return;
        }
        if (this.h == null) {
            this.h = new a();
            this.h.start();
        }
        String str = clientAlgoResult.mSampleData.metaId;
        String b2 = this.e.b(clientAlgoResult.algoCode);
        C1265ya c1265ya = new C1265ya(str, b2);
        if (this.b.containsKey(c1265ya)) {
            O o = this.b.get(c1265ya);
            if (o != null && !o.g()) {
                o.a(clientAlgoResult);
                return;
            } else {
                this.f.a(config, clientAlgoResult.mSampleData, "data is overdue", false, 0);
                return;
            }
        }
        Integer num = this.g.get(b2);
        if (num == null) {
            num = 0;
        }
        O o2 = new O(config, clientAlgoResult, num.intValue(), b2);
        this.b.put(new C1265ya<>(str, b2), o2);
        this.c.offer((DelayQueue<O>) o2);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.clear();
    }

    private void a(O o, Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc42c84", new Object[]{this, o, map, new Boolean(z)});
        } else if (o == null) {
            Logging.e(f3237a, "inferData is null");
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(o.b().getPid()).setMetaId(o.d()).setSampleId(o.e()).setCcrcCode(this.d).setPhase("detect").setOperation(Ba.a.h).setStatus(0).addParam("mergeData", map).addExt("removeSuccess", Boolean.valueOf(z)).build());
        }
    }
}
