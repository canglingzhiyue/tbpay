package com.taobao.tbpoplayer.view;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.TBWXSDKEngine;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXRenderStrategy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import org.json.JSONTokener;
import tb.bzt;
import tb.kge;
import tb.qoa;
import tb.qoc;
import tb.sep;

/* loaded from: classes9.dex */
public class PopLayerWeexView extends PopLayerBaseView<View, d> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEW_TYPE = "weex";
    private static boolean isRegisterTrackingModule;
    private volatile boolean mInitDone;
    private qoc mInstance;
    private boolean mIsRenderDone;
    private volatile boolean mIsWeexWaitTimeEnbale;
    private List<Pair<String, String>> mLostReceivedEvent;
    private long mRenderStartTimeStamp;
    private sep mScreenTypeListener;
    private String weexSource;
    private String weexUrl;

    public static /* synthetic */ Object ipc$super(PopLayerWeexView popLayerWeexView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1896705494:
                super.syncJumpToUrlInfo((String) objArr[0]);
                return null;
            case 571929693:
                super.init((Context) objArr[0], (Context) ((PopRequest) objArr[1]));
                return null;
            case 988548963:
                super.onActivityPaused();
                return null;
            case 1889590256:
                super.onActivityResumed();
                return null;
            case 1890078406:
                super.destroyView();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean access$000(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc3721cc", new Object[]{popLayerWeexView})).booleanValue() : popLayerWeexView.mIsClosed;
    }

    public static /* synthetic */ boolean access$100(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0fbc2b", new Object[]{popLayerWeexView})).booleanValue() : popLayerWeexView.mIsClosed;
    }

    public static /* synthetic */ PopRequest access$1000(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopRequest) ipChange.ipc$dispatch("2e1a1489", new Object[]{popLayerWeexView}) : popLayerWeexView.mPopRequest;
    }

    public static /* synthetic */ long access$1100(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec8aef4c", new Object[]{popLayerWeexView})).longValue() : popLayerWeexView.mRenderStartTimeStamp;
    }

    public static /* synthetic */ void access$200(PopLayerWeexView popLayerWeexView, Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ae752", new Object[]{popLayerWeexView, context, dVar});
        } else {
            popLayerWeexView.doInit(context, dVar);
        }
    }

    public static /* synthetic */ void access$300(PopLayerWeexView popLayerWeexView, PopRequest popRequest, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fdf0c5", new Object[]{popLayerWeexView, popRequest, str, str2});
        } else {
            popLayerWeexView.closeOnException(popRequest, str, str2);
        }
    }

    public static /* synthetic */ Object access$400(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b484fc6e", new Object[]{popLayerWeexView}) : popLayerWeexView.mInnerView;
    }

    public static /* synthetic */ Object access$500(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5d68bef", new Object[]{popLayerWeexView}) : popLayerWeexView.mInnerView;
    }

    public static /* synthetic */ Object access$602(PopLayerWeexView popLayerWeexView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ce21e696", new Object[]{popLayerWeexView, obj});
        }
        popLayerWeexView.mInnerView = obj;
        return obj;
    }

    public static /* synthetic */ Object access$700(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8879aaf1", new Object[]{popLayerWeexView}) : popLayerWeexView.mInnerView;
    }

    public static /* synthetic */ boolean access$800(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4afbf4c4", new Object[]{popLayerWeexView})).booleanValue() : popLayerWeexView.mIsRenderDone;
    }

    public static /* synthetic */ boolean access$802(PopLayerWeexView popLayerWeexView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b99919a", new Object[]{popLayerWeexView, new Boolean(z)})).booleanValue();
        }
        popLayerWeexView.mIsRenderDone = z;
        return z;
    }

    public static /* synthetic */ List access$900(PopLayerWeexView popLayerWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("50cb4148", new Object[]{popLayerWeexView}) : popLayerWeexView.mLostReceivedEvent;
    }

    static {
        kge.a(-546624734);
        isRegisterTrackingModule = false;
    }

    public PopLayerWeexView(Context context) {
        super(context);
        this.mRenderStartTimeStamp = 0L;
        this.mIsRenderDone = false;
        this.mInitDone = false;
        this.mIsWeexWaitTimeEnbale = false;
        this.mLostReceivedEvent = new ArrayList();
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
            return;
        }
        qoc qocVar = this.mInstance;
        if (qocVar != null) {
            qocVar.b(context);
        }
        if (!com.taobao.tbpoplayer.info.a.a().A()) {
            return;
        }
        Context context2 = getContext();
        if (!(context2 instanceof MutableContextWrapper)) {
            return;
        }
        ((MutableContextWrapper) context2).setBaseContext(context);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void init(final Context context, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef24561", new Object[]{this, context, dVar});
            return;
        }
        super.init(context, (Context) dVar);
        if (!isRegisterTrackingModule) {
            try {
                WXSDKEngine.registerModule("PopLayerTrackingEventModule", PopLayerTrackingEventModule.class);
            } catch (WXException e) {
                e.printStackTrace();
            }
            isRegisterTrackingModule = true;
        }
        com.alibaba.poplayer.utils.c.a("PopLayerWeexView.init.registerModule.PopLayerTrackingEventModule.done.", new Object[0]);
        setVisibility(4);
        setPenetrateAlpha((int) (dVar.x().modalThreshold * 255.0d));
        setFindTextureSurfaceViewRectWhenTouch(dVar.x().enableSpecialViewTouchIntercept);
        setPopRequest(dVar);
        if (com.taobao.tbpoplayer.info.a.a().N()) {
            setUseCacheMark(false);
            setUseTouchPointBitmap(true);
        }
        final String b = d.b(dVar);
        this.mIsWeexWaitTimeEnbale = com.taobao.tbpoplayer.info.a.a().a(context);
        com.alibaba.poplayer.utils.c.c("containerLifeCycle", b, "PopLayerWeexView.init.isWeexInitWaitTimeEnable=" + this.mIsWeexWaitTimeEnbale);
        initParams(dVar);
        if (this.mIsWeexWaitTimeEnbale) {
            this.mInstance = new qoc(context);
            this.mInstance.f32972a = new WeakReference<>(this);
            TBWXSDKEngine.initSDKEngine();
            this.mInstance.n(this.weexUrl);
            com.alibaba.poplayer.utils.c.c("containerLifeCycle", b, "PopLayerWeexView.init.setInitListener");
            this.mInstance.a(new WXSDKManager.a() { // from class: com.taobao.tbpoplayer.view.PopLayerWeexView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.WXSDKManager.a
                public void onInitSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb2dd3fb", new Object[]{this});
                        return;
                    }
                    String str = b;
                    com.alibaba.poplayer.utils.c.c("containerLifeCycle", str, "PopLayerWeexView.init.setInitListener.onInitSuccess.mIsClosed=" + PopLayerWeexView.access$000(PopLayerWeexView.this));
                    if (PopLayerWeexView.access$100(PopLayerWeexView.this)) {
                        return;
                    }
                    PopLayerWeexView.access$200(PopLayerWeexView.this, context, dVar);
                }

                @Override // com.taobao.weex.WXSDKManager.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        return;
                    }
                    com.alibaba.poplayer.utils.c.a("PopLayerWeexView.init.onInitFail.", new Object[0]);
                    PopLayerWeexView popLayerWeexView = PopLayerWeexView.this;
                    PopLayerWeexView.access$300(popLayerWeexView, popLayerWeexView.getPopRequest(), "WEEX_INIT_FAIL", "");
                }
            });
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeexView$sl3X69xGsDF3tZrFN4Nec90UTBs
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeexView.this.lambda$init$56$PopLayerWeexView(b, dVar);
                }
            }, com.taobao.tbpoplayer.info.a.a().q());
        } else if (!WXEnvironment.JsFrameworkInit) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.init.isWeexInitWaitTimeEnable=false.WEEX_NOT_INIT.", new Object[0]);
            closeOnException(dVar, "WEEX_NOT_INIT", "weexNotInit");
        } else {
            this.mInstance = new qoc(context);
            this.mInstance.f32972a = new WeakReference<>(this);
            doInit(context, dVar);
        }
    }

    public /* synthetic */ void lambda$init$56$PopLayerWeexView(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7356b9", new Object[]{this, str, dVar});
        } else if (this.mInitDone) {
        } else {
            com.alibaba.poplayer.utils.c.c("containerLifeCycle", str, "PopLayerWeexView.init.setInitListener.WEEX_INIT_OUT_OF_TIME");
            closeOnException(dVar, "WEEX_INIT_OUT_OF_TIME", "");
        }
    }

    private void initParams(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5df3b8d", new Object[]{this, dVar});
            return;
        }
        JSONObject jSONObject = null;
        try {
            String str = dVar.x().params;
            if (!TextUtils.isEmpty(str)) {
                jSONObject = (JSONObject) new JSONTokener(str).nextValue();
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView init fail.", th);
        }
        if (jSONObject == null) {
            closeOnException(dVar, "PARAMS_PARSE_ERROR", "params=" + dVar.x().params);
            return;
        }
        try {
            this.weexUrl = jSONObject.optString("weexUrl");
            this.weexSource = jSONObject.optString("weexSource");
        } catch (Throwable th2) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.initParams error.", th2);
        }
    }

    private void doInit(Context context, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3933a216", new Object[]{this, context, dVar});
            return;
        }
        this.mInitDone = true;
        interceptWeexUserTrackModule(dVar);
        this.mScreenTypeListener = new sep(context);
        this.mScreenTypeListener.a(this);
        this.mInstance.a(new com.taobao.weex.d() { // from class: com.taobao.tbpoplayer.view.PopLayerWeexView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.d
            public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
                View childAt;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                    return;
                }
                com.alibaba.poplayer.utils.c.a("PopLayerWeexView.onViewCreated.start.", new Object[0]);
                if (view == null) {
                    PopLayerWeexView.access$300(PopLayerWeexView.this, dVar, "RENDER_VIEW_CREATED_NULL", "weexRenderOnViewCreatedViewIsNull");
                    return;
                }
                try {
                    if ((view instanceof ViewGroup) && (childAt = ((ViewGroup) view).getChildAt(0)) != null) {
                        childAt.setBackgroundColor(0);
                    }
                    if (PopLayerWeexView.access$400(PopLayerWeexView.this) != null) {
                        PopLayerWeexView.this.removeView((View) PopLayerWeexView.access$500(PopLayerWeexView.this));
                        com.alibaba.poplayer.utils.c.a("PopLayerWeexView.onViewCreated.mInnerView already been added.remove it.", new Object[0]);
                    }
                    PopLayerWeexView.this.removeCloseButton();
                    PopLayerWeexView.access$602(PopLayerWeexView.this, view);
                    ((View) PopLayerWeexView.access$700(PopLayerWeexView.this)).setClickable(true);
                    com.alibaba.poplayer.utils.c.a("PopLayerWeexView.onViewCreated.done.", new Object[0]);
                } catch (Throwable th) {
                    com.alibaba.poplayer.utils.c.a("PopLayerWeexView.onViewCreated.error.", th);
                }
            }

            @Override // com.taobao.weex.d
            public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                    return;
                }
                try {
                    com.alibaba.poplayer.utils.c.a("PopLayerWeexView.onRenderSuccess.mIsRenderDone=%s", Boolean.valueOf(PopLayerWeexView.access$800(PopLayerWeexView.this)));
                    if (PopLayerWeexView.access$800(PopLayerWeexView.this)) {
                        return;
                    }
                    PopLayerWeexView.access$802(PopLayerWeexView.this, true);
                    PopLayerWeexView.this.addInnerView();
                    PopLayerWeexView.this.showCloseButton(dVar.x().showCloseBtn);
                    if (!PopLayerWeexView.access$900(PopLayerWeexView.this).isEmpty()) {
                        for (Pair pair : PopLayerWeexView.access$900(PopLayerWeexView.this)) {
                            PopLayerWeexView.this.onReceiveEvent((String) pair.first, (String) pair.second);
                        }
                    }
                    ((d) PopLayerWeexView.access$1000(PopLayerWeexView.this)).t().F = String.valueOf(SystemClock.elapsedRealtime() - PopLayerWeexView.access$1100(PopLayerWeexView.this));
                    View al = wXSDKInstance.al();
                    if (al == null || Build.VERSION.SDK_INT < 16) {
                        return;
                    }
                    al.setImportantForAccessibility(2);
                } catch (Throwable th) {
                    com.alibaba.poplayer.utils.c.a("PopLayerWeexView.onRenderSuccess.error.", th);
                }
            }

            @Override // com.taobao.weex.d
            public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                } else {
                    com.alibaba.poplayer.utils.c.a("PopLayerWeexView.weexInstance.onRefreshSuccess: {%s,%s}.", Integer.valueOf(i), Integer.valueOf(i2));
                }
            }

            @Override // com.taobao.weex.d
            public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                } else {
                    PopLayerWeexView.access$300(PopLayerWeexView.this, dVar, str, str2);
                }
            }
        });
        try {
            if (this.mIsWeexWaitTimeEnbale) {
                renderWeex((d) this.mPopRequest);
            } else {
                com.taobao.application.common.c.c().post(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeexView$1X9brw6xpKblpaH90XytCGdK2xk
                    {
                        PopLayerWeexView.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PopLayerWeexView.this.lambda$doInit$57$PopLayerWeexView();
                    }
                });
            }
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.init.start.renderWeex.", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.createView error.", th);
        }
    }

    public /* synthetic */ void lambda$doInit$57$PopLayerWeexView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34a7495", new Object[]{this});
        } else {
            renderWeex((d) this.mPopRequest);
        }
    }

    private void renderWeex(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93716b0e", new Object[]{this, dVar});
            return;
        }
        try {
            String str = dVar.x().indexID;
            if (this.mInstance == null) {
                com.alibaba.poplayer.utils.c.c("containerLifeCycle", str, "PopLayerWeexView.init.renderWeex mInstance == null");
                return;
            }
            if (!TextUtils.isEmpty(this.weexSource)) {
                com.alibaba.poplayer.utils.c.c("containerLifeCycle", str, "PopLayerWeexView.init.renderWeex.load weexSource");
                this.mInstance.a("PopLayer.IndexId=" + str, this.weexSource, (Map<String, Object>) null, (String) null, WXRenderStrategy.APPEND_ASYNC);
            } else if (!TextUtils.isEmpty(this.weexUrl)) {
                com.alibaba.poplayer.utils.c.c("containerLifeCycle", str, "PopLayerWeexView.init.renderWeex.load url=" + this.weexUrl);
                this.mInstance.c(this.weexUrl, this.weexUrl, null, null, WXRenderStrategy.APPEND_ASYNC);
            }
            dVar.t().E = String.valueOf(SystemClock.elapsedRealtime() - dVar.t().ak);
            this.mRenderStartTimeStamp = SystemClock.elapsedRealtime();
            com.alibaba.poplayer.utils.c.c("containerLifeCycle", str, "PopLayerWeexView.init.costTime=" + (SystemClock.elapsedRealtime() - dVar.t().ak));
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.renderWeex error.", th);
            d popRequest = getPopRequest();
            closeOnException(popRequest, "RENDER_MAIN_ERROR", "renderWeex.exception.weexurl=" + this.weexUrl);
        }
    }

    private void interceptWeexUserTrackModule(final PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2222c7c", new Object[]{this, popRequest});
        } else if (!com.taobao.tbpoplayer.info.a.a().h()) {
        } else {
            this.mInstance.a("userTrack", new WXSDKInstance.e() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeexView$4H5toMyQw-67w1lbNatDFwm9pqw
                @Override // com.taobao.weex.WXSDKInstance.e
                public final WXSDKInstance.f CallModuleMethod(String str, String str2, JSONArray jSONArray, com.alibaba.fastjson.JSONObject jSONObject) {
                    return PopLayerWeexView.lambda$interceptWeexUserTrackModule$58(PopRequest.this, str, str2, jSONArray, jSONObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ WXSDKInstance.f lambda$interceptWeexUserTrackModule$58(PopRequest popRequest, String str, String str2, JSONArray jSONArray, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance.f) ipChange.ipc$dispatch("2849a65c", new Object[]{popRequest, str, str2, jSONArray, jSONObject});
        }
        try {
            if ("userTrack".equals(str) && !TextUtils.isEmpty(str2) && (("commit".equals(str2) || "commitut".equals(str2)) && jSONArray != null && g4.b.i.equals(jSONArray.getString(0)))) {
                String a2 = d.a(popRequest);
                com.alibaba.poplayer.utils.c.b("pageLifeCycle", a2, "this page is using userTrack enter.intercepted.methodStr=" + str2);
                z = true;
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.ModuleIntercept.fail.", th);
        }
        return new WXSDKInstance.f(z, null);
    }

    private void closeOnException(final PopRequest popRequest, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908619ff", new Object[]{this, popRequest, str, str2});
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeexView$5A7NY4aO8mSC2GpzbxMRAiPTzCA
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeexView.this.lambda$closeOnException$59$PopLayerWeexView(str, str2, popRequest);
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                post(runnable);
            } else {
                runnable.run();
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.closeOnException error.", th);
        }
    }

    public /* synthetic */ void lambda$closeOnException$59$PopLayerWeexView(String str, String str2, PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40bd4fa", new Object[]{this, str, str2, popRequest});
            return;
        }
        try {
            OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode = OnePopModule.OnePopLoseReasonCode.OnViewErrorClose;
            close(onePopLoseReasonCode, str + "", str2, null);
            com.alibaba.poplayer.utils.c.a("containerLifeCycle", d.a(popRequest), str2);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.closeOnException.Runnable.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        try {
            if (this.mInstance != null) {
                this.mInstance.onActivityDestroy();
            }
            this.mInnerView = null;
            removeCloseButton();
            c.a().b(((d) this.mPopRequest).z());
            if (this.mScreenTypeListener == null) {
                return;
            }
            this.mScreenTypeListener.a();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.destroyView.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
            return;
        }
        try {
            super.onActivityResumed();
            if (this.mInstance == null) {
                return;
            }
            this.mInstance.a("WV.Event.APP.Active", (Map<String, Object>) new HashMap());
            com.alibaba.poplayer.utils.c.a("send event:WV.Event.APP.Active", new Object[0]);
            this.mInstance.onActivityResume();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("Weex onActivityResumed error", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        try {
            super.onActivityPaused();
            if (this.mInstance == null) {
                return;
            }
            this.mInstance.a("WV.Event.APP.Background", (Map<String, Object>) new HashMap());
            com.alibaba.poplayer.utils.c.a("send event:WV.Event.APP.Background", new Object[0]);
            this.mInstance.onActivityPause();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("Weex onActivityPaused error", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onReceiveEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12978511", new Object[]{this, str, str2});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.onReceiveEvent{%s,%s}.mIsRenderDone=%s", str, str2, Boolean.valueOf(this.mIsRenderDone));
            if (!this.mIsRenderDone) {
                this.mLostReceivedEvent.add(new Pair<>(str, str2));
            } else if (this.mInstance == null) {
            } else {
                this.mInstance.a(str, (Map<String, Object>) JSON.parseObject(str2));
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.onReceiveEvent error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void syncJumpToUrlInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef2922a", new Object[]{this, str});
            return;
        }
        super.syncJumpToUrlInfo(str);
        qoa.a((d) this.mPopRequest);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public SpannableStringBuilder getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("e6e304e", new Object[]{this});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        try {
            com.taobao.tbpoplayer.util.a.a(spannableStringBuilder, "WeexUrl", this.weexUrl, null, null);
            com.taobao.tbpoplayer.util.a.a(spannableStringBuilder, "Event", getPopRequest().y().toString(), null, null);
        } catch (Throwable th) {
            com.taobao.tbpoplayer.util.a.a(spannableStringBuilder, "Error", "getInfo Error.Message:" + th.getMessage(), null, null);
        }
        return spannableStringBuilder;
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public String getNativeNotifyInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58e6e2f5", new Object[]{this});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        try {
            if (getPopRequest() != null) {
                BaseConfigItem x = getPopRequest().x();
                jSONObject.put("uuid", (Object) x.uuid);
                jSONObject.put("PopTimes", (Object) (bzt.a().a(x.uuid, -1) + ""));
                jSONObject.put("Event", (Object) getPopRequest().y().toString());
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("getNativeNotifyInfo.error.", th);
        }
        return jSONObject.toJSONString();
    }
}
