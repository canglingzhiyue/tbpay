package com.taobao.android.detail.industry.tool;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.arc;
import tb.jqm;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f10121a;
    private static int b;

    static {
        kge.a(-1318583920);
    }

    private static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{str, str2});
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (a()) {
            a(new Throwable().getStackTrace());
            stringBuffer.append(riy.ARRAY_START_STR);
            stringBuffer.append(f10121a);
            stringBuffer.append(" L");
            stringBuffer.append(b);
            stringBuffer.append("] ");
        }
        stringBuffer.append(str);
        stringBuffer.append(ResponseProtocolType.COMMENT);
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    private static void a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cccacb29", new Object[]{stackTraceElementArr});
            return;
        }
        f10121a = stackTraceElementArr[2].getFileName();
        b = stackTraceElementArr[2].getLineNumber();
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            arc.a().a("detail-industry", c(str, str2), "");
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            arc.a().e("detail-industry", c(str, str2), "");
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            arc.a().c("detail-industry", c(str, str2), "");
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : jqm.a();
    }
}
