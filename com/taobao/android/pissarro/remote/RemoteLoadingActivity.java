package com.taobao.android.pissarro.remote;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.appbundle.activity.BaseFeatureDownloadActivity;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.hho;
import tb.icd;
import tb.kge;

/* loaded from: classes6.dex */
public class RemoteLoadingActivity extends BaseFeatureDownloadActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RemoteLoadingView h;
    private TaopaiLoadConfig i;
    private String j;
    private long m;
    private Handler k = new Handler(Looper.myLooper());
    private int l = 0;
    private Runnable n = new Runnable() { // from class: com.taobao.android.pissarro.remote.RemoteLoadingActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RemoteLoadingActivity.a(RemoteLoadingActivity.this);
            RemoteLoadingActivity.a(RemoteLoadingActivity.this, "100", "");
            RemoteLoadingActivity.b(RemoteLoadingActivity.this);
        }
    };

    static {
        kge.a(949192817);
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
            case 93762283:
                super.d();
                return null;
            case 143326307:
                super.onBackPressed();
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

    public static /* synthetic */ void a(RemoteLoadingActivity remoteLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ae5846", new Object[]{remoteLoadingActivity});
        } else {
            remoteLoadingActivity.g();
        }
    }

    public static /* synthetic */ void a(RemoteLoadingActivity remoteLoadingActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a9625a", new Object[]{remoteLoadingActivity, str, str2});
        } else {
            remoteLoadingActivity.a(str, str2);
        }
    }

    public static /* synthetic */ void b(RemoteLoadingActivity remoteLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43ddc87", new Object[]{remoteLoadingActivity});
        } else {
            remoteLoadingActivity.h();
        }
    }

    public static /* synthetic */ void c(RemoteLoadingActivity remoteLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cd60c8", new Object[]{remoteLoadingActivity});
        } else {
            remoteLoadingActivity.j();
        }
    }

    public static /* synthetic */ Handler d(RemoteLoadingActivity remoteLoadingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("8d6b331d", new Object[]{remoteLoadingActivity}) : remoteLoadingActivity.k;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            System.loadLibrary("SECV");
            a.a("loadSECV", "success", "", 0L);
            TLog.loge("TaopaiCheck-Download", "secv so load success");
        } catch (Throwable th) {
            a.a("loadSECV", "fail", th.getMessage(), 0L);
            TLog.loge("TaopaiCheck-Download", "secv so load fail, " + th.getMessage());
        }
        if (b.d()) {
            TLog.loge("TaopaiCheck-Download", "race so load success");
            j();
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        hho.a(new Runnable() { // from class: com.taobao.android.pissarro.remote.RemoteLoadingActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TLog.loge("TaopaiCheck-Download", "prepareRace so load success");
                a.a("loadRace", "success", "", System.currentTimeMillis() - currentTimeMillis);
                RemoteLoadingActivity.d(RemoteLoadingActivity.this).post(new Runnable() { // from class: com.taobao.android.pissarro.remote.RemoteLoadingActivity.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            RemoteLoadingActivity.c(RemoteLoadingActivity.this);
                        }
                    }
                });
            }
        }, new Runnable() { // from class: com.taobao.android.pissarro.remote.RemoteLoadingActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    RemoteLoadingActivity.d(RemoteLoadingActivity.this).post(new Runnable() { // from class: com.taobao.android.pissarro.remote.RemoteLoadingActivity.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            String message = hho.f28663a != null ? hho.f28663a.getMessage() : "";
                            a.a("loadRace", "fail", message, System.currentTimeMillis() - currentTimeMillis);
                            RemoteLoadingActivity.a(RemoteLoadingActivity.this, "104", message);
                            RemoteLoadingActivity.b(RemoteLoadingActivity.this);
                            TLog.loge("TaopaiCheck-Download", "prepareRace so load fail, " + message);
                        }
                    });
                }
            }
        });
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        f();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        g();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        g();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.h.updateProgress(99);
        this.l = 13;
        TLog.logi("TaopaiCheck-Download", " download finish");
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
            return;
        }
        this.l = mVar.b();
        a("102", mVar.c() + "|" + mVar.d());
        h();
        TLog.loge("TaopaiCheck-Download", " onInstallFailed , errorInfo = " + mVar.c() + "|" + mVar.d());
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void b(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6767b1df", new Object[]{this, mVar});
            return;
        }
        this.l = mVar.b();
        TLog.logi("TaopaiCheck-Download", " onInstalling");
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void c(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95404c3e", new Object[]{this, mVar});
            return;
        }
        this.l = mVar.b();
        this.h.updateProgress(((int) (((float) mVar.e()) * 0.98f)) + 1);
        f();
        TLog.loge("TaopaiCheck-Download", " onDownloading " + mVar.e() + " , " + mVar.f());
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.l = 10;
        f();
        TLog.logi("TaopaiCheck-Download", " onVerifying");
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.i = (TaopaiLoadConfig) getIntent().getParcelableExtra("taopai_load_config");
        this.h = new RemoteLoadingView(this, this.i, new View.OnClickListener() { // from class: com.taobao.android.pissarro.remote.RemoteLoadingActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                RemoteLoadingActivity.a(RemoteLoadingActivity.this, "103", "");
                RemoteLoadingActivity.this.finish();
            }
        });
        setContentView(this.h);
        l();
        a.a(this, this.j);
        this.m = System.currentTimeMillis();
        if (this.i != null) {
            Log.e("TaopaiCheck-Download", "LoadConfig = " + this.i.toString());
        }
        TLog.loge("TaopaiCheck-Download", " onCreate");
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
            return;
        }
        this.l = 6;
        a("101", exc != null ? exc.getMessage() : "null");
        h();
        TLog.loge("TaopaiCheck-Download", " onRequestFailure " + Log.getStackTraceString(exc));
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (icd.a() <= 0) {
        } else {
            this.k.removeCallbacks(this.n);
            this.k.postDelayed(this.n, icd.a());
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.k.removeCallbacks(this.n);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        g();
        i();
        finish();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        TaopaiLoadConfig taopaiLoadConfig = this.i;
        if (taopaiLoadConfig != null) {
            if (taopaiLoadConfig.getFailIntent() != null) {
                startActivity(this.i.getFailIntent());
                if (!this.i.isActivityAnimFromBottom()) {
                    return;
                }
                overridePendingTransition(R.anim.pissarro_fragment_in_bottom, R.anim.pissarro_fragment_out_bottom);
                return;
            } else if (!this.i.isToastEnable()) {
                return;
            } else {
                if (!StringUtils.isEmpty(this.i.getFailToastText())) {
                    Toast.makeText(getApplicationContext(), this.i.getFailToastText(), 1).show();
                    return;
                } else {
                    Toast.makeText(getApplicationContext(), getString(R.string.pissarro_taopai_load_fail), 1).show();
                    return;
                }
            }
        }
        Toast.makeText(getApplicationContext(), getString(R.string.pissarro_function_load_fail), 1).show();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.l = 1;
        this.h.updateProgress(1);
        f();
        TLog.loge("TaopaiCheck-Download", " onRequestSuccess");
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.l = 5;
        e();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        a("103", "");
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        g();
        k();
        TaopaiLoadConfig taopaiLoadConfig = this.i;
        if (taopaiLoadConfig != null) {
            if (taopaiLoadConfig.getSuccessIntent() != null) {
                startActivity(this.i.getSuccessIntent());
                if (this.i.isActivityAnimFromBottom()) {
                    overridePendingTransition(R.anim.pissarro_fragment_in_bottom, R.anim.pissarro_fragment_out_bottom);
                }
            }
            if (this.i.isToastEnable() && !StringUtils.isEmpty(this.i.getSuccessToastText())) {
                Toast.makeText(getApplicationContext(), this.i.getSuccessToastText(), 0).show();
            }
            finish();
        } else if (this.e != null) {
            super.d();
        } else {
            finish();
        }
        a.a(this.j, System.currentTimeMillis() - this.m);
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
        TLog.logi("TaopaiCheck-Download", "onActivityResult, requestCode = " + i + ", resultCode = " + i2);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action.taopai.load.success");
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action.taopai.load.fail");
        intent.putExtra("error_code", str);
        intent.putExtra(MUSAppMonitor.ERROR_MSG, str2);
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
        a.a(this.j, this.l, str, str2, System.currentTimeMillis() - this.m);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        TaopaiLoadConfig taopaiLoadConfig = this.i;
        if (taopaiLoadConfig != null && !StringUtils.isEmpty(taopaiLoadConfig.getBizScene())) {
            this.j = this.i.getBizScene();
            Log.e("TaopaiCheck-Download", "bizScene from Config = " + this.j);
            return;
        }
        if (this.e != null) {
            Uri data = this.e.getData();
            if (data == null) {
                Log.e("TaopaiCheck-Download", "bizScene uri = null");
                return;
            }
            this.j = Uri.decode(data.getQueryParameter("biz_scene"));
        }
        TLog.logi("TaopaiCheck-Download", "bizScene = " + this.j);
    }
}
