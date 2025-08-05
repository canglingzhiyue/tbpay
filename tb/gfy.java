package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class gfy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, gfx> f28315a = new HashMap();

    static {
        kge.a(-185740852);
    }

    public gfx a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("7c6fadbb", new Object[]{this, str});
        }
        gfx gfxVar = this.f28315a.get(str);
        return gfxVar == null ? gfx.e() : gfxVar;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXScriptVarObject" + this.f28315a.toString();
    }
}
