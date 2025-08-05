package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.infoflow.core.engine.env.protocol.i;

/* loaded from: classes8.dex */
public class sdx implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-327796604);
        kge.a(-1762681923);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.i
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : j.a(str, str2);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.i
    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue() : j.a(str, i);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.i
    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue() : j.a(str, z);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.i
    public float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{this, str, new Float(f)})).floatValue();
        }
        try {
            return Float.parseFloat(a(str, f + ""));
        } catch (Throwable unused) {
            return f;
        }
    }
}
