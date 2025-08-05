package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class biz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, bjc> f25936a;

    static {
        kge.a(-1951686369);
        HashMap hashMap = new HashMap(4);
        f25936a = hashMap;
        hashMap.put("empty", new bjd());
        f25936a.put("not", new bje());
        f25936a.put("and", new bja());
        f25936a.put("or", new bjf());
        f25936a.put("deleteifnull", new bjb());
    }

    public static bjc a(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("7c6d7459", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            obj = f25936a.get(str.trim().toLowerCase());
        }
        return (bjc) obj;
    }
}
