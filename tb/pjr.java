package tb;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.controller2.d;
import com.taobao.taolive.room.controller2.e;
import com.taobao.taolive.room.controller2.f;
import com.taobao.taolive.room.controller2.k;
import com.taobao.taolive.room.controller2.q;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.b;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.c;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.Map;

/* loaded from: classes8.dex */
public class pjr extends b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f32705a;

    static {
        kge.a(-1245588863);
        kge.a(61413594);
    }

    public pjr(Activity activity, String str, pla plaVar, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        a(this);
        this.f32705a = new q(activity, str, plaVar, taoliveOpenLiveRoom);
    }

    public pjr(Activity activity, Intent intent, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        a(this);
        this.f32705a = new q(activity, intent, taoliveOpenLiveRoom);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.k();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this});
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return null;
        }
        return dVar.a();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.a(onClickListener);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void b(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04fabb0", new Object[]{this, onClickListener});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.b(onClickListener);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4d14aa", new Object[]{this, iSmallWindowStrategy});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.a(iSmallWindowStrategy);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.onConfigurationChanged(configuration);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.b();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.onResume();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.onPause();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.g(z);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            g(true);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.onDestroy();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.c();
    }

    @Override // com.taobao.taolive.room.openarchitecture.listener.b
    public Object q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("258fb1ba", new Object[]{this});
        }
        d dVar = this.f32705a;
        if (dVar != null && dVar.j() != null) {
            return this.f32705a.j().g;
        }
        return null;
    }

    @Override // com.taobao.taolive.room.openarchitecture.listener.b
    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        ab.a("isInSmallMode", "TaoliveOpenMixPlatformImpl调用");
        d dVar = this.f32705a;
        if (!(dVar instanceof q)) {
            return false;
        }
        return ((q) dVar).S();
    }

    @Override // com.taobao.taolive.room.openarchitecture.listener.b
    public void r(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93703f95", new Object[]{this, obj});
            return;
        }
        ab.a("onTabUnselected", "TaoliveOpenMixPlatformImpl调用");
        d dVar = this.f32705a;
        if (!(dVar instanceof q)) {
            return;
        }
        ((q) dVar).a(obj);
    }

    @Override // com.taobao.taolive.room.openarchitecture.listener.b
    public void s(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda1d8d6", new Object[]{this, obj});
            return;
        }
        d dVar = this.f32705a;
        if (!(dVar instanceof q)) {
            return;
        }
        ((q) dVar).b(obj);
    }

    @Override // com.taobao.taolive.room.openarchitecture.listener.b
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue();
        }
        d dVar = this.f32705a;
        if (!(dVar instanceof q)) {
            return true;
        }
        return ((q) dVar).U();
    }

    @Override // com.taobao.taolive.room.openarchitecture.listener.b
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        d dVar = this.f32705a;
        if (!(dVar instanceof q)) {
            return;
        }
        ((q) dVar).V();
    }

    @Override // com.taobao.taolive.room.openarchitecture.listener.b
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        if (aa.cB()) {
            return this.f32705a.onKeyDown(4, new KeyEvent(0, 4));
        }
        if (c.i(n.a()) != VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            return false;
        }
        VideoInfo u = poy.u(n.a());
        pfb a2 = pfb.a(n.a());
        if (u != null && u.status == 0 && poy.B(n.a()) == 0) {
            d dVar = this.f32705a;
            String str = "timemoveReturn";
            if (dVar != null && dVar.j() != null && com.taobao.taolive.movehighlight.utils.c.w() && !StringUtils.isEmpty(this.f32705a.j().q)) {
                str = "timemoveReturn." + this.f32705a.j().q;
            }
            if (a2.l() != null) {
                a2.l().j(n.a(), str);
            }
        } else if (a2.l() != null) {
            a2.l().a(n.a(), null);
        }
        return true;
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.d();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.a(i);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return null;
        }
        return dVar.a(str);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return false;
        }
        return dVar.e();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue();
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return false;
        }
        return dVar.P();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return false;
        }
        return dVar.onKeyDown(i, keyEvent);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.a(z);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.f();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.g();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public View b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("18d4778d", new Object[]{this, new Boolean(z)});
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return null;
        }
        return dVar.b(z);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864fb4f", new Object[]{this, intent, new Boolean(z)});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.a(intent, z);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32ee49f", new Object[]{this, uri, new Boolean(z), new Boolean(z2)});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.a(uri, z, z2);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de1296c", new Object[]{this, fVar});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.a(fVar);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de0b50d", new Object[]{this, eVar});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.a(eVar);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de36f47", new Object[]{this, kVar});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.a(kVar);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.h();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.i();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public com.taobao.taolive.sdk.controller.e j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.controller.e) ipChange.ipc$dispatch("c83a9807", new Object[]{this});
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return null;
        }
        return dVar.j();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.l(z);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d8450cc", new Object[]{this});
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return null;
        }
        return dVar.M();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue();
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return false;
        }
        return dVar.O();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
            return;
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return;
        }
        dVar.m(z);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public RecyclerView N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("7e9dd54f", new Object[]{this});
        }
        d dVar = this.f32705a;
        if (dVar == null) {
            return null;
        }
        return dVar.N();
    }
}
