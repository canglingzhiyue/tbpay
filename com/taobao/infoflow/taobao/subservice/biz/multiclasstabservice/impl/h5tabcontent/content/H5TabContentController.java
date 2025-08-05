package com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.h5tabcontent.content;

import android.content.Context;
import android.net.http.SslError;
import android.os.SystemClock;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import android.taobao.windvane.webview.WVWebView;
import android.taobao.windvane.webview.WVWebViewClient;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import mtopsdk.mtop.util.ErrorConstant;
import tb.kge;
import tb.ldf;
import tb.llj;

/* loaded from: classes7.dex */
public class H5TabContentController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f17473a;
    private WVWebView b;
    private TUrlImageView c;
    private TBErrorView d;
    private boolean e = false;
    private Boolean f;
    private llj g;
    private Context h;

    static {
        kge.a(-1798787091);
    }

    public static /* synthetic */ Boolean a(H5TabContentController h5TabContentController, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("78cd8bbe", new Object[]{h5TabContentController, bool});
        }
        h5TabContentController.f = bool;
        return bool;
    }

    public static /* synthetic */ llj a(H5TabContentController h5TabContentController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llj) ipChange.ipc$dispatch("64afa810", new Object[]{h5TabContentController}) : h5TabContentController.g;
    }

    public static /* synthetic */ void a(H5TabContentController h5TabContentController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5163c108", new Object[]{h5TabContentController, new Boolean(z)});
        } else {
            h5TabContentController.a(z);
        }
    }

    public static /* synthetic */ void b(H5TabContentController h5TabContentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cbf61eb", new Object[]{h5TabContentController});
        } else {
            h5TabContentController.c();
        }
    }

    public static /* synthetic */ boolean b(H5TabContentController h5TabContentController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b2d8e4d", new Object[]{h5TabContentController, new Boolean(z)})).booleanValue();
        }
        h5TabContentController.e = z;
        return z;
    }

    public H5TabContentController(Context context) {
        this.h = context;
    }

    public ViewGroup a(llj lljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2bd86aa7", new Object[]{this, lljVar});
        }
        this.g = lljVar;
        d();
        if (this.f17473a == null) {
            this.f17473a = (ViewGroup) LayoutInflater.from(this.h).inflate(R.layout.newuser_h5_container, (ViewGroup) null);
            this.c = (TUrlImageView) this.f17473a.findViewById(R.id.h5_tab_loading);
            this.d = a(this.f17473a);
            this.b = b(this.f17473a);
        }
        if (lljVar.b() != null) {
            this.c.setImageUrl(lljVar.b().b());
            this.c.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        a(true);
        a(this.b, lljVar);
        return this.f17473a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f17473a;
        if (viewGroup == null || !(viewGroup.getParent() instanceof FrameLayout)) {
            return;
        }
        ((FrameLayout) this.f17473a.getParent()).removeView(this.f17473a);
        q.b("TBH5ContainerBridge");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        WVWebView wVWebView = this.b;
        if (wVWebView != null) {
            wVWebView.destroy();
            this.b = null;
        }
        if (this.f17473a != null) {
            this.f17473a = null;
        }
        if (this.c != null) {
            this.c = null;
        }
        this.f = null;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.d.setVisibility(4);
        this.c.setVisibility(4);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        q.a("TBH5ContainerBridge", (Class<? extends e>) TbH5ContainerBridge.class);
        ldf.d("H5TabContentController", "registerPlugin use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    private TBErrorView a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("d66889c0", new Object[]{this, viewGroup});
        }
        TBErrorView tBErrorView = (TBErrorView) viewGroup.findViewById(R.id.h5_tab_error);
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        tBErrorView.setStatus(TBErrorView.Status.STATUS_ERROR);
        tBErrorView.setTitle(ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG);
        tBErrorView.setSubTitle("别紧张，试试看刷新页面~");
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "刷新", new View.OnClickListener() { // from class: com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.h5tabcontent.content.H5TabContentController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                H5TabContentController.a(H5TabContentController.this, true);
                H5TabContentController h5TabContentController = H5TabContentController.this;
                h5TabContentController.a(H5TabContentController.a(h5TabContentController));
            }
        });
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
        return tBErrorView;
    }

    private WVWebView b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVWebView) ipChange.ipc$dispatch("4e0bc179", new Object[]{this, viewGroup});
        }
        WVWebView wVWebView = (WVWebView) viewGroup.findViewById(R.id.h5_tab_webview);
        wVWebView.setTag(R.id.tag_h5_container, this);
        wVWebView.setWebViewClient(a(this.h));
        return wVWebView;
    }

    private void a(WVWebView wVWebView, llj lljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b31eeff", new Object[]{this, wVWebView, lljVar});
        } else if (this.f == null || this.e) {
            wVWebView.loadUrl(lljVar.a());
        } else {
            this.f = false;
            wVWebView.fireEvent(lljVar.c().a(), lljVar.c().b().toString());
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.c.setVisibility(0);
            this.d.setVisibility(4);
        } else {
            this.c.setVisibility(4);
            this.d.setVisibility(0);
        }
    }

    private WVWebViewClient a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVWebViewClient) ipChange.ipc$dispatch("9f3247a6", new Object[]{this, context}) : new WVWebViewClient(context) { // from class: com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.h5tabcontent.content.H5TabContentController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -496040708) {
                    super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                    return null;
                } else if (hashCode == 1835642644) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                } else if (hashCode != 1990761671) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onLoadResource((WebView) objArr[0], (String) objArr[1]);
                    return null;
                }
            }

            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("76a89cc7", new Object[]{this, webView, str});
                } else {
                    super.onLoadResource(webView, str);
                }
            }

            @Override // android.taobao.windvane.webview.WVWebViewClient, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6d69af14", new Object[]{this, webView, str});
                    return;
                }
                super.onPageFinished(webView, str);
                H5TabContentController.b(H5TabContentController.this, false);
                H5TabContentController.a(H5TabContentController.this, (Boolean) true);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a2dd279", new Object[]{this, webView, webResourceRequest, webResourceError});
                    return;
                }
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                H5TabContentController.a(H5TabContentController.this, false);
                H5TabContentController.b(H5TabContentController.this, true);
            }

            @Override // android.taobao.windvane.webview.WVWebViewClient, android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e26f04fc", new Object[]{this, webView, sslErrorHandler, sslError});
                    return;
                }
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                H5TabContentController.a(H5TabContentController.this, false);
                H5TabContentController.b(H5TabContentController.this, true);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cd0eda36", new Object[]{this, webView, webResourceRequest, webResourceResponse});
                    return;
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                H5TabContentController.a(H5TabContentController.this, false);
                H5TabContentController.b(H5TabContentController.this, true);
            }
        };
    }

    /* loaded from: classes7.dex */
    public static class TbH5ContainerBridge extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String ACTION_CLOSE_LOADING = "closeLoading";

        static {
            kge.a(196677304);
        }

        public static /* synthetic */ Object ipc$super(TbH5ContainerBridge tbH5ContainerBridge, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.taobao.windvane.jsbridge.e
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            if (ACTION_CLOSE_LOADING.equals(str)) {
                if (wVCallBackContext == null || wVCallBackContext.getWebview() == null) {
                    return false;
                }
                hideLoadingView(wVCallBackContext);
                wVCallBackContext.success();
                return true;
            }
            r rVar = new r();
            rVar.a("errorMsg", "no matched method");
            wVCallBackContext.error(rVar);
            return false;
        }

        private void hideLoadingView(WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0bcbca3", new Object[]{this, wVCallBackContext});
                return;
            }
            IWVWebView webview = wVCallBackContext.getWebview();
            if (!(webview instanceof WVWebView)) {
                return;
            }
            Object tag = ((WVWebView) webview).getTag(R.id.tag_h5_container);
            if (!(tag instanceof H5TabContentController)) {
                return;
            }
            H5TabContentController.b((H5TabContentController) tag);
        }
    }
}
