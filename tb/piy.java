package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;

/* loaded from: classes8.dex */
public class piy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1796158157);
        kge.a(1047369549);
    }

    public Object a(pkg pkgVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a48337ad", new Object[]{this, pkgVar, objArr});
        }
        if (pkgVar == null || pkgVar.f32716a == null || objArr == null || objArr.length <= 1 || !(objArr[0] instanceof TaoliveOpenLiveRoom)) {
            return null;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = (TaoliveOpenLiveRoom) objArr[0];
        pkh pkhVar = new pkh(pkgVar.f32716a, objArr[1]);
        if (taoliveOpenLiveRoom.eventCompontent != null) {
            taoliveOpenLiveRoom.eventCompontent.a(pkhVar);
        }
        return pkhVar.f32717a;
    }
}
