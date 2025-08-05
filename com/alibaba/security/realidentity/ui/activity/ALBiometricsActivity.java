package com.alibaba.security.realidentity.ui.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.e;
import com.alibaba.security.realidentity.e2;
import com.alibaba.security.realidentity.g2;
import com.alibaba.security.realidentity.h;
import com.alibaba.security.realidentity.m2;
import com.alibaba.security.realidentity.n4;
import com.alibaba.security.realidentity.o;
import com.alibaba.security.realidentity.o4;
import com.alibaba.security.realidentity.r;
import com.alibaba.security.realidentity.r4;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsg;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ALBiometricsActivity extends BaseBioNavigatorActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String A = "ALBiometricsActivity";
    public r4 x;
    public boolean y;
    public final BroadcastReceiver z = new a();

    /* loaded from: classes3.dex */
    public class a extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            ALBiometricsActivity.a(ALBiometricsActivity.this, action);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3534a;
        public final /* synthetic */ String b;

        public b(int i, String str) {
            this.f3534a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ALBiometricsActivity.a(ALBiometricsActivity.this) == null) {
            } else {
                ALBiometricsActivity.a(ALBiometricsActivity.this).b(this.f3534a, "RestartBiometricsBroadcast", this.b);
                ALBiometricsActivity.a(ALBiometricsActivity.this).L();
            }
        }
    }

    public static /* synthetic */ void a(ALBiometricsActivity aLBiometricsActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b6dea2", new Object[]{aLBiometricsActivity, str});
        } else {
            aLBiometricsActivity.b(str);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!str.equals("android.intent.action.SCREEN_OFF")) {
        } else {
            g();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.x.X();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.y) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            registerReceiver(this.z, intentFilter);
            this.y = true;
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!this.y) {
        } else {
            unregisterReceiver(this.z);
            this.y = false;
        }
    }

    public static /* synthetic */ Object ipc$super(ALBiometricsActivity aLBiometricsActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
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

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        r4 r4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        boolean z = this.f.getDegradeConfig().isHonorMagicWindowOff;
        boolean z2 = this.f.getDegradeConfig().isUseHwMagicWindow;
        a(z2, z, e.h(this), e.g(this));
        if ((z && configuration.orientation == 1 && e.g(this)) || !z2 || configuration.orientation != 1 || !e.h(this) || (r4Var = this.x) == null) {
            return;
        }
        r4Var.b(e2.m, "EnvironmentComponent", (String) null);
    }

    @Override // com.alibaba.security.realidentity.ui.activity.BaseBioNavigatorActivity, com.alibaba.security.realidentity.ui.activity.BaseAlBioActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        h();
        a(a(), "bio activity enter");
        n4 a2 = o4.b().a();
        if (a2 == null) {
            RPBizConfig rPBizConfig = this.f;
            if (rPBizConfig != null) {
                a(rPBizConfig.getBasicsConfig().verifyStartType, e2.x, a(bundle) ? "true" : "false");
            }
            finish();
            return;
        }
        a2.e();
        if (m2.a().b()) {
            r.a().b(this.f.getBiometricsConfig().secToken);
            o.b().a(1, (Map<String, Object>) null);
        } else {
            b("ALBiometricsJni load fail", null);
        }
        r4 r4Var = new r4(this);
        this.x = r4Var;
        r4Var.a(this, this.f, a2);
        ALBiometricsActivityParentView aLBiometricsActivityParentView = new ALBiometricsActivityParentView(this, this.f);
        setContentView(aLBiometricsActivityParentView);
        a(getWindow(), false);
        this.x.b(aLBiometricsActivityParentView);
        a(this.f.getDegradeConfig().isUseHwMagicWindow, this.f.getDegradeConfig().isHonorMagicWindowOff, e.h(this), e.g(this));
        RPTrack.a((LastExitTrackMsg) null);
    }

    @Override // com.alibaba.security.realidentity.ui.activity.BaseBioNavigatorActivity, com.alibaba.security.realidentity.ui.activity.BaseAlBioActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        i();
        a("bio activity exit");
        r4 r4Var = this.x;
        if (r4Var == null) {
            return;
        }
        r4Var.I();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        r4 r4Var = this.x;
        if (r4Var != null && r4Var.a(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        r4 r4Var = this.x;
        if (r4Var == null) {
            return;
        }
        r4Var.J();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } catch (Throwable unused) {
        }
        r4 r4Var = this.x;
        if (r4Var == null) {
            return;
        }
        r4Var.a(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        Intent intent = new Intent();
        intent.setAction(RpLoadingActivity.h);
        h.a(this).a(intent);
        r4 r4Var = this.x;
        if (r4Var == null) {
            return;
        }
        r4Var.K();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putInt(BaseBioNavigatorActivity.v, Process.myPid());
    }

    public static /* synthetic */ r4 a(ALBiometricsActivity aLBiometricsActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r4) ipChange.ipc$dispatch("3285f926", new Object[]{aLBiometricsActivity}) : aLBiometricsActivity.x;
    }

    public static void a(Context context, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c542844", new Object[]{context, rPBizConfig});
            return;
        }
        Intent intent = new Intent(context, ALBiometricsActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(BaseBioNavigatorActivity.u, rPBizConfig);
        context.startActivity(intent);
        TransitionMode transitionMode = rPBizConfig.getRpConfig().getBiometricsConfig().getTransitionMode();
        if (!(context instanceof Activity)) {
            return;
        }
        BaseBioNavigatorActivity.a((Activity) context, transitionMode);
    }

    @Override // com.alibaba.security.realidentity.ui.activity.BaseAlBioActivity
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f.getBiometricsConfig().stepResult;
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            a(TrackLog.createSdkExceptionLog(str, str2, A));
        }
    }

    private boolean a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b668f70", new Object[]{this, bundle})).booleanValue();
        }
        return (bundle == null || bundle.getInt(BaseBioNavigatorActivity.v, 0) == Process.myPid()) ? false : true;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(TrackLog.createBioActivityExitLog(str));
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("orientation", str);
        hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, String.valueOf(Process.myPid()));
        a(TrackLog.createBioActivityEnterLog(com.alibaba.security.realidentity.b.a((Object) hashMap), str2));
    }

    private void a(boolean z, boolean z2, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb100d68", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isHwMagicWindow", Boolean.valueOf(z3));
        hashMap.put("isHonorFoldableDevice", Boolean.valueOf(z4));
        hashMap.put("isMagicWindowDowngradeOn", Boolean.valueOf(z));
        hashMap.put("isHonorFoldableDowngradeOn", Boolean.valueOf(z2));
        a(TrackLog.createMagicWindowLog(com.alibaba.security.realidentity.b.a((Object) hashMap)));
    }

    private void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6099b195", new Object[]{this, trackLog});
            return;
        }
        RPBizConfig rPBizConfig = this.f;
        if (rPBizConfig != null) {
            trackLog.setVerifyToken(rPBizConfig.getBasicsConfig().verifyToken);
        }
        trackLog.addTag9(g2.f3421a + "/" + g2.b);
        trackLog.addTag10("Android");
        RPTrack.a(trackLog);
        RPTrack.c();
    }

    private void a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
        } else {
            a(TrackLog.createStartEndLog(str, str2, System.currentTimeMillis(), "-1", String.valueOf(i), String.valueOf(i)));
        }
    }

    @Override // com.alibaba.security.realidentity.ui.activity.BaseAlBioActivity
    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else if (b()) {
            a(new b(i, str));
        } else {
            finish();
        }
    }
}
