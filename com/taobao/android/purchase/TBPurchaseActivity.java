package com.taobao.android.purchase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.purchase.aura.a;
import com.taobao.android.purchase.aura.b;
import com.taobao.android.purchase.aura.notification.TBBuyBroadcastReceiver;
import com.taobao.android.purchase.aura.utils.g;
import com.taobao.android.purchase.aura.utils.k;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import tb.arc;
import tb.gws;
import tb.idt;
import tb.idu;
import tb.kge;

/* loaded from: classes6.dex */
public class TBPurchaseActivity extends AppCompatActivity implements a, b, com.taobao.android.purchase.aura.c, gws {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private idu f14726a;
    private TBBuyBroadcastReceiver b;

    static {
        kge.a(-359862567);
        kge.a(867410578);
        kge.a(-1316612705);
        kge.a(1009639087);
        kge.a(-20624053);
    }

    public static /* synthetic */ Object ipc$super(TBPurchaseActivity tBPurchaseActivity, String str, Object... objArr) {
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

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        arc.a().b(i.b.MEASURE_ONCREATE);
        com.taobao.android.purchase.aura.utils.j.a(this);
        idu b = b();
        b.a(this, (String) null);
        super.onCreate(bundle);
        AliBuyPerfSwitcher.updatePerfSwitch("enableAnimPerf", true);
        getIntent().putExtra("NEW_BUY_ON_CREATE_TIME", System.currentTimeMillis());
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        com.taobao.android.purchase.aura.utils.i.a((Activity) this);
        b.b((FragmentActivity) this);
        b.a(this, findViewById(16908290));
        g.b(this);
        this.b = new TBBuyBroadcastReceiver(this, bc_());
        this.b.a();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        b().d(this);
        k.a(k.f14756a);
        com.taobao.android.behavix.h.a("Page_ConfirmOrder", (String) null, this, new String[0]);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        b();
        g.a(this);
        com.taobao.android.behavix.h.b("Page_ConfirmOrder", (String) null, this, new String[0]);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        b().a(this, i, i2, intent);
    }

    @Override // com.taobao.android.purchase.aura.a
    public void dataUpdate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
        } else {
            b().a(this, jSONObject);
        }
    }

    @Override // com.taobao.android.purchase.aura.b
    public void refreshPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
        } else {
            b().a(this, z);
        }
    }

    @Override // com.taobao.android.purchase.aura.b
    public void invokeEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
        } else {
            b().a(str, jSONObject);
        }
    }

    @Override // com.taobao.android.purchase.aura.c
    public String bc_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ccb2657b", new Object[]{this}) : b().a();
    }

    @Override // com.taobao.android.purchase.aura.b
    public String getRenderContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this}) : b().f(this);
    }

    @Override // com.taobao.android.purchase.aura.c
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : com.taobao.android.purchase.aura.utils.b.b(getIntent());
    }

    private idu b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (idu) ipChange.ipc$dispatch("16b78b03", new Object[]{this});
        }
        idu iduVar = this.f14726a;
        if (iduVar != null) {
            return iduVar;
        }
        this.f14726a = new idu(idt.e(), R.layout.activity_purchase_v2, R.id.purchase_container, true);
        return this.f14726a;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            b().g(this);
        }
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
        TBBuyBroadcastReceiver tBBuyBroadcastReceiver = this.b;
        if (tBBuyBroadcastReceiver != null) {
            tBBuyBroadcastReceiver.b();
        }
        b().e(this);
    }
}
