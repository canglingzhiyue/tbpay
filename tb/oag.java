package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class oag {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f31870a;

    static {
        kge.a(372797512);
        f31870a = new ArrayList();
    }

    public static synchronized String a(String str) {
        synchronized (oag.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
            }
            if (f31870a != null && !StringUtils.isEmpty(str)) {
                ArrayList arrayList = new ArrayList(f31870a);
                for (int i = 0; i < arrayList.size(); i++) {
                    str = str.replace((String) arrayList.get(i), "");
                }
                return str;
            }
            return str;
        }
    }

    public static synchronized void a(List<String> list) {
        synchronized (oag.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{list});
            } else {
                f31870a = list == null ? null : new ArrayList(list);
            }
        }
    }
}
