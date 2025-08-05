package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;

/* loaded from: classes8.dex */
public class piv extends piw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2101754210);
    }

    public Object a(pkg pkgVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a48337ad", new Object[]{this, pkgVar, objArr});
        }
        pju pjuVar = new pju();
        pjv pjvVar = new pjv(pkgVar);
        return TaoliveOpenLiveRoom.builder().a(pkgVar).a(pjuVar).a(pjvVar).a(new pjw().a(pkgVar)).a(new pjt().a(pkgVar)).a(pkgVar.b).a();
    }
}
