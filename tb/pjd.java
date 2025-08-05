package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;

/* loaded from: classes8.dex */
public class pjd extends pje {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public pit b = new pit();

    /* renamed from: a  reason: collision with root package name */
    public piv f32703a = new piv();
    public piu c = new piu();
    public piy d = new piy();
    public pix e = new pix();
    public pja f = new pja();
    public piz g = new piz();

    static {
        kge.a(1026720962);
    }

    @Override // tb.pje
    public Object b(TaoliveGatewayEnum taoliveGatewayEnum, pkg pkgVar, Object... objArr) {
        TaoliveOpenLiveRoom taoliveOpenLiveRoom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("281620d2", new Object[]{this, taoliveGatewayEnum, pkgVar, objArr});
        }
        if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveRoom) {
            return this.f32703a.a(pkgVar, new Object[0]);
        }
        if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveCompontent) {
            return this.c.a(pkgVar, objArr);
        }
        Object obj = null;
        if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveRoomView) {
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof TaoliveOpenLiveRoom)) {
                obj = (TaoliveOpenLiveRoom) objArr[0];
            }
            return this.b.a(pkgVar, obj);
        } else if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenH5PlatformView) {
            if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof TaoliveOpenLiveRoom)) {
                taoliveOpenLiveRoom = null;
            } else {
                taoliveOpenLiveRoom = (TaoliveOpenLiveRoom) objArr[0];
                if (objArr.length > 1) {
                    obj = objArr[1];
                }
            }
            return this.d.a(pkgVar, taoliveOpenLiveRoom, obj);
        } else if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenH5Compontent) {
            return this.e.a(pkgVar, objArr);
        } else {
            if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenWatchContainer) {
                return this.f.a(pkgVar, objArr);
            }
            if (taoliveGatewayEnum != TaoliveGatewayEnum.TaoliveGateway_Create_OpenWatchCompontent) {
                return null;
            }
            return this.g.a(pkgVar, objArr);
        }
    }
}
