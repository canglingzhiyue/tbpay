package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.android.tlog.protocol.model.request.base.FileInfo;
import com.taobao.tao.log.f;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadFileType;
import com.taobao.tao.log.statistics.UploadReason;
import com.taobao.tao.log.statistics.UploadStage;
import com.taobao.tao.log.statistics.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class okq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-459582838);
    }

    public static void a(jhg jhgVar, String str, List<String> list, UploadFileType uploadFileType, olf olfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c73eec", new Object[]{jhgVar, str, list, uploadFileType, olfVar, new Boolean(z)});
            return;
        }
        try {
            TLogEventHelper.UploadEventInfo uploadEventInfo = new TLogEventHelper.UploadEventInfo();
            uploadEventInfo.fileType = uploadFileType;
            uploadEventInfo.reason = UploadReason.SERVER_PULL;
            uploadEventInfo.sessionID = str;
            uploadEventInfo.listener = olfVar;
            uploadEventInfo.uploadID = str;
            uploadEventInfo.fileList = list;
            uploadEventInfo.isRetry = z;
            olg.a(str, uploadEventInfo);
            TLogEventHelper.a(d.UT_TLOG_FILE_UPLOAD_TOKEN_REQ, uploadEventInfo.fileType, UploadReason.SERVER_PULL, str);
            f.a().h().a(oko.c, str, "[PULL_TOKEN_REQ] Request token for: " + uploadFileType.getName());
            jho jhoVar = new jho();
            jhoVar.f29560a = str;
            jhoVar.l = "RDWP_APPLY_UPLOAD_TOKEN";
            jhoVar.h = f.a().m();
            jhoVar.i = f.a().l();
            jhoVar.j = f.o();
            jhoVar.k = f.a().p();
            jhoVar.o = f.a().n();
            oll a2 = f.a().f().a();
            UploadTokenInfo uploadTokenInfo = new UploadTokenInfo();
            jhoVar.m = a2.f32157a;
            if (a2.f32157a.equals("oss") || a2.f32157a.equals("arup") || a2.f32157a.equals("ceph")) {
                uploadTokenInfo.put("ossBucketName", f.a().f20688a);
            }
            jhoVar.n = uploadTokenInfo;
            ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                File file = new File(str2);
                if (file.exists()) {
                    FileInfo fileInfo = new FileInfo();
                    fileInfo.fileName = file.getName();
                    fileInfo.absolutePath = str2;
                    fileInfo.contentLength = Long.valueOf(file.length());
                    fileInfo.lastModified = Long.valueOf(file.lastModified());
                    fileInfo.contentType = uploadFileType.getContentType();
                    fileInfo.contentEncoding = "gzip";
                    arrayList.add(fileInfo);
                } else {
                    f.a().h().b(oko.c, str, "File not exist: " + str2);
                }
            }
            if (!arrayList.isEmpty()) {
                jhoVar.b = (FileInfo[]) arrayList.toArray(new FileInfo[0]);
                okl.a(f.a().j(), jhoVar.a(str));
                return;
            }
            String value = ErrorCode.UPLOAD_NO_FILE.getValue();
            String str3 = "[PULL_TOKEN_REQ] Upload file is not exist! isRetry: " + uploadEventInfo.isRetry;
            oky.a(jhgVar, str, null, value, str3, null);
            TLogEventHelper.a(uploadFileType, UploadReason.SERVER_PULL, UploadStage.STAGE_REQ_TOKEN, value, str3, str);
            f.a().h().b(oko.c, str, str3);
            if (olfVar != null) {
                olfVar.a("", value, str3);
            }
            olg.b(str);
        } catch (Exception e) {
            String value2 = ErrorCode.CODE_EXC.getValue();
            String str4 = "[PULL_TOKEN_REQ] Exception: " + e.getMessage();
            oky.a(jhgVar, str, null, value2, str4, null);
            TLogEventHelper.a(uploadFileType, UploadReason.SERVER_PULL, UploadStage.STAGE_REQ_TOKEN, value2, str4, str);
            f.a().h().a(oko.c, str, e);
            if (olfVar == null) {
                return;
            }
            olfVar.a("", value2, str4);
        }
    }
}
