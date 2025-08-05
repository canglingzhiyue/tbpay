package com.taobao.android.waitpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.a;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.b;
import com.taobao.android.waitpay.notification.TBWaitBroadcastReceiver;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.ids;
import tb.idu;
import tb.idv;
import tb.kge;
import tb.orl;

/* loaded from: classes6.dex */
public class TBWaitPayActivity extends AppCompatActivity implements a, b, com.taobao.android.purchase.aura.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f15827a = "TBWaitPayActivity";
    private final Map<String, ids> b = new HashMap();
    private ids c;
    private orl d;
    private TBWaitBroadcastReceiver e;

    static {
        kge.a(-825221275);
        kge.a(867410578);
        kge.a(-1316612705);
        kge.a(1009639087);
    }

    public static /* synthetic */ Object ipc$super(TBWaitPayActivity tBWaitPayActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        com.taobao.android.purchase.aura.utils.j.a(this);
        this.d = new orl();
        b();
        ids c = c();
        c.a(this, (String) null);
        super.onCreate(bundle);
        com.taobao.android.purchase.aura.utils.i.a((Activity) this);
        c.b(this);
        c.a(this, findViewById(16908290));
        this.e = new TBWaitBroadcastReceiver(this, bc_());
        this.e.a("tbWaitPayDetail").a();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.clear();
        this.b.put(TBBuyPageMode.halfPageMode, new idv(this.d));
        this.b.put(TBBuyPageMode.fullPageMode, d());
    }

    private ids c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ids) ipChange.ipc$dispatch("1e693024", new Object[]{this});
        }
        ids idsVar = this.c;
        if (idsVar != null) {
            return idsVar;
        }
        ids idsVar2 = this.b.get(com.taobao.android.purchase.aura.utils.b.a(getIntent()) ? TBBuyPageMode.halfPageMode : TBBuyPageMode.fullPageMode);
        if (idsVar2 == null) {
            idsVar2 = d();
        }
        this.c = idsVar2;
        return this.c;
    }

    private idu d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (idu) ipChange.ipc$dispatch("261ad5c1", new Object[]{this}) : new idu(this.d, R.layout.waitpay_layout, R.id.tb_wait_pay_detail_container);
    }

    @Override // com.taobao.android.purchase.aura.b
    public void refreshPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
        } else {
            c().a(this, z);
        }
    }

    @Override // com.taobao.android.purchase.aura.a
    public void dataUpdate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
        } else {
            c().a(this, jSONObject);
        }
    }

    @Override // com.taobao.android.purchase.aura.b
    public void invokeEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
        } else {
            c().a(str, jSONObject);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        c().d(this);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_WaitpayDetail");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, new HashMap<String, String>() { // from class: com.taobao.android.waitpay.TBWaitPayActivity.1
            {
                put("type", "waitPayDetail");
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        c();
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        c().a(this, i, i2, intent);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TBWaitBroadcastReceiver tBWaitBroadcastReceiver = this.e;
        if (tBWaitBroadcastReceiver != null) {
            tBWaitBroadcastReceiver.b();
        }
        c().e(this);
    }

    @Override // com.taobao.android.purchase.aura.c
    public String bc_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ccb2657b", new Object[]{this}) : c().a();
    }

    @Override // com.taobao.android.purchase.aura.b
    public String getRenderContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this}) : c().f(this);
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
        } else {
            c().g(this);
        }
    }
}
