package com.alibaba.security.realidentity.ui.webview.jsbridge;

import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

@JSTopic(topic = "rpTraceLink")
/* loaded from: classes3.dex */
public class TraceLinkApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TraceLinkApi";

    public TraceLinkApi(u4 u4Var) {
        super(u4Var);
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean execute(String str, JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d162c2f", new Object[]{this, str, jsCallbackAdapter})).booleanValue();
        }
        try {
            TrackLog trackLog = new TrackLog();
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("token");
            String optString2 = jSONObject.optString("service");
            String optString3 = jSONObject.optString("method");
            int optInt = jSONObject.optInt("code");
            String optString4 = jSONObject.optString("msg");
            String optString5 = jSONObject.optString("params");
            String optString6 = jSONObject.optString("result");
            JSONArray optJSONArray = jSONObject.optJSONArray("tags");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList(10);
                for (int i = 0; i < 10; i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
                trackLog.setTags(arrayList);
            }
            trackLog.setLayer("h5");
            trackLog.setService(optString2);
            trackLog.setMethod(optString3);
            trackLog.setCode(optInt);
            trackLog.setMsg(optString4);
            trackLog.setParams(optString5);
            trackLog.setResult(optString6);
            setVerifyToken(optString);
            collectLog(trackLog);
            WVResultWrapper wVResultWrapper = new WVResultWrapper();
            wVResultWrapper.setSuccess();
            jsCallbackAdapter.success(wVResultWrapper);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this}) : "rpTraceLink";
    }
}
