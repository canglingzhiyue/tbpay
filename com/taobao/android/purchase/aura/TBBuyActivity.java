package com.taobao.android.purchase.aura;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.h;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.notification.TBBuyBroadcastReceiver;
import com.taobao.android.purchase.aura.utils.j;
import com.taobao.android.purchase.aura.utils.k;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.arc;
import tb.ard;
import tb.fke;
import tb.gws;
import tb.ids;
import tb.idt;
import tb.idu;
import tb.idv;
import tb.ifz;
import tb.ivr;
import tb.iyp;
import tb.kge;

/* loaded from: classes6.dex */
public class TBBuyActivity extends AppCompatActivity implements a, b, c, gws {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ids> f14727a = new HashMap();
    private ids b;
    private TBBuyBroadcastReceiver c;

    static {
        kge.a(589956566);
        kge.a(867410578);
        kge.a(-1316612705);
        kge.a(1009639087);
        kge.a(-20624053);
    }

    public static /* synthetic */ Object ipc$super(TBBuyActivity tBBuyActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        arc.a().b(i.b.MEASURE_ONCREATE);
        j.a(this);
        c();
        this.b = this.f14727a.get(f());
        String str = com.taobao.android.purchase.aura.utils.b.a(this) ? TBBuyPageMode.fullPageMode : TBBuyPageMode.halfPageMode;
        idt.e().a(str);
        this.b.a(this, str);
        super.onCreate(bundle);
        fke.f28008a = true;
        if (a(bundle)) {
            arc.a().b("捕捉到死亡恢复的场景，直接关闭TBBuyActivity", arc.a.a().a("LightBuy/common").b());
            ifz.a("ActivityDeadRecovery", "TBBuyActivity死亡恢复场景");
            finish();
            return;
        }
        getIntent().putExtra("NEW_BUY_ON_CREATE_TIME", System.currentTimeMillis());
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        com.taobao.android.purchase.aura.utils.i.a((Activity) this);
        this.b.b(this);
        this.b.a(this, findViewById(16908290));
        com.taobao.android.purchase.aura.utils.g.b(this);
        this.c = new TBBuyBroadcastReceiver(this, bc_());
        this.c.a("purchase").a();
        boolean c = com.alibaba.ability.localization.b.c();
        ard a2 = arc.a();
        a2.a("Localization.isI18nEdition() = " + c);
        if (!c) {
            return;
        }
        ivr.a((TextView) findViewById(R.id.title), (ImageView) findViewById(R.id.btn_back));
        ivr.a(this);
        arc.a().a("当前环境进入多语言，执行下单页Title改动和黑名单操作");
    }

    private String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : (!com.taobao.android.purchase.aura.utils.b.a(getIntent()) || iyp.a()) ? TBBuyPageMode.fullPageMode : TBBuyPageMode.halfPageMode;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        ids idsVar = this.b;
        if (idsVar != null) {
            idsVar.d(this);
        }
        k.a(k.f14756a);
        h.a("Page_ConfirmOrder", (String) null, this, new String[0]);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        com.taobao.android.purchase.aura.utils.g.a(this);
        h.b("Page_ConfirmOrder", (String) null, this, new String[0]);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f14727a.clear();
        this.f14727a.put(TBBuyPageMode.halfPageMode, new idv(idt.e()));
        this.f14727a.put(TBBuyPageMode.fullPageMode, b());
    }

    private idu b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (idu) ipChange.ipc$dispatch("16b78b03", new Object[]{this}) : new idu(idt.e(), R.layout.activity_purchase_v2, R.id.purchase_container);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        ids idsVar = this.b;
        if (idsVar == null) {
            return;
        }
        idsVar.a(this, i, i2, intent);
    }

    @Override // com.taobao.android.purchase.aura.a
    public void dataUpdate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
            return;
        }
        ids idsVar = this.b;
        if (idsVar == null) {
            return;
        }
        idsVar.a(this, jSONObject);
    }

    @Override // com.taobao.android.purchase.aura.b
    public void refreshPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
            return;
        }
        ids idsVar = this.b;
        if (idsVar == null) {
            return;
        }
        idsVar.a(this, z);
    }

    @Override // com.taobao.android.purchase.aura.b
    public void invokeEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
            return;
        }
        ids idsVar = this.b;
        if (idsVar == null) {
            return;
        }
        idsVar.a(str, jSONObject);
    }

    @Override // com.taobao.android.purchase.aura.c
    public String bc_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccb2657b", new Object[]{this});
        }
        ids idsVar = this.b;
        return idsVar == null ? TBBuyPageMode.fullPageMode : idsVar.a();
    }

    @Override // com.taobao.android.purchase.aura.b
    public String getRenderContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this});
        }
        ids idsVar = this.b;
        return idsVar == null ? "native" : idsVar.f(this);
    }

    @Override // com.taobao.android.purchase.aura.c
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : com.taobao.android.purchase.aura.utils.b.b(getIntent());
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        ids idsVar = this.b;
        if (idsVar == null) {
            return;
        }
        idsVar.g(this);
    }

    @Override // tb.gws
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            super.finish();
        }
    }

    @Override // tb.gws
    public Intent getContainerIntent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("dd388005", new Object[]{this}) : getIntent();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TBBuyBroadcastReceiver tBBuyBroadcastReceiver = this.c;
        if (tBBuyBroadcastReceiver != null) {
            tBBuyBroadcastReceiver.b();
        }
        ids idsVar = this.b;
        if (idsVar == null) {
            return;
        }
        idsVar.e(this);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        try {
            ard a2 = arc.a();
            a2.b("TBBuyActivity onSaveInstanceState. InstanceId = " + hashCode(), arc.a.a().a("LightBuy/common").b());
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.findFragmentByTag("fragment_general_purchase_container") != null) {
                bundle.putString("__fragment__", "half-native");
            }
            if (supportFragmentManager.findFragmentByTag("fragment_light_buy_container") == null) {
                return;
            }
            bundle.putString("__fragment__", "half-weex");
        } catch (Throwable unused) {
        }
    }

    private boolean a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b668f70", new Object[]{this, bundle})).booleanValue() : (bundle == null || bundle.getString("__fragment__") == null) ? false : true;
    }
}
