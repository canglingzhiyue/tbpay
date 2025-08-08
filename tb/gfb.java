package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bj;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: classes5.dex */
public class gfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(111954231);
    }

    public static boolean a(String str, Object obj, Object obj2, bj bjVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("183bb562", new Object[]{str, obj, obj2, bjVar})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && obj != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".[]", false);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (stringTokenizer.hasMoreTokens()) {
                    obj = a(obj, nextToken, bjVar);
                } else {
                    return b(nextToken, obj, obj2, bjVar);
                }
            }
        }
        return false;
    }

    public static Object a(Object obj, String str, bj bjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("16b34ef0", new Object[]{obj, str, bjVar});
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof List) {
            return ((List) obj).get(Integer.parseInt(str));
        }
        if (bjVar != null) {
            return bjVar.getValue(obj, str);
        }
        throw new RuntimeException("getValue 不支持的类型");
    }

    public static boolean b(String str, Object obj, Object obj2, bj bjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de663e23", new Object[]{str, obj, obj2, bjVar})).booleanValue();
        }
        if (obj instanceof Map) {
            ((Map) obj).put(str, obj2);
            return true;
        } else if (obj instanceof List) {
            ((List) obj).add(Integer.parseInt(str), obj2);
            return true;
        } else if (bjVar != null) {
            return bjVar.setValue(obj, str, obj2);
        } else {
            throw new RuntimeException("setValue 不支持的类型");
        }
    }
}
