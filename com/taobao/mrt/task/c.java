package com.taobao.mrt.task;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.service.a;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.msj;
import tb.msm;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MRTTaskDescription f18252a;
    private long b = 45;
    private ArrayList c = new ArrayList();

    static {
        kge.a(1447040613);
    }

    public static /* synthetic */ ArrayList a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b4fde207", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ boolean a(c cVar, String str, MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6e7fcf68", new Object[]{cVar, str, mRTResourceDescription})).booleanValue() : cVar.a(str, mRTResourceDescription);
    }

    public c(MRTTaskDescription mRTTaskDescription) {
        this.f18252a = mRTTaskDescription;
    }

    public int a(List list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{this, list})).intValue();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f18252a.model != null) {
            arrayList.add(this.f18252a.model);
            this.c.add(this.f18252a.model);
        }
        if (this.f18252a.resource != null) {
            arrayList.add(this.f18252a.resource);
            this.c.add(this.f18252a.resource);
        }
        if (!msm.a().b()) {
            list.add(new MRTRuntimeException(57, "basic libs check failed"));
            return MRTResourceDescription.MRTResourceNone;
        }
        arrayList.size();
        int i2 = MRTResourceDescription.MRTResourceNone;
        for (final int i3 = 0; i3 < arrayList.size(); i3++) {
            final MRTResourceDescription mRTResourceDescription = (MRTResourceDescription) arrayList.get(i3);
            if (!g.a().e(this.f18252a.name) && j.a().b(mRTResourceDescription)) {
                this.c.set(i3, null);
            } else {
                synchronized (mRTResourceDescription) {
                    if (e.a(mRTResourceDescription) == 0) {
                        j.a().a(mRTResourceDescription);
                        a(mRTResourceDescription);
                        this.c.set(i3, null);
                    } else {
                        i2 |= mRTResourceDescription.resourceMask;
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        d.a().a(mRTResourceDescription, new a.InterfaceC0727a() { // from class: com.taobao.mrt.task.c.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.mrt.service.a.InterfaceC0727a
                            public void a(boolean z, Exception exc, String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("daac2de4", new Object[]{this, new Boolean(z), exc, str});
                                    return;
                                }
                                if (z && c.a(c.this, str, mRTResourceDescription)) {
                                    c.a(c.this).set(i3, null);
                                }
                                countDownLatch.countDown();
                            }
                        });
                        try {
                            countDownLatch.await(this.b, TimeUnit.SECONDS);
                        } catch (InterruptedException e) {
                            com.taobao.mrt.utils.a.a("MRTDownloadTask", "timeout", e);
                            list.add(new MRTRuntimeException(127, ""));
                            return 0;
                        }
                    }
                }
            }
        }
        int size = this.c.size();
        if (size > 0) {
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.c.get(i) == null) {
                    i++;
                } else if (list.size() == 0) {
                    list.add(new MRTRuntimeException(127, "download failed"));
                }
            }
        }
        if (list.size() == 0) {
            g.a().d(this.f18252a.name);
        }
        return i2;
    }

    private boolean a(String str, MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4d2b3cd", new Object[]{this, str, mRTResourceDescription})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            com.taobao.mrt.utils.a.c("MRTDownloadTask", "zipFilePath is null");
            return false;
        } else if (StringUtils.isEmpty(mRTResourceDescription.resourceRootDirectory)) {
            com.taobao.mrt.utils.a.c("MRTDownloadTask", "resourceRootDirectory is null");
            return false;
        } else {
            File file = new File(str);
            File file2 = new File(mRTResourceDescription.resourceRootDirectory, mRTResourceDescription.resourceName);
            if (file2.exists()) {
                file2.delete();
            }
            msj msjVar = mRTResourceDescription.resourceOperation;
            if (msjVar == null || !msjVar.a(str)) {
                return false;
            }
            try {
                z = msjVar.a();
                if (z) {
                    j.a().a(mRTResourceDescription);
                    e.b(mRTResourceDescription);
                }
                file2.getAbsolutePath();
            } catch (Exception e) {
                com.taobao.mrt.utils.a.b("MRTDownloadTask", "validate file failed", e);
            }
            file.delete();
            return z;
        }
    }

    private void a(MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e599e53", new Object[]{this, mRTResourceDescription});
        } else if (mRTResourceDescription.resourceOperation == null) {
        } else {
            String str = mRTResourceDescription.resourceRootDirectory + File.separator + mRTResourceDescription.resourceName;
        }
    }
}
