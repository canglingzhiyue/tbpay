package com.taobao.android.fm_base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ProgressBar;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.core.Constrant;
import com.taobao.android.fm_base.IdsMonitorUtil;
import com.taobao.android.nav.Nav;
import com.taobao.appbundle.activity.BaseFeatureDownloadActivity;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.List;
import tb.hyq;

/* loaded from: classes5.dex */
public class FMModuleLoadActivity extends BaseFeatureDownloadActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long h;
    private ProgressBar j;
    private Handler i = new Handler();
    private boolean k = false;
    private BroadcastReceiver l = new BroadcastReceiver() { // from class: com.taobao.android.fm_base.FMModuleLoadActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!intent.getAction().equals(PopLayer.ACTION_OUT_DISMISS) || !FMModuleLoadActivity.class.getName().equals(intent.getExtras().getString("nativeUri"))) {
            } else {
                LocalBroadcastManager.getInstance(FMModuleLoadActivity.this).unregisterReceiver(FMModuleLoadActivity.a(FMModuleLoadActivity.this));
                FMModuleLoadActivity.this.finish();
            }
        }
    };

    public static /* synthetic */ Object ipc$super(FMModuleLoadActivity fMModuleLoadActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1765592623:
                super.disableFinishAnimationOnce();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 93762283:
                super.d();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
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

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void b(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6767b1df", new Object[]{this, mVar});
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void c(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95404c3e", new Object[]{this, mVar});
        }
    }

    public static /* synthetic */ BroadcastReceiver a(FMModuleLoadActivity fMModuleLoadActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("1917258f", new Object[]{fMModuleLoadActivity}) : fMModuleLoadActivity.l;
    }

    public static /* synthetic */ void a(FMModuleLoadActivity fMModuleLoadActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ce8e3c", new Object[]{fMModuleLoadActivity, new Boolean(z)});
        } else {
            fMModuleLoadActivity.a(z);
        }
    }

    public static /* synthetic */ ProgressBar b(FMModuleLoadActivity fMModuleLoadActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProgressBar) ipChange.ipc$dispatch("88555273", new Object[]{fMModuleLoadActivity}) : fMModuleLoadActivity.j;
    }

    public static /* synthetic */ boolean b(FMModuleLoadActivity fMModuleLoadActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb22e381", new Object[]{fMModuleLoadActivity, new Boolean(z)})).booleanValue();
        }
        fMModuleLoadActivity.k = z;
        return z;
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.ids_load_activity);
        overridePendingTransition(0, 0);
        this.j = (ProgressBar) findViewById(R.id.mask_view_progressbar);
        if (a.a(a.NAMESPACE, "installAllDowngrade", false)) {
            a(true);
            return;
        }
        final int a2 = a.a(a.NAMESPACE, "installTimeoutMill", -1);
        if (a2 <= 0) {
            return;
        }
        this.i.postDelayed(new Runnable() { // from class: com.taobao.android.fm_base.FMModuleLoadActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (FMModuleLoadActivity.this.isFinishing() || FMModuleLoadActivity.b(FMModuleLoadActivity.this) == null) {
                        return;
                    }
                    TLog.loge("IdstryLoad", Constrant.KEY_TIME_OUT, "installTimeoutMill:" + a2);
                    IdsMonitorUtil.a(a.NAMESPACE, null, "moduleInstallError", "onInstallTimeoutDowngrade: " + a2);
                    FMModuleLoadActivity.a(FMModuleLoadActivity.this, a.a(a.NAMESPACE, "intallTimeoutFinish", false));
                    FMModuleLoadActivity.b(FMModuleLoadActivity.this, true);
                } catch (Exception e) {
                    TLog.loge("IdstryLoad", Constrant.KEY_TIME_OUT, e.toString() + ", installTimeoutMill:" + a2);
                }
            }
        }, a2);
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.h = System.currentTimeMillis();
        TLog.loge("IdstryLoad", "onResume", "" + this.h);
        super.onResume();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Log.e("IdstryLoad", "onVerifying:" + System.currentTimeMillis());
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TLog.loge("IdstryLoad", "onDownloaded", "" + System.currentTimeMillis());
        IdsMonitorUtil.a(a.NAMESPACE, IdsMonitorUtil.StageType.STAGE_DOWNLOADED.getValue(), (double) (System.currentTimeMillis() - this.h));
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
            return;
        }
        TLog.loge("IdstryLoad", "onInstallFailed", "" + System.currentTimeMillis());
        IdsMonitorUtil.a(a.NAMESPACE, null, "moduleInstallError", "onInstallFailed");
        a(true);
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
            return;
        }
        TLog.loge("IdstryLoad", "onRequestFailure", "" + System.currentTimeMillis());
        IdsMonitorUtil.a(a.NAMESPACE, null, "moduleInstallError", "onRequestFailure");
        a(true);
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TLog.loge("IdstryLoad", "onRequestSuccess", "" + System.currentTimeMillis());
        IdsMonitorUtil.a(a.NAMESPACE, IdsMonitorUtil.StageType.STAGE_REQUESTED.getValue(), (double) (System.currentTimeMillis() - this.h));
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TLog.loge("IdstryLoad", "onSuccessfulLoad", "" + System.currentTimeMillis());
        IdsMonitorUtil.a(a.NAMESPACE, IdsMonitorUtil.StageType.STAGE_INSTALL.getValue(), (double) (System.currentTimeMillis() - this.h));
        IdsMonitorUtil.a(a.NAMESPACE, null);
        if (!this.k) {
            super.d();
        }
        if (isFinishing()) {
            return;
        }
        finish();
    }

    private void a(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Uri data = this.e.getData();
        String a2 = a.a(a.NAMESPACE, "downgradeUrlMap", a.DEFAULT_GOWNGRADE_URL);
        TLog.loge("IdstryLoad", hyq.UMB_FEATURE_DOWN_GRADE, "config=" + a2);
        try {
            List parseArray = JSONArray.parseArray(a2, String.class);
            if (parseArray == null) {
                return;
            }
            int i2 = 0;
            while (i2 < parseArray.size()) {
                String str2 = (String) parseArray.get(i2);
                if (!TextUtils.isEmpty(str2) && str2.contains(">")) {
                    String[] split = str2.split(">");
                    if (split.length == i) {
                        String str3 = split[0];
                        String str4 = split[1];
                        if (data.toString().contains(str3)) {
                            if (!str4.contains("?") && !TextUtils.isEmpty(data.getEncodedQuery())) {
                                str = str4 + "?" + data.getEncodedQuery();
                            } else {
                                str = str4 + "&" + data.getEncodedQuery();
                            }
                            if (str.startsWith("poplayer:")) {
                                IntentFilter intentFilter = new IntentFilter();
                                intentFilter.addAction(PopLayer.ACTION_OUT_DISMISS);
                                LocalBroadcastManager.getInstance(this).registerReceiver(this.l, intentFilter);
                                Nav.from(this).forResult(10001).toUri(str);
                                IdsMonitorUtil.a(a.NAMESPACE, null, "moduleInstallDowngrade", "newUrl:" + str);
                            } else {
                                Nav.from(this).toUri(str);
                                IdsMonitorUtil.a(a.NAMESPACE, null, "moduleInstallDowngrade", "newUrl:" + str);
                                if (z) {
                                    finish();
                                }
                            }
                            TLog.loge("IdstryLoad", hyq.UMB_FEATURE_DOWN_GRADE, str);
                            return;
                        }
                        IdsMonitorUtil.a(a.NAMESPACE, null, "moduleInstallDowngrade", "no downgrade targe, origin:" + data);
                    } else {
                        continue;
                    }
                }
                i2++;
                i = 2;
            }
        } catch (Exception e) {
            TLog.loge("IdstryLoad", hyq.UMB_FEATURE_DOWN_GRADE, "Exception=" + e.getMessage());
            IdsMonitorUtil.a(a.NAMESPACE, null, "moduleInstallDowngrade", "Exception:" + e.getMessage());
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.disableFinishAnimationOnce();
        super.finish();
        overridePendingTransition(0, 0);
    }
}
