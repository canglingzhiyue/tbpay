package com.taobao.themis.pub.titlebar.action;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.guide.PubAddIconGuide;
import com.taobao.themis.pub_kit.guide.i;
import com.taobao.themis.pub_kit.guide.model.PubAddIconTipsModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.utils.k;
import com.taobao.themis.utils.p;
import com.uc.webview.export.media.MessageID;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ood;
import tb.qrc;
import tb.qrd;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0002'(B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0017H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubAddIconAction;", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "Lcom/taobao/themis/pub/titlebar/action/IAddIconAction;", "mUserGuideModule", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "mPubAddIconCallback", "Lcom/taobao/themis/pub/titlebar/action/PubAddIconAction$PubAddIconCallback;", "(Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;Lcom/taobao/themis/pub/titlebar/action/PubAddIconAction$PubAddIconCallback;)V", "mAddIconTips", "Lcom/taobao/themis/pub_kit/guide/model/PubAddIconTipsModel;", "mAddIconTipsDisplay", "", "mPubAddHomeBg", "Landroid/widget/FrameLayout;", "mPubAddHomeButton", "Landroid/widget/ImageView;", "mPubAddIconGuide", "Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide;", "mShowAddIconTips", "Ljava/lang/Runnable;", "mUserEnterTime", "", "addToIcon", "", "userGuideModule", "attachPage", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", MessageID.onDestroy, "onHide", "onShow", "setStyle", "style", "Lcom/taobao/themis/kernel/container/Window$Theme;", "showAddIconTips", "Companion", "PubAddIconCallback", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a extends com.taobao.themis.kernel.container.ui.titlebar.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0969a Companion;
    public static final String TAG = "PubAddIconAction";

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f22751a;
    private ImageView b;
    private final PubAddIconTipsModel c;
    private volatile boolean d;
    private final long e;
    private PubAddIconGuide f;
    private final Runnable g;
    private final PubUserGuideModule h;
    private final b i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubAddIconAction$PubAddIconCallback;", "", "hasClickAddIcon", "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface b {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
            if (r3.a(r6, r1) != true) goto L28;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r8 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.pub.titlebar.action.a.c.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 1
                if (r1 == 0) goto L12
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r2 = 0
                r1[r2] = r8
                java.lang.String r2 = "5c510192"
                r0.ipc$dispatch(r2, r1)
                return
            L12:
                com.taobao.themis.pub.titlebar.action.a r0 = com.taobao.themis.pub.titlebar.action.a.this
                com.taobao.themis.pub_kit.guide.model.PubAddIconTipsModel r0 = com.taobao.themis.pub.titlebar.action.a.c(r0)
                if (r0 == 0) goto Le6
                com.taobao.themis.pub.titlebar.action.a r0 = com.taobao.themis.pub.titlebar.action.a.this
                boolean r0 = com.taobao.themis.pub.titlebar.action.a.d(r0)
                if (r0 == 0) goto L24
                goto Le6
            L24:
                com.taobao.themis.pub.titlebar.action.a r0 = com.taobao.themis.pub.titlebar.action.a.this
                com.taobao.themis.kernel.page.ITMSPage r0 = com.taobao.themis.pub.titlebar.action.a.a(r0)
                if (r0 != 0) goto L2d
                return
            L2d:
                boolean r1 = tb.qqc.a(r0)
                if (r1 != 0) goto L34
                return
            L34:
                java.lang.Class<com.taobao.themis.kernel.adapter.IAccountAdapter> r1 = com.taobao.themis.kernel.adapter.IAccountAdapter.class
                java.lang.Object r1 = tb.qpt.a(r1)
                com.taobao.themis.kernel.adapter.IAccountAdapter r1 = (com.taobao.themis.kernel.adapter.IAccountAdapter) r1
                com.taobao.themis.kernel.f r3 = r0.b()
                java.lang.String r1 = r1.getUserId(r3)
                if (r1 != 0) goto L47
                return
            L47:
                com.taobao.themis.kernel.f r3 = r0.b()
                java.lang.Class<com.taobao.themis.pub_kit.config.PubContainerContext> r4 = com.taobao.themis.pub_kit.config.PubContainerContext.class
                java.lang.Object r3 = r3.a(r4)
                com.taobao.themis.pub_kit.config.PubContainerContext r3 = (com.taobao.themis.pub_kit.config.PubContainerContext) r3
                if (r3 == 0) goto L5a
                com.taobao.themis.pub_kit.guide.e r3 = r3.getPubOperateGuide()
                goto L5b
            L5a:
                r3 = 0
            L5b:
                java.lang.String r4 = "PubAddIconAction"
                java.lang.String r5 = "page.getInstance().appId"
                if (r3 == 0) goto L73
                com.taobao.themis.kernel.f r6 = r0.b()
                java.lang.String r6 = r6.h()
                kotlin.jvm.internal.q.b(r6, r5)
                boolean r6 = r3.a(r6, r1)
                if (r6 == r2) goto L7b
            L73:
                if (r3 == 0) goto L82
                boolean r3 = r3.a()
                if (r3 != r2) goto L82
            L7b:
                java.lang.String r0 = "showAddIconTips: PubOperateGuide 可以展示，不展示tips"
                com.taobao.themis.kernel.basic.TMSLogger.d(r4, r0)
                return
            L82:
                com.taobao.themis.kernel.f r3 = r0.b()
                java.lang.Class<com.taobao.themis.pub_kit.config.PubContainerContext> r6 = com.taobao.themis.pub_kit.config.PubContainerContext.class
                java.lang.Object r3 = r3.a(r6)
                com.taobao.themis.pub_kit.config.PubContainerContext r3 = (com.taobao.themis.pub_kit.config.PubContainerContext) r3
                if (r3 == 0) goto L9d
                boolean r3 = r3.getHasClickAddIconButton()
                if (r3 != r2) goto L9d
                java.lang.String r0 = "showAddIconTips: 已经点击过添加按钮，不展示tips"
                com.taobao.themis.kernel.basic.TMSLogger.d(r4, r0)
                return
            L9d:
                com.taobao.themis.pub.titlebar.action.a r3 = com.taobao.themis.pub.titlebar.action.a.this
                android.widget.FrameLayout r3 = com.taobao.themis.pub.titlebar.action.a.e(r3)
                if (r3 == 0) goto Le6
                int r3 = r3.getVisibility()
                if (r3 == 0) goto Lac
                return
            Lac:
                com.taobao.themis.pub.titlebar.action.a r3 = com.taobao.themis.pub.titlebar.action.a.this
                com.taobao.themis.pub_kit.guide.PubAddIconGuide r3 = com.taobao.themis.pub.titlebar.action.a.f(r3)
                if (r3 == 0) goto Le6
                com.taobao.themis.pub.titlebar.action.a r4 = com.taobao.themis.pub.titlebar.action.a.this
                com.taobao.themis.pub.titlebar.action.a.a(r4, r2)
                com.taobao.themis.pub.titlebar.action.a r4 = com.taobao.themis.pub.titlebar.action.a.this
                android.widget.FrameLayout r4 = com.taobao.themis.pub.titlebar.action.a.e(r4)
                android.view.View r4 = (android.view.View) r4
                com.taobao.themis.pub_kit.guide.PubAddIconGuide$PubAddIconGuideType r6 = com.taobao.themis.pub_kit.guide.PubAddIconGuide.PubAddIconGuideType.DETAIL_FAVOR_TIPS
                com.taobao.themis.kernel.f r7 = r0.b()
                java.lang.String r7 = r7.h()
                kotlin.jvm.internal.q.b(r7, r5)
                boolean r1 = r3.a(r4, r6, r7, r1)
                if (r1 == 0) goto Le6
                com.taobao.themis.kernel.f r0 = r0.b()
                java.lang.Class<com.taobao.themis.pub_kit.config.PubContainerContext> r1 = com.taobao.themis.pub_kit.config.PubContainerContext.class
                java.lang.Object r0 = r0.a(r1)
                com.taobao.themis.pub_kit.config.PubContainerContext r0 = (com.taobao.themis.pub_kit.config.PubContainerContext) r0
                if (r0 == 0) goto Le6
                r0.setAddIconGuideIsShowing(r2)
            Le6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.pub.titlebar.action.a.c.run():void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/pub/titlebar/action/PubAddIconAction$attachPage$1", "Lcom/taobao/themis/pub_kit/task/PubContainerConfigTask$PubContainerConfigTaskListener;", "onResult", "", "result", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements qrd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f22753a;

        public d(ITMSPage iTMSPage) {
            this.f22753a = iTMSPage;
        }

        @Override // tb.qrd.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule == null) {
            } else {
                com.taobao.themis.pub_kit.utils.f.a("Page_MiniApp_Show-NavBar-2", ai.b(kotlin.j.a("miniapp_id", this.f22753a.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.2"), kotlin.j.a("pageId", this.f22753a.c().e().a()), kotlin.j.a("pageUrl", this.f22753a.e())));
            }
        }
    }

    static {
        kge.a(1670687744);
        kge.a(134006100);
        Companion = new C0969a(null);
    }

    public a() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -78343661:
                super.a((ITMSPage) objArr[0]);
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            case 96532846:
                super.g();
                return null;
            case 547063898:
                super.a((Window.Theme) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ ITMSPage a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("fd3915bc", new Object[]{aVar}) : aVar.d();
    }

    public static final /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7bcdc4f", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.d = z;
        }
    }

    public static final /* synthetic */ PubAddIconTipsModel c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubAddIconTipsModel) ipChange.ipc$dispatch("788582ea", new Object[]{aVar}) : aVar.c;
    }

    public static final /* synthetic */ boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a11e406", new Object[]{aVar})).booleanValue() : aVar.d;
    }

    public static final /* synthetic */ FrameLayout e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("32059a98", new Object[]{aVar}) : aVar.f22751a;
    }

    public static final /* synthetic */ PubAddIconGuide f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubAddIconGuide) ipChange.ipc$dispatch("e4680696", new Object[]{aVar}) : aVar.f;
    }

    public /* synthetic */ a(PubUserGuideModule pubUserGuideModule, b bVar, int i, o oVar) {
        this((i & 1) != 0 ? null : pubUserGuideModule, (i & 2) != 0 ? null : bVar);
    }

    public a(PubUserGuideModule pubUserGuideModule, b bVar) {
        this.h = pubUserGuideModule;
        this.i = bVar;
        PubUserGuideModule pubUserGuideModule2 = this.h;
        this.c = pubUserGuideModule2 != null ? pubUserGuideModule2.getAddIconTips() : null;
        this.e = System.currentTimeMillis();
        this.g = new c();
    }

    public void a(PubUserGuideModule userGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a685392d", new Object[]{this, userGuideModule});
            return;
        }
        q.d(userGuideModule, "userGuideModule");
        ITMSPage d2 = d();
        if (d2 == null) {
            return;
        }
        Activity o = d2.b().o();
        q.b(o, "page.getInstance().activity");
        i iVar = new i(o, userGuideModule, null, 4, null);
        PubAddIconGuide pubAddIconGuide = this.f;
        if (pubAddIconGuide != null) {
            pubAddIconGuide.b();
        }
        b bVar = this.i;
        if (bVar != null) {
            bVar.a();
        }
        PubContainerContext pubContainerContext = (PubContainerContext) d2.b().a(PubContainerContext.class);
        if (pubContainerContext != null) {
            pubContainerContext.setHasClickAddIconButton(true);
        }
        iVar.a();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        q.d(context, "context");
        FrameLayout frameLayout = this.f22751a;
        if (frameLayout != null) {
            return frameLayout;
        }
        this.b = new ImageView(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(k.a(context, 32.0f), k.a(context, 32.0f));
        layoutParams.rightMargin = k.a(context, 12.0f);
        t tVar = t.INSTANCE;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout2.setBackgroundResource(R.drawable.tms_pub_square_bg_dark);
        frameLayout2.addView(this.b);
        p.a(frameLayout2, 0L, new PubAddIconAction$getView$$inlined$apply$lambda$1(this, context), 1, null);
        t tVar2 = t.INSTANCE;
        this.f22751a = frameLayout2;
        ImageView imageView = this.b;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.width = k.a(context, 28.0f);
            layoutParams3.height = k.a(context, 28.0f);
            layoutParams3.gravity = 17;
            t tVar3 = t.INSTANCE;
            imageView.setLayoutParams(layoutParams3);
            imageView.setImageResource(R.drawable.tms_pub_add_home_light);
        }
        FrameLayout frameLayout3 = this.f22751a;
        if (frameLayout3 != null) {
            frameLayout3.setTag(TAG);
        }
        return this.f22751a;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        super.a(page);
        PubContainerContext pubContainerContext = (PubContainerContext) page.b().a(PubContainerContext.class);
        this.f = pubContainerContext != null ? pubContainerContext.getPubAddIconGuide() : null;
        a();
        qrc.a(page.b(), new d(page));
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        a();
    }

    private final void a() {
        String stayTime;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (d() == null || this.d) {
        } else {
            PubAddIconTipsModel pubAddIconTipsModel = this.c;
            int parseInt = (pubAddIconTipsModel == null || (stayTime = pubAddIconTipsModel.getStayTime()) == null) ? 2 : Integer.parseInt(stayTime);
            long currentTimeMillis = System.currentTimeMillis() - this.e;
            long j = parseInt * 1000;
            if (currentTimeMillis > j) {
                com.taobao.themis.kernel.utils.a.a(this.g, 300L);
            } else {
                com.taobao.themis.kernel.utils.a.a(this.g, j - currentTimeMillis);
            }
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(Window.Theme style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209b885a", new Object[]{this, style});
            return;
        }
        q.d(style, "style");
        super.a(style);
        if (style == Window.Theme.LIGHT) {
            FrameLayout frameLayout = this.f22751a;
            if (frameLayout != null) {
                frameLayout.setBackgroundResource(R.drawable.tms_pub_square_bg_dark);
            }
            ImageView imageView = this.b;
            if (imageView == null) {
                return;
            }
            imageView.setImageResource(R.drawable.tms_pub_add_home_light);
            return;
        }
        FrameLayout frameLayout2 = this.f22751a;
        if (frameLayout2 != null) {
            frameLayout2.setBackgroundResource(R.drawable.tms_pub_square_bg_white);
        }
        ImageView imageView2 = this.b;
        if (imageView2 == null) {
            return;
        }
        imageView2.setImageResource(R.drawable.tms_pub_add_home_dark);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        com.taobao.themis.kernel.utils.a.b(this.g);
        PubAddIconGuide pubAddIconGuide = this.f;
        if (pubAddIconGuide == null) {
            return;
        }
        pubAddIconGuide.b();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        com.taobao.themis.kernel.utils.a.b(this.g);
        PubAddIconGuide pubAddIconGuide = this.f;
        if (pubAddIconGuide == null) {
            return;
        }
        pubAddIconGuide.a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubAddIconAction$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.pub.titlebar.action.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0969a {
        static {
            kge.a(540907336);
        }

        private C0969a() {
        }

        public /* synthetic */ C0969a(o oVar) {
            this();
        }
    }
}
