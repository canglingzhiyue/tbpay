package com.alibaba.security.realidentity.ui.activity;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.WindowManager;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.e;
import com.alibaba.security.realidentity.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public abstract class BaseBioNavigatorActivity extends BaseAlBioActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String g = "BaseActivity";
    public static final int h = 10002;
    public static final int i = 10004;
    public static final int j = 10005;
    public static final int k = 10009;
    public static final int l = 10010;
    public static final int m = 10012;
    public static final int n = 10013;
    public static final int o = 20002;
    public static final int p = 20003;
    public static final int q = 20004;
    public static final int r = 20005;
    public static final int s = 20006;
    public static final int t = 20007;
    public static final String u = "KEY_BIZ_CONFIG";
    public static final String v = "KEY_LAST_PID";
    public static final int w = 20008;
    public TransitionMode e;
    public RPBizConfig f;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3538a;

        static {
            int[] iArr = new int[TransitionMode.values().length];
            f3538a = iArr;
            try {
                TransitionMode transitionMode = TransitionMode.NULL;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f3538a;
                TransitionMode transitionMode2 = TransitionMode.LEFT;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f3538a;
                TransitionMode transitionMode3 = TransitionMode.RIGHT;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f3538a;
                TransitionMode transitionMode4 = TransitionMode.TOP;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f3538a;
                TransitionMode transitionMode5 = TransitionMode.BOTTOM;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a(Activity activity, TransitionMode transitionMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a05747", new Object[]{activity, transitionMode});
        } else if (transitionMode == null) {
            activity.overridePendingTransition(0, 0);
        } else {
            int ordinal = transitionMode.ordinal();
            if (ordinal == 0) {
                activity.overridePendingTransition(0, 0);
            } else if (ordinal == 1) {
                activity.overridePendingTransition(R.anim.rp_anim_face_right_in, R.anim.rp_anim_face_right_out);
            } else if (ordinal == 2) {
                activity.overridePendingTransition(R.anim.rp_anim_face_left_in, R.anim.rp_anim_face_left_out);
            } else if (ordinal == 3) {
                activity.overridePendingTransition(R.anim.rp_anim_face_bottom_in, R.anim.rp_anim_face_bottom_out);
            } else if (ordinal != 4) {
            } else {
                activity.overridePendingTransition(R.anim.rp_anim_face_top_in, R.anim.rp_anim_face_top_out);
            }
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            } else if (m.f() && e.e(this)) {
                e.a(getWindow());
            } else if (!m.j() || !e.f(this)) {
            } else {
                e.b(getWindow());
            }
        } catch (Exception e) {
            com.alibaba.security.realidentity.a.a(g, e);
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

    public static /* synthetic */ Object ipc$super(BaseBioNavigatorActivity baseBioNavigatorActivity, String str, Object... objArr) {
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
            case 1150324634:
                super.finish();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        try {
            if (this.e == null) {
                return;
            }
            a(this, this.e);
        } catch (Throwable th) {
            com.alibaba.security.realidentity.a.a(g, th);
        }
    }

    @Override // com.alibaba.security.realidentity.ui.activity.BaseAlBioActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        requestWindowFeature(1);
        super.onCreate(bundle);
        e();
        setVolumeControlStream(3);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().addFlags(128);
        getWindow().setFlags(1024, 1024);
        RPBizConfig rPBizConfig = (RPBizConfig) getIntent().getSerializableExtra(u);
        this.f = rPBizConfig;
        if (rPBizConfig == null) {
            return;
        }
        this.e = rPBizConfig.getRpConfig().getBiometricsConfig().getTransitionMode();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.security.realidentity.ui.activity.BaseAlBioActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
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
}
