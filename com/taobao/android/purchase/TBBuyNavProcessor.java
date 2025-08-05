package com.taobao.android.purchase;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.nav.e;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.android.purchase.aura.utils.b;
import com.taobao.android.purchase.preload.TBBuyPreloadFactory;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.tao.tbmainfragment.i;
import java.util.HashMap;
import java.util.Map;
import tb.arc;
import tb.bni;
import tb.dui;
import tb.kge;
import tb.rib;

/* loaded from: classes6.dex */
public class TBBuyNavProcessor implements e, bni {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FULL_SCREEN_PURCHASE = "com.taobao.android.purchase.TBPurchaseActivity";
    private static final String HALF_SCREEN_PURCHASE = "com.taobao.android.purchase.aura.TBBuyActivity";
    private static final String NAV_NAME = "TBBuyNavProcessor";
    private static final String PACKAGE_NAME = "com.taobao.taobao";

    static {
        kge.a(-430450804);
        kge.a(-719787762);
        kge.a(78347096);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : NAV_NAME;
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent != null && intent.getData() != null) {
            rib.a();
            rib.a("buy-start-nav");
            appendFullScreenParams(intent, dVar);
            boolean buyContainerSwitch = buyContainerSwitch(intent);
            if (enableFragmentPerf(intent, buyContainerSwitch)) {
                Bundle bundle = new Bundle();
                bundle.putString(i.KEY_FRAGMENT_JUMP, "true");
                bundle.putString(i.SUB_KEY_FRAGMENT_JUMP, "KEY_MINI_DETAIL_FRAGMENT");
                bundle.putString(i.KEY_FRAGMENT_NAME, "com.taobao.android.purchase.TBBuyMainFragment");
                dVar.c(JumpAbility.NAV_JUMP_ABILITY_FRAGMENT);
                intent.putExtra(i.KEY_FRAGMENT_BUNDLE, bundle);
            }
            preload(dVar.a(), intent, buyContainerSwitch);
        }
        return true;
    }

    private boolean enableFragmentPerf(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c0d6718", new Object[]{this, intent, new Boolean(z)})).booleanValue() : AliBuyPerfSwitcher.enableFragmentPerf() && z && "carts".equals(dui.c(intent));
    }

    private void appendFullScreenParams(Intent intent, com.taobao.android.nav.d dVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f044ec9", new Object[]{this, intent, dVar});
        } else if (!com.taobao.android.purchase.aura.utils.i.a(dVar.a()) || (data = intent.getData()) == null || data.buildUpon() == null) {
        } else {
            Uri.Builder buildUpon = data.buildUpon();
            buildUpon.appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen");
            intent.setData(buildUpon.build());
        }
    }

    @Override // tb.bni
    public boolean process(Activity activity, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6862fb", new Object[]{this, activity, bundle, new Integer(i)})).booleanValue();
        }
        rib.a();
        rib.a("buy-start-nav");
        Intent intent = new Intent();
        intent.putExtras(bundle);
        boolean buyContainerSwitch = buyContainerSwitch(intent);
        boolean z = AliBuyPerfSwitcher.enableNavResolve() && !enableFragmentPerf(intent, buyContainerSwitch);
        AliBuyPerfSwitcher.updatePerfSwitch("enableNavResolve", z);
        if (!z) {
            return false;
        }
        arc.a().a("进入TBBuyNavProcessor ", arc.a.a().a("AURA/performance").a("time", System.currentTimeMillis()).b());
        intent.putExtra("NAV_START_ACTIVITY_TIME", System.currentTimeMillis());
        activity.startActivityForResult(intent, i);
        preload(activity, intent, buyContainerSwitch);
        return true;
    }

    private boolean buyContainerSwitch(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa06c277", new Object[]{this, intent})).booleanValue();
        }
        boolean a2 = b.a(intent);
        if (a2 || !AliBuyPerfSwitcher.enableAnimPerf()) {
            intent.setComponent(new ComponentName("com.taobao.taobao", HALF_SCREEN_PURCHASE));
        } else {
            intent.setComponent(new ComponentName("com.taobao.taobao", FULL_SCREEN_PURCHASE));
        }
        return !a2;
    }

    @Override // tb.bni
    public boolean prefetch(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be24fb08", new Object[]{this, activity, bundle})).booleanValue();
        }
        rib.a();
        boolean z = AliBuyPerfSwitcher.enableTouchDownPerf() && AliBuyPerfSwitcher.enablePrefetch();
        AliBuyPerfSwitcher.updatePerfSwitch("enableTouchDownPerf", z);
        if (!z) {
            return false;
        }
        arc.a().a(TBBuyPreloadScene.TOUCH_DOWN, arc.a.a().a("AURA/performance").a("time", System.currentTimeMillis()).b());
        Intent intent = new Intent();
        intent.putExtras(bundle);
        onTouchDown(activity, intent, buyContainerSwitch(intent));
        return true;
    }

    private void onTouchDown(Context context, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e16fc98", new Object[]{this, context, intent, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, (Object) intent);
        jSONObject.put("fullScreen", (Object) Boolean.valueOf(z));
        jSONObject.put("bizName", (Object) "purchase");
        jSONObject.put("from", (Object) "iCarts");
        TBBuyPreloadFactory.a(context, TBBuyPreloadScene.TOUCH_DOWN, "tbBuy", jSONObject);
    }

    private void preload(Context context, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91909ff", new Object[]{this, context, intent, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, (Object) intent);
        jSONObject.put("fullScreen", (Object) Boolean.valueOf(z));
        jSONObject.put("bizName", (Object) "purchase");
        jSONObject.put("from", (Object) "nav");
        TBBuyPreloadFactory.a(context, "nav", "tbBuy", jSONObject);
    }

    @Override // tb.bni
    public Map<String, String> getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (AliBuyPerfSwitcher.enablePrefetch()) {
            hashMap.put("enablePrefetch", "true");
        }
        return hashMap;
    }
}
