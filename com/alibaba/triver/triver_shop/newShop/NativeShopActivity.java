package com.alibaba.triver.triver_shop.newShop;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.api.App;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.c;
import com.alibaba.triver.triver_shop.newShop.data.NativeShopRenderContainerType;
import com.alibaba.triver.triver_shop.newShop.data.h;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.d;
import com.alibaba.triver.triver_shop.newShop.view.BigCardShopView;
import com.alibaba.triver.triver_shop.newShop.view.CarShopView;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.alibaba.triver.triver_shop.newShop.view.VideoShopView;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.web.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.v;
import com.taobao.android.nav.Nav;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.message.biz.contacts.MessageBoxService;
import com.taobao.message.biz.contacts.UnreadInfo;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import tb.ceg;
import tb.cen;
import tb.fvb;
import tb.fve;
import tb.kge;
import tb.rul;
import tb.ruw;
import tb.rvp;
import tb.rvr;
import tb.rvs;

/* loaded from: classes3.dex */
public final class NativeShopActivity extends FragmentActivity implements com.alibaba.triver.triver_shop.newShop.data.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d Companion;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.k<Object>[] f3783a;
    private String A;
    private int B;
    private int C;
    private com.alibaba.triver.triver_shop.newShop.data.d D;
    private c E;
    private JSONObject F;
    private JSONArray G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private JSONObject Q;
    private HashMap<String, String> R;
    private final HashMap<String, q> S;
    private boolean T;
    private boolean U;
    private final boolean V;
    private final t W;
    private ShopView e;
    private DinamicXEngine f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;
    private FrameLayout o;
    private final rvs v;
    private final rvs w;
    private String x;
    private String y;
    private String z;
    private final HashMap<String, ruw<DXTemplateItem, Boolean, kotlin.t>> b = new HashMap<>();
    private final com.alibaba.triver.triver_shop.newShop.data.h c = new com.alibaba.triver.triver_shop.newShop.data.h();
    private final UnReadMsgReceiver d = new UnReadMsgReceiver(this);
    private final kotlin.d p = kotlin.e.a(new NativeShopActivity$topViewContainer$2(this));
    private final kotlin.d q = kotlin.e.a(new NativeShopActivity$secondViewContainer$2(this));
    private final kotlin.d r = kotlin.e.a(new NativeShopActivity$babyTopViewContainer$2(this));
    private final kotlin.d s = kotlin.e.a(new NativeShopActivity$babySecondViewContainer$2(this));
    private final kotlin.d t = kotlin.e.a(new NativeShopActivity$shopLoftEntranceContainer$2(this));
    private final kotlin.d u = kotlin.e.a(new NativeShopActivity$videoShopTabContainer$2(this));

    /* loaded from: classes3.dex */
    public final class i extends e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3791a;

        static {
            kge.a(-1928985159);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(NativeShopActivity this$0) {
            super(this$0);
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3791a = this$0;
        }
    }

    /* loaded from: classes3.dex */
    public final class j extends e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3792a;

        static {
            kge.a(724379185);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(NativeShopActivity this$0) {
            super(this$0);
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3792a = this$0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class r extends c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r() {
        }

        @Override // com.alibaba.triver.triver_shop.c.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            NativeShopActivity.o(NativeShopActivity.this).a(z);
            if (!z) {
                com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(NativeShopActivity.this);
                if (b == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.h.a(b, false, (rul<? super Map<String, String>, kotlin.t>) new NativeShopActivity$checkHasFollowed$followCallback$1$followResult$1(NativeShopActivity.this));
            }
            ceg.Companion.b(kotlin.jvm.internal.q.a("first follow status : ", (Object) Boolean.valueOf(z)));
        }
    }

    /* loaded from: classes3.dex */
    public static final class s implements fve {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public s() {
        }

        @Override // tb.fve
        public final void onNotificationListener(fvb fvbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                return;
            }
            for (final DXTemplateItem dXTemplateItem : fvbVar.f28139a) {
                final NativeShopActivity nativeShopActivity = NativeShopActivity.this;
                nativeShopActivity.runOnUiThread(new Runnable() { // from class: com.alibaba.triver.triver_shop.newShop.NativeShopActivity.s.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ruw ruwVar = (ruw) NativeShopActivity.s(NativeShopActivity.this).get(dXTemplateItem.f11925a);
                        if (ruwVar == null) {
                            return;
                        }
                        DXTemplateItem finishedTemplateItem = dXTemplateItem;
                        kotlin.jvm.internal.q.b(finishedTemplateItem, "finishedTemplateItem");
                        ruwVar.mo2423invoke(finishedTemplateItem, true);
                    }
                });
            }
            for (final DXTemplateItem dXTemplateItem2 : fvbVar.b) {
                final NativeShopActivity nativeShopActivity2 = NativeShopActivity.this;
                nativeShopActivity2.runOnUiThread(new Runnable() { // from class: com.alibaba.triver.triver_shop.newShop.NativeShopActivity.s.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ruw ruwVar = (ruw) NativeShopActivity.s(NativeShopActivity.this).get(dXTemplateItem2.f11925a);
                        if (ruwVar == null) {
                            return;
                        }
                        DXTemplateItem failedTemplateItem = dXTemplateItem2;
                        kotlin.jvm.internal.q.b(failedTemplateItem, "failedTemplateItem");
                        ruwVar.mo2423invoke(failedTemplateItem, false);
                    }
                });
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class t extends c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public t() {
        }

        @Override // com.alibaba.triver.triver_shop.c.a
        public void a(boolean z) {
            View Q;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            NativeShopActivity.h(NativeShopActivity.this, z);
            if (!z || (Q = NativeShopActivity.Q(NativeShopActivity.this)) == null) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.e(Q);
        }
    }

    /* loaded from: classes3.dex */
    public static final class u extends rvr<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f3810a;
        public final /* synthetic */ NativeShopActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Object obj, Object obj2, NativeShopActivity nativeShopActivity) {
            super(obj2);
            this.f3810a = obj;
            this.b = nativeShopActivity;
        }

        @Override // tb.rvr
        public void a(kotlin.reflect.k<?> property, Integer num, Integer num2) {
            Window window;
            View decorView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4a3a624", new Object[]{this, property, num, num2});
                return;
            }
            kotlin.jvm.internal.q.d(property, "property");
            int intValue = num2.intValue();
            num.intValue();
            if (intValue != 7 || (window = this.b.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.addOnLayoutChangeListener(new x());
        }
    }

    /* loaded from: classes3.dex */
    public static final class v extends rvr<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f3811a;
        public final /* synthetic */ NativeShopActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Object obj, Object obj2, NativeShopActivity nativeShopActivity) {
            super(obj2);
            this.f3811a = obj;
            this.b = nativeShopActivity;
        }

        @Override // tb.rvr
        public void a(kotlin.reflect.k<?> property, Integer num, Integer num2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4a3a624", new Object[]{this, property, num, num2});
                return;
            }
            kotlin.jvm.internal.q.d(property, "property");
            int intValue = num2.intValue();
            num.intValue();
            if (intValue != 2) {
                return;
            }
            com.alibaba.triver.triver_shop.d dVar = com.alibaba.triver.triver_shop.d.INSTANCE;
            NativeShopActivity nativeShopActivity = this.b;
            NativeShopActivity nativeShopActivity2 = nativeShopActivity;
            com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(nativeShopActivity);
            if (b == null) {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
            String T = b.T();
            com.alibaba.triver.triver_shop.newShop.data.d b2 = NativeShopActivity.b(this.b);
            if (b2 != null) {
                dVar.a(nativeShopActivity2, T, b2.U(), new NativeShopActivity$topViewLoadCount$2$1(this.b));
            } else {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class w extends c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public w() {
        }

        @Override // com.alibaba.triver.triver_shop.c.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            NativeShopActivity.o(NativeShopActivity.this).a(z);
            com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(NativeShopActivity.this);
            if (b != null) {
                com.alibaba.triver.triver_shop.newShop.ext.h.a(b, z);
            } else {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class x implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public x() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            View decorView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            ShopView g = NativeShopActivity.g(NativeShopActivity.this);
            if (g == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            g.notifyAllTemplateReady();
            Window window = NativeShopActivity.this.getWindow();
            if (window == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.removeOnLayoutChangeListener(this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class y implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public y(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NativeShopActivity.c(NativeShopActivity.this, this.b);
            com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(NativeShopActivity.this).a(NativeShopActivity.this.a("shopId"), NativeShopActivity.p(NativeShopActivity.this));
            NativeShopActivity.k(NativeShopActivity.this);
        }
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity nativeShopActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -962742886:
                super.onTrimMemory(((Number) objArr[0]).intValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 323739864:
                super.setRequestedOrientation(((Number) objArr[0]).intValue());
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            case 1270686685:
                super.onLowMemory();
                return null;
            case 2133689546:
                super.onStart();
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
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public NativeShopActivity() {
        rvp rvpVar = rvp.INSTANCE;
        this.v = new u(0, 0, this);
        rvp rvpVar2 = rvp.INSTANCE;
        this.w = new v(0, 0, this);
        this.x = com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_INDEX_BAR;
        this.y = com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_INDEX;
        this.z = "";
        this.O = true;
        this.Q = new JSONObject();
        this.R = new HashMap<>();
        this.S = new HashMap<>();
        this.T = true;
        this.V = true;
        this.W = new t();
    }

    public static final /* synthetic */ View F(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b8d56f19", new Object[]{nativeShopActivity}) : nativeShopActivity.m;
    }

    public static final /* synthetic */ boolean G(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5e47b27a", new Object[]{nativeShopActivity})).booleanValue() : nativeShopActivity.N;
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.h H(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.h) ipChange.ipc$dispatch("a744e022", new Object[]{nativeShopActivity}) : nativeShopActivity.c;
    }

    public static final /* synthetic */ void I(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b09ba34", new Object[]{nativeShopActivity});
        } else {
            nativeShopActivity.J();
        }
    }

    public static final /* synthetic */ View K(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a24c81b4", new Object[]{nativeShopActivity}) : nativeShopActivity.k;
    }

    public static final /* synthetic */ boolean L(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d62cc5d5", new Object[]{nativeShopActivity})).booleanValue() : nativeShopActivity.T;
    }

    public static final /* synthetic */ View M(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ffaf55f2", new Object[]{nativeShopActivity}) : nativeShopActivity.g;
    }

    public static final /* synthetic */ boolean N(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2eecd93", new Object[]{nativeShopActivity})).booleanValue() : nativeShopActivity.A();
    }

    public static final /* synthetic */ boolean O(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("514fd172", new Object[]{nativeShopActivity})).booleanValue() : nativeShopActivity.P;
    }

    public static final /* synthetic */ boolean P(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cfb0d551", new Object[]{nativeShopActivity})).booleanValue() : nativeShopActivity.O;
    }

    public static final /* synthetic */ View Q(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ba74fe6e", new Object[]{nativeShopActivity}) : nativeShopActivity.n;
    }

    public static final /* synthetic */ void a(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3422171c", new Object[]{nativeShopActivity});
        } else {
            nativeShopActivity.L();
        }
    }

    public static final /* synthetic */ void a(NativeShopActivity nativeShopActivity, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50213f67", new Object[]{nativeShopActivity, new Integer(i2)});
        } else {
            nativeShopActivity.a(i2);
        }
    }

    public static final /* synthetic */ void a(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e52b436", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.h = view;
        }
    }

    public static final /* synthetic */ void a(NativeShopActivity nativeShopActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e47754", new Object[]{nativeShopActivity, jSONObject});
        } else {
            nativeShopActivity.a(jSONObject);
        }
    }

    public static final /* synthetic */ void a(NativeShopActivity nativeShopActivity, com.alibaba.triver.triver_shop.newShop.data.d dVar, int i2, int i3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8dc76f", new Object[]{nativeShopActivity, dVar, new Integer(i2), new Integer(i3), str});
        } else {
            nativeShopActivity.a(dVar, i2, i3, str);
        }
    }

    public static final /* synthetic */ void a(NativeShopActivity nativeShopActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd231e6", new Object[]{nativeShopActivity, str});
        } else {
            nativeShopActivity.e(str);
        }
    }

    public static final /* synthetic */ void a(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50217f38", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.b(z);
        }
    }

    public static final /* synthetic */ void a(NativeShopActivity nativeShopActivity, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40edacb", new Object[]{nativeShopActivity, new Boolean(z), new Integer(i2)});
        } else {
            nativeShopActivity.a(z, i2);
        }
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d b(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("33c511cc", new Object[]{nativeShopActivity}) : nativeShopActivity.D;
    }

    public static final /* synthetic */ void b(NativeShopActivity nativeShopActivity, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de0b768", new Object[]{nativeShopActivity, new Integer(i2)});
        } else {
            nativeShopActivity.b(i2);
        }
    }

    public static final /* synthetic */ void b(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ce8df7", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.g = view;
        }
    }

    public static final /* synthetic */ void b(NativeShopActivity nativeShopActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae839c05", new Object[]{nativeShopActivity, str});
        } else {
            nativeShopActivity.f(str);
        }
    }

    public static final /* synthetic */ void b(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de0f739", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.e(z);
        }
    }

    public static final /* synthetic */ void c(NativeShopActivity nativeShopActivity, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba02f69", new Object[]{nativeShopActivity, new Integer(i2)});
        } else {
            nativeShopActivity.c(i2);
        }
    }

    public static final /* synthetic */ void c(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd4a67b8", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.j = view;
        }
    }

    public static final /* synthetic */ void c(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba06f3a", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.I = z;
        }
    }

    public static final /* synthetic */ void d(NativeShopActivity nativeShopActivity, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("395fa76a", new Object[]{nativeShopActivity, new Integer(i2)});
        } else {
            nativeShopActivity.d(i2);
        }
    }

    public static final /* synthetic */ void d(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c64179", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.i = view;
        }
    }

    public static final /* synthetic */ void d(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("395fe73b", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.J = z;
        }
    }

    public static final /* synthetic */ int e(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2da6268b", new Object[]{nativeShopActivity})).intValue() : nativeShopActivity.B;
    }

    public static final /* synthetic */ void e(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c421b3a", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.k = view;
        }
    }

    public static final /* synthetic */ int f(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac072a6a", new Object[]{nativeShopActivity})).intValue() : nativeShopActivity.C;
    }

    public static final /* synthetic */ void f(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3bdf4fb", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.l = view;
        }
    }

    public static final /* synthetic */ void f(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ded73d", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.d(z);
        }
    }

    public static final /* synthetic */ ShopView g(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopView) ipChange.ipc$dispatch("fb44926b", new Object[]{nativeShopActivity}) : nativeShopActivity.e;
    }

    public static final /* synthetic */ void g(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b39cebc", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.m = view;
        }
    }

    public static final /* synthetic */ void g(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("229e4f3e", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.P = z;
        }
    }

    public static final /* synthetic */ c h(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("14c9d0a", new Object[]{nativeShopActivity}) : nativeShopActivity.E;
    }

    public static final /* synthetic */ void h(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705dc73f", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.f(z);
        }
    }

    public static final /* synthetic */ DinamicXEngine i(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("ecf4c573", new Object[]{nativeShopActivity}) : nativeShopActivity.f;
    }

    public static final /* synthetic */ View j(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("49c85b75", new Object[]{nativeShopActivity}) : nativeShopActivity.h;
    }

    public static final /* synthetic */ void k(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ec3dd2", new Object[]{nativeShopActivity});
        } else {
            nativeShopActivity.s();
        }
    }

    public static final /* synthetic */ t o(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t) ipChange.ipc$dispatch("c6dde6b2", new Object[]{nativeShopActivity}) : nativeShopActivity.W;
    }

    public static final /* synthetic */ boolean p(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9bd15131", new Object[]{nativeShopActivity})).booleanValue() : nativeShopActivity.I;
    }

    public static final /* synthetic */ HashMap s(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("9321b3ad", new Object[]{nativeShopActivity}) : nativeShopActivity.b;
    }

    public static final /* synthetic */ void u(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13b66488", new Object[]{nativeShopActivity});
        } else {
            nativeShopActivity.p();
        }
    }

    public static final /* synthetic */ boolean y(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3a7408", new Object[]{nativeShopActivity})).booleanValue() : nativeShopActivity.H();
    }

    /* loaded from: classes3.dex */
    public static final class d {
        static {
            kge.a(-200716315);
        }

        public /* synthetic */ d(kotlin.jvm.internal.o oVar) {
            this();
        }

        private d() {
        }
    }

    private final FrameLayout d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("df23db0e", new Object[]{this}) : (FrameLayout) this.p.getValue();
    }

    private final FrameLayout e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("67541aed", new Object[]{this}) : (FrameLayout) this.q.getValue();
    }

    private final FrameLayout f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ef845acc", new Object[]{this}) : (FrameLayout) this.r.getValue();
    }

    private final FrameLayout g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("77b49aab", new Object[]{this}) : (FrameLayout) this.s.getValue();
    }

    private final FrameLayout h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ffe4da8a", new Object[]{this}) : (FrameLayout) this.t.getValue();
    }

    private final FrameLayout i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("88151a69", new Object[]{this}) : (FrameLayout) this.u.getValue();
    }

    static {
        kge.a(403969245);
        kge.a(815071235);
        kotlin.reflect.k<Object>[] kVarArr = new kotlin.reflect.k[8];
        kVarArr[6] = kotlin.jvm.internal.t.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.t.b(NativeShopActivity.class), "templateLoadCount", "getTemplateLoadCount()I"));
        kVarArr[7] = kotlin.jvm.internal.t.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.t.b(NativeShopActivity.class), "topViewLoadCount", "getTopViewLoadCount()I"));
        f3783a = kVarArr;
        Companion = new d(null);
    }

    private final void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
        } else {
            this.v.a(this, f3783a[6], Integer.valueOf(i2));
        }
    }

    private final int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : ((Number) this.v.a(this, f3783a[6])).intValue();
    }

    private final void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
        } else {
            this.w.a(this, f3783a[7], Integer.valueOf(i2));
        }
    }

    private final int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : ((Number) this.w.a(this, f3783a[7])).intValue();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, newConfig});
            return;
        }
        kotlin.jvm.internal.q.d(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (!com.alibaba.triver.triver_shop.f.INSTANCE.b() || this.D == null) {
            return;
        }
        NativeShopActivity nativeShopActivity = this;
        boolean z = !com.taobao.android.autosize.h.a().b((Context) nativeShopActivity);
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
        if (dVar == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.l.a(nativeShopActivity, com.alibaba.triver.triver_shop.newShop.ext.h.c(dVar, z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01d9 A[Catch: Throwable -> 0x01fc, TryCatch #0 {Throwable -> 0x01fc, blocks: (B:68:0x01d3, B:70:0x01d9, B:72:0x01e0, B:74:0x01e7, B:76:0x01f0, B:77:0x01f3, B:78:0x01f4, B:79:0x01f7, B:80:0x01f8, B:81:0x01fb), top: B:89:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f8 A[Catch: Throwable -> 0x01fc, TryCatch #0 {Throwable -> 0x01fc, blocks: (B:68:0x01d3, B:70:0x01d9, B:72:0x01e0, B:74:0x01e7, B:76:0x01f0, B:77:0x01f3, B:78:0x01f4, B:79:0x01f7, B:80:0x01f8, B:81:0x01fb), top: B:89:0x01d3 }] */
    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.NativeShopActivity.onCreate(android.os.Bundle):void");
    }

    private final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        ceg.Companion.a(jSONObject == null ? null : jSONObject.toString());
        if (jSONObject == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
        if (dVar == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        Uri.Builder builder = Uri.parse(dVar.aw()).buildUpon();
        kotlin.jvm.internal.q.b(builder, "builder");
        com.alibaba.triver.triver_shop.newShop.ext.b.a(builder, jSONObject);
        builder.appendQueryParameter(com.taobao.search.common.util.k.KEY_SUGGEST_RN, jSONObject.getString("suggestRn"));
        String uri = builder.build().toString();
        kotlin.jvm.internal.q.b(uri, "builder.build().toString()");
        jSONObject.put((JSONObject) "url", uri);
        DinamicXEngine dinamicXEngine = this.f;
        if (dinamicXEngine == null) {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
        View view = this.g;
        if (view == null) {
            kotlin.jvm.internal.q.b("topView");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.h.a(dinamicXEngine, view, "searchInfo", jSONObject);
        DinamicXEngine dinamicXEngine2 = this.f;
        if (dinamicXEngine2 == null) {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
        View view2 = this.j;
        if (view2 != null) {
            com.alibaba.triver.triver_shop.newShop.ext.h.a(dinamicXEngine2, view2, "searchInfo", jSONObject);
        } else {
            kotlin.jvm.internal.q.b("babyTopView");
            throw null;
        }
    }

    private final void m() {
        BigCardShopView shopView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
        if (dVar != null) {
            if (dVar.an()) {
                CarShopView carShopView = new CarShopView(this);
                com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.D;
                if (dVar2 == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                } else {
                    carShopView.setShopHeaderNeedScrollMask(dVar2.av());
                    shopView = carShopView;
                }
            } else {
                com.alibaba.triver.triver_shop.newShop.data.d dVar3 = this.D;
                if (dVar3 == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                } else if (dVar3.ao()) {
                    VideoShopView videoShopView = new VideoShopView(this);
                    com.alibaba.triver.triver_shop.newShop.data.d dVar4 = this.D;
                    if (dVar4 == null) {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    } else {
                        videoShopView.setVideoShopBackgroundPicUrl(dVar4.ar());
                        shopView = videoShopView;
                    }
                } else {
                    com.alibaba.triver.triver_shop.newShop.data.d dVar5 = this.D;
                    if (dVar5 == null) {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    } else if (dVar5.ac()) {
                        shopView = new BigCardShopView(this);
                    } else {
                        shopView = new ShopView(this);
                    }
                }
            }
            this.e = shopView;
            ShopView shopView2 = this.e;
            if (shopView2 == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.data.d dVar6 = this.D;
            if (dVar6 == null) {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
            shopView2.setShopData(dVar6);
            com.alibaba.triver.triver_shop.newShop.data.d dVar7 = this.D;
            if (dVar7 == null) {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
            ShopView shopView3 = this.e;
            if (shopView3 == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            dVar7.a(shopView3.getShopContentMaxHeightGetter());
            ShopView shopView4 = this.e;
            if (shopView4 == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            View findViewById = shopView4.findViewById(R.id.shop_view_auth_page_new);
            kotlin.jvm.internal.q.b(findViewById, "shopView.findViewById(R.id.shop_view_auth_page_new)");
            this.o = (FrameLayout) findViewById;
            int x2 = x();
            ShopView shopView5 = this.e;
            if (shopView5 == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            shopView5.setStatusBarHeight(x2);
            ShopView shopView6 = this.e;
            if (shopView6 == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            shopView6.setHeadCollapsedCallback(new NativeShopActivity$initShopView$1(this));
            ShopView shopView7 = this.e;
            if (shopView7 == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            shopView7.setWillHeadCollapsedCallback(new NativeShopActivity$initShopView$2(this));
            ShopView shopView8 = this.e;
            if (shopView8 != null) {
                shopView8.setCanSwipeDownDetector(new NativeShopActivity$initShopView$3(this));
                return;
            } else {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
        }
        kotlin.jvm.internal.q.b("shopDataParser");
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        if (keyEvent != null && keyEvent.getKeyCode() == 4) {
            z = true;
        }
        if (z && (frameLayout = this.o) != null) {
            if (frameLayout == null) {
                kotlin.jvm.internal.q.b("authPage");
                throw null;
            } else if (frameLayout.getChildCount() != 0) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    private final void a(boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i2)});
            return;
        }
        this.O = z;
        if (!z) {
            com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(this).b(a("shopId"), com.alibaba.triver.triver_shop.newShop.ext.o.f(Integer.valueOf(i2)));
        } else {
            com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(this).a(a("shopId"), com.alibaba.triver.triver_shop.newShop.ext.o.f(Integer.valueOf(i2)));
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
            if (dVar == null) {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.k.i(dVar);
        }
        a(!z);
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.N || this.m == null) {
        } else {
            DinamicXEngine dinamicXEngine = this.f;
            if (dinamicXEngine == null) {
                kotlin.jvm.internal.q.b("dxEngine");
                throw null;
            }
            View view = this.g;
            if (view != null) {
                com.alibaba.triver.triver_shop.newShop.ext.h.a(dinamicXEngine, view, "showShopName", Boolean.valueOf(z));
            } else {
                kotlin.jvm.internal.q.b("topView");
                throw null;
            }
        }
    }

    private final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.N) {
            d(z);
        }
        a(this, z, false, 2, (Object) null);
        g(z);
    }

    private final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (this.M) {
            return b();
        }
        if (H() && this.L) {
            return b();
        }
        return true;
    }

    public static /* synthetic */ void a(NativeShopActivity nativeShopActivity, boolean z, boolean z2, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a221003", new Object[]{nativeShopActivity, new Boolean(z), new Boolean(z2), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        nativeShopActivity.a(z, z2);
    }

    private final void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.g == null) {
        } else {
            if ((!this.L || !H()) && !z2) {
                return;
            }
            c(z);
            ShopView shopView = this.e;
            if (shopView != null) {
                shopView.updateTopViewTransparentStyle(z);
            } else {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
        }
    }

    private final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.g;
        if (view == null) {
            return;
        }
        DinamicXEngine dinamicXEngine = this.f;
        if (dinamicXEngine == null) {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        } else if (view != null) {
            com.alibaba.triver.triver_shop.newShop.ext.h.a(dinamicXEngine, view, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_IS_TRANSPARENT, Boolean.valueOf(z));
        } else {
            kotlin.jvm.internal.q.b("topView");
            throw null;
        }
    }

    private final void d(boolean z) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (!this.L || !H() || (view = this.i) == null) {
        } else {
            DinamicXEngine dinamicXEngine = this.f;
            if (dinamicXEngine == null) {
                kotlin.jvm.internal.q.b("dxEngine");
                throw null;
            } else if (view != null) {
                com.alibaba.triver.triver_shop.newShop.ext.h.a(dinamicXEngine, view, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_IS_SHOW_NEW_LIVE_CARD, Boolean.valueOf(z));
            } else {
                kotlin.jvm.internal.q.b("secondView");
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class l implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3794a;

        /* loaded from: classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NativeShopActivity f3795a;

            public a(NativeShopActivity nativeShopActivity) {
                this.f3795a = nativeShopActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NativeShopActivity.a(this.f3795a, false, false, 2, (Object) null);
                NativeShopActivity.b(this.f3795a, false);
            }
        }

        /* loaded from: classes3.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NativeShopActivity f3796a;
            public final /* synthetic */ Pair<Integer, Integer> b;

            public b(NativeShopActivity nativeShopActivity, Pair<Integer, Integer> pair) {
                this.f3796a = nativeShopActivity;
                this.b = pair;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                c h = NativeShopActivity.h(this.f3796a);
                if (h == null) {
                    kotlin.jvm.internal.q.b("bottomBarManager");
                    throw null;
                }
                h.a(this.b.getFirst().intValue());
                c h2 = NativeShopActivity.h(this.f3796a);
                if (h2 == null) {
                    kotlin.jvm.internal.q.b("bottomBarManager");
                    throw null;
                }
                h2.a(this.b.getFirst().intValue(), this.b.getSecond().intValue());
                DinamicXEngine i = NativeShopActivity.i(this.f3796a);
                if (i == null) {
                    kotlin.jvm.internal.q.b("dxEngine");
                    throw null;
                }
                View j = NativeShopActivity.j(this.f3796a);
                if (j != null) {
                    com.alibaba.triver.triver_shop.newShop.ext.h.a(i, j, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, this.b.getFirst());
                } else {
                    kotlin.jvm.internal.q.b("bottomView");
                    throw null;
                }
            }
        }

        static {
            kge.a(-794123208);
            kge.a(-810970374);
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
        public void b_(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c67489a2", new Object[]{this, str, jSONObject});
            }
        }

        public l(NativeShopActivity this$0) {
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3794a = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
        public com.alibaba.triver.triver_shop.newShop.data.d a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("820aec79", new Object[]{this});
            }
            if (NativeShopActivity.b(this.f3794a) != null) {
                com.alibaba.triver.triver_shop.newShop.data.d b2 = NativeShopActivity.b(this.f3794a);
                if (b2 != null) {
                    return b2;
                }
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
            return null;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (str == null) {
            } else {
                List a2 = kotlin.text.n.a((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
                if (a2.size() < 3) {
                    return;
                }
                int a3 = com.alibaba.triver.triver_shop.newShop.ext.b.a((String) a2.get(0));
                int a4 = com.alibaba.triver.triver_shop.newShop.ext.b.a((String) (kotlin.jvm.internal.q.a((Object) "0", a2.get(2)) ? a2.get(1) : a2.get(2)));
                ceg.a aVar = ceg.Companion;
                aVar.a("onPageReady : mainTab = " + a3 + " subTab = " + a4);
                if (a3 != NativeShopActivity.e(this.f3794a) || a4 != NativeShopActivity.f(this.f3794a)) {
                    ceg.Companion.a("onPageRead : but mainIndex and subIndex not match");
                } else {
                    com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(this.f3794a).a(a3, a4, this.f3794a.a("shopId"));
                }
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (NativeShopActivity.g(this.f3794a) == null) {
            } else {
                final NativeShopActivity nativeShopActivity = this.f3794a;
                nativeShopActivity.runOnUiThread(new Runnable() { // from class: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$OnInnerPageReadyListener$onCardExitFullScreen$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ShopView g = NativeShopActivity.g(NativeShopActivity.this);
                        if (g == null) {
                            q.b("shopView");
                            throw null;
                        }
                        g.resetScrollContainer();
                        ShopView g2 = NativeShopActivity.g(NativeShopActivity.this);
                        if (g2 != null) {
                            g2.liveCardExpanded(false);
                        } else {
                            q.b("shopView");
                            throw null;
                        }
                    }
                });
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (NativeShopActivity.g(this.f3794a) == null) {
            } else {
                final NativeShopActivity nativeShopActivity = this.f3794a;
                nativeShopActivity.runOnUiThread(new Runnable() { // from class: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$OnInnerPageReadyListener$onCardFullScreen$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ShopView g = NativeShopActivity.g(NativeShopActivity.this);
                        if (g == null) {
                            q.b("shopView");
                            throw null;
                        }
                        g.stopScrollContainer();
                        ShopView g2 = NativeShopActivity.g(NativeShopActivity.this);
                        if (g2 != null) {
                            g2.liveCardExpanded(true);
                        } else {
                            q.b("shopView");
                            throw null;
                        }
                    }
                });
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            NativeShopActivity nativeShopActivity = this.f3794a;
            nativeShopActivity.runOnUiThread(new a(nativeShopActivity));
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            } else if (str == null) {
            } else {
                com.alibaba.triver.triver_shop.newShop.data.d b2 = NativeShopActivity.b(this.f3794a);
                if (b2 == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
                b2.a(str, str2);
                com.alibaba.triver.triver_shop.newShop.data.d b3 = NativeShopActivity.b(this.f3794a);
                if (b3 == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
                Pair<Integer, Integer> a2 = com.alibaba.triver.triver_shop.newShop.ext.h.a(str, b3.I());
                NativeShopActivity nativeShopActivity = this.f3794a;
                nativeShopActivity.runOnUiThread(new b(nativeShopActivity, a2));
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
        public void a(boolean z, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.b.b(new NativeShopActivity$OnInnerPageReadyListener$onSubscribeStatusChanged$1(this.f3794a, z, jSONObject));
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
        public void a(JSONArray jSONArray) {
            Object m2371constructorimpl;
            com.alibaba.triver.triver_shop.newShop.data.d b2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                return;
            }
            NativeShopActivity nativeShopActivity = this.f3794a;
            try {
                Result.a aVar = Result.Companion;
                b2 = NativeShopActivity.b(nativeShopActivity);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
            }
            if (b2 == null) {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
            b2.b(jSONArray);
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.t.INSTANCE);
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl == null) {
                return;
            }
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a
        public void b_(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3220692c", new Object[]{this, jSONObject});
            } else if (NativeShopActivity.b(this.f3794a) == null) {
            } else {
                com.alibaba.triver.triver_shop.newShop.data.d b2 = NativeShopActivity.b(this.f3794a);
                if (b2 != null) {
                    b2.A().a(jSONObject);
                } else {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
            }
        }
    }

    private final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.h;
        if (view == null) {
            return;
        }
        DinamicXEngine dinamicXEngine = this.f;
        if (dinamicXEngine == null) {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        } else if (view != null) {
            com.alibaba.triver.triver_shop.newShop.ext.h.a(dinamicXEngine, view, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_IS_SHOW_LIVE_ICON, Boolean.valueOf(z));
        } else {
            kotlin.jvm.internal.q.b("bottomView");
            throw null;
        }
    }

    private final Uri o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("82b5d2ad", new Object[]{this});
        }
        Object[] objArr = new Object[2];
        objArr[0] = getIntent();
        Intent intent = getIntent();
        objArr[1] = intent == null ? null : intent.getData();
        if (com.alibaba.triver.triver_shop.newShop.ext.b.a(objArr)) {
            ceg.Companion.b("intent or intent.data is null , downgrade failed , will finish activity");
            return null;
        }
        return com.alibaba.triver.triver_shop.newShop.ext.f.a(getIntent().getData());
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134be0d8", new Object[]{this, new Integer(i2)});
        } else if (i2 != 1) {
        } else {
            super.setRequestedOrientation(i2);
        }
    }

    private final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        NativeShopActivity$downgradeToMiniAppShop$block$1 nativeShopActivity$downgradeToMiniAppShop$block$1 = new NativeShopActivity$downgradeToMiniAppShop$block$1(this);
        if (com.alibaba.triver.triver_shop.newShop.ext.b.a()) {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new NativeShopActivity$downgradeToMiniAppShop$1(nativeShopActivity$downgradeToMiniAppShop$block$1));
        } else {
            nativeShopActivity$downgradeToMiniAppShop$block$1.mo2427invoke();
        }
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.a(new NativeShopActivity$requestFloatData$1(this), 1000L);
        }
    }

    private final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        String a2 = a("sellerId");
        if (a2 == null) {
            return;
        }
        r rVar = new r();
        if (cen.Companion.m()) {
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
            if (dVar != null) {
                rVar.a(dVar.ak());
                return;
            } else {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
        }
        com.alibaba.triver.triver_shop.c.c(this, a2, rVar);
    }

    private final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            runOnUiThread(new y(z));
        }
    }

    private final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        g(a());
        t();
    }

    private final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        View view = this.g;
        if (view == null || !this.M) {
            return;
        }
        if (view != null) {
            JSONObject jSONObject = (JSONObject) ((DXRootView) view).getData().clone();
            JSONObject jSONObject2 = jSONObject.getJSONObject("carData");
            if (jSONObject2 != null) {
                jSONObject2.put("followStatus", (Object) Boolean.valueOf(this.I));
            }
            DinamicXEngine dinamicXEngine = this.f;
            if (dinamicXEngine == null) {
                kotlin.jvm.internal.q.b("dxEngine");
                throw null;
            }
            View view2 = this.g;
            if (view2 != null) {
                dinamicXEngine.a((DXRootView) view2, jSONObject);
                return;
            } else {
                kotlin.jvm.internal.q.b("topView");
                throw null;
            }
        }
        kotlin.jvm.internal.q.b("topView");
        throw null;
    }

    private final void g(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.g;
        if (view == null || !this.M) {
            return;
        }
        if (view != null) {
            JSONObject jSONObject = (JSONObject) ((DXRootView) view).getData().clone();
            com.alibaba.triver.triver_shop.newShop.data.g K = K();
            boolean z3 = K != null && K.d();
            if (!(K != null && K.q())) {
                jSONObject.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_IS_TRANSPARENT, (String) true);
                JSONObject jSONObject2 = jSONObject.getJSONObject("carData");
                if (jSONObject2 != null) {
                    jSONObject2.put("isDarkBg", (Object) Boolean.valueOf(z3));
                }
                DinamicXEngine dinamicXEngine = this.f;
                if (dinamicXEngine == null) {
                    kotlin.jvm.internal.q.b("dxEngine");
                    throw null;
                }
                View view2 = this.g;
                if (view2 == null) {
                    kotlin.jvm.internal.q.b("topView");
                    throw null;
                }
                dinamicXEngine.a((DXRootView) view2, jSONObject);
                ShopView shopView = this.e;
                if (shopView != null) {
                    shopView.updateTopViewTransparentStyle(true);
                    return;
                } else {
                    kotlin.jvm.internal.q.b("shopView");
                    throw null;
                }
            }
            if (!z) {
                jSONObject.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_IS_TRANSPARENT, (String) false);
                JSONObject jSONObject3 = jSONObject.getJSONObject("carData");
                if (jSONObject3 != null) {
                    jSONObject3.put("isDarkBg", (Object) false);
                }
                ShopView shopView2 = this.e;
                if (shopView2 == null) {
                    kotlin.jvm.internal.q.b("shopView");
                    throw null;
                }
                shopView2.updateTopViewTransparentStyle(false);
            } else {
                boolean b2 = b();
                jSONObject.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_IS_TRANSPARENT, (String) Boolean.valueOf(b2));
                JSONObject jSONObject4 = jSONObject.getJSONObject("carData");
                if (jSONObject4 != null) {
                    if (b2) {
                        z2 = z3;
                    }
                    jSONObject4.put("isDarkBg", (Object) Boolean.valueOf(z2));
                }
                ShopView shopView3 = this.e;
                if (shopView3 == null) {
                    kotlin.jvm.internal.q.b("shopView");
                    throw null;
                }
                shopView3.updateTopViewTransparentStyle(b2);
            }
            DinamicXEngine dinamicXEngine2 = this.f;
            if (dinamicXEngine2 == null) {
                kotlin.jvm.internal.q.b("dxEngine");
                throw null;
            }
            View view3 = this.g;
            if (view3 != null) {
                dinamicXEngine2.a((DXRootView) view3, jSONObject);
                return;
            } else {
                kotlin.jvm.internal.q.b("topView");
                throw null;
            }
        }
        kotlin.jvm.internal.q.b("topView");
        throw null;
    }

    public final String a(String str) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str != null && getIntent() != null && (data = getIntent().getData()) != null) {
            return data.getQueryParameter(str);
        }
        return null;
    }

    private final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        ShopView shopView = this.e;
        if (shopView == null) {
            kotlin.jvm.internal.q.b("shopView");
            throw null;
        }
        shopView.setFirstHeaderView(d(), false);
        ShopView shopView2 = this.e;
        if (shopView2 == null) {
            kotlin.jvm.internal.q.b("shopView");
            throw null;
        }
        shopView2.setSecondHeaderView(e(), false);
        ShopView shopView3 = this.e;
        if (shopView3 == null) {
            kotlin.jvm.internal.q.b("shopView");
            throw null;
        }
        shopView3.setFirstHeaderView(f(), true);
        ShopView shopView4 = this.e;
        if (shopView4 == null) {
            kotlin.jvm.internal.q.b("shopView");
            throw null;
        }
        shopView4.setSecondHeaderView(g(), true);
        ShopView shopView5 = this.e;
        if (shopView5 == null) {
            kotlin.jvm.internal.q.b("shopView");
            throw null;
        }
        shopView5.setShopLoftEntrance(h());
        ShopView shopView6 = this.e;
        if (shopView6 == null) {
            kotlin.jvm.internal.q.b("shopView");
            throw null;
        }
        shopView6.setTabViewInVideoShop(i());
        com.alibaba.triver.triver_shop.newShop.ext.o.d(d());
        com.alibaba.triver.triver_shop.newShop.ext.o.d(e());
        com.alibaba.triver.triver_shop.newShop.ext.o.d(f());
        com.alibaba.triver.triver_shop.newShop.ext.o.d(g());
        com.alibaba.triver.triver_shop.newShop.ext.o.e(h());
        com.alibaba.triver.triver_shop.newShop.ext.o.e(i());
        com.alibaba.triver.triver_shop.newShop.ext.o.a(d(), e(), f(), g(), h(), i());
    }

    private final boolean v() {
        JSONArray jSONArray;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue();
        }
        if (getIntent() != null) {
            Intent intent = getIntent();
            if ((intent == null ? null : intent.getExtras()) != null) {
                boolean booleanExtra = getIntent().getBooleanExtra(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ENABLE_NEW_START_AC_LOGIC, true);
                Bundle extras = getIntent().getExtras();
                if (booleanExtra) {
                    extras = com.alibaba.triver.triver_shop.newShop.data.e.INSTANCE.a(getIntent().getLongExtra("shopBundleId", 0L));
                }
                if (extras == null) {
                    return false;
                }
                Serializable serializable = extras.getSerializable(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_TEMPLATE_LIST);
                if (serializable instanceof ArrayList) {
                    jSONArray = new JSONArray((List) serializable);
                } else if (serializable instanceof JSONArray) {
                    jSONArray = (JSONArray) serializable;
                } else {
                    jSONArray = null;
                }
                Serializable serializable2 = extras.getSerializable(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_FETCH);
                if (booleanExtra) {
                    if (serializable2 instanceof JSONObject) {
                        jSONObject = (JSONObject) serializable2;
                    } else {
                        jSONObject = null;
                    }
                } else if (!kotlin.jvm.internal.x.h(serializable2)) {
                    jSONObject = null;
                } else if (serializable2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
                } else {
                    jSONObject = new JSONObject(kotlin.jvm.internal.x.i(serializable2));
                }
                if (jSONObject == null || jSONArray == null) {
                    a("shopFetch is null or template list is null", 1);
                    return false;
                }
                this.F = jSONObject;
                this.G = jSONArray;
                Intent intent2 = getIntent();
                Uri data = intent2 == null ? null : intent2.getData();
                if (data != null) {
                    String queryParameter = data.getQueryParameter(ShopRenderActivity.SHOP_NAVI);
                    String queryParameter2 = data.getQueryParameter("weexShopTab");
                    this.A = data.getQueryParameter("weexShopSubTab");
                    if (queryParameter != null) {
                        this.z = queryParameter;
                    }
                    if (queryParameter2 != null) {
                        this.x = queryParameter2;
                    }
                    String str = this.A;
                    if (str != null) {
                        if (str == null) {
                            str = "";
                        }
                        this.y = str;
                    }
                    try {
                        Result.a aVar = Result.Companion;
                        for (String str2 : data.getQueryParameterNames()) {
                            this.R.put(str2, data.getQueryParameter(str2));
                        }
                        Result.m2371constructorimpl(kotlin.t.INSTANCE);
                    } catch (Throwable th) {
                        Result.a aVar2 = Result.Companion;
                        Result.m2371constructorimpl(kotlin.i.a(th));
                    }
                }
                Intent intent3 = getIntent();
                this.D = new com.alibaba.triver.triver_shop.newShop.data.d(jSONObject, intent3 == null ? null : intent3.getData());
                com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
                if (dVar == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
                dVar.a(booleanExtra);
                if (booleanExtra) {
                    com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.D;
                    if (dVar2 == null) {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    }
                    dVar2.a(extras);
                }
                com.alibaba.triver.triver_shop.newShop.data.d dVar3 = this.D;
                if (dVar3 == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
                dVar3.a((Context) this);
                com.alibaba.triver.triver_shop.newShop.data.d dVar4 = this.D;
                if (dVar4 == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                } else if (!dVar4.Z()) {
                    a("shopDataParse is valid", 2);
                    ceg.Companion.b("shopDataParse is valid");
                    return false;
                } else {
                    com.alibaba.triver.triver_shop.newShop.data.d dVar5 = this.D;
                    if (dVar5 == null) {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    }
                    this.K = dVar5.ag();
                    com.alibaba.triver.triver_shop.newShop.data.d dVar6 = this.D;
                    if (dVar6 == null) {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    }
                    this.L = dVar6.ac();
                    com.alibaba.triver.triver_shop.newShop.data.d dVar7 = this.D;
                    if (dVar7 == null) {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    }
                    this.M = dVar7.an();
                    com.alibaba.triver.triver_shop.newShop.data.d dVar8 = this.D;
                    if (dVar8 != null) {
                        this.N = dVar8.ao();
                        return true;
                    }
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
            }
        }
        a("intent or extra is null", 0);
        return false;
    }

    private final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        this.c.a(new e(this));
        this.c.a(com.alibaba.triver.triver_shop.newShop.data.h.headerBangDan, new e(this));
        this.c.a(com.alibaba.triver.triver_shop.newShop.data.h.bottomBarArea, new b(this));
        this.c.a(com.alibaba.triver.triver_shop.newShop.data.h.headerGoodsNavArea, new j(this));
        this.c.a(com.alibaba.triver.triver_shop.newShop.data.h.headerIndexNavArea, new g(this));
        this.c.a(com.alibaba.triver.triver_shop.newShop.data.h.headerSearchGoodsArea, new e(this));
        this.c.a(com.alibaba.triver.triver_shop.newShop.data.h.headerGoodsNavArea, new m(this));
        this.c.a(com.alibaba.triver.triver_shop.newShop.data.h.headerInfoArea, new i(this));
        this.c.a(com.alibaba.triver.triver_shop.newShop.data.h.headerLoftEntrance, new n(this));
        this.c.a(com.alibaba.triver.triver_shop.newShop.data.h.headerIndexVideoShop, new h(this));
    }

    private final int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue();
        }
        int identifier = getApplication().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return getApplication().getResources().getDimensionPixelSize(identifier);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (this.f != null) {
            return;
        }
        kotlin.jvm.internal.q.b("dxEngine");
        throw null;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object m2371constructorimpl;
        com.alibaba.triver.triver_shop.newShop.data.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.H = false;
        DinamicXEngine dinamicXEngine = this.f;
        if (dinamicXEngine == null) {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
        dinamicXEngine.m();
        ShopView shopView = this.e;
        if (shopView != null) {
            if (shopView == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            shopView.onActivityResumed();
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new NativeShopActivity$onResume$2(this));
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
        try {
            Result.a aVar = Result.Companion;
            if (!this.U && this.V) {
                Intent intent = getIntent();
                kotlin.jvm.internal.q.b(intent, "intent");
                com.alibaba.triver.triver_shop.newShop.ext.h.a(intent, this);
                this.U = true;
            }
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
        NativeShopActivity nativeShopActivity = this;
        com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(nativeShopActivity).a(a("shopId"));
        com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(nativeShopActivity).b(a("shopId"));
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new NativeShopActivity$onResume$4(this));
        try {
            Result.a aVar3 = Result.Companion;
            dVar = this.D;
        } catch (Throwable th2) {
            Result.a aVar4 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th2));
        }
        if (dVar == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.k.a(dVar);
        com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.D;
        if (dVar2 == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.k.b(dVar2);
        if (this.O) {
            com.alibaba.triver.triver_shop.newShop.data.d dVar3 = this.D;
            if (dVar3 == null) {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.k.i(dVar3);
        }
        Result.m2371constructorimpl(kotlin.t.INSTANCE);
        ceg.Companion.a("native shop onResume");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        y();
        super.onPause();
        this.H = true;
        DinamicXEngine dinamicXEngine = this.f;
        if (dinamicXEngine != null && dinamicXEngine == null) {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
        ShopView shopView = this.e;
        if (shopView != null) {
            if (shopView == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            shopView.onActivityPaused();
        }
        ceg.Companion.a("native shop onPause");
    }

    private final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        if (A() && !this.M && !this.N) {
            NativeShopActivity nativeShopActivity = this;
            com.alibaba.triver.triver_shop.newShop.ext.m.b(nativeShopActivity);
            com.alibaba.triver.triver_shop.newShop.ext.m.a(nativeShopActivity, ai.b(kotlin.j.a("shop_id", a("shopId")), kotlin.j.a("seller_id", a("sellerId"))));
        }
        if (H() && !this.M && !this.N) {
            NativeShopActivity nativeShopActivity2 = this;
            com.alibaba.triver.triver_shop.newShop.ext.m.a(nativeShopActivity2);
            com.alibaba.triver.triver_shop.newShop.ext.m.a(nativeShopActivity2, ai.b(kotlin.j.a("shop_id", a("shopId")), kotlin.j.a("seller_id", a("sellerId"))));
        }
        z();
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(this).c(a("shopId"));
    }

    private final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else if (this.D == null) {
        } else {
            if (!this.N && !this.M) {
                return;
            }
            NativeShopActivity nativeShopActivity = this;
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
            if (dVar != null) {
                com.alibaba.triver.triver_shop.newShop.ext.m.a(nativeShopActivity, dVar);
            } else {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
        }
    }

    private final boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : kotlin.jvm.internal.q.a((Object) a(), (Object) "allitems");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        DinamicXEngine dinamicXEngine = this.f;
        if (dinamicXEngine == null) {
            return;
        }
        if (dinamicXEngine != null) {
            dinamicXEngine.n();
        } else {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object m2371constructorimpl;
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            Result.a aVar = Result.Companion;
            B();
            dinamicXEngine = this.f;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        if (dinamicXEngine == null) {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
        dinamicXEngine.o();
        this.c.j();
        com.alibaba.triver.triver_shop.f.INSTANCE.c().b((com.alibaba.triver.triver_shop.newShop.manager.g<Activity>) this);
        com.alibaba.triver.triver_shop.newShop.manager.b.INSTANCE.a(this);
        com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(this).a();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.d);
        m2371constructorimpl = Result.m2371constructorimpl(kotlin.t.INSTANCE);
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("onDestroy exp : ", m2374exceptionOrNullimpl);
        }
        ceg.Companion.b("nShop destroyed");
    }

    private final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else if (!cen.Companion.n()) {
        } else {
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
            if (dVar != null) {
                LocalBroadcastManager.getInstance(dVar.am()).sendBroadcast(new Intent(com.taobao.android.miniLive.sdk.d.PAGE_SHOP_PAUSE_ACTION));
            } else {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
        }
    }

    private final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        com.taobao.android.dinamicx.d.a(this, new v.a(), true);
        this.f = new DinamicXEngine(new DXEngineConfig.a("shop").b(2).c(true).a());
        DinamicXEngine dinamicXEngine = this.f;
        if (dinamicXEngine == null) {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
        dinamicXEngine.a(com.alibaba.triver.triver_shop.newShop.ext.g.TB_SHOP_TAP_EVENT_CODE, new o(this));
        DinamicXEngine dinamicXEngine2 = this.f;
        if (dinamicXEngine2 != null) {
            dinamicXEngine2.a(new s());
        } else {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
    }

    private final JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("efd4af15", new Object[]{this, str});
        }
        JSONArray jSONArray = this.G;
        if (jSONArray == null) {
            return null;
        }
        kotlin.jvm.internal.q.a(jSONArray);
        int size = jSONArray.size();
        if (size > 0) {
            while (true) {
                int i3 = i2 + 1;
                JSONArray jSONArray2 = this.G;
                kotlin.jvm.internal.q.a(jSONArray2);
                Object obj = jSONArray2.get(i2);
                if ((obj instanceof HashMap) && kotlin.jvm.internal.q.a((Object) str, ((Map) obj).get("templateName"))) {
                    return com.alibaba.triver.triver_shop.newShop.ext.h.b(new JSONObject((HashMap) obj));
                }
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (kotlin.jvm.internal.q.a((Object) str, jSONObject.get("templateName"))) {
                        return com.alibaba.triver.triver_shop.newShop.ext.h.b(jSONObject);
                    }
                }
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
            }
        }
        return null;
    }

    private final void a(JSONObject jSONObject, rul<? super View, kotlin.t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2349aacf", new Object[]{this, jSONObject, rulVar});
            return;
        }
        JSONObject d2 = d("tb_shop_bottom_bar");
        if (d2 == null) {
            return;
        }
        a(d2, jSONObject, rulVar);
    }

    private final void b(JSONObject jSONObject, rul<? super View, kotlin.t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc1386e", new Object[]{this, jSONObject, rulVar});
            return;
        }
        JSONObject d2 = d("tb_shop_header_index_nav");
        if (d2 == null) {
            return;
        }
        a(d2, jSONObject, rulVar);
    }

    private final void c(JSONObject jSONObject, rul<? super View, kotlin.t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9638c60d", new Object[]{this, jSONObject, rulVar});
            return;
        }
        JSONObject d2 = d("tb_shop_header_search_goods");
        if (d2 == null) {
            return;
        }
        a(d2, jSONObject, rulVar);
    }

    private final void d(JSONObject jSONObject, rul<? super View, kotlin.t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb053ac", new Object[]{this, jSONObject, rulVar});
            return;
        }
        JSONObject d2 = d("tb_shop_header_info");
        if (d2 == null) {
            return;
        }
        a(d2, jSONObject, rulVar);
    }

    private final void e(JSONObject jSONObject, rul<? super View, kotlin.t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927e14b", new Object[]{this, jSONObject, rulVar});
            return;
        }
        JSONObject d2 = d("tb_shop_header_goods_nav");
        if (d2 == null) {
            return;
        }
        a(d2, jSONObject, rulVar);
    }

    private final void f(JSONObject jSONObject, rul<? super View, kotlin.t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29f6eea", new Object[]{this, jSONObject, rulVar});
            return;
        }
        JSONObject d2 = d("tb_shop_header_loft_entrance");
        if (d2 == null) {
            return;
        }
        a(d2, jSONObject, rulVar);
    }

    private final void g(JSONObject jSONObject, rul<? super View, kotlin.t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c16fc89", new Object[]{this, jSONObject, rulVar});
            return;
        }
        JSONObject d2 = d("tb_shop_header_tab_index");
        if (d2 == null) {
            return;
        }
        a(d2, jSONObject, rulVar);
    }

    private final void a(JSONObject jSONObject, JSONObject jSONObject2, rul<? super View, kotlin.t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce29faf", new Object[]{this, jSONObject, jSONObject2, rulVar});
            return;
        }
        DinamicXEngine dinamicXEngine = this.f;
        if (dinamicXEngine == null) {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
        DXTemplateItem a2 = dinamicXEngine.a(b(jSONObject));
        if (a2 != null && StringUtils.equals(jSONObject.getString("version"), String.valueOf(a2.b))) {
            rulVar.mo2421invoke(a(a2, jSONObject2));
            a(j() + 1);
            b(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_PAGE_LOADED);
            ceg.Companion.b(kotlin.jvm.internal.q.a("dx template fetch success : ", (Object) a2.toString()));
            return;
        }
        a(jSONObject, new NativeShopActivity$fetchAndDownloadDxTemplate$1(rulVar, this, jSONObject2, jSONObject));
    }

    private final View a(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93565181", new Object[]{this, dXTemplateItem, jSONObject});
        }
        DinamicXEngine dinamicXEngine = this.f;
        if (dinamicXEngine == null) {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
        DXTemplateItem a2 = dinamicXEngine.a(dXTemplateItem);
        DinamicXEngine dinamicXEngine2 = this.f;
        if (dinamicXEngine2 == null) {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
        DXResult<DXRootView> b2 = dinamicXEngine2.b(this, a2);
        DinamicXEngine dinamicXEngine3 = this.f;
        if (dinamicXEngine3 == null) {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
        dinamicXEngine3.a(b2.f11780a, jSONObject);
        DXRootView dXRootView = b2.f11780a;
        kotlin.jvm.internal.q.b(dXRootView, "viewResult.result");
        com.alibaba.triver.triver_shop.newShop.ext.o.g(dXRootView);
        DXRootView dXRootView2 = b2.f11780a;
        kotlin.jvm.internal.q.b(dXRootView2, "viewResult.result");
        return dXRootView2;
    }

    private final void a(JSONObject jSONObject, ruw<? super DXTemplateItem, ? super Boolean, kotlin.t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("234eaae4", new Object[]{this, jSONObject, ruwVar});
            return;
        }
        DXTemplateItem b2 = b(jSONObject);
        String str = b2.f11925a;
        kotlin.jvm.internal.q.b(str, "dxTemplateItem.name");
        this.b.put(str, ruwVar);
        DinamicXEngine dinamicXEngine = this.f;
        if (dinamicXEngine != null) {
            dinamicXEngine.a(kotlin.collections.p.a(b2));
        } else {
            kotlin.jvm.internal.q.b("dxEngine");
            throw null;
        }
    }

    private final DXTemplateItem b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("63ac96f8", new Object[]{this, jSONObject});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        Object obj = jSONObject.get("url");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        dXTemplateItem.c = (String) obj;
        dXTemplateItem.b = Long.parseLong(String.valueOf(jSONObject.get("version")));
        Object obj2 = jSONObject.get("name");
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        dXTemplateItem.f11925a = (String) obj2;
        return dXTemplateItem;
    }

    private final void c(JSONObject jSONObject) {
        Pair<Integer, Integer> a2;
        int intValue;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        if (this.L) {
            ShopView shopView = this.e;
            if (shopView == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            shopView.changeToBigCardMode();
        }
        ShopView shopView2 = this.e;
        if (shopView2 == null) {
            kotlin.jvm.internal.q.b("shopView");
            throw null;
        }
        shopView2.setHasLoft(this.K);
        this.E = new c(this);
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
        if (dVar == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        JSONObject af = dVar.af();
        com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.D;
        if (dVar2 == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        JSONObject M = dVar2.M();
        JSONObject jSONObject2 = M;
        jSONObject2.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_IS_SHOW_LIVE_ICON, (String) Boolean.valueOf(this.L));
        com.alibaba.triver.triver_shop.newShop.data.d dVar3 = this.D;
        if (dVar3 == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        JSONObject P = dVar3.P();
        com.alibaba.triver.triver_shop.newShop.data.d dVar4 = this.D;
        if (dVar4 == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        JSONObject Q = dVar4.Q();
        com.alibaba.triver.triver_shop.newShop.data.d dVar5 = this.D;
        if (dVar5 == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        JSONArray jSONArray = dVar5.M().getJSONArray("tabData");
        com.alibaba.triver.triver_shop.newShop.data.d dVar6 = this.D;
        if (dVar6 == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        JSONObject O = dVar6.O();
        com.alibaba.triver.triver_shop.newShop.data.d dVar7 = this.D;
        if (dVar7 == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        JSONArray I = dVar7.I();
        new Pair(0, 0);
        if (jSONArray == null) {
            intValue = 0;
        } else {
            if (this.z.length() == 0) {
                i2 = 1;
            }
            if (i2 != 0) {
                String str = this.A;
                if (str == null) {
                    str = "";
                }
                this.z = str;
            }
            if (!StringUtils.isEmpty(this.z)) {
                a2 = com.alibaba.triver.triver_shop.newShop.ext.h.a(this.z, I);
            } else {
                String str2 = this.x;
                String str3 = this.y;
                com.alibaba.triver.triver_shop.newShop.data.d dVar8 = this.D;
                if (dVar8 == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
                a2 = com.alibaba.triver.triver_shop.newShop.ext.h.a(str2, str3, dVar8);
            }
            int intValue2 = a2.getFirst().intValue();
            intValue = a2.getSecond().intValue();
            i2 = intValue2;
        }
        jSONObject2.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, (String) Integer.valueOf(i2));
        if (i2 == 0) {
            P.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, (String) Integer.valueOf(intValue));
        }
        if (i2 == 1) {
            Q.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, (String) Integer.valueOf(intValue));
        }
        a(M, new NativeShopActivity$onFetchDataOk$1(this));
        b(P, new NativeShopActivity$onFetchDataOk$2(this));
        c(O, new NativeShopActivity$onFetchDataOk$3(this));
        com.alibaba.triver.triver_shop.newShop.data.d dVar9 = this.D;
        if (dVar9 == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        d(dVar9.N(), new NativeShopActivity$onFetchDataOk$4(this));
        e(Q, new NativeShopActivity$onFetchDataOk$5(this));
        f(af, new NativeShopActivity$onFetchDataOk$6(this));
        g(P, new NativeShopActivity$onFetchDataOk$7(this));
        this.B = i2;
        this.C = intValue;
        c cVar = this.E;
        if (cVar == null) {
            kotlin.jvm.internal.q.b("bottomBarManager");
            throw null;
        }
        cVar.a(i2);
        c cVar2 = this.E;
        if (cVar2 == null) {
            kotlin.jvm.internal.q.b("bottomBarManager");
            throw null;
        }
        cVar2.a(i2, intValue);
        try {
            Result.a aVar = Result.Companion;
            a(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_TAB_KEY_NAME, a());
            Result.m2371constructorimpl(kotlin.t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
        ShopView shopView3 = this.e;
        if (shopView3 == null) {
            kotlin.jvm.internal.q.b("shopView");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar10 = this.D;
        if (dVar10 != null) {
            shopView3.renderAtmosphereImg(dVar10.R());
        } else {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
    }

    private final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        Pair[] pairArr = new Pair[2];
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
        if (dVar == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        pairArr[0] = kotlin.j.a("shop_id", dVar.T());
        com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.D;
        if (dVar2 != null) {
            pairArr[1] = kotlin.j.a("seller_id", dVar2.U());
            com.alibaba.triver.triver_shop.newShop.ext.m.b(ShopConstants.PAGE_SHOP, str, ai.a(pairArr));
            return;
        }
        kotlin.jvm.internal.q.b("shopDataParser");
        throw null;
    }

    private final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        Pair[] pairArr = new Pair[2];
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
        if (dVar == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        pairArr[0] = kotlin.j.a("shop_id", dVar.T());
        com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.D;
        if (dVar2 != null) {
            pairArr[1] = kotlin.j.a("seller_id", dVar2.U());
            com.alibaba.triver.triver_shop.newShop.ext.m.a(ShopConstants.PAGE_SHOP, str, ai.a(pairArr));
            return;
        }
        kotlin.jvm.internal.q.b("shopDataParser");
        throw null;
    }

    private final String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d0c135", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
        if (dVar == null) {
            return this.x;
        }
        if (dVar != null) {
            JSONObject M = dVar.M();
            JSONArray jSONArray = new JSONArray();
            Object obj = M.get("tabData");
            if (!(obj instanceof JSONArray)) {
                obj = jSONArray;
            }
            JSONObject b2 = com.alibaba.triver.triver_shop.newShop.ext.d.b((JSONArray) obj, this.B);
            if (b2 != null) {
                String str = this.x;
                Object obj2 = b2.get("name");
                if (!(obj2 instanceof String)) {
                    obj2 = str;
                }
                return (String) obj2;
            }
            return this.x;
        }
        kotlin.jvm.internal.q.b("shopDataParser");
        throw null;
    }

    public final String a() {
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
        if (dVar == null) {
            return this.y;
        }
        if (dVar == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        JSONArray c2 = com.alibaba.triver.triver_shop.newShop.ext.d.c(dVar.I(), this.B);
        if (c2 != null && (b2 = com.alibaba.triver.triver_shop.newShop.ext.d.b(c2, this.C)) != null) {
            String str = this.y;
            Object obj = b2.get("name");
            if (!(obj instanceof String)) {
                obj = str;
            }
            return (String) obj;
        }
        return this.y;
    }

    private final void c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i2)});
            return;
        }
        if (i2 == 0) {
            ShopView shopView = this.e;
            if (shopView == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            shopView.switchToHomePageBottomTab();
        } else if (i2 == 1) {
            ShopView shopView2 = this.e;
            if (shopView2 == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            shopView2.switchToBabyBottomTab();
        } else {
            ShopView shopView3 = this.e;
            if (shopView3 == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            shopView3.switchToOtherBottomTab();
        }
        a(i2, this.C);
    }

    private final void d(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i2)});
        } else {
            a(this.B, i2);
        }
    }

    private final void a(int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        z();
        if (i2 == this.B && i3 == this.C) {
            ceg.Companion.b("same bottomIndex and subIndex, do not broadcast disappear");
        } else {
            com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(this).b(this.B, this.C, a("shopId"));
        }
        this.B = i2;
        this.C = i3;
        c cVar = this.E;
        if (cVar == null) {
            kotlin.jvm.internal.q.b("bottomBarManager");
            throw null;
        }
        Fragment c2 = cVar.c(this.B);
        if (c2 instanceof ShopStandardFragment) {
            this.C = ((ShopStandardFragment) c2).getCurrentSubTabIndex();
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new NativeShopActivity$toastCurrentTabIndex$1(this));
        com.alibaba.triver.triver_shop.newShop.manager.b.INSTANCE.a(this, a());
        ShopView shopView = this.e;
        if (shopView == null) {
            kotlin.jvm.internal.q.b("shopView");
            throw null;
        }
        shopView.onAtmosphere(G());
        ShopView shopView2 = this.e;
        if (shopView2 == null) {
            kotlin.jvm.internal.q.b("shopView");
            throw null;
        }
        shopView2.updateSubPageChanged(H(), F());
        if (this.M) {
            g(true);
        } else {
            if (this.L && H() && b()) {
                z = true;
            }
            a(z, true);
        }
        if (this.K) {
            if (this.L && H()) {
                com.alibaba.triver.triver_shop.newShop.ext.o.e(h());
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.o.b(h());
            }
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.e(h());
        }
        g(a());
        E();
        ceg.a aVar = ceg.Companion;
        aVar.b("bottom index is = " + this.B + ", subIndex is = " + this.C);
        ceg.Companion.b(kotlin.jvm.internal.q.a("isCurrentPage webView on Top : ", (Object) Boolean.valueOf(b())));
    }

    private final void E() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else if (!this.K || (view = this.l) == null) {
        } else {
            if (view != null) {
                JSONObject jSONObject = (JSONObject) ((DXRootView) view).getData().clone();
                jSONObject.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_PROMOTION_TAB, (String) Boolean.valueOf(G()));
                DinamicXEngine dinamicXEngine = this.f;
                if (dinamicXEngine == null) {
                    kotlin.jvm.internal.q.b("dxEngine");
                    throw null;
                }
                View view2 = this.l;
                if (view2 != null) {
                    dinamicXEngine.a((DXRootView) view2, jSONObject);
                    return;
                } else {
                    kotlin.jvm.internal.q.b("shopLoftEntranceView");
                    throw null;
                }
            }
            kotlin.jvm.internal.q.b("shopLoftEntranceView");
            throw null;
        }
    }

    private final String F() {
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fdc3673", new Object[]{this});
        }
        c cVar = this.E;
        if (cVar == null) {
            kotlin.jvm.internal.q.b("bottomBarManager");
            throw null;
        }
        Fragment c2 = cVar.c(this.B);
        if (c2 == null || !(c2 instanceof ShopStandardFragment)) {
            return "";
        }
        int currentSubTabIndex = ((ShopStandardFragment) c2).getCurrentSubTabIndex();
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
        if (dVar == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        JSONArray c3 = com.alibaba.triver.triver_shop.newShop.ext.d.c(dVar.I(), this.B);
        if (c3 == null || (b2 = com.alibaba.triver.triver_shop.newShop.ext.d.b(c3, currentSubTabIndex)) == null) {
            return "";
        }
        Object obj = b2.get("name");
        if (!(obj instanceof String)) {
            obj = "";
        }
        return (String) obj;
    }

    private final boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : kotlin.jvm.internal.q.a((Object) "promotion", (Object) a());
    }

    private final boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : kotlin.jvm.internal.q.a((Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_INDEX, (Object) a());
    }

    private final boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : kotlin.jvm.internal.q.a((Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_DONG_TAI, (Object) a());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.NativeShopActivity.g(java.lang.String):void");
    }

    /* loaded from: classes3.dex */
    public final class o extends com.taobao.android.dinamicx.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3799a;

        /* loaded from: classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object[] f3800a;
            public final /* synthetic */ NativeShopActivity b;
            public final /* synthetic */ DXRuntimeContext c;

            public a(Object[] objArr, NativeShopActivity nativeShopActivity, DXRuntimeContext dXRuntimeContext) {
                this.f3800a = objArr;
                this.b = nativeShopActivity;
                this.c = dXRuntimeContext;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.f3800a == null) {
                } else {
                    com.alibaba.triver.triver_shop.newShop.data.h H = NativeShopActivity.H(this.b);
                    com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(this.b);
                    if (b != null) {
                        H.a(b, this.f3800a, this.c);
                    } else {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    }
                }
            }
        }

        static {
            kge.a(-1117795640);
        }

        public o(NativeShopActivity this$0) {
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3799a = this$0;
        }

        @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
        public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                return;
            }
            NativeShopActivity nativeShopActivity = this.f3799a;
            nativeShopActivity.runOnUiThread(new a(objArr, nativeShopActivity, dXRuntimeContext));
        }
    }

    /* loaded from: classes3.dex */
    public class n extends h.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3798a;

        static {
            kge.a(1480397400);
        }

        public n(NativeShopActivity this$0) {
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3798a = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
        public void f(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("191d1089", new Object[]{this, obj});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "livesource", NativeShopActivity.y(this.f3798a) ? "shop2F_bigcard_off" : "shop2F_other");
            com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(this.f3798a);
            if (b == null) {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
            String b2 = b.b(jSONObject);
            ceg.Companion.b(kotlin.jvm.internal.q.a("new loft open brandZone , ", (Object) b2));
            if (b2 == null) {
                return;
            }
            Nav.from(this.f3798a).toUri(b2);
        }
    }

    /* loaded from: classes3.dex */
    public class e extends h.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity b;

        static {
            kge.a(-1505016536);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == -1507519932) {
                super.a(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public e(NativeShopActivity this$0) {
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.b = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            } else if (!(obj instanceof String)) {
            } else {
                if (NativeShopActivity.G(this.b)) {
                    com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(this.b);
                    if (b == null) {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    } else if (b.g((String) obj)) {
                        NativeShopActivity.b(this.b, "VideoLightShop_wangwang_click");
                    }
                }
                com.alibaba.triver.triver_shop.newShop.data.d b2 = NativeShopActivity.b(this.b);
                if (b2 == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
                if (kotlin.jvm.internal.q.a((Object) b2.aw(), obj)) {
                    if (NativeShopActivity.G(this.b)) {
                        NativeShopActivity.b(this.b, "VideoLightShop_search_click");
                    } else {
                        com.alibaba.triver.triver_shop.newShop.data.d b3 = NativeShopActivity.b(this.b);
                        if (b3 == null) {
                            kotlin.jvm.internal.q.b("shopDataParser");
                            throw null;
                        }
                        com.alibaba.triver.triver_shop.newShop.ext.j.c(b3);
                    }
                }
                com.alibaba.triver.triver_shop.newShop.data.d b4 = NativeShopActivity.b(this.b);
                if (b4 == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
                if (b4.a(obj)) {
                    if (NativeShopActivity.y(this.b)) {
                        com.alibaba.triver.triver_shop.newShop.data.d b5 = NativeShopActivity.b(this.b);
                        if (b5 == null) {
                            kotlin.jvm.internal.q.b("shopDataParser");
                            throw null;
                        }
                        com.alibaba.triver.triver_shop.newShop.ext.j.g(b5);
                    } else {
                        com.alibaba.triver.triver_shop.newShop.data.d b6 = NativeShopActivity.b(this.b);
                        if (b6 == null) {
                            kotlin.jvm.internal.q.b("shopDataParser");
                            throw null;
                        }
                        com.alibaba.triver.triver_shop.newShop.ext.j.h(b6);
                    }
                }
                com.alibaba.triver.triver_shop.newShop.data.d b7 = NativeShopActivity.b(this.b);
                if (b7 == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
                String str = (String) obj;
                if (b7.f(str)) {
                    com.alibaba.triver.triver_shop.newShop.data.d b8 = NativeShopActivity.b(this.b);
                    if (b8 == null) {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.j.i(b8);
                }
                Nav.from(this.b).toUri(str);
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
        public void c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
            } else {
                this.b.finish();
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
        public void d(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
                return;
            }
            NativeShopActivity nativeShopActivity = this.b;
            try {
                Result.a aVar = Result.Companion;
                if (!NativeShopActivity.p(nativeShopActivity)) {
                    com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(nativeShopActivity);
                    if (b == null) {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.j.d(b);
                } else {
                    com.alibaba.triver.triver_shop.newShop.data.d b2 = NativeShopActivity.b(nativeShopActivity);
                    if (b2 == null) {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.j.e(b2);
                }
                Result.m2371constructorimpl(kotlin.t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th));
            }
            if (NativeShopActivity.p(this.b)) {
                com.alibaba.triver.triver_shop.d dVar = com.alibaba.triver.triver_shop.d.INSTANCE;
                NativeShopActivity nativeShopActivity2 = this.b;
                NativeShopActivity nativeShopActivity3 = nativeShopActivity2;
                com.alibaba.triver.triver_shop.newShop.data.d b3 = NativeShopActivity.b(nativeShopActivity2);
                if (b3 != null) {
                    dVar.b(nativeShopActivity3, b3.U(), new NativeShopActivity$DefaultTbShopActionListener$follow$2(this.b));
                    return;
                } else {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
            }
            NativeShopActivity.I(this.b);
            if (!NativeShopActivity.G(this.b)) {
                return;
            }
            NativeShopActivity.b(this.b, "VideoLightShop_follow_click");
        }

        @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
        public void e(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ceeb7748", new Object[]{this, obj});
            } else if (this.b.getIntent() == null || this.b.getIntent().getData() == null) {
            } else {
                c h = NativeShopActivity.h(this.b);
                if (h == null) {
                    kotlin.jvm.internal.q.b("bottomBarManager");
                    throw null;
                }
                App a2 = com.alibaba.triver.triver_shop.newShop.ext.h.a(h.c(0));
                com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(this.b);
                if (b == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.j.a(b);
                com.alibaba.triver.triver_shop.d dVar = com.alibaba.triver.triver_shop.d.INSTANCE;
                NativeShopActivity nativeShopActivity = this.b;
                NativeShopActivity nativeShopActivity2 = nativeShopActivity;
                com.alibaba.triver.triver_shop.newShop.data.d b2 = NativeShopActivity.b(nativeShopActivity);
                if (b2 != null) {
                    dVar.b(nativeShopActivity2, b2.U(), new NativeShopActivity$DefaultTbShopActionListener$share$1(this.b, a2));
                } else {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            super.a(obj);
            NativeShopActivity.g(this.b, true);
        }
    }

    /* loaded from: classes3.dex */
    public final class m extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3797a;

        static {
            kge.a(704367158);
        }

        public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
            if (str.hashCode() == -1507519932) {
                super.a(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(NativeShopActivity this$0) {
            super(this$0);
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3797a = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.e, com.alibaba.triver.triver_shop.newShop.data.h.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            super.a(obj);
            if (obj == null || NativeShopActivity.b(this.f3797a) == null) {
                return;
            }
            if (NativeShopActivity.K(this.f3797a) == null) {
                ceg.Companion.b("switchTabTo babySecondView not init");
                return;
            }
            com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(this.f3797a);
            if (b == null) {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
            JSONObject Q = b.Q();
            int parseInt = Integer.parseInt((String) obj);
            Q.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, (String) Integer.valueOf(parseInt));
            DinamicXEngine i = NativeShopActivity.i(this.f3797a);
            if (i == null) {
                kotlin.jvm.internal.q.b("dxEngine");
                throw null;
            }
            View K = NativeShopActivity.K(this.f3797a);
            if (K == null) {
                kotlin.jvm.internal.q.b("babySecondView");
                throw null;
            }
            i.a((DXRootView) K, Q);
            c h = NativeShopActivity.h(this.f3797a);
            if (h == null) {
                kotlin.jvm.internal.q.b("bottomBarManager");
                throw null;
            }
            h.a(NativeShopActivity.e(this.f3797a), parseInt);
            NativeShopActivity nativeShopActivity = this.f3797a;
            com.alibaba.triver.triver_shop.newShop.data.d b2 = NativeShopActivity.b(nativeShopActivity);
            if (b2 != null) {
                NativeShopActivity.a(nativeShopActivity, b2, NativeShopActivity.e(this.f3797a), NativeShopActivity.f(this.f3797a), null, 8, null);
            } else {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3786a;

        static {
            kge.a(-808543701);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1507519932) {
                super.a(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NativeShopActivity this$0) {
            super(this$0);
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3786a = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.e, com.alibaba.triver.triver_shop.newShop.data.h.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            super.a(obj);
            if (obj == null || NativeShopActivity.b(this.f3786a) == null) {
                return;
            }
            int parseInt = Integer.parseInt((String) obj);
            if (parseInt == NativeShopActivity.e(this.f3786a) && NativeShopActivity.L(this.f3786a)) {
                return;
            }
            DinamicXEngine i = NativeShopActivity.i(this.f3786a);
            if (i == null) {
                kotlin.jvm.internal.q.b("dxEngine");
                throw null;
            }
            View j = NativeShopActivity.j(this.f3786a);
            if (j == null) {
                kotlin.jvm.internal.q.b("bottomView");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.h.a(i, j, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, Integer.valueOf(parseInt));
            c h = NativeShopActivity.h(this.f3786a);
            if (h == null) {
                kotlin.jvm.internal.q.b("bottomBarManager");
                throw null;
            }
            h.a(parseInt);
            com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(this.f3786a);
            if (b == null) {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
            if (b.az()) {
                NativeShopActivity.b(this.f3786a, "Page_Shop_Dynamic_RedDot_Click");
                DinamicXEngine i2 = NativeShopActivity.i(this.f3786a);
                if (i2 == null) {
                    kotlin.jvm.internal.q.b("dxEngine");
                    throw null;
                }
                View j2 = NativeShopActivity.j(this.f3786a);
                if (j2 == null) {
                    kotlin.jvm.internal.q.b("bottomView");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.h.a(i2, j2, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SUBSCRIBE_SUBJECT_TYPE_RED_DOT, (Object) false);
            }
            NativeShopActivity nativeShopActivity = this.f3786a;
            com.alibaba.triver.triver_shop.newShop.data.d b2 = NativeShopActivity.b(nativeShopActivity);
            if (b2 != null) {
                NativeShopActivity.a(nativeShopActivity, b2, NativeShopActivity.e(this.f3786a), NativeShopActivity.f(this.f3786a), null, 8, null);
                com.alibaba.triver.triver_shop.newShop.data.d b3 = NativeShopActivity.b(this.f3786a);
                if (b3 != null) {
                    com.alibaba.triver.triver_shop.newShop.ext.k.a(b3, parseInt);
                    return;
                } else {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
            }
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
    }

    /* loaded from: classes3.dex */
    public final class g extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3789a;

        static {
            kge.a(539515708);
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            if (str.hashCode() == -1507519932) {
                super.a(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(NativeShopActivity this$0) {
            super(this$0);
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3789a = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.e, com.alibaba.triver.triver_shop.newShop.data.h.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            super.a(obj);
            if (obj == null || NativeShopActivity.b(this.f3789a) == null) {
                return;
            }
            if (obj != null) {
                int parseInt = Integer.parseInt((String) obj);
                DinamicXEngine i = NativeShopActivity.i(this.f3789a);
                if (i == null) {
                    kotlin.jvm.internal.q.b("dxEngine");
                    throw null;
                }
                View M = NativeShopActivity.M(this.f3789a);
                if (M == null) {
                    kotlin.jvm.internal.q.b("topView");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.h.a(i, M, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, Integer.valueOf(parseInt));
                c h = NativeShopActivity.h(this.f3789a);
                if (h == null) {
                    kotlin.jvm.internal.q.b("bottomBarManager");
                    throw null;
                }
                Fragment c = h.c(0);
                if (c instanceof ShopStandardFragment) {
                    ((ShopStandardFragment) c).switchSubTabTo(parseInt);
                }
                NativeShopActivity nativeShopActivity = this.f3789a;
                com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(nativeShopActivity);
                if (b != null) {
                    NativeShopActivity.a(nativeShopActivity, b, NativeShopActivity.e(this.f3789a), NativeShopActivity.f(this.f3789a), null, 8, null);
                    return;
                } else {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* loaded from: classes3.dex */
    public final class h extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3790a;

        static {
            kge.a(-172155484);
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            if (str.hashCode() == -1507519932) {
                super.a(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(NativeShopActivity this$0) {
            super(this$0);
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3790a = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.e, com.alibaba.triver.triver_shop.newShop.data.h.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            super.a(obj);
            if (obj == null || NativeShopActivity.b(this.f3790a) == null) {
                return;
            }
            if (obj != null) {
                int parseInt = Integer.parseInt((String) obj);
                DinamicXEngine i = NativeShopActivity.i(this.f3790a);
                if (i == null) {
                    kotlin.jvm.internal.q.b("dxEngine");
                    throw null;
                }
                View F = NativeShopActivity.F(this.f3790a);
                if (F == null) {
                    kotlin.jvm.internal.q.b("videoShopTabView");
                    throw null;
                }
                com.alibaba.triver.triver_shop.newShop.ext.h.a(i, F, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, Integer.valueOf(parseInt));
                c h = NativeShopActivity.h(this.f3790a);
                if (h == null) {
                    kotlin.jvm.internal.q.b("bottomBarManager");
                    throw null;
                }
                h.a(0, parseInt);
                if (!NativeShopActivity.N(this.f3790a) || !NativeShopActivity.G(this.f3790a)) {
                    return;
                }
                NativeShopActivity.b(this.f3790a, "VideoLightShop_tab_itemtab_click");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    private final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        w wVar = new w();
        if (this.I) {
            com.alibaba.triver.triver_shop.c.b(this, a("sellerId"), wVar);
        } else {
            com.alibaba.triver.triver_shop.c.a(this, a("sellerId"), wVar);
        }
    }

    private final com.alibaba.triver.triver_shop.newShop.data.g K() {
        JSONArray jSONArray;
        com.alibaba.triver.triver_shop.newShop.data.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.data.g) ipChange.ipc$dispatch("b4165e40", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.D;
        if (dVar2 == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        JSONArray I = dVar2.I();
        try {
            Result.a aVar = Result.Companion;
            jSONArray = I.getJSONArray(this.B);
            dVar = this.D;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
        if (dVar == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.data.g a2 = new com.alibaba.triver.triver_shop.newShop.data.f(jSONArray, dVar, this.B).a(this.C);
        if (a2 != null) {
            return a2;
        }
        Result.m2371constructorimpl(null);
        return null;
    }

    /* loaded from: classes3.dex */
    public final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3787a;
        private final HashMap<Integer, Fragment> b;

        /* loaded from: classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NativeShopActivity f3788a;
            public final /* synthetic */ Ref.ObjectRef<Fragment> b;

            public a(NativeShopActivity nativeShopActivity, Ref.ObjectRef<Fragment> objectRef) {
                this.f3788a = nativeShopActivity;
                this.b = objectRef;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FragmentTransaction beginTransaction;
                FragmentTransaction show;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FragmentManager supportFragmentManager = this.f3788a.getSupportFragmentManager();
                if (supportFragmentManager != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (show = beginTransaction.show(this.b.element)) != null) {
                    show.commitNow();
                }
                if (!(this.b.element instanceof ShopStandardFragment)) {
                    return;
                }
                ((ShopStandardFragment) this.b.element).onFragmentSelected();
            }
        }

        static {
            kge.a(1192368556);
        }

        public c(NativeShopActivity this$0) {
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3787a = this$0;
            this.b = new HashMap<>();
        }

        /* JADX WARN: Type inference failed for: r1v18, types: [T, android.support.v4.app.Fragment] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
        public final void a(int i) {
            FragmentTransaction beginTransaction;
            FragmentManager supportFragmentManager;
            FragmentTransaction beginTransaction2;
            FragmentTransaction hide;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = this.b.get(Integer.valueOf(i));
            if (objectRef.element == 0) {
                objectRef.element = b(i);
            }
            if (objectRef.element == 0) {
                return;
            }
            for (Fragment fragment : this.b.values()) {
                if (fragment != null && (supportFragmentManager = this.f3787a.getSupportFragmentManager()) != null && (beginTransaction2 = supportFragmentManager.beginTransaction()) != null && (hide = beginTransaction2.hide(fragment)) != null) {
                    hide.commitNow();
                }
            }
            if (!((Fragment) objectRef.element).isAdded()) {
                FragmentManager supportFragmentManager2 = this.f3787a.getSupportFragmentManager();
                if (supportFragmentManager2 != null && (beginTransaction = supportFragmentManager2.beginTransaction()) != null) {
                    ShopView g = NativeShopActivity.g(this.f3787a);
                    if (g == null) {
                        kotlin.jvm.internal.q.b("shopView");
                        throw null;
                    }
                    FragmentTransaction add = beginTransaction.add(g.getCenterContainer().getId(), (Fragment) objectRef.element);
                    if (add != null) {
                        add.commitNow();
                    }
                }
                this.b.put(Integer.valueOf(i), objectRef.element);
            }
            NativeShopActivity nativeShopActivity = this.f3787a;
            nativeShopActivity.runOnUiThread(new a(nativeShopActivity, objectRef));
            NativeShopActivity.c(this.f3787a, i);
        }

        public final Fragment b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("f34d8d9c", new Object[]{this, new Integer(i)});
            }
            if (NativeShopActivity.b(this.f3787a) == null) {
                return null;
            }
            com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(this.f3787a);
            if (b == null) {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
            JSONArray I = b.I();
            if (I.size() <= i) {
                return null;
            }
            com.alibaba.triver.triver_shop.newShop.data.d b2 = NativeShopActivity.b(this.f3787a);
            if (b2 == null) {
                kotlin.jvm.internal.q.b("shopDataParser");
                throw null;
            }
            JSONArray jSONArray = b2.M().getJSONArray("tabData");
            if (jSONArray == null) {
                return null;
            }
            int size = I.size();
            com.alibaba.triver.triver_shop.newShop.data.f[] fVarArr = new com.alibaba.triver.triver_shop.newShop.data.f[size];
            for (int i2 = 0; i2 < size; i2++) {
                JSONArray jSONArray2 = I.getJSONArray(i2);
                com.alibaba.triver.triver_shop.newShop.data.d b3 = NativeShopActivity.b(this.f3787a);
                if (b3 == null) {
                    kotlin.jvm.internal.q.b("shopDataParser");
                    throw null;
                }
                fVarArr[i2] = new com.alibaba.triver.triver_shop.newShop.data.f(jSONArray2, b3, i2);
            }
            ShopStandardFragment shopStandardFragment = new ShopStandardFragment();
            com.alibaba.triver.triver_shop.newShop.view.provider.b bVar = new com.alibaba.triver.triver_shop.newShop.view.provider.b(fVarArr[i]);
            shopStandardFragment.setFragmentViewProvider(bVar);
            ShopView g = NativeShopActivity.g(this.f3787a);
            if (g == null) {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
            bVar.a(g.getViewPageChangeListener());
            if (NativeShopActivity.G(this.f3787a)) {
                bVar.a(new p(this.f3787a));
            } else {
                Object obj = jSONArray.getJSONObject(i).get("name");
                if (kotlin.jvm.internal.q.a(obj, (Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_INDEX_BAR)) {
                    bVar.a(new k(this.f3787a));
                } else if (kotlin.jvm.internal.q.a(obj, (Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ALL_ITEMS)) {
                    bVar.a(new a(this.f3787a));
                } else {
                    bVar.a(new f(this.f3787a));
                }
            }
            return shopStandardFragment;
        }

        public final Fragment c(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("54a02a3b", new Object[]{this, new Integer(i)}) : this.b.get(Integer.valueOf(i));
        }

        public final void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            Fragment c = c(i);
            if (!(c instanceof ShopStandardFragment)) {
                return;
            }
            ((ShopStandardFragment) c).switchSubTabTo(i2);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity b;

        static {
            kge.a(-19167048);
            kge.a(1848919473);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        public f(NativeShopActivity this$0) {
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.b = this$0;
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            NativeShopActivity.d(this.b, i);
            NativeShopActivity nativeShopActivity = this.b;
            try {
                Result.a aVar = Result.Companion;
                if (NativeShopActivity.O(nativeShopActivity)) {
                    NativeShopActivity.g(nativeShopActivity, false);
                } else {
                    com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(nativeShopActivity);
                    if (b == null) {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    }
                    NativeShopActivity.a(nativeShopActivity, b, NativeShopActivity.e(nativeShopActivity), NativeShopActivity.f(nativeShopActivity), "swipe");
                }
                Result.m2371constructorimpl(kotlin.t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th));
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class p extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3802a;

        static {
            kge.a(658236712);
        }

        public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
            if (str.hashCode() == 407727923) {
                super.onPageSelected(((Number) objArr[0]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(NativeShopActivity this$0) {
            super(this$0);
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3802a = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.f, android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            super.onPageSelected(i);
            if (NativeShopActivity.F(this.f3802a) == null) {
                return;
            }
            DinamicXEngine i2 = NativeShopActivity.i(this.f3802a);
            if (i2 == null) {
                kotlin.jvm.internal.q.b("dxEngine");
                throw null;
            }
            View F = NativeShopActivity.F(this.f3802a);
            if (F != null) {
                com.alibaba.triver.triver_shop.newShop.ext.h.a(i2, F, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, Integer.valueOf(i));
            } else {
                kotlin.jvm.internal.q.b("videoShopTabView");
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class k extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3793a;

        static {
            kge.a(-1112915107);
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            if (str.hashCode() == 407727923) {
                super.onPageSelected(((Number) objArr[0]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(NativeShopActivity this$0) {
            super(this$0);
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3793a = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.f, android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            super.onPageSelected(i);
            if (NativeShopActivity.M(this.f3793a) == null) {
                ceg.Companion.b("onPageSelected topView not init");
                return;
            }
            DinamicXEngine i2 = NativeShopActivity.i(this.f3793a);
            if (i2 == null) {
                kotlin.jvm.internal.q.b("dxEngine");
                throw null;
            }
            View M = NativeShopActivity.M(this.f3793a);
            if (M != null) {
                com.alibaba.triver.triver_shop.newShop.ext.h.a(i2, M, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, Integer.valueOf(i));
            } else {
                kotlin.jvm.internal.q.b("topView");
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class a extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3785a;

        static {
            kge.a(784573382);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 407727923) {
                super.onPageSelected(((Number) objArr[0]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NativeShopActivity this$0) {
            super(this$0);
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3785a = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.f, android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            super.onPageSelected(i);
            if (NativeShopActivity.K(this.f3785a) == null) {
                ceg.Companion.b("onPageSelected babySecondView not init");
                return;
            }
            DinamicXEngine i2 = NativeShopActivity.i(this.f3785a);
            if (i2 == null) {
                kotlin.jvm.internal.q.b("dxEngine");
                throw null;
            }
            View K = NativeShopActivity.K(this.f3785a);
            if (K != null) {
                com.alibaba.triver.triver_shop.newShop.ext.h.a(i2, K, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, Integer.valueOf(i));
            } else {
                kotlin.jvm.internal.q.b("babySecondView");
                throw null;
            }
        }
    }

    private final void L() {
        UnreadInfo unreadInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else if (this.g == null || this.j == null) {
            ceg.Companion.b("unread msg : view not init");
        } else {
            MessageBoxService messageBoxService = (MessageBoxService) GlobalContainer.getInstance().get(MessageBoxService.class);
            if (messageBoxService == null || (unreadInfo = messageBoxService.getUnreadInfo()) == null) {
                return;
            }
            ceg.Companion.b(kotlin.jvm.internal.q.a("unread msg : ", (Object) Integer.valueOf(unreadInfo.getTipNumber())));
            DinamicXEngine dinamicXEngine = this.f;
            if (dinamicXEngine == null) {
                kotlin.jvm.internal.q.b("dxEngine");
                throw null;
            }
            View view = this.g;
            if (view == null) {
                kotlin.jvm.internal.q.b("topView");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.h.a(dinamicXEngine, view, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_MSG_COUNT, Integer.valueOf(unreadInfo.getTipNumber()));
            DinamicXEngine dinamicXEngine2 = this.f;
            if (dinamicXEngine2 == null) {
                kotlin.jvm.internal.q.b("dxEngine");
                throw null;
            }
            View view2 = this.j;
            if (view2 != null) {
                com.alibaba.triver.triver_shop.newShop.ext.h.a(dinamicXEngine2, view2, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_MSG_COUNT, Integer.valueOf(unreadInfo.getTipNumber()));
            } else {
                kotlin.jvm.internal.q.b("babyTopView");
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class UnReadMsgReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3784a;

        static {
            kge.a(925794586);
        }

        public UnReadMsgReceiver(NativeShopActivity this$0) {
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3784a = this$0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                NativeShopActivity.a(this.f3784a);
            }
        }
    }

    public final void b(String stage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, stage});
            return;
        }
        kotlin.jvm.internal.q.d(stage, "stage");
        try {
            Result.a aVar = Result.Companion;
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
            if (dVar != null) {
                dVar.k(stage);
                Result.m2371constructorimpl(kotlin.t.INSTANCE);
                return;
            }
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    public final void a(String stage, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, stage, obj});
            return;
        }
        kotlin.jvm.internal.q.d(stage, "stage");
        try {
            Result.a aVar = Result.Companion;
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
            if (dVar != null) {
                dVar.b(stage, obj);
                Result.m2371constructorimpl(kotlin.t.INSTANCE);
                return;
            }
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    private final void a(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i2)});
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("update stage error : " + str + " , errorCode = " + i2);
    }

    public static /* synthetic */ void a(NativeShopActivity nativeShopActivity, com.alibaba.triver.triver_shop.newShop.data.d dVar, int i2, int i3, String str, int i4, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc4f9450", new Object[]{nativeShopActivity, dVar, new Integer(i2), new Integer(i3), str, new Integer(i4), obj});
            return;
        }
        if ((i4 & 8) != 0) {
            str = "click";
        }
        nativeShopActivity.a(dVar, i2, i3, str);
    }

    private final void a(com.alibaba.triver.triver_shop.newShop.data.d dVar, int i2, int i3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13763ea3", new Object[]{this, dVar, new Integer(i2), new Integer(i3), str});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.j.a(dVar, i2, i3, str);
        if (!this.K) {
            return;
        }
        if (H()) {
            com.alibaba.triver.triver_shop.newShop.ext.k.f(dVar);
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.k.g(dVar);
        }
    }

    /* loaded from: classes3.dex */
    public final class q implements com.alibaba.triver.triver_shop.web.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3803a;
        private boolean b;
        private a.InterfaceC0159a c;

        static {
            kge.a(-217097905);
            kge.a(2101725738);
        }

        public q(NativeShopActivity this$0) {
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3803a = this$0;
        }

        public final a.InterfaceC0159a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a.InterfaceC0159a) ipChange.ipc$dispatch("5ee7a5c2", new Object[]{this}) : this.c;
        }

        @Override // com.alibaba.triver.triver_shop.web.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            if (NativeShopActivity.P(this.f3803a)) {
                NativeShopActivity.a(this.f3803a, true, false, 2, (Object) null);
                NativeShopActivity.f(this.f3803a, true);
            }
            ShopView g = NativeShopActivity.g(this.f3803a);
            if (g != null) {
                g.onHomePageWebViewScrollToTop();
            } else {
                kotlin.jvm.internal.q.b("shopView");
                throw null;
            }
        }

        @Override // com.alibaba.triver.triver_shop.web.a
        public void a(a.InterfaceC0159a interfaceC0159a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7798627c", new Object[]{this, interfaceC0159a});
            } else {
                this.c = interfaceC0159a;
            }
        }

        @Override // com.alibaba.triver.triver_shop.web.a
        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b;
        }

        @Override // com.alibaba.triver.triver_shop.web.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }
    }

    public final boolean b() {
        a.InterfaceC0159a a2;
        a.InterfaceC0159a a3;
        a.InterfaceC0159a a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.M) {
            q qVar = this.S.get(F());
            if (qVar != null && (a4 = qVar.a()) != null) {
                return a4.a();
            }
            return true;
        } else if (H()) {
            q qVar2 = this.S.get(F());
            if (qVar2 != null && (a3 = qVar2.a()) != null) {
                return a3.a();
            }
            return true;
        } else {
            q qVar3 = this.S.get(F());
            if (qVar3 != null && (a2 = qVar3.a()) != null) {
                return a2.a();
            }
            return false;
        }
    }

    public final com.alibaba.triver.triver_shop.web.a c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.web.a) ipChange.ipc$dispatch("15201913", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        q qVar = this.S.get(str);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this);
        this.S.put(str, qVar2);
        return qVar2;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        Object m2371constructorimpl;
        com.alibaba.triver.triver_shop.newShop.data.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        super.onLowMemory();
        try {
            Result.a aVar = Result.Companion;
            dVar = this.D;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        if (dVar == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        dVar.H();
        m2371constructorimpl = Result.m2371constructorimpl(kotlin.t.INSTANCE);
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        Object m2371constructorimpl;
        com.alibaba.triver.triver_shop.newShop.data.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i2)});
            return;
        }
        super.onTrimMemory(i2);
        try {
            Result.a aVar = Result.Companion;
            dVar = this.D;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        if (dVar == null) {
            kotlin.jvm.internal.q.b("shopDataParser");
            throw null;
        }
        dVar.e(i2);
        m2371constructorimpl = Result.m2371constructorimpl(kotlin.t.INSTANCE);
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.data.c
    public com.alibaba.triver.triver_shop.newShop.data.d r_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("65696f45", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
        if (dVar == null) {
            return null;
        }
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.q.b("shopDataParser");
        throw null;
    }

    private final void l() {
        Object m2371constructorimpl;
        ShopWrapWebView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            if (!cen.Companion.z()) {
                ceg.Companion.b("tryTopPreloadWebShopIndex disable by orange");
            } else {
                com.alibaba.triver.triver_shop.newShop.data.g K = K();
                if (K != null && K.o() && K.m() == NativeShopRenderContainerType.TYPE_H5 && (a2 = com.alibaba.triver.triver_shop.preload.b.INSTANCE.a()) != null) {
                    a2.printPreloadStatus();
                    if (a2.getAlreadyPreloadPageFinished() && !a2.getAlreadyInjectOnNShopPreloadResume()) {
                        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.D;
                        if (dVar == null) {
                            kotlin.jvm.internal.q.b("shopDataParser");
                            throw null;
                        }
                        a2.setShopId(dVar.T());
                        com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.D;
                        if (dVar2 == null) {
                            kotlin.jvm.internal.q.b("shopDataParser");
                            throw null;
                        }
                        a2.setShopData(dVar2);
                        a2.setOuterCtx(this);
                        a2.setCurrentPageName(K.f());
                        a2.startRenderByRealUrl(K.h());
                        ceg.Companion.b("try to preload shopIndex web early");
                    } else {
                        ceg.Companion.b("try to preload shopIndex web early , but not finished");
                    }
                    com.alibaba.triver.triver_shop.newShop.data.d dVar3 = this.D;
                    if (dVar3 == null) {
                        kotlin.jvm.internal.q.b("shopDataParser");
                        throw null;
                    }
                    dVar3.a(a2);
                }
            }
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }
}
