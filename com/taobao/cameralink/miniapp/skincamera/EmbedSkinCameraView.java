package com.taobao.cameralink.miniapp.skincamera;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.app.api.AppContext;
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
import com.taobao.cameralink.miniapp.b;
import com.taobao.cameralink.miniapp.c;
import com.taobao.speech.util.e;
import java.util.Map;
import java.util.Objects;
import tb.cal;
import tb.kfq;
import tb.kfr;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class EmbedSkinCameraView extends AbsCLBaseEmbedView implements c, kfr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG;
    public static final String TYPE = "iskin-camera";
    private b backSkinCameraBiz = null;
    private volatile b currentBiz;
    private JSONObject currentParam;
    private MiniAppContainerView mCameraViewContainer;
    private a mFrontSkinDetectImpl;
    private String mLoadUrl;
    private BroadcastReceiver mTb3dSpaceInstallReceiver;
    private Handler mWorkerHandler;
    private HandlerThread mWorkerThread;

    /* renamed from: com.taobao.cameralink.miniapp.skincamera.EmbedSkinCameraView$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass2 implements cal {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f16898a;
        public final /* synthetic */ com.taobao.cameralink.miniapp.skincamera.biz.b b;

        public AnonymousClass2(Activity activity, com.taobao.cameralink.miniapp.skincamera.biz.b bVar) {
            this.f16898a = activity;
            this.b = bVar;
        }

        @Override // tb.cal
        public void onComplete(boolean z, org.json.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f409ee9", new Object[]{this, new Boolean(z), jSONObject});
            } else if (!z) {
                EmbedSkinCameraView.access$000();
            } else {
                EmbedSkinCameraView.access$400(EmbedSkinCameraView.this).post(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.EmbedSkinCameraView.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (EmbedSkinCameraView.access$200(EmbedSkinCameraView.this) == null) {
                            EmbedSkinCameraView.access$302(EmbedSkinCameraView.this, new a(EmbedSkinCameraView.access$400(EmbedSkinCameraView.this), AnonymousClass2.this.f16898a, null, AnonymousClass2.this.b == null ? null : AnonymousClass2.this.b.f16909a));
                        }
                        EmbedSkinCameraView.access$300(EmbedSkinCameraView.this).a(EmbedSkinCameraView.this);
                        EmbedSkinCameraView.access$300(EmbedSkinCameraView.this).a().resumeSkinDetectView(new cal() { // from class: com.taobao.cameralink.miniapp.skincamera.EmbedSkinCameraView.2.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.cal
                            public void onComplete(boolean z2, org.json.JSONObject jSONObject2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("8f409ee9", new Object[]{this, new Boolean(z2), jSONObject2});
                                    return;
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("success", (Object) true);
                                EmbedSkinCameraView.this.sendEvent("init", jSONObject3, null);
                                if (EmbedSkinCameraView.access$300(EmbedSkinCameraView.this) == null) {
                                    return;
                                }
                                EmbedSkinCameraView.access$300(EmbedSkinCameraView.this).c();
                            }
                        });
                    }
                });
            }
        }
    }

    public static /* synthetic */ Object ipc$super(EmbedSkinCameraView embedSkinCameraView, String str, Object... objArr) {
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

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : TAG;
    }

    public static /* synthetic */ void access$100(EmbedSkinCameraView embedSkinCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5735f2", new Object[]{embedSkinCameraView});
        } else {
            embedSkinCameraView.realStartParam();
        }
    }

    public static /* synthetic */ b access$200(EmbedSkinCameraView embedSkinCameraView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a65ef664", new Object[]{embedSkinCameraView}) : embedSkinCameraView.currentBiz;
    }

    public static /* synthetic */ a access$300(EmbedSkinCameraView embedSkinCameraView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("543754fb", new Object[]{embedSkinCameraView}) : embedSkinCameraView.mFrontSkinDetectImpl;
    }

    public static /* synthetic */ a access$302(EmbedSkinCameraView embedSkinCameraView, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5ff4e600", new Object[]{embedSkinCameraView, aVar});
        }
        embedSkinCameraView.mFrontSkinDetectImpl = aVar;
        return aVar;
    }

    public static /* synthetic */ MiniAppContainerView access$400(EmbedSkinCameraView embedSkinCameraView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MiniAppContainerView) ipChange.ipc$dispatch("16411c92", new Object[]{embedSkinCameraView}) : embedSkinCameraView.mCameraViewContainer;
    }

    static {
        kge.a(781271829);
        kge.a(-1663495502);
        kge.a(934369567);
        TAG = EmbedSkinCameraView.class.getSimpleName();
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
            this.mWorkerThread = new HandlerThread("SkinCameraFrameThread");
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
        } else if (!kfq.a()) {
            if (this.mTb3dSpaceInstallReceiver == null) {
                this.mTb3dSpaceInstallReceiver = new BroadcastReceiver() { // from class: com.taobao.cameralink.miniapp.skincamera.EmbedSkinCameraView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else if (intent == null) {
                        } else {
                            EmbedSkinCameraView.access$000();
                            if (!"TB3DSPACE_INSTALL_SUCCESS".equals(intent.getAction())) {
                                return;
                            }
                            EmbedSkinCameraView.access$100(EmbedSkinCameraView.this);
                        }
                    }
                };
                LocalBroadcastManager.getInstance(this.mCameraViewContainer.getContext()).registerReceiver(this.mTb3dSpaceInstallReceiver, new IntentFilter("TB3DSPACE_INSTALL_SUCCESS"));
            }
            Nav.from(this.mCameraViewContainer.getContext()).toUri("https://go/installxrspace3d");
        } else {
            realStartParam();
        }
    }

    private void realStartParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05db190", new Object[]{this});
            return;
        }
        try {
            requestPermission(this.mOuterPage.getPageContext().getActivity(), new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.-$$Lambda$EmbedSkinCameraView$v-dj55rcGi39h1GjTrRRMLm9gmQ
                {
                    EmbedSkinCameraView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EmbedSkinCameraView.this.lambda$realStartParam$1$EmbedSkinCameraView();
                }
            }, e.CAMERA, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        } catch (Throwable th) {
            th.printStackTrace();
            String str = "startBizByParam: printStackTrace val " + th;
        }
    }

    public /* synthetic */ void lambda$realStartParam$1$EmbedSkinCameraView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6aae1a", new Object[]{this});
            return;
        }
        try {
            post(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.-$$Lambda$EmbedSkinCameraView$8ENvxQ_v6_6Cg_ON71opYO13f88
                {
                    EmbedSkinCameraView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EmbedSkinCameraView.this.lambda$realStartParam$0$EmbedSkinCameraView();
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public /* synthetic */ void lambda$realStartParam$0$EmbedSkinCameraView() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5c9699", new Object[]{this});
            return;
        }
        try {
            String string = this.currentParam.getString("devicePosition");
            if (string == null) {
                return;
            }
            Activity activity = ((PageContext) Objects.requireNonNull(this.mOuterPage.getPageContext())).getActivity();
            String string2 = this.currentParam.getString("loadUrl");
            if (!TextUtils.equals(string2, this.mLoadUrl) && !TextUtils.isEmpty(string2) && string2.toLowerCase().startsWith("http")) {
                z = true;
            }
            com.taobao.cameralink.miniapp.skincamera.biz.b bVar = null;
            if (z) {
                this.mLoadUrl = string2;
                if (this.currentBiz instanceof com.taobao.cameralink.miniapp.skincamera.biz.b) {
                    bVar = (com.taobao.cameralink.miniapp.skincamera.biz.b) this.currentBiz;
                } else {
                    if (this.currentBiz != null) {
                        this.currentBiz.a();
                    }
                    bVar = new com.taobao.cameralink.miniapp.skincamera.biz.b();
                    bVar.a(this, this, activity, this.mCameraViewContainer);
                    this.currentBiz = bVar;
                }
                bVar.a(this.mLoadUrl);
            }
            if (TextUtils.equals(string, "front")) {
                TB3DSpace.initSkinDetect(new AnonymousClass2(activity, bVar));
            } else {
                TextUtils.equals(string, "back");
            }
            if (this.currentBiz == null) {
                return;
            }
            this.currentBiz.a(this.currentParam);
        } catch (Throwable th) {
            th.printStackTrace();
            String str = "startBizByParam: throwable " + th;
        }
    }

    private void stopCurrentBiz() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585e5903", new Object[]{this});
        } else {
            post(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.-$$Lambda$EmbedSkinCameraView$lb907njYKzCVxJaDdLkRMZo86ME
                {
                    EmbedSkinCameraView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EmbedSkinCameraView.this.lambda$stopCurrentBiz$2$EmbedSkinCameraView();
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r1 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        r6.backSkinCameraBiz.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void lambda$stopCurrentBiz$2$EmbedSkinCameraView() {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.cameralink.miniapp.skincamera.EmbedSkinCameraView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r6
            java.lang.String r2 = "5ed5c4e"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            com.alibaba.fastjson.JSONObject r0 = r6.currentParam     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = "devicePosition"
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L1d
            return
        L1d:
            r1 = -1
            int r4 = r0.hashCode()     // Catch: java.lang.Throwable -> L51
            r5 = 3015911(0x2e04e7, float:4.226191E-39)
            if (r4 == r5) goto L37
            r5 = 97705513(0x5d2de29, float:1.9829914E-35)
            if (r4 == r5) goto L2d
            goto L40
        L2d:
            java.lang.String r4 = "front"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L40
            r1 = 0
            goto L40
        L37:
            java.lang.String r2 = "back"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L40
            r1 = 1
        L40:
            if (r1 == 0) goto L4b
            if (r1 == r3) goto L45
            goto L4a
        L45:
            com.taobao.cameralink.miniapp.b r0 = r6.backSkinCameraBiz     // Catch: java.lang.Throwable -> L51
            r0.a()     // Catch: java.lang.Throwable -> L51
        L4a:
            return
        L4b:
            com.taobao.cameralink.miniapp.skincamera.a r0 = r6.mFrontSkinDetectImpl     // Catch: java.lang.Throwable -> L51
            r0.b()     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r0 = move-exception
            r0.printStackTrace()
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.cameralink.miniapp.skincamera.EmbedSkinCameraView.lambda$stopCurrentBiz$2$EmbedSkinCameraView():void");
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
        String str = "life cycle: invoking onReceivedRender, the param is [" + jSONObject + riy.ARRAY_END_STR;
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        try {
            post(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.-$$Lambda$EmbedSkinCameraView$CQ3uIusIfhG838Q-UgGwKBR9zIA
                @Override // java.lang.Runnable
                public final void run() {
                    EmbedSkinCameraView.this.lambda$onReceivedRender$3$EmbedSkinCameraView(jSONObject);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public /* synthetic */ void lambda$onReceivedRender$3$EmbedSkinCameraView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3266e7", new Object[]{this, jSONObject});
            return;
        }
        try {
            this.currentParam = jSONObject;
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
            return;
        }
        String str2 = "life cycle: invoking onReceivedMessage, the action is [" + str + "] the param is [" + jSONObject + riy.ARRAY_END_STR;
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if ("stopCamera".equals(str)) {
            stopCurrentBiz();
        } else if ("startCamera".equals(str)) {
            startBizByParam();
        } else {
            if ("postMessage".equals(str) && (this.currentBiz instanceof com.taobao.cameralink.miniapp.skincamera.biz.b)) {
                ((com.taobao.cameralink.miniapp.skincamera.biz.b) this.currentBiz).a("ARSkinAnalysis.message", jSONObject);
                return;
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        MiniAppContainerView miniAppContainerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.mTb3dSpaceInstallReceiver != null && (miniAppContainerView = this.mCameraViewContainer) != null) {
            LocalBroadcastManager.getInstance(miniAppContainerView.getContext()).unregisterReceiver(this.mTb3dSpaceInstallReceiver);
        }
        a aVar = this.mFrontSkinDetectImpl;
        if (aVar != null) {
            aVar.d();
            this.mFrontSkinDetectImpl = null;
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
            post(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.-$$Lambda$EmbedSkinCameraView$95605zm5kdgjpVhOBIpK912yZ7w
                {
                    EmbedSkinCameraView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EmbedSkinCameraView.this.lambda$onDestroy$4$EmbedSkinCameraView();
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public /* synthetic */ void lambda$onDestroy$4$EmbedSkinCameraView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4103fb15", new Object[]{this});
            return;
        }
        try {
            try {
                this.mWorkerHandler.removeCallbacksAndMessages(null);
                if (this.mWorkerThread != null) {
                    this.mWorkerThread.quitSafely();
                }
                super.onDestroy();
            } catch (Exception unused) {
                if (this.mWorkerThread == null) {
                    return;
                }
                this.mWorkerThread.quit();
            }
        } catch (Throwable th) {
            th.printStackTrace();
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
