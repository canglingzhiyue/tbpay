package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class eqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(736491574);
        emu.a("com.taobao.android.detail.datasdk.utils.sku.PpathUtils");
    }

    public static Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (eqg.a(map)) {
            return concurrentHashMap;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            concurrentHashMap.put(a(entry.getKey()), entry.getValue());
        }
        return concurrentHashMap;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : a(Arrays.asList(str.split(";")));
    }

    public static String a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{list});
        }
        Collections.sort(list, new Comparator<String>() { // from class: tb.eqi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, str, str2})).intValue() : a(str, str2);
            }

            public int a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue() : eqi.b(str) - eqi.b(str2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(";");
            sb.append(str);
        }
        return sb.substring(1);
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue() : Integer.valueOf(c(str)).intValue();
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(":");
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return str.substring(0, indexOf);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str}) : StringUtils.isEmpty(str) ? "" : str.substring(str.indexOf(":") + 1);
    }

    public static List<String> a(String str, List<SkuBaseNode.SkuIdPropPath> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bf7c52c4", new Object[]{str, list});
        }
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        if (!StringUtils.isEmpty(str) && list != null) {
            for (SkuBaseNode.SkuIdPropPath skuIdPropPath : list) {
                if (eqg.a(skuIdPropPath.skuId, str)) {
                    str2 = skuIdPropPath.propPath;
                }
            }
        }
        if (!StringUtils.isEmpty(str2)) {
            for (String str3 : str2.split(";")) {
                arrayList.add(str3);
            }
        }
        return arrayList;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return "";
        }
        return str + ":" + str2;
    }
}
