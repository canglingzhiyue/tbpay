package android.taobao.windvane.prerender;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.uc.webview.export.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "html", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class SnapShotPrerenderFactory$createPrerenderItem$1 extends Lambda implements rul<String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ rul $callback;
    public final /* synthetic */ android.taobao.windvane.export.prerender.e $params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapShotPrerenderFactory$createPrerenderItem$1(rul rulVar, android.taobao.windvane.export.prerender.e eVar) {
        super(1);
        this.$callback = rulVar;
        this.$params = eVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: android.taobao.windvane.prerender.SnapShotPrerenderFactory$createPrerenderItem$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String $html;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"android/taobao/windvane/prerender/SnapShotPrerenderFactory$createPrerenderItem$1$1$webviewClient$1", "Landroid/taobao/windvane/extra/uc/WVUCWebViewClient;", "onPageFinished", "", "view", "Lcom/uc/webview/export/WebView;", "url", "", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
        /* renamed from: android.taobao.windvane.prerender.SnapShotPrerenderFactory$createPrerenderItem$1$1$a */
        /* loaded from: classes2.dex */
        public static final class a extends WVUCWebViewClient {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ e b;
            public final /* synthetic */ Application c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Application application, Context context) {
                super(context);
                this.b = eVar;
                this.c = application;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == -332805219) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                    return;
                }
                super.onPageFinished(webView, str);
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "Themis/Performance/Prerender", "preRendered webview is ready, url: " + SnapShotPrerenderFactory$createPrerenderItem$1.this.$params.a());
                this.b.a(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$html = str;
        }

        @Override // tb.ruk
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ t mo2427invoke() {
            mo2427invoke();
            return t.INSTANCE;
        }

        @Override // tb.ruk
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void mo2427invoke() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            Application application = android.taobao.windvane.config.a.f;
            if (application == null) {
                SnapShotPrerenderFactory$createPrerenderItem$1.this.$callback.mo2421invoke(null);
                com.taobao.android.riverlogger.e.a(RVLLevel.Error, "Themis/Performance/Prerender", "context is null");
                return;
            }
            Application application2 = application;
            WVUCWebView wVUCWebView = new WVUCWebView(new MutableContextWrapper(application2));
            e eVar = new e(wVUCWebView, SnapShotPrerenderFactory$createPrerenderItem$1.this.$params, false);
            wVUCWebView.setWebViewClient(new a(eVar, application, application2));
            wVUCWebView.loadDataWithBaseURL(SnapShotPrerenderFactory$createPrerenderItem$1.this.$params.a(), this.$html, "text/html", "UTF-8", null);
            SnapShotPrerenderFactory$createPrerenderItem$1.this.$callback.mo2421invoke(eVar);
        }
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(String str) {
        invoke2(str);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, str});
            return;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            this.$callback.mo2421invoke(null);
            RVLLevel rVLLevel = RVLLevel.Error;
            com.taobao.android.riverlogger.e.a(rVLLevel, "Themis/Performance/Prerender", "readValidSnapshotAsync complete, htmlEmpty: " + TextUtils.isEmpty(str2) + ", url: " + this.$params.a());
            return;
        }
        com.taobao.themis.kernel.utils.a.a(new AnonymousClass1(str));
    }
}
