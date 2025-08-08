package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class mtf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static mtd f31240a;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            mti.a().a(context);
        } catch (Throwable unused) {
        }
    }

    public static HashMap<String, String> a() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[0]);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String a2 = mti.a().a("forward_domains", "");
        if (!StringUtils.isEmpty(a2)) {
            for (String str : a2.split(",")) {
                String a3 = mti.a().a(str, "");
                if (!StringUtils.isEmpty(a3)) {
                    hashMap.put(str, a3);
                }
            }
        }
        return hashMap;
    }

    public static void a(mtd mtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f526461b", new Object[]{mtdVar});
        } else {
            f31240a = mtdVar;
        }
    }

    public static mtd b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mtd) ipChange.ipc$dispatch("16b99680", new Object[0]);
        }
        mtd mtdVar = f31240a;
        return mtdVar != null ? mtdVar : new mtg();
    }
}
