package com.taobao.android.detail2.core.framework.floatwindow.permission;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.KeyEvent;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fjt;
import tb.kge;

/* loaded from: classes5.dex */
public class PermissionActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DialogInterface.OnClickListener f11556a = new DialogInterface.OnClickListener() { // from class: com.taobao.android.detail2.core.framework.floatwindow.permission.PermissionActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            try {
                PermissionActivity.this.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + PermissionActivity.this.getPackageName())), 10000);
            } catch (ActivityNotFoundException e) {
                fjt.a("PermissionActivity", "MANAGE_OVERLAY_PERMISSION fail", e);
            }
            dialogInterface.dismiss();
        }
    };
    private DialogInterface.OnClickListener b = new DialogInterface.OnClickListener() { // from class: com.taobao.android.detail2.core.framework.floatwindow.permission.PermissionActivity.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            LocalBroadcastManager.getInstance(PermissionActivity.this).sendBroadcast(new Intent(a.ACTION_PERMISSION_RESULT));
            PermissionActivity.this.finish();
        }
    };
    private DialogInterface.OnCancelListener c = new DialogInterface.OnCancelListener() { // from class: com.taobao.android.detail2.core.framework.floatwindow.permission.PermissionActivity.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            LocalBroadcastManager.getInstance(PermissionActivity.this).sendBroadcast(new Intent(a.ACTION_PERMISSION_RESULT));
            PermissionActivity.this.finish();
        }
    };

    static {
        kge.a(1953141435);
    }

    public static /* synthetic */ Object ipc$super(PermissionActivity permissionActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode != 1257714799) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
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

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        try {
            a();
        } catch (Throwable th) {
            fjt.a("new_detail异常", "未知异常。 askForFloatWindow - Permission。浮窗权限弹窗失败。", th);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        AlertDialog create = new AlertDialog.Builder(this).setMessage("视频小窗需要在应用设置中开启悬浮窗权限，是否前往开启权限？").setPositiveButton("是", this.f11556a).setNegativeButton("否", this.b).create();
        create.setOnCancelListener(this.c);
        if ((Build.VERSION.SDK_INT >= 17 && isDestroyed()) || isFinishing()) {
            return;
        }
        create.show();
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
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(a.ACTION_PERMISSION_RESULT));
        }
        finish();
    }
}
