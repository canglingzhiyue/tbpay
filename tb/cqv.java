package tb;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.e;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.util.ag;
import com.uc.webview.export.WebView;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.q;
import tb.cqt;

/* loaded from: classes3.dex */
public final class cqv extends cqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WVUCWebView f26455a;
    private boolean b;
    private JSONObject c;
    private boolean d;

    static {
        kge.a(-1399877483);
    }

    @Override // tb.cqt
    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        }
    }

    @Override // tb.cqt
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.cqt
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // tb.cqt
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.cqt
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // tb.cqt
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // tb.cqt
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    public static final /* synthetic */ WVUCWebView a(cqv cqvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("a8dfb267", new Object[]{cqvVar}) : cqvVar.f26455a;
    }

    public static final /* synthetic */ void a(cqv cqvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a83fcc4", new Object[]{cqvVar, new Boolean(z)});
        } else {
            cqvVar.d = z;
        }
    }

    public static final /* synthetic */ boolean b(cqv cqvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d276be95", new Object[]{cqvVar})).booleanValue() : cqvVar.d;
    }

    public static final /* synthetic */ JSONObject c(cqv cqvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("720fa832", new Object[]{cqvVar}) : cqvVar.c;
    }

    public cqv(cqt.a aVar) {
        super(aVar);
    }

    @Override // tb.cqt
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.f26455a;
        if (wVUCWebView != null) {
            wVUCWebView.coreDestroy();
        }
        this.f26455a = null;
    }

    @Override // tb.cqt
    public void a(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5944a8b", new Object[]{this, activity, map});
            return;
        }
        q.c(activity, "activity");
        String c = b.c("https://market.m.taobao.com/app/imagesearch-page/s-imgsearch-result/index");
        q.a((Object) c, "ConfigModel.getIrpWebUrl…-imgsearch-result/index\")");
        if (StringUtils.isEmpty(c)) {
            cqt.a i = i();
            if (i == null) {
                return;
            }
            i.a(true, -1, "页面链接为空");
            return;
        }
        Activity activity2 = activity;
        this.f26455a = new WVUCWebView(activity2);
        WVUCWebView wVUCWebView = this.f26455a;
        if (wVUCWebView == null) {
            q.a();
        }
        wVUCWebView.setWebChromeClient(new WVUCWebChromeClient(activity2));
        WVUCWebView wVUCWebView2 = this.f26455a;
        if (wVUCWebView2 == null) {
            q.a();
        }
        wVUCWebView2.setWebViewClient(new a(activity, activity2));
        String a2 = ag.a(c, map);
        q.a((Object) a2, "UrlUtil.appendQueryParameter(webUrlBase, params)");
        WVUCWebView wVUCWebView3 = this.f26455a;
        if (wVUCWebView3 == null) {
            q.a();
        }
        wVUCWebView3.loadUrl(a2);
    }

    /* loaded from: classes3.dex */
    public static final class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -623958539) {
                if (hashCode == -332805219) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                } else if (hashCode != 1373550412) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                    return null;
                }
            }
            return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, Context context) {
            super(context);
            this.b = activity;
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "super.shouldOverrideUrlLoading(view, url)", imports = {"android.taobao.windvane.extra.uc.WVUCWebViewClient"}))
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
            }
            String itemidFromUrl = IrpParamModel.getItemidFromUrl(str);
            if (!super.shouldOverrideUrlLoading(webView, str)) {
                if (e.a(str) && !StringUtils.isEmpty(itemidFromUrl)) {
                    cou.a(this.b, str, itemidFromUrl);
                } else {
                    cou.a(this.b, str);
                }
            }
            return true;
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            if (cqv.a(cqv.this) == null || cqv.b(cqv.this)) {
                return;
            }
            cqv.this.a(true);
            cqv.a(cqv.this, true);
            cqt.a i = cqv.this.i();
            if (i != null) {
                WVUCWebView a2 = cqv.a(cqv.this);
                if (a2 == null) {
                    q.a();
                }
                i.a(true, a2);
            }
            if (cqv.c(cqv.this) == null) {
                return;
            }
            WVUCWebView a3 = cqv.a(cqv.this);
            if (a3 == null) {
                q.a();
            }
            JSONObject c = cqv.c(cqv.this);
            if (c == null) {
                q.a();
            }
            a3.fireEvent("setSearchParams", c.toString());
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "super.onReceivedError(view, errorCode, description, failingUrl)", imports = {"android.taobao.windvane.extra.uc.WVUCWebViewClient"}))
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            cot.b(str, com.taobao.taolive.room.utils.ag.ARG_ERROR_CODE + i + " description=" + str);
            cqt.a i2 = cqv.this.i();
            if (i2 == null) {
                return;
            }
            i2.a(true, Integer.valueOf(i), str);
        }
    }

    @Override // tb.cqt
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            if (this.f26455a == null || !a()) {
                this.c = jSONObject;
                return;
            }
            WVUCWebView wVUCWebView = this.f26455a;
            if (wVUCWebView == null) {
                q.a();
            }
            String jSONString = jSONObject.toJSONString();
            if (jSONString == null) {
                jSONString = "";
            }
            wVUCWebView.fireEvent("setSearchParams", jSONString);
        }
    }

    @Override // tb.cqt
    public void a(String str, String str2, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        WVUCWebView wVUCWebView = this.f26455a;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.fireEvent(str2, map == null ? "" : JSON.toJSONString(map));
    }

    @Override // tb.cqt
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // tb.cqt
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
