package android.taobao.windvane.prerender;

import android.app.Application;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.util.DisplayMetrics;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.hvw;
import tb.kge;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\bH\u0016¨\u0006\n"}, d2 = {"Landroid/taobao/windvane/prerender/ClientPrerenderFactory;", "Landroid/taobao/windvane/prerender/IPrerenderFactory;", "()V", "createPrerenderItem", "", "params", "Landroid/taobao/windvane/export/prerender/PrerenderRequestParams;", "callback", "Lkotlin/Function1;", "Landroid/taobao/windvane/prerender/PrerenderItem;", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"android/taobao/windvane/prerender/ClientPrerenderFactory$createPrerenderItem$1$1", "Landroid/taobao/windvane/export/prerender/IPrerenderSuccessListener;", "onSuccess", "", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: android.taobao.windvane.prerender.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0021a implements android.taobao.windvane.export.prerender.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f1688a;

        public C0021a(e eVar) {
            this.f1688a = eVar;
        }

        @Override // android.taobao.windvane.export.prerender.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f1688a.a(true);
            com.taobao.android.riverlogger.e.a(RVLLevel.Info, "Themis/Performance/Prerender", "preRendering webview is ready");
        }
    }

    static {
        kge.a(-484478090);
        kge.a(-926853536);
    }

    public void a(android.taobao.windvane.export.prerender.e params, rul<? super e, t> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f64b26", new Object[]{this, params, callback});
            return;
        }
        q.d(params, "params");
        q.d(callback, "callback");
        if ((params.a().length() == 0) || params.b() != 1) {
            callback.mo2421invoke(null);
            return;
        }
        WVCore wVCore = WVCore.getInstance();
        q.b(wVCore, "WVCore.getInstance()");
        if (!wVCore.isUCSupport()) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, "Themis/Performance/Prerender", "preRendering webview is not support");
            callback.mo2421invoke(null);
            return;
        }
        Application application = android.taobao.windvane.config.a.f;
        if (application == null) {
            callback.mo2421invoke(null);
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, "Themis/Performance/Prerender", "context is null");
            return;
        }
        WVUCWebView wVUCWebView = new WVUCWebView(new MutableContextWrapper(application));
        e eVar = new e(wVUCWebView, params, false);
        hvw webViewContext = wVUCWebView.getWebViewContext();
        webViewContext.setIsClientPrerender(true);
        webViewContext.addPrerenderSuccessEventListener(new C0021a(eVar));
        callback.mo2421invoke(eVar);
        Resources resources = application.getResources();
        q.b(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        q.b(displayMetrics, "context.resources.displayMetrics");
        View view = wVUCWebView.getView();
        q.b(view, "webview.view");
        view.setTop(0);
        view.setBottom(displayMetrics.heightPixels);
        view.setLeft(0);
        view.setRight(displayMetrics.widthPixels);
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        wVUCWebView.injectJsEarly("javascript:window.__tms_prerender__=true;");
        wVUCWebView.loadUrl(params.a());
    }
}
