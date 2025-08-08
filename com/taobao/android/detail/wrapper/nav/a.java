package com.taobao.android.detail.wrapper.nav;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.d;
import com.taobao.android.detail.wrapper.ext.preload.DetailPreloadRequester;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import tb.eip;
import tb.eiq;
import tb.emu;
import tb.fac;
import tb.fei;
import tb.fgq;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_NAV_PREFETCH = "prefetch_v";

    /* renamed from: a  reason: collision with root package name */
    private static final com.taobao.android.detail.core.performance.preload.d f11414a;
    private static final ArrayList<Integer> d;
    private Context b;
    private Intent c;
    private final d.a e = new d.a() { // from class: com.taobao.android.detail.wrapper.nav.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.core.async.d.a
        public void a(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                a.a(a.this).execute(new Runnable() { // from class: com.taobao.android.detail.wrapper.nav.a.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ArrayList<Integer> arrayList = new ArrayList<>(1);
                        arrayList.add(Integer.valueOf(i));
                        com.taobao.android.detail.core.async.d.a().a(arrayList);
                    }
                });
            }
        }
    };

    public static /* synthetic */ ExecutorService a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("657f9d70", new Object[]{aVar}) : aVar.d();
    }

    static {
        kge.a(-1129386341);
        f11414a = new com.taobao.android.detail.core.performance.preload.d();
        d = new ArrayList<Integer>() { // from class: com.taobao.android.detail.wrapper.nav.DetailNavController$1
            {
                add(Integer.valueOf(R.layout.x_detail_action_bar_search));
                add(Integer.valueOf(R.layout.x_detail_action_bar_search));
                add(Integer.valueOf(R.layout.x_detail_action_bar_search_v3));
                add(Integer.valueOf(R.layout.x_detail_action_bar_search_v3));
                add(Integer.valueOf(R.layout.x_detail_action_bar_more_v2));
                add(Integer.valueOf(R.layout.x_detail_action_bar_more_v2));
                add(Integer.valueOf(R.layout.x_detail_main_action_bar_search));
                add(Integer.valueOf(R.layout.x_detail_main_action_bar_search));
            }
        };
    }

    public a(Context context, Intent intent) {
        this.b = context;
        this.c = intent;
        com.taobao.android.detail.core.async.d.a().a(this.e);
        emu.a("com.taobao.android.detail.wrapper.nav.DetailNavController");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.putExtra(DETAIL_NAV_PREFETCH, "true");
        d().execute(new RunnableC0451a(this.b, this.c, SystemClock.uptimeMillis()));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.async.d.a().c();
        com.taobao.android.detail.core.async.d.f9379a = d;
        d().execute(new Runnable() { // from class: com.taobao.android.detail.wrapper.nav.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    com.taobao.android.detail.core.async.d.a().b();
                }
            }
        });
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DetailPreloadRequester.a();
        Intent intent = this.c;
        if (intent == null) {
            com.taobao.android.detail.core.utils.i.a(com.taobao.android.detail.core.performance.l.a("NavController"), "导航intent为空");
            return;
        }
        String a2 = a(intent);
        if (!eiq.b || com.alibaba.ability.localization.b.c()) {
            String a3 = com.taobao.android.detail.core.performance.l.a("NavController");
            com.taobao.android.detail.core.utils.i.a(a3, "导航预加载未开启:" + a2);
            return;
        }
        com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.l.a("NavController"), "进入导航预加载");
        d().execute(new b(this.c, a2));
    }

    private String a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{this, intent});
        }
        Uri data = intent.getData();
        if (data == null) {
            return com.taobao.android.detail.ttdetail.constant.a.UN_KNOW;
        }
        String queryParameter = data.getQueryParameter("from");
        return StringUtils.isEmpty(queryParameter) ? com.taobao.android.detail.ttdetail.constant.a.UN_KNOW : queryParameter;
    }

    /* renamed from: com.taobao.android.detail.wrapper.nav.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class RunnableC0451a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f11418a;
        private Intent b;
        private long c;

        static {
            kge.a(-2118710979);
            kge.a(-1390502639);
        }

        public RunnableC0451a(Context context, Intent intent, long j) {
            this.f11418a = context;
            this.b = intent;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f11418a == null) {
            } else {
                Uri data = this.b.getData();
                String a2 = com.taobao.android.detail.core.performance.k.a("NavController");
                com.taobao.android.detail.core.utils.i.c(a2, "上游业务url: " + data);
                fac.a();
                if (eip.q) {
                    fgq.a().b();
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                String a3 = com.taobao.android.detail.core.performance.k.a("NavController");
                com.taobao.android.detail.core.utils.i.c(a3, "start prefetch request, nav预请求线程切换耗时: " + (uptimeMillis - this.c));
                fei.a(this.f11418a, this.b);
            }
        }
    }

    private ExecutorService d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("2942bf10", new Object[]{this}) : f11414a.a(3, 10, "detailPrefetchRequest");
    }
}
