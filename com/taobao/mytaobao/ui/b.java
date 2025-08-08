package com.taobao.mytaobao.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.tbtheme.kit.g;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.message.lab.comfrm.util.ExtentionFunctionKt;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.mytaobao.homepage.busniess.model.SkinData;
import com.taobao.mytaobao.ultron.navtiveview.UserHeaderBgLayout;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.d;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.mtz;
import tb.mue;
import tb.mwz;
import tb.mxa;
import tb.mxj;
import tb.mxo;
import tb.mxq;
import tb.xoy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0013J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001aJ&\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\rJ\u0010\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010$\u001a\u00020\u00132\u0006\u0010!\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0002J\u000e\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0004J\u000e\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u0018J\u0006\u0010,\u001a\u00020\u0013J\u000e\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020%J\u0010\u00102\u001a\u00020\u00132\u0006\u00101\u001a\u00020%H\u0002J\u0010\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u000205H\u0002J\u0006\u00106\u001a\u00020\u0013J\b\u00107\u001a\u00020\u0013H\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/taobao/mytaobao/ui/TitleBarHelper;", "", "()V", "<set-?>", "", "actoinBarTxtColor", "getActoinBarTxtColor", "()I", "lazyInitThemeTask", "Ljava/lang/Runnable;", "mActionLayoutListener", "Lcom/taobao/mytaobao/homepage/IActionLayoutImpl;", "mHeaderBgLayout", "Lcom/taobao/mytaobao/ultron/navtiveview/UserHeaderBgLayout;", "mRecyclerView", "Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", "refreshLayout", "Lcom/taobao/uikit/extend/component/refresh/TBSwipeRefreshLayout;", "considerInitTitleBarTheme", "", "ctx", "Landroid/content/Context;", "considerResizeTheme", "refreshThemeBySnapshot", "", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "initActionBarContentFromRequest", "mtopData", "initViews", "rootView", "Landroid/view/View;", "rv", "headerBgLayout", "lazyInitTitleBarTheme", "processActionBarVisibility", "Landroid/support/v7/widget/RecyclerView;", "threshold", "dy", "processOnScroll", "scrollY", "refreshActionBarContent", "actionByMtop", "refreshSkin", "setActionBarRootViewClickListener", "clickListener", "Landroid/view/View$OnClickListener;", "setParentListView", OrderConfigs.RECYCLERVIEW, "updateActionBar", "updateActionBarSkin", "useSkin", "Lcom/taobao/mytaobao/homepage/busniess/model/SkinData;", "updateTheme", "updateThemeHeight", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.mytaobao.homepage.a f18472a;
    private UserHeaderBgLayout b;
    private MTPtrRecyclerView c;
    private TBSwipeRefreshLayout d;
    private Runnable e;
    private int f = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.taobao.mytaobao.ui.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class RunnableC0741b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public RunnableC0741b(Context context) {
            this.b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ThemeFrameLayout a2 = j.a().a(this.b, new g("mytaobao", 1, mxo.g()));
            com.taobao.mytaobao.homepage.a a3 = b.a(b.this);
            if (a3 != null) {
                a3.a(a2);
            }
            b.this.c();
        }
    }

    static {
        kge.a(1962871458);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "succPhenixEvent", "Lcom/taobao/phenix/intf/event/SuccPhenixEvent;", "kotlin.jvm.PlatformType", "onHappen"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class c<T extends d> implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f18475a;

        public c(FrameLayout frameLayout) {
            this.f18475a = frameLayout;
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public final boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            FrameLayout frameLayout = this.f18475a;
            q.a((Object) succPhenixEvent, "succPhenixEvent");
            frameLayout.setBackgroundDrawable(succPhenixEvent.getDrawable());
            return true;
        }
    }

    public static final /* synthetic */ com.taobao.mytaobao.homepage.a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.homepage.a) ipChange.ipc$dispatch("1155fcf5", new Object[]{bVar}) : bVar.f18472a;
    }

    public static final /* synthetic */ void a(b bVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c5d17c", new Object[]{bVar, recyclerView});
        } else {
            bVar.b(recyclerView);
        }
    }

    public static final /* synthetic */ void a(b bVar, RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da5c2dc", new Object[]{bVar, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            bVar.a(recyclerView, i, i2);
        }
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f;
    }

    public final void a(View rootView, MTPtrRecyclerView rv, TBSwipeRefreshLayout refreshLayout, UserHeaderBgLayout headerBgLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e7d22d", new Object[]{this, rootView, rv, refreshLayout, headerBgLayout});
            return;
        }
        q.c(rootView, "rootView");
        q.c(rv, "rv");
        q.c(refreshLayout, "refreshLayout");
        q.c(headerBgLayout, "headerBgLayout");
        this.c = rv;
        this.d = refreshLayout;
        this.b = headerBgLayout;
        this.f18472a = new mue(rootView);
        boolean a2 = mxj.a("optShowTitleBarLogic", true);
        MTPtrRecyclerView mTPtrRecyclerView = this.c;
        if (mTPtrRecyclerView == null) {
            return;
        }
        mTPtrRecyclerView.addOnScrollListener(new a(a2));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/taobao/mytaobao/ui/TitleBarHelper$initViews$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", OrderConfigs.RECYCLERVIEW, "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 806944192) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode != 2142696127) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
        }

        public a(boolean z) {
            this.b = z;
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            q.c(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (this.b) {
                return;
            }
            b.a(b.this, recyclerView);
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            q.c(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (!this.b) {
                b.a(b.this, recyclerView);
            } else {
                b.a(b.this, recyclerView, -DisplayUtil.dip2px(20.0f), i2);
            }
        }
    }

    private final void a(RecyclerView recyclerView, int i, int i2) {
        com.taobao.mytaobao.homepage.a aVar;
        RecyclerView.ViewHolder findFirstVisibleViewHoler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (i2 == 0 || (aVar = this.f18472a) == null || (findFirstVisibleViewHoler = ExtentionFunctionKt.findFirstVisibleViewHoler(recyclerView)) == null) {
        } else {
            if (findFirstVisibleViewHoler.getAdapterPosition() > 0) {
                if (aVar.c() == 0) {
                    return;
                }
                aVar.a(true);
                return;
            }
            View view = findFirstVisibleViewHoler.itemView;
            q.a((Object) view, "firstVH.itemView");
            if (view.getHeight() > 0) {
                View view2 = findFirstVisibleViewHoler.itemView;
                q.a((Object) view2, "firstVH.itemView");
                if (view2.getTop() < i) {
                    if (aVar.c() == 0) {
                        return;
                    }
                    aVar.a(true);
                    return;
                }
            }
            if (aVar.c() == 4) {
                return;
            }
            aVar.a(false);
        }
    }

    public final void a(Context ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, ctx});
            return;
        }
        q.c(ctx, "ctx");
        if (!mxa.c()) {
            return;
        }
        b(ctx);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Runnable runnable = this.e;
        if (runnable == null) {
            return;
        }
        mtz.f31263a.removeCallbacks(runnable);
    }

    public final void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
        } else if (mxa.c()) {
            f();
        } else {
            e();
        }
    }

    public final void c() {
        TBRefreshHeader refresHeader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ThemeData b = j.a().b("mytaobao");
        if (b == null) {
            return;
        }
        int a2 = mxq.a(b.getActionbarTextColor(), -1);
        this.f = a2;
        com.taobao.mytaobao.homepage.a aVar = this.f18472a;
        if (aVar != null) {
            aVar.a(a2);
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.d;
        if (tBSwipeRefreshLayout == null || (refresHeader = tBSwipeRefreshLayout.getRefresHeader()) == null) {
            return;
        }
        refresHeader.setRefreshTipColor(a2);
    }

    public final void a(View.OnClickListener clickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, clickListener});
            return;
        }
        q.c(clickListener, "clickListener");
        com.taobao.mytaobao.homepage.a aVar = this.f18472a;
        if (aVar == null) {
            return;
        }
        aVar.a(clickListener);
    }

    public final void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        q.c(recyclerView, "recyclerView");
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout == null) {
            return;
        }
        userHeaderBgLayout.setParentListView(recyclerView);
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout == null) {
            return;
        }
        userHeaderBgLayout.processOnScroll(i);
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.mytaobao.homepage.a aVar = this.f18472a;
        if (aVar == null) {
            return;
        }
        aVar.b(z);
    }

    public final void a(JSONObject mtopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, mtopData});
            return;
        }
        q.c(mtopData, "mtopData");
        com.taobao.mytaobao.homepage.a aVar = this.f18472a;
        if (aVar == null) {
            return;
        }
        aVar.a(mtopData);
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout == null) {
            return;
        }
        com.taobao.mytaobao.ultron.b a2 = com.taobao.mytaobao.ultron.b.a();
        q.a((Object) a2, "MTBDataProvider.getInstance()");
        JSONObject k = a2.k();
        String str = null;
        String string = k != null ? k.getString(SkinData.KEY_GLOBAL_BG_HEIGHT) : null;
        com.taobao.mytaobao.ultron.b a3 = com.taobao.mytaobao.ultron.b.a();
        q.a((Object) a3, "MTBDataProvider.getInstance()");
        JSONObject k2 = a3.k();
        if (k2 != null) {
            str = k2.getString(SkinData.KEY_GLOBAL_HORIZONTAL_BG_HEIGHT);
        }
        userHeaderBgLayout.updateThemeHeight(mxq.b(xoy.a(string, str, 210)));
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.mytaobao.ultron.b a2 = com.taobao.mytaobao.ultron.b.a();
        q.a((Object) a2, "MTBDataProvider.getInstance()");
        SkinData changeFestivalSkinData = SkinData.getChangeFestivalSkinData(a2.k());
        String str = null;
        SkinData skinData = null;
        if (changeFestivalSkinData == null) {
            com.taobao.mytaobao.ultron.b a3 = com.taobao.mytaobao.ultron.b.a();
            q.a((Object) a3, "MTBDataProvider.getInstance()");
            JSONObject k = a3.k();
            if (k != null) {
                str = k.toJSONString();
            }
            changeFestivalSkinData = str != null ? (SkinData) JSON.parseObject(str, SkinData.class) : skinData;
        }
        if (changeFestivalSkinData == null) {
            return;
        }
        a(changeFestivalSkinData);
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout == null) {
            return;
        }
        userHeaderBgLayout.loadData(changeFestivalSkinData);
    }

    private final void a(SkinData skinData) {
        TBRefreshHeader refresHeader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f4af04", new Object[]{this, skinData});
            return;
        }
        com.taobao.mytaobao.homepage.a aVar = this.f18472a;
        if (aVar == null) {
            return;
        }
        FrameLayout a2 = aVar.a();
        a2.setBackgroundDrawable(null);
        String str = skinData.actionBarBackgroundColor;
        String str2 = skinData.actionBarBackgroundImage;
        String str3 = skinData.actionbarTextColor;
        if (q.a((Object) "normal", (Object) skinData.vipType)) {
            if (!StringUtils.isEmpty(skinData.whiteActionBarBackgroundColor)) {
                str = skinData.whiteActionBarBackgroundColor;
            }
            if (!StringUtils.isEmpty(skinData.whiteActionBarBackgroundImage)) {
                str2 = skinData.whiteActionBarBackgroundImage;
            }
            if (!StringUtils.isEmpty(skinData.whiteNaviActionbarTextColor)) {
                str3 = skinData.whiteNaviActionbarTextColor;
            }
        }
        int b = mxq.b(str);
        if (!StringUtils.isEmpty(str2)) {
            com.taobao.phenix.intf.b.h().a(str2).succListener(new c(a2)).fetch();
        } else if (b != -1) {
            a2.setBackgroundDrawable(new ColorDrawable(b));
        }
        int a3 = mxq.a(str3, -1);
        this.f = a3;
        aVar.a(a3);
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.d;
        if (tBSwipeRefreshLayout == null || (refresHeader = tBSwipeRefreshLayout.getRefresHeader()) == null) {
            return;
        }
        refresHeader.setRefreshTipColor(a3);
    }

    private final void b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1012817", new Object[]{this, recyclerView});
            return;
        }
        com.taobao.mytaobao.homepage.a aVar = this.f18472a;
        if (aVar == null) {
            return;
        }
        if (mwz.a(recyclerView) > 0) {
            if (aVar.c() == 0) {
                return;
            }
            aVar.a(true);
        } else if (aVar.c() == 4) {
        } else {
            MTPtrRecyclerView mTPtrRecyclerView = this.c;
            if (mTPtrRecyclerView != null) {
                mTPtrRecyclerView.onReset();
            }
            aVar.a(false);
        }
    }

    private final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        RunnableC0741b runnableC0741b = new RunnableC0741b(context);
        mtz.f31263a.postDelayed(runnableC0741b, 2000L);
        this.e = runnableC0741b;
    }
}
