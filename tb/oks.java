package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.tao.log.f;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadStage;
import com.taobao.tao.log.statistics.d;

/* loaded from: classes.dex */
public class oks implements okv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1998787325);
        kge.a(-2073055194);
    }

    @Override // tb.okv
    public okv a(jhg jhgVar) {
        String str;
        String value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okv) ipChange.ipc$dispatch("c57c657d", new Object[]{this, jhgVar});
        }
        TLogEventHelper.UploadEventInfo a2 = olg.a(jhgVar.g);
        String str2 = a2.sessionID;
        olf olfVar = a2.listener;
        try {
            TLogEventHelper.a(d.UT_TLOG_FILE_UPLOAD_TOKEN_RES, a2, jhgVar.g);
            f.a().h().a(oko.c, str2, "[PUSH_TOKEN_RES] Reply token: " + jhgVar.h);
        } catch (Exception e) {
            e = e;
            str = "";
        }
        if (!"200".equals(jhgVar.h)) {
            String str3 = "[PUSH_TOKEN_RES] Token reply error: " + jhgVar.h;
            if ("403".equals(jhgVar.h)) {
                value = ErrorCode.TOKEN_REFUSE_ERROR.getValue();
            } else {
                value = ErrorCode.TOKEN_REPLY_ERROR.getValue();
            }
            olg.b(str2);
            TLogEventHelper.a(a2, UploadStage.STAGE_RES_TOKEN, value, jhgVar.h, jhgVar.g);
            f.a().h().b(oko.c, "", str3);
            if (olfVar != null) {
                olfVar.a("", value, str3);
            }
            return this;
        }
        jhj jhjVar = new jhj();
        jhjVar.a(jhgVar.m, jhgVar);
        String str4 = jhjVar.f29556a;
        try {
            a2.uploadID = str4;
            UploadTokenInfo[] uploadTokenInfoArr = jhjVar.c;
            if (uploadTokenInfoArr != null && uploadTokenInfoArr.length > 0) {
                ole.a(jhgVar, str4, jhjVar.b, uploadTokenInfoArr, a2);
            } else {
                String value2 = ErrorCode.TOKEN_NO_NEED_UPLOAD.getValue();
                TLogEventHelper.a(a2, UploadStage.STAGE_RES_TOKEN, value2, "[PUSH_TOKEN_RES] No file need to upload!", jhgVar.g);
                f.a().h().a(oko.c, str2, "[PUSH_TOKEN_RES] No file need to upload!");
                okr.a(jhgVar, str4, null, value2, "[PUSH_TOKEN_RES] No file need to upload!", null);
                if (olfVar != null) {
                    olfVar.a("", value2, "[PUSH_TOKEN_RES] No file need to upload!");
                }
            }
        } catch (Exception e2) {
            e = e2;
            str = str4;
            String value3 = ErrorCode.CODE_EXC.getValue();
            String str5 = "[PUSH_TOKEN_RES] Exception: " + e.getMessage();
            TLogEventHelper.a(a2, UploadStage.STAGE_RES_TOKEN, value3, str5, jhgVar.g);
            f.a().h().a(oko.c, str2, e);
            okr.a(jhgVar, str, null, value3, str5, null);
            if (olfVar != null) {
                olfVar.a("", ErrorCode.CODE_EXC.getValue(), str5);
            }
            return this;
        }
        return this;
    }
}
