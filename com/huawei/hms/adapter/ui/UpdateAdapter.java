package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.availableupdate.c;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class UpdateAdapter implements IBridgeActivityDelegate {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Activity> f7343a;
    private Context b;
    private int c;
    private UpdateBean d;
    private boolean e = false;

    private void a() {
        Activity b = b();
        if (b == null || b.isFinishing()) {
            return;
        }
        b.finish();
    }

    private void a(Intent intent) {
        int intExtra = intent.getIntExtra(BridgeActivity.EXTRA_RESULT, -1);
        if (intExtra == 0) {
            HMSLog.i("UpdateAdapter", "Error resolved successfully!");
            SystemManager.getInstance().notifyUpdateResult(0);
        } else if (intExtra == 13) {
            HMSLog.i("UpdateAdapter", "Resolve error process canceled by user!");
            SystemManager.getInstance().notifyUpdateResult(13);
        } else if (intExtra == 8) {
            HMSLog.i("UpdateAdapter", "Internal error occurred, recommended retry.");
            SystemManager.getInstance().notifyUpdateResult(8);
        } else {
            HMSLog.i("UpdateAdapter", "Other error codes.");
            SystemManager.getInstance().notifyUpdateResult(intExtra);
        }
    }

    private boolean a(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str) && i != 0) {
            PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(str)) || packageManagerHelper.getPackageVersionCode(str) < i) {
                return true;
            }
        }
        return false;
    }

    private boolean a(Intent intent, Activity activity) {
        if (intent.getBooleanExtra(CommonCode.MapKey.NEW_UPDATE, false)) {
            HMSLog.i("UpdateAdapter", "4.0 framework HMSCore upgrade process");
            String hMSPackageName = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
            ComponentName componentName = new ComponentName(hMSPackageName, "com.huawei.hms.fwksdk.stub.UpdateStubActivity");
            Intent intent2 = new Intent();
            intent2.putExtra(KpmsConstant.CALLER_PACKAGE_NAME, activity.getApplicationContext().getPackageName());
            intent2.putExtra(KpmsConstant.UPDATE_PACKAGE_NAME, hMSPackageName);
            intent2.setComponent(componentName);
            activity.startActivityForResult(intent2, 1001);
            return true;
        }
        return false;
    }

    private Activity b() {
        WeakReference<Activity> weakReference = this.f7343a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void c() {
        SystemManager.getInstance().notifyUpdateResult(8);
        a();
    }

    public static Object invokeMethod(String str, String str2, Object[] objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] instanceof Activity) {
                clsArr[i] = Activity.class;
            } else if (objArr[i] instanceof Context) {
                clsArr[i] = Context.class;
            } else if (objArr[i] instanceof UpdateBean) {
                clsArr[i] = UpdateBean.class;
            } else if (objArr[i] instanceof Integer) {
                clsArr[i] = Integer.TYPE;
            } else if (objArr[i] instanceof Boolean) {
                clsArr[i] = Boolean.TYPE;
            } else {
                HMSLog.e("UpdateAdapter", "not set args[" + i + "] type");
            }
        }
        try {
            Class<?> cls = Class.forName(str);
            return cls.getMethod(str2, clsArr).invoke(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), objArr);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            HMSLog.e("UpdateAdapter", "invoke " + str + "." + str2 + " fail. " + e.getMessage());
            return null;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            HMSLog.i("UpdateAdapter", "activity == null");
            c();
            return;
        }
        this.b = activity.getApplicationContext();
        this.f7343a = new WeakReference<>(activity);
        if (!c.b.a(b())) {
            return;
        }
        Intent intent = activity.getIntent();
        if (intent == null) {
            c();
            return;
        }
        try {
            this.c = intent.getIntExtra(CommonCode.MapKey.UPDATE_VERSION, 0);
        } catch (Exception e) {
            HMSLog.e("UpdateAdapter", "get update_version:" + e.getMessage());
        }
        if (this.c == 0) {
            c();
            return;
        }
        if (intent.hasExtra("installHMS")) {
            this.e = true;
        }
        if (a(intent, activity) || !AvailableUtil.isInstallerLibExist(this.b)) {
            return;
        }
        UpdateBean updateBean = (UpdateBean) invokeMethod("com.huawei.hms.adapter.ui.InstallerAdapter", "setUpdateBean", new Object[]{activity, Integer.valueOf(this.c), Boolean.valueOf(this.e)});
        this.d = updateBean;
        invokeMethod("com.huawei.hms.adapter.ui.InstallerAdapter", "startUpdateHms", new Object[]{activity, updateBean, 1001});
        this.d = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("UpdateAdapter", "onBridgeActivityDestroy");
        c.b.b(b());
        this.f7343a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        SystemManager systemManager;
        int i3;
        if (i != getRequestCode()) {
            this.d = null;
            return false;
        }
        HMSLog.i("UpdateAdapter", "onBridgeActivityResult " + i2);
        if (AvailableUtil.isInstallerLibExist(this.b) && i2 == 1214) {
            HMSLog.i("UpdateAdapter", "Enter update escape route");
            Activity b = b();
            if (b == null) {
                HMSLog.e("UpdateAdapter", "bridgeActivity is null, update escape failed ");
                this.d = null;
                return true;
            }
            invokeMethod("com.huawei.hms.update.manager.UpdateManager", "startUpdate", new Object[]{b, 1001, this.d});
            this.d = null;
        }
        if (i2 == -1) {
            if (intent != null) {
                if (intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0) == 1) {
                    HMSLog.i("UpdateAdapter", "new framework update process,Error resolved successfully!");
                    SystemManager.getInstance().notifyUpdateResult(0);
                    this.d = null;
                    a();
                    return true;
                }
                a(intent);
            }
        } else if (i2 == 0) {
            HMSLog.i("UpdateAdapter", "Activity.RESULT_CANCELED");
            this.d = null;
            Activity b2 = b();
            if (b2 == null) {
                return true;
            }
            String hMSPackageName = HMSPackageManager.getInstance(b2.getApplicationContext()).getHMSPackageName();
            if (this.e || a(b2, hMSPackageName, this.c)) {
                HMSLog.i("UpdateAdapter", "Resolve error, process canceled by user clicking back button!");
                systemManager = SystemManager.getInstance();
                i3 = 13;
                systemManager.notifyUpdateResult(i3);
            } else {
                SystemManager.getInstance().notifyUpdateResult(0);
            }
        } else if (i2 == 1) {
            systemManager = SystemManager.getInstance();
            i3 = 28;
            systemManager.notifyUpdateResult(i3);
        }
        a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("UpdateAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.i("UpdateAdapter", "On key up when resolve conn error");
    }
}
