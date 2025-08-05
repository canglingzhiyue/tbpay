package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.plugin.IFingerprintPlugin;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.plugin.model.FingerprintPayResult;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspFingerprintCashierManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static MspFingerprintCashierManager b;

    /* renamed from: a  reason: collision with root package name */
    private final IFingerprintPlugin f4745a = PluginManager.getFingerprint();

    public static MspFingerprintCashierManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspFingerprintCashierManager) ipChange.ipc$dispatch("eac85701", new Object[0]);
        }
        if (b == null) {
            synchronized (MspFingerprintCashierManager.class) {
                if (b == null) {
                    b = new MspFingerprintCashierManager();
                    EventLogUtil.logPayEvent("104851", "content_type", "MspFingerprintCashierManager");
                }
            }
        }
        return b;
    }

    public void prepareFingerprintData(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d66e256", new Object[]{this, context, jSONObject});
            return;
        }
        LogUtil.record(1, "MspFingerprintCashierManager", "prepareFingerprintData");
        try {
            PhoneCashierMspEngine.getMspViSec().cleanFpCache();
            FingerprintPayResult initHardwarePay = this.f4745a.initHardwarePay(MspContextUtil.getUserId());
            if (initHardwarePay != null && ((initHardwarePay.mResult == 100 || initHardwarePay.mResult == 127) && DeviceInfo.isInAlipayWallet(context) && this.f4745a.getRegisteredNumber() > 0)) {
                z = true;
            }
            LogUtil.record(1, "MspFingerprintCashierManager:initFingerprint", "support:".concat(String.valueOf(z)));
            JsonUtil.addUniqueItem(jSONObject, MspGlobalDefine.SUPPORT_APP, Boolean.valueOf(z));
        } catch (Throwable th) {
            LogUtil.record(8, "MspFingerprintCashierManager:prepareFingerprintData", th.getMessage());
        }
    }

    public void initFingerprint(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c964a3", new Object[]{this, context, jSONObject});
            return;
        }
        LogUtil.record(1, "MspFingerprintCashierManager", "initFingerprint");
        try {
            PhoneCashierMspEngine.getMspViSec().cleanFpCache();
            FingerprintPayResult initHardwarePay = this.f4745a.initHardwarePay(MspContextUtil.getUserId());
            if (initHardwarePay != null && ((initHardwarePay.mResult == 100 || initHardwarePay.mResult == 127) && DeviceInfo.isInAlipayWallet(context) && this.f4745a.getRegisteredNumber() > 0)) {
                z = true;
            }
            LogUtil.record(1, "MspFingerprintCashierManager", "initFingerprint", "support:".concat(String.valueOf(z)));
            JsonUtil.addUniqueItem(jSONObject, MspGlobalDefine.SUPPORT_APP, Boolean.valueOf(z));
        } catch (Throwable th) {
            LogUtil.record(8, "MspFingerprintCashierManager", "initFingerprint", th.getMessage());
        }
    }

    public int checkUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue();
        }
        try {
            PhoneCashierMspEngine.getMspViSec().cleanFpCache();
            return this.f4745a.checkUserStatus(str);
        } catch (Throwable th) {
            LogUtil.record(8, "MspFingerprintCashierManager", "IFingerprintPlugin.checkUserStatus", th.getMessage());
            return 2;
        }
    }

    public String checkUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d989ba8", new Object[]{this});
        }
        try {
            PhoneCashierMspEngine.getMspViSec().cleanFpCache();
            return this.f4745a.checkUpdate().mData;
        } catch (Throwable th) {
            LogUtil.record(8, "MspFingerprintCashierManager", "IFingerprintPlugin.checkUpdate", th.getMessage());
            return null;
        }
    }

    public boolean isLocalFingerprintExist() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("729e597f", new Object[]{this})).booleanValue();
        }
        try {
            PhoneCashierMspEngine.getMspViSec().cleanFpCache();
            if (this.f4745a.getRegisteredNumber() > 0) {
                z = true;
            }
        } catch (Throwable th) {
            LogUtil.record(8, "MspFingerprintCashierManager", "IFingerprintPlugin.getRegisteredNumber", th.getMessage());
        }
        LogUtil.record(1, "MspFingerprintCashierManager.isLocalFingerprintExist", "当前本地存在指纹:".concat(String.valueOf(z)));
        return z;
    }
}
