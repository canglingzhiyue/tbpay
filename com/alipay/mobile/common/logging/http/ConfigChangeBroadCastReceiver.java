package com.alipay.mobile.common.logging.http;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.strategy.LogLengthConfig;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ConfigChangeBroadCastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ConfigChangeBroadCastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        LoggerFactory.getTraceLogger().info(TAG, "onReceive resetUploadUrl");
        UploadUrlConfig a2 = UploadUrlConfig.a();
        a2.f5443a = false;
        a2.b = false;
        LogLengthConfig a3 = LogLengthConfig.a();
        if (Constants.VAL_YES.equals(LoggerFactory.getLogContext().getApplicationContext().getSharedPreferences("UseLogHttpClientConfig", 0).getString("LogLengthLimitDisable", "no"))) {
            a3.f5453a = false;
        } else {
            a3.f5453a = true;
        }
    }
}
