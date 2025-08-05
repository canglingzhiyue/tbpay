package com.taobao.tao.homepage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.application.common.a;
import com.taobao.homepage.utils.q;
import com.taobao.monitor.procedure.s;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.kge;
import tb.oqk;
import tb.oql;
import tb.xkv;
import tb.xnh;

/* loaded from: classes8.dex */
public class k implements a.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<HomepageFragment> f20595a;
    private final oqk b = new oqk() { // from class: com.taobao.tao.homepage.k.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.oqk
        public void k_(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e9d0e5", new Object[]{this, str});
            } else {
                Coordinator.execute(new Runnable() { // from class: com.taobao.tao.homepage.k.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            k.this.a(str);
                        }
                    }
                });
            }
        }
    };

    static {
        kge.a(701549970);
        kge.a(-697716806);
    }

    public k(HomepageFragment homepageFragment) {
        this.f20595a = new WeakReference<>(homepageFragment);
        q.b(true);
        oql.a().a(this.b);
    }

    @Override // com.taobao.application.common.IPageListener
    public void a(String str, int i, long j) {
        HomepageFragment homepageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526bd3", new Object[]{this, str, new Integer(i), new Long(j)});
        } else if (!TextUtils.equals(str, HomepageFragment.class.getSimpleName()) || (homepageFragment = this.f20595a.get()) == null) {
        } else {
            long pageStart = homepageFragment.getPageStart();
            long elapsedRealtime = SystemClock.elapsedRealtime() - pageStart;
            com.taobao.android.home.component.utils.e.c("ApmManager", "onPageChanged pageName=" + str + ", status=" + i + ", time=" + j + " , pageStart=" + pageStart + " , cost=" + elapsedRealtime);
            if (i == 2) {
                com.taobao.android.home.component.utils.e.b("ApmManager", "目标页面可见 time=" + elapsedRealtime);
                s.f18233a.b(homepageFragment).a("pageVisibleTime", Long.valueOf(j));
            } else if (i != 3) {
            } else {
                com.taobao.android.home.component.utils.e.b("ApmManager", "目标页面可交互 time=" + elapsedRealtime);
                com.taobao.monitor.procedure.g b = s.f18233a.b(homepageFragment);
                b.a("pageInteractiveTime", Long.valueOf(j));
                b.a("launchType", com.taobao.tao.recommend3.tracelog.c.a("launchType", ""));
                b.a("launchTime", Long.valueOf(com.taobao.tao.recommend3.tracelog.c.b()));
                b.a("isHomepageScrollSmoothOpt", Boolean.valueOf(xnh.a()));
                q.b(false);
                JSONObject b2 = q.b();
                if (b2 != null) {
                    com.taobao.android.home.component.utils.e.c("ApmManager", "imageLoadMsg:" + b2);
                    b.a("imageLoadMsg", (Object) com.alibaba.ut.abtest.internal.util.g.a(b2.toJSONString()));
                }
                if (xkv.b() == null) {
                    return;
                }
                Map<String, Long> c = xkv.b().c();
                com.taobao.android.home.component.utils.e.c("ApmManager", "totalStages:" + c);
                b.a("totalStages", (Object) c);
            }
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!com.taobao.android.home.component.utils.j.a("enableHomePageReportJumpUrl", true) || TextUtils.isEmpty(str)) {
        } else {
            s.f18233a.d().a("home_page_first_jump_url", str);
            s.f18233a.d().a("home_page_first_jump_time", SystemClock.uptimeMillis());
            HomepageFragment homepageFragment = this.f20595a.get();
            if (homepageFragment == null) {
                return;
            }
            com.taobao.monitor.procedure.g b = s.f18233a.b(homepageFragment);
            b.a("home_page_first_jump_url", str);
            b.a("home_page_first_jump_time", SystemClock.uptimeMillis());
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        q.b(false);
        oql.a().b(this.b);
        Coordinator.execute(new Runnable() { // from class: com.taobao.tao.homepage.k.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    q.b();
                }
            }
        });
    }
}
