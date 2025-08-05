package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class bkm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_KEY_COMP = "comp";
    public static final String PARSER_KEY_DATA = "data";
    public static final String PARSER_KEY_DX_DATA = "dxData";
    public static final String PARSER_KEY_DX_PARENT_DATA = "parentDxData";
    public static final String PARSER_KEY_DX_SUBDATA = "dxSubdata";
    public static final String PARSER_KEY_LOCAL = "local";
    public static final String PARSER_KEY_PARENT_KEY = "parentKey";
    public static final String PARSER_KEY_ULTRON_GLOBAL = "ultronGlobal";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, bkl> f25952a;

    static {
        kge.a(-1668188389);
        f25952a = new HashMap();
        bkc bkcVar = new bkc();
        f25952a.put("data", bkcVar);
        f25952a.put(PARSER_KEY_COMP, bkcVar);
        f25952a.put(PARSER_KEY_DX_SUBDATA, bkcVar);
        f25952a.put(PARSER_KEY_DX_DATA, bkcVar);
        f25952a.put(PARSER_KEY_ULTRON_GLOBAL, bkcVar);
        f25952a.put("local", new bkh());
        f25952a.put(PARSER_KEY_DX_PARENT_DATA, new bkj());
        f25952a.put(PARSER_KEY_PARENT_KEY, new bkk());
    }

    public static bkl a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bkl) ipChange.ipc$dispatch("7c6d7931", new Object[]{str}) : f25952a.get(str);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : f25952a.containsKey(str);
    }
}
