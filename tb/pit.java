package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.single.d;

/* loaded from: classes8.dex */
public class pit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1522829798);
        kge.a(1047369549);
    }

    public Object a(pkg pkgVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a48337ad", new Object[]{this, pkgVar, objArr});
        }
        if (pkgVar == null || pkgVar.f32716a == null || objArr == null || objArr.length <= 0 || !(objArr[0] instanceof TaoliveOpenLiveRoom)) {
            return null;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = (TaoliveOpenLiveRoom) objArr[0];
        d dVar = new d();
        dVar.a(pkgVar.f32716a, taoliveOpenLiveRoom);
        if (taoliveOpenLiveRoom.eventCompontent != null) {
            taoliveOpenLiveRoom.eventCompontent.a(new pjy(dVar));
        }
        if (taoliveOpenLiveRoom.eventCompontent != null) {
            taoliveOpenLiveRoom.eventCompontent.a(pkgVar.e);
        }
        return dVar.f21667a;
    }
}
