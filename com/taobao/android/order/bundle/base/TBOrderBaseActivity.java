package com.taobao.android.order.bundle.base;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.view.View;
import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.c;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.helper.WvOrderPlugin;
import com.taobao.android.order.bundle.helper.j;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.g;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import tb.bwv;
import tb.bxb;
import tb.hvo;
import tb.hyh;
import tb.hyi;
import tb.hyq;
import tb.hyy;
import tb.hzc;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class TBOrderBaseActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public hyy H;

    /* renamed from: a  reason: collision with root package name */
    private LocalBroadcastManager f14534a;
    private BroadcastReceiver b;
    private ContentObserver c;
    public TBPublicMenu n_;

    static {
        kge.a(900515227);
    }

    public static /* synthetic */ Object ipc$super(TBOrderBaseActivity tBOrderBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -753588267:
                super.bS_();
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public BroadcastReceiver a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("9ef5465f", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity
    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        hvo.a(getApplicationContext());
        this.n_ = new TBPublicMenu(this);
        a((Activity) this);
        q.a(CoreConstants.ORDER_WV_TB_ODER, (Class<? extends e>) WvOrderPlugin.class, true);
        c.a(this);
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity
    public void bS_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31527d5", new Object[]{this});
        } else {
            super.bS_();
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TBPublicMenu tBPublicMenu = this.n_;
        if (tBPublicMenu != null) {
            tBPublicMenu.onResume();
        }
        f();
        WvOrderPlugin.setOrderEngine(i());
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TBPublicMenu tBPublicMenu = this.n_;
        if (tBPublicMenu != null) {
            tBPublicMenu.onPause();
        }
        e();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        View findViewById = findViewById(R.id.mask_layout);
        if (findViewById != null) {
            findViewById.setClickable(true);
            findViewById.setFocusable(true);
            findViewById.setVisibility(0);
            findViewById.bringToFront();
        }
        hyy hyyVar = this.H;
        if (hyyVar == null) {
            return;
        }
        hyyVar.d();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        View findViewById = findViewById(R.id.mask_layout);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(8);
        hyy hyyVar = this.H;
        if (hyyVar == null) {
            return;
        }
        hyyVar.e();
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        SystemBarDecorator systemBarDecorator = new SystemBarDecorator(this);
        if (hyh.a(hyi.a(this, i))) {
            systemBarDecorator.enableImmersiveStatusBar(true);
        } else {
            systemBarDecorator.enableImmersiveStatusBar();
        }
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        if (this.f14534a == null) {
            this.f14534a = LocalBroadcastManager.getInstance(activity);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
        this.b = a();
        BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver == null) {
            return;
        }
        this.f14534a.registerReceiver(broadcastReceiver, intentFilter);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.c == null) {
        } else {
            try {
                getContentResolver().unregisterContentObserver(this.c);
                j.a().a((g) null);
                j.a().a((OrderConfigs) null);
                j.a().a((String) null);
                this.c = null;
            } catch (Throwable unused) {
                hyq.a(this, "screenShot", "unRegisterScreenshotObserver", "1.0", null, "", null);
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.c != null) {
        } else {
            j.a().a(j());
            this.c = j.a().a(getApplicationContext());
            try {
                if (this.c == null) {
                    return;
                }
                j.a().a(i());
                getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.c);
                getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.c);
            } catch (Throwable unused) {
                hyq.a(this, "screenShot", "registerScreenshotObserver", "1.0", null, "", null);
            }
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.b != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.b);
        }
        c.b(this);
        WvOrderPlugin.release();
    }

    public d I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("9ec1e775", new Object[]{this});
        }
        hzc e = i().e();
        if (!(e instanceof bwv)) {
            throw new IllegalStateException("ContainerProxy必须实现IDetailProxy");
        }
        d d = ((bwv) e).d();
        if (d != null) {
            return d;
        }
        bxb.a(OrderBizCode.logisticsDetail, "renderMapBubbleError", "UltronInstance is null");
        return null;
    }
}
