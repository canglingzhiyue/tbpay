package com.taobao.tao.homepage;

import android.os.Handler;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.homepage.utils.n;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.kxf;
import tb.lav;
import tb.ore;
import tb.tmx;

/* loaded from: classes8.dex */
public class e implements a.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<HomepageFragment> f20587a;

    static {
        kge.a(1928431161);
        kge.a(-791167727);
    }

    public e(HomepageFragment homepageFragment) {
        this.f20587a = new WeakReference<>(homepageFragment);
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        HomepageFragment homepageFragment = this.f20587a.get();
        long pageStart = homepageFragment == null ? 0L : homepageFragment.getPageStart();
        if (i == 1) {
            com.taobao.android.home.component.utils.e.b("ApmManager", "热启动结束 time=" + (System.currentTimeMillis() - pageStart));
        }
        boolean z = i == 0;
        if (z) {
            com.taobao.android.home.component.utils.e.b("ApmManager", "冷启动结束 time=" + (System.currentTimeMillis() - pageStart));
        }
        if (i2 == 0) {
            com.taobao.android.home.component.utils.e.b("ApmManager", "目标页面第一帧上屏 time=" + (System.currentTimeMillis() - pageStart));
        } else if (i2 == 1) {
            com.taobao.android.home.component.utils.e.b("ApmManager", "目标页面可视 time=" + (System.currentTimeMillis() - pageStart));
            com.taobao.tao.topmultitab.c.a().i();
            com.taobao.tao.recommend3.tracelog.b.a().f(com.taobao.tao.recommend3.tracelog.b.HOME_VISIBLE);
            com.taobao.tao.recommend3.tracelog.b.a().f(com.taobao.tao.recommend3.tracelog.b.HOME_VISIBLE_ONLY);
            com.taobao.tao.recommend3.tracelog.b.a().c("homeVisible");
        } else if (i2 == 2) {
            com.taobao.android.home.component.utils.e.b("ApmManager", "目标页面可交互 time=" + (System.currentTimeMillis() - pageStart));
            if (z) {
                com.taobao.tao.recommend3.tracelog.b.a().c("homeInteractive");
                kxf.a().c(50046);
            }
            final long elapsedRealtime = pageStart > 0 ? SystemClock.elapsedRealtime() - pageStart : 0L;
            if (n.o() || elapsedRealtime <= 0) {
                return;
            }
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.tao.homepage.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.tao.recommend3.tracelog.b.a().a("profilerDump", 4);
                    lav.a(elapsedRealtime);
                    com.taobao.tao.recommend3.tracelog.b.a().b("profilerDump");
                }
            }, 5000L);
        } else if (i2 == 3) {
            com.taobao.android.home.component.utils.e.b("ApmManager", "目标页面可流畅交互 time=" + (System.currentTimeMillis() - pageStart));
        } else if (i2 != 4) {
        } else {
            com.taobao.android.home.component.utils.e.b("ApmManager", "启动完成 time=" + (System.currentTimeMillis() - pageStart));
            new ore().c();
            new tmx().d();
        }
    }
}
