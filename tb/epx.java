package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.TraceDatasNode;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class epx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1932501328);
        emu.a("com.taobao.android.detail.datasdk.utils.DetailMonitorUtils");
    }

    public static void a(Context context, String str, List<b> list) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1572f1b", new Object[]{context, str, list});
        } else if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder("componentList=");
            TraceDatasNode traceDatasNode = null;
            boolean z = false;
            for (b bVar : list) {
                if (bVar.component != null) {
                    str2 = bVar.component.key + riy.PLUS + bVar.component.ruleId;
                } else if (bVar.dmComponent != null) {
                    str2 = eoy.a(bVar.dmComponent) + riy.PLUS + eoy.b(bVar.dmComponent);
                } else {
                    str2 = null;
                }
                if (bVar.mNodeBundle != null && (traceDatasNode != null || (traceDatasNode = eqb.r(bVar.mNodeBundle)) != null)) {
                    Iterator<String> it = traceDatasNode.trackData.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (str2.equalsIgnoreCase(it.next())) {
                            sb.append(str2);
                            sb.append(";");
                            z = true;
                            break;
                        }
                    }
                }
            }
            if (!z) {
                return;
            }
            eps.a(context, "Page_Detail", 19999, "Page_Detail-Monitor", null, null, sb.toString());
        }
    }

    public static void a(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{context, str, map});
        } else if (map == null) {
        } else {
            eps.a(context, "Page_Detail", 2201, "Page_Detail-Monitor", null, null, a(map));
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (map == null) {
        } else {
            eps.b("Page_Detail", 2201, "Page_Detail-Monitor", null, null, a(map));
        }
    }

    public static void a(Context context, String str, b bVar) {
        TraceDatasNode traceDatasNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b3bf892", new Object[]{context, str, bVar});
        } else if (bVar != null && bVar.mNodeBundle != null && (traceDatasNode = (TraceDatasNode) bVar.mNodeBundle.b(TraceDatasNode.TAG, TraceDatasNode.class)) != null) {
            String str2 = bVar.component == null ? eoy.a(bVar.dmComponent) + riy.PLUS + eoy.b(bVar.dmComponent) : bVar.component.key + riy.PLUS + bVar.component.ruleId;
            for (String str3 : traceDatasNode.trackData.keySet()) {
                if (str2.equalsIgnoreCase(str3)) {
                    eps.a(context, "Page_Detail", 2101, "Page_Detail-Monitor", null, null, "module=" + str2);
                    return;
                }
            }
        }
    }

    private static String[] a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ab7e78ac", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String[] strArr = {""};
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        int i = 0;
        for (Map.Entry<String, String> entry : entrySet) {
            if (i == entrySet.size() - 1) {
                strArr[0] = strArr[0] + entry.getKey() + "=" + entry.getValue();
            } else {
                strArr[0] = strArr[0] + entry.getKey() + "=" + entry.getValue() + ",";
            }
            i++;
        }
        return strArr;
    }
}
