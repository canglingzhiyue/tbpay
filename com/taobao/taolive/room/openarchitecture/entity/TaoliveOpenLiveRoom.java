package com.taobao.taolive.room.openarchitecture.entity;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import tb.kge;
import tb.pkc;
import tb.pkd;
import tb.pke;
import tb.pkg;
import tb.pkj;
import tb.pkk;

/* loaded from: classes8.dex */
public class TaoliveOpenLiveRoom extends ATaoLiveOpenEntity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;

    static {
        kge.a(-587864635);
        TAG = TaoliveOpenLiveRoom.class.getSimpleName();
    }

    private TaoliveOpenLiveRoom(a aVar) {
        this.dataCompontent = aVar.f21660a;
        this.eventCompontent = aVar.b;
        this.uiCompontent = aVar.c;
        this.abilityCompontent = aVar.d;
        this.bizCode = aVar.e;
        this.taoliveOpenContext = aVar.f;
        this.identifer = String.valueOf(hashCode());
    }

    @Override // com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity
    public Object callPlatform(PlatformListenerEnum platformListenerEnum, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("83054df7", new Object[]{this, platformListenerEnum, objArr}) : invokeCommand(TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveCompontent, this.taoliveOpenContext, this.eventCompontent, platformListenerEnum, objArr);
    }

    @Override // com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity
    public void accessListener(AccessListenerEnum accessListenerEnum, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d134de5", new Object[]{this, accessListenerEnum, objArr});
        } else {
            invokeCommand(TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveCompontent, this.taoliveOpenContext, this.eventCompontent, accessListenerEnum, objArr);
        }
    }

    @Override // com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity
    public void callLifeCycle(TaoliveLifeCycleEnum taoliveLifeCycleEnum, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f21787", new Object[]{this, taoliveLifeCycleEnum, obj});
        } else if (taoliveLifeCycleEnum == null) {
        } else {
            switch (taoliveLifeCycleEnum) {
                case onCreate:
                    this.params = obj;
                    callPlatform(PlatformListenerEnum.onCreate, pkk.a(this.bizCode, obj));
                    return;
                case onWillAppear:
                    callPlatform(PlatformListenerEnum.onWillAppear, obj);
                    return;
                case onDidAppear:
                    callPlatform(PlatformListenerEnum.onDidAppear, obj);
                    return;
                case onWillDisappear:
                    callPlatform(PlatformListenerEnum.onWillDisappear, obj);
                    return;
                case onDidDisappear:
                    callPlatform(PlatformListenerEnum.onDidDisappear, obj);
                    return;
                case onPause:
                    callPlatform(PlatformListenerEnum.onPause, obj);
                    return;
                case onResume:
                    callPlatform(PlatformListenerEnum.onResume, obj);
                    return;
                case onStop:
                    callPlatform(PlatformListenerEnum.onStop, obj);
                    return;
                case onDestory:
                    callPlatform(PlatformListenerEnum.onDestory, obj);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity
    public Object callWatchPlatform(WatchPlatformListenerEnum watchPlatformListenerEnum, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("865b8fa9", new Object[]{this, watchPlatformListenerEnum, objArr}) : invokeCommand(TaoliveGatewayEnum.TaoliveGateway_Create_OpenWatchCompontent, this.taoliveOpenContext, this.eventCompontent, watchPlatformListenerEnum, objArr);
    }

    @Override // com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity
    public Object invokeCommand(TaoliveGatewayEnum taoliveGatewayEnum, pkg pkgVar, Object... objArr) {
        pkj pkjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("13773be3", new Object[]{this, taoliveGatewayEnum, pkgVar, objArr});
        }
        if (this.taoliveServicesWeakReference != null && (pkjVar = this.taoliveServicesWeakReference.get()) != null) {
            return pkjVar.a(taoliveGatewayEnum, pkgVar, objArr);
        }
        return null;
    }

    public static a builder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d6d837d1", new Object[0]) : new a();
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public pkc f21660a;
        public pkd b;
        public pke c;
        public com.taobao.taolive.room.openarchitecture.opencompontent.ability.a d;
        public String e;
        public pkg f;

        static {
            kge.a(1955669916);
        }

        public TaoliveOpenLiveRoom a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("d5aff074", new Object[]{this}) : new TaoliveOpenLiveRoom(this);
        }

        public a a(pkg pkgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8967bb3b", new Object[]{this, pkgVar});
            }
            this.f = pkgVar;
            return this;
        }

        public a a(pkc pkcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1fa3d6bf", new Object[]{this, pkcVar});
            }
            this.f21660a = pkcVar;
            return this;
        }

        public a a(pkd pkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3a14cfde", new Object[]{this, pkdVar});
            }
            this.b = pkdVar;
            return this;
        }

        public a a(pke pkeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5485c8fd", new Object[]{this, pkeVar});
            }
            this.c = pkeVar;
            return this;
        }

        public a a(com.taobao.taolive.room.openarchitecture.opencompontent.ability.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9dd6d59a", new Object[]{this, aVar});
            }
            this.d = aVar;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d28f6961", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }
    }
}
