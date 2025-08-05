package com.alipay.mobile.common.logging.impl;

import android.os.Process;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.framework.MpaasClassInfo;
import tb.fxb;
import tb.riy;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class TraceLogEvent extends LogEvent {
    private static final long serialVersionUID = 1;
    private static ThreadLocal<StringBuilder> threadBuilder = new ThreadLocal<>();

    public TraceLogEvent(String str, LogEvent.Level level, String str2, String str3) {
        StringBuilder sb = threadBuilder.get();
        if (sb == null) {
            sb = new StringBuilder();
            threadBuilder.set(sb);
        }
        long currentTimeMillis = System.currentTimeMillis();
        int myTid = Process.myTid();
        String name = Thread.currentThread().getName();
        sb.append(currentTimeMillis);
        sb.append(' ');
        sb.append(level);
        sb.append(fxb.DIR);
        sb.append(str);
        sb.append(riy.CONDITION_IF_MIDDLE);
        sb.append('[');
        sb.append(myTid);
        sb.append(riy.CONDITION_IF_MIDDLE);
        sb.append(name);
        sb.append("] ");
        sb.append(str2);
        if (str3 != null) {
            sb.append(" ");
            sb.append(str3);
        }
        String sb2 = sb.toString();
        sb.setLength(0);
        this.category = LogCategory.CATEGORY_APPLOG;
        this.tag = str;
        this.level = level;
        this.timeStamp = currentTimeMillis;
        this.message = sb2;
    }
}
