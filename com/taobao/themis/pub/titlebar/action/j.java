package com.taobao.themis.pub.titlebar.action;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONArray;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.IDeviceInfoAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.d;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.guide.model.PubCloseButtonModel;
import com.taobao.themis.pub_kit.guide.model.PubNavBarModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.utils.k;
import com.taobao.uikit.actionbar.TBActionView;
import com.uc.webview.export.media.MessageID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ood;
import tb.qpt;
import tb.qqb;
import tb.qrc;
import tb.qrd;
import tb.tle;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u0006\u0010 \u001a\u00020!H\u0016J\u0006\u0010\"\u001a\u00020\u0018J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010'\u001a\u00020\u0018H\u0014J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016J\u0006\u0010+\u001a\u00020\u0018R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubMoreCloseAction;", "Lcom/taobao/themis/pub/titlebar/action/PubBaseMoreAction;", "Lcom/taobao/themis/container/title/action/base/IBackHomeAction;", "mUserGuideModule", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "(Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;)V", "mCloseButtonGuide", "Lcom/taobao/themis/pub_kit/guide/PubCloseButtonGuide;", "mCloseButtonTipsModel", "Lcom/taobao/themis/pub_kit/guide/model/PubCloseButtonModel;", "mHasJumpToTBHomeWithAnim", "", "mPubBackHomeButton", "Landroid/widget/ImageView;", "mPubMoreCloseBg", "mPubMoreCloseContainer", "Landroid/widget/RelativeLayout;", "mPubVerticalBarView", "Landroid/view/View;", "mShowCloseButtonTips", "Ljava/lang/Runnable;", "mUserEnterTime", "", "addItem", "", "item", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu$TMSMenuItem;", "attachPage", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "backHome", "getView", "context", "Landroid/content/Context;", "hideCloseButtonTips", MessageID.onDestroy, "onHide", "onShow", "removeItem", "setCustomIconColor", "setStyle", "style", "Lcom/taobao/themis/kernel/container/Window$Theme;", "showCloseButtonTips", "Companion", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class j extends com.taobao.themis.pub.titlebar.action.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "PubMoreCloseAction";

    /* renamed from: a  reason: collision with root package name */
    private RelativeLayout f22771a;
    private ImageView b;
    private View c;
    private ImageView d;
    private final long e = System.currentTimeMillis();
    private final PubCloseButtonModel f;
    private volatile boolean g;
    private com.taobao.themis.pub_kit.guide.b h;
    private final Runnable i;
    private final PubUserGuideModule j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, android.graphics.Bitmap] */
        @Override // java.lang.Runnable
        public final void run() {
            Executor executor;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (Bitmap) 0;
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.IO)) != null) {
                executor.execute(new Runnable() { // from class: com.taobao.themis.pub.titlebar.action.j.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            Ref.ObjectRef objectRef2 = objectRef;
                            ITMSPage a2 = j.a(j.this);
                            objectRef2.element = a2 != null ? a2.m() : 0;
                        } catch (Throwable th) {
                            try {
                                TMSLogger.b(j.TAG, th.getMessage(), th);
                            } finally {
                                countDownLatch.countDown();
                            }
                        }
                    }
                });
            }
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                TMSLogger.d(j.TAG, "get current page snapshot timeout");
            }
            if (((Bitmap) objectRef.element) != null) {
                j.a(j.this, true);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("backHome with bitmap: ");
            if (((Bitmap) objectRef.element) != null) {
                z = true;
            }
            sb.append(z);
            TMSLogger.a(j.TAG, sb.toString());
            int x = n.x();
            Context b = j.this.b();
            q.a(b);
            ITMSPage a2 = j.a(j.this);
            q.a(a2);
            String h = a2.b().h();
            q.b(h, "mPage!!.getInstance().appId");
            com.taobao.themis.pub_kit.utils.h.a(b, h, (Bitmap) objectRef.element, Integer.valueOf(x));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch", "com/taobao/themis/pub/titlebar/action/PubMoreCloseAction$getView$2$2"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public c(Context context) {
            this.b = context;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent event) {
            com.taobao.themis.kernel.f b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, event})).booleanValue();
            }
            q.b(event, "event");
            int action = event.getAction();
            if (action != 0) {
                if (action == 1) {
                    return view.performClick();
                }
                return false;
            }
            ITMSPage a2 = j.a(j.this);
            if (a2 != null && (b = a2.b()) != null) {
                qrc.a(b, new qrd.b() { // from class: com.taobao.themis.pub.titlebar.action.j.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.qrd.b
                    public void onResult(PubUserGuideModule pubUserGuideModule) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                        } else if (pubUserGuideModule == null) {
                        } else {
                            ITMSPage a3 = j.a(j.this);
                            q.a(a3);
                            ITMSPage a4 = j.a(j.this);
                            q.a(a4);
                            ITMSPage a5 = j.a(j.this);
                            q.a(a5);
                            com.taobao.themis.pub_kit.utils.f.b("Page_MiniApp_Button-NavBar-3", ai.b(kotlin.j.a("miniapp_id", a3.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.3"), kotlin.j.a("pageId", a4.c().e().a()), kotlin.j.a("pageUrl", a5.e())));
                        }
                    }
                });
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
            if (r5.a(r7, r3) != true) goto L35;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.pub.titlebar.action.j.d.run():void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/pub/titlebar/action/PubMoreCloseAction$attachPage$1", "Lcom/taobao/themis/pub_kit/task/PubContainerConfigTask$PubContainerConfigTaskListener;", "onResult", "", "result", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements qrd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f22777a;

        public e(ITMSPage iTMSPage) {
            this.f22777a = iTMSPage;
        }

        @Override // tb.qrd.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule == null) {
            } else {
                com.taobao.themis.pub_kit.utils.f.a("Page_MiniApp_Show-NavBar-4", ai.b(kotlin.j.a("miniapp_id", this.f22777a.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.4"), kotlin.j.a("pageId", this.f22777a.c().e().a()), kotlin.j.a("pageUrl", this.f22777a.e())));
                com.taobao.themis.pub_kit.utils.f.a("Page_MiniApp_Show-NavBar-3", ai.b(kotlin.j.a("miniapp_id", this.f22777a.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.3"), kotlin.j.a("pageId", this.f22777a.c().e().a()), kotlin.j.a("pageUrl", this.f22777a.e())));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/pub/titlebar/action/PubMoreCloseAction$backHome$1", "Lcom/taobao/themis/pub_kit/task/PubContainerConfigTask$PubContainerConfigTaskListener;", "onResult", "", "result", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements qrd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.qrd.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule == null) {
            } else {
                ITMSPage a2 = j.a(j.this);
                q.a(a2);
                ITMSPage a3 = j.a(j.this);
                q.a(a3);
                ITMSPage a4 = j.a(j.this);
                q.a(a4);
                com.taobao.themis.pub_kit.utils.f.b("Page_MiniApp_Button-NavBar-4", ai.b(kotlin.j.a("miniapp_id", a2.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.4"), kotlin.j.a("pageId", a3.c().e().a()), kotlin.j.a("pageUrl", a4.e())));
            }
        }
    }

    static {
        kge.a(365055017);
        kge.a(-949946939);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
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

    public j(PubUserGuideModule pubUserGuideModule) {
        this.j = pubUserGuideModule;
        PubUserGuideModule pubUserGuideModule2 = this.j;
        this.f = pubUserGuideModule2 != null ? pubUserGuideModule2.getCloseButtonTip() : null;
        this.i = new d();
    }

    public static final /* synthetic */ ITMSPage a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("c85fa85", new Object[]{jVar}) : jVar.d();
    }

    public static final /* synthetic */ void a(j jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b83bafd8", new Object[]{jVar, new Boolean(z)});
        } else {
            jVar.g = z;
        }
    }

    public static final /* synthetic */ ImageView c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("dc171716", new Object[]{jVar}) : jVar.d;
    }

    public static final /* synthetic */ com.taobao.themis.pub_kit.guide.b d(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.pub_kit.guide.b) ipChange.ipc$dispatch("3a72bbcc", new Object[]{jVar}) : jVar.h;
    }

    @Override // com.taobao.themis.pub.titlebar.action.d, com.taobao.themis.kernel.container.ui.titlebar.IMenuAction
    public void a(d.a item) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7959c39", new Object[]{this, item});
            return;
        }
        q.d(item, "item");
        com.taobao.themis.kernel.container.ui.titlebar.d n = n();
        if (n == null) {
            return;
        }
        n.a(p.a(item));
    }

    @Override // com.taobao.themis.pub.titlebar.action.d
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (Window.Theme.LIGHT == i()) {
            TBActionView h = h();
            if (h == null) {
                return;
            }
            h.setIconColor(-1);
        } else {
            TBActionView h2 = h();
            if (h2 == null) {
                return;
            }
            h2.setIconColor(-16777216);
        }
    }

    @Override // com.taobao.themis.pub.titlebar.action.d, com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        super.a(page);
        j();
        qrc.a(page.b(), new e(page));
        l();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public View a(Context context) {
        TBActionView tBActionView;
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        q.d(context, "context");
        b(context);
        RelativeLayout relativeLayout = this.f22771a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        View view = null;
        View inflate = View.inflate(context, R.layout.tms_pub_more_close_view, null);
        if (inflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) inflate;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(k.a(context, 65.0f), k.a(context, 44.0f));
        layoutParams.rightMargin = k.a(context, 12.0f);
        t tVar = t.INSTANCE;
        relativeLayout2.setLayoutParams(layoutParams);
        t tVar2 = t.INSTANCE;
        this.f22771a = relativeLayout2;
        RelativeLayout relativeLayout3 = this.f22771a;
        this.b = relativeLayout3 != null ? (ImageView) relativeLayout3.findViewById(R.id.pub_more_close_bg) : null;
        RelativeLayout relativeLayout4 = this.f22771a;
        if (relativeLayout4 == null || (tBActionView = (TBActionView) relativeLayout4.findViewById(R.id.more_btn)) == null) {
            tBActionView = null;
        } else {
            View iconView = tBActionView.getIconView();
            q.b(iconView, "iconView");
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(k.a(context, 24.0f), k.a(context, 24.0f));
            layoutParams2.gravity = 8388627;
            layoutParams2.setMarginStart(k.a(context, 9.0f));
            t tVar3 = t.INSTANCE;
            iconView.setLayoutParams(layoutParams2);
            tBActionView.setOnTouchListener(new c(context));
            t tVar4 = t.INSTANCE;
        }
        a(tBActionView);
        RelativeLayout relativeLayout5 = this.f22771a;
        if (relativeLayout5 == null || (imageView = (ImageView) relativeLayout5.findViewById(R.id.back_home_btn)) == null) {
            imageView = null;
        } else {
            com.taobao.themis.utils.p.a(imageView, 0L, new PubMoreCloseAction$getView$$inlined$apply$lambda$2(this), 1, null);
            t tVar5 = t.INSTANCE;
        }
        this.d = imageView;
        RelativeLayout relativeLayout6 = this.f22771a;
        if (relativeLayout6 != null) {
            view = relativeLayout6.findViewById(R.id.vertical_bar_view);
        }
        this.c = view;
        PubUserGuideModule pubUserGuideModule = this.j;
        if (pubUserGuideModule != null) {
            this.h = new com.taobao.themis.pub_kit.guide.b(context, pubUserGuideModule);
        }
        RelativeLayout relativeLayout7 = this.f22771a;
        if (relativeLayout7 != null) {
            relativeLayout7.setTag(TAG);
        }
        return this.f22771a;
    }

    @Override // com.taobao.themis.pub.titlebar.action.d, com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(Window.Theme style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209b885a", new Object[]{this, style});
            return;
        }
        q.d(style, "style");
        super.a(style);
        if (Window.Theme.LIGHT == i()) {
            View view = this.c;
            if (view != null) {
                view.setAlpha(0.2f);
            }
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setBackgroundResource(R.drawable.tms_pub_rectangle_bg_dark);
            }
            ImageView imageView2 = this.d;
            if (imageView2 == null) {
                return;
            }
            imageView2.setImageResource(R.drawable.tms_pub_back_home_light);
            return;
        }
        View view2 = this.c;
        if (view2 != null) {
            view2.setAlpha(0.08f);
        }
        ImageView imageView3 = this.b;
        if (imageView3 != null) {
            imageView3.setBackgroundResource(R.drawable.tms_pub_rectangle_bg_white);
        }
        ImageView imageView4 = this.d;
        if (imageView4 == null) {
            return;
        }
        imageView4.setImageResource(R.drawable.tms_pub_back_home_dark);
    }

    @Override // com.taobao.themis.pub.titlebar.action.d, com.taobao.themis.kernel.container.ui.titlebar.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        if ((b() instanceof Activity) && this.g) {
            Context b2 = b();
            if (b2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            ((Activity) b2).overridePendingTransition(0, 0);
        }
        com.taobao.themis.kernel.utils.a.a(new PubMoreCloseAction$onHide$1(this), 0L, 2, null);
        com.taobao.themis.pub_kit.guide.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        com.taobao.themis.kernel.utils.a.b(this.i);
    }

    @Override // com.taobao.themis.pub.titlebar.action.d, com.taobao.themis.kernel.container.ui.titlebar.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        l();
    }

    public void k() {
        Executor executor;
        com.taobao.themis.kernel.f b2;
        PubContainerContext pubContainerContext;
        com.taobao.themis.kernel.f b3;
        com.taobao.themis.kernel.f b4;
        com.taobao.themis.kernel.f b5;
        qqb b6;
        PubNavBarModel navbar;
        com.taobao.themis.kernel.f b7;
        qqb b8;
        com.taobao.themis.kernel.f b9;
        com.taobao.themis.kernel.f b10;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (b() == null || d() == null) {
        } else {
            ITMSPage d2 = d();
            if (d2 != null && (b10 = d2.b()) != null) {
                qrc.a(b10, new f());
            }
            ITMSPage d3 = d();
            JSONArray jSONArray = null;
            if (n.c((d3 == null || (b9 = d3.b()) == null) ? null : b9.h())) {
                TMSLogger.d(TAG, "disableBackHome");
                ITMSPage d4 = d();
                if (d4 == null || (b7 = d4.b()) == null || (b8 = b7.b()) == null) {
                    return;
                }
                b8.b();
                return;
            }
            PubUserGuideModule pubUserGuideModule = this.j;
            if (q.a((Object) ((pubUserGuideModule == null || (navbar = pubUserGuideModule.getNavbar()) == null) ? null : navbar.getCloseButtonEvent()), (Object) "toUpperPage")) {
                TMSLogger.a(TAG, "toUpperPage");
                ITMSPage d5 = d();
                if (d5 == null || (b5 = d5.b()) == null || (b6 = b5.b()) == null) {
                    return;
                }
                b6.b();
                return;
            }
            Context b11 = b();
            q.a(b11);
            if (l.b(b11)) {
                TMSLogger.d(TAG, "当前设备为平板，不展示收缩动效");
                Context b12 = b();
                q.a(b12);
                ITMSPage d6 = d();
                q.a(d6);
                String h = d6.b().h();
                q.b(h, "mPage!!.getInstance().appId");
                com.taobao.themis.pub_kit.utils.h.a(b12, h, null, null, 8, null);
            } else if (Build.VERSION.SDK_INT >= 19 && l.d(b())) {
                Context b13 = b();
                q.a(b13);
                ITMSPage d7 = d();
                q.a(d7);
                String h2 = d7.b().h();
                q.b(h2, "mPage!!.getInstance().appId");
                com.taobao.themis.pub_kit.utils.h.a(b13, h2, null, null, 8, null);
                TMSLogger.d(TAG, "当前设备为折叠屏，不展示收缩动效");
            } else {
                ITMSPage d8 = d();
                if (((d8 == null || (b4 = d8.b()) == null) ? null : (tle) b4.b(tle.class)) != null) {
                    TMSLogger.d(TAG, "外链场景，不展示动画");
                    Context b14 = b();
                    q.a(b14);
                    ITMSPage d9 = d();
                    q.a(d9);
                    String h3 = d9.b().h();
                    q.b(h3, "mPage!!.getInstance().appId");
                    com.taobao.themis.pub_kit.utils.h.a(b14, h3, null, null, 8, null);
                    return;
                }
                ITMSPage d10 = d();
                if (d10 != null && (b3 = d10.b()) != null) {
                    jSONArray = qrc.a(b3);
                }
                if (!com.taobao.themis.pub_kit.utils.h.a(jSONArray) && !com.taobao.themis.pub_kit.utils.h.b(jSONArray)) {
                    TMSLogger.d(TAG, "首屏无可收缩位置，不展示动画");
                    Context b15 = b();
                    q.a(b15);
                    ITMSPage d11 = d();
                    q.a(d11);
                    String h4 = d11.b().h();
                    q.b(h4, "mPage!!.getInstance().appId");
                    com.taobao.themis.pub_kit.utils.h.a(b15, h4, null, null, 8, null);
                    return;
                }
                ITMSPage d12 = d();
                if (d12 != null && (b2 = d12.b()) != null && (pubContainerContext = (PubContainerContext) b2.a(PubContainerContext.class)) != null && pubContainerContext.getHasAddToIcon()) {
                    TMSLogger.d(TAG, "当前轻应用已添加至icon区，不展示返回动画");
                    Context b16 = b();
                    q.a(b16);
                    ITMSPage d13 = d();
                    q.a(d13);
                    String h5 = d13.b().h();
                    q.b(h5, "mPage!!.getInstance().appId");
                    com.taobao.themis.pub_kit.utils.h.a(b16, h5, null, null, 8, null);
                } else if (!n.u()) {
                    TMSLogger.d(TAG, "orange开关管控");
                    Context b17 = b();
                    q.a(b17);
                    ITMSPage d14 = d();
                    q.a(d14);
                    String h6 = d14.b().h();
                    q.b(h6, "mPage!!.getInstance().appId");
                    com.taobao.themis.pub_kit.utils.h.a(b17, h6, null, null, 8, null);
                } else {
                    int deviceScore = ((IDeviceInfoAdapter) qpt.a(IDeviceInfoAdapter.class)).getDeviceScore();
                    if (deviceScore < n.y()) {
                        Context b18 = b();
                        q.a(b18);
                        ITMSPage d15 = d();
                        q.a(d15);
                        String h7 = d15.b().h();
                        q.b(h7, "mPage!!.getInstance().appId");
                        com.taobao.themis.pub_kit.utils.h.a(b18, h7, null, null, 8, null);
                        TMSLogger.d(TAG, "机型分数不满足条件, score: " + deviceScore);
                        return;
                    }
                    IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
                    if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.IO)) == null) {
                        return;
                    }
                    executor.execute(new b());
                }
            }
        }
    }

    public final void l() {
        String stayTime;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (d() == null) {
        } else {
            PubCloseButtonModel pubCloseButtonModel = this.f;
            int parseInt = (pubCloseButtonModel == null || (stayTime = pubCloseButtonModel.getStayTime()) == null) ? 2 : Integer.parseInt(stayTime);
            long currentTimeMillis = System.currentTimeMillis() - this.e;
            long j = parseInt * 1000;
            if (currentTimeMillis > j) {
                com.taobao.themis.kernel.utils.a.a(this.i, 300L);
            } else {
                com.taobao.themis.kernel.utils.a.a(this.i, j - currentTimeMillis);
            }
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        com.taobao.themis.pub_kit.guide.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubMoreCloseAction$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-2038179791);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
