package com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.tao.log.TLog;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.kyu;
import tb.lcz;
import tb.ljs;
import tb.lks;
import tb.lku;
import tb.lkz;
import tb.lqo;
import tb.oql;
import tb.sgf;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TbPopLayerBroadcastReceiver b;
    private static i c;

    /* renamed from: a  reason: collision with root package name */
    private kyu f17503a;
    private IContainerService.a d;
    private e e;
    private lks.c f;
    private lkz.a g;
    private lku h;
    private IContainerDataService.c i;
    private a j;
    private IContainerService k;
    private IContainerDataService l;
    private IMainFeedsViewService<RecyclerView> m;
    private IMainFeedsLoopStartStopService n;
    private IMainLifecycleService o;
    private AtomicBoolean p = new AtomicBoolean(false);
    private IContainerDataService.b q;

    static {
        kge.a(-1300703852);
    }

    public void a(ljs ljsVar, kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721e14c", new Object[]{this, ljsVar, kyuVar});
            return;
        }
        this.f17503a = kyuVar;
        this.l = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        this.m = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.k = (IContainerService) ljsVar.a(IContainerService.class);
        this.n = (IMainFeedsLoopStartStopService) ljsVar.a(IMainFeedsLoopStartStopService.class);
        this.o = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        c(kyuVar);
        a();
        a(ljsVar);
    }

    private void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        IPullRefreshService iPullRefreshService = (IPullRefreshService) ljsVar.a(IPullRefreshService.class);
        if (iPullRefreshService == null) {
            return;
        }
        iPullRefreshService.addPullRefreshListener(new h(ljsVar, this.f17503a));
    }

    public void a(kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20ac4b1", new Object[]{this, kyuVar});
            return;
        }
        b(kyuVar);
        b();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.k == null || this.l == null || this.m == null || this.n == null) {
            com.taobao.homepage.pop.utils.c.b("PopLifeCycleRegister ", "service is null, discard registerLifeCycle");
        } else if (!this.p.compareAndSet(false, true)) {
        } else {
            this.q = new sgf();
            this.l.addRequestListener(this.q);
            this.d = new g(this.f17503a);
            this.k.addUiRefreshListener(this.d);
            this.e = new e(this.f17503a);
            this.n.registerStartStopListener(this.e);
            lks mo1084getLifeCycleRegister = this.m.mo1084getLifeCycleRegister();
            this.g = new c(this.f17503a);
            mo1084getLifeCycleRegister.a(this.g);
            this.f = new f(this.f17503a);
            mo1084getLifeCycleRegister.a(this.f);
            this.h = new b(this.f17503a, this.l, this.m);
            mo1084getLifeCycleRegister.a(this.h);
            this.i = new lqo(this.f17503a);
            this.l.addRequestBizParamsCreator(this.i);
            if (this.o == null) {
                return;
            }
            this.j = new a(this.f17503a);
            this.o.getAppLifeCycleRegister().a(this.j);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.k == null || this.l == null || this.m == null) {
            com.taobao.homepage.pop.utils.c.b("PopLifeCycleRegister ", "service is null, discard unRegisterLifecycle");
        } else if (!this.p.compareAndSet(true, false)) {
        } else {
            this.l.removeRequestListener(this.q);
            this.k.removeUiRefreshListener(this.d);
            this.n.unregisterStartStopListener(this.e);
            lks mo1084getLifeCycleRegister = this.m.mo1084getLifeCycleRegister();
            mo1084getLifeCycleRegister.b(this.g);
            mo1084getLifeCycleRegister.b(this.f);
            mo1084getLifeCycleRegister.b(this.h);
            this.l.removeRequestBizParamsCreator(this.i);
            IMainLifecycleService iMainLifecycleService = this.o;
            if (iMainLifecycleService == null) {
                return;
            }
            iMainLifecycleService.getAppLifeCycleRegister().b(this.j);
        }
    }

    private void b(kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08dcb32", new Object[]{this, kyuVar});
            return;
        }
        TbPopLayerBroadcastReceiver tbPopLayerBroadcastReceiver = b;
        if (tbPopLayerBroadcastReceiver != null) {
            tbPopLayerBroadcastReceiver.b(kyuVar);
        }
        i iVar = c;
        if (iVar == null) {
            return;
        }
        iVar.b(kyuVar);
    }

    private void c(kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf10d1b3", new Object[]{this, kyuVar});
            return;
        }
        if (b == null) {
            b = new TbPopLayerBroadcastReceiver();
            a(b);
        }
        if (c == null) {
            c = new i();
            oql.a().a(c);
        }
        b.a(kyuVar);
        c.a(kyuVar);
    }

    private void a(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db70fdf", new Object[]{this, broadcastReceiver});
            return;
        }
        Application a2 = lcz.a();
        if (a2 == null || broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PopLayer.ACTION_OUT_DISPLAY);
        intentFilter.addAction(PopLayer.ACTION_OUT_DISMISS);
        try {
            LocalBroadcastManager.getInstance(a2).registerReceiver(broadcastReceiver, intentFilter);
        } catch (Throwable th) {
            TLog.loge(PopConst.LOG_TAG_HOME_POP, "PopLifeCycleRegister ", "init pop lifecycle error", th);
        }
    }
}
