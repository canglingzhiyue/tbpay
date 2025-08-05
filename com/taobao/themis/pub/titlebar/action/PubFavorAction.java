package com.taobao.themis.pub.titlebar.action;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.utils.k;
import com.taobao.themis.utils.n;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.iao;
import tb.kge;
import tb.ood;
import tb.qpt;
import tb.qrc;
import tb.qrd;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u000234B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0016J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0002J\b\u0010&\u001a\u00020\u0019H\u0016J\u0018\u0010'\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u0019H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002J\u0012\u0010+\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u0015H\u0016J\b\u00100\u001a\u00020\u0019H\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubFavorAction;", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "Lcom/taobao/themis/container/title/action/base/IFavorAction;", "()V", "mAppId", "", "mBackGroundView", "Landroid/view/View;", "mContext", "Landroid/content/Context;", "mFavorView", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "mFavored", "", "mInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "mRootView", "mStyle", "Landroid/util/Pair;", "", "mStyleString", "Lcom/taobao/themis/kernel/container/Window$Theme;", "mUpdateFavorReceiver", "Landroid/content/BroadcastReceiver;", "addFavor", "", "attachPage", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "changeFavorStatus", "getView", "context", "initFavorView", "initNormalFavorAction", MessageID.onDestroy, "onFavored", BehavorID.CLICK, "init", "onShow", "onUnFavored", "removeFavor", "setBackViewStyle", "setFavorViewStyle", "setOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "setStyle", "style", "startCheckFavorStatus", "switchFavorStatus", "isFavored", "Companion", "UpdateFavorBroadcastReceiver", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubFavorAction extends com.taobao.themis.kernel.container.ui.titlebar.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private Context f22742a;
    private String b;
    private com.taobao.themis.kernel.f c;
    private Pair<Integer, Integer> d;
    private Window.Theme e = Window.Theme.DARK;
    private View f;
    private View g;
    private TUrlImageView h;
    private volatile boolean i;
    private BroadcastReceiver j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.taobao.themis.kernel.f b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (PubFavorAction.c(PubFavorAction.this) == null) {
            } else {
                ITMSPage d = PubFavorAction.d(PubFavorAction.this);
                if (d != null && (b = d.b()) != null) {
                    qrc.a(b, new qrd.b() { // from class: com.taobao.themis.pub.titlebar.action.PubFavorAction.c.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.qrd.b
                        public void onResult(PubUserGuideModule pubUserGuideModule) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                            } else if (pubUserGuideModule == null) {
                            } else {
                                ITMSPage d2 = PubFavorAction.d(PubFavorAction.this);
                                q.a(d2);
                                ITMSPage d3 = PubFavorAction.d(PubFavorAction.this);
                                q.a(d3);
                                ITMSPage d4 = PubFavorAction.d(PubFavorAction.this);
                                q.a(d4);
                                com.taobao.themis.pub_kit.utils.f.b("Page_MiniApp_Button-NavBar-2", ai.b(kotlin.j.a("miniapp_id", d2.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.2"), kotlin.j.a("pageId", d3.c().e().a()), kotlin.j.a("pageUrl", d4.e())));
                            }
                        }
                    });
                }
                View e = PubFavorAction.e(PubFavorAction.this);
                q.a(e);
                e.setEnabled(false);
                View e2 = PubFavorAction.e(PubFavorAction.this);
                q.a(e2);
                e2.postDelayed(new Runnable() { // from class: com.taobao.themis.pub.titlebar.action.PubFavorAction.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (PubFavorAction.e(PubFavorAction.this) == null) {
                        } else {
                            View e3 = PubFavorAction.e(PubFavorAction.this);
                            q.a(e3);
                            e3.setEnabled(true);
                        }
                    }
                }, 1000L);
                PubFavorAction.f(PubFavorAction.this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/pub/titlebar/action/PubFavorAction$attachPage$1", "Lcom/taobao/themis/pub_kit/task/PubContainerConfigTask$PubContainerConfigTaskListener;", "onResult", "", "result", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements qrd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f22750a;

        public f(ITMSPage iTMSPage) {
            this.f22750a = iTMSPage;
        }

        @Override // tb.qrd.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule == null) {
            } else {
                com.taobao.themis.pub_kit.utils.f.a("Page_MiniApp_Show-NavBar-2", ai.b(kotlin.j.a("miniapp_id", this.f22750a.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.2"), kotlin.j.a("pageId", this.f22750a.c().e().a()), kotlin.j.a("pageUrl", this.f22750a.e())));
            }
        }
    }

    static {
        kge.a(-519429500);
        kge.a(522176811);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(PubFavorAction pubFavorAction, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -78343661:
                super.a((ITMSPage) objArr[0]);
                return null;
            case 94685804:
                super.e();
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

    public static final /* synthetic */ String a(PubFavorAction pubFavorAction) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f999142d", new Object[]{pubFavorAction}) : pubFavorAction.b;
    }

    public static final /* synthetic */ void a(PubFavorAction pubFavorAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a28c61", new Object[]{pubFavorAction, new Boolean(z)});
        } else {
            pubFavorAction.i = z;
        }
    }

    public static final /* synthetic */ void a(PubFavorAction pubFavorAction, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cafb293", new Object[]{pubFavorAction, new Boolean(z), new Boolean(z2)});
        } else {
            pubFavorAction.a(z, z2);
        }
    }

    public static final /* synthetic */ void b(PubFavorAction pubFavorAction, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7255314", new Object[]{pubFavorAction, new Boolean(z), new Boolean(z2)});
        } else {
            pubFavorAction.b(z, z2);
        }
    }

    public static final /* synthetic */ boolean b(PubFavorAction pubFavorAction) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ddc0d98", new Object[]{pubFavorAction})).booleanValue() : pubFavorAction.i;
    }

    public static final /* synthetic */ com.taobao.themis.kernel.f c(PubFavorAction pubFavorAction) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.f) ipChange.ipc$dispatch("9c35b026", new Object[]{pubFavorAction}) : pubFavorAction.c;
    }

    public static final /* synthetic */ ITMSPage d(PubFavorAction pubFavorAction) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("fafa0cab", new Object[]{pubFavorAction}) : pubFavorAction.d();
    }

    public static final /* synthetic */ View e(PubFavorAction pubFavorAction) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("73d6459", new Object[]{pubFavorAction}) : pubFavorAction.g;
    }

    public static final /* synthetic */ void f(PubFavorAction pubFavorAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b34098", new Object[]{pubFavorAction});
        } else {
            pubFavorAction.i();
        }
    }

    public static final /* synthetic */ Context g(PubFavorAction pubFavorAction) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3f293151", new Object[]{pubFavorAction}) : pubFavorAction.f22742a;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        q.d(context, "context");
        this.f22742a = context;
        if (this.g == null) {
            View view = null;
            this.g = View.inflate(context, R.layout.tms_pub_title_favor_view, null);
            View view2 = this.g;
            if (view2 != null) {
                view = view2.findViewById(R.id.favorBackView);
            }
            this.f = view;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(k.a(context, 32.0f), k.a(context, 44.0f));
            layoutParams.rightMargin = k.a(context, 12.0f);
            View view3 = this.g;
            if (view3 != null) {
                view3.setLayoutParams(layoutParams);
            }
        }
        return this.g;
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
        this.c = page.b();
        com.taobao.themis.kernel.f fVar = this.c;
        q.a(fVar);
        this.b = fVar.h();
        a();
        if (this.j == null) {
            this.j = new UpdateFavorBroadcastReceiver();
            LocalBroadcastManager.getInstance(this.f22742a).registerReceiver(this.j, new IntentFilter(com.taobao.themis.pub_kit.favor.a.BROADCAST_UPDATE_FAVOR));
        }
        qrc.a(page.b(), new f(page));
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        a(this.e);
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        View view = this.g;
        if (view == null) {
            return;
        }
        q.a(view);
        this.h = (TUrlImageView) view.findViewById(R.id.attentionImage);
        TUrlImageView tUrlImageView = this.h;
        if (tUrlImageView != null) {
            tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        h();
        a(Window.Theme.DARK);
        if (this.g == null || this.c == null) {
            return;
        }
        com.taobao.themis.kernel.f fVar = this.c;
        q.a(fVar);
        if (!((IAccountAdapter) qpt.a(IAccountAdapter.class)).isLogin(fVar)) {
            return;
        }
        b();
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (TextUtils.isEmpty(this.b)) {
        } else {
            com.taobao.themis.pub_kit.favor.a.a(this.b, new e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J+\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/taobao/themis/pub/titlebar/action/PubFavorAction$startCheckFavorStatus$1", "Lcom/taobao/themis/kernel/network/CommonListener;", "", "onFailure", "", "errorCode", "", "errorMsg", InputFrame3.TYPE_RESPONSE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "onSuccess", "(Ljava/lang/Boolean;)V", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements com.taobao.themis.kernel.network.b<Boolean, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.themis.kernel.network.b
        public /* synthetic */ void onFailure(String str, String str2, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec067822", new Object[]{this, str, str2, bool});
            } else {
                a(str, str2, bool);
            }
        }

        @Override // com.taobao.themis.kernel.network.b
        public /* synthetic */ void onSuccess(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, bool});
            } else {
                a(bool);
            }
        }

        public void a(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
            } else if (q.a((Object) bool, (Object) true)) {
                PubFavorAction.a(PubFavorAction.this, false, true);
                PubFavorAction.a(PubFavorAction.this, true);
            } else {
                PubFavorAction.b(PubFavorAction.this, false, true);
                PubFavorAction.a(PubFavorAction.this, false);
            }
        }

        public void a(String str, String str2, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9fef851", new Object[]{this, str, str2, bool});
            } else {
                PubFavorAction.b(PubFavorAction.this, false, true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubFavorAction$UpdateFavorBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/taobao/themis/pub/titlebar/action/PubFavorAction;)V", iao.NEXT_TAG_RECEIVER, "", "context", "Landroid/content/Context;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public final class UpdateFavorBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-89229925);
        }

        public UpdateFavorBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean booleanExtra;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            q.d(context, "context");
            q.d(intent, "intent");
            if (!TextUtils.equals(intent.getStringExtra("appId"), PubFavorAction.a(PubFavorAction.this)) || PubFavorAction.b(PubFavorAction.this) == (booleanExtra = intent.getBooleanExtra("isFavored", PubFavorAction.b(PubFavorAction.this)))) {
                return;
            }
            if (booleanExtra) {
                PubFavorAction.a(PubFavorAction.this, true, false);
            } else {
                PubFavorAction.b(PubFavorAction.this, true, false);
            }
        }
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        View view = this.g;
        if (view == null || this.h == null) {
            return;
        }
        q.a(view);
        view.setOnClickListener(new c());
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.i) {
            k();
        } else {
            l();
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
        this.e = style;
        m();
        j();
    }

    private final void j() {
        Pair<Integer, Integer> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.f == null) {
        } else {
            if (Window.Theme.LIGHT == this.e) {
                pair = new Pair<>(Integer.valueOf(R.drawable.tms_pub_square_bg_dark), Integer.valueOf(R.drawable.tms_pub_square_bg_dark));
            } else {
                pair = new Pair<>(Integer.valueOf(R.drawable.tms_pub_square_bg_white), Integer.valueOf(R.drawable.tms_pub_square_bg_white));
            }
            this.d = pair;
            if (this.i) {
                View view = this.f;
                q.a(view);
                Pair<Integer, Integer> pair2 = this.d;
                q.a(pair2);
                Object obj = pair2.first;
                q.b(obj, "mStyle!!.first");
                view.setBackgroundResource(((Number) obj).intValue());
                return;
            }
            View view2 = this.f;
            q.a(view2);
            Pair<Integer, Integer> pair3 = this.d;
            q.a(pair3);
            Object obj2 = pair3.second;
            q.b(obj2, "mStyle!!.second");
            view2.setBackgroundResource(((Number) obj2).intValue());
        }
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("miniapp_object_type", "index");
            hashMap.put("miniapp_id", this.b);
            hashMap.put("appId", this.b);
            ((IUserTrackerAdapter) qpt.a(IUserTrackerAdapter.class)).customAdvance("2101", "Page_MiniApp", "Button-CancelCollect", null, null, hashMap);
            String str = this.b;
            com.taobao.themis.kernel.f fVar = this.c;
            q.a(fVar);
            Activity o = fVar.o();
            com.taobao.themis.kernel.f fVar2 = this.c;
            q.a(fVar2);
            com.taobao.themis.pub_kit.favor.a.b(str, n.a(o, fVar2.g()), false, new d());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J+\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/taobao/themis/pub/titlebar/action/PubFavorAction$removeFavor$1", "Lcom/taobao/themis/kernel/network/CommonListener;", "", "onFailure", "", "errorCode", "", "errorMsg", InputFrame3.TYPE_RESPONSE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "onSuccess", "(Ljava/lang/Boolean;)V", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements com.taobao.themis.kernel.network.b<Boolean, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.themis.kernel.network.b
        public /* synthetic */ void onFailure(String str, String str2, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec067822", new Object[]{this, str, str2, bool});
            } else {
                a(str, str2, bool);
            }
        }

        @Override // com.taobao.themis.kernel.network.b
        public /* synthetic */ void onSuccess(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, bool});
            } else {
                a(bool);
            }
        }

        public void a(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
            } else if (q.a((Object) bool, (Object) true)) {
                PubFavorAction.b(PubFavorAction.this, true, false);
                PubFavorAction.a(PubFavorAction.this, false);
            } else {
                PubFavorAction.a(PubFavorAction.this, true, false);
                PubFavorAction.a(PubFavorAction.this, true);
                com.taobao.themis.pub_kit.guide.c.a(PubFavorAction.g(PubFavorAction.this), PubFavorAction.e(PubFavorAction.this), com.taobao.themis.pub_kit.guide.c.c);
            }
        }

        public void a(String str, String str2, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9fef851", new Object[]{this, str, str2, bool});
            } else {
                com.taobao.themis.pub_kit.guide.c.a(PubFavorAction.g(PubFavorAction.this), PubFavorAction.e(PubFavorAction.this), com.taobao.themis.pub_kit.guide.c.c);
            }
        }
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("miniapp_object_type", "index");
            hashMap.put("miniapp_id", this.b);
            hashMap.put("appId", this.b);
            ((IUserTrackerAdapter) qpt.a(IUserTrackerAdapter.class)).customAdvance("2101", "Page_MiniApp", "Button-Collect", null, null, hashMap);
            String str = this.b;
            com.taobao.themis.kernel.f fVar = this.c;
            q.a(fVar);
            Activity o = fVar.o();
            com.taobao.themis.kernel.f fVar2 = this.c;
            q.a(fVar2);
            com.taobao.themis.pub_kit.favor.a.a(str, n.a(o, fVar2.g()), false, new b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J+\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/taobao/themis/pub/titlebar/action/PubFavorAction$addFavor$1", "Lcom/taobao/themis/kernel/network/CommonListener;", "", "onFailure", "", "errorCode", "", "errorMsg", InputFrame3.TYPE_RESPONSE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "onSuccess", "(Ljava/lang/Boolean;)V", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements com.taobao.themis.kernel.network.b<Boolean, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.themis.kernel.network.b
        public /* synthetic */ void onFailure(String str, String str2, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec067822", new Object[]{this, str, str2, bool});
            } else {
                a(str, str2, bool);
            }
        }

        @Override // com.taobao.themis.kernel.network.b
        public /* synthetic */ void onSuccess(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, bool});
            } else {
                a(bool);
            }
        }

        public void a(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
            } else if (bool != null && bool.booleanValue()) {
                PubFavorAction.a(PubFavorAction.this, true, false);
            } else {
                PubFavorAction.b(PubFavorAction.this, true, false);
                com.taobao.themis.pub_kit.guide.c.a(PubFavorAction.g(PubFavorAction.this), PubFavorAction.e(PubFavorAction.this), com.taobao.themis.pub_kit.guide.c.d);
            }
        }

        public void a(String str, String str2, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9fef851", new Object[]{this, str, str2, bool});
            } else {
                com.taobao.themis.pub_kit.guide.c.a(PubFavorAction.g(PubFavorAction.this), PubFavorAction.e(PubFavorAction.this), com.taobao.themis.pub_kit.guide.c.d);
            }
        }
    }

    private final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.h;
        if (tUrlImageView == null || tUrlImageView == null) {
            return;
        }
        tUrlImageView.setImageUrl(com.taobao.themis.pub_kit.favor.a.a(this.e.getTheme(), this.i));
    }

    private final void a(boolean z, boolean z2) {
        com.taobao.themis.kernel.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (!this.i) {
            this.i = true;
            com.taobao.themis.pub_kit.favor.a.a(this.b, (Boolean) true, this.f22742a);
            if (!z2 && (fVar = this.c) != null) {
                Context context = this.f22742a;
                View view = this.g;
                q.a(fVar);
                com.taobao.themis.pub_kit.guide.c.a(context, view, 1, com.taobao.themis.kernel.utils.k.j(fVar));
            }
        }
        m();
    }

    private final void b(boolean z, boolean z2) {
        com.taobao.themis.kernel.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff8829", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (this.i) {
            this.i = false;
            com.taobao.themis.pub_kit.favor.a.a(this.b, (Boolean) false, this.f22742a);
            if (!z2 && (fVar = this.c) != null) {
                Context context = this.f22742a;
                View view = this.g;
                q.a(fVar);
                com.taobao.themis.pub_kit.guide.c.a(context, view, 2, com.taobao.themis.kernel.utils.k.j(fVar));
            }
        }
        m();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        if (this.j != null) {
            LocalBroadcastManager.getInstance(this.f22742a).unregisterReceiver(this.j);
            this.j = null;
        }
        this.g = null;
        this.c = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubFavorAction$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1069791436);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
