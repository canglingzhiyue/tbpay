package com.taobao.taolive.sdk.permisson;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.view.KeyEvent;
import android.view.View;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;
import tb.pmd;
import tb.pqk;

/* loaded from: classes8.dex */
public class PermissionActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Dialog b;

    /* renamed from: a  reason: collision with root package name */
    private BroadcastReceiver f21870a = new BroadcastReceiver() { // from class: com.taobao.taolive.sdk.permisson.PermissionActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !"com.taobao.taolive.sdk.permission.stop".equals(intent.getAction())) {
            } else {
                pmd.a().m().b("TBLiveXXXX", "ACTION STOP PERMISSON CHECK");
                if (PermissionActivity.a(PermissionActivity.this) != null) {
                    try {
                        if (!PermissionActivity.this.isFinishing() && !PermissionActivity.this.isDestroyed()) {
                            PermissionActivity.a(PermissionActivity.this).dismiss();
                        }
                    } catch (Throwable unused) {
                    }
                    a.a(false);
                }
                PermissionActivity.this.finish();
            }
        }
    };
    private boolean c = false;

    static {
        kge.a(-2134285922);
    }

    public static /* synthetic */ Object ipc$super(PermissionActivity permissionActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
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
        j.b(context);
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

    public static /* synthetic */ Dialog a(PermissionActivity permissionActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("d7a09734", new Object[]{permissionActivity}) : permissionActivity.b;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("permissions");
        if (stringArrayListExtra != null) {
            if (!stringArrayListExtra.isEmpty()) {
                Iterator<String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(" ");
                }
            }
            this.c = true;
            ActivityCompat.requestPermissions(this, (String[]) stringArrayListExtra.toArray(new String[stringArrayListExtra.size()]), 33);
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this).registerReceiver(this.f21870a, new IntentFilter("com.taobao.taolive.sdk.permission.stop"));
        } catch (Exception unused) {
        }
        sb.append("FloatWindowPermission");
        sb.append("");
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        final pqk pqkVar = new pqk(this, R.style.TLLive_Permission_Dialog);
        pqkVar.a("开启直播悬浮窗");
        pqkVar.b("开启直播悬浮窗可以边看直播边浏览其他内容，需要您在应用设置中开启悬浮窗权限，是否前往开启？");
        pqkVar.a("暂不", new View.OnClickListener() { // from class: com.taobao.taolive.sdk.permisson.PermissionActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                a.a(false);
                PermissionActivity.this.finish();
            }
        });
        pqkVar.b("开启", new View.OnClickListener() { // from class: com.taobao.taolive.sdk.permisson.PermissionActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                try {
                    PermissionActivity.this.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + PermissionActivity.this.getPackageName())), 10000);
                } catch (ActivityNotFoundException unused) {
                }
                try {
                    if (PermissionActivity.this.isFinishing() || PermissionActivity.this.isDestroyed()) {
                        return;
                    }
                    pqkVar.dismiss();
                } catch (Throwable unused2) {
                }
            }
        });
        this.b = pqkVar;
        this.b.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.taolive.sdk.permisson.PermissionActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    return;
                }
                a.a(false);
                PermissionActivity.this.finish();
            }
        });
        if (isFinishing()) {
            return;
        }
        this.b.show();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 10000) {
            a.a(Settings.canDrawOverlays(this));
        }
        finish();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        if (i == 33) {
            a.a(i, strArr, iArr);
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
        super.onDestroy();
        if (this.c) {
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f21870a);
        } catch (Exception unused) {
        }
    }
}
