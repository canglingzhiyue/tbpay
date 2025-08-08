package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.dinamic.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class fnq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, fnl> f28081a;

    static {
        kge.a(1183468094);
        HashMap hashMap = new HashMap();
        f28081a = hashMap;
        hashMap.put("data", new fnr());
        f28081a.put("const", new fno());
        f28081a.put("subdata", new fnu());
        f28081a.put("appstyle", new fnm());
        f28081a.put("and", new fob());
        f28081a.put("eq", new foi());
        f28081a.put("len", new foq());
        f28081a.put("not", new fos());
        f28081a.put("else", new foh());
        f28081a.put("if", new Cfor());
        f28081a.put("lc", new fov());
        f28081a.put("uc", new fox());
        f28081a.put("concat", new fou());
        f28081a.put("triple", new foz());
        f28081a.put("substr", new fow());
        f28081a.put("afnd", new foj());
        f28081a.put("aget", new fok());
        f28081a.put("dget", new fok());
        f28081a.put("or", new fot());
        f28081a.put("trim", new foy());
        f28081a.put("flt", new fof());
        f28081a.put("flte", new fog());
        f28081a.put("fgte", new foe());
        f28081a.put("fgt", new fod());
        f28081a.put("feq", new foc());
        f28081a.put("igte", new fon());
        f28081a.put("igt", new fom());
        f28081a.put("ilte", new fop());
        f28081a.put("ilt", new foo());
        f28081a.put("ieq", new fol());
        f28081a.put(f.SIZE_BY_FACTOR, new fnt());
        f28081a.put(f.IS_ELDER, new fns());
    }

    public static void a(String str, fnl fnlVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cde57e", new Object[]{str, fnlVar});
        } else if (StringUtils.isEmpty(str) || fnlVar == null) {
            throw new DinamicException("prefix or parser is null");
        } else {
            if (f28081a.get(str) != null) {
                throw new DinamicException("registerParser failed, parser already register by current identify:" + str);
            }
            f28081a.put(str, fnlVar);
        }
    }

    public static void b(String str, fnl fnlVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db6adbf", new Object[]{str, fnlVar});
        } else if (StringUtils.isEmpty(str) || fnlVar == null) {
            throw new DinamicException("prefix or parser is null");
        } else {
            f28081a.put(str, fnlVar);
        }
    }

    public static fnp a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fnp) ipChange.ipc$dispatch("7c6f566c", new Object[]{str}) : f28081a.get(str);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : f28081a.containsKey(str);
    }
}
