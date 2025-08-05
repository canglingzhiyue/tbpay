package com.taobao.android.trade.boost.daemon;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.global.SDKConfig;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3aa3dd3", new Object[]{mtopRequest});
        } else if (mtopRequest != null) {
            String apiName = mtopRequest.getApiName();
            String version = mtopRequest.getVersion();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder();
            if (stackTrace != null) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append(stackTraceElement.toString());
                    sb.append(",");
                }
            }
            String sb2 = sb.toString();
            new UploadStackTraceClient().execute(new c(apiName, version, sb2, null), null, SDKConfig.getInstance().getGlobalTtid());
            Log.e(b.TAG, "[MtopRuntimeInfoCollector collect], stackTrace:" + sb2);
        }
    }

    public static boolean a() {
        ApplicationInfo applicationInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Context globalContext = SDKConfig.getInstance().getGlobalContext();
        return (globalContext == null || (applicationInfo = globalContext.getApplicationContext().getApplicationInfo()) == null || (applicationInfo.flags & 2) == 0) ? false : true;
    }
}
