package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.RemoteFileInfo;
import com.taobao.android.tlog.protocol.model.reply.base.StorageInfo;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.tao.log.f;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadReason;
import com.taobao.tao.log.statistics.d;
import java.io.File;

/* loaded from: classes8.dex */
public class okr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1001560395);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
        if (r0.f32157a.equals("arup") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(tb.jhg r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.okr.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L24
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            r8 = 1
            r1[r8] = r9
            r8 = 2
            r1[r8] = r10
            r8 = 3
            r1[r8] = r11
            r8 = 4
            r1[r8] = r12
            r8 = 5
            r1[r8] = r13
            r8 = 6
            r1[r8] = r14
            java.lang.String r8 = "223c3e0b"
            r0.ipc$dispatch(r8, r1)
            return
        L24:
            com.taobao.tao.log.f r0 = com.taobao.tao.log.f.a()
            tb.okn r0 = r0.h()
            java.lang.String r1 = tb.oko.c
            java.lang.String r2 = r8.g
            java.lang.String r3 = "发送文件主动上传成功消息"
            r0.a(r1, r2, r3)
            com.taobao.tao.log.f r0 = com.taobao.tao.log.f.a()
            tb.oli r0 = r0.f()
            tb.oll r0 = r0.a()
            java.lang.String r1 = r0.f32157a
            java.lang.String r2 = "oss"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L74
            if (r14 == 0) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "http://"
            r0.append(r1)
            com.taobao.tao.log.f r1 = com.taobao.tao.log.f.a()
            java.lang.String r1 = r1.f20688a
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r14)
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            goto L81
        L74:
            java.lang.String r14 = r0.f32157a
            java.lang.String r0 = "arup"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L7f
            goto L81
        L7f:
            java.lang.String r11 = ""
        L81:
            r7 = r11
            java.lang.String r4 = "200"
            java.lang.String r5 = ""
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            r6 = r13
            a(r0, r1, r2, r3, r4, r5, r6, r7)
            com.taobao.tao.log.statistics.UploadFileType r9 = com.taobao.tao.log.statistics.TLogEventHelper.b(r12)
            com.taobao.tao.log.statistics.UploadReason r10 = com.taobao.tao.log.statistics.UploadReason.LOCAL_PUSH
            java.lang.String r8 = r8.g
            java.lang.String r11 = "ut_tlog_file_upload_reply_success"
            com.taobao.tao.log.statistics.TLogEventHelper.a(r11, r9, r10, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.okr.a(tb.jhg, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void a(jhg jhgVar, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644c5281", new Object[]{jhgVar, str, str2, str3, str4, str5});
            return;
        }
        f.a().h().a(oko.c, jhgVar.g, "发送文件主动上传失败消息");
        a(jhgVar, str, str2, str5, str3, str4, "", "");
        TLogEventHelper.a(d.UT_TLOG_FILE_UPLOAD_REPLY_ERROR, TLogEventHelper.b(str5), UploadReason.LOCAL_PUSH, jhgVar.g);
    }

    private static void a(jhg jhgVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28001b15", new Object[]{jhgVar, str, str2, str3, str4, str5, str6, str7});
            return;
        }
        try {
            jhp jhpVar = new jhp();
            jhpVar.h = f.a().m();
            jhpVar.i = f.a().l();
            jhpVar.j = f.o();
            jhpVar.k = f.a().p();
            jhpVar.l = "RDWP_APPLY_UPLOAD_COMPLETE";
            jhpVar.f29561a = str;
            oll a2 = f.a().f().a();
            StorageInfo storageInfo = new StorageInfo();
            UploadTokenInfo uploadTokenInfo = new UploadTokenInfo();
            jhpVar.m = a2.f32157a;
            if (a2.f32157a.equals("oss") || a2.f32157a.equals("arup") || a2.f32157a.equals("ceph")) {
                uploadTokenInfo.put("ossBucketName", f.a().f20688a);
                storageInfo.put("ossBucketName", f.a().f20688a);
                storageInfo.put("ossObjectKey", str6);
                storageInfo.put("ossPath", str7);
            }
            jhpVar.n = uploadTokenInfo;
            RemoteFileInfo[] remoteFileInfoArr = new RemoteFileInfo[1];
            RemoteFileInfo remoteFileInfo = new RemoteFileInfo();
            remoteFileInfo.storageType = a2.f32157a;
            remoteFileInfo.storageInfo = storageInfo;
            File file = new File(str2);
            if (file.exists()) {
                remoteFileInfo.absolutePath = file.getAbsolutePath();
                remoteFileInfo.contentLength = Long.valueOf(file.length());
                remoteFileInfo.fileName = file.getName();
                remoteFileInfo.contentEncoding = "gzip";
                remoteFileInfo.contentType = str3;
                remoteFileInfo.lastModified = Long.valueOf(file.lastModified());
                if (remoteFileInfo.contentType == null) {
                    remoteFileInfo.contentType = "application/x-tlog";
                }
            }
            remoteFileInfoArr[0] = remoteFileInfo;
            jhpVar.b = remoteFileInfoArr;
            okl.a(f.a().j(), jhpVar.a(str4, str5));
        } catch (Exception e) {
            f.a().h().a(oko.c, jhgVar.g, e);
        }
    }
}
