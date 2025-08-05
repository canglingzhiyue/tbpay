package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.detail.ttdetail.utils.ai;
import com.taobao.android.detail.ttdetail.utils.bf;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.utils.VesselType;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import tb.jxl;
import tb.kge;
import tb.rgw;

/* loaded from: classes5.dex */
public class w extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.w> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_Detail";
    public static final String UT_SHOW_ARG1 = "Page_Detail_Show_ProductDetail";
    public static final String WX_OPTIONS_KEY = "bundleUrl";
    public static String g;
    public static String h;
    public static String i;
    public static String j;
    public static String k;
    private FrameLayout l;
    private VesselView m;
    private String n;
    private String o;
    private String p;
    private String q;
    private int r;
    private int s;
    private String t;
    private String u;
    private com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.w v;
    private Handler w;
    private a x;
    private Future<String> y;
    private b z;

    public static /* synthetic */ Object ipc$super(w wVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ FrameLayout a(w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("d9b5b536", new Object[]{wVar}) : wVar.l;
    }

    public static /* synthetic */ a a(w wVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("357648e9", new Object[]{wVar, aVar});
        }
        wVar.x = aVar;
        return aVar;
    }

    public static /* synthetic */ Future a(w wVar, Future future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("3abe3999", new Object[]{wVar, future});
        }
        wVar.y = future;
        return future;
    }

    public static /* synthetic */ void a(w wVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587b4361", new Object[]{wVar, str, str2, str3});
        } else {
            wVar.a(str, str2, str3);
        }
    }

    public static /* synthetic */ void a(w wVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a4b6eb", new Object[]{wVar, str, str2, str3, str4});
        } else {
            wVar.b(str, str2, str3, str4);
        }
    }

    public static /* synthetic */ void a(w wVar, Map map, com.taobao.vessel.base.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b27ce8", new Object[]{wVar, map, aVar});
        } else {
            wVar.a(map, aVar);
        }
    }

    public static /* synthetic */ a b(w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3c6cb60", new Object[]{wVar}) : wVar.x;
    }

    public static /* synthetic */ Handler c(w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("e1f319a5", new Object[]{wVar}) : wVar.w;
    }

    public static /* synthetic */ VesselView d(w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("adee8204", new Object[]{wVar}) : wVar.m;
    }

    public static /* synthetic */ HashMap e(w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("dd6528e2", new Object[]{wVar}) : wVar.i();
    }

    public static /* synthetic */ void f(w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc5da1e", new Object[]{wVar});
        } else {
            wVar.h();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, wVar})).booleanValue() : c2(wVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, wVar}) : a2(wVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean e(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9ca61027", new Object[]{this, wVar})).booleanValue() : d(wVar);
    }

    static {
        kge.a(-1259878488);
        g = "method";
        h = Constants.KEY_CONTROL;
        i = "show";
        j = "hide";
        k = "click";
    }

    public w(Context context) {
        super(context);
        this.p = "1";
        this.s = 0;
        this.w = new Handler(Looper.getMainLooper());
        this.l = new FrameLayout(context);
    }

    /* renamed from: e  reason: avoid collision after fix types in other method */
    private void e2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cae3ed1", new Object[]{this, wVar});
            return;
        }
        this.r = com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a, wVar.f);
        this.p = wVar.b;
        this.s = wVar.e;
        this.q = wVar.d;
        this.n = wVar.c;
        this.o = wVar.f10897a;
        this.t = wVar.h;
        this.u = wVar.g;
        this.v = wVar;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4ac5b2cf", new Object[]{this, wVar});
        }
        this.l.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        a(this.s);
        this.l.requestLayout();
        return this.l;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a3be8e", new Object[]{this, wVar});
        } else if (wVar == null) {
        } else {
            try {
                e2(wVar);
                d();
                a(this.p, this.o, this.n, this.p);
            } catch (Exception unused) {
                g();
            }
        }
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3551e953", new Object[]{this, wVar})).booleanValue() : TextUtils.isEmpty(wVar.f10897a);
    }

    public boolean d(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69001414", new Object[]{this, wVar})).booleanValue();
        }
        try {
            this.v = wVar;
            if (this.d != null && this.v != null) {
                if (c2(wVar)) {
                    this.d.setVisibility(8);
                } else {
                    if (this.d.getVisibility() == 8) {
                        this.d.setVisibility(0);
                    }
                    f((w) wVar);
                    b(wVar);
                }
            }
            return true;
        } catch (Exception unused) {
            g();
            return false;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.y != null) {
                this.y.cancel(true);
            }
            this.z = null;
            if (this.x != null) {
                this.w.removeCallbacks(this.x);
                this.x = null;
            }
            if (this.m != null) {
                this.m.onDestroy();
            }
            this.f10821a = null;
        } catch (Exception e) {
            com.taobao.android.detail.ttdetail.utils.i.a("Detail-VesselVH", "VessleView onDestroy异常", e);
        }
        super.b();
    }

    private void f(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05c6992", new Object[]{this, wVar});
        } else if (this.e == null || wVar.o) {
        } else {
            com.taobao.android.detail.ttdetail.communication.c.a(this.f10821a, this.e);
            wVar.o = true;
        }
    }

    private void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
        } else if (i2 == 0) {
            this.l.setVisibility(8);
        } else if (i2 == 1) {
            this.l.setVisibility(0);
        } else if (i2 == 2) {
            this.l.setVisibility(8);
        } else {
            this.l.setVisibility(8);
        }
    }

    private void c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i2)});
        } else if (i2 == 0) {
            this.m.setLayoutParams(new FrameLayout.LayoutParams(-1, this.r));
            this.l.setLayoutParams(new AbsListView.LayoutParams(-1, this.r));
            this.l.setVisibility(0);
            this.l.requestLayout();
            c();
        } else if (i2 == 1) {
            this.m.setLayoutParams(new FrameLayout.LayoutParams(-1, this.r));
            this.l.setLayoutParams(new AbsListView.LayoutParams(-1, this.r));
            this.l.setVisibility(0);
            this.l.requestLayout();
            c();
        } else if (i2 == 2) {
            this.m.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            this.l.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
            this.l.setVisibility(8);
            this.l.requestLayout();
        } else {
            this.l.setVisibility(8);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.m == null) {
            this.m = new VesselView(this.f10821a);
        }
        this.m.setAlpha(1.0f);
        this.m.setBackgroundColor(-1);
        if (!TextUtils.isEmpty(this.v.f10897a)) {
            this.m.setLayoutParams(new FrameLayout.LayoutParams(-1, this.r));
        }
        this.m.setVesselViewCallback(new rgw() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.w.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgw
            public void a(Map<String, Object> map, com.taobao.vessel.base.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
                } else {
                    w.a(w.this, map, aVar);
                }
            }
        });
        this.m.setDowngradeEnable(false);
    }

    private void a(Map<String, Object> map, com.taobao.vessel.base.a aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
        } else if (map == null || !map.containsKey(g) || (obj = map.get(g)) == null || !(obj instanceof String)) {
        } else {
            String str = (String) obj;
            if (i.equals(str)) {
                f();
                aVar.invoke(new HashMap());
            }
            if (j.equals(str)) {
                g();
            }
            if (!k.equals(str) || !map.containsKey(h)) {
                return;
            }
            map.get(h);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.l;
        if (frameLayout == null || frameLayout.getVisibility() == 0) {
            return;
        }
        this.m.setLayoutParams(new FrameLayout.LayoutParams(-1, this.r));
        this.l.setLayoutParams(new AbsListView.LayoutParams(-1, this.r));
        this.l.setVisibility(0);
        this.l.requestLayout();
        c();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.m.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        this.l.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        this.l.setVisibility(8);
        this.l.requestLayout();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            c(this.s);
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.l.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        this.l.setVisibility(8);
        this.l.requestLayout();
        com.taobao.android.detail.ttdetail.utils.i.a("Detail-VesselVH", "load desc weex component error." + str);
        if (str != null) {
            com.taobao.android.detail.ttdetail.utils.i.a("Detail-VesselVH", "Error code == " + str);
        }
        if (str2 != null) {
            com.taobao.android.detail.ttdetail.utils.i.a("Detail-VesselVH", "Error code == " + str);
        }
        if (str3 == null) {
            return;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("Detail-VesselVH", "Error errorInfo == " + str3);
    }

    private void a(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else {
            this.l.post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.w.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (w.this.f10821a == null) {
                    } else {
                        w.a(w.this, str, str2, str3, str4);
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
        this.l.setVisibility(8);
        VesselType a2 = com.taobao.vessel.utils.b.a(str2);
        if (a2.equals(VesselType.Web)) {
            Integer num = 1;
            a(num.toString(), "URL_ERROR", "vessel cannot load web");
            return;
        }
        this.z = new b(a2);
        new jxl(y.a(this.l).getApplicationContext(), str, str3, com.taobao.vessel.utils.b.c(str2), this.z).a();
    }

    /* loaded from: classes5.dex */
    public class b extends com.taobao.android.weexdownloader.downloader.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private VesselType b;

        static {
            kge.a(-452233138);
        }

        public static /* synthetic */ VesselType a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (VesselType) ipChange.ipc$dispatch("256d56c", new Object[]{bVar}) : bVar.b;
        }

        public b(VesselType vesselType) {
            this.b = vesselType;
        }

        @Override // com.taobao.android.weexdownloader.downloader.d
        public void a(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                w.a(w.this).post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.w.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        Integer num;
                        String str2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (w.this.f10821a == null) {
                        } else {
                            Integer.valueOf(0);
                            if ("md5CheckFail".equals(str)) {
                                num = 3;
                                str2 = "FILE_VALIDATE_MD5";
                            } else {
                                num = 2;
                                str2 = "FILE_DOWNLOAD";
                            }
                            w.a(w.this, num.toString(), str2, str);
                        }
                    }
                });
            }
        }

        @Override // com.taobao.android.weexdownloader.downloader.d
        public void a(final File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
            } else {
                w.a(w.this, bf.a(new Callable<String>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.w.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
                    @Override // java.util.concurrent.Callable
                    public /* synthetic */ String call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
                    }

                    public String a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this});
                        }
                        String str = null;
                        try {
                            str = ai.a(file.getPath());
                            if (str == null) {
                                ai.c(file.getPath());
                            }
                            w.a(w.this, new a(str, b.a(b.this)));
                            w.c(w.this).post(w.b(w.this));
                        } catch (Exception e) {
                            com.taobao.android.detail.ttdetail.utils.i.a("Detail-VesselVH", "load desc weex component error.", e);
                        }
                        return str;
                    }
                }));
            }
        }
    }

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private VesselType c;

        static {
            kge.a(51546610);
            kge.a(-1390502639);
        }

        public a(String str, VesselType vesselType) {
            this.b = str;
            this.c = vesselType;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (w.this.f10821a == null) {
            } else {
                if (this.b == null) {
                    Integer num = 4;
                    w.a(w.this, num.toString(), "FILE_READ", "read file error");
                } else if (w.d(w.this) == null || w.a(w.this) == null) {
                } else {
                    w.d(w.this).loadData(this.c, this.b, w.e(w.this));
                    if (w.d(w.this).getParent() == null) {
                        w.a(w.this).addView(w.d(w.this));
                    }
                    w.f(w.this);
                }
            }
        }
    }

    private HashMap<String, Object> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("100921d3", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm", this.q);
        hashMap.put("sellerId", this.t);
        hashMap.put("itemId", this.u);
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("bundleUrl", a(this.o, hashMap));
        return hashMap2;
    }

    private String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{this, str, map});
        }
        if (TextUtils.isEmpty(str)) {
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

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            f(this.v);
        }
    }
}
