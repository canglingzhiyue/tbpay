package com.taobao.tao.relation;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.substitute.api.Constants;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;

/* loaded from: classes8.dex */
public class f implements Nav.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DaifuNavProcessor";

    public f() {
        TLog.logd(TAG, "开关状态" + d.a());
    }

    @Override // com.taobao.android.nav.Nav.h
    public boolean beforeNavTo(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null || intent.getData() == null) {
            return true;
        }
        Uri data = intent.getData();
        try {
            if (!data.toString().startsWith("https://tb.cn/n/im/biz/order") || !d.a()) {
                return true;
            }
            String queryParameter = data.getQueryParameter("userId");
            String queryParameter2 = data.getQueryParameter("daifuUserId");
            String queryParameter3 = data.getQueryParameter(Constants.BUNDLE_KEY_TRADE_NO);
            String queryParameter4 = data.getQueryParameter("orderId");
            String queryParameter5 = data.getQueryParameter("amount");
            String queryParameter6 = data.getQueryParameter("title");
            String queryParameter7 = data.getQueryParameter(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL);
            String queryParameter8 = data.getQueryParameter("itemPicUrl");
            if (!StringUtils.isEmpty(queryParameter) && !StringUtils.isEmpty(queryParameter2) && !StringUtils.isEmpty(queryParameter3) && !StringUtils.isEmpty(queryParameter4) && !StringUtils.isEmpty(queryParameter5)) {
                if (!StringUtils.isEmpty(queryParameter7)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("amount", (Object) Uri.decode(queryParameter5));
                        jSONObject.put("totalFee", (Object) Uri.decode(queryParameter5));
                        jSONObject.put("senderId", (Object) queryParameter);
                        jSONObject.put("userId", (Object) queryParameter);
                        jSONObject.put("daifuUserId", (Object) queryParameter2);
                        jSONObject.put("receiverId", (Object) queryParameter2);
                        jSONObject.put(Constants.BUNDLE_KEY_TRADE_NO, (Object) queryParameter3);
                        jSONObject.put("orderId", (Object) queryParameter4);
                        jSONObject.put("ccode", (Object) g.a(queryParameter, queryParameter2, 0));
                        jSONObject.put("title", (Object) queryParameter6);
                        jSONObject.put("actionUrl", (Object) Uri.decode(queryParameter7));
                        jSONObject.put("itemPicUrl", (Object) queryParameter8);
                        new e().a(jSONObject);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        str = TAG;
                        TLog.loge(str, "Processor Err " + th.toString());
                        return true;
                    }
                }
            }
            str = TAG;
            try {
                TLog.loge(str, "https://tb.cn/n/im/biz/order attach empty parameter");
                return false;
            } catch (Throwable th2) {
                th = th2;
                TLog.loge(str, "Processor Err " + th.toString());
                return true;
            }
        } catch (Throwable th3) {
            th = th3;
            str = TAG;
        }
    }
}
