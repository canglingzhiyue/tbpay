package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.X;
import com.alibaba.security.client.smart.core.algo.AlgoCodeConstants;
import com.alibaba.security.client.smart.core.algo.ClientAlgoResult;
import com.alibaba.security.wukong.AlgoResultReporter;
import com.alibaba.security.wukong.config.Algo;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.secutiry.mnn.pykit.PythonKitManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCV;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.alibaba.security.ccrc.service.build.bb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1198bb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3294a = "WuKongPythonMnnManager";
    public final String d;
    public G f;
    public InterfaceC1260wb g;
    public F h;
    public ThreadPoolExecutor i;
    public final Map<String, Eb> b = new HashMap();
    public final AlgoResultReporter c = AlgoResultReporter.a.f3622a;
    public final Handler e = new HandlerC1256va(null);

    public C1198bb(String str) {
        this.d = str;
    }

    public static /* synthetic */ void a(C1198bb c1198bb, String str, InterfaceC1257vb interfaceC1257vb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ec528e", new Object[]{c1198bb, str, interfaceC1257vb});
        } else {
            c1198bb.a(str, interfaceC1257vb);
        }
    }

    private Context d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f183c0e3", new Object[]{this}) : CcrcContextImpl.getContext();
    }

    private synchronized ThreadPoolExecutor e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("90cb814c", new Object[]{this});
        }
        if (this.i == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque(500);
            this.i = new ThreadPoolExecutor(1, 1, 10L, timeUnit, linkedBlockingDeque, new Ka(this.d + "#mnn_python_manager"), new _a(this));
            this.i.allowCoreThreadTimeOut(true);
        }
        return this.i;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            com.taobao.mrt.f.a().a(new Ua(this));
        }
    }

    private synchronized void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        for (Map.Entry<String, Eb> entry : this.b.entrySet()) {
            Eb value = entry.getValue();
            if (value != null) {
                value.release();
            }
        }
        this.b.clear();
    }

    private synchronized void b(List<Algo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        for (Algo algo : list) {
            if (this.b.get(algo.code) == null) {
                this.b.put(algo.code, a(CcrcContextImpl.getContext(), algo, this.g));
            }
        }
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.i != null) {
            this.i.shutdown();
            this.i = null;
        }
        g();
        AlgoResultReporter algoResultReporter = this.c;
        if (algoResultReporter != null) {
            algoResultReporter.release();
        }
        F f = this.h;
        if (f != null) {
            f.a();
        }
    }

    public static /* synthetic */ void a(C1198bb c1198bb, CCRCRiskSample cCRCRiskSample, CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dcae728", new Object[]{c1198bb, cCRCRiskSample, config});
        } else {
            c1198bb.a(cCRCRiskSample, config);
        }
    }

    public void a(List<Algo> list, InterfaceC1257vb interfaceC1257vb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60db8911", new Object[]{this, list, interfaceC1257vb});
        } else if (list != null && !list.isEmpty()) {
            b(list);
            if (a(list)) {
                a();
            }
            PythonKitManager.a(CcrcContextImpl.getContext());
            interfaceC1257vb.a(true, null, null);
        } else {
            interfaceC1257vb.a(true, null, null);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : Ib.a() && !Ib.a(this.d).b();
    }

    private boolean c(List<Algo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e037145f", new Object[]{this, list})).booleanValue();
        }
        for (Algo algo : list) {
            if (!MNNCV.isTaskRunnable(algo.code)) {
                return false;
            }
        }
        return true;
    }

    public void a(List<Algo> list, String str, InterfaceC1257vb interfaceC1257vb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e9c79b", new Object[]{this, list, str, interfaceC1257vb});
        } else if (list != null && !list.isEmpty()) {
            b(list);
            if (this.b.isEmpty()) {
                interfaceC1257vb.a(true, null, null);
            } else if (b()) {
                interfaceC1257vb.a(true, X.a.f3284a, null);
            } else {
                f();
                if (!com.taobao.mrt.c.a() || !MNNCV.isAvailable()) {
                    T.a().b();
                }
                if (!a(list)) {
                    C1249t.a(new Va(this, str, interfaceC1257vb), 2000L, new Wa(this, list));
                } else {
                    a(str, interfaceC1257vb);
                }
            }
        } else {
            interfaceC1257vb.a(true, null, null);
        }
    }

    public boolean a(List<Algo> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue() : com.taobao.mrt.c.a() && MNNCV.isAvailable() && c(list);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.b.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            for (Eb eb : this.b.values()) {
                eb.a(new Xa(this, currentTimeMillis, eb));
            }
        }
    }

    private synchronized void a(String str, InterfaceC1257vb interfaceC1257vb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c168a6a", new Object[]{this, str, interfaceC1257vb});
            return;
        }
        boolean[] zArr = {true};
        AtomicInteger atomicInteger = new AtomicInteger(this.b.size());
        ArrayList arrayList = new ArrayList();
        for (Eb eb : this.b.values()) {
            eb.a(str, new Ya(this, zArr, arrayList, atomicInteger, interfaceC1257vb));
        }
    }

    private Eb a(Context context, Algo algo, InterfaceC1260wb interfaceC1260wb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Eb) ipChange.ipc$dispatch("c9ffabfd", new Object[]{this, context, algo, interfaceC1260wb});
        }
        if (TextUtils.equals(algo.code, AlgoCodeConstants.CODE_KEY_FRAME)) {
            return new Db(context, algo, interfaceC1260wb);
        }
        return new Cb(context, algo, interfaceC1260wb);
    }

    public synchronized void a(CCRCRiskSample cCRCRiskSample, CcrcService.Config config, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f6a750", new Object[]{this, cCRCRiskSample, config, new Boolean(z)});
        } else if (this.b.isEmpty()) {
        } else {
            if (z) {
                a(cCRCRiskSample, config);
            } else {
                e().submit(new Za(this, cCRCRiskSample, config));
            }
        }
    }

    private void a(CCRCRiskSample cCRCRiskSample, CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457b8c04", new Object[]{this, cCRCRiskSample, config});
            return;
        }
        ArrayList<ClientAlgoResult> arrayList = new ArrayList();
        for (Map.Entry<String, Eb> entry : this.b.entrySet()) {
            Eb value = entry.getValue();
            if (value != null && value.a(cCRCRiskSample.getSampleType())) {
                Map<String, Object> detect = value.detect(cCRCRiskSample);
                ClientAlgoResult obtain = ClientAlgoResult.obtain(value.algoCode(), detect, cCRCRiskSample);
                if (this.f != null) {
                    this.e.post(new RunnableC1195ab(this, detect));
                }
                if (value.c()) {
                    this.c.addResult(obtain, this.g.getCcrcCode(), config.getPid());
                } else {
                    arrayList.add(obtain);
                }
            }
        }
        if (this.h == null) {
            return;
        }
        for (ClientAlgoResult clientAlgoResult : arrayList) {
            this.h.a(config, clientAlgoResult);
        }
    }

    public void a(F f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4213973e", new Object[]{this, f});
        } else {
            this.h = f;
        }
    }

    public synchronized void a(InterfaceC1260wb interfaceC1260wb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323c921", new Object[]{this, interfaceC1260wb});
        } else {
            this.g = interfaceC1260wb;
        }
    }

    public void a(G g) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42140b9d", new Object[]{this, g});
        } else {
            this.f = g;
        }
    }
}
