package com.taobao.android.tb3dspaceprocessor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tb3dspaceprocessor.web.HybridWebView;
import com.taobao.appbundle.activity.BaseFeatureDownloadActivity;
import com.taobao.appbundle.remote.activity.RemoteLoadingActivity;
import com.taobao.taobao.R;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Tb3dSpaceInstallActivity extends BaseFeatureDownloadActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HybridWebView h;
    private Context i;
    private Handler j = new Handler(Looper.getMainLooper());
    private String k = "";

    public static /* synthetic */ Object ipc$super(Tb3dSpaceInstallActivity tb3dSpaceInstallActivity, String str, Object... objArr) {
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

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
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
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void b(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6767b1df", new Object[]{this, mVar});
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public static /* synthetic */ Context a(Tb3dSpaceInstallActivity tb3dSpaceInstallActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c4f38d1b", new Object[]{tb3dSpaceInstallActivity}) : tb3dSpaceInstallActivity.i;
    }

    public static /* synthetic */ HybridWebView b(Tb3dSpaceInstallActivity tb3dSpaceInstallActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HybridWebView) ipChange.ipc$dispatch("4482ae44", new Object[]{tb3dSpaceInstallActivity}) : tb3dSpaceInstallActivity.h;
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            super.d();
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
            return;
        }
        Handler handler = this.j;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.taobao.android.tb3dspaceprocessor.Tb3dSpaceInstallActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (Tb3dSpaceInstallActivity.a(Tb3dSpaceInstallActivity.this) == null) {
                } else {
                    Toast.makeText(Tb3dSpaceInstallActivity.a(Tb3dSpaceInstallActivity.this), "远程包安装失败，请退出后重试", 1).show();
                    Tb3dSpaceInstallActivity.this.finish();
                }
            }
        });
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void c(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95404c3e", new Object[]{this, mVar});
            return;
        }
        final long e = mVar.e();
        Handler handler = this.j;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.taobao.android.tb3dspaceprocessor.Tb3dSpaceInstallActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("progress", "" + e);
                } catch (Throwable unused) {
                }
                WVStandardEventCenter.postNotificationToJS(Tb3dSpaceInstallActivity.b(Tb3dSpaceInstallActivity.this), "T3dDownloadProgess", jSONObject.toString());
            }
        });
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Uri data = this.e.getData();
        if (data == null) {
            e();
            return;
        }
        String queryParameter = data.getQueryParameter("CustomLoadPage");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = data.getQueryParameter("appUrl");
            try {
                queryParameter = Uri.parse(queryParameter).getQueryParameter("CustomLoadPage");
            } catch (Throwable unused) {
            }
        }
        if (queryParameter != null) {
            try {
                this.k = URLDecoder.decode(queryParameter, "UTF-8");
            } catch (UnsupportedEncodingException unused2) {
            }
        }
        if (TextUtils.isEmpty(this.k)) {
            e();
            return;
        }
        this.i = getActivity();
        setContentView(R.layout.activity_tb3d_space_install);
        this.h = new HybridWebView(this.i);
        ((ViewGroup) getActivity().findViewById(R.id.loading_root_container)).addView(this.h, new FrameLayout.LayoutParams(-1, -1));
        a(this.k);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Intent intent = getActivity().getIntent();
        Activity activity = getActivity();
        intent.setClassName(activity.getPackageName(), RemoteLoadingActivity.class.getName());
        intent.addFlags(268435456);
        activity.startActivity(intent);
        finish();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HybridWebView hybridWebView = this.h;
        if (hybridWebView == null) {
            return;
        }
        if (TextUtils.equals(hybridWebView.getUrl(), str)) {
            this.h.refresh();
        } else {
            this.h.loadUrl(str);
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
        HybridWebView hybridWebView = this.h;
        if (hybridWebView == null) {
            return;
        }
        hybridWebView.onResume();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        HybridWebView hybridWebView = this.h;
        if (hybridWebView == null) {
            return;
        }
        hybridWebView.onPause();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.j = null;
        HybridWebView hybridWebView = this.h;
        if (hybridWebView != null) {
            hybridWebView.onDestroy();
        }
        this.i = null;
        this.h = null;
    }
}
