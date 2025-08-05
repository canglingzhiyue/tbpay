package com.alipay.android.msp.framework.helper;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;

/* loaded from: classes3.dex */
public class GlobalHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile GlobalHelper f4784a;
    private Context b;
    private String c;
    private String f;
    private String d = "";
    private String e = "";
    private PackageInfo g = null;
    private String h = "";

    private GlobalHelper() {
    }

    public static GlobalHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalHelper) ipChange.ipc$dispatch("1f54a6e", new Object[0]);
        }
        if (f4784a == null) {
            synchronized (GlobalHelper.class) {
                if (f4784a == null) {
                    f4784a = new GlobalHelper();
                }
            }
        }
        return f4784a;
    }

    @Deprecated
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        if (this.b == null) {
            if (!GlobalSdkConstant.getSdkType()) {
                this.b = MspContextUtil.getContext();
            }
            LogUtil.record(4, "GlobalHelper:getContext", "mContext=" + this.b);
        }
        return this.b;
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        try {
            this.b = context.getApplicationContext();
            UserLocation.locationInit(context, false);
            this.d = context.getPackageName();
            LogUtil.record(2, "GlobalHelper::Init", "Initialization complete");
            if (!GlobalSdkConstant.getSdkType() || !TextUtils.isEmpty(this.h) || a()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.b != null) {
                this.h = this.b.getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getString("msp_app_id");
            } else {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "SDKAppIdLoadFail", "ContextNull");
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String[] strArr = new String[6];
            strArr[0] = "appName";
            String str = "-";
            strArr[1] = TextUtils.isEmpty(this.d) ? str : this.d;
            strArr[2] = "appId";
            if (!TextUtils.isEmpty(this.h)) {
                str = this.h;
            }
            strArr[3] = str;
            strArr[4] = "costTime";
            strArr[5] = String.valueOf(currentTimeMillis2);
            EventLogUtil.logPayEvent("103624", strArr);
            LogUtil.record(8, "GlobalHelper:loadAppIdForSDK", "appId=" + this.h + ", cost=" + currentTimeMillis2);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public String getConfigSDKAppId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5150addf", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.h) && !a()) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "SDKAppIdEmpty", "");
        }
        LogUtil.record(8, "GlobalHelper:getConfigSDKAppId", "appId=" + this.h);
        return this.h;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : "com.taobao.taobao".equals(this.d);
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.c;
    }

    public String getStringById(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59d6a45", new Object[]{this, context, new Integer(i)});
        }
        if (context == null) {
            return "";
        }
        this.b = context;
        try {
            try {
                return PhoneCashierMspEngine.getMspBase().getResources(null).getString(i);
            } catch (Exception unused) {
                return context.getString(i);
            }
        } catch (Exception unused2) {
            return "";
        }
    }

    public String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{this, context});
        }
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        this.b = context;
        this.f = UTDevice.getUtdid(context);
        return this.f;
    }

    public String getPackageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this}) : TextUtils.isEmpty(this.d) ? "unknown" : this.d;
    }

    public String getPackageVersion() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc3cd551", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d)) {
            return "-1.-1";
        }
        if (TextUtils.isEmpty(this.e) && (context = this.b) != null) {
            try {
                this.e = context.getPackageManager().getPackageInfo(this.d, 64).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        return TextUtils.isEmpty(this.e) ? "-1.-1" : this.e;
    }

    public PackageInfo getPackageInfo() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("4454a4a8", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d)) {
            return null;
        }
        if (this.g == null && (context = this.b) != null) {
            try {
                this.g = context.getPackageManager().getPackageInfo(this.d, 0);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return this.g;
    }
}
