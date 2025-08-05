package tb;

import com.alilive.adapter.business.b;
import com.alilive.adapter.business.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.taolive.sdk.adapter.network.d;

/* loaded from: classes8.dex */
public class ozy implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1496235568);
        kge.a(1341345484);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : (!TBRevisionSwitchManager.i().a(ilw.KEY_NEW_CONTENT_ENABLE) || !psm.k()) ? 0 : 1;
    }

    @Override // com.alilive.adapter.business.c
    public b a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d6b41a62", new Object[]{this, dVar});
        }
        if (1 == a()) {
            if (!b()) {
                return null;
            }
            return f.p().createTBFollowGuangBusiness(dVar);
        } else if (!b()) {
            return null;
        } else {
            return f.p().createTBFollowBusiness(dVar);
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : com.taobao.android.live.plugin.proxy.c.a().d() && f.p() != null;
    }
}
