package com.taobao.cameralink.miniapp.arcamera;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.tb3dspace.util.TB3DSpace;
import com.taobao.cameralink.manager.Utils;
import com.taobao.cameralink.miniapp.MiniAppContainerView;
import com.taobao.cameralink.miniapp.a;
import com.taobao.cameralink.miniapp.b;
import com.taobao.cameralink.miniapp.c;
import com.taobao.cameralink.miniapp.skincamera.AbsCLBaseEmbedView;
import com.taobao.speech.util.e;
import java.util.Map;
import java.util.Objects;
import tb.cal;
import tb.kfq;
import tb.kfr;
import tb.kge;

/* loaded from: classes6.dex */
public class EmbedARCameraView extends AbsCLBaseEmbedView implements c, kfr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BODYETECTION_BIZ_NAME = "bodyDetection";
    private static final String FACEDETECTION2D_BIZ_NAME = "faceDetection2D";
    private static final String HANDETECTION_BIZ_NAME = "handDetection";
    private static final String IMU_BIZ_NAME = "motionTracking";
    private static final String MARK_BIZ_NAME = "imageTracking";
    private static final String OT_BIZ_NAME = "orientationTracking";
    private static final String TAG = "EmbedARCameraView";
    public static final String TYPE = "ar-camera";
    private volatile b currentBiz;
    private JSONObject currentParam;
    private MiniAppContainerView mCameraViewContainer;
    private a mFaceDetect2DImpl;
    private BroadcastReceiver mTb3dSpaceInstallReceiver;
    private Handler mWorkerHandler;
    private HandlerThread mWorkerThread;
    private boolean isFrontCamera = false;
    private boolean mIsStarted = false;

    static {
        kge.a(1449064285);
        kge.a(-1663495502);
        kge.a(934369567);
    }

    public static /* synthetic */ Object ipc$super(EmbedARCameraView embedARCameraView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 1664325763) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Map) objArr[0]);
            return null;
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : TYPE;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(EmbedARCameraView embedARCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed384c29", new Object[]{embedARCameraView});
        } else {
            embedARCameraView.reaalStartInit();
        }
    }

    public static /* synthetic */ a access$100(EmbedARCameraView embedARCameraView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4a6d58fc", new Object[]{embedARCameraView}) : embedARCameraView.mFaceDetect2DImpl;
    }

    public static /* synthetic */ a access$102(EmbedARCameraView embedARCameraView, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c58c85c8", new Object[]{embedARCameraView, aVar});
        }
        embedARCameraView.mFaceDetect2DImpl = aVar;
        return aVar;
    }

    public static /* synthetic */ boolean access$200(EmbedARCameraView embedARCameraView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88b73c2f", new Object[]{embedARCameraView})).booleanValue() : embedARCameraView.isFrontCamera;
    }

    public static /* synthetic */ MiniAppContainerView access$300(EmbedARCameraView embedARCameraView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MiniAppContainerView) ipChange.ipc$dispatch("6180477b", new Object[]{embedARCameraView}) : embedARCameraView.mCameraViewContainer;
    }

    public static /* synthetic */ Page access$400(EmbedARCameraView embedARCameraView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Page) ipChange.ipc$dispatch("ab06b2c9", new Object[]{embedARCameraView}) : embedARCameraView.mOuterPage;
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        super.onCreate(map);
        try {
            Utils.setApplication(((AppContext) Objects.requireNonNull(this.mOuterApp.getAppContext())).getContext());
            this.mWorkerThread = new HandlerThread("ARCameraFrameThread");
            this.mWorkerThread.start();
            this.mWorkerHandler = new Handler(this.mWorkerThread.getLooper());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.kfr
    public void post(Runnable runnable) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
        } else if (this.mWorkerHandler == null || !this.mWorkerThread.isAlive()) {
        } else {
            if (Thread.currentThread() == this.mWorkerThread) {
                runnable.run();
            } else {
                this.mWorkerHandler.post(runnable);
            }
        }
    }

    private void startBizByParam() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af7a21ec", new Object[]{this});
        } else if (this.mIsStarted) {
        } else {
            this.mIsStarted = true;
            if (!kfq.a()) {
                if (this.mTb3dSpaceInstallReceiver == null) {
                    this.mTb3dSpaceInstallReceiver = new BroadcastReceiver() { // from class: com.taobao.cameralink.miniapp.arcamera.EmbedARCameraView.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                            } else if (intent == null || !"TB3DSPACE_INSTALL_SUCCESS".equals(intent.getAction())) {
                            } else {
                                EmbedARCameraView.this.startBizByParamInit();
                            }
                        }
                    };
                    LocalBroadcastManager.getInstance(this.mCameraViewContainer.getContext()).registerReceiver(this.mTb3dSpaceInstallReceiver, new IntentFilter("TB3DSPACE_INSTALL_SUCCESS"));
                }
                Nav.from(this.mCameraViewContainer.getContext()).toUri("https://go/installxrspace3d");
                return;
            }
            startBizByParamInit();
        }
    }

    public void startBizByParamInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b25a89c", new Object[]{this});
        } else {
            TB3DSpace.initSkinDetect(new cal() { // from class: com.taobao.cameralink.miniapp.arcamera.EmbedARCameraView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cal
                public void onComplete(boolean z, org.json.JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f409ee9", new Object[]{this, new Boolean(z), jSONObject});
                    } else if (!z) {
                    } else {
                        EmbedARCameraView.access$000(EmbedARCameraView.this);
                    }
                }
            });
        }
    }

    private void reaalStartInit() {
        IpChange ipChange = $ipChange;
        final boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71156360", new Object[]{this});
            return;
        }
        try {
            if (this.currentParam.containsKey("devicePosition")) {
                this.isFrontCamera = "front".equals(this.currentParam.getString("devicePosition"));
            }
            try {
                if (this.currentParam.containsKey("useCapturedImage")) {
                    z = this.currentParam.getBoolean("useCapturedImage").booleanValue();
                }
            } catch (Throwable unused) {
            }
            requestPermission(this.mOuterPage.getPageContext().getActivity(), new Runnable() { // from class: com.taobao.cameralink.miniapp.arcamera.-$$Lambda$EmbedARCameraView$7Mqw5h2yXALuoSzsTyjJtD7a4EI
                {
                    EmbedARCameraView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EmbedARCameraView.this.lambda$reaalStartInit$1$EmbedARCameraView(z);
                }
            }, e.CAMERA, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public /* synthetic */ void lambda$reaalStartInit$1$EmbedARCameraView(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a9042a", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            post(new Runnable() { // from class: com.taobao.cameralink.miniapp.arcamera.-$$Lambda$EmbedARCameraView$anR1T8rhZRcH66kkzNeQ4ZledJI
                {
                    EmbedARCameraView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EmbedARCameraView.this.lambda$reaalStartInit$0$EmbedARCameraView(z);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public /* synthetic */ void lambda$reaalStartInit$0$EmbedARCameraView(final boolean z) {
        IpChange ipChange = $ipChange;
        char c = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f42b8b", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            String string = this.currentParam.getString("mode");
            if (string == null) {
                return;
            }
            switch (string.hashCode()) {
                case -1658216142:
                    if (string.equals(MARK_BIZ_NAME)) {
                        break;
                    }
                    c = 65535;
                    break;
                case -1650677593:
                    if (string.equals(OT_BIZ_NAME)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 29387002:
                    if (string.equals(FACEDETECTION2D_BIZ_NAME)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 358558861:
                    if (string.equals(IMU_BIZ_NAME)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1054422742:
                    if (string.equals(HANDETECTION_BIZ_NAME)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1284859651:
                    if (string.equals(BODYETECTION_BIZ_NAME)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0 && c != 1 && c != 2 && c == 3) {
                this.mCameraViewContainer.post(new Runnable() { // from class: com.taobao.cameralink.miniapp.arcamera.EmbedARCameraView.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        EmbedARCameraView.access$102(EmbedARCameraView.this, new a());
                        EmbedARCameraView.access$100(EmbedARCameraView.this).a(EmbedARCameraView.access$200(EmbedARCameraView.this));
                        EmbedARCameraView.access$100(EmbedARCameraView.this).b(z);
                        EmbedARCameraView.access$100(EmbedARCameraView.this).a(EmbedARCameraView.access$300(EmbedARCameraView.this), EmbedARCameraView.access$400(EmbedARCameraView.this).getPageContext().getActivity(), EmbedARCameraView.this);
                        EmbedARCameraView.access$100(EmbedARCameraView.this).c();
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void stopCurrentBiz() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585e5903", new Object[]{this});
        } else {
            post(new Runnable() { // from class: com.taobao.cameralink.miniapp.arcamera.-$$Lambda$EmbedARCameraView$8tsmzh-mn8d-oP9tI2vbbU868fQ
                {
                    EmbedARCameraView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EmbedARCameraView.this.lambda$stopCurrentBiz$2$EmbedARCameraView();
                }
            });
        }
    }

    public /* synthetic */ void lambda$stopCurrentBiz$2$EmbedARCameraView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed5c4e", new Object[]{this});
            return;
        }
        try {
            String string = this.currentParam.getString("mode");
            if (string == null) {
                return;
            }
            switch (string.hashCode()) {
                case -1658216142:
                    if (!string.equals(MARK_BIZ_NAME)) {
                        return;
                    }
                    return;
                case -1650677593:
                    if (!string.equals(OT_BIZ_NAME)) {
                        return;
                    }
                    return;
                case 29387002:
                    if (!string.equals(FACEDETECTION2D_BIZ_NAME)) {
                        return;
                    }
                    return;
                case 358558861:
                    if (!string.equals(IMU_BIZ_NAME)) {
                        return;
                    }
                    return;
                case 1054422742:
                    if (!string.equals(HANDETECTION_BIZ_NAME)) {
                        return;
                    }
                    return;
                case 1284859651:
                    string.equals(BODYETECTION_BIZ_NAME);
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        try {
            this.mCameraViewContainer = new MiniAppContainerView(((AppContext) Objects.requireNonNull(this.mOuterApp.getAppContext())).getContext());
            this.mCameraViewContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            addContainerVisibleListener();
            return this.mCameraViewContainer;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private void addContainerVisibleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad463bcd", new Object[]{this});
            return;
        }
        MiniAppContainerView miniAppContainerView = this.mCameraViewContainer;
        if (miniAppContainerView == null) {
            return;
        }
        miniAppContainerView.addVisibleListener(this);
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(final JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
            return;
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        try {
            post(new Runnable() { // from class: com.taobao.cameralink.miniapp.arcamera.-$$Lambda$EmbedARCameraView$nBEy92G1p3Z-zqxjxdvS5or2-Cc
                @Override // java.lang.Runnable
                public final void run() {
                    EmbedARCameraView.this.lambda$onReceivedRender$3$EmbedARCameraView(jSONObject);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public /* synthetic */ void lambda$onReceivedRender$3$EmbedARCameraView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3266e7", new Object[]{this, jSONObject});
            return;
        }
        try {
            ((PageContext) Objects.requireNonNull(this.mOuterPage.getPageContext())).getActivity();
            this.currentParam = jSONObject;
            Log.e("embedARCameraView", "currentParam" + this.currentParam.toJSONString());
            startBizByParam();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        MiniAppContainerView miniAppContainerView = this.mCameraViewContainer;
        if (miniAppContainerView != null) {
            LocalBroadcastManager.getInstance(miniAppContainerView.getContext()).unregisterReceiver(this.mTb3dSpaceInstallReceiver);
        }
        a aVar = this.mFaceDetect2DImpl;
        if (aVar != null) {
            aVar.d();
            this.mFaceDetect2DImpl = null;
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.currentBiz == null) {
            return;
        }
        stopCurrentBiz();
        try {
            post(new Runnable() { // from class: com.taobao.cameralink.miniapp.arcamera.-$$Lambda$EmbedARCameraView$xbP3Tiap3wGKy00gA8PDJvSpgOw
                {
                    EmbedARCameraView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EmbedARCameraView.this.lambda$onDestroy$4$EmbedARCameraView();
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public /* synthetic */ void lambda$onDestroy$4$EmbedARCameraView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4103fb15", new Object[]{this});
            return;
        }
        try {
            try {
                this.mWorkerHandler.removeCallbacksAndMessages(null);
                if (this.mWorkerThread != null && Build.VERSION.SDK_INT >= 18) {
                    this.mWorkerThread.quitSafely();
                }
                super.onDestroy();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Exception unused) {
            if (this.mWorkerThread == null) {
                return;
            }
            this.mWorkerThread.quit();
        }
    }

    @Override // com.taobao.cameralink.miniapp.c
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        try {
            if (this.currentBiz != null && this.currentParam != null) {
                startBizByParam();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.cameralink.miniapp.c
    public void onHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5669c70", new Object[]{this});
            return;
        }
        try {
            if (this.currentBiz == null) {
                return;
            }
            stopCurrentBiz();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
