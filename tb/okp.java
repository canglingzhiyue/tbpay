package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.tao.log.f;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadReason;
import com.taobao.tao.log.statistics.UploadStage;
import com.taobao.tao.log.statistics.d;

/* loaded from: classes.dex */
public class okp implements okv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1083421979);
        kge.a(-2073055194);
    }

    @Override // tb.okv
    public okv a(jhg jhgVar) {
        String value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okv) ipChange.ipc$dispatch("c57c657d", new Object[]{this, jhgVar});
        }
        String str = jhgVar.g;
        TLogEventHelper.UploadEventInfo a2 = olg.a(str);
        try {
            TLogEventHelper.a(d.UT_TLOG_FILE_UPLOAD_TOKEN_RES, a2.fileType, UploadReason.SERVER_PULL, str);
            f.a().h().a(oko.c, str, "[PULL_TOKEN_RES] Reply token: " + jhgVar.h);
        } catch (Exception e) {
            String value2 = ErrorCode.CODE_EXC.getValue();
            String str2 = "[PULL_TOKEN_RES] Exception: " + e.getMessage();
            TLogEventHelper.a(a2.fileType, UploadReason.SERVER_PULL, UploadStage.STAGE_RES_TOKEN, value2, str2, str);
            f.a().h().a(oko.c, str, e);
            oky.a(jhgVar, str, null, value2, str2, null);
            if (a2.listener != null) {
                a2.listener.a("", value2, str2);
            }
        }
        if (!"200".equals(jhgVar.h)) {
            String str3 = "[PULL_TOKEN_RES] Token reply error: " + jhgVar.h;
            if ("403".equals(jhgVar.h)) {
                value = ErrorCode.TOKEN_REFUSE_ERROR.getValue();
            } else {
                value = ErrorCode.TOKEN_REPLY_ERROR.getValue();
            }
            String str4 = value;
            olg.b(str);
            TLogEventHelper.a(a2.fileType, UploadReason.SERVER_PULL, UploadStage.STAGE_RES_TOKEN, str4, jhgVar.h, str);
            f.a().h().b(oko.c, str, str3);
            if (a2.listener != null) {
                a2.listener.a("", str4, str3);
            }
            return this;
        }
        jhi jhiVar = new jhi();
        jhiVar.a(jhgVar.m, jhgVar);
        UploadTokenInfo[] uploadTokenInfoArr = jhiVar.c;
        if (uploadTokenInfoArr != null && uploadTokenInfoArr.length > 0) {
            ole.a(jhgVar, str, jhiVar.b, jhiVar.c, a2);
        } else {
            String value3 = ErrorCode.TOKEN_NO_NEED_UPLOAD.getValue();
            TLogEventHelper.a(a2.fileType, UploadReason.SERVER_PULL, UploadStage.STAGE_RES_TOKEN, value3, "[PULL_TOKEN_RES] No file need to upload!", str);
            oky.a(jhgVar, str, null, value3, "[PULL_TOKEN_RES] No file need to upload!", null);
            f.a().h().b(oko.c, str, "[PULL_TOKEN_RES] No file need to upload!");
            if (a2.listener != null) {
                a2.listener.a("", value3, "[PULL_TOKEN_RES] No file need to upload!");
            }
        }
        return this;
    }
}
