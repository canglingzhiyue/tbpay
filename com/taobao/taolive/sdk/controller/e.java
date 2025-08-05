package com.taobao.taolive.sdk.controller;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pll;
import tb.pro;
import tb.tna;

/* loaded from: classes8.dex */
public class e extends com.taobao.taolive.sdk.core.g implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean E;

    /* renamed from: a  reason: collision with root package name */
    private pll f21819a;
    private String b;
    private boolean d;
    private Context e;
    private VideoInfo f;
    public Map<String, Object> g;
    private Map<String, String> j;
    public boolean k;
    public boolean l;
    public int m;
    public String n;
    private boolean o;
    private boolean p;
    public String q;
    public boolean r;
    public Object s;
    private boolean u;
    private String x;
    private Map y;
    public int A = -1;
    public boolean h = true;
    public Object i = null;
    public boolean D = false;

    static {
        kge.a(-1627882750);
        kge.a(564218954);
    }

    public e(Context context) {
        this.e = context;
    }

    public Context h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("96c352e7", new Object[]{this}) : this.e;
    }

    public void a(pll pllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d7b6e8", new Object[]{this, pllVar});
        } else {
            this.f21819a = pllVar;
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.e = context;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.b;
    }

    public pll d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pll) ipChange.ipc$dispatch("261e214b", new Object[]{this}) : this.f21819a;
    }

    @Override // com.taobao.taolive.sdk.core.g
    public ATaoliveOpenLiveRoomEntity f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ATaoliveOpenLiveRoomEntity) ipChange.ipc$dispatch("4be534fd", new Object[]{this}) : this.G;
    }

    public void a(ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317349dc", new Object[]{this, aTaoliveOpenLiveRoomEntity});
        } else {
            this.G = aTaoliveOpenLiveRoomEntity;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (this.G != null && this.G.abilityCompontent != null) {
            return this.G.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PV_BYSELF);
        }
        return false;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        if (this.G != null && this.G.abilityCompontent != null) {
            return this.G.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Enable_Perception_Half_Detail_By_Event);
        }
        return false;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue();
        }
        if (this.G != null && this.G.abilityCompontent != null) {
            return this.G.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_Finish);
        }
        return false;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        if (this.G != null && this.G.abilityCompontent != null) {
            return this.G.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_MiniPlayer);
        }
        return true;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue();
        }
        if (this.G != null && this.G.abilityCompontent != null) {
            return this.G.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_AddCustomPageExtParams);
        }
        return false;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        if (this.G != null && this.G.abilityCompontent != null) {
            return this.G.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TabUnselectedReportLiveEnd);
        }
        return false;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue();
        }
        if (this.D && this.G != null && this.G.abilityCompontent != null) {
            return this.G.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_ReplayStatusShowLiveEnd);
        }
        return false;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue();
        }
        if (this.G != null && this.G.abilityCompontent != null) {
            return this.G.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_RefreshOrRemoveLiveRoomWhenVisible);
        }
        return false;
    }

    @Override // com.taobao.taolive.sdk.controller.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.e = null;
        for (Object obj : this.t.values()) {
            if (obj instanceof c) {
                ((c) obj).c();
            }
        }
        this.v.clear();
    }

    public VideoInfo j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoInfo) ipChange.ipc$dispatch("37d759ae", new Object[]{this}) : this.f;
    }

    public void a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
        } else {
            this.f = videoInfo;
        }
    }

    public String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this}) : this.x;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.x = str;
        }
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.o;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.p;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.d;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.u;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            a(z, false);
        }
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.u = z;
        if (z2) {
            return;
        }
        if (this.v != null) {
            for (int i = 0; i < this.v.size(); i++) {
                if (this.v.get(i) != null) {
                    this.v.get(i).onGlobalLiveRoomMuteChanged(z);
                }
            }
        }
        if (this.G == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isMuted", z + "");
        this.G.accessListener(AccessListenerEnum.onLiveRoomMuteAction, hashMap);
    }

    public Map B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b872d23e", new Object[]{this}) : this.y;
    }

    public void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.y = map;
        }
    }

    public Map<String, String> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2171f781", new Object[]{this});
        }
        if (this.j == null) {
            this.j = new HashMap();
        }
        return this.j;
    }

    public tna I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tna) ipChange.ipc$dispatch("566387ef", new Object[]{this});
        }
        if ((this.G instanceof ATaoLiveOpenEntity) && ((ATaoLiveOpenEntity) this.G).taoliveOpenContext != null) {
            return ((ATaoLiveOpenEntity) this.G).taoliveOpenContext.a();
        }
        return null;
    }

    public void b(ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ec9fdd", new Object[]{this, aTaoliveOpenLiveRoomEntity});
        } else if (!(aTaoliveOpenLiveRoomEntity instanceof TaoliveOpenLiveRoom)) {
        } else {
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = (TaoliveOpenLiveRoom) aTaoliveOpenLiveRoomEntity;
            if (taoliveOpenLiveRoom.taoliveOpenContext == null || taoliveOpenLiveRoom.taoliveOpenContext.f == null) {
                return;
            }
            Object obj = taoliveOpenLiveRoom.taoliveOpenContext.f.get("enableReplayStatusShowLiveEnd");
            if (!(obj instanceof String)) {
                return;
            }
            this.D = pro.d((String) obj);
        }
    }
}
