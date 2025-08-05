package tb;

import com.alibaba.android.ultron.ext.event.util.e;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public class bir implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f25933a;

    static {
        kge.a(1582474247);
        kge.a(698222205);
        f25933a = "ultroncommonpage";
    }

    @Override // com.alibaba.android.ultron.ext.event.util.e
    public void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d74f5", new Object[]{this, str, str2, str3, str4, map});
            return;
        }
        try {
            bpp.a().commitFailure(str, str2, "1.0", f25933a, "", map, str3, str4);
        } catch (Throwable unused) {
        }
    }
}
