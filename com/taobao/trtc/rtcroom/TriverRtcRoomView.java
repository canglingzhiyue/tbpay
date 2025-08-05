package com.taobao.trtc.rtcroom;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.Toast;
import anet.channel.util.ErrorConstant;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVAccountService;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.adapter.internal.CommonCode;
import com.taobao.search.common.util.i;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.impl.PermissionActivity;
import com.taobao.trtc.rtcroom.a;
import com.taobao.trtc.utils.TrtcLog;
import com.uc.webview.base.cyclone.BSError;
import com.uc.webview.export.media.MessageID;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes9.dex */
public class TriverRtcRoomView extends BaseEmbedView implements b, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PERMISSION_REQUEST_CODE_FOR_RTC_ROOM = 125;
    private static final String TAG;
    private int activityCount;
    private Stack<Activity> activityStack;
    private a floatWindowController;
    private String mCachedChannelId;
    private String mCachedExtension;
    private String mCachedUrl;
    private BroadcastReceiver mNetworkReceiver;
    private d mRoomParams;
    private FrameLayout mRootView;
    private c mRtcRoom;
    private int mViewHeight;
    private int mViewWidth;
    public PowerManager.WakeLock mWakeLock;
    private boolean needRenewFloatingWindow;
    private g wakeLock;
    private WeakReference<Context> mContextRef = new WeakReference<>(null);
    private final AtomicBoolean mRtcRoomRunning = new AtomicBoolean(false);
    private boolean needRequestOverlayPermission = true;

    public static /* synthetic */ Object ipc$super(TriverRtcRoomView triverRtcRoomView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1599984620:
                super.onSurfaceAvailable((Surface) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (ValueCallback) objArr[3]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1419343038:
                return new Boolean(super.onSurfaceDestroyed((Surface) objArr[0]));
            case -470667784:
                super.onSurfaceSizeChanged((Surface) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 1664325763:
                super.onCreate((Map) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : "rtc-room";
    }

    public static /* synthetic */ Stack access$000(TriverRtcRoomView triverRtcRoomView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Stack) ipChange.ipc$dispatch("bb031fcc", new Object[]{triverRtcRoomView}) : triverRtcRoomView.activityStack;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : TAG;
    }

    public static /* synthetic */ int access$200(TriverRtcRoomView triverRtcRoomView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad4954f4", new Object[]{triverRtcRoomView})).intValue() : triverRtcRoomView.activityCount;
    }

    public static /* synthetic */ int access$208(TriverRtcRoomView triverRtcRoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b9e63ec", new Object[]{triverRtcRoomView})).intValue();
        }
        int i = triverRtcRoomView.activityCount;
        triverRtcRoomView.activityCount = i + 1;
        return i;
    }

    public static /* synthetic */ int access$210(TriverRtcRoomView triverRtcRoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acd2eef5", new Object[]{triverRtcRoomView})).intValue();
        }
        int i = triverRtcRoomView.activityCount;
        triverRtcRoomView.activityCount = i - 1;
        return i;
    }

    public static /* synthetic */ boolean access$300(TriverRtcRoomView triverRtcRoomView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9ef2fb24", new Object[]{triverRtcRoomView})).booleanValue() : triverRtcRoomView.needRenewFloatingWindow;
    }

    public static /* synthetic */ boolean access$302(TriverRtcRoomView triverRtcRoomView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e804fba", new Object[]{triverRtcRoomView, new Boolean(z)})).booleanValue();
        }
        triverRtcRoomView.needRenewFloatingWindow = z;
        return z;
    }

    public static /* synthetic */ void access$400(TriverRtcRoomView triverRtcRoomView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c99949", new Object[]{triverRtcRoomView, str});
        } else {
            triverRtcRoomView.startFloatingWindow(str);
        }
    }

    public static /* synthetic */ boolean access$500(TriverRtcRoomView triverRtcRoomView, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53795ac", new Object[]{triverRtcRoomView, str})).booleanValue() : triverRtcRoomView.stopFloatingWindow(str);
    }

    public static /* synthetic */ boolean access$602(TriverRtcRoomView triverRtcRoomView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("921a8fd", new Object[]{triverRtcRoomView, new Boolean(z)})).booleanValue();
        }
        triverRtcRoomView.needRequestOverlayPermission = z;
        return z;
    }

    static {
        kge.a(-1009303929);
        kge.a(1028243835);
        kge.a(-1528854514);
        TAG = TriverRtcRoomView.class.getName();
    }

    @Override // com.taobao.trtc.rtcroom.b
    public void onMiniWindowClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586a06e8", new Object[]{this});
        } else if (this.mOuterPage.getPageContext() == null) {
        } else {
            Activity activity = this.mOuterPage.getPageContext().getActivity();
            Iterator<Activity> it = this.activityStack.iterator();
            while (it.hasNext()) {
                Activity next = it.next();
                String str = TAG;
                TrtcLog.d(str, "activity stack: " + next.getLocalClassName());
                if (!next.getLocalClassName().equals(activity.getLocalClassName()) || !next.equals(activity) || next.hashCode() != activity.hashCode()) {
                    String str2 = TAG;
                    TrtcLog.d(str2, "finish activity: " + next.getLocalClassName());
                    next.finish();
                }
            }
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        TrtcLog.d(TAG, i.b.MEASURE_ONCREATE);
        super.onCreate(map);
        PageContext pageContext = this.mOuterPage.getPageContext();
        if (pageContext == null || pageContext.getActivity() == null) {
            TrtcLog.a(TAG, "onCreate error for no activity");
            return;
        }
        this.needRenewFloatingWindow = false;
        this.activityCount = 1;
        this.activityStack = new Stack<>();
        this.activityStack.add(pageContext.getActivity());
        this.mOuterPage.getPageContext().getActivity().getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.trtc.rtcroom.TriverRtcRoomView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                } else {
                    TriverRtcRoomView.access$000(TriverRtcRoomView.this).add(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                    return;
                }
                String access$100 = TriverRtcRoomView.access$100();
                TrtcLog.d(access$100, "onActivityStarted: activity: " + activity.getLocalClassName());
                if (TriverRtcRoomView.access$200(TriverRtcRoomView.this) == 0 && TriverRtcRoomView.access$300(TriverRtcRoomView.this)) {
                    TriverRtcRoomView.access$302(TriverRtcRoomView.this, false);
                    TriverRtcRoomView.access$400(TriverRtcRoomView.this, "renew");
                }
                TriverRtcRoomView.access$208(TriverRtcRoomView.this);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                    return;
                }
                TriverRtcRoomView.access$210(TriverRtcRoomView.this);
                if (TriverRtcRoomView.access$200(TriverRtcRoomView.this) != 0) {
                    return;
                }
                TriverRtcRoomView triverRtcRoomView = TriverRtcRoomView.this;
                TriverRtcRoomView.access$302(triverRtcRoomView, TriverRtcRoomView.access$500(triverRtcRoomView, "background"));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                } else {
                    TriverRtcRoomView.access$000(TriverRtcRoomView.this).remove(activity);
                }
            }
        });
        this.mContextRef = new WeakReference<>(pageContext.getActivity());
        c cVar = this.mRtcRoom;
        if (cVar != null) {
            cVar.d();
            this.mRtcRoom = null;
        }
        this.mRtcRoom = new c(this.mContextRef.get(), this);
        this.wakeLock = new g(this.mContextRef.get());
        this.wakeLock.a();
        regNetworkReceiver();
        this.needRequestOverlayPermission = true;
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TrtcLog.d(TAG, MessageID.onDestroy);
        g gVar = this.wakeLock;
        if (gVar != null) {
            gVar.b();
        }
        unRegNetworkReceiver();
        Stack<Activity> stack = this.activityStack;
        if (stack != null) {
            stack.clear();
            this.activityStack = null;
        }
        a aVar = this.floatWindowController;
        if (aVar != null) {
            aVar.b("destory");
            this.floatWindowController.a();
            this.floatWindowController = null;
        }
        if (this.mRootView != null) {
            try {
                if (this.mRtcRoom.e() != null) {
                    this.mRootView.removeView(this.mRtcRoom.e());
                }
            } catch (Exception unused) {
            }
            TrtcLog.d(TAG, "destory root view");
            this.mRootView = null;
        }
        if (this.mRtcRoom != null) {
            this.mRtcRoomRunning.set(false);
            this.mRtcRoom.d();
            this.mRtcRoom = null;
            TrtcLog.d(TAG, "destory mRtcRoom");
        }
        super.onDestroy();
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void sendEvent(String str, JSONObject jSONObject, final IEmbedCallback iEmbedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b74017", new Object[]{this, str, jSONObject, iEmbedCallback});
        } else if (this.mOuterPage == null) {
            TrtcLog.a(TAG, "You should call super.onCreate first!!!");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            if (!str.equals(RVEvents.ON_TO_WEBVIEW_MESSAGE)) {
                str = "nbcomponent." + getType() + "." + str;
            }
            if (jSONObject != null) {
                jSONObject.put(BindingXConstants.KEY_ELEMENT, (Object) this.mViewId);
                jSONObject2.put("data", (Object) jSONObject);
            }
            Render render = this.mOuterPage.getRender();
            Worker workerById = render.getEngine().getEngineRouter().getWorkerById(EngineUtils.getWorkerId(render));
            TrtcLog.b(TAG, " event: " + str + " " + jSONObject2.toJSONString());
            EngineUtils.sendToRender(render, workerById, str, jSONObject2, new SendToRenderCallback() { // from class: com.taobao.trtc.rtcroom.TriverRtcRoomView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
                public void onCallBack(JSONObject jSONObject3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("99ed7a65", new Object[]{this, jSONObject3});
                        return;
                    }
                    IEmbedCallback iEmbedCallback2 = iEmbedCallback;
                    if (iEmbedCallback2 == null) {
                        return;
                    }
                    iEmbedCallback2.onResponse(jSONObject3);
                }
            });
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        this.mViewWidth = i;
        this.mViewHeight = i2;
        String str3 = TAG;
        com.taobao.trtc.utils.h.a(str3, "getView, size: " + i + "x" + i2 + ", viewId:" + str);
        if (this.mContextRef.get() != null) {
            this.mRootView = new FrameLayout(this.mContextRef.get());
        }
        if (this.mRtcRoom != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
            layoutParams.width = this.mViewWidth;
            layoutParams.height = this.mViewHeight;
            layoutParams.gravity = 17;
            this.mRootView.addView(this.mRtcRoom.e(), layoutParams);
            TrtcLog.d(TAG, "Add remote view to root views");
        }
        return this.mRootView;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
            return;
        }
        String str2 = TAG;
        TrtcLog.b(str2, "RecvMsg <<< " + str + " | data: " + jSONObject.toJSONString());
        if (!this.mRtcRoomRunning.get() || TextUtils.isEmpty(str)) {
            TrtcLog.a(TAG, "ignore this msg");
            return;
        }
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -812688397:
                    if (str.equals("showFloatingWindow")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3363353:
                    if (str.equals("mute")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        c = 0;
                        break;
                    }
                    break;
                case 187985561:
                    if (str.equals("audioMode")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                start(jSONObject);
            } else if (c == 1) {
                stop(jSONObject);
            } else if (c == 2) {
                mute(jSONObject);
            } else if (c == 3) {
                setAudioMode(jSONObject);
            } else if (c == 4) {
                setFloatingWindow(jSONObject);
            } else {
                String str3 = TAG;
                TrtcLog.d(str3, "action: " + str + " not implemented");
            }
        } catch (Throwable th) {
            String str4 = TAG;
            TrtcLog.a(str4, "exception when process msg: " + th.getMessage());
            th.printStackTrace();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("fail", "true");
            bridgeCallback.sendJSONResponse(jSONObject2);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
            return;
        }
        TrtcLog.d(TAG, "onReceivedRender");
        if (jSONObject == null || jSONObject.size() == 0) {
            return;
        }
        parseRtcRoomParams(jSONObject);
        if (!checkRtcRoomParams(this.mRoomParams)) {
            sendError(-103, "rtc room params invalid");
        } else {
            initRtcRoom();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
            return;
        }
        TrtcLog.d(TAG, "onWebViewResume");
        g gVar = this.wakeLock;
        if (gVar != null) {
            gVar.a();
        }
        stopFloatingWindow("resumeWebView");
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
            return;
        }
        TrtcLog.d(TAG, "onWebViewPause");
        g gVar = this.wakeLock;
        if (gVar == null) {
            return;
        }
        gVar.b();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        } else {
            TrtcLog.d(TAG, "onAttachedToWebView");
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        } else {
            TrtcLog.d(TAG, "onDetachedToWebView");
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public boolean onSurfaceDestroyed(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab668b42", new Object[]{this, surface})).booleanValue();
        }
        TrtcLog.d(TAG, "onSurfaceDestroyed");
        return super.onSurfaceDestroyed(surface);
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onSurfaceAvailable(Surface surface, int i, int i2, ValueCallback<Integer> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a22c14", new Object[]{this, surface, new Integer(i), new Integer(i2), valueCallback});
            return;
        }
        TrtcLog.d(TAG, "onSurfaceAvailable");
        super.onSurfaceAvailable(surface, i, i2, valueCallback);
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onSurfaceSizeChanged(Surface surface, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f22df8", new Object[]{this, surface, new Integer(i), new Integer(i2)});
            return;
        }
        TrtcLog.d(TAG, "onSurfaceSizeChanged");
        super.onSurfaceSizeChanged(surface, i, i2);
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        } else if (i == 125) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    if (strArr[0].equals("android.permission.RECORD_AUDIO")) {
                        Toast.makeText(this.mContextRef.get(), "权限不足, 请打开录音权限", 0).show();
                        sendError(-105, "audio permission error");
                        return;
                    } else if (strArr[0].equals(com.taobao.speech.util.e.CAMERA)) {
                        Toast.makeText(this.mContextRef.get(), "权限不足, 请打开摄像头权限", 0).show();
                        sendError(-104, "video permission error");
                        return;
                    }
                }
            }
            TrtcLog.d(TAG, "permission granted, init rtc room");
            c cVar = this.mRtcRoom;
            if (cVar == null) {
                return;
            }
            cVar.a(this.mCachedChannelId, this.mCachedExtension);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
            return;
        }
        String str = TAG;
        TrtcLog.d(str, "onEmbedViewVisibilityChanged, i: " + i);
    }

    private void initRtcRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eafac633", new Object[]{this});
        } else if (!this.mRtcRoom.a(this.mRoomParams)) {
            sendError(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "rtc room init error");
        } else {
            this.mRtcRoomRunning.set(true);
            TrtcLog.d(TAG, "rtc room init success");
        }
    }

    private void parseRtcRoomParams(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411b491a", new Object[]{this, jSONObject});
            return;
        }
        this.mRoomParams = new d();
        this.mRoomParams.j = new a.C0992a();
        try {
            this.mRoomParams.b = com.taobao.trtc.utils.a.a(jSONObject, "appId", "21646297");
            this.mRoomParams.d = com.taobao.trtc.utils.a.a(jSONObject, "userId");
            this.mRoomParams.c = com.taobao.trtc.utils.a.a(jSONObject, "roomId");
            this.mRoomParams.h = com.taobao.trtc.utils.a.a(jSONObject, "enableCamera", false);
            this.mRoomParams.f = com.taobao.trtc.utils.a.a(jSONObject, SPManager.FPS_KEY, 20);
            this.mRoomParams.g = com.taobao.trtc.utils.a.a(jSONObject, CommonCode.MapKey.HAS_RESOLUTION, 2);
            this.mRoomParams.i = com.taobao.trtc.utils.a.a(jSONObject, "mute", false);
            JSONObject jSONObject3 = jSONObject.getJSONObject("extraInfo");
            if (jSONObject3 != null) {
                this.mRoomParams.f23167a = com.taobao.trtc.utils.a.a(jSONObject3, "bizName", "tmsp_chat");
                this.mRoomParams.e = com.taobao.trtc.utils.a.a(jSONObject3, "bizId", "");
                jSONObject2 = jSONObject3.getJSONObject("floatViewFormat");
            } else {
                this.mRoomParams.f23167a = "tmsp_chat";
                String str = TAG;
                TrtcLog.d(str, "use default service name: " + this.mRoomParams.f23167a);
                jSONObject2 = null;
            }
            this.mRoomParams.j.f23162a = com.taobao.trtc.utils.a.a(jSONObject2, "width", dip2px(this.mContextRef.get(), 96.0f));
            this.mRoomParams.j.b = com.taobao.trtc.utils.a.a(jSONObject2, "height", dip2px(this.mContextRef.get(), 173.0f));
            this.mRoomParams.j.c = dip2px(this.mContextRef.get(), 12.0f);
            this.mRoomParams.j.d = dip2px(this.mContextRef.get(), this.mRoomParams.j.b / 2.0f);
            this.mRoomParams.j.e = com.taobao.trtc.utils.a.a(jSONObject2, "margin", dip2px(this.mContextRef.get(), 12.0f));
            this.mRoomParams.j.h = dip2px(this.mContextRef.get(), com.taobao.trtc.utils.a.a(jSONObject2, "radius", 0));
            this.mRoomParams.j.f = com.taobao.trtc.utils.a.a(jSONObject2, "borderColor", (int) a.DEFAULT_FLOATING_WINDOW_BORDER_COLOR);
            this.mRoomParams.j.g = com.taobao.trtc.utils.a.a(jSONObject2, "borderWidth", 0);
            this.mRoomParams.j.i = com.taobao.trtc.utils.a.a(jSONObject2, "closeDiameter", dip2px(this.mContextRef.get(), 18.0f));
            this.mRoomParams.j.j = com.taobao.trtc.utils.a.a(jSONObject2, "closeMargin", dip2px(this.mContextRef.get(), 6.0f));
            if (TextUtils.isEmpty(this.mRoomParams.d)) {
                this.mRoomParams.d = ((RVAccountService) RVProxy.get(RVAccountService.class)).getUserId(null);
                String str2 = TAG;
                TrtcLog.d(str2, "get user id by RVProxy: " + this.mRoomParams.d);
            }
        } catch (Exception e) {
            String str3 = TAG;
            TrtcLog.a(str3, "Exception when parseRtcRoomParams: " + e.getMessage());
        }
        String str4 = TAG;
        com.taobao.trtc.utils.h.a(str4, "rtc room params: " + this.mRoomParams.a());
    }

    private boolean checkRtcRoomParams(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19faa322", new Object[]{this, dVar})).booleanValue() : !TextUtils.isEmpty(dVar.f23167a) && !TextUtils.isEmpty(dVar.d) && !TextUtils.isEmpty(dVar.b);
    }

    private boolean checkPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fc70e02", new Object[]{this})).booleanValue();
        }
        if (this.mContextRef.get() != null) {
            ArrayList arrayList = new ArrayList();
            if (ActivityCompat.checkSelfPermission(this.mContextRef.get(), "android.permission.RECORD_AUDIO") != 0) {
                arrayList.add("android.permission.RECORD_AUDIO");
            }
            if (!arrayList.isEmpty()) {
                String str = TAG;
                TrtcLog.d(str, "request permission: " + arrayList.toString());
                ActivityCompat.requestPermissions((Activity) this.mContextRef.get(), (String[]) arrayList.toArray(new String[0]), 125);
                return false;
            }
        }
        return true;
    }

    private void regNetworkReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a4b710", new Object[]{this});
            return;
        }
        if (this.mNetworkReceiver != null) {
            unRegNetworkReceiver();
        }
        this.mNetworkReceiver = new BroadcastReceiver() { // from class: com.taobao.trtc.rtcroom.TriverRtcRoomView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                int i = 2;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (!intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                } else {
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    int type = activeNetworkInfo != null ? activeNetworkInfo.getType() : -1;
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        i = 0;
                    } else if (type != 0 && type == 1) {
                        i = 1;
                    }
                    TriverRtcRoomView.this.sendNetType(i);
                }
            }
        };
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.mContextRef.get().registerReceiver(this.mNetworkReceiver, intentFilter);
            TrtcLog.d(TAG, "reg network receiver");
        } catch (Exception e) {
            String str = TAG;
            TrtcLog.a(str, "exceiton when reg receiver: " + e.getMessage());
        }
    }

    private void unRegNetworkReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f38909", new Object[]{this});
        } else if (this.mNetworkReceiver == null) {
        } else {
            try {
                this.mContextRef.get().unregisterReceiver(this.mNetworkReceiver);
                this.mNetworkReceiver = null;
                TrtcLog.d(TAG, "unreg network receiver");
            } catch (Exception e) {
                String str = TAG;
                TrtcLog.a(str, "exception when unreg receiver: " + e.getMessage());
            }
        }
    }

    private void start(JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb595427", new Object[]{this, jSONObject});
            return;
        }
        String str3 = null;
        if (jSONObject != null) {
            str = jSONObject.containsKey("roomId") ? com.taobao.trtc.utils.a.a(jSONObject, "roomId") : null;
            str2 = jSONObject.containsKey(TrtcConstants.TRTC_PARAMS_EXTENSION) ? com.taobao.trtc.utils.a.a(jSONObject, TrtcConstants.TRTC_PARAMS_EXTENSION) : null;
            if (jSONObject.containsKey("url")) {
                str3 = com.taobao.trtc.utils.a.a(jSONObject, "url");
            }
        } else {
            str = null;
            str2 = null;
        }
        this.mCachedUrl = str3;
        TrtcLog.d(TAG, "Start with url: " + str3);
        if (!checkPermission()) {
            TrtcLog.d(TAG, "Cached start params for permission request, roomId: " + str + ", extension: " + str2);
            this.mCachedChannelId = str;
            this.mCachedExtension = str2;
            return;
        }
        c cVar = this.mRtcRoom;
        if (cVar == null) {
            return;
        }
        cVar.a(str, str2);
    }

    private void stop(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832dd487", new Object[]{this, jSONObject});
            return;
        }
        c cVar = this.mRtcRoom;
        if (cVar == null) {
            return;
        }
        cVar.g();
    }

    private void mute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d02dcd0", new Object[]{this, jSONObject});
        } else if (this.mRtcRoom == null || !jSONObject.containsKey(MusLiveVideo.ATTR_MUTE)) {
        } else {
            this.mRtcRoom.b(com.taobao.trtc.utils.a.a(jSONObject, MusLiveVideo.ATTR_MUTE, false));
        }
    }

    private void setAudioMode(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153b3d52", new Object[]{this, jSONObject});
        } else if (jSONObject == null || !jSONObject.containsKey("mode")) {
        } else {
            int a2 = com.taobao.trtc.utils.a.a(jSONObject, "mode", 2);
            c cVar = this.mRtcRoom;
            if (cVar == null) {
                return;
            }
            if (a2 > 0 && a2 <= 4) {
                cVar.c(a2);
            } else if (a2 == 5) {
                startFloatingWindow("api");
            } else if (a2 == 6) {
                stopFloatingWindow("api");
            } else if (a2 != 7) {
            } else {
                checkOverlayPermission();
            }
        }
    }

    private void setFloatingWindow(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f7939b1", new Object[]{this, jSONObject});
        } else if (jSONObject == null || !jSONObject.containsKey("isShow")) {
        } else {
            if (com.taobao.trtc.utils.a.a(jSONObject, "isShow", false)) {
                startFloatingWindow("api");
            } else {
                stopFloatingWindow("api");
            }
        }
    }

    private void startFloatingWindow(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc3a929", new Object[]{this, str});
            return;
        }
        if (this.floatWindowController == null) {
            this.floatWindowController = new a((Activity) this.mContextRef.get(), this.mRtcRoom, this);
            this.floatWindowController.a(this.mRoomParams.j);
        }
        if (!PermissionActivity.a(this.mContextRef.get())) {
            if (!this.needRequestOverlayPermission) {
                sendError(ErrorConstant.ERROR_OKHTTP_RESPONSE_ERROR, "Overlay Permission invalid");
                return;
            } else {
                requestOverlayPermission(new PermissionActivity.a() { // from class: com.taobao.trtc.rtcroom.-$$Lambda$TriverRtcRoomView$-9Qc9-LICteulo-20PZACfqEMP0
                    @Override // com.taobao.trtc.impl.PermissionActivity.a
                    public final void onPermissionResult(boolean z, Intent intent) {
                        TriverRtcRoomView.this.lambda$startFloatingWindow$0$TriverRtcRoomView(str, z, intent);
                    }
                });
                return;
            }
        }
        this.floatWindowController.a(str);
    }

    public /* synthetic */ void lambda$startFloatingWindow$0$TriverRtcRoomView(String str, boolean z, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b12439", new Object[]{this, str, new Boolean(z), intent});
            return;
        }
        String str2 = TAG;
        com.taobao.trtc.utils.h.a(str2, "OverlayPermission result: " + z);
        if (z) {
            this.floatWindowController.a(str);
        } else {
            this.needRequestOverlayPermission = false;
        }
    }

    private boolean stopFloatingWindow(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f22d9ccd", new Object[]{this, str})).booleanValue();
        }
        a aVar = this.floatWindowController;
        if (aVar == null) {
            return false;
        }
        return aVar.b(str);
    }

    private void checkOverlayPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e776f1e", new Object[]{this});
        } else if (!PermissionActivity.a(this.mContextRef.get())) {
            requestOverlayPermission(new PermissionActivity.a() { // from class: com.taobao.trtc.rtcroom.TriverRtcRoomView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.trtc.impl.PermissionActivity.a
                public void onPermissionResult(boolean z, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b6de50ff", new Object[]{this, new Boolean(z), intent});
                    } else if (z) {
                        TriverRtcRoomView.this.sendAudioMode(8);
                    } else {
                        TriverRtcRoomView.access$602(TriverRtcRoomView.this, false);
                        TriverRtcRoomView.this.sendError(ErrorConstant.ERROR_OKHTTP_RESPONSE_ERROR, "Overlay Permission invalid");
                    }
                }
            });
        } else {
            sendAudioMode(8);
        }
    }

    private void requestOverlayPermission(PermissionActivity.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e8d18f", new Object[]{this, aVar});
            return;
        }
        try {
            TrtcLog.d(TAG, "start permission activity");
            PermissionActivity.a(aVar);
            Intent intent = new Intent(this.mContextRef.get(), PermissionActivity.class);
            intent.addFlags(268435456);
            intent.putExtra(PermissionActivity.PERMISSION_TYPE_OVERLAY, true);
            this.mContextRef.get().startActivity(intent);
        } catch (Exception e) {
            String str = TAG;
            TrtcLog.a(str, "start permission activity e: " + e.getMessage());
        }
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void sendEventOnUiThread(final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d5c7f50", new Object[]{this, str, jSONObject});
            return;
        }
        String str2 = TAG;
        com.taobao.trtc.utils.h.a(str2, "SendEvent >>> " + str + " | data: " + jSONObject.toJSONString());
        if (this.mContextRef.get() == null) {
            return;
        }
        ((Activity) this.mContextRef.get()).runOnUiThread(new Runnable() { // from class: com.taobao.trtc.rtcroom.TriverRtcRoomView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TriverRtcRoomView.this.sendEvent(str, jSONObject, null);
                }
            }
        });
    }

    @Override // com.taobao.trtc.rtcroom.b
    public void sendError(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1f36c6", new Object[]{this, new Integer(i), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", (Object) Integer.valueOf(i));
        jSONObject.put("errorMessage", (Object) str);
        sendEventOnUiThread("error", jSONObject);
    }

    public void sendNetType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc672ed", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("network", (Object) Integer.valueOf(i));
        sendEventOnUiThread("networkType", jSONObject);
    }

    @Override // com.taobao.trtc.rtcroom.b
    public void sendNetStat(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0379be4", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("quality", (Object) (z ? "normal" : "low"));
        jSONObject.put("isLocal", (Object) true);
        sendEventOnUiThread("networkQuality", jSONObject);
    }

    @Override // com.taobao.trtc.rtcroom.b
    public void sendAudioMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d48160b", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mode", (Object) Integer.valueOf(i));
        sendEventOnUiThread("audioPlayoutMode", jSONObject);
    }

    @Override // com.taobao.trtc.rtcroom.b
    public void sendRemoteJoin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48f58c9", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("users", (Object) str);
        sendEventOnUiThread("participantEnter", jSONObject);
    }

    @Override // com.taobao.trtc.rtcroom.b
    public void sendRemoteLeave(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52dda84", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("users", (Object) str);
        sendEventOnUiThread("participantLeave", jSONObject);
    }

    @Override // com.taobao.trtc.rtcroom.b
    public void sendEnterRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f31032", new Object[]{this});
        } else {
            sendEventOnUiThread("enterRoom", new JSONObject());
        }
    }

    @Override // com.taobao.trtc.rtcroom.b
    public void sendLeaveRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b70911", new Object[]{this});
        } else {
            sendEventOnUiThread("leaveRoom", new JSONObject());
        }
    }

    @Override // com.taobao.trtc.rtcroom.b
    public void sendFirstRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d447cf", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", (Object) str);
        sendEventOnUiThread("firstRender", jSONObject);
    }
}
