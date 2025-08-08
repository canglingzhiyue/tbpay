package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.bindingx.core.i;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class fqd implements i.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, i.f> f28114a = new HashMap();

    static {
        kge.a(-1061760979);
        kge.a(1853976371);
    }

    public i.f a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i.f) ipChange.ipc$dispatch("c5461a4d", new Object[]{this, str});
        }
        if (this.f28114a != null && !StringUtils.isEmpty(str)) {
            return this.f28114a.get(str);
        }
        return null;
    }

    public void c(String str, i.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1400d137", new Object[]{this, str, fVar});
            return;
        }
        if (this.f28114a == null) {
            this.f28114a = new HashMap();
        }
        this.f28114a.put(str, fVar);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.f28114a == null || StringUtils.isEmpty(str)) {
        } else {
            this.f28114a.remove(str);
        }
    }

    @Override // com.alibaba.android.bindingx.core.i.c
    public void a(String str, i.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb83f1f9", new Object[]{this, str, fVar});
        } else {
            c(str, fVar);
        }
    }

    @Override // com.alibaba.android.bindingx.core.i.c
    public void b(String str, i.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc26198", new Object[]{this, str, fVar});
        } else {
            b(str);
        }
    }

    public void a(String str, int i, int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31849d1e", new Object[]{this, str, new Integer(i), new Integer(i2), jSONObject});
            return;
        }
        i.f a2 = a(str);
        if (a2 == null) {
            return;
        }
        a2.a(i, i2);
    }

    public void b(String str, int i, int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be71b43d", new Object[]{this, str, new Integer(i), new Integer(i2), jSONObject});
            return;
        }
        i.f a2 = a(str);
        if (a2 == null) {
            return;
        }
        a2.h_();
    }

    public void c(String str, int i, int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5ecb5c", new Object[]{this, str, new Integer(i), new Integer(i2), jSONObject});
            return;
        }
        i.f a2 = a(str);
        if (a2 == null) {
            return;
        }
        a2.b(i, i2);
    }
}
