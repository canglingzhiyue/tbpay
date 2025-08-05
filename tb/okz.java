package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.request.base.a;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.f;
import com.taobao.tao.log.g;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadFileType;
import com.taobao.tao.log.statistics.UploadReason;
import com.taobao.tao.log.statistics.UploadStage;
import com.taobao.tao.log.statistics.d;
import com.taobao.tao.log.utils.c;
import java.util.List;

/* loaded from: classes.dex */
public class okz implements okv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1444723986);
        kge.a(-2073055194);
    }

    @Override // tb.okv
    public okv a(jhg jhgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okv) ipChange.ipc$dispatch("c57c657d", new Object[]{this, jhgVar});
        }
        c.a();
        TLogNative.appenderFlushData(false);
        try {
            jht jhtVar = new jht();
            jhtVar.a(jhgVar.m, jhgVar);
            String str = jhtVar.c;
            a[] aVarArr = jhtVar.b;
            Boolean bool = jhtVar.f29564a;
            TLogEventHelper.a(d.UT_TLOG_FILE_UPLOAD_REQ, UploadFileType.LOG, UploadReason.SERVER_PULL, str);
            f.a().h().a(oko.c, str, "[LOG_PULL] Receive Server Request");
            if (bool != null && !bool.booleanValue() && !g.a(f.a().j())) {
                String value = ErrorCode.UPLOAD_NOT_WIFI.getValue();
                TLogEventHelper.a(UploadFileType.LOG, UploadReason.SERVER_PULL, UploadStage.STAGE_REQ, value, "[LOG_PULL] Need WIFI!", str);
                oky.a(jhgVar, str, null, value, "[LOG_PULL] Need WIFI!", null);
                f.a().h().b(oko.c, str, "[LOG_PULL] Need WIFI!");
                return this;
            }
            List<String> a2 = com.taobao.tao.log.utils.a.a(aVarArr);
            if (a2 != null && a2.size() != 0) {
                okq.a(jhgVar, str, a2, UploadFileType.LOG, null, false);
                return null;
            }
            String value2 = ErrorCode.UPLOAD_NO_FILE.getValue();
            TLogEventHelper.a(UploadFileType.LOG, UploadReason.SERVER_PULL, UploadStage.STAGE_REQ, value2, "[LOG_PULL] Can't find the log file.", str);
            f.a().h().b(oko.c, str, "[LOG_PULL] Can't find the log file.");
            oky.a(jhgVar, str, null, value2, "[LOG_PULL] Can't find the log file.", null);
            return null;
        } catch (Exception e) {
            String value3 = ErrorCode.CODE_EXC.getValue();
            String str2 = "[LOG_PULL] Exception: " + e.getMessage();
            TLogEventHelper.a(UploadFileType.LOG, UploadReason.SERVER_PULL, UploadStage.STAGE_REQ, value3, str2, "");
            f.a().h().a(oko.c, "", e);
            oky.a(jhgVar, "", null, value3, str2, null);
            return null;
        }
    }
}
