package tb;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.d;
import com.taobao.android.purchase.aura.ability.AbilityParams;
import com.taobao.android.purchase.aura.c;
import com.taobao.android.waitpay.g;
import com.taobao.android.waitpay.render.fragment.TBWaitPayHalfScreenFragment;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public final class orl implements nhm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static orl c;

    /* renamed from: a  reason: collision with root package name */
    private final String f32324a = "TBWaitPayRenderDelegate";
    private g b;

    static {
        kge.a(-288227626);
        kge.a(2057862066);
    }

    @Override // tb.nhm
    public void a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831e55bb", new Object[]{this, fragmentActivity});
        }
    }

    @Override // tb.nhm
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "Page_WaitpayDetail";
    }

    @Override // tb.nhm
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    @Override // com.taobao.android.purchase.aura.b
    public String getRenderContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this});
        }
        return null;
    }

    @Override // tb.nhm
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        }
    }

    public static orl a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (orl) ipChange.ipc$dispatch("f08d355", new Object[0]);
        }
        if (c == null) {
            synchronized (orl.class) {
                if (c == null) {
                    c = new orl();
                }
            }
        }
        return c;
    }

    @Override // tb.nhm
    public void a(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268840fa", new Object[]{this, fragmentActivity, viewGroup});
        } else if (!(fragmentActivity instanceof c)) {
            throw new IllegalStateException("Activity必须实现接口：" + c.class.getName());
        } else {
            this.b = new g(fragmentActivity, viewGroup);
        }
    }

    @Override // com.taobao.android.purchase.aura.a
    public void dataUpdate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
            return;
        }
        g gVar = this.b;
        if (gVar == null) {
            return;
        }
        gVar.a(jSONObject);
    }

    @Override // tb.nhm
    public void a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ec1a18", new Object[]{this, fragmentActivity, new Integer(i), new Integer(i2), intent});
            return;
        }
        g gVar = this.b;
        if (gVar == null) {
            return;
        }
        gVar.a(i, i2, intent);
    }

    @Override // com.taobao.android.purchase.aura.b
    public void refreshPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
            return;
        }
        g gVar = this.b;
        if (gVar == null) {
            return;
        }
        if (z) {
            gVar.b();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("delta", (Object) new JSONArray());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("hierarchy", (Object) jSONObject);
        jSONObject2.put("data", (Object) new JSONObject());
        this.b.a(jSONObject2);
    }

    @Override // com.taobao.android.purchase.aura.b
    public void invokeEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
            return;
        }
        g gVar = this.b;
        if (gVar == null) {
            return;
        }
        gVar.a(str, jSONObject);
    }

    @Override // tb.nhm
    public AbilityParams g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityParams) ipChange.ipc$dispatch("5032001d", new Object[]{this});
        }
        AbilityParams abilityParams = new AbilityParams();
        AbilityParams.a aVar = new AbilityParams.a();
        aVar.f14729a = TBWaitPayHalfScreenFragment.class.getName();
        aVar.b = "fragment_wait_pay_container";
        abilityParams.extConfig = aVar;
        AbilityParams.b bVar = new AbilityParams.b();
        bVar.i = "true";
        bVar.j = "false";
        bVar.f14730a = d.KEY_BOTTOM_IN_OUT;
        bVar.b = "false";
        bVar.d = "#00000000";
        bVar.e = 0.75f;
        abilityParams.popConfig = bVar;
        return abilityParams;
    }

    @Override // tb.nhm
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        g gVar = this.b;
        if (gVar == null) {
            return;
        }
        gVar.c();
    }

    @Override // tb.nhm
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            ige.a(activity, R.id.tb_wait_pay_actionbar, -1);
        }
    }

    @Override // tb.nhm
    public void b(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c95e35a", new Object[]{this, fragmentActivity});
            return;
        }
        g gVar = this.b;
        if (gVar != null) {
            gVar.d();
        }
        this.b = null;
    }
}
