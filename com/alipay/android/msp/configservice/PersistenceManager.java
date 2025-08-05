package com.alipay.android.msp.configservice;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class PersistenceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f4481a;

    public PersistenceManager(Context context) {
        this.f4481a = context.getSharedPreferences("msp_config", 0);
    }

    public String getConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("196db09e", new Object[]{this});
        }
        try {
            return this.f4481a.getString("configs", null);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            HashMap hashMap = new HashMap();
            hashMap.put("result_code", "Cache_Read_Failed");
            PhoneCashierMspEngine.getMspLog().walletEventLog("10101279", "pay", hashMap);
            return null;
        }
    }

    public String getLastFetchTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dc1b6de", new Object[]{this});
        }
        try {
            return this.f4481a.getString("last_fetch_time", null);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            HashMap hashMap = new HashMap();
            hashMap.put("result_code", "Cache_Read_Failed");
            PhoneCashierMspEngine.getMspLog().walletEventLog("10101279", "pay", hashMap);
            return null;
        }
    }

    public String getLastEnvParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d7d6232", new Object[]{this});
        }
        try {
            return this.f4481a.getString("last_env_params", "{}");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            HashMap hashMap = new HashMap();
            hashMap.put("result_code", "Cache_Read_Failed");
            PhoneCashierMspEngine.getMspLog().walletEventLog("10101279", "pay", hashMap);
            return null;
        }
    }

    public void setLastEnvParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b018968e", new Object[]{this, jSONObject});
            return;
        }
        try {
            SharedPreferences.Editor edit = this.f4481a.edit();
            edit.putString("last_env_params", jSONObject.toString());
            edit.apply();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            HashMap hashMap = new HashMap();
            hashMap.put("result_code", "Cache_Write_Failed");
            PhoneCashierMspEngine.getMspLog().walletEventLog("10101279", "pay", hashMap);
        }
    }

    public void setConfigs(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936e15ca", new Object[]{this, str, str2});
            return;
        }
        try {
            SharedPreferences.Editor edit = this.f4481a.edit();
            edit.putString("configs", str2);
            edit.putString("last_fetch_time", str);
            edit.apply();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            HashMap hashMap = new HashMap();
            hashMap.put("result_code", "Cache_Write_Failed");
            PhoneCashierMspEngine.getMspLog().walletEventLog("10101279", "pay", hashMap);
        }
    }
}
