package tb;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.export.adapter.ILocalizationService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.apk.history.ApkUpdateHistory;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.framework.b;
import com.taobao.update.provider.UpdateProvider;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes9.dex */
public class rff implements b<ApkUpdateContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UA_INSTALL_FORCE_TYPE = "APK_INSTALL_CONFIRM_FORCE_RETRY";
    public static final String UA_INSTALL_TYPE = "APK_INSTALL_CONFIRM";

    static {
        kge.a(-1561957104);
        kge.a(-386319410);
    }

    public static /* synthetic */ void a(rff rffVar, ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ceab985", new Object[]{rffVar, apkUpdateContext});
        } else {
            rffVar.b(apkUpdateContext);
        }
    }

    public static /* synthetic */ void b(rff rffVar, ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca256b06", new Object[]{rffVar, apkUpdateContext});
        } else {
            rffVar.a(apkUpdateContext);
        }
    }

    @Override // com.taobao.update.framework.b
    public void execute(final ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed841b", new Object[]{this, apkUpdateContext});
        } else if (UpdateRuntime.forceInstallAfaterDownload) {
            a(apkUpdateContext);
        } else {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            UpdateRuntime.doUIAlertForConfirm(apkUpdateContext.hasNotified ? rgq.getAppNameString(R.string.update_notification_finish, UpdateRuntime.sAppName) : rgq.getAppNameString(R.string.confirm_install_hint1, UpdateRuntime.sAppName), new rew() { // from class: tb.rff.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rew
                public String getCancelText() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("338a645c", new Object[]{this}) : ILocalizationService.CANCEL;
                }

                @Override // tb.rew
                public String getConfirmText() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("4f0d2482", new Object[]{this}) : "立即安装";
                }

                @Override // tb.rew
                public String getTitleText() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("4800096a", new Object[]{this}) : "安装";
                }

                @Override // tb.rew
                public String getType() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("13e5e549", new Object[]{this}) : rff.UA_INSTALL_TYPE;
                }

                @Override // tb.rew
                public void onConfirm() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("310393e8", new Object[]{this});
                        return;
                    }
                    rff.b(rff.this, apkUpdateContext);
                    countDownLatch.countDown();
                }

                @Override // tb.rew
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else if (apkUpdateContext.isForceUpdate()) {
                        UpdateRuntime.doUIAlertForConfirm(rgq.getAppNameString(R.string.confirm_forceupdate_install, UpdateRuntime.sAppName), new rew() { // from class: tb.rff.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.rew
                            public String getCancelText() {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("338a645c", new Object[]{this}) : "退出";
                            }

                            @Override // tb.rew
                            public String getConfirmText() {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("4f0d2482", new Object[]{this}) : "立即安装";
                            }

                            @Override // tb.rew
                            public String getTitleText() {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("4800096a", new Object[]{this}) : "提醒";
                            }

                            @Override // tb.rew
                            public String getType() {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("13e5e549", new Object[]{this}) : rff.UA_INSTALL_FORCE_TYPE;
                            }

                            @Override // tb.rew
                            public void onConfirm() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("310393e8", new Object[]{this});
                                    return;
                                }
                                rff.b(rff.this, apkUpdateContext);
                                countDownLatch.countDown();
                            }

                            @Override // tb.rew
                            public void onCancel() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("379d4540", new Object[]{this});
                                    return;
                                }
                                apkUpdateContext.errorCode = -51;
                                rff.a(rff.this, apkUpdateContext);
                                countDownLatch.countDown();
                            }
                        });
                    } else {
                        ApkUpdateContext apkUpdateContext2 = apkUpdateContext;
                        apkUpdateContext2.success = false;
                        apkUpdateContext2.errorCode = -51;
                        countDownLatch.countDown();
                    }
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void a(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715bdb07", new Object[]{this, apkUpdateContext});
            return;
        }
        ApkUpdateHistory.Data data = new ApkUpdateHistory.Data();
        data.fromVersion = rgq.getVersionName();
        data.toVersion = apkUpdateContext.mainUpdate.version;
        data.ext = apkUpdateContext.apkPath;
        ApkUpdateHistory.update(data);
        File file = new File(apkUpdateContext.apkPath);
        if (file.exists()) {
            String path = file.getPath();
            int indexOf = path.indexOf("apkupdate");
            if (indexOf >= 0) {
                path = path.substring(0, indexOf + 9);
            }
            try {
                Runtime.getRuntime().exec("chmod -R 775 " + path);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            String str = "no exists doInstall apkPath=" + apkUpdateContext.apkPath;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        if (Build.VERSION.SDK_INT >= 24) {
            Uri uriForFile = UpdateProvider.getUriForFile(apkUpdateContext.context, new File(apkUpdateContext.apkPath));
            intent.addFlags(1);
            for (ResolveInfo resolveInfo : apkUpdateContext.context.getPackageManager().queryIntentActivities(intent, 65536)) {
                apkUpdateContext.context.grantUriPermission(resolveInfo.activityInfo.packageName, uriForFile, 1);
            }
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            apkUpdateContext.context.startActivity(intent);
        } else {
            intent.setDataAndType(Uri.fromFile(new File(apkUpdateContext.apkPath)), "application/vnd.android.package-archive");
        }
        apkUpdateContext.context.startActivity(intent);
    }

    private void b(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc9d88", new Object[]{this, apkUpdateContext});
            return;
        }
        apkUpdateContext.success = false;
        apkUpdateContext.errorCode = -51;
    }
}
