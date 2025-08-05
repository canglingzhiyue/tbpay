package com.taobao.themis.open.permission.auth.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPageFactory;
import com.taobao.themis.kernel.utils.m;
import com.taobao.themis.open.permission.auth.model.AuthAgreementModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\"\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\tH\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/OpenAuthDialog;", "Lcom/taobao/themis/open/permission/auth/ui/AbsAuthDialog;", "activity", "Landroid/app/Activity;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "contentModel", "Lcom/taobao/themis/open/permission/auth/model/AuthContentResultModel;", "scopeNicks", "", "", "callback", "Lcom/taobao/themis/open/permission/auth/ui/AuthDialogCallback;", "(Landroid/app/Activity;Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/open/permission/auth/model/AuthContentResultModel;Ljava/util/List;Lcom/taobao/themis/open/permission/auth/ui/AuthDialogCallback;)V", "authDialog", "Landroid/app/AlertDialog;", "cancel", "", "show", "showAuthDescDialog", "context", "Landroid/content/Context;", "protocols", "Lcom/taobao/themis/open/permission/auth/model/AuthAgreementModel;", "showSettingTipsDialog", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e extends com.taobao.themis.open.permission.auth.ui.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AlertDialog f22701a;
    private final Activity b;
    private final com.taobao.themis.kernel.f c;
    private final com.taobao.themis.open.permission.auth.model.a d;
    private final List<String> e;
    private final com.taobao.themis.open.permission.auth.ui.b f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKey"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements DialogInterface.OnKeyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebView f22702a;
        public final /* synthetic */ List b;

        public a(WebView webView, List list) {
            this.f22702a = webView;
            this.b = list;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
            }
            if (i != 4) {
                return false;
            }
            WebView webView = this.f22702a;
            q.b(webView, "webView");
            if (webView.getVisibility() == 0 && (list = this.b) != null && list.size() > 1) {
                WebView webView2 = this.f22702a;
                q.b(webView2, "webView");
                webView2.setVisibility(8);
            } else if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AlertDialog f22703a;
        public final /* synthetic */ WebView b;
        public final /* synthetic */ List c;

        public b(AlertDialog alertDialog, WebView webView, List list) {
            this.f22703a = alertDialog;
            this.b = webView;
            this.c = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!this.f22703a.isShowing()) {
            } else {
                WebView webView = this.b;
                q.b(webView, "webView");
                if (webView.getVisibility() != 0 || (list = this.c) == null || list.size() <= 1) {
                    this.f22703a.dismiss();
                    return;
                }
                WebView webView2 = this.b;
                q.b(webView2, "webView");
                webView2.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f22704a;

        public c(d dVar) {
            this.f22704a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Result.a aVar = Result.Companion;
                if (this.f22704a.isShowing()) {
                    this.f22704a.dismiss();
                }
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(i.a(th));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/taobao/themis/open/permission/auth/ui/OpenAuthDialog$showSettingTipsDialog$settingTipDialog$1", "Landroid/app/Dialog;", i.b.MEASURE_ONCREATE, "", "savedInstanceState", "Landroid/os/Bundle;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ITMSPageFactory m = e.f(e.this).m();
                String a2 = m.a();
                q.b(a2, "TMSAppUtils.getAuthUrl()");
                e.f(e.this).b().a(ITMSPageFactory.a.a(m, a2, new Window(null, null, null, null, Integer.valueOf(Color.parseColor("#ffffff")), false, null, null, null, null, null, null, null, null, null, null, 65487, null), null, null, 8, null));
            }
        }

        public d(Context context, int i) {
            super(context, i);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            setContentView(R.layout.tms_auth_cancel_tip_setting);
            android.view.Window window = getWindow();
            if (window != null) {
                window.setGravity(80);
            }
            android.view.Window window2 = getWindow();
            if (window2 != null) {
                window2.setFlags(32, 32);
            }
            findViewById(R.id.layout_auth_go_setting).setOnClickListener(new a());
        }
    }

    static {
        kge.a(1156161439);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void a(e eVar, AlertDialog alertDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9f98f2", new Object[]{eVar, alertDialog});
        } else {
            eVar.f22701a = alertDialog;
        }
    }

    public static final /* synthetic */ void a(e eVar, Context context, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d1d9c0", new Object[]{eVar, context, list});
        } else {
            eVar.a(context, list);
        }
    }

    public static final /* synthetic */ com.taobao.themis.kernel.f f(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.f) ipChange.ipc$dispatch("48db6967", new Object[]{eVar}) : eVar.c;
    }

    public static final /* synthetic */ void g(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a869a3d3", new Object[]{eVar});
        } else {
            eVar.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Activity activity, com.taobao.themis.kernel.f instance, com.taobao.themis.open.permission.auth.model.a contentModel, List<String> scopeNicks, com.taobao.themis.open.permission.auth.ui.b callback) {
        super(instance, contentModel, scopeNicks, callback);
        q.d(activity, "activity");
        q.d(instance, "instance");
        q.d(contentModel, "contentModel");
        q.d(scopeNicks, "scopeNicks");
        q.d(callback, "callback");
        this.b = activity;
        this.c = instance;
        this.d = contentModel;
        this.e = scopeNicks;
        this.f = callback;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.taobao.themis.kernel.utils.a.a(new OpenAuthDialog$show$1(this));
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d dVar = new d(this.b, R.style.tms_wopc_dialog_bg_transparent);
        dVar.show();
        com.taobao.themis.kernel.utils.a.a(new c(dVar), 3000L);
    }

    private final void a(Context context, List<AuthAgreementModel> list) {
        String str;
        AuthAgreementModel authAgreementModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773151", new Object[]{this, context, list});
            return;
        }
        View inflate = View.inflate(context, R.layout.tms_auth_pop_window, null);
        TextView textView = (TextView) inflate.findViewById(R.id.open_auth_desc_cancel_btn);
        WebView webView = (WebView) inflate.findViewById(R.id.open_auth_webview);
        q.b(webView, "webView");
        webView.setWebViewClient(new WebViewClient() { // from class: com.taobao.themis.open.permission.auth.ui.OpenAuthDialog$showAuthDescDialog$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(OpenAuthDialog$showAuthDescDialog$1 openAuthDialog$showAuthDescDialog$1, String str2, Object... objArr) {
                str2.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("45e77735", new Object[]{this, view, request})).booleanValue();
                }
                q.d(view, "view");
                q.d(request, "request");
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        if (list == null || (authAgreementModel = list.get(0)) == null || (str = authAgreementModel.getLink()) == null) {
            str = "http://www.taobao.com/market/photo/topsq.php";
        }
        webView.loadUrl(str);
        AlertDialog create = new AlertDialog.Builder(context, R.style.tms_wopc_dialog).create();
        q.a(create);
        create.setOnKeyListener(new a(webView, list));
        create.setCancelable(false);
        create.show();
        android.view.Window window = create.getWindow();
        q.a(window);
        window.setContentView(inflate);
        android.view.Window window2 = create.getWindow();
        q.a(window2);
        window2.setLayout(-1, -1);
        textView.setOnClickListener(new b(create, webView, list));
    }
}
