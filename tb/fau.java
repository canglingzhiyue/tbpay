package tb;

import android.app.Activity;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.k;
import com.taobao.android.detail.core.utils.n;
import com.taobao.android.trade.event.f;
import com.taobao.android.weexdownloader.downloader.d;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.base.a;
import com.taobao.vessel.utils.VesselType;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class fau extends b<fbj> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_Detail";
    public static final String UT_SHOW_ARG1 = "Page_Detail_Show_ProductDetail";
    public static final String WX_OPTIONS_KEY = "bundleUrl";
    public static String k;
    public static String l;
    public static String m;
    public static String n;
    public static String o;
    private FrameLayout p;
    private VesselView q;
    private String r;
    private String s;
    private String t;
    private String u;
    private int v;
    private int w;
    private String x;
    private String y;
    private fbj z;

    public static /* synthetic */ Object ipc$super(fau fauVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ FrameLayout a(fau fauVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("b39c349b", new Object[]{fauVar}) : fauVar.p;
    }

    public static /* synthetic */ void a(fau fauVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f54cdc", new Object[]{fauVar, str, str2, str3});
        } else {
            fauVar.a(str, str2, str3);
        }
    }

    public static /* synthetic */ void a(fau fauVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6eb77a6", new Object[]{fauVar, str, str2, str3, str4});
        } else {
            fauVar.b(str, str2, str3, str4);
        }
    }

    public static /* synthetic */ void a(fau fauVar, Map map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5fa78d", new Object[]{fauVar, map, aVar});
        } else {
            fauVar.a(map, aVar);
        }
    }

    public static /* synthetic */ VesselView b(fau fauVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("a4760ec5", new Object[]{fauVar}) : fauVar.q;
    }

    public static /* synthetic */ HashMap c(fau fauVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("7fedf7e3", new Object[]{fauVar}) : fauVar.j();
    }

    public static /* synthetic */ void d(fau fauVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b96901", new Object[]{fauVar});
        } else {
            fauVar.i();
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((fbj) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(fbj fbjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fbjVar})).booleanValue() : c2(fbjVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ boolean b(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5839c995", new Object[]{this, bVar})).booleanValue() : d((fbj) bVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(fbj fbjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fbjVar}) : a2(fbjVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean e(fbj fbjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a15425e5", new Object[]{this, fbjVar})).booleanValue() : d(fbjVar);
    }

    static {
        kge.a(-1514221330);
        k = "method";
        l = Constants.KEY_CONTROL;
        m = "show";
        n = "hide";
        o = "click";
    }

    public fau(Activity activity) {
        super(activity);
        this.t = "1";
        this.w = 0;
        this.p = new FrameLayout(activity);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.VesselViewHolder");
    }

    /* renamed from: e  reason: avoid collision after fix types in other method */
    private void e2(fbj fbjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24586ee", new Object[]{this, fbjVar});
            return;
        }
        this.v = com.taobao.android.detail.core.detail.kit.utils.b.a(this.g, fbjVar.f);
        this.t = fbjVar.b;
        this.w = fbjVar.e;
        this.u = fbjVar.d;
        this.r = fbjVar.c;
        this.s = fbjVar.f27747a;
        this.x = fbjVar.h;
        this.y = fbjVar.g;
        this.z = fbjVar;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(fbj fbjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("33725eac", new Object[]{this, fbjVar});
        }
        this.p.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        a(this.w);
        this.p.requestLayout();
        return this.p;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(fbj fbjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bc736b", new Object[]{this, fbjVar});
        } else if (fbjVar == null) {
        } else {
            try {
                e2(fbjVar);
                d();
                a(this.t, this.s, this.r, this.t);
            } catch (Exception e) {
                i.a("Detail-VesselVH", "VessleView fillData异常", e);
                Activity activity = this.g;
                eps.a(activity, "Page_Detail", 12345, "Page_Detail-Monitor", null, null, "在fillData中捕获异常" + e.getMessage());
                f();
                Activity activity2 = this.g;
                String str = this.y;
                if (str == null) {
                    str = "";
                }
                String str2 = this.s;
                if (str2 == null) {
                    str2 = "";
                }
                ecg.d(activity2, str, str2, "", "在fillData中捕获异常:" + e.getMessage());
            }
        }
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(fbj fbjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c53f79f0", new Object[]{this, fbjVar})).booleanValue() : StringUtils.isEmpty(fbjVar.f27747a);
    }

    public boolean d(fbj fbjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3c28071", new Object[]{this, fbjVar})).booleanValue();
        }
        try {
            this.z = fbjVar;
            if (this.b != null && this.z != null) {
                if (c2(fbjVar)) {
                    this.b.setVisibility(8);
                } else {
                    if (this.b.getVisibility() == 8) {
                        this.b.setVisibility(0);
                    }
                    f((fau) fbjVar);
                    b(fbjVar);
                }
            }
            return true;
        } catch (Exception e) {
            i.a("Detail-VesselVH", "VessleView bindData异常", e);
            Activity activity = this.g;
            eps.a(activity, "Page_Detail", 12345, "Page_Detail-Monitor", null, null, "在bindData中捕获异常:" + e.getMessage());
            Activity activity2 = this.g;
            String str = this.y;
            if (str == null) {
                str = "";
            }
            String str2 = this.s;
            if (str2 == null) {
                str2 = "";
            }
            ecg.d(activity2, str, str2, "", "在bindData中捕获异常:" + e.getMessage());
            f();
            return false;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        VesselView vesselView = this.q;
        if (vesselView != null) {
            vesselView.onDestroy();
        }
        this.g = null;
        super.a();
    }

    private void f(fbj fbjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c88d6f", new Object[]{this, fbjVar});
        } else if (this.j == null || fbjVar.x) {
        } else {
            f.a(this.g, this.j);
            fbjVar.x = true;
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.p.setVisibility(8);
        } else if (i == 1) {
            this.p.setVisibility(0);
        } else if (i == 2) {
            this.p.setVisibility(8);
        } else {
            this.p.setVisibility(8);
        }
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.q.setLayoutParams(new FrameLayout.LayoutParams(-1, this.v));
            this.p.setLayoutParams(new AbsListView.LayoutParams(-1, this.v));
            this.p.setVisibility(0);
            this.p.requestLayout();
            c();
        } else if (i == 1) {
            this.q.setLayoutParams(new FrameLayout.LayoutParams(-1, this.v));
            this.p.setLayoutParams(new AbsListView.LayoutParams(-1, this.v));
            this.p.setVisibility(0);
            this.p.requestLayout();
            c();
        } else if (i == 2) {
            this.q.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            this.p.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
            this.p.setVisibility(8);
            this.p.requestLayout();
        } else {
            this.p.setVisibility(8);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.q == null) {
            this.q = new VesselView(this.g);
        }
        this.q.setAlpha(1.0f);
        this.q.setBackgroundColor(-1);
        if (!StringUtils.isEmpty(this.z.f27747a)) {
            this.q.setLayoutParams(new FrameLayout.LayoutParams(-1, this.v));
        }
        this.q.setVesselViewCallback(new rgw() { // from class: tb.fau.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgw
            public void a(Map<String, Object> map, a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
                } else {
                    fau.a(fau.this, map, aVar);
                }
            }
        });
        this.q.setDowngradeEnable(false);
    }

    private void a(Map<String, Object> map, a aVar) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
        } else if (map == null || !map.containsKey(k) || (obj = map.get(k)) == null || !(obj instanceof String)) {
        } else {
            String str = (String) obj;
            if (m.equals(str)) {
                e();
                aVar.invoke(new HashMap());
            }
            if (n.equals(str)) {
                f();
            }
            if (!o.equals(str) || !map.containsKey(l) || (obj2 = map.get(l)) == null || !(obj2 instanceof String)) {
                return;
            }
            b((String) obj2);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.p;
        if (frameLayout == null || frameLayout.getVisibility() == 0) {
            return;
        }
        this.q.setLayoutParams(new FrameLayout.LayoutParams(-1, this.v));
        this.p.setLayoutParams(new AbsListView.LayoutParams(-1, this.v));
        this.p.setVisibility(0);
        this.p.requestLayout();
        c();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.q.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        this.p.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        this.p.setVisibility(8);
        this.p.requestLayout();
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            a(str);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            c(this.w);
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.p.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        this.p.setVisibility(8);
        this.p.requestLayout();
        i.a("Detail-VesselVH", "load desc weex component error." + str);
        if (str != null) {
            i.a("Detail-VesselVH", "Error code == " + str);
        }
        if (str2 != null) {
            i.a("Detail-VesselVH", "Error code == " + str);
        } else {
            str2 = "";
        }
        if (str3 != null) {
            i.a("Detail-VesselVH", "Error errorInfo == " + str3);
        }
        String str4 = this.t;
        n.b("LoadWeexVesselJSBundle", str4, "80008", "Load Vessel JS bundle error" + str2);
        Activity activity = this.g;
        String str5 = this.y;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = this.s;
        if (str6 == null) {
            str6 = "";
        }
        ecg.d(activity, str5, str6, str, "Load Vessel JS bundle error:" + str2);
    }

    private void a(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else {
            this.p.post(new Runnable() { // from class: tb.fau.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        fau.a(fau.this, str, str2, str3, str4);
                    }
                }
            });
        }
    }

    private void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.p.setVisibility(8);
        final VesselType a2 = com.taobao.vessel.utils.b.a(str2);
        if (a2.equals(VesselType.Web)) {
            Integer num = 1;
            a(num.toString(), "URL_ERROR", "vessel cannot load web");
            return;
        }
        new jxl(this.p.getContext().getApplicationContext(), str, str3, com.taobao.vessel.utils.b.c(str2), new d() { // from class: tb.fau.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weexdownloader.downloader.d
            public void a(final String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str5});
                } else {
                    fau.a(fau.this).post(new Runnable() { // from class: tb.fau.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            Integer num2;
                            String str6;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            Integer.valueOf(0);
                            if ("md5CheckFail".equals(str5)) {
                                num2 = 3;
                                str6 = "FILE_VALIDATE_MD5";
                            } else {
                                num2 = 2;
                                str6 = "FILE_DOWNLOAD";
                            }
                            fau.a(fau.this, num2.toString(), str6, str5);
                        }
                    });
                }
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [tb.fau$3$2] */
            @Override // com.taobao.android.weexdownloader.downloader.d
            public void a(final File file) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8a979fdf", new Object[]{this, file});
                } else {
                    new AsyncTask<Object, Object, String>() { // from class: tb.fau.3.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                        @Override // android.os.AsyncTask
                        public /* synthetic */ String doInBackground(Object[] objArr) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
                        }

                        @Override // android.os.AsyncTask
                        public /* synthetic */ void onPostExecute(String str5) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("b105c779", new Object[]{this, str5});
                            } else {
                                a(str5);
                            }
                        }

                        public String a(Object[] objArr) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return (String) ipChange3.ipc$dispatch("2583e9f7", new Object[]{this, objArr});
                            }
                            String a3 = k.a(file.getPath());
                            if (a3 == null) {
                                k.c(file.getPath());
                            }
                            return a3;
                        }

                        public void a(String str5) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f3a64c32", new Object[]{this, str5});
                            } else if (str5 == null) {
                                Integer num2 = 4;
                                fau.a(fau.this, num2.toString(), "FILE_READ", "read file error");
                            } else if (fau.b(fau.this) == null || fau.a(fau.this) == null) {
                            } else {
                                fau.b(fau.this).loadData(a2, str5, fau.c(fau.this));
                                if (fau.b(fau.this).getParent() == null) {
                                    fau.a(fau.this).addView(fau.b(fau.this));
                                }
                                fau.d(fau.this);
                            }
                        }
                    }.execute(new Object[0]);
                }
            }
        }).a();
    }

    private HashMap<String, Object> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5a3abb14", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm", this.u);
        hashMap.put("sellerId", this.x);
        hashMap.put("itemId", this.y);
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("bundleUrl", a(this.s, hashMap));
        return hashMap2;
    }

    private String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{this, str, map});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        if (map != null && map.size() > 0) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            sb.append("?");
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                sb.append(next.getKey());
                sb.append("=");
                sb.append(next.getValue());
                if (it.hasNext()) {
                    sb.append("&");
                }
            }
        }
        String sb2 = sb.toString();
        String[] split = sb2.split("_wx_tpl=");
        return (split == null || split.length < 2) ? sb2 : split[1];
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(this.s)) {
        } else {
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str);
            uTCustomHitBuilder.setEventPage("Page_Detail");
            uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_EVENT_ID, "2101");
            String str2 = this.y;
            if (StringUtils.isEmpty(str2)) {
                str2 = "";
            }
            uTCustomHitBuilder.setProperty("item_id", str2);
            String str3 = this.x;
            if (StringUtils.isEmpty(str3)) {
                str3 = "";
            }
            uTCustomHitBuilder.setProperty("seller_id", str3);
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            f(this.z);
        }
    }
}
