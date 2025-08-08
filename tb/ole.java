package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.tao.log.f;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadStage;
import com.taobao.tao.log.statistics.d;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class ole {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-47124639);
    }

    public static synchronized void a(jhg jhgVar, String str, String str2, UploadTokenInfo[] uploadTokenInfoArr, TLogEventHelper.UploadEventInfo uploadEventInfo) {
        synchronized (ole.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c365096", new Object[]{jhgVar, str, str2, uploadTokenInfoArr, uploadEventInfo});
                return;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(d.PARAM_UPLOAD_FILE_TYPE, uploadEventInfo.fileType.getValue());
                hashMap.put("reason", uploadEventInfo.reason.getValue());
                hashMap.put("bizCode", uploadEventInfo.bizCode);
                hashMap.put("bizType", uploadEventInfo.bizType);
                hashMap.put(d.PARAM_IS_RETRY, String.valueOf(uploadEventInfo.isRetry));
                hashMap.put(d.PARAM_UPLOAD_ID, jhgVar.g);
                hashMap.put(d.PARAM_TASK_ID, jhgVar.g);
                if (uploadTokenInfoArr != null) {
                    hashMap.put(d.PARAM_UPLOAD_FILE_COUNT, String.valueOf(uploadTokenInfoArr.length));
                }
                TLogEventHelper.a(d.UT_TLOG_FILE_UPLOAD_EXECUTE, hashMap);
                f.a().h().a(oko.c, jhgVar.g, "[UploadFile] Prepare for file upload...");
                olh olhVar = new olh(f.a().j());
                olhVar.b = str;
                olhVar.c = str2;
                olhVar.d = uploadTokenInfoArr;
                olhVar.f32154a = jhgVar;
                olhVar.e = uploadEventInfo;
                for (UploadTokenInfo uploadTokenInfo : uploadTokenInfoArr) {
                    String str3 = uploadTokenInfo.fileInfo.absolutePath;
                    if (!StringUtils.isEmpty(str3)) {
                        olhVar.a(str3);
                    }
                }
                olhVar.a();
            } catch (Exception e) {
                String value = ErrorCode.CODE_EXC.getValue();
                String str4 = "[UploadFile] Exception:" + e.getMessage();
                TLogEventHelper.a(uploadEventInfo, UploadStage.STAGE_UPLOAD, value, str4, jhgVar.g);
                f.a().h().a(oko.c, jhgVar.g, e);
                if (jhgVar.j.equals("RDWP_APPLY_UPLOAD_TOKEN_REPLY")) {
                    oky.a(jhgVar, str, null, value, str4, null);
                } else {
                    okr.a(jhgVar, str, null, value, str4, null);
                }
                if (uploadEventInfo.listener == null) {
                    return;
                }
                uploadEventInfo.listener.a("", value, str4);
            }
        }
    }
}
