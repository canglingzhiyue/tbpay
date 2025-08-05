package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class glq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, glo> f28371a;

    static {
        kge.a(1471820324);
        HashMap hashMap = new HashMap();
        f28371a = hashMap;
        hashMap.put("eventParam", new glv());
        f28371a.put("callbackParam", new glt());
        f28371a.put("const", new glp());
        f28371a.put("and", new gko());
        f28371a.put("eq", new gkv());
        f28371a.put("len", new gld());
        f28371a.put("not", new glf());
        f28371a.put("else", new gku());
        f28371a.put("if", new gle());
        f28371a.put("lc", new gli());
        f28371a.put("uc", new glk());
        f28371a.put("concat", new glh());
        f28371a.put("triple", new glm());
        f28371a.put("substr", new glj());
        f28371a.put("afnd", new gkw());
        f28371a.put("aget", new gkx());
        f28371a.put("dget", new gkx());
        f28371a.put("or", new glg());
        f28371a.put("trim", new gll());
        f28371a.put("flt", new gks());
        f28371a.put("flte", new gkt());
        f28371a.put("fgte", new gkr());
        f28371a.put("fgt", new gkq());
        f28371a.put("feq", new gkp());
        f28371a.put("igte", new gla());
        f28371a.put("igt", new gkz());
        f28371a.put("ilte", new glc());
        f28371a.put("ilt", new glb());
        f28371a.put("ieq", new gky());
    }

    public static gmg a(String str) {
        IpChange ipChange = $ipChange;
        return (gmg) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7c6fc5f3", new Object[]{str}) : f28371a.get(str));
    }
}
