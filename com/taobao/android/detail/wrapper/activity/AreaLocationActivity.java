package com.taobao.android.detail.wrapper.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.fragment.weex.DetailFullScreenVesselFragment;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.android.o;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import java.net.URLDecoder;
import java.util.Map;
import tb.fgl;
import tb.kge;
import tb.mrm;
import tb.rgu;
import tb.rgw;
import tb.rgy;

/* loaded from: classes5.dex */
public class AreaLocationActivity extends AppCompatActivity implements rgu, rgw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AreaLocationActivity";

    /* renamed from: a  reason: collision with root package name */
    public static String f11078a;
    public static String b;
    public static String c;
    public static String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private ViewGroup k;
    private DetailFullScreenVesselFragment l;
    private boolean m;

    public static /* synthetic */ Object ipc$super(AreaLocationActivity areaLocationActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
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

    @Override // tb.rgu
    public void onLoadFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
        }
    }

    @Override // tb.rgu
    public void onLoadStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f829aa04", new Object[]{this});
        }
    }

    public AreaLocationActivity() {
        f.a("com.taobao.android.detail", "com.taobao.android.detail.wrapper.activity.AreaLocationActivity");
        ApplicationInvoker.getInstance("com.taobao.android.detail").invoke("com.taobao.android.detail.DetailApplication", TaobaoApplication.sApplication);
    }

    static {
        kge.a(90431050);
        kge.a(625213565);
        kge.a(1917561508);
        f11078a = "method";
        b = "close_page";
        c = "sellected_area";
        d = "open_native_area_view";
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.x_detail_new_sku_wrapper_activity_layout);
        a();
        c();
        if (!d()) {
            finish();
        } else {
            b();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            Window window = getWindow();
            View decorView = window.getDecorView();
            window.addFlags(Integer.MIN_VALUE);
            decorView.setSystemUiVisibility(8192);
            window.setStatusBarColor(-1);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.l = DetailFullScreenVesselFragment.newInstance();
        this.l.loadUrl(this.e);
        this.l.setOnLoadListener(this);
        this.l.setVesselCallback(this);
        beginTransaction.replace(R.id.ll_wrapper_fragment_container, this.l).commit();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.k = (ViewGroup) findViewById(R.id.ll_wrapper_fragment_container);
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        Uri data = getIntent().getData();
        if (data == null || o.a() == null) {
            return false;
        }
        this.g = data.getQueryParameter("itemId");
        this.f = data.getQueryParameter("sellerId");
        this.e = data.getQueryParameter("loadUrl");
        this.j = data.getQueryParameter("sku_token");
        try {
            this.e = URLDecoder.decode(this.e, "UTF-8");
        } catch (Throwable unused) {
            i.a(TAG, "配送区域URL解码失败： " + this.e);
        }
        return true;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.m) {
            Intent intent = new Intent();
            intent.setAction(com.taobao.android.detail.ttdetail.constant.a.SKU_ACTION_UPDATE_DATA);
            intent.putExtra(fgl.ORIGINALITEMID, this.g);
            intent.putExtra("skuToken", this.j);
            intent.putExtra(fgl.TARGETITEMID, this.g);
            intent.putExtra(mrm.KEY_AREA_ID, this.h);
            intent.putExtra("addressId", this.i);
            intent.putExtra("areaChangedByUser", "true");
            intent.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
        super.onDestroy();
    }

    @Override // tb.rgu
    public void onLoadError(rgy rgyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
        } else {
            onDowngrade(null, null);
        }
    }

    @Override // tb.rgu
    public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
        } else {
            i.a(TAG, "打开配送区域的Vessel发生降级，使用Native版本兜底ing");
        }
    }

    @Override // tb.rgw
    public void a(Map<String, Object> map, com.taobao.vessel.base.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
        } else if (map == null || !map.containsKey(f11078a)) {
        } else {
            Object obj = map.get(f11078a);
            if (!(obj instanceof String)) {
                return;
            }
            String str = (String) obj;
            if (b.equals(str)) {
                e();
            }
            if (c.equals(str)) {
                b(map, aVar);
            }
            d.equals(str);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            finish();
        }
    }

    private void b(Map<String, Object> map, com.taobao.vessel.base.a aVar) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442e6d82", new Object[]{this, map, aVar});
            return;
        }
        String str = "";
        String obj3 = (map == null || !map.containsKey(mrm.KEY_AREA_ID) || (obj2 = map.get(mrm.KEY_AREA_ID)) == null) ? str : obj2.toString();
        if (map != null && map.containsKey("addressId") && (obj = map.get("addressId")) != null) {
            str = obj.toString();
        }
        this.h = obj3;
        this.i = str;
        this.m = true;
        e();
    }
}
