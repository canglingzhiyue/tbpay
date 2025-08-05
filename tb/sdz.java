package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.utils.n;
import com.taobao.infoflow.core.engine.env.protocol.a;
import com.taobao.tao.Globals;

/* loaded from: classes8.dex */
public class sdz implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1646193585);
        kge.a(1816321617);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.a
    public boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue() : ABGlobal.a(Globals.getApplication(), str, str2, str3);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.a
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            return n.n().a(str);
        } catch (Throwable th) {
            e.a("TbDefaultInfoFlowAbGlobal", "FeatureOpenedByServer error:", th);
            return false;
        }
    }
}
