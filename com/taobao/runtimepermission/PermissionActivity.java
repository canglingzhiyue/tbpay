package com.taobao.runtimepermission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.runtimepermission.config.RPConfig;
import com.taobao.runtimepermission.config.a;
import com.taobao.runtimepermission.view.MongolianView;
import com.taobao.runtimepermission.view.PermissionBizManagerTipLayout;
import com.taobao.runtimepermission.view.PermissionBizReqLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.DialogAction;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.component.unify.Dialog.Theme;
import java.io.File;
import java.util.Arrays;
import tb.lys;
import tb.nmk;
import tb.nmn;
import tb.nmo;
import tb.tfr;

/* loaded from: classes7.dex */
public class PermissionActivity extends Activity implements ActivityCompat.OnRequestPermissionsResultCallback, nmk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PermissionActivity";

    /* renamed from: a  reason: collision with root package name */
    private PermissionBizReqLayout f18979a;
    private PermissionBizManagerTipLayout b;
    private RelativeLayout c;
    private String d;
    private String[] e;
    private String[] f;
    private int[] g;
    private MongolianView k;
    private String l;
    private int n;
    private String p;
    private Handler h = new Handler();
    private Runnable i = null;
    private Runnable o = null;
    private boolean j = false;
    private final nmn.a m = new nmn.a();

    public static /* synthetic */ Object ipc$super(PermissionActivity permissionActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
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
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed33fa1f", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ MongolianView a(PermissionActivity permissionActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MongolianView) ipChange.ipc$dispatch("560ac8fd", new Object[]{permissionActivity}) : permissionActivity.k;
    }

    public static /* synthetic */ void a(PermissionActivity permissionActivity, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7101479f", new Object[]{permissionActivity, strArr});
        } else {
            permissionActivity.d(strArr);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.runtime_permission_layout);
        a();
        this.k = (MongolianView) findViewById(R.id.mongolian);
        this.f18979a = (PermissionBizReqLayout) findViewById(R.id.biz_permission_request_layout);
        this.b = (PermissionBizManagerTipLayout) findViewById(R.id.manager_permission_info_layout);
        this.c = (RelativeLayout) findViewById(R.id.permission_reason_layout);
        this.k.setTransparent();
        a(bundle);
        String stringExtra = getIntent().getStringExtra("bizName");
        String stringExtra2 = getIntent().getStringExtra("originBizName");
        long longExtra = getIntent().getLongExtra(TBRunTimePermission.SILENCE_INTERVAL_NAME, -1L);
        boolean booleanExtra = getIntent().getBooleanExtra("showRational", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("transparentBackground", false);
        this.n = getIntent().getIntExtra(com.taobao.tao.log.statistics.d.PARAM_TASK_ID, -1);
        this.l = stringExtra;
        this.p = stringExtra2;
        this.d = getIntent().getStringExtra(TBRunTimePermission.EXPLAIN_PARAM_NAME);
        this.f = getIntent().getStringArrayExtra("sysPermissions");
        this.e = getIntent().getStringArrayExtra("bizPermissions");
        if (a(this.f, this.e)) {
            tfr.b("PermissionActivity", "onCreate: need request permissions is empty, activity finish!");
            finish();
            return;
        }
        String[] strArr = this.f;
        if (strArr != null && strArr.length == 1 && strArr[0].equals("android.permission.SYSTEM_ALERT_WINDOW")) {
            startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), 123);
            return;
        }
        a(stringExtra, booleanExtra, longExtra, this.f, this.e, this.d, booleanExtra2);
    }

    @Override // android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else if (i != 1096) {
        } else {
            if (this.j && strArr.length == 0 && iArr.length == 0) {
                return;
            }
            this.m.a(this.p, this.l, strArr, iArr);
            String[] strArr2 = this.e;
            if (strArr2 != null && strArr2.length > 0) {
                this.f = strArr;
                this.g = iArr;
                b(strArr2, this.d, true);
                return;
            }
            f.a(this.n, i, strArr, iArr);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 123) {
            f.a(this.n, i, i2, intent);
        }
        finish();
    }

    private void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        if (bundle == null || !lys.a(this)) {
            z = false;
        }
        this.j = z;
    }

    private void a(String[] strArr, boolean z) {
        int[] iArr;
        String[] strArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729c39fd", new Object[]{this, strArr, new Boolean(z)});
            return;
        }
        String[] strArr3 = this.f;
        int i = -2;
        if (strArr3 != null && strArr3.length > 0) {
            int a2 = nmo.a(strArr3);
            int a3 = nmo.a(strArr) + a2;
            strArr2 = new String[a3];
            iArr = new int[a3];
            nmo.a(strArr2, this.f, strArr);
            nmo.a(iArr, this.g, 0, a2);
            if (z) {
                i = 0;
            }
            Arrays.fill(iArr, a2, a3, i);
        } else {
            iArr = new int[nmo.a(strArr)];
            if (z) {
                i = 0;
            }
            Arrays.fill(iArr, i);
            strArr2 = strArr;
        }
        this.m.a(this.p, this.l, strArr, z);
        f.a(this.n, 123, strArr2, iArr);
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
        Handler handler = this.h;
        if (handler == null) {
            return;
        }
        Runnable runnable = this.i;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.o;
        if (runnable2 == null) {
            return;
        }
        this.h.removeCallbacks(runnable2);
    }

    private boolean a(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4420b40c", new Object[]{this, strArr, strArr2})).booleanValue() : (strArr == null || strArr.length <= 0) && (strArr2 == null || strArr2.length <= 0);
    }

    private void a(String str, boolean z, long j, final String[] strArr, String[] strArr2, String str2, boolean z2) {
        long j2 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3574c8", new Object[]{this, str, new Boolean(z), new Long(j2), strArr, strArr2, str2, new Boolean(z2)});
        } else if (z && !StringUtils.isEmpty(str2)) {
            boolean exists = new File("/data/local/tmp/permission_silence_off").exists();
            if (j2 < 0) {
                j2 = a.a().b().permissionReqSilenceInterval;
            }
            long j3 = j2;
            if (!exists && !this.j && a(this.p, j3, strArr, strArr2)) {
                a(str, strArr, strArr2);
                return;
            }
            if (strArr != null && strArr.length > 0) {
                a(strArr, str2);
            } else {
                b(strArr2, str2, false);
            }
            b(this.p, strArr, strArr2);
        } else if (a(strArr) && !StringUtils.isEmpty(str2)) {
            this.k.setTranslucent();
            new TBMaterialDialog.Builder(this).positiveText(b.a(R.string.app_i_know)).content(str2).theme(Theme.LIGHT).cancelable(false).onPositive(new TBMaterialDialog.SingleButtonCallback() { // from class: com.taobao.runtimepermission.PermissionActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
                public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                        return;
                    }
                    PermissionActivity.a(PermissionActivity.this, strArr);
                    tBMaterialDialog.dismiss();
                }
            }).show();
        } else {
            d(strArr);
        }
    }

    private boolean a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b26fbb", new Object[]{this, strArr})).booleanValue();
        }
        for (String str : strArr) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, str)) {
                return true;
            }
        }
        return false;
    }

    private void a(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a325b9c1", new Object[]{this, strArr, str});
            return;
        }
        d(strArr);
        c(strArr, str);
        this.f18979a.setVisibility(8);
        this.b.setVisibility(8);
    }

    private void d(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b71c54", new Object[]{this, strArr});
            return;
        }
        this.m.a();
        try {
            ActivityCompat.requestPermissions(this, strArr, 1096);
        } catch (Throwable th) {
            tfr.b("PermissionActivity", "requestSysPermissions error: " + th);
            int[] iArr = new int[strArr.length];
            Arrays.fill(iArr, -1);
            onRequestPermissionsResult(1096, strArr, iArr);
        }
    }

    private void b(String[] strArr, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d39ff4", new Object[]{this, strArr, str, new Boolean(z)});
            return;
        }
        this.m.a();
        this.k.setTranslucent();
        if (z) {
            this.k.invalidate();
        }
        a(strArr, str, true);
    }

    private void a(String[] strArr, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1923133", new Object[]{this, strArr, str, new Boolean(z)});
            return;
        }
        if (z) {
            int c = c(strArr);
            int b = b(strArr);
            this.f18979a.setRationalTitleText(b.a(c));
            this.f18979a.setReqPermissionIconImg(b);
            this.f18979a.setRationalText(str);
            this.f18979a.setEventListener(this);
            this.f18979a.showWithAnimation();
        }
        this.c.setVisibility(8);
        this.b.setVisibility(8);
        this.f18979a.setVisibility(0);
        this.f18979a.autoSizeBottomButtonIfNeeded();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.setEventListener(this);
        this.c.setVisibility(8);
        this.f18979a.setVisibility(8);
        this.b.setVisibility(0);
    }

    private void c(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f023ff", new Object[]{this, strArr, str});
            return;
        }
        final RelativeLayout relativeLayout = this.c;
        int c = c(strArr);
        int b = b(strArr);
        ((TextView) findViewById(R.id.reason_tips_title)).setText(b.a(c));
        ((ImageView) findViewById(R.id.reason_tips_img)).setImageResource(b);
        ((TextView) findViewById(R.id.reason_tips_explain)).setText(str);
        final TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        RPConfig b2 = a.a().b();
        long j = b2.sameScreenMarkDelayTime;
        this.o = new Runnable() { // from class: com.taobao.runtimepermission.PermissionActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                PermissionActivity.a(PermissionActivity.this).setTranslucent();
                PermissionActivity.a(PermissionActivity.this).invalidate();
            }
        };
        this.h.postDelayed(this.o, j);
        long j2 = b2.sameScreenPopDelayTime;
        this.i = new Runnable() { // from class: com.taobao.runtimepermission.PermissionActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                relativeLayout.startAnimation(translateAnimation);
                relativeLayout.setVisibility(0);
            }
        };
        this.h.postDelayed(this.i, j2);
    }

    private int b(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffb3fe89", new Object[]{this, strArr})).intValue();
        }
        if (strArr.length > 1) {
            return R.drawable.default_permission_img;
        }
        String str = strArr[0];
        char c = 65535;
        switch (str.hashCode()) {
            case -1888586689:
                if (str.equals(com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION)) {
                    c = 3;
                    break;
                }
                break;
            case -63024214:
                if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    c = 4;
                    break;
                }
                break;
            case 463403621:
                if (str.equals(com.taobao.speech.util.e.CAMERA)) {
                    c = 1;
                    break;
                }
                break;
            case 1831139720:
                if (str.equals("android.permission.RECORD_AUDIO")) {
                    c = 2;
                    break;
                }
                break;
            case 1977429404:
                if (str.equals("android.permission.READ_CONTACTS")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            return R.drawable.contact_permission_img;
        }
        if (c == 1) {
            return R.drawable.camera_permisson_img;
        }
        if (c == 2) {
            return R.drawable.record_permission_img;
        }
        if (c == 3 || c == 4) {
            return R.drawable.location_permission_img;
        }
        return R.drawable.default_permission_img;
    }

    private int c(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbb58d68", new Object[]{this, strArr})).intValue();
        }
        if (strArr.length > 1) {
            return R.string.default_title;
        }
        String str = strArr[0];
        char c = 65535;
        switch (str.hashCode()) {
            case -1888586689:
                if (str.equals(com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION)) {
                    c = 3;
                    break;
                }
                break;
            case -63024214:
                if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    c = 4;
                    break;
                }
                break;
            case 463403621:
                if (str.equals(com.taobao.speech.util.e.CAMERA)) {
                    c = 1;
                    break;
                }
                break;
            case 1831139720:
                if (str.equals("android.permission.RECORD_AUDIO")) {
                    c = 2;
                    break;
                }
                break;
            case 1977429404:
                if (str.equals("android.permission.READ_CONTACTS")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            return R.string.read_contact_permission_title;
        }
        if (c == 1) {
            return R.string.camera_permission_title;
        }
        if (c == 2) {
            return R.string.record_permission_title;
        }
        if (c == 3 || c == 4) {
            return R.string.location_permission_title;
        }
        return R.string.default_title;
    }

    public void a() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 21) {
            Window window2 = getWindow();
            if (window2 == null) {
                return;
            }
            window2.clearFlags(67108864);
            window2.addFlags(Integer.MIN_VALUE);
            window2.setStatusBarColor(0);
        } else if (Build.VERSION.SDK_INT < 19 || (window = getWindow()) == null) {
        } else {
            window.addFlags(67108864);
        }
    }

    @Override // tb.nmk
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else if (i == -1) {
            a(this.e, false);
        } else if (i == 0) {
            a(this.e, true);
        } else if (i == 10001) {
            b();
        } else if (i != 10003) {
        } else {
            a(this.e, this.d, false);
        }
    }

    private boolean a(String str, long j, String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baab58f6", new Object[]{this, str, new Long(j), strArr, strArr2})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = getApplication().getSharedPreferences("permission_silence_mark", 0);
        String str2 = ":";
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str3 = str2;
                long j2 = sharedPreferences.getLong(str + str2 + strArr[i], -1L);
                if (j2 != -1 && currentTimeMillis - j2 <= j * 1000) {
                    tfr.b("PermissionActivity", "checkInSilencePeriod: permissions req failed, in silence period.");
                    return true;
                }
                i++;
                str2 = str3;
            }
        }
        String str4 = str2;
        if (strArr2 == null) {
            return false;
        }
        for (String str5 : strArr2) {
            long j3 = sharedPreferences.getLong(str + str4 + str5, -1L);
            if (j3 != -1 && currentTimeMillis - j3 <= j * 1000) {
                tfr.b("PermissionActivity", "checkInSilencePeriod: permissions req failed, in silence period.");
                return true;
            }
        }
        return false;
    }

    private void a(String str, String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31be6c52", new Object[]{this, str, strArr, strArr2});
            return;
        }
        int a2 = nmo.a(strArr);
        int a3 = nmo.a(strArr2) + a2;
        String[] strArr3 = new String[a3];
        int[] iArr = new int[a3];
        for (int i = 0; i < a2; i++) {
            strArr3[i] = strArr[i];
            iArr[i] = ActivityCompat.checkSelfPermission(this, strArr3[i]);
        }
        for (int i2 = a2; i2 < a3; i2++) {
            strArr3[i2] = strArr2[i2 - a2];
            iArr[i2] = c.a(this, str, strArr3[i2]) ? 0 : -2;
        }
        f.a(this.n, 123, strArr3, iArr);
        finish();
    }

    private void b(String str, String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec340cd3", new Object[]{this, str, strArr, strArr2});
            return;
        }
        SharedPreferences.Editor edit = getApplication().getSharedPreferences("permission_silence_mark", 0).edit();
        long currentTimeMillis = System.currentTimeMillis();
        if (strArr != null) {
            for (String str2 : strArr) {
                edit.putLong(str + ":" + str2, currentTimeMillis);
            }
        }
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                edit.putLong(str + ":" + str3, currentTimeMillis);
            }
        }
        edit.apply();
    }
}
