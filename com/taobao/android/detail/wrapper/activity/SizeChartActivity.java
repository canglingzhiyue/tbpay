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
import android.view.Window;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.AliLoginInterface;
import com.taobao.android.detail.wrapper.ext.request.size.TBSizeChartClient;
import com.taobao.android.detail.wrapper.ext.request.size.TBSizeChartModel;
import com.taobao.android.detail.wrapper.ext.request.size.TBSizeChartParams;
import com.taobao.android.detail.wrapper.fragment.size.TBSizeChartFragment;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.android.o;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.epj;
import tb.fgl;
import tb.kge;

/* loaded from: classes5.dex */
public class SizeChartActivity extends AppCompatActivity implements com.taobao.android.trade.boost.request.mtop.a<TBSizeChartModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f11101a;
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private TBSizeChartFragment g;
    private boolean h;

    static {
        kge.a(-94864525);
        kge.a(1595456606);
    }

    public static /* synthetic */ Object ipc$super(SizeChartActivity sizeChartActivity, String str, Object... objArr) {
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

    public SizeChartActivity() {
        f.a("com.taobao.android.detail", "com.taobao.android.detail.wrapper.activity.SizeChartActivity");
        ApplicationInvoker.getInstance("com.taobao.android.detail").invoke("com.taobao.android.detail.DetailApplication", TaobaoApplication.sApplication);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
        } else {
            a((TBSizeChartModel) obj);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.activity.SizeChartActivity");
        super.onCreate(bundle);
        setContentView(R.layout.x_detail_new_sku_wrapper_activity_layout);
        c();
        if (!e()) {
            finish();
            return;
        }
        d();
        a();
        b();
    }

    private void b() {
        AliLoginInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (epj.c() != null || (a2 = o.a()) == null) {
        } else {
            epj.a(new com.taobao.android.detail.wrapper.ext.provider.core.j(a2));
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            Window window = getWindow();
            View decorView = window.getDecorView();
            window.addFlags(Integer.MIN_VALUE);
            decorView.setSystemUiVisibility(8192);
            window.setStatusBarColor(-1);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            new TBSizeChartClient().execute(new TBSizeChartParams(this.f11101a, this.b, this.d), this, TaoApplication.getTTID());
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.g = new TBSizeChartFragment();
        this.g.initDataFromNewSku(this.f11101a, this.b, this.d, this.c);
        this.g.showLoading(true);
        beginTransaction.replace(R.id.ll_wrapper_fragment_container, this.g).commit();
    }

    private boolean e() {
        AliLoginInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        Uri data = getIntent().getData();
        if (data == null || (a2 = o.a()) == null) {
            return false;
        }
        this.f11101a = a2.e();
        this.b = data.getQueryParameter("itemId");
        this.c = data.getQueryParameter("msoa_token");
        this.d = data.getQueryParameter("sellerId");
        this.e = data.getQueryParameter("sku_token");
        this.f = Boolean.parseBoolean(data.getQueryParameter("needCallback"));
        return true;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.h) {
            if (this.f) {
                Intent intent = new Intent();
                intent.setAction("com.taobao.sku.intent.action.sizeChartUpdate");
                intent.putExtra(fgl.ORIGINALITEMID, this.b);
                intent.putExtra("skuToken", this.e);
                intent.putExtra(fgl.TARGETITEMID, this.b);
                intent.putExtra("needCallback", "true");
                intent.addCategory("android.intent.category.DEFAULT");
                sendBroadcast(intent);
            } else {
                Intent intent2 = new Intent();
                intent2.setAction(com.taobao.android.detail.ttdetail.constant.a.SKU_ACTION_UPDATE_DATA);
                intent2.putExtra(fgl.ORIGINALITEMID, this.b);
                intent2.putExtra("skuToken", this.e);
                intent2.putExtra(fgl.TARGETITEMID, this.b);
                intent2.addCategory("android.intent.category.DEFAULT");
                LocalBroadcastManager.getInstance(this).sendBroadcast(intent2);
            }
        }
        super.onDestroy();
    }

    @Override // com.taobao.android.trade.boost.request.mtop.a
    public void onSystemFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse);
        }
    }

    public void a(TBSizeChartModel tBSizeChartModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c2f8a6", new Object[]{this, tBSizeChartModel});
        } else if (isFinishing()) {
        } else {
            this.g.showLoading(false);
            if (tBSizeChartModel == null) {
                f();
            } else {
                this.g.fillData(tBSizeChartModel);
            }
        }
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else if (isFinishing()) {
        } else {
            this.g.showLoading(false);
            f();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Toast.makeText(this, "天啦噜，暂时没有加载成功", 0).show();
        finish();
    }
}
