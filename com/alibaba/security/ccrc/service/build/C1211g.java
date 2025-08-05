package com.alibaba.security.ccrc.service.build;

import android.util.Log;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.interfaces.Uploader;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.security.ccrc.service.build.g  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1211g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3304a = "UploadCore";

    public static /* synthetic */ void a(InferContext inferContext, boolean z, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c44384", new Object[]{inferContext, new Boolean(z), str, new Long(j)});
        } else {
            b(inferContext, z, str, j);
        }
    }

    public static void b(InferContext inferContext, boolean z, String str, long j) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc3a1e3", new Object[]{inferContext, new Boolean(z), str, new Long(j)});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(inferContext.pid).setCcrcCode(inferContext.ccrcCode).setMetaId(inferContext.getMetaId()).setSampleId(inferContext.getSampleID()).setPhase("detect").setOperation(Ba.a.i);
        if (!z) {
            i = -1;
        }
        TrackLog.Builder addParam = operation.setStatus(i).addParam("errorMsg", z ? null : str).addParam("costTime", Long.valueOf(System.currentTimeMillis() - j));
        if (!z) {
            str = null;
        }
        TrackManager.track(addParam.addParam("url", str).build());
    }

    public static String a(InferContext inferContext, SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d8a786f", new Object[]{inferContext, sampleData});
        }
        String str = inferContext.ccrcCode;
        CcrcService service = CcrcService.getService(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (service == null) {
            Logging.e(f3304a, "ccrcCode is " + str + ",service can not find");
            b(inferContext, false, "ccrcCode is " + str + ",service can not find", currentTimeMillis);
            return null;
        } else if (sampleData == null) {
            Logging.e(f3304a, "cache can not find");
            b(inferContext, false, "cache can not find", currentTimeMillis);
            return null;
        } else {
            Uploader fileUploader = service.getFileUploader();
            if (fileUploader == null) {
                b(inferContext, false, "uploaderImpl is not set up", currentTimeMillis);
                return null;
            }
            String[] strArr = {null};
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                fileUploader.upload(sampleData.mRawData, new C1208f(inferContext, currentTimeMillis, countDownLatch, strArr));
                countDownLatch.await(15L, TimeUnit.SECONDS);
            } catch (Throwable th) {
                b(inferContext, false, Log.getStackTraceString(th), currentTimeMillis);
            }
            return strArr[0];
        }
    }
}
