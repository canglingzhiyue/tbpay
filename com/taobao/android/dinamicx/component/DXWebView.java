package com.taobao.android.dinamicx.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXRecyclerEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.widget.ah;
import com.uc.webview.export.WebResourceError;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.fux;
import tb.fxr;
import tb.gbg;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001'\u0018\u00002\u00020\u0001:\u0001XB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010+\u001a\u00020,H\u0002J\"\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\n2\u0012\b\u0002\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u000100J\u0010\u00101\u001a\u00020\f2\u0006\u00102\u001a\u000203H\u0016JP\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\fH\u0016J\b\u0010>\u001a\u00020,H\u0002J\n\u0010?\u001a\u0004\u0018\u00010@H\u0002J\u0006\u0010A\u001a\u00020\fJ\u0012\u0010B\u001a\u00020,2\b\u0010C\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020\nH\u0002J\b\u0010F\u001a\u00020,H\u0014J0\u0010G\u001a\u00020,2\u0006\u0010H\u001a\u00020\f2\u0006\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\bH\u0014J\u0018\u0010M\u001a\u00020,2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bH\u0002J\u0018\u0010P\u001a\u00020,2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bH\u0002J\u0006\u0010Q\u001a\u00020,J\u0006\u0010R\u001a\u00020,J\u0006\u0010S\u001a\u00020,J\u001c\u0010T\u001a\u00020,2\b\u0010U\u001a\u0004\u0018\u00010V2\b\u0010)\u001a\u0004\u0018\u00010*H\u0007J\u000e\u0010W\u001a\u00020,2\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/taobao/android/dinamicx/component/DXWebView;", "Landroid/taobao/windvane/extra/uc/WVUCWebView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "anchorOffsetY", "", "anchorState", "", "enableAnchorCallback", "", "enableInterceptTopScroll", "getEnableInterceptTopScroll", "()Z", "setEnableInterceptTopScroll", "(Z)V", "enableScrollEventCallback", "limitedEdgeChecked", "mLastRawX", "mLastRawY", "offsetX", "offsetY", "onScrollEvent", "Lcom/taobao/android/dinamicx/expression/event/DXRecyclerEvent;", "onTouchDealtX", "onTouchDealtY", "preIsReachTop", "preRequestStatus", "Lcom/taobao/android/dinamicx/component/DXWebView$STATUS;", "requestStatus", "getRequestStatus", "()Lcom/taobao/android/dinamicx/component/DXWebView$STATUS;", "setRequestStatus", "(Lcom/taobao/android/dinamicx/component/DXWebView$STATUS;)V", "translateYLimited", "vectorOffsetY", "webViewCallback", "com/taobao/android/dinamicx/component/DXWebView$webViewCallback$1", "Lcom/taobao/android/dinamicx/component/DXWebView$webViewCallback$1;", "widgetNode", "Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode;", "callBackToHome", "", "callJS", "funcString", "callback", "Landroid/webkit/ValueCallback;", "coreDispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "coreOverScrollBy", "deltaX", "deltaY", "scrollX", "scrollY", "scrollRangeX", "scrollRangeY", "maxOverScrollX", "maxOverScrollY", "isTouchEvent", "correctScrollY", "findRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "isWebReachTop", "loadUrl", "url", "loge", "msg", "onDetachedFromWindow", "onLayout", "changed", "left", "top", "right", "bottom", "onScrollWithControl", "dx", "dy", "postScrollEvent", "resetAnchorState", "resetRequestStatus", "scrollToTop", "setScrollConfig", "config", "Lcom/alibaba/fastjson/JSONObject;", "updateWidget", "STATUS", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class DXWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int anchorOffsetY;
    private String anchorState;
    private boolean enableAnchorCallback;
    private boolean enableInterceptTopScroll;
    private boolean enableScrollEventCallback;
    private boolean limitedEdgeChecked;
    private int mLastRawX;
    private int mLastRawY;
    private int offsetX;
    private int offsetY;
    private final DXRecyclerEvent onScrollEvent;
    private int onTouchDealtX;
    private int onTouchDealtY;
    private boolean preIsReachTop;
    private STATUS preRequestStatus;
    private STATUS requestStatus;
    private int translateYLimited;
    private int vectorOffsetY;
    private final a webViewCallback;
    private ah widgetNode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/dinamicx/component/DXWebView$STATUS;", "", "(Ljava/lang/String;I)V", "INIT", "START", "FAILED", "SUCCEED", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public enum STATUS {
        INIT,
        START,
        FAILED,
        SUCCEED
    }

    public DXWebView(Context context) {
        this(context, null, 2, null);
    }

    private final void callBackToHome() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf91afc6", new Object[]{this});
        }
    }

    public static /* synthetic */ Object ipc$super(DXWebView dXWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1988789126:
                super.loadUrl((String) objArr[0]);
                return null;
            case -1253202540:
                return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 143825882:
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ ah access$getWidgetNode$p(DXWebView dXWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ah) ipChange.ipc$dispatch("2d41c144", new Object[]{dXWebView}) : dXWebView.widgetNode;
    }

    public static final /* synthetic */ void access$loge(DXWebView dXWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d1abc3", new Object[]{dXWebView, str});
        } else {
            dXWebView.loge(str);
        }
    }

    public static final /* synthetic */ void access$setPreRequestStatus$p(DXWebView dXWebView, STATUS status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8531e2e7", new Object[]{dXWebView, status});
        } else {
            dXWebView.preRequestStatus = status;
        }
    }

    public static final /* synthetic */ void access$setWidgetNode$p(DXWebView dXWebView, ah ahVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cc137c", new Object[]{dXWebView, ahVar});
        } else {
            dXWebView.widgetNode = ahVar;
        }
    }

    public /* synthetic */ DXWebView(Context context, AttributeSet attributeSet, int i, o oVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.d(context, "context");
        this.onScrollEvent = new DXRecyclerEvent(5288751146867425108L);
        this.translateYLimited = Integer.MAX_VALUE;
        this.anchorOffsetY = -1;
        this.anchorState = "none";
        this.requestStatus = STATUS.INIT;
        this.preRequestStatus = this.requestStatus;
        this.webViewCallback = new a(context, context);
    }

    public final boolean getEnableInterceptTopScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c193244", new Object[]{this})).booleanValue() : this.enableInterceptTopScroll;
    }

    public final void setEnableInterceptTopScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9950c708", new Object[]{this, new Boolean(z)});
        } else {
            this.enableInterceptTopScroll = z;
        }
    }

    public final STATUS getRequestStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (STATUS) ipChange.ipc$dispatch("5e0159dd", new Object[]{this}) : this.requestStatus;
    }

    public final void setRequestStatus(STATUS status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bf4e99f", new Object[]{this, status});
            return;
        }
        q.d(status, "<set-?>");
        this.requestStatus = status;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLayout error");
            e.printStackTrace();
            sb.append(t.INSTANCE);
            loge(sb.toString());
            this.requestStatus = STATUS.FAILED;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            if (DinamicXEngine.j()) {
                StringBuilder sb = new StringBuilder();
                sb.append("onDetachedFromWindow error");
                e.printStackTrace();
                sb.append(t.INSTANCE);
                loge(sb.toString());
            }
            this.requestStatus = STATUS.FAILED;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\f2\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"com/taobao/android/dinamicx/component/DXWebView$webViewCallback$1", "Landroid/taobao/windvane/extra/uc/WVUCWebViewClient;", "onPageFinished", "", "p0", "Lcom/uc/webview/export/WebView;", p1.d, "", "onPageStarted", "p2", "Landroid/graphics/Bitmap;", "onReceivedError", "Lcom/uc/webview/export/WebResourceRequest;", "Lcom/uc/webview/export/WebResourceError;", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 149094962) {
                super.onReceivedError((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceError) objArr[2]);
                return null;
            } else if (hashCode != 534767588) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Context context2) {
            super(context2);
            this.b = context;
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            if (DinamicXEngine.j()) {
                DXWebView dXWebView = DXWebView.this;
                DXWebView.access$loge(dXWebView, "webViewCallback onPageFinished ret:" + String.valueOf(str));
            }
            if (p.b(STATUS.START, STATUS.INIT).contains(DXWebView.this.getRequestStatus())) {
                DXWebView.this.setRequestStatus(STATUS.SUCCEED);
            }
            ah access$getWidgetNode$p = DXWebView.access$getWidgetNode$p(DXWebView.this);
            if (access$getWidgetNode$p == null) {
                return;
            }
            DXEvent dXEvent = new DXEvent(ah.DXWEBVIEW_ONWEBEVENT);
            Pair[] pairArr = new Pair[4];
            pairArr[0] = j.a("eventName", f.a("load"));
            pairArr[1] = j.a("status", f.a(DXWebView.this.getRequestStatus() == STATUS.FAILED ? "404" : "200"));
            String url = DXWebView.this.getUrl();
            if (url == null) {
                url = "null";
            }
            pairArr[2] = j.a("url", f.a(url));
            pairArr[3] = j.a("androidRequestStatus", f.a(String.valueOf(DXWebView.this.getRequestStatus())));
            dXEvent.setArgs(ai.a(pairArr));
            t tVar = t.INSTANCE;
            access$getWidgetNode$p.postEvent(dXEvent);
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e30232", new Object[]{this, webView, webResourceRequest, webResourceError});
                return;
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (DinamicXEngine.j()) {
                DXWebView dXWebView = DXWebView.this;
                DXWebView.access$loge(dXWebView, "webViewCallback onReceivedError ret:" + String.valueOf(webResourceRequest));
            }
            DXWebView.this.setRequestStatus(STATUS.FAILED);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            if (DinamicXEngine.j()) {
                DXWebView dXWebView = DXWebView.this;
                DXWebView.access$loge(dXWebView, "webViewCallback onPageStarted ret:" + String.valueOf(str));
            }
            DXWebView dXWebView2 = DXWebView.this;
            DXWebView.access$setPreRequestStatus$p(dXWebView2, dXWebView2.getRequestStatus());
            DXWebView.this.setRequestStatus(STATUS.START);
        }
    }

    private final void loge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ada172", new Object[]{this, str});
        } else {
            fux.b(str);
        }
    }

    public final void resetRequestStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c0bdd9", new Object[]{this});
            return;
        }
        this.requestStatus = STATUS.INIT;
        this.preRequestStatus = STATUS.INIT;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        if (Math.abs(this.onTouchDealtX) >= 20 && Math.abs(this.onTouchDealtX) >= Math.abs(this.onTouchDealtY)) {
            loge("rv requestDisallowInterceptTouchEvent x");
            RecyclerView findRecyclerView = findRecyclerView();
            if (findRecyclerView != null) {
                findRecyclerView.requestDisallowInterceptTouchEvent(false);
            }
        }
        if (i4 == 0 && this.onTouchDealtY < 0 && this.enableInterceptTopScroll) {
            RecyclerView findRecyclerView2 = findRecyclerView();
            if (findRecyclerView2 != null) {
                findRecyclerView2.requestDisallowInterceptTouchEvent(false);
            }
            correctScrollY();
            loge("rv requestDisallowInterceptTouchEvent y");
        }
        if (this.preIsReachTop != (i4 == 0)) {
            callBackToHome();
            if (i4 != 0) {
                z2 = false;
            }
            this.preIsReachTop = z2;
            loge("coreOverScrollBy callBackToHome");
        }
        if (DinamicXEngine.j()) {
            loge("coreOverScrollBy deltaY:" + i2 + " scrollY:" + i4 + " deltaX:" + i + " scrollX:" + i3 + " scrollRangeX:" + i5);
        }
        onScrollWithControl(this.onTouchDealtX, this.onTouchDealtY);
        return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    private final void correctScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28777ae9", new Object[]{this});
            return;
        }
        ah ahVar = this.widgetNode;
        if (ahVar == null) {
            return;
        }
        DXRuntimeContext dXRuntimeContext = ahVar.getDXRuntimeContext();
        q.b(dXRuntimeContext, "it.dxRuntimeContext");
        Object a2 = dXRuntimeContext.a();
        if (!(a2 instanceof WeakReference)) {
            a2 = null;
        }
        WeakReference weakReference = (WeakReference) a2;
        if (weakReference == null) {
            return;
        }
        weakReference.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onScrollWithControl(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.component.DXWebView.onScrollWithControl(int, int):void");
    }

    public final void resetAnchorState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb2a414", new Object[]{this});
            return;
        }
        this.offsetY = 0;
        this.offsetX = 0;
        this.vectorOffsetY = 0;
        this.limitedEdgeChecked = false;
        if (this.enableAnchorCallback && q.a((Object) this.anchorState, (Object) "reach")) {
            Map<String, f> args = this.onScrollEvent.getArgs();
            q.b(args, "onScrollEvent.args");
            String lowerCase = "leave".toLowerCase();
            q.b(lowerCase, "(this as java.lang.String).toLowerCase()");
            args.put("anchorState", f.a(lowerCase));
            postScrollEvent(0, 0);
        }
        this.anchorState = "none";
    }

    public final boolean isWebReachTop() {
        View coreView;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc888d57", new Object[]{this})).booleanValue() : this.requestStatus != STATUS.SUCCEED || (getScrollY() == 0 && (coreView = getCoreView()) != null && coreView.getScrollY() == 0);
    }

    public final void scrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2787c14", new Object[]{this});
            return;
        }
        evaluateJavascript("window.subscriptionFrontEndCommonUtils.scrollToTop()", null);
        resetAnchorState();
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, android.taobao.windvane.webview.IWVWebView
    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
            return;
        }
        loge("loadUrl:" + String.valueOf(str));
        super.loadUrl(str);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreDispatchTouchEvent(MotionEvent event) {
        ah ahVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, event})).booleanValue();
        }
        q.d(event, "event");
        if (this.requestStatus != STATUS.SUCCEED && this.preRequestStatus != STATUS.SUCCEED) {
            loge("coreDispatchTouchEvent requestStatus = " + this.requestStatus + " + preRequestStatus = " + this.preRequestStatus);
            RecyclerView findRecyclerView = findRecyclerView();
            if (findRecyclerView != null) {
                findRecyclerView.requestDisallowInterceptTouchEvent(false);
            }
            if (this.requestStatus == STATUS.INIT && this.preRequestStatus == STATUS.INIT && (ahVar = this.widgetNode) != null) {
                ahVar.a();
            }
            return super.coreDispatchTouchEvent(event);
        }
        int rawY = (int) event.getRawY();
        int rawX = (int) event.getRawX();
        if (event.getAction() == 0) {
            loge("coreDispatchTouchEvent MotionEvent.ACTION_DOWN");
            RecyclerView findRecyclerView2 = findRecyclerView();
            if (findRecyclerView2 != null) {
                findRecyclerView2.requestDisallowInterceptTouchEvent(true);
            }
            this.mLastRawY = rawY;
            this.mLastRawX = rawX;
        } else if (event.getAction() == 2) {
            int i = this.mLastRawY - rawY;
            int i2 = this.mLastRawX - rawX;
            this.mLastRawY = rawY;
            this.mLastRawX = rawX;
            this.offsetY += i;
            this.offsetX += i2;
            this.onTouchDealtX = i2;
            this.onTouchDealtY = i;
            if (DinamicXEngine.j()) {
                loge("coreDispatchTouchEvent scroll dx:" + i2 + " dy:" + i + " offsetY:" + this.offsetY + " offsetX:" + this.offsetX);
            }
        }
        return super.coreDispatchTouchEvent(event);
    }

    private final RecyclerView findRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("c84ffe60", new Object[]{this});
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecyclerView) {
                return (RecyclerView) parent;
            }
        }
        return null;
    }

    public final void setScrollConfig(JSONObject jSONObject, ah ahVar) {
        int b;
        int b2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bff5c4a", new Object[]{this, jSONObject, ahVar});
            return;
        }
        setWebViewClient(this.webViewCallback);
        if (jSONObject != null && !jSONObject.isEmpty()) {
            this.widgetNode = ahVar;
            Boolean a2 = fxr.a("enableScrollEventCallback", jSONObject, (Boolean) false);
            q.b(a2, "JSONUtils.getBoolean(\"en…Callback\", config, false)");
            this.enableScrollEventCallback = a2.booleanValue();
            Boolean a3 = fxr.a("enableAnchorCallback", jSONObject, (Boolean) false);
            q.b(a3, "JSONUtils.getBoolean(\"en…Callback\", config, false)");
            this.enableAnchorCallback = a3.booleanValue();
            if (jSONObject.containsKey("translateYLimited")) {
                if (ahVar != null) {
                    b2 = gbg.a(ahVar.getEngine(), DinamicXEngine.i(), jSONObject.getIntValue("translateYLimited"));
                } else {
                    b2 = gbg.b(DinamicXEngine.i(), jSONObject.getIntValue("translateYLimited"));
                }
                this.translateYLimited = b2;
            }
            if (jSONObject.containsKey("anchorOffsetY")) {
                if (ahVar != null) {
                    b = gbg.a(ahVar.getEngine(), DinamicXEngine.i(), jSONObject.getIntValue("anchorOffsetY"));
                } else {
                    b = gbg.b(DinamicXEngine.i(), jSONObject.getIntValue("anchorOffsetY"));
                }
                this.anchorOffsetY = b;
            }
            boolean z2 = this.enableAnchorCallback;
            if (this.anchorOffsetY <= 0) {
                z = false;
            }
            this.enableAnchorCallback = z2 & z;
            HashMap hashMap = new HashMap();
            f a4 = f.a(this.translateYLimited);
            q.b(a4, "DXExprVar.ofInt(translateYLimited.toLong())");
            hashMap.put("translateYLimited", a4);
            f a5 = f.a(this.anchorOffsetY);
            q.b(a5, "DXExprVar.ofInt(anchorOffsetY.toLong())");
            hashMap.put("anchorOffsetY", a5);
            this.onScrollEvent.setDataToArgs(hashMap);
            return;
        }
        this.widgetNode = null;
    }

    private final void postScrollEvent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b6e074", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.onScrollEvent.setDeltaX(i);
        this.onScrollEvent.setDeltaY(i2);
        this.onScrollEvent.setOffsetX(this.offsetX);
        this.onScrollEvent.setOffsetY(this.offsetY);
        ah ahVar = this.widgetNode;
        if (ahVar == null) {
            return;
        }
        this.onScrollEvent.setUserId(ahVar.getUserId());
        this.onScrollEvent.setSelfWidget(ahVar);
        this.onScrollEvent.setDataToArgs();
        ahVar.postEvent(this.onScrollEvent);
    }

    public static /* synthetic */ void callJS$default(DXWebView dXWebView, String str, ValueCallback valueCallback, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbe04619", new Object[]{dXWebView, str, valueCallback, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            valueCallback = null;
        }
        dXWebView.callJS(str, valueCallback);
    }

    public final void callJS(String funcString, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c507d3e", new Object[]{this, funcString, valueCallback});
            return;
        }
        q.d(funcString, "funcString");
        evaluateJavascript(funcString, valueCallback);
    }

    public final void updateWidget(ah widgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b9e4e", new Object[]{this, widgetNode});
            return;
        }
        q.d(widgetNode, "widgetNode");
        this.widgetNode = widgetNode;
    }
}
