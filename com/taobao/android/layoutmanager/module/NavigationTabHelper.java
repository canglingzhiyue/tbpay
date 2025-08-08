package com.taobao.android.layoutmanager.module;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.android.layoutmanager.adapter.impl.s;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.container.n;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.w;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import com.taobao.tao.navigation.NavigationTabIndicatorView;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.e;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.eby;
import tb.ilw;
import tb.kge;
import tb.odf;
import tb.odx;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogl;
import tb.ogv;
import tb.ohd;

/* loaded from: classes5.dex */
public class NavigationTabHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALPHA_70_PERCENT = 179;

    /* renamed from: a */
    private static final String[] f13240a;
    private static boolean b;
    private static BroadcastReceiver c;
    private static BroadcastReceiver d;
    private static List<Runnable> e;
    private static boolean f;

    /* loaded from: classes5.dex */
    public static class IconParams implements Serializable {
        public String animation;
        public String bgArrowImage;
        public int bgArrowImageHeight;
        public int bgArrowImageWidth;
        public String bgColor;
        public String bgImage;
        public int bgImageDisplayMaxHeight;
        public int bgImageDisplayMaxWidth;
        public int bgImageHeight;
        public String bgImageSlice;
        public int bgImageWidth;
        public String bottomImage;
        public String contentMode;
        public int duration;
        public String image;
        public int imageHeight;
        public int imageWidth;
        public String leftImage;
        public int loopCount;
        public int loopDuration;
        public boolean redPoint;
        public String rightImage;
        public boolean rightImageLeftGap;
        public String text;
        public String textColor;
        public int textLeft;
        public List<String> textList;
        public String topType;

        static {
            kge.a(330571256);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        public final int f13244a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;

        static {
            kge.a(1946786168);
        }

        public a(Context context, g.c cVar, boolean z) {
            aa c = NavigationTabHelper.c(cVar);
            int b = ohd.b(context, 48);
            int a2 = ohd.a(c, context, z ? 100.0f : 80.0f);
            int width = e.c().getTabViewAtIndex(1).getWidth();
            if (width <= 0 && (width = e.c().getWidth() / 5) <= 0) {
                width = ohd.b(context) / 5;
            }
            int a3 = z ? width * 5 : ohd.a(c, context, 324.0f);
            int a4 = ohd.a(c, context, 22.0f);
            int i = 52;
            int b2 = ohd.b(context, 52);
            this.f13244a = a2;
            this.b = width;
            this.c = b;
            this.d = a3;
            this.e = a2 + b;
            this.f = a4;
            this.g = b2;
            this.h = z ? 370 : 324;
            this.i = z ? 70 : i;
            this.j = ohd.a(c, context, 4.0f);
            this.k = ohd.a(c, context, 22.0f);
            this.l = ohd.a(c, context, 70.0f);
            this.m = ohd.a(c, context, 60.0f);
        }
    }

    public static /* synthetic */ void lambda$VhXecf4GdFshpBX2CnTNjuL4X9g(g.c cVar) {
        e(cVar);
    }

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : d(i);
    }

    public static /* synthetic */ void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
        } else {
            b(context, i);
        }
    }

    public static /* synthetic */ void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else {
            d(view);
        }
    }

    public static /* synthetic */ void a(ViewAnimator viewAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb3aa62", new Object[]{viewAnimator});
        } else {
            b(viewAnimator);
        }
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue() : c(i);
    }

    public static /* synthetic */ void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
        } else {
            c(view);
        }
    }

    public static /* synthetic */ Animation[] b(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animation[]) ipChange.ipc$dispatch("ee20cb90", new Object[]{new Boolean(z)}) : c(z);
    }

    public static /* synthetic */ b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5457a6f2", new Object[0]) : j();
    }

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            m();
        }
    }

    public static /* synthetic */ boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : l();
    }

    public static /* synthetic */ boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : u();
    }

    static {
        kge.a(-538392629);
        f13240a = new String[]{"rotationInfo", eby.KEY_PIC_URL, "top", "topRight", "bottomRight", "largeTopRight"};
        b = true;
        e = new ArrayList();
        f = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (c != null || !s()) {
        } else {
            c = new BroadcastReceiver() { // from class: com.taobao.android.layoutmanager.module.NavigationTabHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (!odf.KEY_UPDATE_GUANG_GUANG_TABICON.equals(intent.getAction())) {
                    } else {
                        boolean booleanExtra = intent.getBooleanExtra("show", true);
                        NavigationTabHelper.a(booleanExtra);
                        b c2 = NavigationTabHelper.c();
                        if (c2 == null || c2.f13245a == null) {
                            return;
                        }
                        FrameLayout frameLayout = c2.f13245a;
                        if (!booleanExtra) {
                            i = 4;
                        }
                        frameLayout.setVisibility(i);
                    }
                }
            };
            LocalBroadcastManager.getInstance(ab.a()).registerReceiver(c, new IntentFilter(odf.KEY_UPDATE_GUANG_GUANG_TABICON));
        }
    }

    private static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : TBRevisionSwitchManager.i().a(ilw.KEY_NEW_CONTENT_ENABLE);
    }

    public static void setCustomIcon(final g.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7465b4c", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            com.taobao.android.behavix.d.a();
            boolean i = com.taobao.android.behavix.d.i();
            Runnable runnable = new Runnable() { // from class: com.taobao.android.layoutmanager.module.-$$Lambda$NavigationTabHelper$VhXecf4GdFshpBX2CnTNjuL4X9g
                @Override // java.lang.Runnable
                public final void run() {
                    NavigationTabHelper.lambda$VhXecf4GdFshpBX2CnTNjuL4X9g(g.c.this);
                }
            };
            if (i || f || oeb.a("executeCustomIconImmediate", false)) {
                runnable.run();
                return;
            }
            if (d != null) {
                z = false;
            }
            if (d == null) {
                d = new BroadcastReceiver() { // from class: com.taobao.android.layoutmanager.module.NavigationTabHelper.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else {
                            NavigationTabHelper.d();
                        }
                    }
                };
                LocalBroadcastManager.getInstance(ab.a()).registerReceiver(d, new IntentFilter("bhx_launch_end_event"));
            }
            e.add(runnable);
            if (!z) {
                return;
            }
            oec.a((Runnable) $$Lambda$NavigationTabHelper$2PpijkYu8T056AVr6BwYN9GCE.INSTANCE, oeb.a("executeCustomIconDelay", 300));
        }
    }

    public static /* synthetic */ void e(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfd0d93", new Object[]{cVar});
        } else if (!b(cVar)) {
        } else {
            d(cVar);
        }
    }

    public static /* synthetic */ void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[0]);
        } else {
            m();
        }
    }

    private static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[0]);
            return;
        }
        for (Runnable runnable : e) {
            runnable.run();
        }
        e.clear();
        f = true;
        oec.a((Runnable) $$Lambda$NavigationTabHelper$UVXkUQPYzwWrtJBNWXm1GKXQJs.INSTANCE);
    }

    public static /* synthetic */ void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[0]);
        } else if (d == null) {
        } else {
            LocalBroadcastManager.getInstance(ab.a()).unregisterReceiver(d);
            d = null;
        }
    }

    private static void d(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb536774", new Object[]{cVar});
            return;
        }
        Pair<Boolean, Map> q = q();
        a(cVar, q);
        ogg.a("NavigationTab setCustomIcon , display:" + q.first);
        if (!((Boolean) q.first).booleanValue()) {
            return;
        }
        Context context = null;
        if (e.c() != null) {
            context = e.c().getContext();
        }
        b(cVar, context);
    }

    private static void a(g.c cVar, Pair<Boolean, Map> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ad5e63", new Object[]{cVar, pair});
        } else if (cVar.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("state", "onLTVControl");
            hashMap.put("result", pair.first);
            hashMap.put("outInfo", pair.second);
            cVar.c.a(cVar, hashMap);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("augeTrackInfo", str4);
        String str5 = str + "_" + str2 + "_" + str3;
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Home", 2201, "Page_Home_Show-bottomBar", str5, null, hashMap).build());
        ogg.c("GuangGuang_Tab_Icon", "commonMarkAndAlienEffectExposure" + str + " " + str5 + " " + str4);
    }

    private static Pair<Boolean, Map> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("8068a8c2", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (UCPManager.a("bottomBar", "tab2", NavigationTabConstraints.MATERIAL_TYPE_ALIEN_EFFECTIVE, "content", jSONObject, jSONObject2)) {
            a("tab2", NavigationTabConstraints.MATERIAL_TYPE_COMMON_MARK, "content", jSONObject2.getString("track"));
            return new Pair<>(true, jSONObject2);
        }
        return new Pair<>(Boolean.valueOf(oeb.a("weitao_switch.disable_redpoint_ltv_control_1", false)), jSONObject2);
    }

    /* loaded from: classes5.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int MSG_BOTTOM_RIGHT_ICON_DISMISS = 32768;
        public static final int MSG_BOTTOM_RIGHT_ICON_FAIL = 128;
        public static final int MSG_BOTTOM_RIGHT_ICON_READY = 64;
        public static final int MSG_LARGE_TOP_ICON_DISMISS = 65536;
        public static final int MSG_LARGE_TOP_ICON_FAIL = 2048;
        public static final int MSG_LARGE_TOP_ICON_STEP1_READY = 256;
        public static final int MSG_LARGE_TOP_ICON_STEP2_READY = 512;
        public static final int MSG_LARGE_TOP_ICON_STEP3_READY = 1024;
        public static final int MSG_MAIN_ICON_FAIL = 2;
        public static final int MSG_MAIN_ICON_READY = 1;
        public static final int MSG_TAB_ICON_ANIMATION = 262144;
        public static final int MSG_TAB_ICON_DISMISS = 4096;
        public static final int MSG_TOP_ICON_DISMISS = 8192;
        public static final int MSG_TOP_ICON_FAIL = 8;
        public static final int MSG_TOP_ICON_READY = 4;
        public static final int MSG_TOP_RIGHT_ICON_DISMISS = 16384;
        public static final int MSG_TOP_RIGHT_ICON_FAIL = 32;
        public static final int MSG_TOP_RIGHT_ICON_READY = 16;
        public static final int MSG_TOP_RIGHT_TEXT_ANIMATION = 131072;
        public static final String PHASE_BOTTOM_RIGHT_IMAGE = "bottomRightImage";
        public static final String PHASE_ICONIMAGE = "iconImage";
        public static final String PHASE_LARGE_BG = "largeTopBgImage";
        public static final String PHASE_LARGE_LEFT_ICON = "largeLeftIcon";
        public static final String PHASE_LARGE_RIGHT_ICON = "largeRightIcon";
        public static final String PHASE_MAIN_ICON = "mainIcon";
        public static final String PHASE_TOPBGIMAGE = "topBgImage";
        public static final String PHASE_TOPIMAGE = "topImage";
        public static final String PHASE_TOP_RIGHT_IMAGE = "topRightImage";

        /* renamed from: a */
        public FrameLayout f13245a;
        public boolean b;
        public int c;
        public View d;
        public View e;
        public IconParams f;
        public View g;
        public IconParams h;
        public View i;
        public IconParams j;
        public boolean k;
        private g.c l;
        private JSON m;
        private boolean n;
        private ab o;
        private String p;
        private Map q;
        private int r;
        private int s;
        private int t;
        private Runnable u;

        /* loaded from: classes5.dex */
        public static class a {

            /* renamed from: a */
            public String f13247a;
            public String b;
            public long c;
            public boolean d;

            static {
                kge.a(-1317926604);
            }

            public a(String str, String str2, long j, boolean z) {
                this.b = str;
                this.c = j;
                this.f13247a = str2;
                this.d = z;
            }
        }

        static {
            kge.a(1857299197);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ int a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30c1de23", new Object[]{bVar})).intValue() : bVar.s;
        }

        public static /* synthetic */ String a(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6fc44be6", new Object[]{bVar, str});
            }
            bVar.p = str;
            return str;
        }

        public static /* synthetic */ Map a(b bVar, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("bf39f0ca", new Object[]{bVar, map});
            }
            bVar.q = map;
            return map;
        }

        public static /* synthetic */ void a(b bVar, b bVar2, String str, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b9cf12", new Object[]{bVar, bVar2, str, new Integer(i), new Integer(i2)});
            } else {
                bVar.a(bVar2, str, i, i2);
            }
        }

        public static /* synthetic */ ab b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ab) ipChange.ipc$dispatch("162893ae", new Object[]{bVar}) : bVar.o;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("699dd6f2", new Object[]{bVar})).booleanValue() : bVar.n;
        }

        public static /* synthetic */ JSON d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSON) ipChange.ipc$dispatch("825206ac", new Object[]{bVar}) : bVar.m;
        }

        public static /* synthetic */ void e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a279cfac", new Object[]{bVar});
            } else {
                bVar.c();
            }
        }

        public b(g.c cVar, FrameLayout frameLayout, boolean z) {
            super(Looper.getMainLooper());
            this.k = false;
            this.u = new Runnable() { // from class: com.taobao.android.layoutmanager.module.NavigationTabHelper.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b bVar = b.this;
                    b.a(bVar, bVar, "show", ((ViewAnimator) bVar.d).getDisplayedChild(), b.a(b.this));
                }
            };
            this.l = cVar;
            this.o = cVar.f19938a;
            this.f13245a = frameLayout;
            this.f13245a.setTag(R.id.layout_manager_icon_display_manager, this);
            this.n = z;
            this.m = cVar.b;
        }

        public boolean a() {
            View view;
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !this.k && (view = this.d) != null && view.getVisibility() == 0;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (this.k) {
            } else {
                this.t |= message.what;
                Object obj = message.obj;
                a aVar = null;
                if (obj instanceof a) {
                    aVar = (a) obj;
                }
                int i = message.what;
                if (i == 1) {
                    a(this.d, this.c, 4096);
                    a(true);
                    NavigationTabHelper.a(this.f13245a.getContext(), message.arg2);
                    View view = this.e;
                    if (view != null) {
                        if ((this.t & 4) != 0) {
                            a(view, a(this.f), 8192);
                        } else if (b()) {
                            a(this.e, a(this.f), 65536);
                            if (NavigationTabHelper.e()) {
                                NavigationTabHelper.b(this.e);
                            }
                        }
                    }
                    if ((this.t & 16) != 0 && !this.b) {
                        a(this.g, a(this.h), 16384);
                        a(this.g, this.h);
                    }
                    if ((this.t & 64) != 0) {
                        a(this.i, a(this.j), 32768);
                    }
                } else if (i != 2) {
                    switch (i) {
                        case 4:
                            if (this.d == null || (this.t & 1) != 0) {
                                a(this.e, a(this.f), 8192);
                                break;
                            }
                            break;
                        case 16:
                            if ((this.d == null || (this.t & 1) != 0) && !this.b) {
                                a(this.g, a(this.h), 16384);
                                a(this.g, this.h);
                                break;
                            }
                            break;
                        case 64:
                            if (this.d == null || (this.t & 1) != 0) {
                                a(this.i, a(this.j), 32768);
                                break;
                            }
                            break;
                        case 256:
                        case 512:
                        case 1024:
                            if (b()) {
                                a(this.e, a(this.f), 65536);
                                if (NavigationTabHelper.e()) {
                                    NavigationTabHelper.b(this.e);
                                    break;
                                }
                            }
                            break;
                        case 4096:
                            NavigationTabModule.resetTab(this.l);
                            break;
                        case 8192:
                        case 65536:
                            if (NavigationTabHelper.e()) {
                                NavigationTabHelper.a(this.e);
                            } else {
                                this.e.setVisibility(4);
                            }
                            if (this.b && (this.t & 16) != 0) {
                                a(this.g, a(this.h), 16384);
                                a(this.g, this.h);
                                if (NavigationTabHelper.e()) {
                                    NavigationTabHelper.b(this.g);
                                    break;
                                }
                            }
                            break;
                        case 16384:
                            this.g.setVisibility(4);
                            break;
                        case 32768:
                            this.i.setVisibility(4);
                            break;
                        case 131072:
                            ViewAnimator a2 = a(this.g);
                            if (a2 != null) {
                                int displayedChild = a2.getDisplayedChild();
                                int childCount = a2.getChildCount();
                                int i2 = childCount - 2;
                                if (displayedChild >= i2) {
                                    if (displayedChild == i2) {
                                        this.r++;
                                        if (this.r < this.h.loopCount) {
                                            a2.setDisplayedChild(0);
                                            sendEmptyMessageDelayed(131072, NavigationTabHelper.a(this.h.loopDuration));
                                            break;
                                        } else if (NavigationTabHelper.g() && this.h.textList != null && this.h.textList.size() > 0 && !StringUtils.isEmpty(this.h.text) && !StringUtils.equals(this.h.animation, n.TRANSITION_TYPE_FADE)) {
                                            try {
                                                Animation[] b = NavigationTabHelper.b(true);
                                                a2.setInAnimation(b[0]);
                                                a2.setOutAnimation(b[1]);
                                                a2.removeViews(0, childCount - 1);
                                                a(a2.getChildAt(0), this.h.text);
                                                a2.setDisplayedChild(0);
                                                break;
                                            } catch (Throwable unused) {
                                                break;
                                            }
                                        } else {
                                            a2.setDisplayedChild(childCount - 1);
                                            break;
                                        }
                                    }
                                } else {
                                    a2.setDisplayedChild(displayedChild + 1);
                                    sendEmptyMessageDelayed(131072, NavigationTabHelper.a(this.h.loopDuration));
                                    break;
                                }
                            }
                            break;
                        case 262144:
                            a(false);
                            break;
                    }
                } else {
                    a(this, "fail", 0, 0);
                }
                ab abVar = this.o;
                if (this.d != null) {
                    z = true;
                }
                a(abVar, z, aVar);
            }
        }

        private void a(View view, String str) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
            } else if (view instanceof TextView) {
                ((TextView) view).setText(str);
            } else if (!(view instanceof ViewGroup)) {
            } else {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        return;
                    }
                    if (viewGroup.getChildAt(i) instanceof TextView) {
                        ((TextView) viewGroup.getChildAt(i)).setText(str);
                    }
                    i++;
                }
            }
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (StringUtils.isEmpty(this.f.text) || (this.t & 1) == 0) {
                return false;
            }
            if (!StringUtils.isEmpty(this.f.bgImage) && (this.t & 256) == 0) {
                return false;
            }
            if (!StringUtils.isEmpty(this.p) && (this.t & 512) == 0) {
                return false;
            }
            return StringUtils.isEmpty(this.f.image) || (this.t & 1024) != 0;
        }

        private void a(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c25114a", new Object[]{this, view, new Integer(i), new Integer(i2)});
            } else if (view == null) {
            } else {
                view.setVisibility(0);
                if (i <= 0) {
                    return;
                }
                sendEmptyMessageDelayed(i2, i);
            }
        }

        private void a(View view, IconParams iconParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21a36021", new Object[]{this, view, iconParams});
                return;
            }
            ViewAnimator a2 = a(view);
            if (a2 == null || a2.getChildCount() <= 1) {
                return;
            }
            a2.setDisplayedChild(0);
            sendEmptyMessageDelayed(131072, NavigationTabHelper.a(iconParams.loopDuration));
        }

        private void a(b bVar, String str, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e0525da", new Object[]{this, bVar, str, new Integer(i), new Integer(i2)});
            } else if (bVar.l.c == null) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("state", str);
                hashMap.put("index", Integer.valueOf(i));
                hashMap.put("loopCount", Integer.valueOf(i2));
                bVar.l.c.a(bVar.l, hashMap);
            }
        }

        private void a(boolean z) {
            Map map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else if ((this.d instanceof ViewAnimator) && (map = this.q) != null) {
                int a2 = oec.a(map.get("duration"), 2000);
                int a3 = oec.a(this.q.get("loopCount"), 1);
                if (z) {
                    ((ViewAnimator) this.d).setDisplayedChild(0);
                    a(this, "show", 0, this.r);
                    if (((ViewAnimator) this.d).getChildCount() <= 1) {
                        return;
                    }
                    sendEmptyMessageDelayed(262144, NavigationTabHelper.b(a2));
                    return;
                }
                if (((ViewAnimator) this.d).getDisplayedChild() == ((ViewAnimator) this.d).getChildCount() - 1) {
                    int i = this.s;
                    if (i + 1 >= a3) {
                        return;
                    }
                    this.s = i + 1;
                }
                ((ViewAnimator) this.d).showNext();
                postDelayed(this.u, 280L);
                sendEmptyMessageDelayed(262144, NavigationTabHelper.b(a2));
            } else if (StringUtils.isEmpty(this.p)) {
            } else {
                a(this, "show", 0, 0);
            }
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if ((this.d instanceof ViewAnimator) && this.q != null) {
                if (hasCallbacks(this.u)) {
                    removeCallbacks(this.u);
                    int displayedChild = ((ViewAnimator) this.d).getDisplayedChild() - 1;
                    if (displayedChild < 0) {
                        displayedChild = ((ViewAnimator) this.d).getChildCount() - 1;
                    }
                    a(this, "finish", displayedChild, this.s);
                    return;
                }
                a(this, "finish", ((ViewAnimator) this.d).getDisplayedChild(), this.s);
            } else if (StringUtils.isEmpty(this.p)) {
            } else {
                a(this, "finish", 0, 0);
            }
        }

        private ViewAnimator a(View view) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (ViewAnimator) ipChange.ipc$dispatch("155a2364", new Object[]{this, view});
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return null;
                }
                if (viewGroup.getChildAt(i) instanceof ViewAnimator) {
                    return (ViewAnimator) viewGroup.getChildAt(i);
                }
                i++;
            }
        }

        private int a(IconParams iconParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8951b12", new Object[]{this, iconParams})).intValue();
            }
            if (iconParams == null) {
                return 0;
            }
            return iconParams.duration;
        }

        private void a(ab abVar, boolean z, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24322e56", new Object[]{this, abVar, new Boolean(z), aVar});
            } else if (aVar == null || aVar.b == null) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("phase", aVar.f13247a);
                hashMap.put("time", Long.valueOf(aVar.c));
                String str = "1";
                hashMap.put("success", aVar.d ? str : "0");
                hashMap.put("url", aVar.b);
                if (!z) {
                    str = "0";
                }
                hashMap.put("hasIconImage", str);
                w.a(abVar, "tabIconChange", hashMap);
            }
        }
    }

    private static IconParams a(g.c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IconParams) ipChange.ipc$dispatch("e09cda4c", new Object[]{cVar, str});
        }
        Map a2 = oec.a(((Map) cVar.b).get(str), (Map) null);
        if (a2 == null) {
            return null;
        }
        return (IconParams) JSON.parseObject(JSON.toJSONString(a2), IconParams.class);
    }

    private static void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    private static void d(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89069007", new Object[]{view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.layoutmanager.module.NavigationTabHelper.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    view.setVisibility(8);
                }
            }
        });
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.view.View a(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.taobao.android.layoutmanager.module.NavigationTabHelper.b r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.layoutmanager.module.NavigationTabHelper.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.taobao.android.layoutmanager.module.NavigationTabHelper$b, boolean, boolean):android.view.View");
    }

    private static void a(ViewAnimator viewAnimator, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d80fa42", new Object[]{viewAnimator, new Integer(i), new Integer(i2)});
            return;
        }
        Animation[] a2 = a(i, i2);
        viewAnimator.setInAnimation(a2[0]);
        viewAnimator.setOutAnimation(a2[1]);
        viewAnimator.setAnimateFirstView(false);
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 969785) {
            if (hashCode != 1132427) {
                if (hashCode == 23780314 && str.equals("小视频")) {
                    c2 = 1;
                }
            } else if (str.equals("视频")) {
                c2 = 0;
            }
        } else if (str.equals("直播")) {
            c2 = 2;
        }
        if (c2 == 0) {
            return R.drawable.nav_video_bk;
        }
        if (c2 == 1) {
            return R.drawable.nav_minivideo_bk;
        }
        if (c2 == 2) {
            return R.drawable.nav_live_bk;
        }
        return R.drawable.nav_guang_bk;
    }

    private static void a(b bVar, g.c cVar, Context context, FrameLayout frameLayout) {
        ViewAnimator viewAnimator;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        ViewAnimator viewAnimator2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4334fe5c", new Object[]{bVar, cVar, context, frameLayout});
            return;
        }
        String str5 = null;
        Map a2 = oec.a(((Map) cVar.b).get("rotationInfo"), (Map) null);
        String a3 = oec.a(((Map) cVar.b).get(eby.KEY_PIC_URL), (String) null);
        String a4 = oec.a(((Map) cVar.b).get("frameType"), "default");
        String a5 = oec.a(((Map) cVar.b).get("contentMode"), "contain");
        boolean equals = oec.a(((Map) cVar.b).get("picMode"), "normal").equals("badge");
        boolean a6 = oec.a(((Map) cVar.b).get("liveAnimation"), false);
        boolean a7 = oeb.a("ShortVideo.enableLiveAnimation", true);
        ViewAnimator viewAnimator3 = new ViewAnimator(context);
        if (equals) {
            int b2 = ohd.b(context, 52);
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            tUrlImageView.setMinimumHeight(b2);
            tUrlImageView.setMinimumWidth(b2);
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int a8 = a(oec.a(((Map) cVar.b).get("tabbarItemTitle"), "逛逛"));
            if (Build.VERSION.SDK_INT >= 21) {
                tUrlImageView.setBackgroundDrawable(context.getDrawable(a8));
            } else {
                tUrlImageView.setBackgroundDrawable(context.getResources().getDrawable(a8));
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2, b2);
            layoutParams.gravity = 81;
            frameLayout.addView(tUrlImageView, layoutParams);
        }
        frameLayout.addView(viewAnimator3);
        List a9 = a2 != null ? oec.a(a2.get("pics"), (List) null) : null;
        if (a9 != null && !a9.isEmpty()) {
            int i4 = 0;
            while (i4 < a9.size()) {
                Object obj = a9.get(i4);
                if (obj instanceof Map) {
                    String a10 = oec.a(((Map) obj).get(eby.KEY_PIC_URL), str5);
                    if (!StringUtils.isEmpty(a10)) {
                        boolean z = i4 == 0;
                        i3 = i4;
                        String str6 = a4;
                        viewAnimator2 = viewAnimator3;
                        str3 = a4;
                        boolean z2 = z;
                        str4 = a3;
                        viewAnimator2.addView(a(context, a10, a5, str6, bVar, z2, equals));
                        i4 = i3 + 1;
                        viewAnimator3 = viewAnimator2;
                        a3 = str4;
                        a4 = str3;
                        str5 = null;
                    }
                }
                i3 = i4;
                viewAnimator2 = viewAnimator3;
                str3 = a4;
                str4 = a3;
                i4 = i3 + 1;
                viewAnimator3 = viewAnimator2;
                a3 = str4;
                a4 = str3;
                str5 = null;
            }
            viewAnimator = viewAnimator3;
            str = a4;
            str2 = a3;
        } else {
            viewAnimator = viewAnimator3;
            str = a4;
            str2 = a3;
            if (!StringUtils.isEmpty(str2)) {
                viewAnimator.addView(a(context, str2, a5, str, bVar, true, equals));
            }
        }
        if (a6 && a7 && str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_round) && !equals) {
            b(viewAnimator);
            a(context, frameLayout);
        }
        if (viewAnimator.getChildAt(0) != null) {
            ViewGroup.LayoutParams layoutParams2 = viewAnimator.getChildAt(0).getLayoutParams();
            i2 = layoutParams2.width;
            i = layoutParams2.height;
        } else {
            i = 0;
            i2 = 0;
        }
        a(viewAnimator, i2, i);
        b.a(bVar, str2);
        b.a(bVar, a2);
        if (viewAnimator.getChildCount() <= 0) {
            viewAnimator = null;
        }
        bVar.d = viewAnimator;
        bVar.b = oec.a(((Map) cVar.b).get("linkSwitch"), false);
        bVar.c = oec.a(((Map) cVar.b).get("lightDuration"), -1);
    }

    private static void b(final ViewAnimator viewAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d36e81", new Object[]{viewAnimator});
            return;
        }
        View currentView = viewAnimator.getCurrentView();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(currentView, "scaleX", 1.0f, 0.9f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(currentView, "scaleY", 1.0f, 0.9f);
        ofFloat.setDuration(1000L);
        ofFloat2.setDuration(1000L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(currentView, "scaleX", 0.9f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(currentView, "scaleY", 0.9f, 1.0f);
        ofFloat3.setDuration(1000L);
        ofFloat4.setDuration(1000L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.layoutmanager.module.NavigationTabHelper.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    NavigationTabHelper.a(viewAnimator);
                }
            }
        });
        animatorSet.start();
    }

    private static void a(Context context, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef1b7e3", new Object[]{context, frameLayout});
            return;
        }
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setAnimation("TBWeiTao.bundle/liveanimation2.json");
        lottieAnimationView.setLayoutParams(a(ohd.b(context, 53), ohd.b(context, 53), 81, 0, 0, 0, ohd.b(context, -3)));
        lottieAnimationView.playAnimation();
        lottieAnimationView.loop(true);
        frameLayout.addView(lottieAnimationView);
    }

    private static void a(TNodeImageView tNodeImageView, final b bVar, final String str, final String str2, final int i, final int i2, final int i3, final int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76aa300", new Object[]{tNodeImageView, bVar, str, str2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        final long nanoTime = System.nanoTime();
        tNodeImageView.setImageLoadCallback(new ImageLoader.c() { // from class: com.taobao.android.layoutmanager.module.NavigationTabHelper.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
            public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                } else {
                    bVar.sendMessage(Message.obtain(bVar, i3, i, i2, new b.a(str, str2, (System.nanoTime() - nanoTime) / 1000000, true)));
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
            public void onImageLoadFailed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                } else {
                    bVar.sendMessage(Message.obtain(bVar, i4, new b.a(str, str2, (System.nanoTime() - nanoTime) / 1000000, false)));
                }
            }
        });
    }

    private static void b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7862e4", new Object[]{context, new Integer(i)});
            return;
        }
        TNodeImageView tNodeImageView = new TNodeImageView(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.setMargins(0, 0, 0, 0);
        relativeLayout.addView(tNodeImageView, layoutParams);
        e.a("tab2", "placeholder", (View) relativeLayout, false);
        e.a("tab2", NavigationTabMsgMode.NONE, (String) null);
        h();
    }

    private static void h() {
        TBFragmentTabHost c2;
        NavigationTabIndicatorView tabViewAtIndex;
        TextView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
        } else if (s.d() == 0 || !k() || (c2 = e.c()) == null || (tabViewAtIndex = c2.getTabViewAtIndex(1)) == null || (a2 = a((View) tabViewAtIndex, false)) == null) {
        } else {
            a2.setVisibility(4);
            a2.setTag(R.id.layout_manager_guangguang_text_need_resume, Boolean.TRUE);
        }
    }

    private static void i() {
        NavigationTabIndicatorView tabViewAtIndex;
        TextView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
            return;
        }
        TBFragmentTabHost c2 = e.c();
        if (c2 == null || (tabViewAtIndex = c2.getTabViewAtIndex(1)) == null || (a2 = a((View) tabViewAtIndex, true)) == null) {
            return;
        }
        a2.setVisibility(0);
        a2.setTag(R.id.layout_manager_guangguang_text_need_resume, null);
    }

    private static TextView a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("1d63071e", new Object[]{view, new Boolean(z)});
        }
        if (!(view instanceof ViewGroup)) {
            if (!(view instanceof TextView)) {
                return null;
            }
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (!StringUtils.equals("逛逛", text) && (text == null || !text.toString().contains("视频"))) {
                return null;
            }
            if (z) {
                Object tag = view.getTag(R.id.layout_manager_guangguang_text_need_resume);
                if (tag != null && tag == Boolean.TRUE) {
                    return textView;
                }
                return null;
            } else if (view.getVisibility() != 0) {
                return null;
            } else {
                return textView;
            }
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return null;
            }
            TextView a2 = a(viewGroup.getChildAt(i), z);
            if (a2 != null) {
                return a2;
            }
            i++;
        }
    }

    private static Drawable a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("13d3792", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        ogl oglVar = new ogl();
        oglVar.aJ = i;
        oglVar.aO = i2;
        oglVar.aP = i3;
        oglVar.aE = i4;
        return com.taobao.tao.flexbox.layoutmanager.drawable.b.a((Drawable) null, oglVar);
    }

    private static FrameLayout.LayoutParams a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("b8bcf8c4", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = i3;
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        layoutParams.rightMargin = i6;
        layoutParams.bottomMargin = i7;
        return layoutParams;
    }

    private static View a(b bVar, Context context, IconParams iconParams, ViewGroup viewGroup, a aVar) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c30ceb6d", new Object[]{bVar, context, iconParams, viewGroup, aVar});
        }
        aa a2 = a(bVar);
        Rect rect = null;
        if (iconParams != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setVisibility(4);
            viewGroup.addView(frameLayout2, a(-2, -2, 81, 0, 0, 0, aVar.c - ohd.b(context, 4)));
            if ("newtext".equals(iconParams.topType)) {
                a(bVar, context, iconParams, frameLayout2);
            } else if (!StringUtils.isEmpty(iconParams.image) && iconParams.imageWidth > 0 && iconParams.imageHeight > 0) {
                int[] a3 = a(ohd.a(a2, context, 280.0f), ohd.a(a2, context, 80.0f), iconParams.imageWidth, iconParams.imageHeight, false, 0);
                TNodeImageView tNodeImageView = new TNodeImageView(context);
                tNodeImageView.setScaleType(oec.a((Object) iconParams.contentMode, "contain").equals("contain") ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_CROP);
                frameLayout = frameLayout2;
                a(tNodeImageView, bVar, iconParams.image, b.PHASE_TOPIMAGE, a3[0], a3[1], 4, 8);
                tNodeImageView.setImageUrl(iconParams.image);
                frameLayout.addView(tNodeImageView, new FrameLayout.LayoutParams(a3[0], a3[1]));
            } else if (!StringUtils.isEmpty(iconParams.text) && !StringUtils.isEmpty(iconParams.bgImage) && iconParams.bgImageWidth > 0 && iconParams.bgImageHeight > 0) {
                TNodeImageView tNodeImageView2 = new TNodeImageView(context);
                float f2 = 0.0f;
                if (iconParams.text.length() > 3) {
                    TextPaint textPaint = new TextPaint();
                    textPaint.setTextSize(aVar.f);
                    f2 = textPaint.measureText(iconParams.text.substring(0, iconParams.text.length() - 3));
                }
                int[] a4 = a(ohd.a(a2, context, oec.a((Object) Integer.valueOf(iconParams.bgImageDisplayMaxWidth), aVar.h)), ohd.a(a2, context, oec.a((Object) Integer.valueOf(iconParams.bgImageDisplayMaxHeight), aVar.i)), iconParams.bgImageWidth, iconParams.bgImageHeight, false, (int) f2);
                if (!StringUtils.isEmpty(iconParams.bgImageSlice)) {
                    rect = ogl.b(b.b(bVar).A(), context, iconParams.bgImageSlice);
                    tNodeImageView2.setNinePatchRect(rect);
                }
                Rect rect2 = rect;
                tNodeImageView2.setScaleType(rect2 != null ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
                frameLayout = frameLayout2;
                a(tNodeImageView2, bVar, iconParams.bgImage, b.PHASE_TOPBGIMAGE, a4[0], a4[1], 4, 8);
                tNodeImageView2.setImageUrl(null, iconParams.bgImage, iconParams.bgImage, a4[0], a4[1], ImageLoader.a.a(ImageLoader.Scene.RED_POINT), false);
                frameLayout.addView(tNodeImageView2, new FrameLayout.LayoutParams(a4[0], a4[1]));
                if (iconParams.bgArrowImage != null && iconParams.bgArrowImageWidth > 0 && iconParams.bgArrowImageHeight > 0) {
                    TNodeImageView tNodeImageView3 = new TNodeImageView(context);
                    tNodeImageView3.setImageUrl(iconParams.bgArrowImage);
                    frameLayout.addView(tNodeImageView3, a((int) (((a4[1] * 1.0f) / iconParams.bgArrowImageHeight) * iconParams.bgArrowImageWidth), a4[1], 1, 0, 0, 0, 0));
                }
                float f3 = (iconParams.bgImageHeight * 1.0f) / a4[1];
                frameLayout.addView(a(context, iconParams.text, -16777216, ohd.a(a2, context, 22.0f), true), a(-2, -2, 16, (int) (rect2 != null ? Math.max(rect2.left / f3, iconParams.textLeft / f3) : iconParams.textLeft / f3), ((-ohd.b(context, 2)) * 3) / 4, 0, 0));
            }
            frameLayout = frameLayout2;
        } else {
            frameLayout = null;
        }
        bVar.e = frameLayout;
        bVar.f = iconParams;
        return frameLayout;
    }

    private static void a(b bVar, Context context, IconParams iconParams, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3942952", new Object[]{bVar, context, iconParams, frameLayout});
            return;
        }
        aa a2 = a(bVar);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(a(-2, -2, 1, 0, 0, 0, ohd.a(a2, context, 8.0f)));
        boolean z = !StringUtils.isEmpty(iconParams.leftImage);
        boolean z2 = !StringUtils.isEmpty(iconParams.rightImage);
        float f2 = 15.0f;
        if (z) {
            TNodeImageView tNodeImageView = new TNodeImageView(context);
            tNodeImageView.setImageUrl(iconParams.leftImage);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ohd.a(a2, context, 24.0f), ohd.a(a2, context, 24.0f));
            layoutParams.leftMargin = ohd.a(a2, context, 15.0f);
            layoutParams.topMargin = ohd.a(a2, context, 11.0f);
            linearLayout.addView(tNodeImageView, 0, layoutParams);
            i = 1;
        }
        if (!StringUtils.isEmpty(iconParams.text)) {
            TextView a3 = a(context, iconParams.text, Color.parseColor(iconParams.textColor), ohd.a(a2, context, 22.0f), true);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.bottomMargin = ohd.a(a2, context, 8.0f);
            layoutParams2.topMargin = ohd.a(a2, context, 8.0f);
            layoutParams2.leftMargin = ohd.a(a2, context, z ? 9.0f : 15.0f);
            int i2 = 12;
            if (z2) {
                f2 = iconParams.rightImageLeftGap ? 12 : 7;
            }
            layoutParams2.rightMargin = ohd.a(a2, context, f2);
            int i3 = z ? 50 : 15;
            if (z2) {
                i2 = 31;
            }
            a3.setEllipsize(StringUtils.TruncateAt.END);
            a3.setMaxWidth(ohd.a(a2, context, (320 - i3) - i2));
            a3.setSingleLine(true);
            linearLayout.addView(a3, i, layoutParams2);
            i++;
        }
        if (z2) {
            TNodeImageView tNodeImageView2 = new TNodeImageView(context);
            tNodeImageView2.setImageUrl(iconParams.rightImage);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(ohd.a(a2, context, 10.0f), ohd.a(a2, context, 16.0f));
            layoutParams3.rightMargin = ohd.a(a2, context, 18.0f);
            layoutParams3.topMargin = ohd.a(a2, context, 17.0f);
            linearLayout.addView(tNodeImageView2, i, layoutParams3);
        }
        Drawable a4 = com.taobao.tao.flexbox.layoutmanager.drawable.b.a(Color.parseColor(iconParams.bgColor), ohd.a(a2, context, 24.0f));
        a4.setAlpha(ALPHA_70_PERCENT);
        linearLayout.setBackground(a4);
        frameLayout.addView(linearLayout);
        TNodeImageView tNodeImageView3 = new TNodeImageView(context);
        tNodeImageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
        tNodeImageView3.setAlpha(ALPHA_70_PERCENT);
        int a5 = ohd.a(a2, context, 10.0f);
        a(tNodeImageView3, bVar, iconParams.bottomImage, b.PHASE_TOPIMAGE, a5, a5, 4, 8);
        tNodeImageView3.setImageUrl(iconParams.bottomImage);
        frameLayout.addView(tNodeImageView3, a(a5, a5, 81, 0, 0, 0, ohd.a(a2, context, 2.0f)));
    }

    private static TextView a(Context context, String str, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("d9532a7e", new Object[]{context, str, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setTextSize(0, i2);
        if (z) {
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
        return textView;
    }

    private static TextView a(Context context, b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ca30d576", new Object[]{context, bVar, str});
        }
        TextView a2 = a(context, str, -1, ohd.a(a(bVar), context, 16.0f), true);
        a2.setGravity(17);
        a2.setEllipsize(StringUtils.TruncateAt.END);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View a(b bVar, Context context, IconParams iconParams, ViewGroup viewGroup, a aVar, boolean z) {
        int i;
        int i2;
        TextView textView;
        boolean z2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a8cbd04b", new Object[]{bVar, context, iconParams, viewGroup, aVar, new Boolean(z)});
        }
        FrameLayout frameLayout = null;
        aa a2 = a(bVar);
        if (iconParams != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = (aVar.d / 2) + ohd.b(context, 5);
            layoutParams.rightMargin = ohd.b(context, 20);
            if (z) {
                layoutParams.topMargin = aVar.f13244a;
            } else {
                layoutParams.gravity = 80;
            }
            int b2 = ohd.b(context, 20);
            viewGroup.addView(frameLayout2, layoutParams);
            boolean b3 = ogv.b(iconParams.textList);
            boolean v = v();
            boolean isEmpty = StringUtils.isEmpty(iconParams.text);
            String str = b.PHASE_TOP_RIGHT_IMAGE;
            if (!isEmpty || b3) {
                boolean equals = n.TRANSITION_TYPE_FADE.equals(iconParams.animation);
                ViewAnimator viewAnimator = new ViewAnimator(context);
                Animation[] c2 = c(equals);
                viewAnimator.setInAnimation(c2[0]);
                viewAnimator.setOutAnimation(c2[1]);
                if (equals) {
                    viewAnimator.setAnimateFirstView(false);
                }
                int a3 = ohd.a(a2, context, 8.0f);
                int a4 = ohd.a(a2, context, 6.0f);
                int b4 = ohd.b(context, 10);
                int a5 = ohd.a(a2, context, 2.0f);
                int a6 = odx.a("#FF5001");
                if (iconParams.textList != null) {
                    int i5 = 0;
                    while (i5 < iconParams.textList.size()) {
                        TextView a7 = a(context, bVar, iconParams.textList.get(i5));
                        if (equals) {
                            z2 = b3;
                            i3 = b2;
                            a7.setBackgroundDrawable(a(b4, a5, -1, a6));
                            a7.setPadding(a3, a4, a3, a4);
                        } else {
                            z2 = b3;
                            i3 = b2;
                        }
                        if (equals) {
                            i4 = a4;
                            viewAnimator.addView(a7, new FrameLayout.LayoutParams(-2, -2, 3));
                        } else {
                            i4 = a4;
                            viewAnimator.addView(a7, new FrameLayout.LayoutParams(-2, -2, 17));
                        }
                        i5++;
                        b2 = i3;
                        b3 = z2;
                        a4 = i4;
                    }
                }
                boolean z3 = b3;
                int i6 = b2;
                int i7 = a4;
                if (!StringUtils.isEmpty(iconParams.text)) {
                    TextView a8 = a(context, bVar, iconParams.text);
                    if (!StringUtils.isEmpty(iconParams.leftImage)) {
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setGravity(16);
                        TNodeImageView tNodeImageView = new TNodeImageView(context);
                        tNodeImageView.setImageUrl(iconParams.leftImage);
                        int a9 = ohd.a(a2, context, 16.0f);
                        int a10 = ohd.a(a2, context, 2.0f);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a9, a9);
                        layoutParams2.rightMargin = a10;
                        linearLayout.addView(tNodeImageView, layoutParams2);
                        linearLayout.addView(a8);
                        textView = linearLayout;
                    } else {
                        textView = a8;
                    }
                    if (v ? equals && z3 : equals) {
                        textView.setBackgroundDrawable(a(b4, a5, -1, a6));
                        i = i7;
                        textView.setPadding(a3, i, a3, i);
                        viewAnimator.addView(textView, new FrameLayout.LayoutParams(-2, -2, 3));
                    } else {
                        i = i7;
                        if (u() && z3) {
                            a8.setText("");
                        }
                        viewAnimator.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
                    }
                } else {
                    i = i7;
                }
                if (!equals || (v && !z3)) {
                    viewAnimator.setBackgroundDrawable(a(b4, a5, -1, a6));
                    viewAnimator.setPadding(a3, i, a3, i);
                    i2 = i6;
                    viewAnimator.setMinimumWidth(i2);
                } else {
                    i2 = i6;
                }
                bVar.sendMessage(Message.obtain(bVar, z ? 16 : 64, new b.a(null, z ? str : b.PHASE_BOTTOM_RIGHT_IMAGE, 0L, true)));
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, i2);
                frameLayout = frameLayout2;
                frameLayout.addView(viewAnimator, layoutParams3);
            } else if (StringUtils.isEmpty(iconParams.image) || iconParams.imageWidth <= 0 || iconParams.imageHeight <= 0) {
                frameLayout = frameLayout2;
            } else {
                TNodeImageView tNodeImageView2 = new TNodeImageView(context);
                int[] a11 = a(ohd.b(context, 60), b2, iconParams.imageWidth, iconParams.imageHeight, true, 0);
                tNodeImageView2.setScaleType(oec.a((Object) iconParams.contentMode, "contain").equals("contain") ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_CROP);
                if (!z) {
                    str = b.PHASE_BOTTOM_RIGHT_IMAGE;
                }
                a(tNodeImageView2, bVar, iconParams.image, str, a11[0], a11[1], z ? 16 : 64, z ? 32 : 128);
                tNodeImageView2.setImageUrl(iconParams.image);
                frameLayout2.addView(tNodeImageView2, new FrameLayout.LayoutParams(a11[0], a11[1]));
                frameLayout = frameLayout2;
            }
        }
        if (z) {
            bVar.g = frameLayout;
            bVar.h = iconParams;
        } else {
            bVar.i = frameLayout;
            bVar.j = iconParams;
        }
        if (z && iconParams != null) {
            a(context, viewGroup, aVar, iconParams.redPoint);
        }
        return frameLayout;
    }

    private static Animation[] a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation[]) ipChange.ipc$dispatch("c37830d", new Object[]{new Integer(i), new Integer(i2)});
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        float f2 = i / 2;
        float f3 = i2 / 2;
        animationSet.addAnimation(new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, f2, f3));
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet2.addAnimation(new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, f2, f3));
        Animation[] animationArr = {animationSet, animationSet2};
        animationArr[0].setDuration(o());
        animationArr[1].setDuration(o());
        animationArr[0].setInterpolator(new c(1.2f));
        animationArr[1].setInterpolator(new d(1.2f));
        return animationArr;
    }

    /* loaded from: classes5.dex */
    public static class d extends DecelerateInterpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-357831488);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 583500507) {
                return new Float(super.getInterpolation(((Number) objArr[0]).floatValue()));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public d(float f) {
            super(f);
        }

        @Override // android.view.animation.DecelerateInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            return super.getInterpolation(f <= 0.53333336f ? f / 0.53333336f : 1.0f);
        }
    }

    /* loaded from: classes5.dex */
    public static class c extends DecelerateInterpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2029873247);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 583500507) {
                return new Float(super.getInterpolation(((Number) objArr[0]).floatValue()));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public c(float f) {
            super(f);
        }

        @Override // android.view.animation.DecelerateInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            return super.getInterpolation(f <= 0.46666667f ? 0.0f : (f - 0.46666667f) / 0.5333333f);
        }
    }

    private static Animation[] c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation[]) ipChange.ipc$dispatch("453ebc6f", new Object[]{new Boolean(z)});
        }
        Animation[] animationArr = new Animation[2];
        if (z) {
            animationArr[0] = new AlphaAnimation(0.0f, 1.0f);
            animationArr[1] = new AlphaAnimation(1.0f, 0.0f);
        } else {
            animationArr[0] = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
            animationArr[1] = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, -1.0f);
        }
        animationArr[0].setDuration(n());
        animationArr[1].setDuration(n());
        animationArr[0].setInterpolator(new DecelerateInterpolator(1.2f));
        animationArr[1].setInterpolator(new DecelerateInterpolator(1.2f));
        return animationArr;
    }

    private static int[] a(int i, int i2, int i3, int i4, boolean z, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("54e9a9ed", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), new Integer(i5)});
        }
        int[] iArr = new int[2];
        if (z) {
            iArr[1] = i2;
            iArr[0] = Math.min(((int) (((i2 * 1.0f) / i4) * i3)) + i5, i);
        } else if (i3 > i || i4 > i2) {
            float f2 = i3;
            float f3 = (f2 * 1.0f) / i;
            float f4 = i4;
            float f5 = (1.0f * f4) / i2;
            if (i3 > i) {
                if (i4 <= i2) {
                    iArr[0] = i;
                    iArr[1] = (int) (f4 / f3);
                } else {
                    float max = Math.max(f3, f5);
                    iArr[0] = Math.min(((int) (f2 / max)) + i5, i);
                    iArr[1] = (int) (f4 / max);
                }
            } else if (i4 > i2) {
                if (i3 <= i) {
                    iArr[0] = Math.min(((int) (f2 / f5)) + i5, i);
                    iArr[1] = i2;
                } else {
                    float max2 = Math.max(f3, f5);
                    iArr[0] = Math.min(((int) (f2 / max2)) + i5, i);
                    iArr[1] = (int) (f4 / max2);
                }
            }
        } else {
            iArr[0] = Math.min(i3 + i5, i);
            iArr[1] = i4;
        }
        return iArr;
    }

    private static boolean a(JSON json, JSON json2) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3174110c", new Object[]{json, json2})).booleanValue();
        }
        try {
            if (r()) {
                if (!(json instanceof Map) || !(json2 instanceof Map)) {
                    return true;
                }
                for (String str : f13240a) {
                    if (!oec.a(((Map) json).get(str), ((Map) json2).get(str))) {
                        return false;
                    }
                }
                return true;
            }
            return json.equals(json2);
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void b(g.c cVar, Context context) {
        b j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4a5952", new Object[]{cVar, context});
        } else if (p() && (j = j()) != null && !b.c(j) && j.a() && !ohd.a(3) && a(b.d(j), cVar.b)) {
        } else {
            a((g.c) null);
            a aVar = new a(context, cVar, false);
            FrameLayout frameLayout = new FrameLayout(context);
            b bVar = new b(cVar, frameLayout, false);
            a(bVar, cVar, context, frameLayout);
            a(bVar, context, a(cVar, "top"), frameLayout, aVar);
            a(bVar, context, a(cVar, "topRight"), (ViewGroup) frameLayout, aVar, true);
            a(bVar, context, a(cVar, "bottomRight"), (ViewGroup) frameLayout, aVar, false);
            a(context, frameLayout, a(aVar.d, aVar.e, 80, aVar.b - ((aVar.d - aVar.b) / 2), 0, 0, 0));
        }
    }

    private static void a(Context context, ViewGroup viewGroup, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be1cf5a", new Object[]{context, viewGroup, aVar, new Boolean(z)});
        } else if (!z) {
        } else {
            TextView textView = new TextView(context);
            textView.setBackgroundResource(R.drawable.redpoint_dot);
            int c2 = ohd.c(context, 10);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c2, c2);
            layoutParams.leftMargin = ohd.c(context, 11);
            layoutParams.topMargin = aVar.f13244a + ohd.b(context, 1);
            layoutParams.gravity = 1;
            textView.setGravity(17);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            viewGroup.addView(textView, layoutParams);
        }
    }

    private static void a(Context context, FrameLayout frameLayout, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4cfd56", new Object[]{context, frameLayout, layoutParams});
            return;
        }
        ViewGroup viewGroup = null;
        try {
            viewGroup = (ViewGroup) ((Activity) context).findViewById(R.id.tb_main_fragment);
        } catch (Throwable unused) {
        }
        if (viewGroup != null) {
            viewGroup.addView(frameLayout, layoutParams);
        } else {
            ((Activity) context).addContentView(frameLayout, layoutParams);
        }
        frameLayout.setTag("GuangGuang_Tab_Icon");
        if (!s()) {
            return;
        }
        if (b) {
            frameLayout.setVisibility(0);
        } else {
            frameLayout.setVisibility(4);
        }
    }

    private static boolean b(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8001b3a", new Object[]{cVar})).booleanValue();
        }
        Context context = null;
        if (e.c() != null) {
            context = e.c().getContext();
        }
        if (context == null || e.c().getCurrentTab() == 1) {
            return false;
        }
        if (cVar.f19938a != null && cVar.f19938a.i()) {
            return false;
        }
        return !t() || f();
    }

    public static void a(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16567517", new Object[]{cVar});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b2 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
        if (b2 != null) {
            b2.c(1);
        }
        b j = j();
        if (j != null && j.a()) {
            b.e(j);
        }
        b();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        b j = j();
        if (j != null) {
            FrameLayout frameLayout = j.f13245a;
            if (frameLayout != null && frameLayout.getParent() != null) {
                ((ViewGroup) frameLayout.getParent()).removeView(frameLayout);
            }
            j.removeCallbacksAndMessages(null);
            j.k = true;
        }
        i();
    }

    private static b j() {
        ViewGroup viewGroup;
        View findViewWithTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("56a20939", new Object[0]);
        }
        TBFragmentTabHost c2 = e.c();
        if (c2 != null) {
            Context context = c2.getContext();
            if (context instanceof Activity) {
                try {
                    viewGroup = (ViewGroup) ((Activity) context).findViewById(R.id.tb_main_fragment);
                } catch (Throwable unused) {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    findViewWithTag = viewGroup.findViewWithTag("GuangGuang_Tab_Icon");
                } else {
                    ViewGroup viewGroup2 = (ViewGroup) ((Activity) context).findViewById(16908290);
                    findViewWithTag = viewGroup2 != null ? viewGroup2.findViewWithTag("GuangGuang_Tab_Icon") : null;
                }
                if (findViewWithTag != null) {
                    Object tag = findViewWithTag.getTag(R.id.layout_manager_icon_display_manager);
                    if (tag instanceof b) {
                        return (b) tag;
                    }
                }
            }
        }
        return null;
    }

    private static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enable_hide_festival_text", "true").equals("true");
    }

    private static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enable_custom_tab_animation", "true").equals("true");
    }

    private static int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[0])).intValue() : oec.a((Object) OrangeConfig.getInstance().getConfig("weitao_switch", "text_animation_duration", "350"), 350);
    }

    private static int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[0])).intValue() : oec.a((Object) OrangeConfig.getInstance().getConfig("weitao_switch", "tab_animation_duration", "600"), 600);
    }

    private static int c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{new Integer(i)})).intValue() : i > 0 ? i : oec.a((Object) OrangeConfig.getInstance().getConfig("weitao_switch", "tab_animation_interval", "2000"), 2000);
    }

    private static int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad401d6b", new Object[]{new Integer(i)})).intValue();
        }
        if (i > 0) {
            int n = i - n();
            if (n <= 0) {
                return 0;
            }
            return n;
        }
        return oec.a((Object) OrangeConfig.getInstance().getConfig("weitao_switch", "text_animation_interval", "2000"), 2000);
    }

    private static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enable_filter_same_icon", "true").equals("true");
    }

    private static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enable_navi_same_icon_args_compare", "true").equals("true");
    }

    private static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enable_register_tabicon_visibility", "true").equals("true");
    }

    private static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enable_check_guangguang", "true").equals("true");
    }

    private static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enable_fade_for_loop", "true").equals("true");
    }

    private static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enable_fix_text_animation", "true").equals("true");
    }

    public static aa a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("62af818e", new Object[]{bVar});
        }
        if (bVar != null && b.b(bVar) != null) {
            return b.b(bVar).A();
        }
        ogg.a("GuangGuang_Tab_Icon", bVar + "拿到的node节点为空");
        return null;
    }

    public static aa c(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("3603f689", new Object[]{cVar});
        }
        if (cVar != null && cVar.f19938a != null) {
            return cVar.f19938a.A();
        }
        ogg.a("GuangGuang_Tab_Icon", cVar + "拿到的node节点为空");
        return null;
    }
}
