package com.alipay.mobile.common.logging.process;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.util.ToolThreadUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LogReceiverInToolsProcess extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        TraceLogger traceLogger;
        String valueOf;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        ToolThreadUtils.getInstance(LoggerFactory.getLogContext().getApplicationContext()).start(true);
        TianyanLoggingStatus.acceptTimeTicksMadly();
        if (context == null || intent == null) {
            return;
        }
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        if (TextUtils.isEmpty(action) || extras == null) {
            return;
        }
        LoggerFactory.getTraceLogger().info("LogReceiverInTools", "action: ".concat(String.valueOf(action)));
        if (action.equals(context.getPackageName() + LogContext.ACTION_MONITOR_COMMAND)) {
            String string = extras.getString("action");
            if (!TextUtils.isEmpty(string)) {
                String string2 = extras.getString("filePath");
                String string3 = extras.getString("callStack");
                boolean z = extras.getBoolean("isBoot");
                Intent intent2 = new Intent();
                intent2.setClassName(context, LogContext.TOOLS_SERVICE_CLASS_NAME);
                intent2.setAction(string);
                intent2.putExtra("filePath", string2);
                intent2.putExtra("callStack", string3);
                intent2.putExtra("isBoot", z);
                try {
                    intent2.setPackage(context.getPackageName());
                } catch (Throwable unused) {
                }
                try {
                    if (context.startService(intent2) == null) {
                        LoggerFactory.getTraceLogger().error("LogReceiverInTools", "fail to start LogServiceInToolsProcess: ".concat(String.valueOf(action)));
                    }
                } catch (Throwable th) {
                    LoggerFactory.getTraceLogger().error("LogReceiverInTools", th);
                }
                ToolThreadUtils.getInstance(context).end();
            }
            traceLogger = LoggerFactory.getTraceLogger();
            valueOf = String.valueOf(action);
            str = "none extra action: ";
        } else {
            traceLogger = LoggerFactory.getTraceLogger();
            valueOf = String.valueOf(action);
            str = "no such action: ";
        }
        traceLogger.error("LogReceiverInTools", str.concat(valueOf));
        ToolThreadUtils.getInstance(context).end();
    }
}
