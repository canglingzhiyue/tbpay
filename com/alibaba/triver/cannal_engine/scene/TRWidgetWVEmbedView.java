package com.alibaba.triver.cannal_engine.scene;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
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
import com.taobao.themis.widget.e;
import com.taobao.themis.widget.event.WebWidgetNestedRenderContainer;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.Constants;
import java.io.Serializable;
import java.util.Map;
import tb.cbr;
import tb.cbs;
import tb.kge;

/* loaded from: classes3.dex */
public class TRWidgetWVEmbedView extends BaseEmbedView implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FragmentActivity mActivity;
    private String mBridgeId;
    private String mRenderUrl;
    private ViewGroup mRootView;
    private WidgetStartParams mStartParams;
    private WXSDKInstance mWeexInstance;
    private b mWidgetEmbedInstance;
    private TRWidgetInstance mWidgetInstance;
    private String mViewType = "widget";
    private String TAG = "TRWidgetWVEmbedView";
    private String mId = "";
    private boolean hasAttached = false;
    private boolean isThemisWidget = false;

    static {
        kge.a(-374482323);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(TRWidgetWVEmbedView tRWidgetWVEmbedView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 797441118) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onPause();
            return null;
        }
    }

    public static /* synthetic */ void access$000(TRWidgetWVEmbedView tRWidgetWVEmbedView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a0062d", new Object[]{tRWidgetWVEmbedView, str, jSONObject});
        } else {
            tRWidgetWVEmbedView.sendEventToJS(str, jSONObject);
        }
    }

    public static /* synthetic */ String access$100(TRWidgetWVEmbedView tRWidgetWVEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18168886", new Object[]{tRWidgetWVEmbedView}) : tRWidgetWVEmbedView.mId;
    }

    public static /* synthetic */ WidgetStartParams access$200(TRWidgetWVEmbedView tRWidgetWVEmbedView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WidgetStartParams) ipChange.ipc$dispatch("768ea036", new Object[]{tRWidgetWVEmbedView}) : tRWidgetWVEmbedView.mStartParams;
    }

    public static /* synthetic */ void access$300(TRWidgetWVEmbedView tRWidgetWVEmbedView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5739cb78", new Object[]{tRWidgetWVEmbedView, new Boolean(z)});
        } else {
            tRWidgetWVEmbedView.sendWidgetInit(z);
        }
    }

    private void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
        } else if (this.params == null || this.params.mObjectParam == null) {
            RVLogger.e(this.TAG, "params  null");
        } else {
            if (this.params.mObjectParam.get("id") != null) {
                this.mId = this.params.mObjectParam.get("id").toString();
            }
            if (this.params.mObjectParam.get("renderUrl") != null) {
                this.mRenderUrl = this.params.mObjectParam.get("renderUrl").toString();
            }
            if (this.params.mObjectParam.get("bridgeId") == null) {
                return;
            }
            this.mBridgeId = this.params.mObjectParam.get("bridgeId").toString();
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35692924", new Object[]{this}) : this.mViewType;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        initParams();
        if (!(context instanceof FragmentActivity)) {
            return null;
        }
        this.mActivity = (FragmentActivity) context;
        if (TextUtils.isEmpty(this.mRenderUrl)) {
            doRenderWidget();
        } else {
            doRenderWeex(this.mRenderUrl);
        }
        return this.mRootView;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (Constants.Event.SLOT_LIFECYCLE.ATTACH.equals(str)) {
            this.hasAttached = true;
        }
        if ("detach".equals(str)) {
            this.hasAttached = false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = JSON.parseObject(str2);
        } catch (Throwable th) {
            RVLogger.e(this.TAG, th);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1407259067:
                if (str.equals(Constants.Event.SLOT_LIFECYCLE.ATTACH)) {
                    c = 0;
                    break;
                }
                break;
            case -1335224429:
                if (str.equals("detach")) {
                    c = 1;
                    break;
                }
                break;
            case -295960470:
                if (str.equals("updateSize")) {
                    c = 2;
                    break;
                }
                break;
            case 938814190:
                if (str.equals("getMonitorData")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
            if (tRWidgetInstance != null) {
                tRWidgetInstance.onAttach(jSONObject);
            }
            b bVar = this.mWidgetEmbedInstance;
            if (bVar != null) {
                bVar.a();
            }
            return true;
        } else if (c == 1) {
            TRWidgetInstance tRWidgetInstance2 = this.mWidgetInstance;
            if (tRWidgetInstance2 != null) {
                tRWidgetInstance2.onDetach(jSONObject);
            }
            b bVar2 = this.mWidgetEmbedInstance;
            if (bVar2 != null) {
                bVar2.b();
            }
            return true;
        } else if (c == 2) {
            TRWidgetInstance tRWidgetInstance3 = this.mWidgetInstance;
            if (tRWidgetInstance3 != null) {
                tRWidgetInstance3.updateSize(jSONObject);
            }
            return true;
        } else if (c != 3 || wVCallBackContext == null) {
            return false;
        } else {
            TRWidgetInstance tRWidgetInstance4 = this.mWidgetInstance;
            if (tRWidgetInstance4 != null) {
                wVCallBackContext.success(tRWidgetInstance4.getWidgetMonitor().toString());
            }
            b bVar3 = this.mWidgetEmbedInstance;
            if (bVar3 != null) {
                bVar3.a(new e.a() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.themis.widget.e.a
                    public void a(JSONObject jSONObject2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                        } else {
                            wVCallBackContext.success(jSONObject2.toString());
                        }
                    }
                });
            }
            return true;
        }
    }

    private void sendEventToJS(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a3bda9", new Object[]{this, str, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("bridgeId", (Object) this.mBridgeId);
        WVStandardEventCenter.postNotificationToJS(this.webView, str, jSONObject.toJSONString());
    }

    private void doRenderWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac691ac", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(this.params.mObjectParam);
        this.isThemisWidget = cbs.a(this.mActivity, jSONObject);
        if (this.isThemisWidget) {
            this.mWidgetEmbedInstance = new b();
            jSONObject.put("hasAttached", (Object) Boolean.valueOf(this.hasAttached));
            b bVar = this.mWidgetEmbedInstance;
            FragmentActivity fragmentActivity = this.mActivity;
            this.mRootView = bVar.a(jSONObject, fragmentActivity, new WebWidgetNestedRenderContainer(fragmentActivity, b.a(jSONObject)), new a.C0936a() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
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
                    jSONObject2.put("errorCode", (Object) str);
                    jSONObject2.put("errorMsg", (Object) str2);
                    TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "jsError", jSONObject2);
                }

                @Override // com.taobao.themis.external.embed.a.C0936a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "renderFinish", null);
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
                    jSONObject2.put("widgetId", (Object) jSONObject2.getString("widgetId"));
                    jSONObject2.put("id", (Object) TRWidgetWVEmbedView.access$100(TRWidgetWVEmbedView.this));
                    jSONObject2.put("errorCode", (Object) str);
                    jSONObject2.put("errorMessage", (Object) str2);
                    TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "renderError", jSONObject2);
                    TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "onRenderError", jSONObject2);
                }
            });
            sendWidgetInit(true);
            return;
        }
        this.mStartParams = (WidgetStartParams) JSON.parseObject(jSONObject.toJSONString(), WidgetStartParams.class);
        this.mStartParams.build();
        this.mWidgetInstance = new TRWidgetInstance(this.mActivity, this.mStartParams.getGroupId());
        this.mWidgetInstance.setAttachStatus(this.hasAttached);
        this.mWidgetInstance.registerWidgetRenderListener(new TRWidgetInstance.g() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "renderFinish", null);
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
                    jSONObject2.put("widgetId", (Object) TRWidgetWVEmbedView.access$200(TRWidgetWVEmbedView.this).getWidgetId());
                    jSONObject2.put("id", (Object) TRWidgetWVEmbedView.access$100(TRWidgetWVEmbedView.this));
                    jSONObject2.put("errorCode", (Object) aVar.f3640a);
                    jSONObject2.put("errorMessage", (Object) aVar.b);
                    jSONObject2.put("errorActionType", (Object) aVar.c);
                    TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "renderError", jSONObject2);
                    TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "onRenderError", jSONObject2);
                }
            }
        });
        this.mWidgetInstance.registerWidgetExceptionListener(new TRWidgetInstance.c() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.c
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("errorCode", (Object) str);
                jSONObject2.put("errorMsg", (Object) str2);
                TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "jsError", jSONObject2);
            }
        });
        this.mWidgetInstance.registerWidgetInitListener(new TRWidgetInstance.d() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.d
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else {
                    TRWidgetWVEmbedView.access$300(TRWidgetWVEmbedView.this, z);
                }
            }
        });
        this.mWidgetInstance.registerWidgetMonitorListener(new TRWidgetInstance.f() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView.6
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
                TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "apicall", jSONObject3);
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
                    TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "widgetclick", jSONObject2);
                }
            }

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.f
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                } else {
                    TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "widgettouch", jSONObject2);
                }
            }
        });
        this.mRootView = new com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer(this.mActivity, cbs.a(this.mStartParams));
        ((com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer) this.mRootView).setWidget(this.mWidgetInstance);
        this.mWidgetInstance.setRootContainer((com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer) this.mRootView);
        this.mWidgetInstance.render(this.mStartParams);
    }

    private void sendWidgetInit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd03fd91", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) this.mId);
        jSONObject.put("display", (Object) Boolean.valueOf(z));
        sendEventToJS("widgetInit", jSONObject);
        sendEventToJS("onWidgetInit", jSONObject);
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
        cbr.a(renderContainer, this.mWeexInstance, str, new cbr.a() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView.7
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
                TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "renderError", jSONObject);
                TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "onRenderError", jSONObject);
            }
        });
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
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

    @Override // android.taobao.windvane.jsbridge.e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
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

    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
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
