package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.service.a;
import com.taobao.mrt.task.d;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import com.taobao.mrt.task.e;
import com.taobao.mrt.task.j;
import com.taobao.mrt.utils.a;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class msm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static msm f31222a;
    private long b = 30;
    private ConcurrentHashMap<String, MRTPythonLibDescription> c = new ConcurrentHashMap<>();

    static {
        kge.a(-175096037);
    }

    public static /* synthetic */ boolean a(msm msmVar, String str, MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ec8c49a4", new Object[]{msmVar, str, mRTResourceDescription})).booleanValue() : msmVar.a(str, mRTResourceDescription);
    }

    private msm() {
    }

    public static synchronized msm a() {
        synchronized (msm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (msm) ipChange.ipc$dispatch("f07ee77", new Object[0]);
            }
            if (f31222a == null) {
                f31222a = new msm();
            }
            return f31222a;
        }
    }

    public void a(MRTPythonLibDescription mRTPythonLibDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7b8b7c", new Object[]{this, mRTPythonLibDescription});
        } else if (mRTPythonLibDescription == null || TextUtils.isEmpty(mRTPythonLibDescription.resourceName)) {
            a.c("MRTPythonLibSyncer", "registerPythonLib error!!!, description or name null!");
        } else {
            a.a("MRTPythonLibSyncer", "registerPythonLib: " + mRTPythonLibDescription.resourceName + " success!!!");
            this.c.put(mRTPythonLibDescription.resourceName, mRTPythonLibDescription);
        }
    }

    public synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Set<String> keySet = this.c.keySet();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(keySet);
        int size = hashSet.size();
        final int[] iArr = {0};
        for (String str : hashSet) {
            final MRTPythonLibDescription mRTPythonLibDescription = this.c.get(str);
            if (j.a().b(mRTPythonLibDescription)) {
                iArr[0] = iArr[0] + 1;
            } else if (e.a(mRTPythonLibDescription) == 0) {
                j.a().a(mRTPythonLibDescription);
                iArr[0] = iArr[0] + 1;
                ((msi) mRTPythonLibDescription.resourceOperation).b();
            } else {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                a.a("MRTPythonLibSyncer", "=============DownloadLib: " + mRTPythonLibDescription.resourceName);
                d.a().a(mRTPythonLibDescription, new a.InterfaceC0727a() { // from class: tb.msm.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.mrt.service.a.InterfaceC0727a
                    public void a(boolean z, Exception exc, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("daac2de4", new Object[]{this, new Boolean(z), exc, str2});
                            return;
                        }
                        com.taobao.mrt.utils.a.a("MRTPythonLibSyncer", "download pythonlib completion: " + z + " : " + str2);
                        if (z && msm.a(msm.this, str2, mRTPythonLibDescription)) {
                            int[] iArr2 = iArr;
                            iArr2[0] = iArr2[0] + 1;
                        }
                        countDownLatch.countDown();
                    }
                });
                try {
                    countDownLatch.await(this.b, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    com.taobao.mrt.utils.a.a("MRTPythonLibSyncer", "timeout", e);
                }
            }
        }
        return iArr[0] == size;
    }

    private boolean a(String str, MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4d2b3cd", new Object[]{this, str, mRTResourceDescription})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            com.taobao.mrt.utils.a.c("MRTPythonLibSyncer", "zipFilePath is null");
            return false;
        } else if (TextUtils.isEmpty(mRTResourceDescription.resourceRootDirectory)) {
            com.taobao.mrt.utils.a.c("MRTPythonLibSyncer", "resourceRootDirectory is null");
            return false;
        } else {
            File file = new File(str);
            File file2 = new File(mRTResourceDescription.resourceRootDirectory, mRTResourceDescription.resourceName);
            if (file2.exists()) {
                file2.delete();
            }
            msj msjVar = mRTResourceDescription.resourceOperation;
            if (msjVar == null) {
                com.taobao.mrt.utils.a.c("MRTPythonLibSyncer", "operation is null");
                return false;
            } else if (!msjVar.a(str)) {
                com.taobao.mrt.utils.a.c("MRTPythonLibSyncer", "zipRet is error");
                return false;
            } else {
                try {
                    z = msjVar.a();
                    if (z) {
                        j.a().a(mRTResourceDescription);
                        e.b(mRTResourceDescription);
                    }
                    file2.getAbsolutePath();
                } catch (Exception e) {
                    com.taobao.mrt.utils.a.a("MRTPythonLibSyncer", "validate file failed", e);
                }
                file.delete();
                com.taobao.mrt.utils.a.a("MRTPythonLibSyncer", "zip python lib success");
                return z;
            }
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.c.contains(str);
    }
}
