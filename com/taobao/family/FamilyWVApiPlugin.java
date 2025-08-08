package com.taobao.family;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FamilyWVApiPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_SOCIAL_FAMILY_DATA = "getSocialFamilyData";
    public static final String JS_BRIDGE_CLASSNAME = "TBSocialJsBridgeHandle";
    private static final String LOG_TAG = "FamilyWVApiPlugin";

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || !str.equals(ACTION_GET_SOCIAL_FAMILY_DATA)) {
            return false;
        }
        String userId = Login.getUserId();
        if (StringUtils.isEmpty(userId)) {
            wVCallBackContext.error();
        } else if (FamilyManager.dataStoreComponent == null) {
            wVCallBackContext.error();
            return true;
        } else {
            String a2 = FamilyManager.dataStoreComponent.a(userId);
            r rVar = new r();
            if (!StringUtils.isEmpty(a2)) {
                try {
                    rVar.a("data", new JSONObject(a2));
                } catch (JSONException unused) {
                }
                wVCallBackContext.success(rVar);
            }
            rVar.a("data", "{}");
            wVCallBackContext.success(rVar);
        }
        return true;
    }
}
