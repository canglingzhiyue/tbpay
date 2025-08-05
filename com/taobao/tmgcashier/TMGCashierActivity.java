package com.taobao.tmgcashier;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.e;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.tmgcashier.fragment.TMGCashierWebView;
import com.taobao.tmgcashier.prefetch.PrefetchDataState;
import com.taobao.tmgcashier.view.a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import tb.kge;
import tb.nak;
import tb.nan;
import tb.nao;
import tb.nap;

/* loaded from: classes9.dex */
public class TMGCashierActivity extends AppCompatActivity implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public nak f22966a;
    private Uri c;
    private nap f;
    public int b = -1;
    public volatile PrefetchDataState e = null;

    static {
        kge.a(1357260075);
        kge.a(-477262546);
    }

    public static /* synthetic */ Object ipc$super(TMGCashierActivity tMGCashierActivity, String str, Object... objArr) {
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

    @Override // com.taobao.tmgcashier.view.a
    public Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this}) : this;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        Intent intent = getIntent();
        if (intent.getBooleanExtra("needDecode", false)) {
            try {
                Uri parse = Uri.parse(URLDecoder.decode(intent.getData().toString(), "utf-8"));
                TLog.logd("tmgcashier", "TMGCashierActivity", "paresedUri:" + parse);
                intent.setData(parse);
                setIntent(intent);
                TLog.logd("tmgcashier", "TMGCashierActivity", "paresedUri after:" + getIntent().getData().toString());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        String queryParameter = data != null ? data.getQueryParameter("height") : "";
        if (!TextUtils.isEmpty(queryParameter) && queryParameter.equals("0")) {
            setContentView(R.layout.tmg_cashier_activity_main_no_cornor);
        } else {
            setContentView(R.layout.tmg_cashier_activity_main);
        }
        overridePendingTransition(R.anim.tmg_cashier_push_up_in, R.anim.tmg_cashier_push_down_out);
        a(getApplication());
        c();
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("oversea_url:");
        sb.append(data == null ? null : data.toString());
        strArr[0] = sb.toString();
        nan.a("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_urlMonitor", strArr);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        this.f = new nap(this);
        this.f22966a = new nak(this.f, Looper.getMainLooper());
        if (intent == null) {
            Toast.makeText(this, "TMGCashierActivity intent 为空！", 1).show();
            finish();
            return;
        }
        this.f.a(intent);
    }

    public void containerOuterClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c172c7fd", new Object[]{this, view});
            return;
        }
        Uri uri = this.c;
        if ("false".equals(uri != null ? uri.getQueryParameter("mask_close") : "true")) {
            return;
        }
        finish();
    }

    public void a(Fragment fragment) {
        String bundleUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0514a", new Object[]{this, fragment});
            return;
        }
        if (fragment instanceof WeexFragment) {
            bundleUrl = ((WeexFragment) fragment).getBundleUrl();
        } else {
            bundleUrl = fragment instanceof TMGCashierWebView ? ((TMGCashierWebView) fragment).getBundleUrl() : "";
        }
        Uri parse = Uri.parse(bundleUrl);
        this.c = parse;
        String queryParameter = parse.getQueryParameter("height");
        if (String.valueOf(this.b).equals(queryParameter)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(queryParameter)) {
                this.b = Integer.parseInt(queryParameter);
            } else {
                this.b = 880;
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str = "parseInt error:" + e.getMessage();
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.frontCashierContainer);
        int i = getResources().getDisplayMetrics().heightPixels;
        if (this.b != 0) {
            int a2 = (int) (this.b * nao.a(this));
            if (a2 <= i) {
                i = a2;
            }
            if (i > 0) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.height = i;
                linearLayout.setLayoutParams(layoutParams);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.dimAmount = 0.5f;
            getWindow().setAttributes(attributes);
        } else {
            linearLayout.getLayoutParams().height = i;
            linearLayout.setBackground(null);
            WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
            attributes2.dimAmount = 0.5f;
            getWindow().setAttributes(attributes2);
        }
        if (!"false".equals(parse.getQueryParameter("dimEnabled"))) {
            return;
        }
        getWindow().setDimAmount(0.0f);
    }

    @Override // com.taobao.tmgcashier.view.a
    public void a(Fragment fragment, boolean z, String str) {
        String bundleUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c825614", new Object[]{this, fragment, new Boolean(z), str});
        } else if (isFinishing() || fragment == null) {
        } else {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            Fragment fragment2 = null;
            if (!fragments.isEmpty()) {
                fragment2 = fragments.get(fragments.size() - 1);
            }
            if (fragment2 != null) {
                if (fragment2 instanceof WeexFragment) {
                    bundleUrl = ((WeexFragment) fragment2).getBundleUrl();
                } else {
                    bundleUrl = fragment2 instanceof TMGCashierWebView ? ((TMGCashierWebView) fragment2).getBundleUrl() : "";
                }
                if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase(bundleUrl)) {
                    TLog.logd("tmgcashier", "TMGCashierActivity", "当前URL和老的不一致，终止刷新！");
                    return;
                } else if (!z) {
                    beginTransaction.hide(fragment2);
                } else {
                    beginTransaction.remove(fragment2);
                }
            }
            if (!fragment.isAdded()) {
                beginTransaction.add(R.id.frontCashierContainer, fragment);
            }
            beginTransaction.show(fragment);
            beginTransaction.commitAllowingStateLoss();
            a(fragment);
        }
    }

    @Override // com.taobao.tmgcashier.view.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        for (Fragment fragment : fragments) {
            beginTransaction.remove(fragment);
        }
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f22966a.removeCallbacks(null);
        this.f22966a = null;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            finish();
        }
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else {
            e.a().a(application);
        }
    }
}
