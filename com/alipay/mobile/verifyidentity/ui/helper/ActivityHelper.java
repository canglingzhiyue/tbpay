package com.alipay.mobile.verifyidentity.ui.helper;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.TimeCostLog;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ActivityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PROD_ACTIVITY = "isProActivity";
    public static final String TASK_MODULENAME = "task_modulename";
    public static final String TASK_TOKEN = "task_token";
    public static final String TASK_VERIFYID = "task_verifyid";

    /* renamed from: a  reason: collision with root package name */
    private static final String f6089a = "ActivityHelper";
    private static String[] e = {"com.alipay.mobile.verifyidentity.ui.helper.DialogActivity", "com.alipay.mobile.verifyidentity.ui.helper.NoticeActivity", "com.alipay.mobile.security.faceauth.ui.bank.WebNavigationActivity", "com.alipay.mobile.security.faceauth.ui.uniform.FaceLoginActivity", "com.alipay.mobile.security.faceauth.ui.uniform.FaceSampleActivity", "com.alipay.mobile.verifyidentity.helper.ui.VerifyParamsActivity", "com.alipay.mobile.verifyidentity.helper.ui.BuildVerifyActivity", "com.alipay.mobile.verifyidentity.helper.ui.RpcShowActivity", "com.alipay.mobile.verifyidentity.helper.ui.VerifyLogShowActivity", "com.alipay.mobile.verifyidentity.helper.zxing.activity.CaptureActivity", "com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity", "com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioProtoActivity", "com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity", "com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity", "com.alipay.mobile.verifyidentity.ui.helper.VerifyGuideActivity", "com.alipay.mobile.verifyidentity.ui.helper.VerifyDialogActivity", "com.alipay.mobile.verifyidentity.module.dynamic.ui.ViWebViewActivity"};
    private Activity b;
    private DialogHelper c;
    private boolean d;
    public MicroModuleContext mMicroModuleContext;
    public MicroModule mModule;

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ActivityHelper(android.app.Activity r9) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            r8.<init>()
            r1 = 0
            r8.d = r1
            r8.b = r9
            com.alipay.mobile.verifyidentity.ui.helper.DialogHelper r2 = new com.alipay.mobile.verifyidentity.ui.helper.DialogHelper
            r2.<init>(r9)
            r8.c = r2
            android.content.Intent r2 = r9.getIntent()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "task_verifyid"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch: java.lang.Throwable -> L48
            android.content.Intent r3 = r9.getIntent()     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = "task_token"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch: java.lang.Throwable -> L45
            android.content.Intent r4 = r9.getIntent()     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "task_modulename"
            java.lang.String r4 = r4.getStringExtra(r5)     // Catch: java.lang.Throwable -> L42
            android.content.Intent r5 = r9.getIntent()     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = "isProActivity"
            boolean r5 = r5.getBooleanExtra(r6, r1)     // Catch: java.lang.Throwable -> L40
            r8.d = r5     // Catch: java.lang.Throwable -> L40
            goto L51
        L40:
            r5 = move-exception
            goto L4c
        L42:
            r5 = move-exception
            r4 = r0
            goto L4c
        L45:
            r5 = move-exception
            r3 = r0
            goto L4b
        L48:
            r5 = move-exception
            r2 = r0
            r3 = r2
        L4b:
            r4 = r3
        L4c:
            java.lang.String r6 = com.alipay.mobile.verifyidentity.ui.helper.ActivityHelper.f6089a
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r6, r5)
        L51:
            com.alipay.mobile.verifyidentity.engine.MicroModuleContext r5 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.getInstance()
            r8.mMicroModuleContext = r5
            com.alipay.mobile.verifyidentity.engine.MicroModuleContext r5 = r8.mMicroModuleContext
            com.alipay.mobile.verifyidentity.module.MicroModule r5 = r5.findModule(r2, r3, r4)
            r8.mModule = r5
            java.lang.String r5 = com.alipay.mobile.verifyidentity.ui.helper.ActivityHelper.f6089a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "verifyId: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = " token: "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = " moduleName: "
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.v(r5, r2)
            com.alipay.mobile.verifyidentity.module.MicroModule r2 = r8.mModule
            if (r2 == 0) goto L92
            r2.setIsPrevent(r1)
            com.alipay.mobile.verifyidentity.module.MicroModule r9 = r8.mModule
            android.app.Activity r0 = r8.b
            r9.pushActivity(r0)
            return
        L92:
            java.lang.String r1 = com.alipay.mobile.verifyidentity.ui.helper.ActivityHelper.f6089a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ActivityHelper mModule is null: "
            r2.<init>(r3)
            if (r9 == 0) goto La5
            java.lang.Class r9 = r9.getClass()
            java.lang.String r0 = r9.getName()
        La5:
            r2.append(r0)
            java.lang.String r9 = r2.toString()
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.ui.helper.ActivityHelper.<init>(android.app.Activity):void");
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (this.d) {
        } else {
            this.mMicroModuleContext.updateActivity(this.b);
            MicroModule microModule = this.mModule;
            if (microModule == null || !microModule.isNeedReportVisible()) {
                return;
            }
            writeLogFirstModuleVisible();
            this.mModule.setNeedReportVisible(false);
        }
    }

    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        MicroModule microModule = this.mModule;
        if (microModule != null) {
            microModule.removeActivity(this.b);
        }
        this.c.dismissProgressDialog();
    }

    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        MicroModule microModule = this.mModule;
        if (microModule == null) {
            return;
        }
        microModule.setIsPrevent(false);
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
        } else {
            this.c.alert(str, str2, str3, onClickListener, str4, onClickListener2, null);
        }
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82bc296", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bool});
        } else {
            this.c.alert(str, str2, str3, onClickListener, str4, onClickListener2, bool, null);
        }
    }

    public void updateAlertLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e1f124", new Object[]{this});
        } else {
            this.c.updateAlertLayout();
        }
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392f581d", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bundle});
        } else {
            this.c.alert(str, str2, str3, onClickListener, str4, onClickListener2, bundle);
        }
    }

    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else {
            this.c.toast(str, i);
        }
    }

    public void toast(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22158bd8", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            this.c.toast(str, i, i2);
        }
    }

    public void showProgressDialog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a6743", new Object[]{this, str});
        } else {
            this.c.showProgressDialog(str);
        }
    }

    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a225aa", new Object[]{this, str, new Boolean(z), onCancelListener});
        } else {
            this.c.showProgressDialog(str, z, onCancelListener, true);
        }
    }

    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a3426a", new Object[]{this, str, new Boolean(z), onCancelListener, new Boolean(z2)});
        } else {
            this.c.showProgressDialog(str, z, onCancelListener, z2);
        }
    }

    public void dismissProgressDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa6c806", new Object[]{this});
        } else {
            this.c.dismissProgressDialog();
        }
    }

    public MicroModule getModule() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("841a5a2b", new Object[]{this}) : this.mModule;
    }

    public MicroModuleContext getMicroModuleContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModuleContext) ipChange.ipc$dispatch("e3291d3f", new Object[]{this}) : this.mMicroModuleContext;
    }

    public static boolean isInWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88815dcd", new Object[]{str})).booleanValue();
        }
        for (String str2 : e) {
            if (str2.equalsIgnoreCase(str)) {
                VerifyLogCat.w(f6089a, "The mModule of a [ " + str + " ] can be null... ");
                return true;
            }
        }
        VerifyLogCat.e(f6089a, "mModule of [ " + str + " ] is null!!! ");
        return false;
    }

    public MicroModule whenModuleIsNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("dbfe3980", new Object[]{this});
        }
        this.mModule = new MicroModule() { // from class: com.alipay.mobile.verifyidentity.ui.helper.ActivityHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.MicroModule
            public void onCreate(String str, String str2, String str3, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
                }
            }

            @Override // com.alipay.mobile.verifyidentity.module.MicroModule
            public void onDestroy() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6532022", new Object[]{this});
                }
            }

            @Override // com.alipay.mobile.verifyidentity.module.MicroModule
            public void onStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f2d84ca", new Object[]{this});
                }
            }
        };
        return this.mModule;
    }

    public DialogHelper getDialogHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogHelper) ipChange.ipc$dispatch("3a7cfdc6", new Object[]{this}) : this.c;
    }

    public void writeLogFirstModuleVisible() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ef2a62", new Object[]{this});
            return;
        }
        String str2 = f6089a;
        if (("本次task的第一个Module的第一个界面可见，做埋点（Activity：" + this.b) == null) {
            str = "";
        } else {
            str = this.b.getClass().getSimpleName() + "）";
        }
        VerifyLogCat.i(str2, str);
        VerifyIdentityTask task = this.mModule.getTask();
        if (task == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sceneId", task.sceneId);
        hashMap.put("bizId", task.bizId);
        hashMap.put("module", this.mModule.getModuleName());
        hashMap.put(Constants.VI_ENGINE_VERIFY_TYPE, task.getCompatibleVerifyType());
        VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-160816-1", Constants.VI_ENGINE_APPID, "dygjmkj", this.mModule.getToken(), this.mModule.getVerifyId(), String.valueOf(SystemClock.elapsedRealtime() - task.getTaskCreateTime()), hashMap);
        TimeCostLog.log(getClass().getSimpleName(), "首个页面唤起总耗时：", task.getTaskCreateTime());
    }
}
