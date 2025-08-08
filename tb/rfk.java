package tb;

import android.taobao.windvane.export.adapter.ILocalizationService;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.apk.MainUpdateData;
import com.taobao.update.c;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.framework.b;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes9.dex */
public class rfk implements b<ApkUpdateContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UA_NOTIFY_FORCE_TYPE = "NOTIFY_NEW_APK_UPDATE_FORCE_RETRY";
    public static final String UA_NOTIFY_TYPE = "NOTIFY_NEW_APK_UPDATE";

    static {
        kge.a(1003088545);
        kge.a(-386319410);
    }

    @Override // com.taobao.update.framework.b
    public void execute(final ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed841b", new Object[]{this, apkUpdateContext});
            return;
        }
        MainUpdateData mainUpdateData = apkUpdateContext.mainUpdate;
        if (mainUpdateData == null || StringUtils.isEmpty(mainUpdateData.getDownloadUrl())) {
            apkUpdateContext.success = false;
            apkUpdateContext.errorCode = 31;
            return;
        }
        kmo kmoVar = new kmo();
        kmoVar.f30167a = mainUpdateData.getDownloadUrl();
        kmoVar.b = mainUpdateData.size;
        kmoVar.c = mainUpdateData.md5;
        String a2 = com.taobao.downloader.b.a().a(rgq.getStorePath(apkUpdateContext.context) + "/apkupdate/" + mainUpdateData.version, kmoVar);
        if (!StringUtils.isEmpty(a2)) {
            apkUpdateContext.apkPath = a2;
        } else if (!a(apkUpdateContext)) {
        } else {
            apkUpdateContext.hasNotified = true;
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            UpdateRuntime.doUIAlertForConfirm(mainUpdateData.info + "\n\n更新包大小：" + a(mainUpdateData.size), new rew() { // from class: tb.rfk.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rew
                public String getConfirmText() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("4f0d2482", new Object[]{this}) : "立即下载";
                }

                @Override // tb.rew
                public String getType() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("13e5e549", new Object[]{this}) : rfk.UA_NOTIFY_TYPE;
                }

                @Override // tb.rew
                public void onConfirm() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("310393e8", new Object[]{this});
                    } else {
                        countDownLatch.countDown();
                    }
                }

                @Override // tb.rew
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else if (apkUpdateContext.isForceUpdate()) {
                        UpdateRuntime.doUIAlertForConfirm(rgq.getAppNameString(R.string.confirm_forceupdate_cancel, UpdateRuntime.sAppName), new rew() { // from class: tb.rfk.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.rew
                            public String getCancelText() {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("338a645c", new Object[]{this}) : "退出";
                            }

                            @Override // tb.rew
                            public String getConfirmText() {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("4f0d2482", new Object[]{this}) : "立即下载";
                            }

                            @Override // tb.rew
                            public String getType() {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("13e5e549", new Object[]{this}) : rfk.UA_NOTIFY_FORCE_TYPE;
                            }

                            @Override // tb.rew
                            public void onConfirm() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("310393e8", new Object[]{this});
                                } else {
                                    countDownLatch.countDown();
                                }
                            }

                            @Override // tb.rew
                            public void onCancel() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("379d4540", new Object[]{this});
                                    return;
                                }
                                apkUpdateContext.success = false;
                                apkUpdateContext.errorCode = -51;
                                countDownLatch.countDown();
                            }

                            @Override // tb.rew
                            public String getTitleText() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (String) ipChange3.ipc$dispatch("4800096a", new Object[]{this});
                                }
                                if (!c.getInstance().enableDialogUiV2()) {
                                    return null;
                                }
                                return "快来更新" + UpdateRuntime.sAppName;
                            }
                        });
                    } else {
                        ApkUpdateContext apkUpdateContext2 = apkUpdateContext;
                        apkUpdateContext2.success = false;
                        apkUpdateContext2.errorCode = -51;
                        countDownLatch.countDown();
                    }
                }

                @Override // tb.rew
                public String getCancelText() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("338a645c", new Object[]{this});
                    }
                    if (!c.getInstance().enableDialogUiV2()) {
                        return ILocalizationService.CANCEL;
                    }
                    return null;
                }

                @Override // tb.rew
                public String getTitleText() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("4800096a", new Object[]{this});
                    }
                    if (!c.getInstance().enableDialogUiV2()) {
                        return null;
                    }
                    return "快来更新" + UpdateRuntime.sAppName;
                }
            });
            a();
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean a(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("715bdb0b", new Object[]{this, apkUpdateContext})).booleanValue() : !apkUpdateContext.isSilentUpdate();
    }

    private String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{this, new Long(j)});
        }
        if (j / 1048576 > 0) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator('.');
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            return "" + decimalFormat.format(((float) j) / 1048576.0f) + "MB";
        }
        long j2 = j / 1024;
        if (j2 > 0) {
            return "" + j2 + "KB";
        }
        return "" + j + "B";
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            rfy.setLastPopTime(System.currentTimeMillis());
        }
    }
}
