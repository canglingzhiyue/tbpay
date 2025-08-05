package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.a;

/* loaded from: classes6.dex */
public class mqq extends kqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f31203a;

    static {
        kge.a(968089400);
    }

    @Override // tb.pkf
    public View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this});
        }
        return null;
    }

    public mqq(a aVar) {
        this.f31203a = aVar;
    }

    @Override // tb.pkf
    public Float aR_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("7d17be3e", new Object[]{this});
        }
        float g = this.f31203a.getViewParams().g();
        ogg.a(a.TAG, "topOffset:" + g);
        return Float.valueOf(g);
    }

    @Override // tb.pkf
    public Float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("c7707cb9", new Object[]{this});
        }
        float i = this.f31203a.getViewParams().i();
        ogg.a(a.TAG, "bottomOffset:" + i);
        return Float.valueOf(i);
    }

    @Override // tb.kqq
    public Float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("62a8d0b1", new Object[]{this});
        }
        float j = this.f31203a.getViewParams().j();
        ogg.a(a.TAG, "aliveTopOffset:" + j);
        return Float.valueOf(j);
    }

    @Override // tb.kqq
    public Float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("6f41c632", new Object[]{this});
        }
        float k = this.f31203a.getViewParams().k();
        ogg.a(a.TAG, "aliveBottomOffset:" + k);
        return Float.valueOf(k);
    }

    @Override // tb.kqq
    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        com.taobao.android.tab2liveroom.liveroom.immersive.a g = this.f31203a.g();
        if (g == null) {
            return null;
        }
        return g.a(g.d());
    }

    @Override // tb.kqq
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : (this.f31203a.f() == null || !this.f31203a.f().a()) ? -1 : 0;
    }
}
