package com.taobao.android.shop.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.shop.application.ShopApplication;
import com.taobao.android.shop.utils.b;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.shop.common.ShopUrlFilter;
import com.ut.mini.UTAnalytics;
import tb.ixf;
import tb.kge;
import tb.mbn;

/* loaded from: classes6.dex */
public class ShopUrlRouterActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-999955497);
    }

    public static /* synthetic */ Object ipc$super(ShopUrlRouterActivity shopUrlRouterActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
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

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ShopApplication.a();
        super.onCreate(bundle);
        System.currentTimeMillis();
        Intent intent = getIntent();
        if (intent != null) {
            a(intent.getData());
        }
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        NotifyApm.a().a(this);
        disableFinishAnimationOnce();
        if (intent != null && !a(intent)) {
            intent.putExtra("skipPvFromRouterAc", "true");
            setResult(2001, intent);
            Log.e("ShopUrlRouterActivity", "skipPvFromRouterAc-true");
        }
        Log.e("ShopUrlRouterActivity", "finish");
        finish();
    }

    private boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        int flags = intent.getFlags();
        return ((flags & 1) == 1) || ((flags & 2) == 2);
    }

    private void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else if (uri == null) {
        } else {
            try {
                if ("client_direct".equals(getIntent().getStringExtra("share_trace_method"))) {
                    TBS.Ext.commitEvent(5004, uri.toString());
                }
                if (new ShopUrlFilter().a(uri.toString(), this)) {
                    return;
                }
                TLog.loge("ShopUrlRouterActivity", "degrade to browser to open the shop url " + uri.toString() + ",rule init? true");
                b(uri);
                Nav.from(this).withCategory(mbn.BROWSER_ONLY_CATEGORY).toUri(uri);
            } catch (Exception e) {
                TLog.loge("ShopUrlRouterActivity", "process uri exception: ", e);
            }
        }
    }

    private void b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3828407e", new Object[]{this, uri});
        } else {
            b.a(ixf.a(ixf.a("ruleInit", "true", "="), ixf.a("url", uri.toString(), "="), ","));
        }
    }
}
