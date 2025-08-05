package com.taobao.android.order.bundle.search;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.base.parallelbiz.a;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.search.common.util.i;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.uc.webview.export.media.MessageID;
import tb.bxb;
import tb.esy;
import tb.hxj;
import tb.hyn;
import tb.jqg;
import tb.jqi;
import tb.kge;

/* loaded from: classes6.dex */
public class OrderSearchActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SystemBarDecorator c;

    /* renamed from: a  reason: collision with root package name */
    private final String f14567a = "OrderSearchActivity";
    private hxj b = new hxj(this);
    private final esy d = new esy();

    static {
        kge.a(-73972297);
    }

    public static /* synthetic */ Object ipc$super(OrderSearchActivity orderSearchActivity, String str, Object... objArr) {
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
        jqg.b("OrderSearchActivity", i.b.MEASURE_ONCREATE);
        jqi.a(OrderBizCode.orderSearch, this.d);
        setTheme(R.style.Theme_AppCompat_Light_NoActionBar);
        super.onCreate(bundle);
        this.c = new SystemBarDecorator(this);
        this.c.enableImmersiveStatusBar(true);
        this.b.a();
        bxb.a(OrderBizCode.orderSearch, 0.01f);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        hyn.a("OrderSearchActivity", "onResume", new String[0]);
        a.a(this, ParallelBizValueHelper.PageType.order_search);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        hyn.a("OrderSearchActivity", "onPause", new String[0]);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        hyn.a("OrderSearchActivity", MessageID.onDestroy, new String[0]);
        hxj hxjVar = this.b;
        if (hxjVar != null) {
            hxjVar.b();
        }
        this.b = null;
        jqi.a(OrderBizCode.orderSearch);
    }
}
