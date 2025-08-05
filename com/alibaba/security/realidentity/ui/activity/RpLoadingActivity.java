package com.alibaba.security.realidentity.ui.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.security.realidentity.RPDetail;
import com.alibaba.security.realidentity.RPEventListener;
import com.alibaba.security.realidentity.RPResult;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.g1;
import com.alibaba.security.realidentity.g2;
import com.alibaba.security.realidentity.g4;
import com.alibaba.security.realidentity.h;
import com.alibaba.security.realidentity.m;
import com.alibaba.security.realidentity.m2;
import com.alibaba.security.realidentity.o2;
import com.alibaba.security.realidentity.q1;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class RpLoadingActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String g = "RpLoadingActivity";
    public static final String h = "com.alibaba.security.realidentity.action.CLOSE_SELF";
    public static final String i = "key_start_type";
    public static final String j = "key_rp_biz_config";

    /* renamed from: a  reason: collision with root package name */
    public String f3559a;
    public LinearLayout b;
    public m2 c;
    public RPBizConfig d;
    public int e;
    public f f;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RpLoadingActivity.a(RpLoadingActivity.this);
            RpLoadingActivity.this.finish();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RpLoadingActivity.b(RpLoadingActivity.this);
            RpLoadingActivity.d(RpLoadingActivity.this);
            RpLoadingActivity.e(RpLoadingActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements o2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f3562a;

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f3563a;
            public final /* synthetic */ int b;
            public final /* synthetic */ String c;

            public a(boolean z, int i, String str) {
                this.f3563a = z;
                this.b = i;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    RpLoadingActivity.a(RpLoadingActivity.this, this.f3563a, this.b, this.c);
                }
            }
        }

        public c(long j) {
            this.f3562a = j;
        }

        @Override // com.alibaba.security.realidentity.o2
        public void remoteAssetsResult(boolean z, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d43f0ca6", new Object[]{this, new Boolean(z), new Integer(i), str});
                return;
            }
            RpLoadingActivity.a(RpLoadingActivity.this, z, i, str, System.currentTimeMillis() - this.f3562a);
            RpLoadingActivity.this.runOnUiThread(new a(z, i, str));
        }
    }

    /* loaded from: classes3.dex */
    public class d implements q1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.alibaba.security.realidentity.q1
        public void onRequestEnd(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a93d2f02", new Object[]{this, new Boolean(z)});
            } else if (!z) {
                g1.f().a();
                RpLoadingActivity.this.finish();
            } else if (m2.a().c()) {
                RpLoadingActivity rpLoadingActivity = RpLoadingActivity.this;
                RpLoadingActivity.a(rpLoadingActivity, rpLoadingActivity, RpLoadingActivity.f(rpLoadingActivity));
            } else {
                g1 f = g1.f();
                RpLoadingActivity rpLoadingActivity2 = RpLoadingActivity.this;
                f.a(rpLoadingActivity2, RpLoadingActivity.g(rpLoadingActivity2), RpLoadingActivity.f(RpLoadingActivity.this));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements o2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f3565a;
        public final /* synthetic */ RPBizConfig b;

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f3566a;

            public a(boolean z) {
                this.f3566a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!this.f3566a) {
                    RpLoadingActivity.c(RpLoadingActivity.this).setVisibility(0);
                } else {
                    g1 f = g1.f();
                    RpLoadingActivity rpLoadingActivity = RpLoadingActivity.this;
                    f.a(rpLoadingActivity, RpLoadingActivity.g(rpLoadingActivity), e.this.b);
                }
            }
        }

        public e(long j, RPBizConfig rPBizConfig) {
            this.f3565a = j;
            this.b = rPBizConfig;
        }

        @Override // com.alibaba.security.realidentity.o2
        public void remoteAssetsResult(boolean z, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d43f0ca6", new Object[]{this, new Boolean(z), new Integer(i), str});
                return;
            }
            RpLoadingActivity.b(RpLoadingActivity.this, z, i, str, System.currentTimeMillis() - this.f3565a);
            RpLoadingActivity.this.runOnUiThread(new a(z));
        }
    }

    /* loaded from: classes3.dex */
    public class f extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !RpLoadingActivity.h.equals(intent.getAction())) {
            } else {
                RpLoadingActivity.this.finish();
            }
        }

        public /* synthetic */ f(RpLoadingActivity rpLoadingActivity, a aVar) {
            this();
        }
    }

    public static /* synthetic */ void a(RpLoadingActivity rpLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cdf0f6", new Object[]{rpLoadingActivity});
        } else {
            rpLoadingActivity.h();
        }
    }

    public static /* synthetic */ void b(RpLoadingActivity rpLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fae5195", new Object[]{rpLoadingActivity});
        } else {
            rpLoadingActivity.d();
        }
    }

    public static /* synthetic */ LinearLayout c(RpLoadingActivity rpLoadingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("46660d8b", new Object[]{rpLoadingActivity}) : rpLoadingActivity.b;
    }

    public static /* synthetic */ void d(RpLoadingActivity rpLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16f12d3", new Object[]{rpLoadingActivity});
        } else {
            rpLoadingActivity.e();
        }
    }

    public static /* synthetic */ void e(RpLoadingActivity rpLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f7372", new Object[]{rpLoadingActivity});
        } else {
            rpLoadingActivity.g();
        }
    }

    public static /* synthetic */ RPBizConfig f(RpLoadingActivity rpLoadingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RPBizConfig) ipChange.ipc$dispatch("b49cdb49", new Object[]{rpLoadingActivity}) : rpLoadingActivity.d;
    }

    public static /* synthetic */ int g(RpLoadingActivity rpLoadingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7c1034a3", new Object[]{rpLoadingActivity})).intValue() : rpLoadingActivity.e;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        RPEventListener h2 = g1.f().h();
        if (h2 == null) {
            return;
        }
        h2.onFinish(RPResult.AUDIT_NOT, new RPDetail(String.valueOf(-1), String.valueOf(-1), "onCancel", null));
    }

    public static /* synthetic */ Object ipc$super(RpLoadingActivity rpLoadingActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
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

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.f != null) {
        } else {
            this.f = new f(this, null);
            h.a(this).a(this.f, new IntentFilter(h));
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.f == null) {
        } else {
            h.a(this).a(this.f);
            this.f = null;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        h();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        try {
            requestWindowFeature(1);
            super.onCreate(bundle);
            a();
            if (Build.VERSION.SDK_INT != 26) {
                setRequestedOrientation(1);
            }
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().addFlags(128);
            getWindow().setFlags(1024, 1024);
            setContentView(R.layout.rp_face_loading_activity);
        } catch (Throwable unused) {
        }
        i();
        this.d = (RPBizConfig) getIntent().getSerializableExtra(j);
        this.e = getIntent().getIntExtra(i, 0);
        this.f3559a = this.d.getBasicsConfig().verifyToken;
        a(this.d, this.e);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.rp_loading_pb);
        if (progressBar != null) {
            progressBar.getIndeterminateDrawable().setColorFilter(getResources().getColor(R.color.rpsdk_loading_bg), PorterDuff.Mode.SRC_ATOP);
        }
        this.b = (LinearLayout) findViewById(R.id.rp_loading_failed_ll);
        this.c = m2.a();
        g();
        ((ImageView) findViewById(R.id.rp_loading_close_iv)).setOnClickListener(new a());
        ((Button) findViewById(R.id.rp_loading_failed_retry)).setOnClickListener(new b());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        j();
    }

    @Override // android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (!z) {
            return;
        }
        f();
    }

    public static /* synthetic */ void a(RpLoadingActivity rpLoadingActivity, boolean z, int i2, String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b83b1bf5", new Object[]{rpLoadingActivity, new Boolean(z), new Integer(i2), str, new Long(j2)});
        } else {
            rpLoadingActivity.b(z, i2, str, j2);
        }
    }

    public static /* synthetic */ void b(RpLoadingActivity rpLoadingActivity, boolean z, int i2, String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e65a4b6", new Object[]{rpLoadingActivity, new Boolean(z), new Integer(i2), str, new Long(j2)});
        } else {
            rpLoadingActivity.a(z, i2, str, j2);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(TrackLog.createRemoteSoBeginLog(g4.a.f3423a));
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(TrackLog.createTryAgainLog());
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.b.setVisibility(8);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        c();
        this.c.a(this, new c(currentTimeMillis));
    }

    public static /* synthetic */ void a(RpLoadingActivity rpLoadingActivity, boolean z, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3370af", new Object[]{rpLoadingActivity, new Boolean(z), new Integer(i2), str});
        } else {
            rpLoadingActivity.a(z, i2, str);
        }
    }

    private void b(boolean z, int i2, String str, long j2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26deee2", new Object[]{this, new Boolean(z), new Integer(i2), str, new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i2));
        hashMap.put("errorMessage", str);
        hashMap.put("costTime", Long.valueOf(j2));
        if (!z) {
            i3 = -1;
        }
        a(TrackLog.createRemoteSoEndLog(g4.a.f3423a, i3, com.alibaba.security.realidentity.b.b(hashMap)));
    }

    public static /* synthetic */ void a(RpLoadingActivity rpLoadingActivity, Context context, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a27cf6", new Object[]{rpLoadingActivity, context, rPBizConfig});
        } else {
            rpLoadingActivity.a(context, rPBizConfig);
        }
    }

    private void a(boolean z, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be3bf21", new Object[]{this, new Boolean(z), new Integer(i2), str});
        } else if (!z) {
            this.b.setVisibility(0);
        } else {
            g1.f().b(this, this.d, new d());
        }
    }

    private void a(Context context, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c542844", new Object[]{this, context, rPBizConfig});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a(rPBizConfig);
        this.c.a(context, rPBizConfig, new e(currentTimeMillis, rPBizConfig));
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(TrackLog.createSdkLoadingExitLog());
        }
    }

    private void a(RPBizConfig rPBizConfig, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87fba637", new Object[]{this, rPBizConfig, new Integer(i2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("startType", Integer.valueOf(i2));
        hashMap.put(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.BIZ_CONFIG, com.alibaba.security.realidentity.b.a(rPBizConfig));
        a(TrackLog.createSdkLoadingEnterLog(com.alibaba.security.realidentity.b.b(hashMap)));
    }

    private void a(RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f7964c", new Object[]{this, rPBizConfig});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("modelInfo", com.alibaba.security.realidentity.b.a(rPBizConfig.getBasicsConfig().modelInfo));
        a(TrackLog.createRemoteModelBeginLog(g4.a.f3423a, com.alibaba.security.realidentity.b.b(hashMap)));
    }

    private void a(boolean z, int i2, String str, long j2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0949bc3", new Object[]{this, new Boolean(z), new Integer(i2), str, new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i2));
        hashMap.put("errorMessage", str);
        hashMap.put("costTime", Long.valueOf(j2));
        if (!z) {
            i3 = -1;
        }
        a(TrackLog.createRemoteModelEndLog(g4.a.f3423a, i3, com.alibaba.security.realidentity.b.b(hashMap)));
    }

    private void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6099b195", new Object[]{this, trackLog});
            return;
        }
        trackLog.setVerifyToken(this.f3559a);
        trackLog.addTag9(g2.f3421a + "/" + g2.b);
        trackLog.addTag10("Android");
        RPTrack.a(trackLog);
        RPTrack.c();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            } else if (m.f() && com.alibaba.security.realidentity.e.e(this)) {
                com.alibaba.security.realidentity.e.a(getWindow());
            } else if (!m.j() || !com.alibaba.security.realidentity.e.f(this)) {
            } else {
                com.alibaba.security.realidentity.e.b(getWindow());
            }
        } catch (Exception e2) {
            com.alibaba.security.realidentity.a.a(g, e2);
        }
    }
}
