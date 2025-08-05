package com.alibaba.security.realidentity.ui.webview.jsbridge;

import android.text.TextUtils;
import com.alibaba.security.realidentity.RPDetail;
import com.alibaba.security.realidentity.RPEventListener;
import com.alibaba.security.realidentity.RPResult;
import com.alibaba.security.realidentity.a;
import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.biz.RPBusinessHeadParams;
import com.alibaba.security.realidentity.e2;
import com.alibaba.security.realidentity.g1;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsg;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

@JSTopic(topic = LivenessApi.TAG)
/* loaded from: classes3.dex */
public class LivenessApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME_EXIT_INFO = "exitInfo";
    public static final String TAG = "liveness";

    public LivenessApi(u4 u4Var) {
        super(u4Var);
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean execute(String str, final JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d162c2f", new Object[]{this, str, jsCallbackAdapter})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            callbackUnknowError(jsCallbackAdapter, BaseJsExecutor.VALUE_INPUT_PARAM_ERROR);
            trackExceptionLog("LivenessApi parse params is null");
            return true;
        }
        RPBusinessHeadParams rPBusinessHeadParams = (RPBusinessHeadParams) b.b(str, RPBusinessHeadParams.class);
        a.a(TAG, b.a(rPBusinessHeadParams));
        if (rPBusinessHeadParams == null) {
            callbackUnknowError(jsCallbackAdapter, BaseJsExecutor.VALUE_INPUT_PARAM_ERROR);
            trackExceptionLog("LivenessApi parse params is invalid");
            return true;
        }
        RPBusinessHeadParams.IdentityInfoBean identityInfoBean = rPBusinessHeadParams.identityInfo;
        if (identityInfoBean != null) {
            rPBusinessHeadParams.userName = identityInfoBean.name;
        }
        setVerifyToken(rPBusinessHeadParams.verifyToken);
        collectLog(TrackLog.createSimpleSdk(TAG, getTrackMethod(), str));
        g1.f().c(this.mContext, this.mRPBizConfig, rPBusinessHeadParams, new RPEventListener() { // from class: com.alibaba.security.realidentity.ui.webview.jsbridge.LivenessApi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.security.realidentity.RPEventListener
            public void onFinish(RPResult rPResult, RPDetail rPDetail) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a2f654c3", new Object[]{this, rPResult, rPDetail});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    WVResultWrapper wVResultWrapper = new WVResultWrapper();
                    jSONObject.put("code", rPDetail.getCode());
                    jSONObject.put("message", rPDetail.getMsg());
                    jSONObject.put(BaseJsExecutor.NAME_MAIN_CODE, e2.a(Integer.parseInt(rPDetail.getCode())));
                    if ("-1".equals(rPDetail.getCode())) {
                        LastExitTrackMsg a2 = RPTrack.a();
                        JSONObject jSONObject2 = new JSONObject();
                        if (a2 != null) {
                            jSONObject2.put("page", a2.page);
                            jSONObject2.put("view", a2.view);
                            jSONObject2.put("params", a2.params);
                        }
                        jSONObject.put(LivenessApi.NAME_EXIT_INFO, jSONObject2);
                    }
                    wVResultWrapper.setData(jSONObject);
                    jsCallbackAdapter.success(wVResultWrapper);
                    LivenessApi livenessApi = LivenessApi.this;
                    livenessApi.finishJsBridge("code: " + rPDetail.getCode() + " msg: " + rPDetail.getMsg(), true);
                    RPTrack.c();
                } catch (Exception e) {
                    if (a.a()) {
                        a.a(LivenessApi.TAG, "LivenessApi start liveness error", e);
                    }
                    LivenessApi.this.callbackUnknowError(jsCallbackAdapter, "LivenessApi start liveness error");
                    LivenessApi.this.trackExceptionLog("LivenessApi start liveness error", e);
                }
            }
        });
        return true;
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this}) : TAG;
    }
}
