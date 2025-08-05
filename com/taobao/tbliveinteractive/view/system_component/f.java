package com.taobao.tbliveinteractive.view.system_component;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.annotations.MemCheck;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.tbliveinteractive.InteractiveComponent;
import com.taobao.tbliveinteractive.e;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.qne;
import tb.xkw;

@MemCheck(field = "mContext")
/* loaded from: classes8.dex */
public class f implements com.taobao.tbliveinteractive.componentlist.c, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SystemComponent";
    private VideoInfo b;
    private final String c;
    private Context d;
    private a e;
    private e f;
    private com.taobao.tbliveinteractive.b g;
    private com.taobao.tbliveinteractive.componentlist.b h;
    private View i;
    private boolean j;
    private LinearLayout k;
    private c l;
    private com.taobao.tbliveinteractive.c m;
    private g n;
    private b o;
    private String r;

    /* renamed from: a  reason: collision with root package name */
    private boolean f22184a = false;
    private ViewGroup p = null;
    private boolean q = false;

    static {
        kge.a(-1131058920);
        kge.a(1975106370);
        kge.a(191318335);
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : e.EVENTCENTER_BIZCODE;
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    public f(String str, Context context, a aVar, VideoInfo videoInfo, e eVar, com.taobao.tbliveinteractive.b bVar, com.taobao.tbliveinteractive.componentlist.b bVar2, com.taobao.tbliveinteractive.c cVar) {
        this.c = str;
        this.d = context;
        this.e = aVar;
        this.f = eVar;
        this.g = bVar;
        this.h = bVar2;
        this.b = videoInfo;
        this.m = cVar;
    }

    public void a(ViewGroup viewGroup, boolean z) {
        View inflate;
        e eVar;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4670d", new Object[]{this, viewGroup, new Boolean(z)});
            return;
        }
        this.j = z;
        if (viewGroup == null) {
            return;
        }
        a aVar = this.e;
        if (aVar != null && aVar.o() != null && this.e.o().abilityCompontent != null && this.e.o().abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopLeftOrder)) {
            inflate = LayoutInflater.from(this.d).inflate(R.layout.taolive_room_interactive_system_component_parent_guangguang, (ViewGroup) null);
        } else {
            inflate = LayoutInflater.from(this.d).inflate(R.layout.taolive_room_interactive_system_component_parent, (ViewGroup) null);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        a aVar2 = this.e;
        if (aVar2 == null || aVar2.o() == null || this.e.o().bizCode == null || !this.e.o().bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString())) {
            z2 = false;
        }
        if (z2 && (eVar = this.f) != null) {
            marginLayoutParams.topMargin = eVar.i();
        }
        inflate.setLayoutParams(marginLayoutParams);
        viewGroup.addView(inflate);
        this.i = viewGroup;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.tbliveinteractive.componentlist.b bVar = this.h;
        if (bVar != null) {
            bVar.a(this);
        }
        this.k = (LinearLayout) this.i.findViewById(R.id.taolive_room_interactive_system_component_root);
        this.k.setGravity(3);
        this.k.setPadding(d.a(this.d, 9.0f), 0, 0, 0);
        if (this.k.getLayoutTransition() != null) {
            this.k.getLayoutTransition().setAnimateParentHierarchy(false);
        }
        IntimacyParams b = this.f.o().b();
        this.r = b.accountId;
        this.q = b.follow;
        if (!qne.j()) {
            return;
        }
        ddw.a().a(this);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        g gVar = this.n;
        if (gVar == null) {
            return;
        }
        gVar.a(str);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ddw.a().b(this);
        com.taobao.tbliveinteractive.componentlist.b bVar = this.h;
        if (bVar != null) {
            bVar.b(this);
        }
        b bVar2 = this.o;
        if (bVar2 != null) {
            bVar2.a();
            this.o = null;
        }
        this.p = null;
        c cVar = this.l;
        if (cVar != null) {
            cVar.b();
            this.l = null;
        }
        View view = this.i;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
        this.f22184a = true;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(false);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.f22184a || this.i == null || this.o != null) {
        } else {
            if (qne.j()) {
                if (f()) {
                    return;
                }
                if (z) {
                    if (!this.q) {
                        return;
                    }
                } else if (!this.f.o().b().follow) {
                    return;
                }
            }
            this.o = new b(this.c, this.d, this.f, this.g, this.m);
            this.p = this.o.a((ViewStub) this.i.findViewById(R.id.taolive_room_interactive_system_component_intimacy), this.p, this.j);
        }
    }

    public void d() {
        View view;
        ViewStub viewStub;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f22184a || (view = this.i) == null || this.b == null || (viewStub = (ViewStub) view.findViewById(R.id.taolive_room_interactive_system_component_rank_module)) == null) {
        } else {
            this.l = new c(this.c, this.d, this.e, this.b, this.f, this.g, this.m);
            this.l.a(viewStub, this.j);
            this.l.a();
        }
    }

    public void e() {
        View view;
        ViewStub viewStub;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f22184a || (view = this.i) == null || this.b == null || (viewStub = (ViewStub) view.findViewById(R.id.taolive_room_interactive_system_component_watch_module)) == null) {
        } else {
            this.n = new g(this.c, this.d, this.e, this.b, this.f);
            this.n.a(viewStub, this.j);
            this.n.a();
        }
    }

    @Override // com.taobao.tbliveinteractive.componentlist.c
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            g();
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else {
            g();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.tbliveinteractive.b bVar = this.g;
        if (bVar == null) {
            return;
        }
        boolean z2 = false;
        for (InteractiveComponent interactiveComponent : bVar.i()) {
            if (qne.b(interactiveComponent.fedName)) {
                z = true;
            } else if (qne.h().equals(interactiveComponent.fedName)) {
                z2 = true;
            }
        }
        if (!f() && z) {
            c();
        }
        if (z2) {
            d();
        }
        if (f() || !this.f.a()) {
            return;
        }
        e();
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        VideoInfo videoInfo = this.b;
        return videoInfo != null && videoInfo.isOfficialLive();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        b bVar = this.o;
        if (bVar == null) {
            return;
        }
        bVar.a(str);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1815430857:
                if (str.equals(xkw.EVENT_GET_FOLLOW_STATUS)) {
                    c = 3;
                    break;
                }
                break;
            case -830550742:
                if (str.equals(xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME)) {
                    c = 0;
                    break;
                }
                break;
            case -596762262:
                if (str.equals(xkw.EVENT_ACTION_UNFOLLOW)) {
                    c = 2;
                    break;
                }
                break;
            case -554098287:
                if (str.equals(xkw.EVENT_ACTION_FOLLOW)) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            if (!(obj instanceof String) || !TextUtils.equals(this.r, (String) obj)) {
                return;
            }
            this.q = true;
            a(true);
        } else if (c == 2) {
            if (!(obj instanceof String) || !TextUtils.equals(this.r, (String) obj)) {
                return;
            }
            this.q = false;
            b bVar = this.o;
            if (bVar == null) {
                return;
            }
            bVar.a();
            this.o = null;
        } else if (c != 3 || !(obj instanceof Boolean)) {
        } else {
            this.q = ((Boolean) obj).booleanValue();
            if (this.q) {
                a(true);
                return;
            }
            b bVar2 = this.o;
            if (bVar2 == null) {
                return;
            }
            bVar2.a();
            this.o = null;
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME, xkw.EVENT_ACTION_FOLLOW, xkw.EVENT_GET_FOLLOW_STATUS, xkw.EVENT_ACTION_UNFOLLOW};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : this.c;
    }
}
