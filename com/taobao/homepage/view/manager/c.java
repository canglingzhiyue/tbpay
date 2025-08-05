package com.taobao.homepage.view.manager;

import android.app.Activity;
import android.os.Handler;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.Globals;
import com.taobao.tao.util.NetWorkUtils;
import tb.kge;
import tb.lbq;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private lbq b;
    private boolean c;

    /* renamed from: a  reason: collision with root package name */
    public Handler f17315a = new Handler();
    private Runnable j = new Runnable() { // from class: com.taobao.homepage.view.manager.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                c.a(c.this).getHomePageManager().m().a();
                com.taobao.homepage.speed.b.a();
            } catch (Exception e) {
                e.e("LazyInitManager", "startShake init failed  !!!" + e);
            }
        }
    };
    private Runnable k = new Runnable() { // from class: com.taobao.homepage.view.manager.c.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Coordinator.execute(new Runnable() { // from class: com.taobao.homepage.view.manager.c.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (j.a("memoryFixEnable", true)) {
                                c.a(c.this, NetWorkUtils.isLowNetworkMode(Globals.getApplication()));
                                return;
                            }
                            Activity curActivity = c.a(c.this).getCurActivity();
                            if (curActivity == null) {
                                return;
                            }
                            c.a(c.this, NetWorkUtils.isLowNetworkMode(curActivity));
                        } catch (Exception e) {
                            e.e("LazyInitManager", "lowNetworkMode init failed  !!!" + e);
                        }
                    }
                });
                com.taobao.android.editionswitcher.b.a();
                Activity curActivity = c.a(c.this).getCurActivity();
                if (curActivity == null) {
                    return;
                }
                com.taobao.homepage.utils.j.a(curActivity, null, false);
            } catch (Exception e) {
                e.e("LazyInitManager", "init load failed  !!!" + e);
            }
        }
    };

    static {
        kge.a(-415700821);
    }

    public static /* synthetic */ lbq a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbq) ipChange.ipc$dispatch("cd5a2ab9", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b8d73e6", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.c = z;
        return z;
    }

    public c(lbq lbqVar) {
        this.b = lbqVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f17315a.postDelayed(this.j, Constants.STARTUP_TIME_LEVEL_1);
        this.f17315a.postDelayed(this.k, 10000L);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
    }
}
