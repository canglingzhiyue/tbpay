package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import java.util.Map;

/* loaded from: classes6.dex */
public class jzg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f29880a;

    static {
        kge.a(-1956772081);
    }

    public static boolean a(imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edf4cad2", new Object[]{imnVar})).booleanValue();
        }
        if (imnVar.a().c()) {
            return imnVar.l().a();
        }
        return false;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (f29880a == null) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            k.a("WeexTestUtil", "模板名称为空");
            return "";
        }
        String str2 = f29880a.get(str);
        return str2 != null ? str2 : "";
    }
}
