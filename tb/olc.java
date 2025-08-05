package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.a;
import com.taobao.tao.log.f;

/* loaded from: classes8.dex */
public class olc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(784864118);
    }

    public static void a(jhg jhgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5fff4f", new Object[]{jhgVar});
        } else {
            b(jhgVar, "200", "");
        }
    }

    public static void a(jhg jhgVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b9f8e3", new Object[]{jhgVar, str, str2});
        } else {
            b(jhgVar, str, str2);
        }
    }

    private static void b(jhg jhgVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784392e4", new Object[]{jhgVar, str, str2});
            return;
        }
        a aVar = new a();
        aVar.b = f.a().m();
        aVar.c = f.a().l();
        aVar.f15567a = f.o();
        aVar.d = "RDWP_USER_DEFINED_UPLOAD_REPLY";
        aVar.e = str;
        aVar.f = str2;
        jhn jhnVar = new jhn();
        try {
            jhh jhhVar = new jhh();
            jhhVar.f29554a = jhnVar.a(jhgVar, aVar);
            okl.a(f.a().j(), jhhVar);
        } catch (Exception e) {
            Log.e("UDFUploadReply", "user define log upload reply error", e);
            f.a().h().a(oko.c, jhgVar.g, e);
        }
    }
}
