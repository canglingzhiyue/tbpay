package com.taobao.phenix.loader.network;

import mtopsdk.common.util.StringUtils;
import anetwork.channel.util.RequestConstant;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.loader.network.b;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.rxm.schedule.e;
import com.taobao.rxm.schedule.g;
import com.taobao.rxm.schedule.j;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Future;
import tb.gvt;
import tb.kge;
import tb.nhx;
import tb.niw;
import tb.njc;
import tb.njd;
import tb.njf;
import tb.njj;
import tb.nmv;
import tb.nmx;

/* loaded from: classes.dex */
public class c extends nmx<njd, njf, com.taobao.phenix.request.b> implements com.taobao.rxm.request.b<com.taobao.phenix.request.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f18935a;

    static {
        kge.a(-315887152);
        kge.a(-1516804830);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab92ee1e", new Object[]{cVar, new Integer(i)});
        } else {
            cVar.a(i);
        }
    }

    public static /* synthetic */ void a(c cVar, nmv nmvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca114d96", new Object[]{cVar, nmvVar, new Boolean(z)});
        } else {
            cVar.a(nmvVar, z);
        }
    }

    public static /* synthetic */ void b(c cVar, nmv nmvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbaf3b5", new Object[]{cVar, nmvVar, new Boolean(z)});
        } else {
            cVar.a(nmvVar, z);
        }
    }

    public c(b bVar) {
        super(2, 0);
        com.taobao.tcommon.core.b.a(bVar);
        this.f18935a = bVar;
    }

    @Override // tb.nmx
    public void a(nmv<njd, com.taobao.phenix.request.b> nmvVar, boolean z, njf njfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a064fb19", new Object[]{this, nmvVar, new Boolean(z), njfVar});
            return;
        }
        b(nmvVar, z);
        com.taobao.phenix.request.b e = nmvVar.e();
        niw.a("Phenix", "Network Read Started.", e);
        gvt.a("phenix_network_write " + e.H());
        nhx.c(e.b());
        if (e.K()) {
            niw.b(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, e, "request is cancelled before reading response stream", new Object[0]);
            nmvVar.d();
            njfVar.h();
            return;
        }
        njj njjVar = new njj(nmvVar, njfVar.l, e.i());
        try {
            njc a2 = njc.a(njfVar, njjVar);
            if (njjVar.b()) {
                return;
            }
            e.b().b(a2.l);
            if (!a2.f31496a) {
                niw.d(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, e, "miss bytes while reading response[type:%d], read=%d, content=%d", Integer.valueOf(njfVar.k), Integer.valueOf(njjVar.c()), Integer.valueOf(njjVar.f31500a));
                nmvVar.b(new IncompleteResponseException());
                return;
            }
            e.b(this);
            com.taobao.phenix.request.c y = e.y();
            a((nmv) nmvVar, true, z);
            niw.a("Phenix", "Network Read Finished.", e);
            gvt.a();
            nmvVar.b(new njd(a2, y.g(), 1, false, y.l()), z);
        } catch (Exception e2) {
            niw.d(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, e, "transform data from response[type:%d] error, read=%d, content=%d, throwable=%s", Integer.valueOf(njfVar.k), Integer.valueOf(njjVar.c()), Integer.valueOf(njjVar.f31500a), e2);
            nmvVar.b(e2);
        }
    }

    @Override // tb.nmy
    public boolean a(final nmv<njd, com.taobao.phenix.request.b> nmvVar, g gVar) {
        Map<String, String> B;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6a8a8ba", new Object[]{this, nmvVar, gVar})).booleanValue();
        }
        final com.taobao.phenix.request.b e = nmvVar.e();
        final long id = Thread.currentThread().getId();
        d(nmvVar);
        gvt.a("phenix_network_read " + e.H());
        niw.a("Phenix", "Network Connect Started.", e);
        e.a("inner_network_start_time", String.valueOf(System.currentTimeMillis()));
        if (com.taobao.phenix.intf.b.h().E()) {
            e.a("Image-Gray-Traffic", "true");
        }
        e.a(this);
        ImageStatistics b = e.b();
        if (!StringUtils.isEmpty(b.f18937a)) {
            e.a(RequestConstant.KEY_TRACE_ID, b.f18937a);
        }
        if (b.m() != null && b.m().size() > 0) {
            e.a("open_trace_context", a(b.m()));
        }
        e.a(this.f18935a.a(e.p(), e.B(), new b.a() { // from class: com.taobao.phenix.loader.network.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.loader.network.b.a
            public void a(njf njfVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f64f1c6e", new Object[]{this, njfVar});
                    return;
                }
                boolean z = id != Thread.currentThread().getId();
                com.taobao.phenix.request.b bVar = (com.taobao.phenix.request.b) nmvVar.e();
                bVar.a("inner_is_async_http", Boolean.toString(z));
                if (bVar.K()) {
                    niw.a("Phenix", "request is cancelled before consuming response data", e);
                    nmvVar.d();
                    njfVar.h();
                    c.a(c.this, bVar.H());
                    return;
                }
                niw.a("Phenix", "Network Connect Finished.", e);
                c.a(c.this, nmvVar, true);
                if (z) {
                    c.this.a(nmvVar, true, (boolean) njfVar, false);
                } else {
                    c.this.a(nmvVar, true, njfVar);
                }
            }

            @Override // com.taobao.phenix.loader.network.b.a
            public void a(njf njfVar, boolean z, boolean z2) {
                IpChange ipChange2 = $ipChange;
                boolean z3 = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9f10136e", new Object[]{this, njfVar, new Boolean(z), new Boolean(z2)});
                    return;
                }
                com.taobao.phenix.request.b bVar = (com.taobao.phenix.request.b) nmvVar.e();
                if (z) {
                    niw.a("Phenix", "Network data receive Started.", e);
                    bVar.b().h = System.currentTimeMillis();
                }
                if (id != Thread.currentThread().getId()) {
                    z3 = true;
                }
                bVar.a("inner_is_async_http", Boolean.toString(z3));
                if (bVar.K()) {
                    niw.a("Phenix", "request is cancelled before consuming response data", e);
                    nmvVar.d();
                    if (njfVar != null) {
                        njfVar.h();
                    }
                    c.a(c.this, bVar.H());
                } else if (njfVar == null || !z2) {
                } else {
                    niw.a("Phenix", "Network data receive Finished.", e);
                    bVar.b().i = System.currentTimeMillis();
                    niw.a("Phenix", "Network Connect Finished.", e);
                    c.b(c.this, nmvVar, true);
                    c.this.a(nmvVar, true, njfVar);
                }
            }

            @Override // com.taobao.phenix.loader.network.b.a
            public void a(Exception exc) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd91d31e", new Object[]{this, exc});
                    return;
                }
                if (exc != null) {
                    niw.a("Phenix", "Network Connect Error." + exc.getMessage(), e);
                }
                c.a(c.this, ((com.taobao.phenix.request.b) nmvVar.e()).H());
                nmvVar.b(exc);
            }
        }));
        if (gVar != null && ((B = e.B()) == null || (str = B.get("inner_is_async_http")) == null || Boolean.valueOf(str).booleanValue())) {
            gVar.a(true);
        }
        gvt.a();
        return true;
    }

    private String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (String.valueOf(map.get(strArr[i])).trim().length() > 0) {
                sb.append(strArr[i]);
                sb.append(":");
                sb.append(String.valueOf(map.get(strArr[i])).trim());
            }
            if (i != strArr.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        j f = f();
        if (!(f instanceof e)) {
            return;
        }
        ((e) f).b(i);
    }

    @Override // com.taobao.rxm.request.b
    public void a(com.taobao.phenix.request.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71690dc3", new Object[]{this, bVar});
            return;
        }
        a(bVar.H());
        niw.a("Phenix", "received cancellation.", bVar);
        Future<?> C = bVar.C();
        if (C == null) {
            return;
        }
        bVar.a((Future<?>) null);
        try {
            C.cancel(true);
            niw.a(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, bVar, "cancelled blocking future(%s), result=%b", C, Boolean.valueOf(C.isCancelled()));
        } catch (Exception e) {
            niw.d(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, bVar, "cancel blocking future error=%s", e);
        }
    }
}
