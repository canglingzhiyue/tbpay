package com.taobao.pha.webview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.taobao.windvane.extra.uc.WVUCClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.PHAContainerType;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.UCExtension;
import java.util.Map;
import tb.kge;
import tb.ngc;
import tb.ngf;
import tb.ngg;
import tb.ngi;
import tb.ngr;
import tb.ngu;

/* loaded from: classes7.dex */
public class c implements ngf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;

    /* renamed from: a  reason: collision with root package name */
    public PHAWVUCWebView f18850a;

    static {
        kge.a(1942697663);
        kge.a(1951257846);
        b = c.class.getSimpleName();
    }

    public c(Context context) {
        this.f18850a = new PHAWVUCWebView(context);
        n();
    }

    public c(PHAWVUCWebView pHAWVUCWebView) {
        this.f18850a = pHAWVUCWebView;
        n();
    }

    @Override // tb.ngf
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f18850a == null) {
            ngr.b(b, "webView has been destroyed");
        } else {
            ngr.b(b, "destroy webView");
            this.f18850a.setVisibility(8);
            this.f18850a.removeAllViews();
            ViewParent parent = this.f18850a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f18850a);
            }
            if (this.f18850a.isDestroied()) {
                return;
            }
            this.f18850a.destroy();
            this.f18850a = null;
        }
    }

    @Override // tb.ngf
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.loadUrl(str, map);
    }

    @Override // tb.ngf
    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // tb.ngf
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.reload();
    }

    @Override // tb.ngf
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return false;
        }
        return pHAWVUCWebView.canGoBack();
    }

    @Override // tb.ngf
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.goBack();
    }

    @Override // tb.ngf
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return null;
        }
        return pHAWVUCWebView.getUrl();
    }

    @Override // tb.ngf
    public void a(ngc ngcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f62378ce", new Object[]{this, ngcVar});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.setWebChromeClient(new b(g(), ngcVar, this));
    }

    @Override // tb.ngf
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.addJavascriptInterface(obj, str);
    }

    @Override // tb.ngf
    public View f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this}) : this.f18850a;
    }

    @Override // tb.ngf
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.evaluateJavascript(str);
    }

    @Override // tb.ngf
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        WVStandardEventCenter.postNotificationToJS(pHAWVUCWebView, str, str2);
    }

    @Override // tb.ngf
    public Context g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6d736e66", new Object[]{this});
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return null;
        }
        return pHAWVUCWebView.getContext();
    }

    @Override // tb.ngf
    public Bitmap h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("dda342cd", new Object[]{this});
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null || pHAWVUCWebView.getUCExtension() == null) {
            return null;
        }
        int width = this.f18850a.getWidth();
        int height = this.f18850a.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        Rect rect = new Rect(0, 0, width, height);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
        if (!this.f18850a.getUCExtension().getCurrentPageSnapshot(rect, rect, createBitmap, false, 1)) {
            return null;
        }
        return createBitmap;
    }

    @Override // tb.ngf
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.injectJsEarly(str);
    }

    @Override // tb.ngf
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        return (pHAWVUCWebView == null || pHAWVUCWebView.getUCExtension() == null) ? false : true;
    }

    @Override // tb.ngf
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.onPause();
    }

    @Override // tb.ngf
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.onResume();
    }

    @Override // tb.ngf
    public void a(final ngi ngiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6263308", new Object[]{this, ngiVar});
        } else if (this.f18850a == null || Build.VERSION.SDK_INT < 23) {
        } else {
            this.f18850a.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.taobao.pha.webview.c.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    ngiVar.a(view, i, i2, i3, i4);
                }
            });
            this.f18850a.setScrollListener(ngiVar);
        }
    }

    @Override // tb.ngf
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.onActivityResult(i, i2, intent);
    }

    @Override // tb.ngf
    public void a(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510fd488", new Object[]{this, configuration});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.onConfigurationChanged(configuration);
    }

    @Override // tb.ngf
    public int l() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue();
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView != null && (view = pHAWVUCWebView.getView()) != null) {
            return view.getScrollY();
        }
        return 0;
    }

    @Override // tb.ngf
    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView != null && !pHAWVUCWebView.isDestroied()) {
            return this.f18850a.getUserAgentString();
        }
        return null;
    }

    @Override // tb.ngf
    public void c(String str) {
        PHAWVUCWebView pHAWVUCWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (str == null || (pHAWVUCWebView = this.f18850a) == null) {
        } else {
            pHAWVUCWebView.setUserAgentString(str);
        }
    }

    @Override // tb.ngf
    public void a(AppController appController) {
        PageModel pageModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccef5776", new Object[]{this, appController});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        pHAWVUCWebView.setAppController(appController);
        if (ngu.b() && PHAContainerType.EMBEDDED.equals(appController.p())) {
            this.f18850a.setEnableShowErrorView(true);
        }
        ManifestModel u = appController.u();
        if (u == null || u.pages.size() != 1 || (pageModel = u.pages.get(0)) == null || !pageModel.frames.isEmpty()) {
            return;
        }
        this.f18850a.setEnableShowErrorView(true);
    }

    @Override // tb.ngf
    public void a(final ngg nggVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6254a4a", new Object[]{this, nggVar});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        UCExtension uCExtension = pHAWVUCWebView.getUCExtension();
        if (uCExtension != null) {
            uCExtension.setClient(new WVUCClient(this.f18850a) { // from class: com.taobao.pha.webview.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == 1507240588) {
                        super.onWebViewEvent((WebView) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.taobao.windvane.extra.uc.WVUCClient, com.uc.webview.export.extension.UCClient
                public void onWebViewEvent(WebView webView, int i, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("59d6aa8c", new Object[]{this, webView, new Integer(i), obj});
                        return;
                    }
                    super.onWebViewEvent(webView, i, obj);
                    ngg nggVar2 = nggVar;
                    if (nggVar2 == null) {
                        return;
                    }
                    nggVar2.a(c.this, i, obj);
                }
            });
        }
        this.f18850a.postDelayed(new Runnable() { // from class: com.taobao.pha.webview.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (c.this.f18850a == null) {
                } else {
                    c.this.f18850a.isPageEmpty(new WVUCWebView.whiteScreenCallback() { // from class: com.taobao.pha.webview.c.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.taobao.windvane.extra.uc.WVUCWebView.whiteScreenCallback
                        public void isPageEmpty(String str) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("61764185", new Object[]{this, str});
                            } else if (!TextUtils.equals("\"1\"", str) || nggVar == null) {
                            } else {
                                nggVar.a();
                            }
                        }
                    });
                }
            }
        }, 2000L);
        this.f18850a.setWebViewClient(new d(g(), nggVar, this));
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        PHAWVUCWebView pHAWVUCWebView = this.f18850a;
        if (pHAWVUCWebView == null) {
            return;
        }
        String userAgentString = pHAWVUCWebView.getSettings().getUserAgentString();
        if (userAgentString != null) {
            userAgentString = userAgentString + " PHA/";
        }
        this.f18850a.setUserAgentString(userAgentString);
    }
}
