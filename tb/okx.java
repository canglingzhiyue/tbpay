package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.android.tlog.protocol.model.reply.base.a;
import com.taobao.tao.log.f;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.d;

/* loaded from: classes8.dex */
public class okx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f32146a;

    static {
        kge.a(507621294);
        f32146a = "TLOG.LogConfigureReplyTask";
    }

    public static void a(jhg jhgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5fff4f", new Object[]{jhgVar});
            return;
        }
        try {
            f.a().h().a(oko.c, f32146a, "消息处理：修改日志请求服务端回复消息");
            jhk jhkVar = new jhk();
            a aVar = new a();
            aVar.b = f.a().m();
            aVar.c = f.a().l();
            aVar.e = "200";
            aVar.f = "";
            aVar.d = "RDWP_LOG_CONFIGURE_REPLY";
            aVar.f15567a = f.o();
            oll a2 = f.a().f().a();
            UploadTokenInfo uploadTokenInfo = new UploadTokenInfo();
            jhkVar.f29557a = a2.f32157a;
            if (a2.f32157a.equals("oss") || a2.f32157a.equals("arup") || a2.f32157a.equals("ceph")) {
                uploadTokenInfo.put("ossBucketName", f.a().f20688a);
            }
            jhkVar.b = uploadTokenInfo;
            String a3 = jhkVar.a(jhgVar, aVar);
            if (a3 == null) {
                return;
            }
            jhh jhhVar = new jhh();
            jhhVar.f29554a = a3;
            okl.a(f.a().j(), jhhVar);
            TLogEventHelper.a(d.UT_TLOG_CONFIG_REPLY);
        } catch (Exception e) {
            Log.e(f32146a, "execute error", e);
            f.a().h().a(oko.c, f32146a, e);
        }
    }
}
