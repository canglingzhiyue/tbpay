package com.taobao.android.detail.core.async;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.ecg;
import tb.eip;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AsyncViewManager";

    /* renamed from: a  reason: collision with root package name */
    public static ArrayList<Integer> f9379a;
    public static ArrayList<Integer> b;
    private static final ArrayList<Integer> c;
    private static volatile d e;
    private e d;
    private int f;
    private int g;
    private int h;
    private a i;

    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(1992721988);
        c = new ArrayList<Integer>() { // from class: com.taobao.android.detail.core.async.AsyncViewManager$1
            {
                add(Integer.valueOf(R.layout.x_detail_activity_no_surfaceview_opt));
                add(Integer.valueOf(R.layout.x_detail_vh_bottom_bar));
                add(Integer.valueOf(R.layout.x_detail_container_divider));
                add(Integer.valueOf(R.layout.x_detail_container_divider));
                add(Integer.valueOf(R.layout.x_detail_container_divider));
                add(Integer.valueOf(R.layout.x_detail_container_divider));
                add(Integer.valueOf(R.layout.pic_gallery_video_player_layout));
                add(Integer.valueOf(R.layout.x_detail_activity_minivideo_container));
                add(Integer.valueOf(R.layout.x_detail_main_top));
                add(Integer.valueOf(R.layout.x_detail_main_top));
            }
        };
        b = new ArrayList<Integer>() { // from class: com.taobao.android.detail.core.async.AsyncViewManager$2
            {
                add(Integer.valueOf(R.layout.x_detail_activity_no_surfaceview_opt));
            }
        };
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1a46cd31", new Object[0]);
        }
        if (e == null) {
            synchronized (d.class) {
                if (e == null) {
                    e = new d();
                }
            }
        }
        return e;
    }

    private d() {
        long currentTimeMillis = System.currentTimeMillis();
        this.d = new e();
        String a2 = com.taobao.android.detail.core.performance.a.a("AsyncViewManager");
        i.d(a2, "constructor cost=" + (System.currentTimeMillis() - currentTimeMillis));
        emu.a("com.taobao.android.detail.core.async.AsyncViewManager");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>(c);
        ArrayList<Integer> arrayList2 = f9379a;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        this.f = arrayList.size();
        String a2 = com.taobao.android.detail.core.performance.a.a("AsyncViewManager");
        i.c(a2, "异步加载 " + arrayList.size() + " 个layout");
        this.d.a(arrayList);
        String a3 = com.taobao.android.detail.core.performance.a.a("AsyncViewManager");
        i.d(a3, "asyncLoadDefaultViews end, cost=" + (System.currentTimeMillis() - currentTimeMillis));
        a(b);
    }

    public void a(ArrayList<Integer> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = com.taobao.android.detail.core.performance.a.a("AsyncViewManager");
        i.c(a2, "异步加载 " + arrayList.size() + " 个后备layout");
        this.d.b(new ArrayList<>(arrayList));
        String a3 = com.taobao.android.detail.core.performance.a.a("AsyncViewManager");
        i.d(a3, "asyncLoadStandByViews end, cost=" + (System.currentTimeMillis() - currentTimeMillis));
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.d.b();
        }
    }

    public View a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9a97f025", new Object[]{this, context, new Integer(i)}) : this.d.a(context, i, this.i);
    }

    public static View b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a218a26", new Object[]{context, new Integer(i)});
        }
        View a2 = a().a(context, i);
        if (a2 == null) {
            a2 = View.inflate(context, i, null);
            i.c(com.taobao.android.detail.core.performance.a.a("AsyncViewManager"), "getLayout未命中缓存，走同步加载！");
        } else {
            a().d();
            String a3 = com.taobao.android.detail.core.performance.a.a("AsyncViewManager");
            i.c(a3, "getLayout命中缓存，view=" + a2);
        }
        a().e();
        return a2;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.h++;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.g++;
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        if (eip.k) {
            ecg.a(context, this.f, this.g, this.h);
            String a2 = com.taobao.android.detail.core.performance.a.a("AsyncViewManager");
            i.c(a2, "异步加载[" + this.f + "]个Layout, 业务调用[" + this.g + "]次，命中[" + this.h + "]次");
        }
        i.c(com.taobao.android.detail.core.performance.a.a("AsyncViewManager"), "destroy");
        this.d.a();
        this.i = null;
        this.h = 0;
        this.g = 0;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116e838e", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }
}
