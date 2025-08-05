package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.apk.MainUpdateData;
import com.taobao.update.framework.a;
import com.taobao.update.framework.b;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.android.agoo.common.AgooConstants;
import tb.kml;

/* loaded from: classes9.dex */
public class rfe implements b<ApkUpdateContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f33103a = 0;
    private res b;

    static {
        kge.a(673886257);
        kge.a(-386319410);
    }

    public static /* synthetic */ res a(rfe rfeVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (res) ipChange.ipc$dispatch("59ce1e19", new Object[]{rfeVar, new Boolean(z)}) : rfeVar.a(z);
    }

    public static /* synthetic */ void a(rfe rfeVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693f46f8", new Object[]{rfeVar, new Integer(i), new Boolean(z)});
        } else {
            rfeVar.a(i, z);
        }
    }

    public static /* synthetic */ void a(rfe rfeVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b7a263", new Object[]{rfeVar, str, new Boolean(z)});
        } else {
            rfeVar.a(str, z);
        }
    }

    public static /* synthetic */ void b(rfe rfeVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e7e242", new Object[]{rfeVar, str, new Boolean(z)});
        } else {
            rfeVar.b(str, z);
        }
    }

    @Override // com.taobao.update.framework.b
    public void execute(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed841b", new Object[]{this, apkUpdateContext});
        } else if (!TextUtils.isEmpty(apkUpdateContext.apkPath)) {
        } else {
            MainUpdateData mainUpdateData = apkUpdateContext.mainUpdate;
            String str = rgq.getStorePath(apkUpdateContext.context) + "/apkupdate/";
            String str2 = str + mainUpdateData.version;
            try {
                Runtime.getRuntime().exec("chmod 775 " + str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Runtime.getRuntime().exec("chmod 775 " + str2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            ArrayList arrayList = new ArrayList(1);
            kmo kmoVar = new kmo();
            arrayList.add(kmoVar);
            kmoVar.f30167a = mainUpdateData.getDownloadUrl();
            kmoVar.b = mainUpdateData.size;
            kmq kmqVar = new kmq();
            kmm kmmVar = new kmm();
            kmmVar.f30166a = arrayList;
            kmmVar.b = kmqVar;
            kmqVar.d = 7;
            kmqVar.h = str2;
            kmqVar.e = 0;
            kmqVar.f30169a = "apkupdate";
            kmqVar.c = 20;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (!a()) {
                apkUpdateContext.hasNotified = false;
            }
            this.f33103a = com.taobao.downloader.b.a().a(kmmVar, getListener(countDownLatch, apkUpdateContext, apkUpdateContext.hasNotified));
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public kml getListener(final CountDownLatch countDownLatch, final ApkUpdateContext apkUpdateContext, final boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kml) ipChange.ipc$dispatch("a9e196c", new Object[]{this, countDownLatch, apkUpdateContext, new Boolean(z)}) : new kml() { // from class: tb.rfe.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f33104a = -1;

            @Override // tb.kml
            public void onDownloadStateChange(String str, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z2)});
                }
            }

            @Override // tb.kml
            public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
                }
            }

            @Override // tb.kml
            public void onDownloadProgress(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                    return;
                }
                String str = "on process " + i;
                if (!z || this.f33104a == i) {
                    return;
                }
                this.f33104a = i;
                rfe.a(rfe.this, i, apkUpdateContext.isForceUpdate());
            }

            @Override // tb.kml
            public void onDownloadError(String str, int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                    return;
                }
                if (z) {
                    rfe.a(rfe.this, str2, apkUpdateContext.isForceUpdate());
                }
                String str3 = "onDownloadError " + i + ">" + str2;
            }

            @Override // tb.kml
            public void onDownloadFinish(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                    return;
                }
                if (z) {
                    rfe.b(rfe.this, str2, apkUpdateContext.isForceUpdate());
                }
                apkUpdateContext.apkPath = str2;
                String str3 = "onDownloadFinish " + str2;
            }

            @Override // tb.kml
            public void onFinish(boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z2)});
                    return;
                }
                String str = "onFinish " + z2;
                apkUpdateContext.success = z2;
                countDownLatch.countDown();
            }
        };
    }

    private void a(final int i, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            rgo.execute(new Runnable() { // from class: tb.rfe.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        rfe.a(rfe.this, z).notifyDownloadProgress(i);
                    }
                }
            });
        }
    }

    private void a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            rgo.execute(new Runnable() { // from class: tb.rfe.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        rfe.a(rfe.this, z).notifyDownloadError(TextUtils.isEmpty(str) ? "下载失败" : str);
                    }
                }
            });
        }
    }

    private void b(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
        } else {
            rgo.execute(new Runnable() { // from class: tb.rfe.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        rfe.a(rfe.this, z).notifyDownloadFinish(str);
                    }
                }
            });
        }
    }

    private res a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (res) ipChange.ipc$dispatch("1f476cfa", new Object[]{this, new Boolean(z)});
        }
        res resVar = this.b;
        if (resVar != null) {
            return resVar;
        }
        if (z) {
            this.b = (res) a.getInstance(AgooConstants.MESSAGE_NOTIFICATION, res.class);
        } else {
            this.b = (res) a.getInstance("sysnotify", res.class);
        }
        return this.b;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : rgq.isNotificationPermissioned();
    }
}
