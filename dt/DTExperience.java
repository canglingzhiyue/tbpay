package dt;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class DTExperience {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f24788a;

    /* loaded from: classes9.dex */
    public enum LogType {
        ERROR,
        WARN,
        DEBUG,
        INFO
    }

    /* loaded from: classes9.dex */
    public interface a {
        long a(com.taobao.taobaoavsdk.widget.media.c cVar, long j, long j2, Map<String, String> map);

        String a(com.taobao.taobaoavsdk.widget.media.c cVar, Map<String, String> map, String str);

        String a(String str);

        String a(String str, String str2, String str3, String str4);

        String a(Map<String, String> map, String str, String str2, String str3);

        HashMap<String, String> a();

        boolean a(String str, String str2);

        String b();
    }

    static {
        kge.a(-1808410311);
        f24788a = null;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cea35423", new Object[0]) : f24788a;
    }
}
