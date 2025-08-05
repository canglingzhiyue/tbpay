package com.taobao.android.artry;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.EmbedARTryView;
import com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp;
import com.taobao.android.artry.arflow.d;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;
import java.util.Map;
import tb.dpv;
import tb.dpy;
import tb.dqe;
import tb.kge;

/* loaded from: classes4.dex */
public class EmbedARTryView extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "EmbedARTryView";
    public static final String TYPE = "artry";
    private d mARTryFlowForMiniApp;
    private Activity mActivity;
    private String mBizUrl;
    private FrameLayout mFrameContainer;
    private Map<String, String> mParamFromGetView;

    static {
        kge.a(-32000242);
    }

    public static /* synthetic */ Object ipc$super(EmbedARTryView embedARTryView, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    public static /* synthetic */ Activity access$000(EmbedARTryView embedARTryView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("eff84ccc", new Object[]{embedARTryView}) : embedARTryView.mActivity;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        if (this.mOuterPage == null || this.mOuterPage.getPageContext() == null) {
            return null;
        }
        Activity activity = this.mOuterPage.getPageContext().getActivity();
        this.mActivity = activity;
        if (activity == null) {
            return null;
        }
        if (getOuterPage() != null) {
            this.mBizUrl = getOuterPage().getPageURI();
        }
        this.mParamFromGetView = map;
        this.mFrameContainer = new FrameLayout(this.mActivity.getApplicationContext());
        return this.mFrameContainer;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
        } else if (createARTryFlow(str, jSONObject, bridgeCallback) || this.mARTryFlowForMiniApp == null) {
        } else {
            dpv anonymousClass1 = new AnonymousClass1();
            anonymousClass1.a(new dpy(this, bridgeCallback));
            if (str.equals("setupAREngineEnv") && jSONObject.getString("graphType") != null && jSONObject.getString("graphType").equals("MAKEUP_ONLY")) {
                JSONObject jSONObject2 = new JSONObject();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) this.mActivity.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
                float f = displayMetrics.density;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject2.put("arViewParam", (Object) jSONObject3);
                if (jSONObject.containsKey("arViewLeft")) {
                    jSONObject3.put("arViewLeft", (Object) Integer.valueOf((int) (jSONObject.getIntValue("arViewLeft") * f)));
                }
                if (jSONObject.containsKey("arViewTop")) {
                    jSONObject3.put("arViewTop", (Object) Integer.valueOf((int) (jSONObject.getIntValue("arViewTop") * f)));
                }
                if (jSONObject.containsKey("arViewWidth")) {
                    jSONObject3.put("arViewWidth", (Object) Integer.valueOf((int) (jSONObject.getIntValue("arViewWidth") * f)));
                }
                if (jSONObject.containsKey("arViewHeight")) {
                    jSONObject3.put("arViewHeight", (Object) Integer.valueOf((int) (jSONObject.getIntValue("arViewHeight") * f)));
                }
                jSONObject3.put("needARView", (Object) Boolean.valueOf(jSONObject.containsKey("needARView") ? jSONObject.getBoolean("needARView").booleanValue() : true));
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("graphType", (Object) "MAKEUP_ONLY");
                jSONArray.add(jSONObject4);
                jSONObject2.put("graphParams", (Object) jSONArray);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject2.put("sourceParam", (Object) jSONObject5);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject5.put(BlobManager.BLOB_ELEM_TYPE_CAMERA, (Object) jSONObject6);
                if (jSONObject.containsKey("openFrontCamera")) {
                    z = jSONObject.getBoolean("openFrontCamera").booleanValue();
                }
                jSONObject6.put("isFront", (Object) Boolean.valueOf(z));
                float f2 = 720.0f;
                String string = jSONObject.getString("cameraPreset");
                int i = 1280;
                if (string.equals("high")) {
                    f2 = 960.0f;
                } else if (string.equals("photo_low")) {
                    i = 352;
                    f2 = 288.0f;
                }
                jSONObject6.put("previewWidth", (Object) Integer.valueOf(i));
                jSONObject6.put("previewHeight", (Object) Float.valueOf(f2));
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("apiName", "setupOrUpdateAREngine");
                jSONObject7.put("apiParam", (Object) jSONObject2);
                this.mARTryFlowForMiniApp.a("applyEffect", jSONObject7, anonymousClass1);
            } else if (!jSONObject.containsKey("apiName") && (this.mARTryFlowForMiniApp instanceof ARTryJSFlowForMiniApp) && str.equals("applyEffect")) {
                ((ARTryJSFlowForMiniApp) this.mARTryFlowForMiniApp).a(jSONObject, anonymousClass1);
            } else {
                this.mARTryFlowForMiniApp.a(str, jSONObject, anonymousClass1);
            }
        }
    }

    /* renamed from: com.taobao.android.artry.EmbedARTryView$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends dpv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void lambda$BPWNeXlRXqXDq4lwZLok1tZx75U(AnonymousClass1 anonymousClass1) {
            anonymousClass1.a();
        }

        public AnonymousClass1() {
            EmbedARTryView.this = r1;
        }

        @Override // tb.dpv
        public void a(com.taobao.android.artry.common.c cVar, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c34b91ce", new Object[]{this, cVar, jSONObject});
            } else if (cVar == null || cVar.b != ResultCode.ENGINE_FAILED_LOAD_SO || EmbedARTryView.access$000(EmbedARTryView.this) == null) {
            } else {
                dqe.a().a(new Runnable() { // from class: com.taobao.android.artry.-$$Lambda$EmbedARTryView$1$BPWNeXlRXqXDq4lwZLok1tZx75U
                    {
                        EmbedARTryView.AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EmbedARTryView.AnonymousClass1.lambda$BPWNeXlRXqXDq4lwZLok1tZx75U(EmbedARTryView.AnonymousClass1.this);
                    }
                });
            }
        }

        public /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Toast makeText = Toast.makeText(EmbedARTryView.access$000(EmbedARTryView.this).getApplicationContext(), "", 0);
            makeText.setText(R.string.load_so_failed);
            makeText.show();
            EmbedARTryView.access$000(EmbedARTryView.this).finish();
        }
    }

    private boolean createARTryFlow(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45f5ca7d", new Object[]{this, str, jSONObject, bridgeCallback})).booleanValue();
        }
        if (!TextUtils.equals(str, "applyEffect") && this.mARTryFlowForMiniApp == null) {
            if (str.equals("setupAREngineEnv") && jSONObject.getString("graphType") != null && jSONObject.getString("graphType").equals("MAKEUP_ONLY")) {
                this.mARTryFlowForMiniApp = createARTryJSFlow();
            }
            return false;
        }
        if (TextUtils.equals(str, "applyEffect")) {
            if (this.mARTryFlowForMiniApp == null) {
                this.mARTryFlowForMiniApp = createARTryJSFlow();
                return false;
            } else if (jSONObject != null && jSONObject.containsKey("apiName") && TextUtils.equals(jSONObject.getString("apiName"), "switchFlow")) {
                if (bridgeCallback != null) {
                    bridgeCallback.sendJSONResponse(null, false);
                }
                return true;
            }
        }
        return false;
    }

    private ARTryJSFlowForMiniApp createARTryJSFlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ARTryJSFlowForMiniApp) ipChange.ipc$dispatch("abb4c273", new Object[]{this});
        }
        ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = new ARTryJSFlowForMiniApp();
        this.mFrameContainer.removeAllViews();
        this.mFrameContainer.addView(aRTryJSFlowForMiniApp.a(this.mBizUrl, this.mActivity, this.mParamFromGetView));
        return aRTryJSFlowForMiniApp;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
            return;
        }
        d dVar = this.mARTryFlowForMiniApp;
        if (dVar == null) {
            return;
        }
        dVar.b();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
            return;
        }
        d dVar = this.mARTryFlowForMiniApp;
        if (dVar == null) {
            return;
        }
        dVar.c();
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        d dVar = this.mARTryFlowForMiniApp;
        if (dVar == null) {
            return;
        }
        dVar.d();
    }
}
