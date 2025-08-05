package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, jpk> f29675a = new HashMap();

    static {
        kge.a(777977686);
    }

    public synchronized void a(jpk jpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd28cd3", new Object[]{this, jpkVar});
            return;
        }
        String a2 = jpkVar.a();
        if (!TextUtils.isEmpty(a2)) {
            this.f29675a.put(a2, jpkVar);
        }
    }

    public void a(String str, Object obj) {
        jpk jpkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (TextUtils.isEmpty(str) || (jpkVar = this.f29675a.get(str)) == null) {
        } else {
            jpkVar.a(obj);
        }
    }
}
