package com.alipay.mobile.common.logging.http;

import android.content.Context;
import com.alipay.mobile.common.logging.MdapLogUploadManager;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.http.BaseHttpClient;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingHolder;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LoggingHttpClientFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f5442a = "LoggingHttpClientFactory";

    public static synchronized BaseHttpClient a(String str, String str2, Context context) {
        synchronized (LoggingHttpClientFactory.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseHttpClient) ipChange.ipc$dispatch("174fe81", new Object[]{str, str2, context});
            }
            if (!LoggerFactory.getProcessInfo().isToolsProcess()) {
                String string = LoggerFactory.getLogContext().getApplicationContext().getSharedPreferences("UseLogHttpClientConfig", 4).getString("UseLogHttpClientConfig", "no");
                LoggerFactory.getTraceLogger().info(f5442a, "currVal = ".concat(String.valueOf(string)));
                if (Constants.VAL_YES.equals(string) && TianyanLoggingHolder.getInstance().getLoggingHttpClientGetter() != null) {
                    MdapLogUploadManager.a();
                    if (!MdapLogUploadManager.a(str)) {
                        BaseHttpClient httpClient = TianyanLoggingHolder.getInstance().getLoggingHttpClientGetter().getHttpClient();
                        httpClient.setContext(context);
                        httpClient.setUrl(str2);
                        LoggerFactory.getTraceLogger().info(f5442a, "use logging HttpClient");
                        return httpClient;
                    }
                }
            }
            LoggerFactory.getTraceLogger().info(f5442a, "use HttpClient");
            return new HttpClient(str2, context);
        }
    }
}
