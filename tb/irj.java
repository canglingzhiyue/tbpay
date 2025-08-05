package tb;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.movehighlight.utils.d;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.c;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.tbliveinteractive.view.system_component.IntimacyParams;
import java.util.Map;

/* loaded from: classes8.dex */
public class irj implements qmo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29252a;
    private a b;
    private BaseFrame c;

    static {
        kge.a(624972356);
        kge.a(424899594);
    }

    @Override // tb.qmo
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public irj(a aVar, BaseFrame baseFrame) {
        this.f29252a = null;
        this.b = aVar;
        this.c = baseFrame;
        a aVar2 = this.b;
        if (aVar2 != null) {
            this.f29252a = aVar2.G();
        }
    }

    @Override // tb.qmo
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{this, context, str, new Boolean(z)});
        } else {
            d.a(context, str, z);
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
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : poy.aa(this.b);
    }

    @Override // tb.qmo
    public IntimacyParams b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntimacyParams) ipChange.ipc$dispatch("7fb0955e", new Object[]{this});
        }
        IntimacyParams intimacyParams = new IntimacyParams();
        VideoInfo u = poy.u(this.b);
        FandomInfo H = poy.H(this.b);
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
        intimacyParams.liveSource = poz.p(n.b(this.b));
        a aVar = this.b;
        if (aVar instanceof e) {
            intimacyParams.spm = ((e) aVar).y().aJ_().a().b();
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
        a aVar = this.b;
        if (aVar != null && ((e) aVar).o() != null && (o = ((e) this.b).o()) != null && o.uiCompontent != null && o.uiCompontent.a() != null) {
            View j = o.uiCompontent.a().j();
            if (j instanceof ViewGroup) {
                return (ViewGroup) j;
            }
        }
        return poz.b(context, n.b(this.b));
    }

    @Override // tb.qmo
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            ddw.a().a(xkw.EVENT_RANK_LIVE_ENTRANCE_DATA, jSONObject, this.f29252a);
        }
    }

    @Override // tb.qmo
    public void a(ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa12cf26", new Object[]{this, pprVar});
        } else {
            c.b(this.b, pprVar);
        }
    }

    @Override // tb.qmo
    public void b(ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e895d5a7", new Object[]{this, pprVar});
        } else {
            c.c(this.b, pprVar);
        }
    }

    @Override // tb.qmo
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : c.f(this.b);
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
        if (!TextUtils.isEmpty(str) && (baseFrame = this.c) != null) {
            return baseFrame.getViewByName(str);
        }
        return null;
    }
}
