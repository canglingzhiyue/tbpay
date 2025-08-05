package com.alipay.mobile.verifyidentity.module.internal.password.pay;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PubKeyHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5904a = "PubKeyHelper";

    public static String getPubKey(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b118cb7", new Object[]{context});
        }
        VerifyLogCat.i(f5904a, "获取本地或公钥");
        return PreferenceManager.getDefaultSharedPreferences(context).getString("VI_SP_LOCAL_PUB_KEY", "");
    }

    public static String updateLocalPubKey(Context context, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab8d08df", new Object[]{context, mICRpcResponse});
        }
        if (mICRpcResponse == null) {
            return "";
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(mICRpcResponse.data);
        } catch (JSONException e) {
            String str = f5904a;
            VerifyLogCat.e(str, "json fail " + mICRpcResponse.data, e);
        }
        if (jSONObject == null || TextUtils.isEmpty(jSONObject.getString("pubKey"))) {
            return "";
        }
        String string = jSONObject.getString("pubKey");
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("VI_SP_LOCAL_PUB_KEY", string).commit();
        String str2 = f5904a;
        VerifyLogCat.i(str2, "更新本地公钥为：" + string);
        return string;
    }
}
