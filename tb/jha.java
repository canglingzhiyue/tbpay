package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.tao.log.f;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;

/* loaded from: classes.dex */
public class jha implements okk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1397440277);
        kge.a(1063884521);
    }

    @Override // tb.okk
    public void a(oki okiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81369ab", new Object[]{this, okiVar});
            return;
        }
        try {
            GlobalClientInfo.getInstance(okiVar.b).registerListener(okiVar.i, (AccsAbstractDataListener) new jgy());
            f.a().h().a(oko.f, "MSG INIT", "初始化消息通道");
            f.a().h().a(oko.f, "MSG INIT", "初始化消息通道成功");
        } catch (Exception e) {
            Log.e("tlogMessage", "registerDataListener failure : ", e);
            f.a().h().a(oko.f, "MSG INIT", e);
            TLogEventHelper.a("ut_tlog_accs_init_err", ErrorCode.CODE_EXC, e.getMessage());
        }
    }

    @Override // tb.okk
    public okj c(oki okiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (okj) ipChange.ipc$dispatch("7e2d86eb", new Object[]{this, okiVar}) : b(okiVar);
    }

    @Override // tb.okk
    public okj b(oki okiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okj) ipChange.ipc$dispatch("968bb08c", new Object[]{this, okiVar});
        }
        Context context = okiVar.b;
        String str = okiVar.c;
        String str2 = okiVar.i;
        try {
            ACCSManager.sendRequest(context, "userid", str2, str.getBytes(), null);
            okj okjVar = new okj();
            okjVar.f32140a = null;
            okjVar.c = "dataId";
            okjVar.b = str2;
            okjVar.d = "userId";
            f.a().h().a(oko.f, "SEND MSG", "异步发送消息完成");
            return okjVar;
        } catch (Exception e) {
            Log.e("tlogMessage", "send accs message failure : ", e);
            f.a().h().a(oko.f, "SEND MSG", e);
            TLogEventHelper.a("ut_tlog_accs_send_err", ErrorCode.CODE_EXC, e.getMessage());
            return null;
        }
    }
}
