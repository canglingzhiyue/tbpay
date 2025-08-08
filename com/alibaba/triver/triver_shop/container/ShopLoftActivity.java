package com.alibaba.triver.triver_shop.container;

import android.app.ActionBar;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.Group;
import android.support.constraint.Guideline;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.cache.d;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVAccountService;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.c;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.container.shopLoft.e;
import com.alibaba.triver.triver_shop.newShop.ext.b;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.manager.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.a;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.share.business.ShareContent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.t;
import org.android.agoo.common.AgooConstants;
import tb.ceg;
import tb.cen;
import tb.dlx;
import tb.fmg;
import tb.hyt;
import tb.kge;
import tb.nmf;
import tb.qzp;
import tb.rmx;
import tb.ruk;

/* loaded from: classes3.dex */
public class ShopLoftActivity extends FragmentActivity implements View.OnClickListener, dlx, fmg, qzp, rmx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SHARE_URL_BASE = "https://m.taobao.com/app/shop-conainer/contentlistpage.html";
    public static final String KEY_SHOP_LOFT_BROADCAST_EVENT = "shop_loft_event";
    private static final int[] c;
    private static final g<ShopLoftActivity> d;
    private e e = null;
    private FrameLayout f = null;
    private Guideline g = null;
    private Guideline h = null;
    private ImageView i = null;
    private ImageView j = null;
    private TextView k = null;
    private ViewGroup l = null;
    private TUrlImageView m = null;
    private TextView n = null;
    private TUrlImageView o = null;
    private TextView p = null;
    private TextView q = null;
    private ViewGroup r = null;
    private ImageView s = null;
    private ImageView t = null;
    private ViewGroup u = null;
    private Group v = null;
    private Group w = null;
    private TBPublicMenu x = null;
    private String y = null;
    private String z = null;
    private String A = null;
    private String B = null;
    private String C = null;
    private String D = null;
    private String E = null;
    private boolean F = false;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private boolean J = false;
    private boolean K = false;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3684a = cen.Companion.T();
    public boolean b = cen.Companion.U();
    private Set<fmg> Q = new HashSet();
    private Set<dlx> R = new HashSet();
    private e.c L = new e.c() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.e.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                ShopLoftActivity.b(ShopLoftActivity.this);
            }
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.e.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            if (!ShopLoftActivity.c(ShopLoftActivity.this).n()) {
                o.e(ShopLoftActivity.d(ShopLoftActivity.this));
            }
            ShopLoftActivity.e(ShopLoftActivity.this).setVisibility(8);
            ShopLoftActivity.f(ShopLoftActivity.this).setVisibility(8);
            ShopLoftActivity.g(ShopLoftActivity.this).setVisibility(8);
            ShopLoftActivity.h(ShopLoftActivity.this).setVisibility(0);
            ShopLoftActivity.b(ShopLoftActivity.this, true);
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.e.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            if (!ShopLoftActivity.c(ShopLoftActivity.this).n()) {
                o.e(ShopLoftActivity.d(ShopLoftActivity.this));
            }
            if (ShopLoftViewManager.TYPE_NEW_DETAIL.equals(str)) {
                ShopLoftActivity.h(ShopLoftActivity.this).setVisibility(8);
                ShopLoftActivity.e(ShopLoftActivity.this).setVisibility(8);
                ShopLoftActivity.f(ShopLoftActivity.this).setVisibility(8);
                ShopLoftActivity.g(ShopLoftActivity.this).setVisibility(8);
            } else {
                ShopLoftActivity.h(ShopLoftActivity.this).setVisibility(8);
                ShopLoftActivity.e(ShopLoftActivity.this).setVisibility(0);
                ShopLoftActivity.f(ShopLoftActivity.this).setVisibility(0);
                if (ShopLoftActivity.i(ShopLoftActivity.this)) {
                    if (!cen.Companion.y()) {
                        ShopLoftActivity.g(ShopLoftActivity.this).setVisibility(4);
                    } else {
                        ShopLoftActivity.g(ShopLoftActivity.this).setVisibility(0);
                    }
                } else {
                    ShopLoftActivity.g(ShopLoftActivity.this).setVisibility(0);
                }
            }
            if (ShopLoftViewManager.isNewShopLoftStyleType(str)) {
                ShopLoftActivity.g(ShopLoftActivity.this).setVisibility(8);
                ShopLoftActivity.f(ShopLoftActivity.this).setVisibility(8);
            }
            ShopLoftActivity.b(ShopLoftActivity.this, false);
        }
    };
    private e.a M = new e.a() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.e.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else if (!z) {
            } else {
                o.b(ShopLoftActivity.j(ShopLoftActivity.this));
                ShopLoftActivity.k(ShopLoftActivity.this);
            }
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.e.a
        public void a(ArrayList<JSONObject> arrayList) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            } else if (arrayList.size() == 0 || (jSONObject = arrayList.get(0)) == null) {
            } else {
                o.e(ShopLoftActivity.j(ShopLoftActivity.this));
                if (ShopLoftActivity.l(ShopLoftActivity.this)) {
                    return;
                }
                ShopLoftActivity.a(ShopLoftActivity.this, jSONObject.getString("sceneId"));
                if (ShopLoftActivity.this.f3684a) {
                    if (!ShopLoftViewManager.TYPE_LIVE.equals(ShopLoftViewManager.getTypeFromSceneId(ShopLoftActivity.m(ShopLoftActivity.this)))) {
                        ShopLoftActivity.n(ShopLoftActivity.this);
                    }
                } else if ((ShopLoftActivity.m(ShopLoftActivity.this) != null || ShopLoftActivity.o(ShopLoftActivity.this)) && !ShopLoftActivity.this.b) {
                    return;
                } else {
                    ShopLoftActivity.n(ShopLoftActivity.this);
                }
                ShopLoftActivity.c(ShopLoftActivity.this, true);
            }
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.e.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else if (ShopLoftActivity.m(ShopLoftActivity.this) != null || ShopLoftActivity.o(ShopLoftActivity.this)) {
            } else {
                ShopLoftActivity.a(ShopLoftActivity.this, jSONObject.getString("sceneId"));
                if ("663".equals(ShopLoftActivity.m(ShopLoftActivity.this))) {
                    ShopLoftActivity.p(ShopLoftActivity.this).a(ShopLoftViewManager.TYPE_NEW_DETAIL);
                }
                if (ShopLoftActivity.this.b) {
                    return;
                }
                ShopLoftActivity.n(ShopLoftActivity.this);
            }
        }
    };
    private c.a N = new c.a() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.triver.triver_shop.c.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            ShopLoftActivity.a(ShopLoftActivity.this, z);
            if (!z) {
                return;
            }
            ShopLoftActivity.this.runOnUiThread(new Runnable() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.7.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(ShopLoftActivity.this, "关注成功！可在『淘宝首页-关注』 看店铺动态哦", 0).show();
                    }
                }
            });
        }
    };
    private final View.OnLayoutChangeListener O = new View.OnLayoutChangeListener() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.10
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            if (Build.VERSION.SDK_INT < 28) {
                ShopLoftActivity.q(ShopLoftActivity.this).setGuidelineBegin(o.a((Number) 14));
            } else if (b.a((Activity) ShopLoftActivity.this)) {
                ShopLoftActivity shopLoftActivity = ShopLoftActivity.this;
                int c2 = a.c(shopLoftActivity, shopLoftActivity.getWindow().getDecorView().getRootWindowInsets());
                ceg.a("is cutout screen , " + c2);
                int a2 = c2 + o.a((Number) 14);
                ShopLoftActivity.q(ShopLoftActivity.this).setGuidelineBegin(a2);
                ShopLoftActivity.r(ShopLoftActivity.this).setGuidelineBegin(a2 + o.a((Number) 30));
            } else {
                ShopLoftActivity.q(ShopLoftActivity.this).setGuidelineBegin(o.a((Number) 14) + o.a((Number) 30));
            }
            ShopLoftActivity.this.getWindow().getDecorView().removeOnLayoutChangeListener(ShopLoftActivity.s(ShopLoftActivity.this));
        }
    };
    private BroadcastReceiver P = new BroadcastReceiver() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.12
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || ShopLoftActivity.this.isFinishing() || !ShopLoftActivity.KEY_SHOP_LOFT_BROADCAST_EVENT.equals(intent.getAction())) {
            } else {
                String stringExtra = intent.getStringExtra("event");
                if (StringUtils.isEmpty(stringExtra)) {
                    return;
                }
                if (b.c.EVENT_ON_HIDE_BAR.equals(stringExtra)) {
                    ShopLoftActivity.v(ShopLoftActivity.this);
                }
                if (!b.c.EVENT_ON_SHOW_BAR.equals(stringExtra)) {
                    return;
                }
                ShopLoftActivity.w(ShopLoftActivity.this);
            }
        }
    };

    public static /* synthetic */ Object ipc$super(ShopLoftActivity shopLoftActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ String a(ShopLoftActivity shopLoftActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfc6ca09", new Object[]{shopLoftActivity, str});
        }
        shopLoftActivity.D = str;
        return str;
    }

    public static /* synthetic */ void a(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b7feed", new Object[]{shopLoftActivity});
        } else {
            shopLoftActivity.b();
        }
    }

    public static /* synthetic */ void a(ShopLoftActivity shopLoftActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50489187", new Object[]{shopLoftActivity, new Boolean(z)});
        } else {
            shopLoftActivity.a(z);
        }
    }

    public static /* synthetic */ void b(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51902cc", new Object[]{shopLoftActivity});
        } else {
            shopLoftActivity.e();
        }
    }

    public static /* synthetic */ boolean b(ShopLoftActivity shopLoftActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e08098c", new Object[]{shopLoftActivity, new Boolean(z)})).booleanValue();
        }
        shopLoftActivity.H = z;
        return z;
    }

    public static /* synthetic */ e c(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("4304f389", new Object[]{shopLoftActivity}) : shopLoftActivity.e;
    }

    public static /* synthetic */ boolean c(ShopLoftActivity shopLoftActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebc7818d", new Object[]{shopLoftActivity, new Boolean(z)})).booleanValue();
        }
        shopLoftActivity.K = z;
        return z;
    }

    public static /* synthetic */ ViewGroup d(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("e2a5d44b", new Object[]{shopLoftActivity}) : shopLoftActivity.l;
    }

    public static /* synthetic */ boolean d(ShopLoftActivity shopLoftActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3986f98e", new Object[]{shopLoftActivity, new Boolean(z)})).booleanValue();
        }
        shopLoftActivity.G = z;
        return z;
    }

    public static /* synthetic */ Group e(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Group) ipChange.ipc$dispatch("e875b1cf", new Object[]{shopLoftActivity}) : shopLoftActivity.v;
    }

    public static /* synthetic */ TextView f(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("3a562bc", new Object[]{shopLoftActivity}) : shopLoftActivity.q;
    }

    public static /* synthetic */ TextView g(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("6600799b", new Object[]{shopLoftActivity}) : shopLoftActivity.k;
    }

    public static /* synthetic */ Group h(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Group) ipChange.ipc$dispatch("779b4dd2", new Object[]{shopLoftActivity}) : shopLoftActivity.w;
    }

    public static /* synthetic */ boolean i(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79c01de9", new Object[]{shopLoftActivity})).booleanValue() : shopLoftActivity.F;
    }

    public static /* synthetic */ ViewGroup j(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("79d03bd1", new Object[]{shopLoftActivity}) : shopLoftActivity.u;
    }

    public static /* synthetic */ void k(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768225a3", new Object[]{shopLoftActivity});
        } else {
            shopLoftActivity.d();
        }
    }

    public static /* synthetic */ boolean l(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4e32986", new Object[]{shopLoftActivity})).booleanValue() : shopLoftActivity.K;
    }

    public static /* synthetic */ String m(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("667c155f", new Object[]{shopLoftActivity}) : shopLoftActivity.D;
    }

    public static /* synthetic */ void n(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a53140", new Object[]{shopLoftActivity});
        } else {
            shopLoftActivity.h();
        }
    }

    public static /* synthetic */ boolean o(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70063523", new Object[]{shopLoftActivity})).booleanValue() : shopLoftActivity.I;
    }

    public static /* synthetic */ e.c p(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e.c) ipChange.ipc$dispatch("4bc1413d", new Object[]{shopLoftActivity}) : shopLoftActivity.L;
    }

    public static /* synthetic */ Guideline q(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Guideline) ipChange.ipc$dispatch("567ca20a", new Object[]{shopLoftActivity}) : shopLoftActivity.g;
    }

    public static /* synthetic */ Guideline r(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Guideline) ipChange.ipc$dispatch("af87ed8b", new Object[]{shopLoftActivity}) : shopLoftActivity.h;
    }

    public static /* synthetic */ View.OnLayoutChangeListener s(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLayoutChangeListener) ipChange.ipc$dispatch("c6436028", new Object[]{shopLoftActivity}) : shopLoftActivity.O;
    }

    public static /* synthetic */ String t(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("89cd6f66", new Object[]{shopLoftActivity}) : shopLoftActivity.B;
    }

    public static /* synthetic */ String u(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a46c567", new Object[]{shopLoftActivity}) : shopLoftActivity.C;
    }

    public static /* synthetic */ void v(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ad5038", new Object[]{shopLoftActivity});
        } else {
            shopLoftActivity.o();
        }
    }

    public static /* synthetic */ void w(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("630e5417", new Object[]{shopLoftActivity});
        } else {
            shopLoftActivity.p();
        }
    }

    static {
        kge.a(-1702451540);
        kge.a(-1201612728);
        kge.a(478546929);
        kge.a(514757849);
        kge.a(1861127946);
        kge.a(2123619074);
        c = new int[]{0, 3, 15, 30};
        d = new g<>();
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        d.a((g<ShopLoftActivity>) this);
        setContentView(R.layout.activity_shop_loft);
        this.E = UTAnalytics.getInstance().getDefaultTracker().getPageSpmPre(this);
        ceg.a("entrySpm : " + this.E);
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
        Bundle f = f();
        j();
        g();
        c();
        this.e = new e();
        this.e.a(this.M);
        this.e.a(this.L);
        this.e.a(this, f);
        this.f.addView(this.e.j());
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new Runnable() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ShopLoftActivity.a(ShopLoftActivity.this);
                }
            }
        }, 500L);
        LocalBroadcastManager.getInstance(this).registerReceiver(this.P, new IntentFilter(KEY_SHOP_LOFT_BROADCAST_EVENT));
        boolean V = cen.Companion.V();
        if (!V) {
            d();
        }
        this.e.a(V);
        try {
            h.a(this, getIntent().getData());
        } catch (Throwable th) {
            ceg.Companion.a(th);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        m.b("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_return_exposure", c("a2141.b69949920.c1638979320799.d1638979320799"));
        if (this.F) {
            m.b("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_subscribe_exposure", c("a2141.b69949920.c1638979522235.d1638979522235"));
        } else {
            m.b("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_shopenter_exposure", c("a2141.b69949920.c1638979452785.d1638979452785"));
        }
        m.b("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_more_exposure", c("a2141.b69949920.c1638979581592.d1638979581592"));
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.F = "shop".equals(this.z);
        if (!this.F) {
            return;
        }
        this.k.setText("+ 关注");
        c.c(this, this.A, new c.a() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.triver.triver_shop.c.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else {
                    ShopLoftActivity.a(ShopLoftActivity.this, z);
                }
            }
        });
        if (cen.Companion.y()) {
            return;
        }
        this.k.setVisibility(4);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        o.e(this.o);
        o.e(this.p);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        o.b(this.o);
        o.b(this.p);
    }

    private void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            runOnUiThread(new Runnable() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ShopLoftActivity.d(ShopLoftActivity.this, z);
                    if (z) {
                        ShopLoftActivity.g(ShopLoftActivity.this).setText(nmf.TEXT_FOLLOW_DEFAULT);
                    } else {
                        ShopLoftActivity.g(ShopLoftActivity.this).setText("+ 关注");
                    }
                }
            });
        }
    }

    private Bundle f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("449b7d71", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        Intent intent = getIntent();
        if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter("loftData");
                ceg.a("shopLoftActivity url : " + data);
                this.J = "true".equals(data.getQueryParameter("benefitPop"));
                bundle.putString(AgooConstants.MESSAGE_EXT, data.getQueryParameter(AgooConstants.MESSAGE_EXT));
                bundle.putString("loftData", queryParameter);
                String queryParameter2 = data.getQueryParameter("seller_id");
                if (queryParameter2 == null) {
                    queryParameter2 = data.getQueryParameter("sellerId");
                }
                bundle.putString("seller_id", queryParameter2);
                bundle.putString("first_media_id", data.getQueryParameter("first_media_id"));
                bundle.putString("source", data.getQueryParameter("source"));
                bundle.putString("title", data.getQueryParameter("title"));
                String queryParameter3 = data.getQueryParameter("shop_id");
                if (queryParameter3 == null) {
                    queryParameter3 = data.getQueryParameter("shopId");
                }
                bundle.putString("shop_id", queryParameter3);
                bundle.putString("first_media_scene", data.getQueryParameter("first_media_scene"));
                bundle.putString("entrySpm", data.getQueryParameter("spm"));
                bundle.putString("widgetShareParams", data.getQueryParameter("widgetShareParams"));
                bundle.putString("loftUrl", data.toString());
                this.y = data.getQueryParameter("title");
                this.z = data.getQueryParameter("source");
                this.B = queryParameter3;
                this.A = queryParameter2;
                this.C = data.getQueryParameter("shopInstance_id");
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle.putString("initMuteStatus", extras.getString("initMuteStatus"));
            }
        }
        return bundle;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.o.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01FgfnlT1jp12NW7WKj_!!6000000004596-1-tps-216-216.gif");
        }
    }

    private void h() {
        RVAccountService rVAccountService;
        String userId;
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.I || (rVAccountService = (RVAccountService) RVProxy.get(RVAccountService.class)) == null || (userId = rVAccountService.getUserId(null)) == null) {
        } else {
            if (cen.Companion.aa()) {
                a2 = b(userId);
            } else {
                a2 = a(userId);
            }
            if (a2) {
                i();
            }
            this.I = true;
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String a2 = com.alibaba.triver.triver_shop.newShop.ext.b.a(this, "shopLoftActivity", str);
        long b = com.alibaba.triver.triver_shop.newShop.ext.b.b(a2);
        long currentTimeMillis = System.currentTimeMillis();
        if (!StringUtils.isEmpty(a2) && currentTimeMillis - b < d.DEFAULT_MAX_AGE) {
            z = false;
        }
        if (z) {
            com.alibaba.triver.triver_shop.newShop.ext.b.a(this, "shopLoftActivity", str, Long.toString(currentTimeMillis));
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
        if ((r8 - r1.lastAccessTime) >= (r7[r1.accessCount] * 86400000)) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.container.ShopLoftActivity.b(java.lang.String):boolean");
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.m.setSkipAutoSize(true);
        this.m.setImageUrl("https://gw.alicdn.com/tfs/TB1b3uZhRBh1e4jSZFhXXcC9VXa-540-540.png");
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new Runnable() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                o.b(ShopLoftActivity.d(ShopLoftActivity.this));
                com.alibaba.triver.triver_shop.newShop.ext.b.b(new Runnable() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.9.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            o.e(ShopLoftActivity.d(ShopLoftActivity.this));
                        }
                    }
                }, 5000L);
            }
        }, 500L);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.f = (FrameLayout) findViewById(R.id.shop_loft_center_container);
        this.g = (Guideline) findViewById(R.id.shop_loft_statusBarLine);
        this.h = (Guideline) findViewById(R.id.shop_loft_header_bottom_line);
        this.i = (ImageView) findViewById(R.id.shop_loft_back_button);
        this.j = (ImageView) findViewById(R.id.shop_loft_more_button);
        TextView textView = (TextView) findViewById(R.id.shop_loft_title);
        this.q = textView;
        this.k = (TextView) findViewById(R.id.shop_loft_in_shop_button);
        this.n = (TextView) findViewById(R.id.shop_loft_guid_button);
        this.m = (TUrlImageView) findViewById(R.id.shop_loft_swipe_icon);
        this.l = (ViewGroup) findViewById(R.id.shop_loft_guide_frame);
        this.o = (TUrlImageView) findViewById(R.id.shop_loft_continue_swipe_up_img);
        this.p = (TextView) findViewById(R.id.shop_loft_continue_text);
        this.r = (ViewGroup) findViewById(R.id.shop_loft_live_more_layout);
        this.s = (ImageView) findViewById(R.id.shop_loft_live_close_button);
        this.t = (ImageView) findViewById(R.id.shop_loft_live_more_button);
        this.v = (Group) findViewById(R.id.shop_loft_common_title_group);
        this.w = (Group) findViewById(R.id.shop_loft_live_controller);
        this.u = (ViewGroup) findViewById(R.id.shop_loft_error_layout);
        this.i.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.t.setOnClickListener(this);
        textView.setText(this.y);
        getWindow().getDecorView().addOnLayoutChangeListener(this.O);
        try {
            View findViewById = this.u.findViewById(R.id.shop_loft_no_data_image);
            if (!(findViewById instanceof TUrlImageView)) {
                return;
            }
            ((TUrlImageView) findViewById).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN012ByUmB1g6BZhIrRaa_!!6000000004092-0-tps-480-480.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, str});
        }
        String l = this.e.l();
        if (ShopLoftViewManager.TYPE_LIVE.equals(l)) {
            l = "live";
        } else if (ShopLoftViewManager.TYPE_VIDEO.equals(l)) {
            l = "2FVideo";
        } else if (ShopLoftViewManager.TYPE_MARKET.equals(l)) {
            l = "2FMarket";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("shop_id", this.B);
        hashMap.put("seller_id", this.A);
        hashMap.put("spm", str);
        hashMap.put("tag", l);
        return hashMap;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        if (view == this.i) {
            m.a("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_return_click", c("a2141.b69949920.c1638979252920.d1638979252920"));
            finish();
        }
        if (view == this.j) {
            m.a("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_more_click", c("a2141.b69949920.c1638979554470.d1638979554470"));
            n();
        }
        if (view == this.k) {
            if (this.F) {
                m.a("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_subscribe_click", c("a2141.b69949920.c1638979495158.d1638979495158"));
                m();
                return;
            }
            m.a("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_shopenter_click", c("a2141.b69949920.c1638979415659.d1638979415659"));
            l();
        }
        if (view == this.t) {
            m.a("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_more_click", c("a2141.b69949920.c1638979554470.d1638979554470"));
            n();
        }
        if (view != this.s) {
            return;
        }
        m.a("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_return_click", c("a2141.b69949920.c1638979252920.d1638979252920"));
        finish();
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new ruk<t>() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.t, java.lang.Object] */
            @Override // tb.ruk
            /* renamed from: invoke */
            public /* synthetic */ t mo2427invoke() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("5a980813", new Object[]{this}) : a();
            }

            public t a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (t) ipChange2.ipc$dispatch("bc9a1777", new Object[]{this});
                }
                com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(ShopLoftActivity.this).a(ShopLoftActivity.t(ShopLoftActivity.this), ShopLoftActivity.u(ShopLoftActivity.this));
                return t.INSTANCE;
            }
        }, 300L);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        final TBPublicMenuItem build = new TBPublicMenuItem.Builder().setTitle("ꄪ:分享").build();
        ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
        arrayList.add(build);
        this.x.addCustomMenus(arrayList, new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
            public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                } else if (build != tBPublicMenuItem) {
                } else {
                    ShopLoftActivity.this.a();
                }
            }
        });
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        Nav.from(this).toUri("https://shop" + this.B + ".taobao.com?shopFrameworkType=native");
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.G) {
            c.b(this, this.A, this.N);
        } else {
            c.a(this, this.A, this.N);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.x = new TBPublicMenu(this, new ITBPublicMenu() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.ITBPublicMenu
            public TBPublicMenu getPublicMenu() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (TBPublicMenu) ipChange2.ipc$dispatch("1f3d234e", new Object[]{this});
                }
                return null;
            }

            @Override // com.taobao.uikit.actionbar.ITBPublicMenu
            public Bundle pageUserInfo() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Bundle) ipChange2.ipc$dispatch("65615653", new Object[]{this});
                }
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                bundle2.putString("from", "shopVideo");
                JSONObject m = ShopLoftActivity.c(ShopLoftActivity.this).m();
                JSONObject b = com.alibaba.triver.triver_shop.newShop.ext.d.b(m, "reportParams");
                if (b == null) {
                    if (m != null) {
                        String string = m.getString("outerId");
                        if (string == null) {
                            string = m.getString("id");
                        }
                        bundle2.putString("subjectId", string);
                    }
                    bundle2.putString("subjectType", "VIDEO");
                } else {
                    for (Map.Entry<String, Object> entry : b.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (key != null && value != null) {
                            bundle2.putString(key, value.toString());
                        }
                    }
                }
                bundle.putBundle(hyt.ZZB_BUNDLE_KEY, bundle2);
                return bundle;
            }
        });
        String a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(this.e.m(), "ifShowReport");
        if (a2 != null) {
            z = "true".equals(a2);
        }
        if (!z) {
            this.x.removeCustomMenuItemsByType("report");
        }
        k();
        this.x.show();
    }

    public void a() {
        ShareContent k;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e eVar = this.e;
        if (eVar == null || (k = eVar.k()) == null) {
            return;
        }
        k.businessId = "Shop_2F";
        k.templateId = "weex";
        Map<String, String> map = k.extendParams;
        String str2 = null;
        if (map != null) {
            str2 = map.get("id");
            str = map.get("scene");
        } else {
            str = null;
        }
        if (str2 == null || str == null) {
            ceg.a("firstMediaId = " + str2 + ", firstMediaScene = " + str + ", has null value , can not share");
            return;
        }
        Uri.Builder buildUpon = Uri.parse(KEY_SHARE_URL_BASE).buildUpon();
        buildUpon.appendQueryParameter("seller_id", this.A);
        buildUpon.appendQueryParameter("shop_id", this.B);
        buildUpon.appendQueryParameter("first_media_scene", str);
        buildUpon.appendQueryParameter("first_media_id", str2);
        buildUpon.appendQueryParameter("title", this.y);
        JSONObject a2 = this.e.a();
        if (a2 != null) {
            for (Map.Entry<String, Object> entry : a2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    buildUpon.appendQueryParameter(key, value.toString());
                }
            }
        }
        k.url = buildUpon.build().toString();
        com.alibaba.triver.triver_shop.e.a(this, k, "");
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.H) {
            this.w.setVisibility(8);
        } else {
            this.v.setVisibility(8);
            this.q.setVisibility(8);
            this.k.setVisibility(8);
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.H) {
            this.w.setVisibility(0);
        } else {
            this.v.setVisibility(0);
            this.q.setVisibility(0);
            if (this.F) {
                if (!cen.Companion.y()) {
                    this.k.setVisibility(4);
                    return;
                } else {
                    this.k.setVisibility(0);
                    return;
                }
            }
            this.k.setVisibility(0);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.e.g();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.e.h();
        super.onPause();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.e.i();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        d.b((g<ShopLoftActivity>) this);
        e eVar = this.e;
        if (eVar != null) {
            eVar.f();
        }
        com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(this).a();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.P);
    }

    @Override // tb.dlx
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        for (dlx dlxVar : this.R) {
            dlxVar.a(jSONObject);
        }
    }

    @Override // tb.dlx
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        for (dlx dlxVar : this.R) {
            dlxVar.a(str, jSONObject);
        }
    }

    @Override // tb.fmg
    public void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
            return;
        }
        for (fmg fmgVar : this.Q) {
            fmgVar.b(str, jSONObject);
        }
    }

    @Override // tb.qzp
    public void a(dlx dlxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56303e8", new Object[]{this, dlxVar});
        } else {
            this.R.add(dlxVar);
        }
    }

    @Override // tb.rmx
    public void a(fmg fmgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d31258", new Object[]{this, fmgVar});
        } else {
            this.Q.add(fmgVar);
        }
    }
}
