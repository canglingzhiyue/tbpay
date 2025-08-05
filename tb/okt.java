package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.android.tlog.protocol.model.request.base.FileInfo;
import com.taobao.tao.log.f;
import com.taobao.tao.log.g;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadFileType;
import com.taobao.tao.log.statistics.UploadReason;
import com.taobao.tao.log.statistics.UploadStage;
import com.taobao.tao.log.statistics.d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class okt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(342615336);
    }

    public static void a(String str, UploadReason uploadReason, List<String> list, UploadFileType uploadFileType, String str2, String str3, Map<String, String> map, olf olfVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c61bd04", new Object[]{str, uploadReason, list, uploadFileType, str2, str3, map, olfVar, new Boolean(z), new Integer(i)});
            return;
        }
        try {
            TLogEventHelper.UploadEventInfo uploadEventInfo = new TLogEventHelper.UploadEventInfo();
            uploadEventInfo.fileType = uploadFileType;
            uploadEventInfo.reason = uploadReason;
            uploadEventInfo.bizType = str2;
            uploadEventInfo.bizCode = str3;
            uploadEventInfo.sessionID = str;
            uploadEventInfo.extraInfo = map;
            uploadEventInfo.listener = olfVar;
            uploadEventInfo.fileList = list;
            uploadEventInfo.isRetry = z;
            uploadEventInfo.flag = i;
            olg.a(str, uploadEventInfo);
            if ((i & 2) == 2 && !g.a(f.a().j())) {
                String value = ErrorCode.UPLOAD_NOT_WIFI.getValue();
                TLogEventHelper.a(uploadFileType, uploadReason, str2, str3, UploadStage.STAGE_REQ_TOKEN, value, "[PUSH_TOKEN_REQ] Need WIFI! ", str);
                f.a().h().b(oko.h, str, "[PUSH_TOKEN_REQ] Need WIFI! ");
                if (olfVar == null) {
                    return;
                }
                olfVar.a("", value, "[PUSH_TOKEN_REQ] Need WIFI! ");
                return;
            }
            TLogEventHelper.a(d.UT_TLOG_FILE_UPLOAD_TOKEN_REQ, uploadEventInfo, str);
            f.a().h().a(oko.c, str, "[PUSH_TOKEN_REQ] Request upload token: " + str3);
            jhq jhqVar = new jhq();
            jhqVar.l = "RDWP_APPLY_UPLOAD";
            jhqVar.h = f.a().m();
            jhqVar.i = f.a().l();
            jhqVar.j = f.o();
            jhqVar.k = f.a().p();
            jhqVar.o = f.a().n();
            jhqVar.f29562a = str2;
            jhqVar.c = str3;
            jhqVar.b = uploadFileType.getName();
            if (map != null && map.size() > 0) {
                jhqVar.p = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jhqVar.p.put(entry.getKey(), entry.getValue());
                }
            }
            oll a2 = f.a().f().a();
            UploadTokenInfo uploadTokenInfo = new UploadTokenInfo();
            if (a2.f32157a.equals("oss") || a2.f32157a.equals("arup") || a2.f32157a.equals("ceph")) {
                uploadTokenInfo.put("ossBucketName", f.a().f20688a);
            }
            jhqVar.m = a2.f32157a;
            jhqVar.n = uploadTokenInfo;
            ArrayList arrayList = new ArrayList();
            for (String str4 : list) {
                File file = new File(str4);
                if (file.exists()) {
                    FileInfo fileInfo = new FileInfo();
                    fileInfo.fileName = file.getName();
                    fileInfo.absolutePath = str4;
                    fileInfo.contentLength = Long.valueOf(file.length());
                    fileInfo.lastModified = Long.valueOf(file.lastModified());
                    fileInfo.contentType = uploadFileType.getContentType();
                    fileInfo.contentEncoding = "gzip";
                    arrayList.add(fileInfo);
                } else {
                    f.a().h().b(oko.c, str, "File not exist: " + str4);
                }
            }
            if (!arrayList.isEmpty()) {
                jhqVar.d = (FileInfo[]) arrayList.toArray(new FileInfo[0]);
                okl.a(f.a().j(), jhqVar.a(str));
                return;
            }
            String value2 = ErrorCode.UPLOAD_NO_FILE.getValue();
            String str5 = "[PUSH_TOKEN_REQ] Upload file is not exist! isRetry: " + z;
            TLogEventHelper.a(uploadFileType, uploadReason, str2, str3, UploadStage.STAGE_REQ_TOKEN, value2, str5, str);
            f.a().h().b(oko.c, str, str5);
            if (olfVar != null) {
                olfVar.a("", value2, str5);
            }
            olg.b(str);
        } catch (Exception e) {
            String value3 = ErrorCode.CODE_EXC.getValue();
            String str6 = "[PUSH_TOKEN_REQ] Exception: " + e.getMessage();
            TLogEventHelper.a(uploadFileType, uploadReason, str2, str3, UploadStage.STAGE_REQ_TOKEN, value3, str6, str);
            f.a().h().a(oko.h, str, e);
            if (olfVar == null) {
                return;
            }
            olfVar.a("", value3, str6);
        }
    }
}
