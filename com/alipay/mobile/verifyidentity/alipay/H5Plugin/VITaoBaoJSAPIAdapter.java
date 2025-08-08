package com.alipay.mobile.verifyidentity.alipay.H5Plugin;

import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.rp.RPSDK;
import com.alipay.mobile.verifyidentity.alipay.listener.H5PluginListenerByVid;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.alipay.mobile.verifyidentity.info.AppInfo;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class VITaoBaoJSAPIAdapter extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5853a = "VITaoBaoJSAPIAdapter";
    public static final String getBioData = "BIO_DATA";
    public static final String getEnvData = "getEnvData";
    public static final String startEngine = "START_VERIFY";

    public static /* synthetic */ Object ipc$super(VITaoBaoJSAPIAdapter vITaoBaoJSAPIAdapter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("bioDataWithParams".equals(str)) {
            a(getBioData, str2, wVCallBackContext);
            return true;
        } else if ("startEngineWithParams".equals(str)) {
            a(startEngine, str2, wVCallBackContext);
            return true;
        } else if (!getEnvData.equalsIgnoreCase(str)) {
            return false;
        } else {
            a(getEnvData, str2, wVCallBackContext);
            return true;
        }
    }

    private void a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d86eb9", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        try {
            if (getBioData.equals(str)) {
                RPSDK.initialize(RPSDK.RPSDKEnv.RPSDKEnv_DAILY, this.mContext);
                JSONObject parseObject = JSON.parseObject(RPSDK.getDeviceInfo());
                parseObject.put("apdid", (Object) AppInfo.getInstance().getApdid());
                r rVar = new r();
                rVar.a("bio_data", parseObject.toString());
                wVCallBackContext.success(rVar);
                VerifyLogCat.d(f5853a, str2);
            } else if (startEngine.equals(str)) {
                VerifyIdentityEngine.getInstance(this.mContext).unifiedStartByVerifyId(JSONObject.parseObject(str2).getString(Constants.VI_ENGINE_VERIFYID), null, null, new Bundle(), new H5PluginListenerByVid(wVCallBackContext));
            } else if (!getEnvData.equals(str)) {
            } else {
                JSONObject parseObject2 = JSONObject.parseObject(str2);
                boolean booleanValue = parseObject2.getBooleanValue(EnvInfoUtil.KEY_IS_IPAY);
                String string = parseObject2.getString("uid");
                Bundle bundle = new Bundle();
                bundle.putBoolean(EnvInfoUtil.KEY_IS_IPAY, booleanValue);
                if (!StringUtils.isEmpty(string)) {
                    bundle.putString("USER_ID", string);
                }
                String envData = VerifyIdentityEngine.getInstance(this.mContext).getEnvData(bundle);
                r rVar2 = new r();
                rVar2.a("envInfo", envData);
                wVCallBackContext.success(rVar2);
            }
        } catch (Exception e) {
            String str3 = f5853a;
            VerifyLogCat.e(str3, "error: " + e.getMessage());
            wVCallBackContext.error();
        }
    }
}
