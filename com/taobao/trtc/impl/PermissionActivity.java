package com.taobao.trtc.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.export.adapter.ILocalizationService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import com.uc.webview.export.media.MessageID;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes9.dex */
public class PermissionActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PERMISSION_TYPE_MEDIA_PEOJECTION = "PERMISSION_TYPE_MEDIA_PEOJECTION";
    public static final String PERMISSION_TYPE_OVERLAY = "PERMISSION_TYPE_OVERLAY";
    public static final String PERMISSION_TYPE_OVERLAY_WITH_DIALOG = "PERMISSION_TYPE_OVERLAY_WITH_DIALOG";

    /* renamed from: a */
    public static WeakReference<Activity> f23073a;
    private static a c;
    private static a d;
    private AlertDialog b;
    private boolean e = false;
    private final BroadcastReceiver f = new BroadcastReceiver() { // from class: com.taobao.trtc.impl.PermissionActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            PermissionActivity.this = this;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            TrtcLog.d("PermissionActivity", "onReceive >>> " + intent.getAction());
            PermissionActivity.this.finish();
        }
    };

    /* loaded from: classes9.dex */
    public interface a {
        void onPermissionResult(boolean z, Intent intent);
    }

    static {
        kge.a(1476478);
    }

    public static /* synthetic */ Object ipc$super(PermissionActivity permissionActivity, String str, Object... objArr) {
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

    /* renamed from: lambda$CenS3zMJJU-sHX_f75I6TyzMpQ0 */
    public static /* synthetic */ void m1544lambda$CenS3zMJJUsHX_f75I6TyzMpQ0(PermissionActivity permissionActivity, DialogInterface dialogInterface) {
        permissionActivity.a(dialogInterface);
    }

    public static /* synthetic */ void lambda$g41wDd3mnaM1z9vKulC4R6qto9Y(PermissionActivity permissionActivity, DialogInterface dialogInterface, int i) {
        permissionActivity.a(dialogInterface, i);
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

    public static /* synthetic */ AlertDialog a(PermissionActivity permissionActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertDialog) ipChange.ipc$dispatch("bd4aff6", new Object[]{permissionActivity}) : permissionActivity.b;
    }

    public static /* synthetic */ void a(PermissionActivity permissionActivity, boolean z, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285e6bd6", new Object[]{permissionActivity, new Boolean(z), intent});
        } else {
            permissionActivity.a(z, intent);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        f23073a = new WeakReference<>(this);
        super.onCreate(bundle);
        try {
            LocalBroadcastManager.getInstance(this).registerReceiver(this.f, new IntentFilter("com.taobao.trtc.impl.PermissionActivity.stop"));
            this.e = true;
            TrtcLog.d("PermissionActivity", "registerReceiver done");
        } catch (Exception unused) {
        }
        if (getIntent().getBooleanExtra(PERMISSION_TYPE_OVERLAY, false)) {
            TrtcLog.d("PermissionActivity", "type: PERMISSION_TYPE_OVERLAY");
            if (!a((Context) this)) {
                a(getIntent().getBooleanExtra(PERMISSION_TYPE_OVERLAY_WITH_DIALOG, true));
            } else {
                a(true, (Intent) null);
            }
        } else if (!getIntent().getBooleanExtra(PERMISSION_TYPE_MEDIA_PEOJECTION, false)) {
        } else {
            TrtcLog.d("PermissionActivity", "type: PERMISSION_TYPE_MEDIA_PEOJECTION");
            c();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            Uri parse = Uri.parse("package:" + getPackageName());
            TrtcLog.d("PermissionActivity", "uri: " + parse);
            startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", parse), 123);
        } catch (ActivityNotFoundException unused) {
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.b = new AlertDialog.Builder(this).setMessage("请开启淘宝悬浮窗权限").setPositiveButton("开启", new DialogInterface.OnClickListener() { // from class: com.taobao.trtc.impl.-$$Lambda$PermissionActivity$g41wDd3mnaM1z9vKulC4R6qto9Y
                {
                    PermissionActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PermissionActivity.lambda$g41wDd3mnaM1z9vKulC4R6qto9Y(PermissionActivity.this, dialogInterface, i);
                }
            }).setNegativeButton(ILocalizationService.CANCEL, new DialogInterface.OnClickListener() { // from class: com.taobao.trtc.impl.PermissionActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    PermissionActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PermissionActivity.a(PermissionActivity.this).dismiss();
                    TrtcLog.d("PermissionActivity", "Cancel for overlay permission");
                    PermissionActivity permissionActivity = PermissionActivity.this;
                    PermissionActivity.a(permissionActivity, PermissionActivity.a((Context) permissionActivity), null);
                    PermissionActivity.this.finish();
                }
            }).create();
            this.b.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.trtc.impl.-$$Lambda$PermissionActivity$CenS3zMJJU-sHX_f75I6TyzMpQ0
                {
                    PermissionActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    PermissionActivity.m1544lambda$CenS3zMJJUsHX_f75I6TyzMpQ0(PermissionActivity.this, dialogInterface);
                }
            });
            if (isFinishing()) {
                return;
            }
            this.b.show();
        } else {
            b();
        }
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ddbbc5", new Object[]{this, dialogInterface, new Integer(i)});
            return;
        }
        b();
        this.b.dismiss();
    }

    public /* synthetic */ void a(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d596fe", new Object[]{this, dialogInterface});
            return;
        }
        a(a((Context) this), (Intent) null);
        finish();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getApplication().getSystemService("media_projection");
        if (mediaProjectionManager == null) {
            return;
        }
        startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 124);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (i == 123) {
            com.taobao.trtc.utils.h.a("PermissionActivity", "onActivityResult, permission for overlay: " + a((Context) this));
            a(a((Context) this), intent);
        } else if (i == 124) {
            com.taobao.trtc.utils.h.a("PermissionActivity", "onActivityResult, permission for mediaprojection, result: " + i2);
            synchronized (PermissionActivity.class) {
                if (d != null) {
                    a aVar = d;
                    if (i2 != -1) {
                        z = false;
                    }
                    aVar.onPermissionResult(z, intent);
                }
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TrtcLog.d("PermissionActivity", MessageID.onDestroy);
        if (this.e) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f);
            this.e = false;
        }
        if (getIntent().getBooleanExtra(PERMISSION_TYPE_OVERLAY, false)) {
            finishActivity(123);
        } else if (getIntent().getBooleanExtra(PERMISSION_TYPE_MEDIA_PEOJECTION, false)) {
            finishActivity(124);
        }
        super.onDestroy();
    }

    private void a(boolean z, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b74d729", new Object[]{this, new Boolean(z), intent});
            return;
        }
        synchronized (PermissionActivity.class) {
            if (c != null) {
                c.onPermissionResult(z, intent);
            }
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return Settings.canDrawOverlays(context);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b932d47e", new Object[]{aVar});
            return;
        }
        synchronized (PermissionActivity.class) {
            c = aVar;
        }
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2fd765d", new Object[]{aVar});
            return;
        }
        synchronized (PermissionActivity.class) {
            d = aVar;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        TrtcLog.d("PermissionActivity", com.taobao.android.weex_framework.util.a.ATOM_EXT_clear);
        c = null;
        d = null;
        f23073a = null;
    }
}
