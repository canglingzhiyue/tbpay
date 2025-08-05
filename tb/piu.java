package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.au;
import com.taobao.taolive.room.utils.v;
import java.util.Map;

/* loaded from: classes8.dex */
public class piu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1650236531);
        kge.a(1047369549);
    }

    public Object a(pkg pkgVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a48337ad", new Object[]{this, pkgVar, objArr});
        }
        if (objArr == null || !(objArr[0] instanceof pkd)) {
            return null;
        }
        pkd pkdVar = (pkd) objArr[0];
        if ((objArr[1] instanceof AccessListenerEnum) && pkdVar.a() != null) {
            a(pkdVar, objArr);
        }
        if ((objArr[1] instanceof PlatformListenerEnum) && pkdVar.b() != null) {
            return b(pkdVar, objArr);
        }
        return null;
    }

    private void a(pkd pkdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273a8262", new Object[]{this, pkdVar, objArr});
        } else if (!(objArr[1] instanceof AccessListenerEnum) || pkdVar.a() == null) {
        } else {
            AccessListenerEnum accessListenerEnum = (AccessListenerEnum) objArr[1];
            pjf b = pkdVar.a().b();
            pjg a2 = pkdVar.a().a();
            pji c = pkdVar.a().c();
            ssr d = pkdVar.a().d();
            Object[] objArr2 = objArr[2] != null ? (Object[]) objArr[2] : null;
            switch (accessListenerEnum) {
                case onVerticalScrollDisable:
                    if (c == null) {
                        return;
                    }
                    c.z();
                    return;
                case onVerticalScrollEnable:
                    if (c == null) {
                        return;
                    }
                    c.cO_();
                    return;
                case onHorizontalScrollEnable:
                    if (c == null) {
                        return;
                    }
                    c.n();
                    return;
                case onHorizontalScrollDisable:
                    if (c == null) {
                        return;
                    }
                    c.o();
                    return;
                case onUnfollowAciton:
                    if (a2 == null || objArr2 == null || objArr2.length <= 0 || !(objArr2[0] instanceof Map)) {
                        return;
                    }
                    Map map = (Map) objArr2[0];
                    a2.b((String) map.get("accountId"), (String) map.get("accountType"), (String) map.get("followSource"));
                    return;
                case onFollowAction:
                    if (a2 == null || objArr2 == null || objArr2.length <= 0 || !(objArr2[0] instanceof Map)) {
                        return;
                    }
                    Map map2 = (Map) objArr2[0];
                    a2.a((String) map2.get("accountId"), (String) map2.get("accountType"), (String) map2.get("followSource"));
                    return;
                case onLiveRoomMuteAction:
                    if (d == null || objArr2 == null || objArr2.length <= 0 || !(objArr2[0] instanceof Map)) {
                        return;
                    }
                    d.a((Map) objArr2[0]);
                    return;
                case onLiveRoomWatchCountChange:
                    if (a2 == null || objArr2 == null || objArr2.length <= 0 || !(objArr2[0] instanceof Map)) {
                        return;
                    }
                    a2.a((String) ((Map) objArr2[0]).get("watchNumberDes"));
                    return;
                case onClickCleanScreen:
                    if (a2 == null || objArr2 == null || objArr2.length <= 0 || !(objArr2[0] instanceof Boolean)) {
                        return;
                    }
                    a2.b(((Boolean) objArr2[0]).booleanValue());
                    return;
                case onFloatViewShow:
                    if (d == null) {
                        return;
                    }
                    d.a();
                    return;
                case onLive:
                    if (b == null) {
                        return;
                    }
                    b.e();
                    return;
                case onReplay:
                    if (b == null) {
                        return;
                    }
                    b.f();
                    return;
                case onPrelive:
                    if (b == null) {
                        return;
                    }
                    b.g();
                    return;
                case streamPlay:
                    if (b == null) {
                        return;
                    }
                    b.cQ_();
                    return;
                case liveRoomEnd:
                    if (b == null) {
                        return;
                    }
                    b.aQ_();
                    return;
                case playerError:
                    if (b == null) {
                        return;
                    }
                    b.d();
                    return;
                case streamPause:
                    if (b == null) {
                        return;
                    }
                    b.b();
                    return;
                case liveRoomUserLeave:
                    if (b == null) {
                        return;
                    }
                    b.h();
                    return;
                case playerFirstFrameRender:
                    if (b == null) {
                        return;
                    }
                    b.c();
                    return;
                case onRecieveDetailResponse:
                    if (objArr2 == null || objArr2.length <= 0 || objArr2[0] == null) {
                        return;
                    }
                    pkdVar.a().a(objArr2[0]);
                    return;
                case postInteractiveMsg:
                    if (d == null || objArr2 == null || objArr2.length <= 0) {
                        return;
                    }
                    d.a(au.a(objArr2[0], (Map) null), au.a(objArr2[1], (Map) null));
                    return;
                case mtopRequestSuccess:
                    a(objArr2, AccessListenerEnum.mtopRequestSuccess, d);
                    return;
                case mtopRequestFail:
                    a(objArr2, AccessListenerEnum.mtopRequestFail, d);
                    return;
                default:
                    return;
            }
        }
    }

    private void a(Object[] objArr, AccessListenerEnum accessListenerEnum, ssr ssrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54896a74", new Object[]{this, objArr, accessListenerEnum, ssrVar});
        } else if (objArr == null || objArr.length <= 0 || objArr[0] == null || ssrVar == null) {
        } else {
            if (accessListenerEnum == AccessListenerEnum.mtopRequestSuccess) {
                ssrVar.a(objArr[0]);
            } else if (accessListenerEnum != AccessListenerEnum.mtopRequestFail) {
            } else {
                ssrVar.b(objArr[0]);
            }
        }
    }

    private Object b(pkd pkdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9eb2ff11", new Object[]{this, pkdVar, objArr});
        }
        if ((objArr[1] instanceof PlatformListenerEnum) && pkdVar.b() != null) {
            PlatformListenerEnum platformListenerEnum = (PlatformListenerEnum) objArr[1];
            pjn m = pkdVar.b().m();
            pjp l = pkdVar.b().l();
            pjq bk_ = pkdVar.b().bk_();
            Object[] objArr2 = objArr[2] != null ? (Object[]) objArr[2] : null;
            switch (platformListenerEnum) {
                case callVideoStart:
                    if (m != null) {
                        m.a();
                        break;
                    }
                    break;
                case onFollowAction:
                    if (l != null && objArr2 != null && objArr2.length > 0) {
                        Map map = (Map) objArr2[0];
                        l.a((String) map.get("accountId"), (String) map.get("accountType"), (String) map.get("followSource"));
                        break;
                    }
                    break;
                case callReportAction:
                    if (l != null) {
                        l.a();
                        break;
                    }
                    break;
                case onUnfollowAciton:
                    if (l != null && objArr2 != null && objArr2.length > 0) {
                        Map map2 = (Map) objArr2[0];
                        l.b((String) map2.get("accountId"), (String) map2.get("accountType"), (String) map2.get("followSource"));
                        break;
                    }
                    break;
                case callFetchUTArgsWithParams:
                    if (l != null) {
                        return l.b();
                    }
                    break;
                case updateUserTrackData:
                    if (l != null && objArr2 != null && objArr2.length > 0) {
                        l.a((Map) objArr2[0]);
                        break;
                    }
                    break;
                case needPresentAvatarPage:
                    if (l != null && objArr2 != null && objArr2.length > 0) {
                        l.b((Map) objArr2[0]);
                        break;
                    }
                    break;
                case onCreate:
                    if (bk_ != null && objArr2 != null && objArr2.length > 0) {
                        bk_.a(objArr2[0]);
                        break;
                    }
                    break;
                case onWillAppear:
                    if (bk_ != null) {
                        bk_.b(null);
                        break;
                    }
                    break;
                case onDidAppear:
                    if (bk_ != null) {
                        bk_.c(null);
                        break;
                    }
                    break;
                case onWillDisappear:
                    if (bk_ != null) {
                        bk_.d(null);
                        break;
                    }
                    break;
                case onDidDisappear:
                    if (bk_ != null) {
                        bk_.e(null);
                        break;
                    }
                    break;
                case onPause:
                    if (bk_ != null) {
                        bk_.f(null);
                        break;
                    }
                    break;
                case onResume:
                    if (bk_ != null) {
                        bk_.h(null);
                        break;
                    }
                    break;
                case onStop:
                    if (bk_ != null) {
                        bk_.g((objArr2 == null || objArr2.length <= 0) ? null : (Map) objArr2[0]);
                        break;
                    }
                    break;
                case onDestory:
                    if (bk_ != null) {
                        bk_.i(null);
                        break;
                    }
                    break;
                case setSmallWindowClickListener:
                    if (l != null && objArr2 != null && objArr2.length > 0) {
                        Map map3 = (Map) objArr2[0];
                        if (map3.get(DataReceiveMonitor.CB_LISTENER) instanceof sty) {
                            l.a((sty) map3.get(DataReceiveMonitor.CB_LISTENER));
                            break;
                        } else {
                            l.a((sty) null);
                            break;
                        }
                    }
                    break;
                case setContainerOffset:
                    ab.a("setContainerOffset", "沉浸式设置，直播间收到setContainerOffset");
                    if (l != null && objArr2 != null && objArr2.length > 0 && (objArr2[0] instanceof JSONObject)) {
                        l.a((JSONObject) objArr2[0]);
                        break;
                    }
                    break;
                case mute:
                    if (l != null && objArr2 != null && objArr2.length > 0) {
                        l.c(v.e((String) ((Map) objArr2[0]).get("isMute")));
                        break;
                    }
                    break;
                case getVideoInfo:
                    if (l != null) {
                        return l.c();
                    }
                    break;
            }
        }
        return null;
    }
}
