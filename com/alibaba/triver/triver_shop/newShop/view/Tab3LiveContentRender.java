package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.view.h;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.nav.Nav;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveLifeCycleEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import java.util.Hashtable;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.jvm.internal.x;
import kotlin.t;
import tb.ceg;
import tb.cen;
import tb.kge;
import tb.pjf;
import tb.pjg;
import tb.pji;
import tb.pjx;
import tb.pkf;
import tb.pkg;
import tb.pki;
import tb.ruk;
import tb.rul;
import tb.ssr;
import tb.sty;

/* loaded from: classes3.dex */
public final class Tab3LiveContentRender implements LifecycleObserver, h, pjg, pji, pkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3913a;
    private final com.alibaba.triver.triver_shop.newShop.data.g b;
    private final String c;
    private final String d;
    private final String e;
    private boolean f;
    private TaoliveOpenLiveRoom g;
    private View h;
    private ViewGroup i;
    private final kotlin.d j;
    private final kotlin.d k;
    private final int l;
    private final int m;
    private TextView n;
    private LiveStatus o;
    private final View p;
    private final kotlin.d q;
    private final a r;
    private final boolean s;

    /* loaded from: classes3.dex */
    public enum LiveStatus {
        LIVING,
        ERROR,
        END,
        RETRY_LOADING
    }

    /* loaded from: classes3.dex */
    public static final class b implements sty {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.sty
        public final void a(View view, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b9b1c8", new Object[]{this, view, str, str2, str3});
                return;
            }
            com.alibaba.triver.triver_shop.newShop.data.d g = Tab3LiveContentRender.g(Tab3LiveContentRender.this).g();
            if (g == null || g.T() == null) {
                return;
            }
            Tab3LiveContentRender tab3LiveContentRender = Tab3LiveContentRender.this;
            com.alibaba.triver.triver_shop.newShop.data.d g2 = Tab3LiveContentRender.g(tab3LiveContentRender).g();
            String str4 = null;
            Nav from = Nav.from(g2 == null ? null : g2.am());
            StringBuilder sb = new StringBuilder();
            sb.append("https://shop");
            com.alibaba.triver.triver_shop.newShop.data.d g3 = Tab3LiveContentRender.g(tab3LiveContentRender).g();
            if (g3 != null) {
                str4 = g3.T();
            }
            sb.append((Object) str4);
            sb.append(".taobao.com?shop_navi=live");
            from.toUri(sb.toString());
        }
    }

    static {
        kge.a(-1407461348);
        kge.a(-884443079);
        kge.a(-1829180491);
        kge.a(514298380);
        kge.a(-598112112);
        kge.a(2139684418);
    }

    @Override // tb.pji
    public void cO_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128009a", new Object[]{this});
        }
    }

    @Override // tb.pji
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        }
    }

    @Override // tb.pji
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        }
    }

    @Override // tb.pji
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        }
    }

    public Tab3LiveContentRender(Context context, com.alibaba.triver.triver_shop.newShop.data.g tabBarItemDataModel, boolean z) {
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(tabBarItemDataModel, "tabBarItemDataModel");
        this.f3913a = context;
        this.b = tabBarItemDataModel;
        this.s = z;
        this.c = "PageShop_LiveWatch";
        this.d = "a2141.b49677444";
        this.e = "https://img.alicdn.com/imgextra/i2/O1CN01rZcLuK236rJa0IcKT_!!6000000007207-2-tps-52-20.png";
        this.j = kotlin.e.a(new Tab3LiveContentRender$rootView$2(this));
        this.k = kotlin.e.a(new Tab3LiveContentRender$shopHeaderExtraView$2(this));
        this.l = com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(cen.Companion.b(40)));
        this.m = com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(cen.Companion.a(36)));
        this.o = LiveStatus.LIVING;
        View a2 = com.alibaba.triver.triver_shop.newShop.ext.o.a(this.f3913a, R.layout.view_tab3_live_loading_layout);
        if (a2 == null) {
            a2 = null;
        } else {
            TUrlImageView tUrlImageView = (TUrlImageView) a2.findViewById(R.id.view_tab3_live_progress_icon);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01Lz8fBP1FtCKzfI6Ig_!!6000000000544-54-tps-72-72.apng");
                tUrlImageView.setSkipAutoSize(true);
            }
            t tVar = t.INSTANCE;
        }
        this.p = a2;
        this.q = kotlin.e.a(new Tab3LiveContentRender$liveErrorView$2(this));
        this.r = new a();
    }

    public static final /* synthetic */ void a(Tab3LiveContentRender tab3LiveContentRender, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764bf7", new Object[]{tab3LiveContentRender, new Boolean(z)});
        } else {
            tab3LiveContentRender.c(z);
        }
    }

    public static final /* synthetic */ void d(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba91551a", new Object[]{tab3LiveContentRender});
        } else {
            tab3LiveContentRender.s();
        }
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.g g(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.g) ipChange.ipc$dispatch("150d81e5", new Object[]{tab3LiveContentRender}) : tab3LiveContentRender.b;
    }

    public static final /* synthetic */ void j(Tab3LiveContentRender tab3LiveContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8519254", new Object[]{tab3LiveContentRender});
        } else {
            tab3LiveContentRender.x();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            h.a.a(this, f);
        }
    }

    public /* synthetic */ Tab3LiveContentRender(Context context, com.alibaba.triver.triver_shop.newShop.data.g gVar, boolean z, int i, kotlin.jvm.internal.o oVar) {
        this(context, gVar, (i & 4) != 0 ? false : z);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.f;
    }

    public final FrameLayout p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("4166d982", new Object[]{this}) : (FrameLayout) this.j.getValue();
    }

    private final View q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bc794eba", new Object[]{this}) : (View) this.k.getValue();
    }

    private final View r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6aae7fb", new Object[]{this}) : (View) this.q.getValue();
    }

    /* loaded from: classes3.dex */
    public static final class a implements pjf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.pjh
        public void cQ_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("491b1d8", new Object[]{this});
            } else {
                ceg.Companion.b("tab3 onStreamPlay");
            }
        }

        @Override // tb.pjh
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            ceg.Companion.b("tab3 streamPause");
            Tab3LiveContentRender.this.l();
        }

        @Override // tb.pjj
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            ceg.Companion.b("tab3 playerFirstFrameRender");
            Tab3LiveContentRender.this.k();
        }

        @Override // tb.pjj
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            ceg.Companion.b("tab3 playerError");
            Tab3LiveContentRender.this.l();
        }

        @Override // tb.pjk
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                ceg.Companion.b("tab3 onLive");
            }
        }

        @Override // tb.pjk
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            ceg.Companion.b("tab3 onReplay");
            Tab3LiveContentRender.this.m();
        }

        @Override // tb.pjk
        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            } else {
                ceg.Companion.b("tab3 onPrelive");
            }
        }

        @Override // tb.pjl
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
                return;
            }
            ceg.Companion.b("tab3 liveRoomUserLeave");
            Tab3LiveContentRender.this.l();
        }

        @Override // tb.pjl
        public void aQ_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ac53b56", new Object[]{this});
                return;
            }
            ceg.Companion.b("tab3 liveRoomEnd");
            Tab3LiveContentRender.this.m();
        }
    }

    private final void c(boolean z) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = hashtable;
        String k = this.b.k();
        if (k == null) {
            com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
            k = g == null ? null : g.U();
        }
        hashtable2.put("accountId", k);
        String str = "";
        hashtable2.put("accountType", str);
        JSONObject j = this.b.j();
        if (j != null && (string = j.getString("livesource")) != null) {
            str = string;
        }
        hashtable2.put("followSource", str);
        if (z) {
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.g;
            if (taoliveOpenLiveRoom == null) {
                return;
            }
            taoliveOpenLiveRoom.callPlatform(PlatformListenerEnum.onFollowAction, hashtable);
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.g;
        if (taoliveOpenLiveRoom2 == null) {
            return;
        }
        taoliveOpenLiveRoom2.callPlatform(PlatformListenerEnum.onUnfollowAciton, hashtable);
    }

    private final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.g;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callPlatform(PlatformListenerEnum.callReportAction, new Object[0]);
    }

    private final FrameLayout t() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6227d8fe", new Object[]{this});
        }
        View inflate = View.inflate(this.f3913a, R.layout.view_tab3_live_root_layout, null);
        if (inflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.h = frameLayout.findViewById(R.id.view_tab3_live_mask);
        View view = this.h;
        if (view != null && (findViewById = view.findViewById(R.id.view_shop_tab_3_top_gray_shadow)) != null) {
            com.alibaba.triver.triver_shop.newShop.ext.o.a(findViewById, com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 150));
        }
        if (this.s) {
            View findViewById2 = frameLayout.findViewById(R.id.bottomMask);
            kotlin.jvm.internal.q.b(findViewById2, "frameLayout.findViewById<View>(R.id.bottomMask)");
            com.alibaba.triver.triver_shop.newShop.ext.o.d(findViewById2);
        }
        this.i = (ViewGroup) frameLayout.findViewById(R.id.shop_view_tab3_container);
        frameLayout.setBackgroundColor(Color.parseColor("#363b47"));
        VerticalSwipeDetectorLayout verticalSwipeDetectorLayout = new VerticalSwipeDetectorLayout(this, this.f3913a);
        com.alibaba.triver.triver_shop.newShop.ext.o.a(verticalSwipeDetectorLayout, frameLayout);
        return verticalSwipeDetectorLayout;
    }

    /* loaded from: classes3.dex */
    public final class VerticalSwipeDetectorLayout extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean alreadyDetect;
        private float startX;
        private float startY;
        public final /* synthetic */ Tab3LiveContentRender this$0;
        private final int touchSlop;

        static {
            kge.a(-280557460);
        }

        public static /* synthetic */ Object ipc$super(VerticalSwipeDetectorLayout verticalSwipeDetectorLayout, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerticalSwipeDetectorLayout(Tab3LiveContentRender this$0, Context context) {
            super(context);
            kotlin.jvm.internal.q.d(this$0, "this$0");
            kotlin.jvm.internal.q.d(context, "context");
            this.this$0 = this$0;
            this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop() << 1;
        }

        public final float getStartX() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ff8f9a3", new Object[]{this})).floatValue() : this.startX;
        }

        public final void setStartX(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58c17e1", new Object[]{this, new Float(f)});
            } else {
                this.startX = f;
            }
        }

        public final float getStartY() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90071124", new Object[]{this})).floatValue() : this.startY;
        }

        public final void setStartY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("740f080", new Object[]{this, new Float(f)});
            } else {
                this.startY = f;
            }
        }

        public final boolean getAlreadyDetect() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f13b2770", new Object[]{this})).booleanValue() : this.alreadyDetect;
        }

        public final void setAlreadyDetect(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd55faf4", new Object[]{this, new Boolean(z)});
            } else {
                this.alreadyDetect = z;
            }
        }

        public final int getTouchSlop() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa4b321d", new Object[]{this})).intValue() : this.touchSlop;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent == null) {
                return false;
            }
            if (com.alibaba.triver.triver_shop.newShop.ext.o.a(motionEvent)) {
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
                this.alreadyDetect = false;
            }
            if (com.alibaba.triver.triver_shop.newShop.ext.o.d(motionEvent) && !this.alreadyDetect && Math.abs(motionEvent.getY() - this.startY) > Math.abs(motionEvent.getX() - this.startX) && com.alibaba.triver.triver_shop.newShop.ext.b.a(this.startX, this.startY, motionEvent.getX(), motionEvent.getY()) > this.touchSlop) {
                this.alreadyDetect = true;
                com.alibaba.triver.triver_shop.newShop.ext.m.a("PageShop_LiveWatch", "swipe_up_and_down", (Map) null, 4, (Object) null);
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.j(p());
        com.alibaba.triver.triver_shop.newShop.ext.o.k(p());
        return p();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void e() {
        TaoliveOpenLiveRoom taoliveOpenLiveRoom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        h.a.a(this);
        if (!h() || (taoliveOpenLiveRoom = this.g) == null) {
            return;
        }
        taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onPause, null);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void f() {
        TaoliveOpenLiveRoom taoliveOpenLiveRoom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        h.a.b(this);
        if (!h() || (taoliveOpenLiveRoom = this.g) == null) {
            return;
        }
        taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onResume, null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onActivityFinish() {
        Lifecycle lifecycle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8226c848", new Object[]{this});
            return;
        }
        Context context = this.f3913a;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null || (lifecycle = fragmentActivity.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
        } else if (!h()) {
        } else {
            v();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void c() {
        d.a bb;
        rul<Boolean, t> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        h.a.c(this);
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new Tab3LiveContentRender$onViewSelectedByViewPager$1(this), 400L);
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g != null && (bb = g.bb()) != null && (a2 = bb.a()) != null) {
            a2.mo2421invoke(true);
        }
        try {
            com.alibaba.triver.triver_shop.newShop.ext.h.h(this.b.g());
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.g;
            w();
            if (taoliveOpenLiveRoom != null) {
                JSONObject u = u();
                TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.g;
                if (taoliveOpenLiveRoom2 != null) {
                    taoliveOpenLiveRoom2.callLifeCycle(TaoliveLifeCycleEnum.onCreate, u);
                }
                TaoliveOpenLiveRoom taoliveOpenLiveRoom3 = this.g;
                if (taoliveOpenLiveRoom3 != null) {
                    taoliveOpenLiveRoom3.callLifeCycle(TaoliveLifeCycleEnum.onWillAppear, null);
                }
                TaoliveOpenLiveRoom taoliveOpenLiveRoom4 = this.g;
                if (taoliveOpenLiveRoom4 != null) {
                    taoliveOpenLiveRoom4.callLifeCycle(TaoliveLifeCycleEnum.onDidAppear, null);
                }
            }
        } catch (Throwable th) {
            ceg.Companion.a(th);
            l();
        }
        View shopHeaderExtraView = q();
        kotlin.jvm.internal.q.b(shopHeaderExtraView, "shopHeaderExtraView");
        com.alibaba.triver.triver_shop.newShop.ext.o.b(shopHeaderExtraView);
    }

    private final JSONObject u() {
        Object h;
        d.f bm;
        com.alibaba.triver.triver_shop.newShop.data.d g;
        d.g bi;
        IpChange ipChange = $ipChange;
        boolean z = true;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9bbfd9c", new Object[]{this});
        }
        JSONObject j = this.b.j();
        String str = null;
        if (j == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) j.clone();
        com.alibaba.triver.triver_shop.newShop.data.d g2 = this.b.g();
        JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a((g2 == null || (h = g2.h("live")) == null) ? null : h.toString());
        if (a2 != null) {
            jSONObject.putAll(a2);
            com.alibaba.triver.triver_shop.newShop.data.d g3 = this.b.g();
            if (g3 != null) {
                g3.j("live");
            }
        }
        JSONObject jSONObject2 = jSONObject;
        com.alibaba.triver.triver_shop.newShop.data.d g4 = this.b.g();
        jSONObject2.put((JSONObject) "shop_id", g4 == null ? null : g4.T());
        com.alibaba.triver.triver_shop.newShop.data.d g5 = this.b.g();
        if (g5 != null) {
            str = g5.U();
        }
        jSONObject2.put((JSONObject) "seller_id", str);
        jSONObject2.put((JSONObject) "shop_spm", this.d);
        com.alibaba.triver.triver_shop.newShop.data.d g6 = this.b.g();
        if (g6 == null || (bm = g6.bm()) == null || !bm.d()) {
            z = false;
        }
        if (z && (g = this.b.g()) != null && (bi = g.bi()) != null) {
            z2 = bi.b();
        }
        jSONObject2.put((JSONObject) aw.PARAM_IS_LIVE_MUTE, (String) Boolean.valueOf(z2));
        return jSONObject;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void d() {
        Object m2371constructorimpl;
        d.a bb;
        rul<Boolean, t> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        h.a.d(this);
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g != null && (bb = g.bb()) != null && (a2 = bb.a()) != null) {
            a2.mo2421invoke(false);
        }
        try {
            Result.a aVar = Result.Companion;
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.g;
            if (taoliveOpenLiveRoom != null) {
                taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onPause, null);
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.g;
            if (taoliveOpenLiveRoom2 != null) {
                taoliveOpenLiveRoom2.callLifeCycle(TaoliveLifeCycleEnum.onStop, null);
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom3 = this.g;
            if (taoliveOpenLiveRoom3 != null) {
                taoliveOpenLiveRoom3.callLifeCycle(TaoliveLifeCycleEnum.onDestory, null);
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
        v();
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f3913a);
    }

    private final void v() {
        Object callPlatform;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        Pair[] pairArr = new Pair[3];
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        String str = null;
        pairArr[0] = kotlin.j.a("seller_id", g == null ? null : g.U());
        com.alibaba.triver.triver_shop.newShop.data.d g2 = this.b.g();
        pairArr[1] = kotlin.j.a("shop_id", g2 == null ? null : g2.T());
        com.alibaba.triver.triver_shop.newShop.data.d g3 = this.b.g();
        pairArr[2] = kotlin.j.a("account_id", g3 == null ? null : g3.U());
        Map<String, String> b2 = ai.b(pairArr);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.g;
        if (taoliveOpenLiveRoom != null && (callPlatform = taoliveOpenLiveRoom.callPlatform(PlatformListenerEnum.callFetchUTArgsWithParams, new Object[0])) != null && (callPlatform instanceof Map)) {
            Map<String, String> c = com.alibaba.triver.triver_shop.newShop.ext.b.c((Map) callPlatform);
            if (c.containsValue("spm-url") && x.h(c)) {
                c.remove("spm-url");
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f3913a, c);
        }
        com.alibaba.triver.triver_shop.newShop.ext.m.a(this.f3913a, this.d, this.c);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f3913a, b2);
        Context context = this.f3913a;
        com.alibaba.triver.triver_shop.newShop.data.d g4 = this.b.g();
        if (g4 != null) {
            str = g4.ba();
        }
        com.alibaba.triver.triver_shop.newShop.ext.m.b(context, "identityCode", str);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(ai.b(kotlin.j.a("spm-url", this.d)));
    }

    private final void w() {
        ruk<Integer> g;
        Integer mo2427invoke;
        Lifecycle lifecycle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (this.g != null) {
        } else {
            Map<String, Object> a2 = ai.a(kotlin.j.a("aliveChanel", "TaoBaoShopTab"));
            pjx pjxVar = new pjx();
            pjxVar.a((pjg) this);
            pjxVar.a((pjf) this.r);
            pjxVar.a((pji) this);
            pjxVar.a(new ssr() { // from class: com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender$doLiveRoomInit$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ssr
                public void a(Map<String, String> map) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else if (map == null || (str = map.get("isMuted")) == null) {
                    } else {
                        com.alibaba.triver.triver_shop.newShop.data.d g2 = Tab3LiveContentRender.g(Tab3LiveContentRender.this).g();
                        d.g bi = g2 == null ? null : g2.bi();
                        if (bi == null) {
                            return;
                        }
                        bi.b(kotlin.jvm.internal.q.a((Object) str, (Object) "true"));
                    }
                }
            });
            pkg a3 = pki.a().a(this.f3913a, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString(), this, pjxVar, a2);
            pki.a().a(a3);
            this.g = pki.a().b(a3);
            com.alibaba.triver.triver_shop.newShop.data.d g2 = this.b.g();
            int intValue = (g2 == null || (g = g2.g()) == null || (mo2427invoke = g.mo2427invoke()) == null) ? 0 : mo2427invoke.intValue();
            int i = intValue == 0 ? -1 : intValue;
            FrameLayout p = p();
            View q = q();
            int a4 = com.alibaba.triver.triver_shop.newShop.ext.o.a(Float.valueOf(20.0f));
            com.alibaba.triver.triver_shop.newShop.data.d g3 = this.b.g();
            p.addView(q, com.alibaba.triver.triver_shop.newShop.ext.o.b(0, a4, (g3 == null ? 0 : g3.y()) + com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 20), 0, com.alibaba.triver.triver_shop.newShop.ext.o.c(Float.valueOf(12.0f)), 0, 0, 105, null));
            ViewGroup viewGroup = this.i;
            kotlin.jvm.internal.q.a(viewGroup);
            viewGroup.addView(pki.a().a(a3, this.g), com.alibaba.triver.triver_shop.newShop.ext.o.a(0, i, 0, 0, 0, 0, 0, 125, null));
            JSONObject u = u();
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.g;
            if (taoliveOpenLiveRoom != null) {
                taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onCreate, u);
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.g;
            FragmentActivity fragmentActivity = null;
            if (taoliveOpenLiveRoom2 != null) {
                taoliveOpenLiveRoom2.callLifeCycle(TaoliveLifeCycleEnum.onWillAppear, null);
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom3 = this.g;
            if (taoliveOpenLiveRoom3 != null) {
                taoliveOpenLiveRoom3.callLifeCycle(TaoliveLifeCycleEnum.onDidAppear, null);
            }
            Map a5 = ai.a(kotlin.j.a(DataReceiveMonitor.CB_LISTENER, new b()));
            TaoliveOpenLiveRoom taoliveOpenLiveRoom4 = this.g;
            if (taoliveOpenLiveRoom4 != null) {
                taoliveOpenLiveRoom4.callPlatform(PlatformListenerEnum.setSmallWindowClickListener, a5);
            }
            com.alibaba.triver.triver_shop.newShop.data.d g4 = this.b.g();
            d.a bb = g4 == null ? null : g4.bb();
            if (bb != null) {
                bb.d(new Tab3LiveContentRender$doLiveRoomInit$2(this));
            }
            com.alibaba.triver.triver_shop.newShop.data.d g5 = this.b.g();
            d.a bb2 = g5 == null ? null : g5.bb();
            if (bb2 != null) {
                bb2.a(new Tab3LiveContentRender$doLiveRoomInit$3(this));
            }
            Context context = this.f3913a;
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
            }
            if (fragmentActivity == null || (lifecycle = fragmentActivity.getLifecycle()) == null) {
                return;
            }
            lifecycle.addObserver(this);
        }
    }

    @Override // tb.pkf
    public Float aR_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("7d17be3e", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        return Float.valueOf(g == null ? 0.0f : g.y());
    }

    @Override // tb.pkf
    public Float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("c7707cb9", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        return Float.valueOf((g == null ? 0.0f : g.x()) + this.m);
    }

    @Override // tb.pkf
    public View j() {
        d.C0135d G;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        ViewGroup viewGroup = null;
        if (g != null && (G = g.G()) != null) {
            viewGroup = G.c();
        }
        if (viewGroup != null) {
            return viewGroup;
        }
        View decorView = ((Activity) this.f3913a).getWindow().getDecorView();
        kotlin.jvm.internal.q.b(decorView, "context as Activity).window.decorView");
        return decorView;
    }

    public final void k() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.o == LiveStatus.LIVING) {
        } else {
            this.o = LiveStatus.LIVING;
            d(true);
            if (r().getParent() != null && (viewGroup = this.i) != null) {
                viewGroup.removeView(r());
            }
            y();
            TextView textView = this.n;
            if (textView == null) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.b(textView);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.o == LiveStatus.ERROR) {
        } else {
            this.o = LiveStatus.ERROR;
            d(false);
            View r = r();
            if (r != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.j(r);
            }
            ViewGroup viewGroup = this.i;
            if (viewGroup != null) {
                viewGroup.addView(r());
            }
            View view = this.p;
            if (view != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.j(view);
            }
            TextView textView = this.n;
            if (textView == null) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.d(textView);
        }
    }

    private final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        View liveErrorView = r();
        kotlin.jvm.internal.q.b(liveErrorView, "liveErrorView");
        com.alibaba.triver.triver_shop.newShop.ext.o.j(liveErrorView);
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            View view = this.p;
            if (view == null) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup, view);
        }
        this.o = LiveStatus.RETRY_LOADING;
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new Tab3LiveContentRender$showRetryLoading$1(this), 5000L);
    }

    private final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        View view = this.p;
        if (view == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.j(view);
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.o == LiveStatus.END) {
        } else {
            this.o = LiveStatus.END;
            d(false);
            String str = null;
            View inflate = View.inflate(this.f3913a, R.layout.view_tab3_live_end_layout, null);
            ViewGroup viewGroup = this.i;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            ViewGroup viewGroup2 = this.i;
            if (viewGroup2 != null) {
                viewGroup2.addView(inflate, com.alibaba.triver.triver_shop.newShop.ext.o.a(0, 0, 0, 0, 0, 0, 0, 127, null));
            }
            Context context = this.f3913a;
            Pair[] pairArr = new Pair[2];
            com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
            if (g != null) {
                str = g.U();
            }
            pairArr[0] = kotlin.j.a("sellerId", str);
            pairArr[1] = kotlin.j.a("pre", "true");
            com.alibaba.triver.triver_shop.newShop.ext.a.a(context, "mtop.mediaplatform.live.getshopliveinfoList", AfcCustomSdk.SDK_VERSION, ai.b(pairArr), new Tab3LiveContentRender$onLiveEnd$1(inflate, this), Tab3LiveContentRender$onLiveEnd$2.INSTANCE, false, false, false, null, false, null, RSoException.ERROR_LOAD_FALLBACK_SYSTEM_LOAD_FAILED, null);
        }
    }

    private final void d(boolean z) {
        d.a bb;
        rul<Boolean, t> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g == null || (bb = g.bb()) == null || (c = bb.c()) == null) {
            return;
        }
        c.mo2421invoke(Boolean.valueOf(z));
    }

    @Override // tb.pjg
    public void a(String str) {
        TextView textView;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            TextView textView2 = this.n;
            if (textView2 == null || textView2.getVisibility() != 4) {
                z = false;
            }
            if (z && this.o != LiveStatus.ERROR && (textView = this.n) != null) {
                textView.setVisibility(0);
            }
            TextView textView3 = this.n;
            if (textView3 == null) {
                return;
            }
            textView3.setText(String.valueOf(str));
        }
    }

    @Override // tb.pjg
    public void a(String str, String str2, String str3) {
        d.a bb;
        rul<Boolean, t> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g == null || (bb = g.bb()) == null || (e = bb.e()) == null) {
            return;
        }
        e.mo2421invoke(true);
    }

    @Override // tb.pjg
    public void b(String str, String str2, String str3) {
        d.a bb;
        rul<Boolean, t> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g == null || (bb = g.bb()) == null || (e = bb.e()) == null) {
            return;
        }
        e.mo2421invoke(false);
    }

    @Override // tb.pjg
    public void b(boolean z) {
        d.a bb;
        rul<Boolean, t> b2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        View q = q();
        if (q != null) {
            if (z) {
                i = 8;
            }
            q.setVisibility(i);
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g == null || (bb = g.bb()) == null || (b2 = bb.b()) == null) {
            return;
        }
        b2.mo2421invoke(Boolean.valueOf(z));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void g() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            p().removeAllViews();
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.g;
            if (taoliveOpenLiveRoom != null) {
                taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onWillDisappear, null);
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.g;
            if (taoliveOpenLiveRoom2 != null) {
                taoliveOpenLiveRoom2.callLifeCycle(TaoliveLifeCycleEnum.onDidDisappear, null);
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom3 = this.g;
            if (taoliveOpenLiveRoom3 != null) {
                taoliveOpenLiveRoom3.callLifeCycle(TaoliveLifeCycleEnum.onDestory, null);
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
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

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onActivityStop() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.g;
            if (taoliveOpenLiveRoom != null) {
                taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onStop, null);
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
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
