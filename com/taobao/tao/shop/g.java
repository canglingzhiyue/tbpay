package com.taobao.tao.shop;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.nav.Nav;
import com.taobao.tao.shop.fetcher.adapter.b;
import com.taobao.tao.shop.track.a;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.kge;
import tb.mbn;
import tb.ouu;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f21086a;
    private final c b = new c() { // from class: com.taobao.tao.shop.g.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.shop.c
        public void a(TBShopPageType tBShopPageType, final String str, final Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d6fbf59", new Object[]{this, tBShopPageType, str, bundle});
                return;
            }
            int i = AnonymousClass4.f21091a[tBShopPageType.ordinal()];
            if (i == 1 || i == 2) {
                new Handler(e.b.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.tao.shop.g.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (b.a().p()) {
                            Nav.from(e.b).withExtras(bundle).withCategory(mbn.BROWSER_ONLY_CATEGORY).toUri(Uri.parse(str).buildUpon().appendQueryParameter(d.SHOP_RULE_PROCESSED, "true").build().toString());
                        } else {
                            Nav.from(e.b).withExtras(bundle).withCategory(mbn.BROWSER_ONLY_CATEGORY).toUri(str);
                        }
                    }
                }, 50L);
            } else if (i != 3) {
                if (b.a().p()) {
                    Nav.from(e.b).withExtras(bundle).toUri(Uri.parse(str).buildUpon().appendQueryParameter(d.SHOP_RULE_PROCESSED, "true").build().toString());
                } else {
                    Nav.from(e.b).withExtras(bundle).toUri(str);
                }
            } else {
                if (com.taobao.tao.shop.rule.util.c.b(str)) {
                    str = f.a(str);
                    ouu.a("weex shop processed url is " + str);
                }
                Nav.from(e.b).withExtras(bundle).toUri(str);
            }
        }
    };
    private final a c = new a() { // from class: com.taobao.tao.shop.g.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.shop.track.a
        public void a(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            } else if (TextUtils.isEmpty(str)) {
            } else {
                try {
                    long parseLong = Long.parseLong(str2);
                    String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
                    HashMap hashMap = new HashMap();
                    hashMap.put(com.taobao.flowcustoms.afc.utils.b.AFC_ID, globalProperty);
                    if (b.a().q()) {
                        AlimamaAdvertising.instance().commitTaokeInfo(str, parseLong, 0L, z, hashMap);
                    } else {
                        AlimamaAdvertising.instance().commitTaokeInfo(str, parseLong, 0L, z);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    };

    /* renamed from: com.taobao.tao.shop.g$4  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21091a = new int[TBShopPageType.values().length];

        static {
            try {
                f21091a[TBShopPageType.SHOP_PAGE_FORCE_H5_BROWSER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21091a[TBShopPageType.SHOP_PAGE_SUPERMARKET_OLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21091a[TBShopPageType.SHOP_PAGE_NEW_HOME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ c a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b7140f72", new Object[]{gVar}) : gVar.b;
    }

    static {
        kge.a(1489955403);
        f21086a = new g();
    }

    private g() {
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("145c42cb", new Object[0]) : f21086a;
    }

    public void a(Application application, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcae9f58", new Object[]{this, application, str, str2, new Integer(i)});
            return;
        }
        com.taobao.tao.shop.rule.b.a();
        e.a(application, str2, i, com.taobao.tao.shop.rule.b.b());
        d.a(application).a(this.c);
        TBSRCtx.INSTANCE.setRouterMonitor(new com.taobao.tao.shop.track.c().a(new com.taobao.tao.shop.track.d(), new com.taobao.tao.shop.track.f()));
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : e.f21073a;
    }

    public boolean a(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d63e1d0", new Object[]{this, str, str2, context})).booleanValue();
        }
        d a2 = d.a(context);
        a2.a(this.b);
        return a2.a(str, str2, context);
    }

    public boolean a(String str, String str2, Context context, final com.taobao.tao.shop.common.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c7e6728", new Object[]{this, str, str2, context, bVar})).booleanValue();
        }
        d a2 = d.a(context);
        a2.a(new c() { // from class: com.taobao.tao.shop.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.shop.c
            public void a(TBShopPageType tBShopPageType, String str3, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8d6fbf59", new Object[]{this, tBShopPageType, str3, bundle});
                    return;
                }
                g.a(g.this).a(tBShopPageType, str3, bundle);
                com.taobao.tao.shop.common.b bVar2 = bVar;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a();
            }
        });
        return a2.a(str, str2, context);
    }
}
