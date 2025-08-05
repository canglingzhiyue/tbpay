package com.taobao.taolive.room.openarchitecture.entity;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.a;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;
import tb.pkc;
import tb.pkd;
import tb.pke;
import tb.pkg;

/* loaded from: classes8.dex */
public abstract class ATaoliveOpenLiveRoomEntity implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a abilityCompontent;
    public pkc dataCompontent;
    public pkd eventCompontent;
    public pke uiCompontent;

    static {
        kge.a(1374331099);
        kge.a(-540945145);
    }

    public abstract void accessListener(AccessListenerEnum accessListenerEnum, Object... objArr);

    public abstract void callLifeCycle(TaoliveLifeCycleEnum taoliveLifeCycleEnum, Object obj);

    public abstract Object callPlatform(PlatformListenerEnum platformListenerEnum, Object... objArr);

    public abstract Object callWatchPlatform(WatchPlatformListenerEnum watchPlatformListenerEnum, Object... objArr);

    public abstract Object invokeCommand(TaoliveGatewayEnum taoliveGatewayEnum, pkg pkgVar, Object... objArr);
}
