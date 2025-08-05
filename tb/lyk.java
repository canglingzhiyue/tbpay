package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class lyk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f30994a;
    private static Map<String, Map> b = new HashMap();

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
            return;
        }
        String str2 = str + "  " + a(objArr);
    }

    private static String a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2583e9f7", new Object[]{objArr});
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (objArr != null) {
            for (Object obj : objArr) {
                stringBuffer.append(obj);
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }
}
