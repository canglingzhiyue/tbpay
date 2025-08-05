package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.b;
import com.taobao.pha.core.j;
import com.taobao.tao.Globals;

/* loaded from: classes.dex */
public class nhp implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-319967147);
        kge.a(-36243202);
    }

    @Override // com.taobao.pha.core.j
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : b.b(Globals.getApplication()).editionCode;
    }
}
