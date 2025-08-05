package com.alibaba.triver.triver_shop.web;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.view.ViewPager;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.alibaba.triver.triver_shop.web.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebSettings;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.cen;
import tb.kge;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public class ShopBaseWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final String SHOP_BIZ = "shop";
    private boolean apiCallByAsyncBridge;
    private Handler apiHandler;
    private HandlerThread apiThread;
    private d coreOverScrollByCallback;
    private Runnable detectScrollingRunnable;
    private boolean enableCompatInViewPager;
    private long lastScrollYTime;
    private boolean scrolling;
    private final a.InterfaceC0159a topDetectedHelper;
    private rul<? super MotionEvent, t> touchEventProcessor;
    private boolean useShareApiThread;
    private com.alibaba.triver.triver_shop.web.a webViewScrollToTopListener;

    /* loaded from: classes3.dex */
    public static final class b implements a.InterfaceC0159a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.alibaba.triver.triver_shop.web.a.InterfaceC0159a
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            if (ShopBaseWebView.this.isDestroied()) {
                return true;
            }
            View coreView = ShopBaseWebView.this.getCoreView();
            return coreView != null && coreView.getScrollY() == 0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ruk f4151a;

        public c(ruk rukVar) {
            this.f4151a = rukVar;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f4151a.mo2427invoke();
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);
    }

    static {
        kge.a(-1942006161);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(ShopBaseWebView shopBaseWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1253202540:
                return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
            case -1247571552:
                super.reload();
                return null;
            case 143825882:
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(1782924023);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }

    public final rul<MotionEvent, t> getTouchEventProcessor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("b9a56315", new Object[]{this}) : this.touchEventProcessor;
    }

    public final void setTouchEventProcessor(rul<? super MotionEvent, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840731c3", new Object[]{this, rulVar});
        } else {
            this.touchEventProcessor = rulVar;
        }
    }

    public final d getCoreOverScrollByCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("1d28097d", new Object[]{this}) : this.coreOverScrollByCallback;
    }

    public final void setCoreOverScrollByCallback(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f9e785", new Object[]{this, dVar});
        } else {
            this.coreOverScrollByCallback = dVar;
        }
    }

    public final boolean getApiCallByAsyncBridge() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cdb6a97", new Object[]{this})).booleanValue() : this.apiCallByAsyncBridge;
    }

    public final void setApiCallByAsyncBridge(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885ef315", new Object[]{this, new Boolean(z)});
        } else {
            this.apiCallByAsyncBridge = z;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreDispatchTouchEvent(MotionEvent event) {
        ViewPager findViewPager;
        ViewPager findViewPager2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, event})).booleanValue();
        }
        q.d(event, "event");
        rul<? super MotionEvent, t> rulVar = this.touchEventProcessor;
        if (rulVar != null) {
            rulVar.mo2421invoke(event);
        }
        if (this.enableCompatInViewPager) {
            int action = event.getAction();
            if (action == 0 && (findViewPager2 = findViewPager()) != null) {
                findViewPager2.requestDisallowInterceptTouchEvent(true);
            }
            if ((action == 1 || action == 3) && (findViewPager = findViewPager()) != null) {
                findViewPager.requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.coreDispatchTouchEvent(event);
    }

    private final ViewPager findViewPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("d671d1d8", new Object[]{this});
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewPager) {
                return (ViewPager) parent;
            }
        }
        return null;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        com.alibaba.triver.triver_shop.web.a aVar;
        ViewPager findViewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        d dVar = this.coreOverScrollByCallback;
        if (dVar != null) {
            z2 = false;
            dVar.a(i, i2, i3, i4, i5, i6, i7, i8, z);
        } else {
            z2 = false;
        }
        if (this.enableCompatInViewPager) {
            if (((i3 == 0 && i < 0) || (i3 == i5 && i > 0)) && (findViewPager = findViewPager()) != null) {
                findViewPager.requestDisallowInterceptTouchEvent(z2);
            }
            if (i4 <= 20 && i2 <= 0 && (aVar = this.webViewScrollToTopListener) != null) {
                q.a(aVar);
                aVar.b();
            }
        }
        return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    public ShopBaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(new MutableContextWrapper(context), attributeSet, i);
        this.useShareApiThread = true;
        this.topDetectedHelper = new b();
        WVUCWebView.setBizCode("shop");
        initBridge();
    }

    public ShopBaseWebView(Context context, AttributeSet attributeSet) {
        super(new MutableContextWrapper(context), attributeSet);
        this.useShareApiThread = true;
        this.topDetectedHelper = new b();
        WVUCWebView.setBizCode("shop");
        initBridge();
    }

    public ShopBaseWebView(Context context) {
        super(new MutableContextWrapper(context));
        this.useShareApiThread = true;
        this.topDetectedHelper = new b();
        WVUCWebView.setBizCode("shop");
        initBridge();
    }

    public void render(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95df87a7", new Object[]{this, str});
            return;
        }
        initRenderSettings();
        loadUrl(str);
    }

    public final void initRenderSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b65910", new Object[]{this});
            return;
        }
        WebSettings settings = getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        if (com.alibaba.triver.triver_shop.newShop.ext.b.c()) {
            WVUCWebView.setWebContentsDebuggingEnabled(true);
        }
        setVerticalScrollbarOverlay(true);
        setOverScrollMode(2);
    }

    private final void initBridge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbdd68c0", new Object[]{this});
        } else if (!cen.Companion.ah()) {
        } else {
            ceg.Companion.b("inject shopAsyncBridge");
            addJavascriptInterface(new AsyncJSAPIBridge(this), "ShopAsyncBridge");
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else {
            super.reload();
        }
    }

    public final void destroyWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5272a7c6", new Object[]{this});
            return;
        }
        removeAllViews();
        destroy();
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, android.taobao.windvane.webview.IWVWebView
    public Context _getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("78ce3197", new Object[]{this});
        }
        if (getContext() instanceof MutableContextWrapper) {
            Context context = getContext();
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.MutableContextWrapper");
            }
            Context baseContext = ((MutableContextWrapper) context).getBaseContext();
            q.b(baseContext, "{\n            (getContext() as MutableContextWrapper).baseContext\n        }");
            return baseContext;
        }
        Context context2 = getContext();
        q.b(context2, "{\n            getContext()\n        }");
        return context2;
    }

    public final void setOuterCtx(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488001b3", new Object[]{this, context});
        } else if (!(getContext() instanceof MutableContextWrapper)) {
        } else {
            Context context2 = getContext();
            if (context2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.MutableContextWrapper");
            }
            ((MutableContextWrapper) context2).setBaseContext(context);
        }
    }

    public final void setEnableCompatInViewPager(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31e6cdb", new Object[]{this, new Boolean(z)});
        } else {
            this.enableCompatInViewPager = z;
        }
    }

    public final void setWebViewScrollToTopListener(com.alibaba.triver.triver_shop.web.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f14b2402", new Object[]{this, aVar});
            return;
        }
        this.webViewScrollToTopListener = aVar;
        if (aVar == null || !aVar.c()) {
            return;
        }
        aVar.a(this.topDetectedHelper);
    }

    public final void apiCall(ruk<t> block) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f507807", new Object[]{this, block});
            return;
        }
        q.d(block, "block");
        Handler handler = this.apiHandler;
        if (this.useShareApiThread || handler == null) {
            com.alibaba.triver.triver_shop.newShop.ext.b.f(block);
        } else {
            handler.post(new c(block));
        }
    }

    public final void setUseSharedApiThread(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9524213", new Object[]{this, new Boolean(z)});
            return;
        }
        this.useShareApiThread = z;
        if (z || this.apiHandler != null) {
            return;
        }
        this.apiThread = new HandlerThread("asyncApi");
        HandlerThread handlerThread = this.apiThread;
        q.a(handlerThread);
        handlerThread.start();
        HandlerThread handlerThread2 = this.apiThread;
        q.a(handlerThread2);
        this.apiHandler = new Handler(handlerThread2.getLooper());
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void destroy() {
        Object m2371constructorimpl;
        Object m2371constructorimpl2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            if (cen.Companion.ap()) {
                com.alibaba.triver.triver_shop.newShop.ext.o.j(this);
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
        super.destroy();
        try {
            Result.a aVar3 = Result.Companion;
            Handler handler = this.apiHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.apiHandler = null;
            HandlerThread handlerThread = this.apiThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            this.apiThread = null;
            m2371constructorimpl2 = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th2) {
            Result.a aVar4 = Result.Companion;
            m2371constructorimpl2 = Result.m2371constructorimpl(i.a(th2));
        }
        Throwable m2374exceptionOrNullimpl2 = Result.m2374exceptionOrNullimpl(m2371constructorimpl2);
        if (m2374exceptionOrNullimpl2 == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl2);
    }
}
