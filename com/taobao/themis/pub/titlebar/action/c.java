package com.taobao.themis.pub.titlebar.action;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.utils.k;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ood;
import tb.qrc;
import tb.qrd;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubBackAction;", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "Lcom/taobao/themis/container/title/action/base/IBackAction;", "()V", "mBackContainer", "Landroid/widget/FrameLayout;", "mClickListener", "Landroid/view/View$OnClickListener;", "mIvBack", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "attachPage", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "hideBackButton", "", "setOnBackClickListener", "clickListener", "setStyle", "style", "Lcom/taobao/themis/kernel/container/Window$Theme;", "showBackButton", "Companion", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c extends com.taobao.themis.kernel.container.ui.titlebar.a implements com.taobao.themis.container.title.action.base.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "PubBackAction";

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f22755a;
    private View.OnClickListener b;
    private TUrlImageView c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/themis/pub/titlebar/action/PubBackAction$getView$2$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public b(Context context) {
            this.b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (c.a(c.this) != null) {
                View.OnClickListener a2 = c.a(c.this);
                if (a2 == null) {
                    return;
                }
                a2.onClick(view);
            } else {
                Context context = this.b;
                if (!(context instanceof Activity)) {
                    return;
                }
                ((Activity) context).finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.pub.titlebar.action.c$c  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class View$OnClickListenerC0970c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0970c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.taobao.themis.kernel.f b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ITMSPage b2 = c.b(c.this);
            if (b2 != null && (b = b2.b()) != null) {
                qrc.a(b, new qrd.b() { // from class: com.taobao.themis.pub.titlebar.action.c.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.qrd.b
                    public void onResult(PubUserGuideModule pubUserGuideModule) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                        } else if (pubUserGuideModule == null) {
                        } else {
                            ITMSPage b3 = c.b(c.this);
                            q.a(b3);
                            ITMSPage b4 = c.b(c.this);
                            q.a(b4);
                            ITMSPage b5 = c.b(c.this);
                            q.a(b5);
                            com.taobao.themis.pub_kit.utils.f.b("Page_MiniApp_Button-NavBar-1", ai.b(kotlin.j.a("miniapp_id", b3.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.1"), kotlin.j.a("pageId", b4.c().e().a()), kotlin.j.a("pageUrl", b5.e())));
                        }
                    }
                });
            }
            View.OnClickListener a2 = c.a(c.this);
            if (a2 == null) {
                return;
            }
            a2.onClick(view);
        }
    }

    static {
        kge.a(1251112845);
        kge.a(-1486233594);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == -78343661) {
            super.a((ITMSPage) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ View.OnClickListener a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("b6581e8c", new Object[]{cVar}) : cVar.b;
    }

    public static final /* synthetic */ ITMSPage b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("7fa860bf", new Object[]{cVar}) : cVar.d();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        q.d(context, "context");
        if (this.f22755a == null) {
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(k.a(context, 32.0f), k.a(context, 32.0f));
            layoutParams.gravity = 17;
            layoutParams.leftMargin = k.a(context, 5.0f);
            t tVar = t.INSTANCE;
            tUrlImageView.setLayoutParams(layoutParams);
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            t tVar2 = t.INSTANCE;
            this.c = tUrlImageView;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(k.a(context, 44.0f), k.a(context, 44.0f)));
            frameLayout.setContentDescription("返回");
            frameLayout.addView(this.c);
            frameLayout.setOnClickListener(new b(context));
            t tVar3 = t.INSTANCE;
            this.f22755a = frameLayout;
            FrameLayout frameLayout2 = this.f22755a;
            if (frameLayout2 != null) {
                frameLayout2.setTag(TAG);
            }
        }
        return this.f22755a;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(Window.Theme style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209b885a", new Object[]{this, style});
            return;
        }
        q.d(style, "style");
        TUrlImageView tUrlImageView = this.c;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setImageUrl(Window.Theme.LIGHT == style ? "https://gw.alicdn.com/imgextra/i2/O1CN01P6gSa71i3YOxUkLZs_!!6000000004357-2-tps-90-90.png" : "https://gw.alicdn.com/imgextra/i2/O1CN01xOOyIU22I1E953tud_!!6000000007096-2-tps-90-90.png");
    }

    public void a(View.OnClickListener clickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, clickListener});
            return;
        }
        q.d(clickListener, "clickListener");
        this.b = clickListener;
        FrameLayout frameLayout = this.f22755a;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setOnClickListener(new View$OnClickListenerC0970c());
    }

    @Override // com.taobao.themis.container.title.action.base.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        FrameLayout frameLayout = this.f22755a;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(final ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        super.a(page);
        qrc.a(page.b(), new qrd.b() { // from class: com.taobao.themis.pub.titlebar.action.PubBackAction$attachPage$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qrd.b
            public void onResult(PubUserGuideModule pubUserGuideModule) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                } else if (pubUserGuideModule == null) {
                } else {
                    com.taobao.themis.pub_kit.utils.f.a("Page_MiniApp_Show-NavBar-1", ai.b(kotlin.j.a("miniapp_id", ITMSPage.this.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.1"), kotlin.j.a("pageId", ITMSPage.this.c().e().a()), kotlin.j.a("pageUrl", ITMSPage.this.e())));
                }
            }
        });
    }

    @Override // com.taobao.themis.container.title.action.base.b
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        FrameLayout frameLayout = this.f22755a;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubBackAction$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1968171371);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
