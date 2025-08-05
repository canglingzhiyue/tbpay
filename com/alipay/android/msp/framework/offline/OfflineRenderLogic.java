package com.alipay.android.msp.framework.offline;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class OfflineRenderLogic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public String analysisRenderInfo(Context context, Map<String, String> map, String str) {
        JSONObject analysisActivityPageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4b121f2", new Object[]{this, context, map, str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject.getBooleanValue("unifyPage")) {
            analysisActivityPageInfo = analysisResultPageInfo(context, map, parseObject);
        } else {
            analysisActivityPageInfo = analysisActivityPageInfo(context, map, parseObject);
        }
        return analysisActivityPageInfo.toJSONString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        if (android.text.TextUtils.equals(r1, com.alipay.android.msp.pay.GlobalSdkConstant.getMspVersion()) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson.JSONObject analysisResultPageInfo(android.content.Context r7, java.util.Map<java.lang.String, java.lang.String> r8, com.alibaba.fastjson.JSONObject r9) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.framework.offline.OfflineRenderLogic.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            r7 = 2
            r1[r7] = r8
            r7 = 3
            r1[r7] = r9
            java.lang.String r7 = "13b068f6"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            com.alibaba.fastjson.JSONObject r7 = (com.alibaba.fastjson.JSONObject) r7
            return r7
        L1e:
            java.lang.String r0 = "tplid"
            java.lang.String r1 = r9.getString(r0)
            java.lang.String r4 = "3"
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            java.lang.String r4 = "QUICKPAY@cashier-result-flex"
            if (r1 == 0) goto L32
            r9.put(r0, r4)
        L32:
            java.lang.String r1 = r9.getString(r0)
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L68
            java.lang.String r1 = "reportVer"
            com.alibaba.fastjson.JSONObject r1 = r9.getJSONObject(r1)
            if (r1 == 0) goto L68
            java.lang.String r4 = "tplVersion"
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = "mspVersion"
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r5 = com.alipay.android.msp.pay.GlobalConstant.getTemplateVersion()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L69
            java.lang.String r4 = com.alipay.android.msp.pay.GlobalSdkConstant.getMspVersion()
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 != 0) goto L68
            goto L69
        L68:
            r2 = 0
        L69:
            if (r2 == 0) goto L84
            com.alipay.android.msp.framework.offline.OfflineRenderReport r1 = new com.alipay.android.msp.framework.offline.OfflineRenderReport
            r1.<init>(r8)
            r1.reportUseDefaultResultInfo(r7)
            if (r9 != 0) goto L77
            r7 = 0
            return r7
        L77:
            java.lang.String r7 = "QUICKPAY@cashier-default-result-flex"
            r9.put(r0, r7)
            java.lang.String r7 = "tpl"
            java.lang.String r8 = ""
            r9.put(r7, r8)
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.offline.OfflineRenderLogic.analysisResultPageInfo(android.content.Context, java.util.Map, com.alibaba.fastjson.JSONObject):com.alibaba.fastjson.JSONObject");
    }

    public JSONObject analysisActivityPageInfo(Context context, Map<String, String> map, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d1d3f044", new Object[]{this, context, map, jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("serverSideData")) != null) {
            String string = jSONObject2.getString("tplVersion");
            String string2 = jSONObject2.getString("mspVersion");
            if (TextUtils.equals(string, GlobalConstant.getTemplateVersion()) && TextUtils.equals(string2, GlobalSdkConstant.getMspVersion())) {
                z = false;
            }
        }
        if (z) {
            new OfflineRenderReport(map).reportActivity(context);
            JSONObject jSONObject3 = jSONObject.getJSONObject("defaultData");
            return jSONObject3 != null ? jSONObject3 : new JSONObject();
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("normalData");
        return jSONObject4 != null ? jSONObject4 : new JSONObject();
    }
}
