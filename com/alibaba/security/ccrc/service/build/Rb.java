package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.multi.file.AudioFileRiskSample;
import com.alibaba.security.wukong.model.multi.file.FileRiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes3.dex */
public class Rb extends Ub<AudioFileRiskSample> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String f = "AudioFileRiskSamplePre";

    public static /* synthetic */ void a(Rb rb, CcrcService ccrcService, AudioFileRiskSample audioFileRiskSample, File file, FileRiskSample.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1eef9a3", new Object[]{rb, ccrcService, audioFileRiskSample, file, callback});
        } else {
            rb.a(ccrcService, audioFileRiskSample, file, callback);
        }
    }

    public static /* synthetic */ Object ipc$super(Rb rb, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.ccrc.service.build.Ub
    public void a(CcrcService ccrcService, AudioFileRiskSample audioFileRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7835c94", new Object[]{this, ccrcService, audioFileRiskSample});
            return;
        }
        String filePath = audioFileRiskSample.getFilePath();
        if (TextUtils.isEmpty(filePath)) {
            if (this.e != null) {
                a(ccrcService, "pcm file path is empty", audioFileRiskSample);
                this.e.onFileDetectFail(audioFileRiskSample.getSampleId(), "pcm file path is empty");
            }
            Logging.e(f, "pcm file path is empty");
            return;
        }
        File file = new File(filePath);
        if (!file.exists()) {
            if (this.e != null) {
                a(ccrcService, "pcm file is not exist: " + filePath, audioFileRiskSample);
                this.e.onFileDetectFail(audioFileRiskSample.getSampleId(), "pcm file is not exist");
            }
            Logging.e(f, "pcm file is not exist");
            return;
        }
        a(new Qb(this, ccrcService, audioFileRiskSample, file));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.alibaba.security.ccrc.service.CcrcService r7, com.alibaba.security.wukong.model.multi.file.AudioFileRiskSample r8, java.io.File r9, com.alibaba.security.wukong.model.multi.file.FileRiskSample.Callback r10) {
        /*
            r6 = this;
            java.lang.String r0 = "_"
            java.lang.String r1 = "detect file fail, "
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.security.ccrc.service.build.Rb.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L22
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r6
            r1 = 1
            r0[r1] = r7
            r7 = 2
            r0[r7] = r8
            r7 = 3
            r0[r7] = r9
            r7 = 4
            r0[r7] = r10
            java.lang.String r7 = "127dc437"
            r2.ipc$dispatch(r7, r0)
            return
        L22:
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            int r9 = r6.a(r8)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
        L2e:
            int r2 = r3.read(r9)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4 = -1
            if (r2 == r4) goto L75
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4.<init>()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.lang.String r5 = r8.getSampleId()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4.append(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.lang.String r5 = r8.type()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4.append(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.util.UUID r5 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            com.alibaba.security.wukong.model.meta.AudioSegment r5 = new com.alibaba.security.wukong.model.meta.AudioSegment     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r5.<init>(r9, r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            com.alibaba.security.wukong.model.AudioSample r2 = new com.alibaba.security.wukong.model.AudioSample     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            com.alibaba.security.wukong.model.config.AudioSampleConfig r4 = r8.getAudioSampleConfig()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r2.setAudioSampleConfig(r4)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r6.a(r8, r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r6.a(r7, r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            goto L2e
        L75:
            r3.close()     // Catch: java.io.IOException -> L79
            goto Lc6
        L79:
            r7 = move-exception
            goto Lc3
        L7b:
            r7 = move-exception
            r2 = r3
            goto Ld0
        L7e:
            r9 = move-exception
            r2 = r3
            goto L84
        L81:
            r7 = move-exception
            goto Ld0
        L83:
            r9 = move-exception
        L84:
            java.lang.String r0 = "AudioFileRiskSamplePre"
            java.lang.String r3 = "detect fail"
            com.alibaba.security.ccrc.common.log.Logging.e(r0, r3, r9)     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r0.<init>()     // Catch: java.lang.Throwable -> L81
            r0.append(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = android.util.Log.getStackTraceString(r9)     // Catch: java.lang.Throwable -> L81
            r0.append(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L81
            r6.a(r7, r0, r8)     // Catch: java.lang.Throwable -> L81
            if (r10 == 0) goto Lbd
            java.lang.String r7 = r8.getSampleId()     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r0.<init>()     // Catch: java.lang.Throwable -> L81
            r0.append(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r9 = android.util.Log.getStackTraceString(r9)     // Catch: java.lang.Throwable -> L81
            r0.append(r9)     // Catch: java.lang.Throwable -> L81
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L81
            r10.onFileDetectFail(r7, r9)     // Catch: java.lang.Throwable -> L81
        Lbd:
            if (r2 == 0) goto Lc6
            r2.close()     // Catch: java.io.IOException -> L79
            goto Lc6
        Lc3:
            r7.printStackTrace()
        Lc6:
            if (r10 == 0) goto Lcf
            java.lang.String r7 = r8.getSampleId()
            r10.onFileDetectEnd(r7)
        Lcf:
            return
        Ld0:
            if (r2 == 0) goto Lda
            r2.close()     // Catch: java.io.IOException -> Ld6
            goto Lda
        Ld6:
            r8 = move-exception
            r8.printStackTrace()
        Lda:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.ccrc.service.build.Rb.a(com.alibaba.security.ccrc.service.CcrcService, com.alibaba.security.wukong.model.multi.file.AudioFileRiskSample, java.io.File, com.alibaba.security.wukong.model.multi.file.FileRiskSample$Callback):void");
    }

    private int a(AudioFileRiskSample audioFileRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3bfa8f30", new Object[]{this, audioFileRiskSample})).intValue() : audioFileRiskSample.getAudioSampleConfig().calDetectBuffer(audioFileRiskSample.getOneDetectAudioTime());
    }
}
