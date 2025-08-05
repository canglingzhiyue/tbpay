package com.alipay.mobile.verifyidentity.module.dynamic;

import android.content.Intent;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DynamicModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String KEY_TPLDATA = "tplData";
    public static String KEY_TPLID = "tplId";
    public static String KEY_TPLINFO = "tplInfo";

    /* renamed from: a  reason: collision with root package name */
    private static final String f5885a = "DynamicModule";
    private static String b = "VISwitchConfig";

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(str3);
        } catch (JSONException e) {
            String str4 = f5885a;
            VerifyLogCat.e(str4, "json fail " + str3, e);
        }
        if (jSONObject == null) {
            String str5 = f5885a;
            VerifyLogCat.d(str5, "module data can't be converted to jsonobject: " + str3);
            getMicroModuleContext().notifyAndFinishModule(getVerifyId(), getToken(), getModuleName(), new DefaultModuleResult("2002"));
            return;
        }
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        String str6 = KEY_TPLID;
        bundle2.putString(str6, jSONObject.getString(str6));
        String str7 = KEY_TPLINFO;
        bundle2.putString(str7, jSONObject.getString(str7));
        jSONObject.remove(KEY_TPLID);
        jSONObject.remove(KEY_TPLINFO);
        jSONObject.put(b, (Object) ReportHelper.getAllSwitchConfig());
        bundle2.putString(KEY_TPLDATA, jSONObject.toJSONString());
        Intent intent = new Intent(getMicroModuleContext().getContext(), DynamicActivity.class);
        intent.putExtras(bundle2);
        getMicroModuleContext().startActivity(this, intent);
    }
}
