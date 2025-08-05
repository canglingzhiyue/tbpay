package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class iji {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String[]> f29082a = new HashMap();

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
        } else {
            f29082a.put(str, strArr);
        }
    }

    public List<String> a(String str, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c87dd8c1", new Object[]{this, str, soIndexData});
        }
        ArrayList arrayList = new ArrayList();
        a(str, arrayList);
        arrayList.add(str);
        return arrayList;
    }

    private static void a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
            return;
        }
        String[] strArr = f29082a.get(str);
        if (strArr == null) {
            return;
        }
        for (String str2 : strArr) {
            if (!ikw.a((CharSequence) str2) && !list.contains(str2)) {
                a(str2, list);
                list.add(str2);
            }
        }
    }
}
