package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Class<? extends jxt>> f29851a = new HashMap();

    static {
        kge.a(-1408742855);
    }

    public void a(String str, Class<? extends jxt> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{this, str, cls});
        } else if (TextUtils.isEmpty(str) || cls == null) {
        } else {
            this.f29851a.put(str, cls);
        }
    }

    public Class<? extends jxt> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("582938df", new Object[]{this, str}) : this.f29851a.get(str);
    }
}
