package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import java.util.Map;

/* loaded from: classes8.dex */
public class pja {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(141954457);
        kge.a(1047369549);
    }

    public Object a(pkg pkgVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a48337ad", new Object[]{this, pkgVar, objArr});
        }
        if (pkgVar == null || pkgVar.f32716a == null || objArr == null || !(objArr[0] instanceof Map)) {
            return null;
        }
        Map map = (Map) objArr[0];
        Object obj = map.get("activity");
        Object obj2 = map.get("url");
        Object obj3 = map.get(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        Object obj4 = map.get("taoliveOpenLiveRoom");
        Object obj5 = map.get("tLiveRoomConfig");
        if (obj3 != null) {
            if (!(obj instanceof Activity) || !(obj3 instanceof Intent) || !(obj4 instanceof TaoliveOpenLiveRoom)) {
                return null;
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = (TaoliveOpenLiveRoom) obj4;
            pjr pjrVar = new pjr((Activity) obj, (Intent) obj3, taoliveOpenLiveRoom);
            if (taoliveOpenLiveRoom.eventCompontent != null) {
                taoliveOpenLiveRoom.eventCompontent.a(pjrVar);
            }
            if (taoliveOpenLiveRoom.eventCompontent != null) {
                taoliveOpenLiveRoom.eventCompontent.a(pkgVar.e);
            }
            return pjrVar.a();
        } else if (!(obj instanceof Activity) || !(obj2 instanceof String) || !(obj4 instanceof TaoliveOpenLiveRoom)) {
            return null;
        } else {
            TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = (TaoliveOpenLiveRoom) obj4;
            pjr pjrVar2 = new pjr((Activity) obj, String.valueOf(obj2), (pla) obj5, taoliveOpenLiveRoom2);
            if (taoliveOpenLiveRoom2.eventCompontent != null) {
                taoliveOpenLiveRoom2.eventCompontent.a(pjrVar2);
            }
            if (taoliveOpenLiveRoom2.eventCompontent != null) {
                taoliveOpenLiveRoom2.eventCompontent.a(pkgVar.e);
            }
            return pjrVar2.a();
        }
    }
}
