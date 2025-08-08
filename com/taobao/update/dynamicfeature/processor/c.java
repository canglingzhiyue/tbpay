package com.taobao.update.dynamicfeature.processor;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.update.dynamicfeature.FeatureUpdateData;
import com.taobao.update.dynamicfeature.utils.Constants;
import com.taobao.update.framework.UpdateRuntime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;
import tb.rge;
import tb.rgf;
import tb.rgp;

/* loaded from: classes9.dex */
public class c implements com.taobao.update.framework.b<com.taobao.update.dynamicfeature.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rge f23405a = rgf.getLog(c.class, (rge) null);

    static {
        kge.a(447932470);
        kge.a(-386319410);
    }

    public static /* synthetic */ rge a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rge) ipChange.ipc$dispatch("d189a4e0", new Object[]{cVar}) : cVar.f23405a;
    }

    @Override // com.taobao.update.framework.b
    public void execute(final com.taobao.update.dynamicfeature.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431fae6e", new Object[]{this, bVar});
            return;
        }
        this.f23405a.w("start download");
        bVar.stage = "download";
        FeatureUpdateData featureUpdateData = bVar.featureUpdateData;
        List<kmo> a2 = a(featureUpdateData);
        if (a2 == null || a2.isEmpty()) {
            bVar.success = false;
            bVar.errorCode = -3;
            bVar.errorMsg = Constants.getMsg(-3);
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        kml kmlVar = new kml() { // from class: com.taobao.update.dynamicfeature.processor.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kml
            public void onDownloadProgress(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                }
            }

            @Override // tb.kml
            public void onDownloadStateChange(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
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
            public void onDownloadError(String str, int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                    return;
                }
                rge a3 = c.a(c.this);
                a3.w("onDownloadError   errorCode:" + i + " errorMsg:" + str2);
                com.taobao.update.dynamicfeature.b bVar2 = bVar;
                bVar2.success = false;
                bVar2.errorCode = i;
                bVar2.errorMsg = str2;
            }

            @Override // tb.kml
            public void onDownloadFinish(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                } else {
                    bVar.downloadPath = str2;
                }
            }

            @Override // tb.kml
            public void onFinish(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                    return;
                }
                rge a3 = c.a(c.this);
                a3.w("onFinish:  " + z);
                bVar.success = z;
                countDownLatch.countDown();
            }
        };
        kmm kmmVar = new kmm();
        kmmVar.f30166a = a2;
        kmq kmqVar = new kmq();
        kmqVar.h = bVar.downloadDir;
        kmqVar.e = 0;
        kmqVar.q = false;
        kmmVar.b = kmqVar;
        kmqVar.c = 20;
        kmqVar.f30169a = "featureupdate";
        com.taobao.downloader.b.a().a(kmmVar, kmlVar);
        try {
            countDownLatch.await();
            if (!bVar.success || StringUtils.isEmpty(bVar.downloadPath) || rgp.isMd5Same(featureUpdateData.md5, bVar.downloadPath)) {
                return;
            }
            UpdateRuntime.log("check md5 file error");
            bVar.success = false;
            bVar.errorMsg = "md5校验失败";
            bVar.errorCode = AConstants.ArtcErrorIceCandidateGatheringTimeOut;
            bVar.downloadPath = "";
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private List<kmo> a(FeatureUpdateData featureUpdateData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2a5b0f14", new Object[]{this, featureUpdateData});
        }
        if (featureUpdateData == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        kmo kmoVar = new kmo();
        kmoVar.f30167a = featureUpdateData.getDownloadUrl();
        kmoVar.c = featureUpdateData.md5;
        kmoVar.b = featureUpdateData.size;
        arrayList.add(kmoVar);
        return arrayList;
    }
}
