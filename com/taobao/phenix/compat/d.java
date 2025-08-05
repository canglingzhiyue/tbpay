package com.taobao.phenix.compat;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.pexode.decoder.AvifDecoder;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.phenix.compat.stat.b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.nhx;
import tb.nio;
import tb.niw;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18891a = false;
    public static boolean b = false;
    public static long c = 0;
    private static boolean d = false;
    private static final a e = new a();

    public static /* synthetic */ a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2116189c", new Object[0]) : e;
    }

    /* loaded from: classes.dex */
    public static class a implements nio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<Long, String> f18892a;

        private a() {
            this.f18892a = new LinkedHashMap(2);
        }

        @Override // tb.nio
        public void a(long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d8a2226", new Object[]{this, new Long(j), str});
                return;
            }
            synchronized (this) {
                if (this.f18892a.size() > 5) {
                    this.f18892a.clear();
                }
                this.f18892a.put(Long.valueOf(j), str);
            }
            TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.NATIVE_ONLY).addHeaderInfo("PHENIX_LATEST_DECODING", a());
        }

        @Override // tb.nio
        public synchronized void b(long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("298bb105", new Object[]{this, new Long(j), str});
            } else {
                this.f18892a.remove(Long.valueOf(j));
            }
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            String str = null;
            synchronized (this) {
                if (this.f18892a.size() > 0) {
                    for (Map.Entry<Long, String> entry : this.f18892a.entrySet()) {
                        str = str == null ? entry.getValue() : str + "," + entry.getValue();
                    }
                }
            }
            return str;
        }
    }

    public static void a(Context context, com.taobao.phenix.compat.stat.c cVar, int i, int i2, int i3, com.taobao.phenix.compat.stat.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198d4f09", new Object[]{context, cVar, new Integer(i), new Integer(i2), new Integer(i3), gVar});
            return;
        }
        TBImageFlowMonitor tBImageFlowMonitor = new TBImageFlowMonitor(i, i2, cVar, gVar);
        c = System.currentTimeMillis();
        tBImageFlowMonitor.a(b.c());
        ((Application) context).registerActivityLifecycleCallbacks(b.c());
        tBImageFlowMonitor.a(new com.taobao.phenix.compat.stat.h(context));
        if (i3 > 0) {
            tBImageFlowMonitor.c(i3);
        }
        com.taobao.pexode.d.a(tBImageFlowMonitor);
        com.taobao.phenix.intf.b.h().a(tBImageFlowMonitor);
        AvifDecoder.a(tBImageFlowMonitor);
        com.taobao.rxm.schedule.k a2 = com.taobao.phenix.intf.b.h().e().a();
        if (a2 != null) {
            com.taobao.rxm.schedule.j b2 = a2.b();
            if (b2 instanceof com.taobao.rxm.schedule.e) {
                ((com.taobao.rxm.schedule.e) b2).a(tBImageFlowMonitor);
            }
        }
        com.taobao.phenix.intf.b.h().a(e);
        TCrashSDK.instance().addJvmUncaughtCrashListener(new JvmUncaughtCrashListener() { // from class: com.taobao.phenix.compat.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
            public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
                }
                String a3 = d.b().a();
                if (a3 == null) {
                    niw.c("StatMonitor4Phenix", "crash happened, collect latest decoding failed", new Object[0]);
                    return null;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("PHENIX_LATEST_DECODING", a3);
                niw.b("StatMonitor4Phenix", "crash happened, collect latest decoding urls=%s", a3);
                return hashMap;
            }
        });
        niw.b("StatMonitor4Phenix", "init stat monitor with sampling=%d", Integer.valueOf(i));
        try {
            Class.forName("com.taobao.analysis.fulltrace.FullTraceAnalysis");
            Class.forName("com.taobao.analysis.v3.FalcoGlobalTracer");
            f18891a = true;
        } catch (Exception unused) {
            f18891a = false;
        }
        c();
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (!f18891a) {
        } else {
            nhx.f31473a = "bizReqStart";
            nhx.b = "bizReqProcessStart";
            nhx.c = "bizRspProcessStart";
            nhx.d = "bizRspCbDispatch";
            nhx.e = "bizRspCbStart";
            nhx.f = "bizRspCbEnd";
            nhx.g = "bizFinish";
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            d = z;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : d;
    }
}
