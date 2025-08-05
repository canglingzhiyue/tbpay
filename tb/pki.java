package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.c;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;
import com.taobao.taolive.room.openarchitecture.listener.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pki implements pkj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VERSION = "1.0";

    /* renamed from: a  reason: collision with root package name */
    public static pis f32718a;
    private static pki b;

    static {
        kge.a(-205988503);
        kge.a(648536770);
    }

    private pki() {
    }

    public static pki a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pki) ipChange.ipc$dispatch("f092d10", new Object[0]);
        }
        if (b == null) {
            synchronized (pki.class) {
                b = new pki();
            }
        }
        return b;
    }

    public void a(pkg pkgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c7598c", new Object[]{this, pkgVar});
            return;
        }
        if (f32718a == null) {
            f32718a = new pis();
        }
        f32718a = f32718a.a(pkgVar);
    }

    public pkg a(Context context, String str, pkf pkfVar, a aVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pkg) ipChange.ipc$dispatch("2f6bff6f", new Object[]{this, context, str, pkfVar, aVar, map}) : new pkg(context, str, pkfVar, aVar, map);
    }

    public TaoliveOpenLiveRoom b(pkg pkgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("8ed5e199", new Object[]{this, pkgVar});
        }
        c.a("com.taobao.taolive", null);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = (TaoliveOpenLiveRoom) a(TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveRoom, pkgVar, new Object[0]);
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.setTaoliveOpenService(new WeakReference<>(this));
        }
        return taoliveOpenLiveRoom;
    }

    public View a(pkg pkgVar, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("177e7992", new Object[]{this, pkgVar, taoliveOpenLiveRoom});
        }
        Object a2 = a(TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveRoomView, pkgVar, taoliveOpenLiveRoom);
        if (!(a2 instanceof View)) {
            return null;
        }
        return (View) a2;
    }

    public ViewGroup a(pkg pkgVar, TaoliveOpenLiveRoom taoliveOpenLiveRoom, Activity activity, String str, pla plaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("71086bde", new Object[]{this, pkgVar, taoliveOpenLiveRoom, activity, str, plaVar});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("taoliveOpenLiveRoom", taoliveOpenLiveRoom);
        hashMap.put("activity", activity);
        hashMap.put("url", str);
        hashMap.put("tLiveRoomConfig", plaVar);
        Object a2 = a(TaoliveGatewayEnum.TaoliveGateway_Create_OpenWatchContainer, pkgVar, hashMap);
        if (!(a2 instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) a2;
    }

    public ViewGroup a(pkg pkgVar, TaoliveOpenLiveRoom taoliveOpenLiveRoom, Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4fed6cd6", new Object[]{this, pkgVar, taoliveOpenLiveRoom, activity, intent});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("taoliveOpenLiveRoom", taoliveOpenLiveRoom);
        hashMap.put("activity", activity);
        hashMap.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
        Object a2 = a(TaoliveGatewayEnum.TaoliveGateway_Create_OpenWatchContainer, pkgVar, hashMap);
        if (!(a2 instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) a2;
    }

    @Override // tb.pkj
    public Object a(TaoliveGatewayEnum taoliveGatewayEnum, pkg pkgVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("38532d11", new Object[]{this, taoliveGatewayEnum, pkgVar, objArr});
        }
        pis pisVar = f32718a;
        if (pisVar == null) {
            return null;
        }
        return pisVar.a(taoliveGatewayEnum, pkgVar, objArr);
    }
}
