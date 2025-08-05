package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.b;
import com.taobao.android.dinamicx.eventchain.k;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes.dex */
public class fwt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int j;
    private int k;
    private lmv l;

    /* renamed from: a  reason: collision with root package name */
    private k f28172a = null;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private fwy b = new fwy();
    private a c = new a(this.b);

    static {
        kge.a(-2135099838);
    }

    public fwt(lmv lmvVar) {
        this.l = lmvVar;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        if (fwrVar == null || !fwrVar.c(this.d)) {
            return false;
        }
        if (!fwrVar.b(this.e)) {
            Log.e("EventChainLoader_TMTEST", "event chain seekBy error:" + this.e);
            return false;
        }
        this.j = fwrVar.b();
        if (fwrVar.b() == this.f) {
            if (!this.b.a(this.g, fwrVar, dXRuntimeContext)) {
                fux.b("event chain string loadFromBuffer error!");
            }
        } else {
            List<s.a> list = dXRuntimeContext.n().c;
            list.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_LOAD_EVENT_CHIAN_BINARY, s.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_STRING_LOADER_POSITION_ERROR, "event chain string pos error:" + this.f + "  read pos:" + fwrVar.b()));
        }
        if (fwrVar.b() == this.h) {
            if (!this.c.a(this.i, fwrVar, dXRuntimeContext)) {
                fux.b("event chain expr loadFromBuffer error!");
            }
        } else {
            List<s.a> list2 = dXRuntimeContext.n().c;
            list2.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_LOAD_EVENT_CHIAN_BINARY, s.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_EXPR_LOADER_POSITION_ERROR, "event chain expr pos error:" + this.h + "  read pos:" + fwrVar.b()));
        }
        Log.e("TIME:", "eventchain_loadFromBuffer** " + (System.nanoTime() - nanoTime));
        return true;
    }

    public k b(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("f8d4c66", new Object[]{this, fwrVar, dXRuntimeContext});
        }
        long nanoTime = System.nanoTime();
        if (this.e == 0 || fwrVar == null || !fwrVar.c(this.d)) {
            return null;
        }
        byte d = fwrVar.d();
        if (d < 0) {
            dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_LOAD_EVENT_CHIAN_BINARY, s.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_LOADER_COUNT_ERROR));
            return null;
        }
        this.f28172a = new k();
        for (int i = 0; i < d; i++) {
            if (fwrVar.d() != 0 || (a2 = a(fwrVar.f(), fwrVar, dXRuntimeContext)) == null) {
                return null;
            }
            this.f28172a.a(a2.a(), a2);
            if (fwrVar.d() != 1) {
                return null;
            }
        }
        this.f28172a.a(a.a(this.c));
        Log.e("TIME:", "eventchain_createEventChain** " + (System.nanoTime() - nanoTime));
        return this.f28172a;
    }

    private b a(int i, fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("44f9555d", new Object[]{this, new Integer(i), fwrVar, dXRuntimeContext});
        }
        try {
            short e = fwrVar.e();
            String str = new String(fwrVar.a(), fwrVar.b(), (int) e);
            fwrVar.b(e);
            short e2 = fwrVar.e();
            b bVar = new b(str, e2);
            for (int i2 = 0; i2 < e2; i2++) {
                fwrVar.d();
                com.taobao.android.dinamicx.eventchain.a a2 = a(fwrVar.e(), str, fwrVar, dXRuntimeContext);
                if (a2 == null) {
                    List<s.a> list = dXRuntimeContext.n().c;
                    list.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_LOAD_EVENT_CHIAN_BINARY, s.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_LOADER_ATOMICEVENT, "eventChainName" + str));
                    return null;
                }
                bVar.a(a2.a(), a2);
                fwrVar.d();
            }
            return bVar;
        } catch (Exception e3) {
            if (DinamicXEngine.j()) {
                e3.printStackTrace();
            }
            dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_LOAD_EVENT_CHIAN_BINARY, s.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_LOADER_EVENTCHIAN, com.taobao.android.dinamicx.exception.a.a(e3)));
            return null;
        }
    }

    private com.taobao.android.dinamicx.eventchain.a a(int i, String str, fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.eventchain.a) ipChange.ipc$dispatch("bfd06af4", new Object[]{this, new Integer(i), str, fwrVar, dXRuntimeContext});
        }
        try {
            short e = fwrVar.e();
            String str2 = new String(fwrVar.a(), fwrVar.b(), (int) e);
            fwrVar.b(e);
            com.taobao.android.dinamicx.eventchain.a aVar = new com.taobao.android.dinamicx.eventchain.a(str2, Long.valueOf(fwrVar.g()));
            if (this.k >= 11) {
                aVar.a(com.taobao.android.dinamicx.eventchain.a.MEGA.byteValue());
                if (this.k >= 12) {
                    aVar.a(this.l.a());
                }
            }
            short e2 = fwrVar.e();
            if (e2 != 0) {
                aVar.b(new String(fwrVar.a(), fwrVar.b(), (int) e2));
                fwrVar.b(e2);
            }
            short e3 = fwrVar.e();
            if (e3 != 0) {
                aVar.a(new String(fwrVar.a(), fwrVar.b(), (int) e3));
                fwrVar.b(e3);
            }
            int f = fwrVar.f();
            if (f != 0) {
                aVar.c(new String(fwrVar.a(), fwrVar.b(), f));
                fwrVar.b(f);
            }
            return aVar;
        } catch (Exception e4) {
            if (DinamicXEngine.j()) {
                e4.printStackTrace();
            }
            dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_LOAD_EVENT_CHIAN_BINARY, s.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_LOADER_ATOMICEVENT, com.taobao.android.dinamicx.exception.a.a(e4)));
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, fqp> b;
        private Stack<fqp> c = new Stack<>();
        private fwy d;

        static {
            kge.a(-1408438711);
        }

        public static /* synthetic */ Map a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("99796d4d", new Object[]{aVar}) : aVar.b;
        }

        public a(fwy fwyVar) {
            this.d = fwyVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x0173, code lost:
            r17.b.put(r15, r14);
            r10 = r10 + 1;
            r5 = 3;
         */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0141 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(int r18, tb.fwr r19, com.taobao.android.dinamicx.DXRuntimeContext r20) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.fwt.a.a(int, tb.fwr, com.taobao.android.dinamicx.DXRuntimeContext):boolean");
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }
}
