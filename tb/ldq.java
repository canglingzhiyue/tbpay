package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.lkn;

/* loaded from: classes.dex */
public class ldq implements lkn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, lkn.a> f30506a;

    static {
        kge.a(1481440191);
        kge.a(1872926728);
        f30506a = new ConcurrentHashMap();
    }

    @Override // tb.lkn
    public void a(String str, lkn.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffbd82d6", new Object[]{this, str, aVar});
        } else if (f30506a.containsKey(str) && lcz.b()) {
            throw new InfoFlowRuntimeException("重复注册 BridgeApiPlugin ： " + str);
        } else {
            f30506a.put(str, aVar);
        }
    }

    @Override // tb.lkn
    public boolean a(String str, lkn.b bVar, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9579981", new Object[]{this, str, bVar, interfaceC0670a})).booleanValue();
        }
        lkn.a aVar = f30506a.get(str);
        if (aVar != null) {
            return aVar.a(bVar, interfaceC0670a);
        }
        ldf.d("BridgeInvokerImpl", "invoke bridgeApiPlugin is null. pluginName : " + str);
        return false;
    }
}
