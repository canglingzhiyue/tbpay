package com.taobao.taolive.room.mediaplatform;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.tbliveinteractive.view.system_component.IntimacyParams;
import java.util.Map;
import tb.ddw;
import tb.kge;
import tb.poy;
import tb.poz;
import tb.ppr;
import tb.qmo;
import tb.xkw;

/* loaded from: classes8.dex */
public class c implements qmo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.alilive.aliliveframework.frame.a f21626a;
    private BaseFrame b;
    public String c;

    static {
        kge.a(-1624501009);
        kge.a(424899594);
    }

    public c(com.taobao.alilive.aliliveframework.frame.a aVar, BaseFrame baseFrame) {
        this.c = null;
        this.f21626a = aVar;
        this.b = baseFrame;
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.f21626a;
        if (aVar2 != null) {
            this.c = aVar2.G();
        }
    }

    @Override // tb.qmo
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{this, context, str, new Boolean(z)});
        } else {
            a.a(context, str, z);
        }
    }

    @Override // tb.qmo
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
        intent.putExtra("event", str);
        intent.putExtra("param", str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    @Override // tb.qmo
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : poy.aa(this.f21626a);
    }

    @Override // tb.qmo
    public IntimacyParams b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntimacyParams) ipChange.ipc$dispatch("7fb0955e", new Object[]{this});
        }
        IntimacyParams intimacyParams = new IntimacyParams();
        VideoInfo u = poy.u(this.f21626a);
        FandomInfo H = poy.H(this.f21626a);
        if (u != null) {
            intimacyParams.isFandom = false;
            intimacyParams.liveId = u.liveId;
            intimacyParams.roomType = u.roomType;
            intimacyParams.shopHasVip = u.shopHasVip;
            intimacyParams.shopVip = u.shopVip;
            if (u.broadCaster != null) {
                intimacyParams.follow = u.broadCaster.follow;
                intimacyParams.accountId = u.broadCaster.accountId;
            }
        } else if (H != null) {
            intimacyParams.isFandom = true;
            intimacyParams.liveId = H.id;
            if (H.broadCaster != null) {
                intimacyParams.follow = H.broadCaster.follow;
                intimacyParams.accountId = H.broadCaster.accountId;
            }
        }
        intimacyParams.liveSource = poz.p(n.b(this.f21626a));
        com.taobao.alilive.aliliveframework.frame.a aVar = this.f21626a;
        if (aVar instanceof com.taobao.taolive.sdk.core.e) {
            intimacyParams.spm = ((com.taobao.taolive.sdk.core.e) aVar).y().aJ_().a().b();
        }
        return intimacyParams;
    }

    @Override // tb.qmo
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            com.taobao.taolive.room.ui.fanslevel.a.a().b(str);
        }
    }

    @Override // tb.qmo
    public ViewGroup a(Context context) {
        ATaoLiveOpenEntity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d01cc9b5", new Object[]{this, context});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.f21626a;
        if (aVar != null && ((com.taobao.taolive.sdk.core.e) aVar).o() != null && (o = ((com.taobao.taolive.sdk.core.e) this.f21626a).o()) != null && o.uiCompontent != null && o.uiCompontent.a() != null) {
            View j = o.uiCompontent.a().j();
            if (j instanceof ViewGroup) {
                return (ViewGroup) j;
            }
        }
        return poz.b(context, n.b(this.f21626a));
    }

    @Override // tb.qmo
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : m.b();
    }

    @Override // tb.qmo
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            ddw.a().a(xkw.EVENT_RANK_LIVE_ENTRANCE_DATA, jSONObject, this.c);
        }
    }

    @Override // tb.qmo
    public void a(ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa12cf26", new Object[]{this, pprVar});
        } else {
            com.taobao.taolive.sdk.playcontrol.c.b(this.f21626a, pprVar);
        }
    }

    @Override // tb.qmo
    public void b(ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e895d5a7", new Object[]{this, pprVar});
        } else {
            com.taobao.taolive.sdk.playcontrol.c.c(this.f21626a, pprVar);
        }
    }

    @Override // tb.qmo
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : com.taobao.taolive.sdk.playcontrol.c.f(this.f21626a);
    }

    @Override // tb.qmo
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue() : y.b(context);
    }

    @Override // tb.qmo
    public boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue() : y.i(context);
    }

    @Override // tb.qmo
    public int d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{this, context})).intValue() : y.f(context);
    }

    @Override // tb.qmo
    public View b(String str) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8b9126f5", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (baseFrame = this.b) != null) {
            return baseFrame.getViewByName(str);
        }
        return null;
    }
}
