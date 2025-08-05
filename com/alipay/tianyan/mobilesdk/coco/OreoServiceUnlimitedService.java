package com.alipay.tianyan.mobilesdk.coco;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.coco.OreoServiceUnlimited;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class OreoServiceUnlimitedService extends Service implements IOreoServiceUnlimited {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (OreoServiceUnlimited.shouldUseIt(this)) {
            return new OreoServiceUnlimited.WrappedBinder(null, this);
        }
        return null;
    }
}
