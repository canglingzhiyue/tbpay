package com.taobao.tao.relation;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.substitute.api.Constants;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes8.dex */
public class h implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NavRelationDaifuUrlProcessor";

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : TAG;
    }

    public h() {
        TLog.logd(TAG, "开关状态" + d.a());
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent == null || intent.getData() == null) {
            return false;
        }
        Uri data = intent.getData();
        String queryParameter = data.getQueryParameter("userId");
        String queryParameter2 = data.getQueryParameter("daifuUserId");
        String queryParameter3 = data.getQueryParameter(Constants.BUNDLE_KEY_TRADE_NO);
        String queryParameter4 = data.getQueryParameter("orderId");
        String queryParameter5 = data.getQueryParameter("amount");
        String queryParameter6 = data.getQueryParameter("title");
        String queryParameter7 = data.getQueryParameter(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL);
        String queryParameter8 = data.getQueryParameter("itemPicUrl");
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2) || TextUtils.isEmpty(queryParameter3) || TextUtils.isEmpty(queryParameter4) || TextUtils.isEmpty(queryParameter5) || TextUtils.isEmpty(queryParameter7)) {
            TLog.loge(TAG, "https://tb.cn/n/im/biz/order attach empty parameter");
            return false;
        }
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
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue() : !d.a();
    }
}
