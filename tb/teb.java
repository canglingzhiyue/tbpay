package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.i;
import com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class teb implements IMultiTabStabilityListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final i f34055a;

    static {
        kge.a(1146555156);
        kge.a(-463357167);
    }

    public teb(i iVar) {
        this.f34055a = iVar;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        int a2 = tec.a(str2);
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.KEY_ERROR_DETAIL, str3);
        g.a(str, str2, this.f34055a.b(a2), hashMap);
    }
}
