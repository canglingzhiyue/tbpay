package com.alipay.bifrost;

import android.content.Context;
import android.os.Build;
import com.alipay.mars.app.AppLogic;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AppLogicICallBackImpl implements AppLogic.ICallBack {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AppLogicICallBackImpl f5221a;
    private Context b;
    private String c = "";
    private String d;
    private String e;

    @Override // com.alipay.mars.app.AppLogic.ICallBack
    public int getClientVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b23f3d1", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.mars.app.AppLogic.ICallBack
    public String getCurLanguage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("714573b7", new Object[]{this}) : "Cn";
    }

    public static AppLogicICallBackImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLogicICallBackImpl) ipChange.ipc$dispatch("d9387fcb", new Object[0]);
        }
        AppLogicICallBackImpl appLogicICallBackImpl = f5221a;
        if (appLogicICallBackImpl != null) {
            return appLogicICallBackImpl;
        }
        synchronized (AppLogicICallBackImpl.class) {
            if (f5221a != null) {
                return f5221a;
            }
            f5221a = new AppLogicICallBackImpl();
            return f5221a;
        }
    }

    public void register(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{this, context});
        } else {
            this.b = context;
        }
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    @Override // com.alipay.mars.app.AppLogic.ICallBack
    public String getAppFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c6ea2ad", new Object[]{this});
        }
        Context context = this.b;
        return context != null ? context.getFilesDir().getAbsolutePath() : "";
    }

    @Override // com.alipay.mars.app.AppLogic.ICallBack
    public AppLogic.AccountInfo getAccountInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLogic.AccountInfo) ipChange.ipc$dispatch("d7faf1d4", new Object[]{this});
        }
        long j = 0;
        try {
            j = Long.parseLong(this.c);
        } catch (Throwable unused) {
        }
        return new AppLogic.AccountInfo(j, this.c);
    }

    @Override // com.alipay.mars.app.AppLogic.ICallBack
    public AppLogic.DeviceInfo getDeviceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppLogic.DeviceInfo) ipChange.ipc$dispatch("d1a14144", new Object[]{this}) : new AppLogic.DeviceInfo(this.e, this.d);
    }

    private AppLogicICallBackImpl() {
        this.d = "";
        this.e = "";
        try {
            this.d = Build.BRAND;
            this.e = Build.MODEL;
        } catch (Throwable unused) {
        }
    }
}
