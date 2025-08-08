package com.taobao.themis.inside.adapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.r;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.web.runtime.IWebAdapter;
import com.uc.webview.export.WebResourceRequest;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpt;
import tb.tmg;
import tb.tmi;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/inside/adapter/DefaultWebAdapter;", "Lcom/taobao/themis/web/runtime/IWebAdapter;", "()V", "globalUrlInterceptor", "Lcom/taobao/themis/web/external/IWebURLLoadingInterceptor;", "getGlobalUrlInterceptor", "()Lcom/taobao/themis/web/external/IWebURLLoadingInterceptor;", "dealWithJSRedirect", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "webResourceRequest", "Lcom/uc/webview/export/WebResourceRequest;", "dealWithServerRedirect", "registerPlugins", "", "shouldOverrideUrlLoading", "url", "", "GlobalUrlInterceptor", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public class DefaultWebAdapter implements IWebAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final tmi f22426a = new a();

    static {
        kge.a(99175007);
        kge.a(-1554989124);
    }

    @Override // com.taobao.themis.web.runtime.IWebAdapter
    public void registerPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3583184", new Object[]{this});
        }
    }

    public final tmi getGlobalUrlInterceptor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tmi) ipChange.ipc$dispatch("49a34980", new Object[]{this}) : this.f22426a;
    }

    public boolean shouldOverrideUrlLoading(ITMSPage page, String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6edbe04c", new Object[]{this, page, url})).booleanValue();
        }
        q.d(page, "page");
        q.d(url, "url");
        r rVar = (r) page.a(r.class);
        if (rVar != null) {
            rVar.a();
        }
        com.taobao.themis.web.runtime.a aVar = (com.taobao.themis.web.runtime.a) page.a(com.taobao.themis.web.runtime.a.class);
        tmg a2 = aVar != null ? aVar.a() : null;
        Activity context = page.b().o();
        if (a2 != null) {
            q.b(context, "context");
            if (a2.a(context, url)) {
                return true;
            }
        }
        tmi tmiVar = this.f22426a;
        q.b(context, "context");
        return tmiVar.a(context, url);
    }

    private final boolean a(ITMSPage iTMSPage, WebResourceRequest webResourceRequest) {
        Uri url;
        Activity o;
        INavigatorAdapter iNavigatorAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2deae7", new Object[]{this, iTMSPage, webResourceRequest})).booleanValue();
        }
        if (!n.a(i.GROUP_THEMIS_COMMON_CONFIG, "enableNavWhenRedirect", (Boolean) true) || iTMSPage == null || (url = webResourceRequest.getUrl()) == null || (o = iTMSPage.b().o()) == null || !webResourceRequest.isRedirect() || (iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class)) == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("disallowLoopback", "true");
        String uri = url.toString();
        q.b(uri, "uri.toString()");
        boolean openURL = iNavigatorAdapter.openURL(o, uri, null, null, hashMap);
        if (openURL) {
            iTMSPage.b().b().a(true);
        }
        return openURL;
    }

    private final boolean b(ITMSPage iTMSPage, WebResourceRequest webResourceRequest) {
        Uri url;
        f b;
        Activity o;
        INavigatorAdapter iNavigatorAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cb4fc28", new Object[]{this, iTMSPage, webResourceRequest})).booleanValue();
        }
        if (!n.bR() || webResourceRequest.isRedirect() || (url = webResourceRequest.getUrl()) == null) {
            return false;
        }
        String scheme = url.getScheme();
        if (!(!q.a((Object) scheme, (Object) "http")) || !(!q.a((Object) scheme, (Object) "https")) || iTMSPage == null || (b = iTMSPage.b()) == null || (o = b.o()) == null || (iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class)) == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("disallowLoopback", "true");
        hashMap.put("allowEscape", "true");
        String uri = url.toString();
        q.b(uri, "uri.toString()");
        return iNavigatorAdapter.openURL(o, uri, null, null, hashMap);
    }

    @Override // com.taobao.themis.web.runtime.IWebAdapter
    public boolean shouldOverrideUrlLoading(ITMSPage page, WebResourceRequest webResourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176f3d12", new Object[]{this, page, webResourceRequest})).booleanValue();
        }
        q.d(page, "page");
        q.d(webResourceRequest, "webResourceRequest");
        Uri url = webResourceRequest.getUrl();
        if (url == null) {
            return false;
        }
        String uri = url.toString();
        q.b(uri, "url.toString()");
        if (shouldOverrideUrlLoading(page, uri) || b(page, webResourceRequest)) {
            return true;
        }
        return a(page, webResourceRequest);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/taobao/themis/inside/adapter/DefaultWebAdapter$GlobalUrlInterceptor;", "Lcom/taobao/themis/web/external/IWebURLLoadingInterceptor;", "()V", "shouldOverrideUrlLoading", "", "context", "Landroid/content/Context;", "url", "", "Companion", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements tmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final C0938a Companion;

        static {
            kge.a(376743166);
            kge.a(-1656708230);
            Companion = new C0938a(null);
        }

        @Override // tb.tmi
        public boolean a(Context context, String url) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, url})).booleanValue();
            }
            q.d(context, "context");
            q.d(url, "url");
            TMSLogger.a("GlobalUrlInterceptor", "shouldOverrideUrlLoadingImpl " + url);
            if (StringUtils.isEmpty(url)) {
                return false;
            }
            try {
                if (q.a((Object) "true", (Object) Uri.parse(url).getQueryParameter("hybrid"))) {
                    return false;
                }
            } catch (Exception unused) {
            }
            if (Login.isLoginUrl(url) || Login.isLogoutUrl(url)) {
                return true;
            }
            if (!kotlin.text.n.a("http://www.taobao.com", url, true) && !kotlin.text.n.a("http://www.taobao.com/", url, true) && !kotlin.text.n.a("https://www.taobao.com", url, true) && !kotlin.text.n.a("https://www.taobao.com/", url, true) && !kotlin.text.n.a("www.taobao.com", url, true) && !kotlin.text.n.a("www.taobao.com/", url, true)) {
                return false;
            }
            if (n.bF()) {
                INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class);
                if (iNavigatorAdapter != null) {
                    INavigatorAdapter.b.a(iNavigatorAdapter, context, "http://m.taobao.com/index.htm", null, null, null, 28, null);
                }
            } else {
                Nav.from(context).toUri("http://m.taobao.com/index.htm");
            }
            return true;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/inside/adapter/DefaultWebAdapter$GlobalUrlInterceptor$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.inside.adapter.DefaultWebAdapter$a$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class C0938a {
            static {
                kge.a(1349577414);
            }

            private C0938a() {
            }

            public /* synthetic */ C0938a(o oVar) {
                this();
            }
        }
    }
}
