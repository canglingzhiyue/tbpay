package com.taobao.appbundle.remote.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.appbundle.activity.BaseFeatureDownloadActivity;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.remote.a;
import com.taobao.appbundle.remote.view.RemoteLoadingView;
import com.taobao.taobao.R;
import tb.jzp;
import tb.kge;

/* loaded from: classes6.dex */
public class RemoteLoadingActivity extends BaseFeatureDownloadActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RemoteLoadingView h;
    private long k;
    private LoadConfig m;
    private Handler i = new Handler(Looper.myLooper());
    private int j = 0;
    private Runnable l = new Runnable() { // from class: com.taobao.appbundle.remote.activity.RemoteLoadingActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RemoteLoadingActivity.a(RemoteLoadingActivity.this);
            RemoteLoadingActivity.b(RemoteLoadingActivity.this);
        }
    };

    static {
        kge.a(635069775);
    }

    public static /* synthetic */ Object ipc$super(RemoteLoadingActivity remoteLoadingActivity, String str, Object... objArr) {
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
            case -432656633:
                super.overridePendingTransition(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 93762283:
                super.d();
                return null;
            case 116272469:
                super.startActivity((Intent) objArr[0]);
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

    public static /* synthetic */ void a(RemoteLoadingActivity remoteLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de53ee8", new Object[]{remoteLoadingActivity});
        } else {
            remoteLoadingActivity.f();
        }
    }

    public static /* synthetic */ void b(RemoteLoadingActivity remoteLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba4b6e9", new Object[]{remoteLoadingActivity});
        } else {
            remoteLoadingActivity.g();
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        e();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        f();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        f();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.h.updateProgress(99);
        this.j = 13;
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
            return;
        }
        this.j = mVar.b();
        g();
        a.a(this.b, this.e == null ? "" : this.e.getDataString(), "install failed");
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void b(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6767b1df", new Object[]{this, mVar});
        } else {
            this.j = mVar.b();
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void c(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95404c3e", new Object[]{this, mVar});
            return;
        }
        this.j = mVar.b();
        this.h.updateProgress(((int) (((float) mVar.e()) * 0.98f)) + 1);
        e();
        Log.e("RemoteDownload", "onDownloading " + mVar.e() + " , " + mVar.f());
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.j = 10;
        e();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.m = (LoadConfig) getIntent().getParcelableExtra("load_config");
        this.h = new RemoteLoadingView(this, this.m);
        setContentView(this.h);
        this.k = System.currentTimeMillis();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
            return;
        }
        this.j = 6;
        a("101", exc != null ? exc.getMessage() : "null");
        g();
        Log.e("RemoteDownload", "onRequestFailure");
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (jzp.a() <= 0) {
        } else {
            this.i.removeCallbacksAndMessages(null);
            this.i.postDelayed(this.l, jzp.a());
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.i.removeCallbacksAndMessages(null);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        f();
        h();
        finish();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        LoadConfig loadConfig = this.m;
        if (loadConfig == null) {
            return;
        }
        if (loadConfig.getFailIntent() != null) {
            startActivity(this.m.getFailIntent());
            if (!this.m.isActivityAnimFromBottom()) {
                return;
            }
            overridePendingTransition(R.anim.fragment_in_bottom, R.anim.fragment_out_bottom);
        } else if (!this.m.isToastEnable()) {
        } else {
            if (StringUtils.isEmpty(this.m.getFailToastText())) {
                Toast.makeText(getApplicationContext(), this.m.getFailToastText(), 1).show();
            } else {
                Toast.makeText(getApplicationContext(), "模块加载失败，请稍后重试", 1).show();
            }
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.j = 1;
        this.h.updateProgress(1);
        e();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.j = 5;
        f();
        i();
        LoadConfig loadConfig = this.m;
        if (loadConfig != null) {
            if (loadConfig.getSuccessIntent() != null) {
                super.startActivity(this.m.getSuccessIntent());
                if (this.m.isActivityAnimFromBottom()) {
                    super.overridePendingTransition(R.anim.fragment_in_bottom, R.anim.fragment_out_bottom);
                }
                super.finish();
                return;
            }
            if (this.m.isToastEnable() && !StringUtils.isEmpty(this.m.getSuccessToastText())) {
                Toast.makeText(getApplicationContext(), this.m.getSuccessToastText(), 0).show();
            }
            super.d();
            return;
        }
        super.d();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        setResult(i2, intent);
        finish();
        String str = "onActivityResult, requestCode = " + i + ", resultCode = " + i2;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action.load.success");
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action.load.fail");
        intent.putExtra("error_code", str);
        intent.putExtra(MUSAppMonitor.ERROR_MSG, str2);
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
    }
}
