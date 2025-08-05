package com.alibaba.triver.cannal_engine.scene;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.common.TRWidgetConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.a;
import com.taobao.themis.widget.event.NativeWidgetNestedRenderContainer;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import tb.cbr;
import tb.cbs;
import tb.kge;

/* loaded from: classes3.dex */
public class TRWidgetWXView extends WXComponent implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG;
    private boolean hasAttached;
    private boolean isThemisWidget;
    private FragmentActivity mActivity;
    private String mRenderUrl;
    private ViewGroup mRootView;
    private WidgetStartParams mStartParams;
    private WXSDKInstance mWeexInstance;
    private b mWidgetEmbedInstance;
    private TRWidgetInstance mWidgetInstance;

    static {
        kge.a(-526408968);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(TRWidgetWXView tRWidgetWXView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -475248713:
                super.onActivityStop();
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(TRWidgetWXView tRWidgetWXView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7892974", new Object[]{tRWidgetWXView, str, jSONObject});
        } else {
            tRWidgetWXView.fireEventOnMainThread(str, jSONObject);
        }
    }

    public static /* synthetic */ String access$100(TRWidgetWXView tRWidgetWXView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("76c5316f", new Object[]{tRWidgetWXView}) : tRWidgetWXView.TAG;
    }

    public TRWidgetWXView(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.TAG = "TRWidgetWXView";
        this.mRootView = null;
        this.hasAttached = false;
        this.isThemisWidget = false;
        initParams();
    }

    private void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
        } else if (getBasicComponentData() == null || !getBasicComponentData().getAttrs().containsKey("renderUrl")) {
        } else {
            this.mRenderUrl = String.valueOf(getBasicComponentData().getAttrs().get("renderUrl"));
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView */
    public View mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1d4db689", new Object[]{this, context});
        }
        if (context instanceof FragmentActivity) {
            this.mActivity = (FragmentActivity) context;
            if (TextUtils.isEmpty(this.mRenderUrl)) {
                doRenderWidget();
            } else {
                doRenderWeex(this.mRenderUrl);
            }
            return this.mRootView;
        }
        return this.mRootView;
    }

    private void doRenderWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac691ac", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(getBasicComponentData().getAttrs());
        this.isThemisWidget = cbs.a(this.mActivity, jSONObject);
        if (this.isThemisWidget) {
            this.mWidgetEmbedInstance = new b();
            b bVar = this.mWidgetEmbedInstance;
            FragmentActivity fragmentActivity = this.mActivity;
            this.mRootView = bVar.a(jSONObject, fragmentActivity, new NativeWidgetNestedRenderContainer(fragmentActivity, b.a(jSONObject)), new a.C0936a() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWXView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == -650670724) {
                        super.a((String) objArr[0], (String) objArr[1]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.taobao.themis.external.embed.a.C0936a
                public void b(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    String format = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()));
                    jSONObject2.put("data", (Object) (format + ":  " + str2));
                    jSONObject2.put("level", (Object) "error");
                    TRWidgetWXView.access$000(TRWidgetWXView.this, "onDebugLog", jSONObject2);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("errorCode", (Object) str);
                    jSONObject3.put("errorMessage", (Object) str2);
                    TRWidgetWXView.access$000(TRWidgetWXView.this, "onJsError", jSONObject3);
                }

                @Override // com.taobao.themis.external.embed.a.C0936a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        TRWidgetWXView.access$000(TRWidgetWXView.this, "onRenderFinish", new JSONObject());
                    }
                }

                @Override // com.taobao.themis.external.embed.a.C0936a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        return;
                    }
                    super.a(str, str2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("errorCode", (Object) str);
                    jSONObject2.put("errorMessage", (Object) str2);
                    TRWidgetWXView.access$000(TRWidgetWXView.this, "onRenderError", jSONObject2);
                }
            });
            return;
        }
        try {
            this.mStartParams = ((WidgetStartParams) JSON.parseObject(jSONObject.toJSONString(), WidgetStartParams.class)).build();
        } catch (Exception e) {
            RVLogger.e(this.TAG, e);
        }
        if (TextUtils.isEmpty(this.mStartParams.getWidgetId())) {
            this.mStartParams.setWidgetId(String.valueOf(getBasicComponentData().getAttrs().get("canalId")));
        }
        this.mRootView = new com.alibaba.triver.cannal_engine.event.nativeembed.NativeWidgetNestedRenderContainer(getContext(), cbs.a(this.mStartParams));
        this.mWidgetInstance = new TRWidgetInstance(this.mActivity, this.mStartParams.getGroupId());
        this.mWidgetInstance.setAttachStatus(this.hasAttached);
        this.mWidgetInstance.setRootContainer((com.alibaba.triver.cannal_engine.event.nativeembed.NativeWidgetNestedRenderContainer) this.mRootView);
        this.mWidgetInstance.registerWidgetInitListener(new TRWidgetInstance.d() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWXView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.d
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("display", (Object) Boolean.valueOf(z));
                TRWidgetWXView.access$000(TRWidgetWXView.this, "onWidgetInit", jSONObject2);
            }
        });
        this.mWidgetInstance.registerWidgetRenderListener(new TRWidgetInstance.g() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWXView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    TRWidgetWXView.access$000(TRWidgetWXView.this, "onRenderFinish", new JSONObject());
                }
            }

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
            public void a(com.alibaba.triver.cannal_engine.common.a aVar, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("af2eb696", new Object[]{this, aVar, map});
                } else if (TextUtils.equals(TRWidgetConstant.CL_TRIVER_INITING.f3640a, aVar.f3640a)) {
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("errorCode", (Object) aVar.f3640a);
                    jSONObject2.put("errorMessage", (Object) aVar.b);
                    jSONObject2.put("errorActionType", (Object) aVar.c);
                    jSONObject2.put("errorType", (Object) aVar.d);
                    if (aVar.d.equals("bizError")) {
                        jSONObject2.put("bizErrorCode", (Object) Integer.valueOf(aVar.e));
                        jSONObject2.put("bizErrorMessage", (Object) aVar.f);
                    }
                    TRWidgetWXView.access$000(TRWidgetWXView.this, "onRenderError", jSONObject2);
                    String access$100 = TRWidgetWXView.access$100(TRWidgetWXView.this);
                    RVLogger.e(access$100, "Render ERROR" + aVar.toString());
                }
            }
        });
        this.mWidgetInstance.registerWidgetExceptionListener(new TRWidgetInstance.c() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWXView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.c
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                String format = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()));
                jSONObject2.put("data", (Object) (format + ":  " + str2));
                jSONObject2.put("level", (Object) "error");
                TRWidgetWXView.access$000(TRWidgetWXView.this, "onDebugLog", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("errorCode", (Object) str);
                jSONObject3.put("errorMessage", (Object) str2);
                TRWidgetWXView.access$000(TRWidgetWXView.this, "onJsError", jSONObject3);
            }
        });
        this.mWidgetInstance.registerWidgetJSLogListener(new TRWidgetInstance.e() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWXView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.e
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                String format = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()));
                jSONObject2.put("data", (Object) (format + ":  " + str));
                jSONObject2.put("level", (Object) "info");
                TRWidgetWXView.access$000(TRWidgetWXView.this, "onDebugLog", jSONObject2);
            }
        });
        this.mWidgetInstance.registerWidgetMonitorListener(new TRWidgetInstance.f() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWXView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.f
            public void a(String str, JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject2});
                    return;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("name", (Object) str);
                jSONObject3.put("args", (Object) jSONObject2);
                TRWidgetWXView.access$000(TRWidgetWXView.this, "apicall", jSONObject3);
            }

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.f
            public void a(MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                } else if (motionEvent == null) {
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("eventType", (Object) "click");
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("x", (Object) Float.valueOf(motionEvent.getX()));
                    jSONObject3.put("y", (Object) Float.valueOf(motionEvent.getY()));
                    jSONObject3.put("identifier", (Object) Integer.valueOf(motionEvent.hashCode()));
                    jSONObject2.put("detail", (Object) jSONObject3);
                    TRWidgetWXView.access$000(TRWidgetWXView.this, "widgetclick", jSONObject2);
                }
            }

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.f
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                } else {
                    TRWidgetWXView.access$000(TRWidgetWXView.this, "widgettouch", jSONObject2);
                }
            }
        });
        this.mWidgetInstance.render(this.mStartParams, TextUtils.equals("canal", getComponentType()));
    }

    private void fireEventOnMainThread(final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1b5b39", new Object[]{this, str, jSONObject});
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWXView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TRWidgetWXView.this.fireEvent(str, jSONObject);
                }
            }
        };
        if (com.alibaba.triver.kit.api.common.a.a() != Looper.getMainLooper().getThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    @JSMethod
    public void attach(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599bac24", new Object[]{this, jSONObject});
            return;
        }
        this.hasAttached = true;
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.onAttach(jSONObject);
        }
        b bVar = this.mWidgetEmbedInstance;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    @JSMethod
    public void detach(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a71db96", new Object[]{this, jSONObject});
            return;
        }
        this.hasAttached = false;
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.onDetach(jSONObject);
        }
        b bVar = this.mWidgetEmbedInstance;
        if (bVar == null) {
            return;
        }
        bVar.b();
    }

    @JSMethod
    public void updateSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1856811", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.updateSize(i, i2);
    }

    @JSMethod
    public void getMonitorData(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31b8ebf3", new Object[]{this, jSCallback});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance == null || jSCallback == null) {
            return;
        }
        jSCallback.invoke(tRWidgetInstance.getWidgetMonitor());
    }

    @JSMethod
    public void ondestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e97842", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.destroy();
        }
        b bVar = this.mWidgetEmbedInstance;
        if (bVar == null) {
            return;
        }
        bVar.c();
    }

    private void doRenderWeex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d906b3", new Object[]{this, str});
            return;
        }
        this.mRootView = new FrameLayout(this.mActivity);
        RenderContainer renderContainer = new RenderContainer(this.mActivity);
        renderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mWeexInstance = new WXSDKInstance(this.mActivity);
        this.mRootView.addView(renderContainer);
        cbr.a(renderContainer, this.mWeexInstance, str, new cbr.a() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWXView.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.cbr.a
            public void a(WXSDKInstance wXSDKInstance, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91cf7a9a", new Object[]{this, wXSDKInstance, str2, str3});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) str2);
                jSONObject.put("errorMessage", (Object) str3);
                TRWidgetWXView.access$000(TRWidgetWXView.this, "onRenderError", jSONObject);
            }
        });
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.pause();
        }
        b bVar = this.mWidgetEmbedInstance;
        if (bVar == null) {
            return;
        }
        bVar.e();
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.resume();
        }
        b bVar = this.mWidgetEmbedInstance;
        if (bVar == null) {
            return;
        }
        bVar.d();
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        super.onActivityStop();
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.stop();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: getHostView */
    public View mo1286getHostView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d4389aac", new Object[]{this}) : this.mRootView;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.destroy();
        }
        WXSDKInstance wXSDKInstance = this.mWeexInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityDestroy();
        }
        b bVar = this.mWidgetEmbedInstance;
        if (bVar == null) {
            return;
        }
        bVar.c();
    }
}
