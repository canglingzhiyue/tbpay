package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.utils.b;
import java.io.File;

/* loaded from: classes4.dex */
public class djv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1601590875);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || str.contains("http:") || str.contains(b.HTTPS_SCHEMA)) {
            return false;
        }
        return new File(str).exists();
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        if (f(str)) {
            str = e(str);
        }
        return c(str) ? b(str) : str;
    }

    private static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        if (!f(str)) {
            return str;
        }
        if (!str.startsWith(ado.URL_SEPARATOR)) {
            str = ado.URL_SEPARATOR + str;
        }
        return b.HTTPS_SCHEMA + str;
    }

    private static boolean f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && !str.startsWith("http:") && !str.startsWith(b.HTTPS_SCHEMA);
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : (!StringUtils.isEmpty(str) && str.endsWith(".heic") && str.contains(".jpg")) ? str.substring(0, str.lastIndexOf(".jpg") + 4) : str;
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return str.endsWith(".heic");
        }
        return false;
    }
}
