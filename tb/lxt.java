package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class lxt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f30976a;

    static {
        kge.a(-94562894);
        f30976a = new HashSet();
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject != null && !StringUtils.isEmpty(jSONObject.getString("monitorCard"))) {
            f30976a = new HashSet(Arrays.asList(jSONObject.getString("monitorCard").split(",")));
        } else {
            HashSet hashSet = new HashSet(1);
            hashSet.add("home_0_guess_0");
            f30976a = hashSet;
        }
    }
}
