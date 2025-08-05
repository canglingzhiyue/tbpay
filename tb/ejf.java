package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes4.dex */
public class ejf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f27341a;
    private static int b;

    static {
        kge.a(-1484831362);
        emu.a("com.taobao.android.detail.core.standard.base.api.common.LogTool");
    }

    private static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bded401", new Object[]{str, str2});
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (a()) {
            a(new Throwable().getStackTrace());
            stringBuffer.append(riy.ARRAY_START_STR);
            stringBuffer.append(f27341a);
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
        f27341a = stackTraceElementArr[2].getFileName();
        b = stackTraceElementArr[2].getLineNumber();
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            i.d("detail-aura", d(str, str2));
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            i.c("detail-aura", d(str, str2));
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else {
            i.a("detail-aura", d(str, str2));
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : jqm.a();
    }
}
