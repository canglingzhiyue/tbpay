package com.alipay.android.msp.framework.drm;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class EnvStatus {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4696a;
    private String b;
    private String c;
    private String d;
    private String e;
    private final Context f;

    public EnvStatus(Context context) {
        this.f = context.getApplicationContext();
        try {
            this.b = PrefUtils.getString("cashier_drm_switch", "env_os", "");
            this.c = PrefUtils.getString("cashier_drm_switch", "env_osver", "");
            this.d = PrefUtils.getString("cashier_drm_switch", "env_sdkver", "");
            this.f4696a = PrefUtils.getString("cashier_drm_switch", "env_model", "");
            this.e = PrefUtils.getString("cashier_drm_switch", "env_packagename", "");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public final synchronized boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        String os = DeviceInfo.getOS();
        String mspVersion = GlobalSdkConstant.getMspVersion();
        String packageName = this.f.getPackageName();
        if (!TextUtils.equals(this.b, os) || !TextUtils.equals(this.d, mspVersion) || !TextUtils.equals(this.e, packageName)) {
            z = true;
        }
        LogUtil.record(1, "Drm", "EnvStatus", "isChanged:".concat(String.valueOf(z)));
        return z;
    }

    public final synchronized void update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        this.b = DeviceInfo.getOS();
        this.c = DeviceInfo.getOSVersion();
        this.d = GlobalSdkConstant.getMspVersion();
        this.f4696a = DeviceInfo.getModel();
        this.e = this.f.getPackageName();
        PrefUtils.putString("cashier_drm_switch", "env_os", this.b);
        PrefUtils.putString("cashier_drm_switch", "env_osver", this.c);
        PrefUtils.putString("cashier_drm_switch", "env_sdkver", this.d);
        PrefUtils.putString("cashier_drm_switch", "env_model", this.f4696a);
        PrefUtils.putString("cashier_drm_switch", "env_packagename", this.e);
        LogUtil.record(1, "Drm", "EnvStatus", "update:done");
    }
}
