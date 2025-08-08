package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.ali.adapt.api.AtlasServiceFinder;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.d;
import com.taobao.android.purchase.aura.ability.AbilityParams;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.c;
import com.taobao.android.purchase.aura.e;
import com.taobao.android.purchase.aura.g;
import com.taobao.android.purchase.aura.helper.a;
import com.taobao.android.purchase.aura.render.fragment.TBBuyHalfScreenFragment;
import com.taobao.android.purchase.aura.utils.k;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.bat;

/* loaded from: classes6.dex */
public final class idt implements nhm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static idt e;
    private long b;
    private e d;
    private String f;
    private WeakReference<Activity> g;

    /* renamed from: a  reason: collision with root package name */
    private final String f28942a = "TBBuyRenderDelegate";
    private final boolean c = com.taobao.android.purchase.aura.utils.e.e();

    static {
        kge.a(-1959006837);
        kge.a(2057862066);
    }

    @Override // tb.nhm
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "purchase";
    }

    @Override // com.taobao.android.purchase.aura.b
    public String getRenderContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this});
        }
        return null;
    }

    public static idt e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (idt) ipChange.ipc$dispatch("2dcc7b01", new Object[0]);
        }
        if (e == null) {
            synchronized (idt.class) {
                if (e == null) {
                    e = new idt();
                }
            }
        }
        return e;
    }

    @Override // tb.nhm
    public void a(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268840fa", new Object[]{this, fragmentActivity, viewGroup});
            return;
        }
        this.g = new WeakReference<>(fragmentActivity);
        Object c = fke.c(fragmentActivity);
        if (c == null) {
            tdh.b("EMPTY_CONTAINER_FORM_(TBBuyRenderDelegate)", "container is empty");
        }
        if (!(c instanceof c)) {
            tdh.b("EMPTY_CONTAINER_FORM_(TBBuyRenderDelegate)", "container not ITBBuyPageContainer");
            c = new c() { // from class: tb.idt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.purchase.aura.c
                public Map<String, String> a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("a014a89d", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.android.purchase.aura.c
                public String bc_() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("ccb2657b", new Object[]{this}) : TBBuyPageMode.fullPageMode;
                }
            };
            this.f = StringUtils.isEmpty(this.f) ? TBBuyPageMode.fullPageMode : this.f;
        } else {
            this.f = ((c) c).bc_();
        }
        this.d = new e(fragmentActivity, (c) c, this, viewGroup);
        this.b = SystemClock.uptimeMillis();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // tb.nhm
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.k();
    }

    @Override // tb.nhm
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        WeakReference<Activity> weakReference = this.g;
        if (weakReference != null && weakReference.get() != null) {
            b(this.g.get());
        }
        d();
    }

    @Override // com.taobao.android.purchase.aura.a
    public void dataUpdate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
            return;
        }
        e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.a(jSONObject);
    }

    @Override // tb.nhm
    public void a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831e55bb", new Object[]{this, fragmentActivity});
        } else if (!this.c) {
        } else {
            a();
        }
    }

    @Override // tb.nhm
    public void a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ec1a18", new Object[]{this, fragmentActivity, new Integer(i), new Integer(i2), intent});
            return;
        }
        e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.a(i, i2, intent);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (TBBuyPageMode.halfPageMode.equals(this.f)) {
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.b < 540000) {
                this.b = uptimeMillis;
                return;
            }
            arc.a().b("在后台停留时间过长，刷新下单页");
            refreshPage(true);
            this.b = uptimeMillis;
        }
    }

    @Override // com.taobao.android.purchase.aura.b
    public void refreshPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
            return;
        }
        WeakReference<Activity> weakReference = this.g;
        if (weakReference == null || this.d == null) {
            return;
        }
        Activity activity = weakReference.get();
        if (TBBuyPageMode.halfPageMode.equals(this.f) && activity != null) {
            fke.a(activity);
        } else if (z) {
            c();
            this.d.b();
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("delta", (Object) new JSONArray());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("hierarchy", (Object) jSONObject);
            jSONObject2.put("data", (Object) new JSONObject());
            this.d.a(jSONObject2);
        }
    }

    @Override // com.taobao.android.purchase.aura.b
    public void invokeEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
            return;
        }
        e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.a(str, jSONObject);
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.f;
    }

    private void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
        } else {
            a.a(activity);
        }
    }

    @Override // tb.nhm
    public AbilityParams g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityParams) ipChange.ipc$dispatch("5032001d", new Object[]{this});
        }
        AbilityParams abilityParams = new AbilityParams();
        AbilityParams.a aVar = new AbilityParams.a();
        aVar.f14729a = TBBuyHalfScreenFragment.class.getName();
        aVar.b = "fragment_general_purchase_container";
        abilityParams.extConfig = aVar;
        AbilityParams.b bVar = new AbilityParams.b();
        bVar.h = "true";
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
        e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.c();
        k.a(TBBuyPageMode.halfPageMode.equals(this.f) ? k.b : k.c);
    }

    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a03e9781", new Object[]{this, gVar});
            return;
        }
        e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.a(gVar);
    }

    @Override // tb.nhm
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            ige.a(activity, R.id.purchase_actionbar_layout, R.id.btn_back);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            AtlasServiceFinder.getInstance().registerService(bat.a.class, "com.taobao.android.taobao-general-purchase", "com.taobao.android.purchase.aura.utils.UToastService");
        } catch (Exception e2) {
            UnifyLog.d("TBBuyRenderDelegate", "initToastService failed:" + e2.toString());
        }
    }

    @Override // tb.nhm
    public void b(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c95e35a", new Object[]{this, fragmentActivity});
            return;
        }
        com.taobao.android.purchase.aura.notification.a.a(fragmentActivity);
        c();
        e eVar = this.d;
        if (eVar != null) {
            eVar.d();
        }
        WeakReference<Activity> weakReference = this.g;
        if (weakReference != null) {
            weakReference.clear();
            this.g = null;
        }
        this.d = null;
    }
}
