package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class jys {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(383601538);
    }

    public abstract boolean a(Uri uri);

    public abstract String b();

    public abstract String c();

    public abstract Map<String, String> d();

    public abstract Map<String, String> e();

    public abstract String f();

    public final jyu a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyu) ipChange.ipc$dispatch("f06a8d8", new Object[]{this});
        }
        jyu jyuVar = new jyu();
        jyuVar.a(b());
        jyuVar.b(c());
        Map<String, String> e = e();
        HashMap hashMap = new HashMap();
        b.a(imo.b(), (Map<String, String>) hashMap, f(), false);
        e.putAll(hashMap);
        jyuVar.a(e);
        Map<String, String> d = d();
        if (d != null) {
            d.putAll(hashMap);
        }
        jyuVar.b(d);
        return jyuVar;
    }
}
