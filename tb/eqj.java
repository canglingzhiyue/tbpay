package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class eqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(247255958);
        emu.a("com.taobao.android.detail.datasdk.utils.sku.ServiceUtils");
    }

    public static ServiceNode.a.C0386a a(String str, List<ServiceNode.a.C0386a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceNode.a.C0386a) ipChange.ipc$dispatch("501532fe", new Object[]{str, list});
        }
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            for (ServiceNode.a.C0386a c0386a : list) {
                if (str.equals(c0386a.b)) {
                    return c0386a;
                }
            }
        }
        return null;
    }

    public static ServiceNode.b b(String str, List<ServiceNode.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceNode.b) ipChange.ipc$dispatch("c7ad0999", new Object[]{str, list});
        }
        if (eqg.a(list) || TextUtils.isEmpty(str)) {
            return null;
        }
        for (ServiceNode.b bVar : list) {
            if (str.equals(bVar.f10031a)) {
                return bVar;
            }
        }
        return null;
    }

    public static ServiceNode.b.a a(String str, ServiceNode.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceNode.b.a) ipChange.ipc$dispatch("4fc8827", new Object[]{str, bVar});
        }
        if (bVar != null && !eqg.a(bVar.d)) {
            Iterator<ServiceNode.b.a> it = bVar.d.iterator();
            while (it.hasNext()) {
                ServiceNode.b.a next = it.next();
                if (eqg.a(next.f10033a, str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf("|");
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return str.substring(0, indexOf);
    }

    public static String b(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf("|")) < 0) {
            return "0";
        }
        String substring = str.substring(indexOf + 1);
        return TextUtils.isEmpty(substring) ? "0" : substring;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            return str + "|0";
        }
        return str + "|" + str2;
    }

    public static String a(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("80c38867", new Object[]{list}) : eqg.a(list) ? "" : eqh.a(list, "-");
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (eqg.a(str, str2)) {
            return true;
        }
        return (eqg.a(str, "0") || TextUtils.isEmpty(str)) && (eqg.a(str2, "0") || TextUtils.isEmpty(str2));
    }
}
