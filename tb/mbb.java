package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.login4android.api.Login;

/* loaded from: classes.dex */
public class mbb implements knu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(92020404);
        kge.a(-483424496);
    }

    @Override // tb.knu
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TFCCommonUtils.b(AfcCustomSdk.a().f17167a);
    }

    @Override // tb.knu
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : Login.getUserId();
    }
}
