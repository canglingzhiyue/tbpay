package com.taobao.android.navigationextern;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.navigationextern.e;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.NavigationTabIconSourceType;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.e;
import com.taobao.tao.navigation.g;
import com.taobao.tao.navigation.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.esk;
import tb.esm;
import tb.gjb;
import tb.hur;
import tb.hut;
import tb.huw;
import tb.qpe;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context m;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f14463a = new AtomicBoolean(false);
    private boolean e = false;
    private boolean f = false;
    private boolean b = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private final esm k = new esm();
    private final qpe c = new qpe();
    private final e.a d = new e.a() { // from class: com.taobao.android.navigationextern.d.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.navigationextern.e.a
        public void a(Context context, Intent intent, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be9d935d", new Object[]{this, context, intent, new Boolean(z), new Boolean(z2)});
                return;
            }
            boolean a2 = d.a(d.this);
            boolean b = d.b(d.this);
            if (a2 || b) {
                d.a(d.this, true);
                com.taobao.tao.navigation.e.a();
                hut.b("NavEInternal", "notifyStyleChanged");
                d.a();
            } else if (!d.c(d.this)) {
            } else {
                com.taobao.tao.navigation.e.a();
                hut.b("NavEInternal", "notifyStyleChanged");
            }
        }
    };
    private final e.b l = new e.b() { // from class: com.taobao.android.navigationextern.d.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.navigation.e.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!e.h()) {
                hut.b("NavEInternal", "cancel notifyStyleChanged, switch off.");
            } else if (!d.a(d.this) && !d.d(d.this)) {
            } else {
                com.taobao.tao.navigation.e.a();
                hut.b("NavEInternal", ", notifyStyleChanged. ");
            }
        }

        @Override // com.taobao.tao.navigation.e.b
        public void a(int i, g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbdbb25a", new Object[]{this, new Integer(i), gVar});
            } else if (!e.h()) {
                hut.b("NavEInternal", " cancel cache, switch off.");
            } else if (gVar == null) {
                if (hur.a().a(i) == null) {
                    return;
                }
                hur.a().a(String.valueOf(i));
                d.a(d.this, false);
            } else {
                hur.a().a(i, gVar);
                d.e(d.this);
            }
        }
    };

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            c();
        }
    }

    public static /* synthetic */ void a(d dVar, List list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a732766", new Object[]{dVar, list, new Boolean(z)});
        } else {
            dVar.a(list, z);
        }
    }

    public static /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e113c37", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.c(z);
        }
    }

    public static /* synthetic */ boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fcd73e41", new Object[]{dVar})).booleanValue() : dVar.g();
    }

    public static /* synthetic */ List b(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4aaf8c8f", new Object[]{dVar, new Boolean(z)}) : dVar.a(z);
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            n();
        }
    }

    public static /* synthetic */ boolean b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bfc3a7a0", new Object[]{dVar})).booleanValue() : dVar.e();
    }

    public static /* synthetic */ boolean c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("82b010ff", new Object[]{dVar})).booleanValue() : dVar.i();
    }

    public static /* synthetic */ boolean d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("459c7a5e", new Object[]{dVar})).booleanValue() : dVar.h();
    }

    public static /* synthetic */ void e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888e3b9", new Object[]{dVar});
        } else {
            dVar.m();
        }
    }

    public static /* synthetic */ Context f(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c831e410", new Object[]{dVar}) : dVar.m;
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        TBFragmentTabHost c = com.taobao.tao.navigation.e.c();
        if (c == null) {
            return;
        }
        int currentTab = c.getCurrentTab();
        c.clearAllTabsWithoutFramgent(1);
        c.updateTabHost();
        c.setCurrentTab(currentTab);
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (!this.f14463a.compareAndSet(false, true)) {
        } else {
            this.m = context;
            huw.b();
            if (e.b(context)) {
                l();
            } else {
                k();
            }
            e.a(context, this.d);
            com.taobao.tao.navigation.e.a(new e.d() { // from class: com.taobao.android.navigationextern.d.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.navigation.e.d
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.a(d.this, false);
                    }
                }
            });
            com.taobao.tao.navigation.e.a(this.l);
            this.k.a(context);
            this.k.a();
            esk.a(this.k);
            this.c.a();
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (this.g != e.d()) {
            this.g = e.d();
            return true;
        } else if (this.e != e.e()) {
            this.e = e.e();
            return true;
        } else if (this.f != e.a(this.m)) {
            this.f = e.a(this.m);
            return true;
        } else if (this.h == e.b()) {
            return false;
        } else {
            this.h = e.b();
            return true;
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.b == b.c()) {
            return false;
        }
        this.b = b.c();
        return true;
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        boolean c = e.c();
        if (c == this.i) {
            return false;
        }
        this.i = c;
        return true;
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        boolean a2 = e.a();
        if (a2 == this.j) {
            return false;
        }
        this.j = a2;
        return true;
    }

    private List<f> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(f.CATEGORY_TAB_EN);
        arrayList.add(f.SEARCH_TAB);
        return arrayList;
    }

    private List<f> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2462edc", new Object[]{this, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        if (LocationHelper.c(this.m)) {
            if (e.a(this.m)) {
                if (z) {
                    this.f = true;
                }
                if (com.taobao.oversea.category.a.a()) {
                    arrayList.add(f.CATEGORY_TAB_CH);
                } else {
                    arrayList.add(f.DISCOVERY_TAB);
                }
            } else {
                if (z) {
                    this.f = false;
                }
                arrayList.add(f.DefaultGuangGuangTab);
            }
        } else {
            if (z) {
                this.e = true;
            }
            arrayList.add(f.DefaultGuangGuangTab);
        }
        if (e.d()) {
            if (z) {
                this.g = true;
            }
            arrayList.add(f.NEW_TB_MAIN_TAB);
        } else {
            if (z) {
                this.g = false;
            }
            arrayList.add(f.DEFAULT_TB_MAIN_TAB);
        }
        if (z) {
            this.h = e.b();
        }
        arrayList.add(f.DefaultMessageTab);
        return arrayList;
    }

    private List<f> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("95ad395b", new Object[]{this, new Boolean(z)});
        }
        if (b.c()) {
            return d();
        }
        return b(z);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            hur.a().a(this.m);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.android.navigationextern.d.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    hur.a().a(d.f(d.this));
                    final List b = d.b(d.this, true);
                    new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.navigationextern.d.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                            if (str.hashCode() == 673877017) {
                                super.handleMessage((Message) objArr[0]);
                                return null;
                            }
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        }

                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("282a8c19", new Object[]{this, message});
                                return;
                            }
                            super.handleMessage(message);
                            if (message.what != 0) {
                                return;
                            }
                            d.a(d.this, b, e.e());
                            d.b();
                            d.a();
                        }
                    }.sendEmptyMessage(0);
                }
            });
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        b(context);
        if (e.b(context)) {
            return;
        }
        c(true);
        n();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!e.h()) {
            hut.b("NavEInternal", "refreshGuangGuangTab cancel, switch off.");
        } else if (this.h || this.f) {
            hut.b("NavEInternal", "refreshGuangGuangTab failed; cntIsElder: " + this.h + " cntIsNewDiscovery: " + this.f);
        } else {
            f a2 = hur.a().a(1);
            g c = com.taobao.tao.navigation.e.c(1);
            if (c == null) {
                hut.b("NavEInternal", "guangguang tab is null");
                return;
            }
            if (a2 != null) {
                if (!e.c()) {
                    hur.b a3 = hur.a().a(a2);
                    if (a3 != null && a3.f28800a != null && a3.b != null) {
                        c.a(NavigationTabIconSourceType.LOCALCACHEDDRAWABLE);
                        c.a(a3.f28800a);
                        c.b(a3.b);
                        hut.b("NavEInternal", "setDrawable");
                    } else {
                        hut.b("NavEInternal", "iconInfo is null");
                    }
                }
                c.a(a2.b());
                hut.b("NavEInternal", "guangguang TabConfig tab is not null");
            }
            com.taobao.tao.navigation.e.d(1, c);
        }
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        List<f> a2 = a(z);
        if (a2.isEmpty()) {
            return;
        }
        a(a2, e.e());
    }

    private void a(List<f> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
            return;
        }
        if (e.d() && !list.contains(f.NEW_TB_MAIN_TAB)) {
            list.add(f.NEW_TB_MAIN_TAB);
        }
        ArrayList<g> e = com.taobao.tao.navigation.e.e();
        a(e);
        for (f fVar : list) {
            int a2 = fVar.a();
            g gVar = e.get(a2);
            if (!TextUtils.equals(fVar.i(), gVar.t())) {
                gVar.e("0");
            }
            gVar.a(fVar.b());
            gVar.b(fVar.f());
            gVar.c(fVar.g());
            gVar.d(fVar.h());
            gVar.g(fVar.i());
            gVar.d(fVar.o());
            HashMap hashMap = new HashMap();
            hashMap.put("spm-url", fVar.j());
            gVar.a((Map<String, String>) hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("pageName", fVar.k());
            hashMap2.put("controlName", fVar.l());
            gVar.b(hashMap2);
            gVar.h(fVar.p());
            e.set(a2, gVar);
            if ((TextUtils.isEmpty(FestivalMgr.a().a("global", "tabbarImagesURL_we")) || "true".equals(gjb.g(gjb.SP_KEY_DEFAULT_CUSTOMER_AREA_SKIN)) || "ing".equals(gjb.g(gjb.SP_KEY_DEFAULT_CUSTOMER_AREA_SKIN))) && !z) {
                a(fVar, gVar);
            } else if (z && !e.c()) {
                a(fVar, gVar);
            }
            com.taobao.tao.navigation.e.b(a2, gVar);
        }
        c(e);
        b(e);
        m();
        k.a(e);
        this.k.a();
    }

    private void a(List<g> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (!e.c()) {
            for (int i = 0; i < list.size(); i++) {
                g gVar = list.get(i);
                gVar.a(NavigationTabIconSourceType.DRAWABLE);
                gVar.a(f.DEFAULT_TAB_BAR_CONFIG.get(i));
                com.taobao.tao.navigation.e.b(i, gVar);
            }
        }
    }

    private void b(List<g> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            g gVar = list.get(i);
            Integer num = f.NONE_CHANGED_TAB_BAR_TITLE_CONFIG.get(gVar.y());
            if (num != null) {
                String a2 = b.a(num.intValue());
                if (!TextUtils.isEmpty(a2)) {
                    gVar.a(a2);
                    com.taobao.tao.navigation.e.b(i, gVar);
                }
            }
        }
    }

    private void c(List<g> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        if (e.b()) {
            d(list);
        }
        if (!e.o()) {
            return;
        }
        e(list);
    }

    private void a(List<g> list, List<Pair> list2, NavigationTabIconSourceType navigationTabIconSourceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b0d883", new Object[]{this, list, list2, navigationTabIconSourceType});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            g gVar = list.get(i);
            gVar.a(navigationTabIconSourceType);
            gVar.a(list2.get(i));
            com.taobao.tao.navigation.e.b(i, gVar);
        }
    }

    private void d(List<g> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd009dc", new Object[]{this, list});
        } else {
            a(list, f.ELDER_HOME_TAB_BAR_CONFIG, NavigationTabIconSourceType.DRAWABLE);
        }
    }

    private void e(List<g> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f968ff5d", new Object[]{this, list});
        } else {
            a(list, f.I18N_TAB_BAR_CONFIG, NavigationTabIconSourceType.DRAWABLE);
        }
    }

    private void a(f fVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52325afa", new Object[]{this, fVar, gVar});
            return;
        }
        int e = fVar.e();
        if (e == 0) {
            gVar.a(NavigationTabIconSourceType.DRAWABLE);
            gVar.a(new Pair(fVar.c(), fVar.d()));
        } else if (e == 1) {
            gVar.a(NavigationTabIconSourceType.DRAWABLE2);
        } else if (e != 2) {
        } else {
            Drawable a2 = a((String) fVar.c());
            Drawable a3 = a((String) fVar.d());
            if (a3 == null || a2 == null) {
                gVar.a(NavigationTabIconSourceType.URL);
                gVar.a(new Pair(fVar.c(), fVar.d()));
                return;
            }
            gVar.a(NavigationTabIconSourceType.DRAWABLE2);
            gVar.b(a2);
            gVar.a(a3);
        }
    }

    public Drawable a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("c99d6048", new Object[]{this, str});
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile != null) {
            return new BitmapDrawable(decodeFile);
        }
        return null;
    }

    private static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[0]);
            return;
        }
        String i = e.i();
        if (i == null) {
            return;
        }
        try {
            String a2 = com.taobao.tao.navigation.a.a();
            TLog.loge(a2, "NavEInternal", "set color; color str:" + i);
            int parseColor = Color.parseColor(i);
            com.taobao.tao.navigation.e.a(Integer.valueOf(parseColor));
            String a3 = com.taobao.tao.navigation.a.a();
            TLog.loge(a3, "NavEInternal", "set color; color int:" + parseColor);
        } catch (Exception unused) {
            String a4 = com.taobao.tao.navigation.a.a();
            TLog.loge(a4, "NavEInternal", "parse color failed; color str:" + i);
        }
    }
}
