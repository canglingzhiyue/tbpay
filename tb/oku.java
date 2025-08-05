package tb;

import android.text.TextUtils;
import android.util.Log;
import com.ali.user.mobile.rpc.ApiConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.f;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.d;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class oku {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32143a;
    private ConcurrentHashMap<String, okv> b;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final oku f32144a;

        static {
            kge.a(256516564);
            f32144a = new oku();
        }

        public static /* synthetic */ oku a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (oku) ipChange.ipc$dispatch("f08ba25", new Object[0]) : f32144a;
        }
    }

    static {
        kge.a(647928577);
    }

    private oku() {
        this.f32143a = "TLOG.CommandManager";
        this.b = new ConcurrentHashMap<>();
    }

    public static final oku a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oku) ipChange.ipc$dispatch("f08ba25", new Object[0]) : a.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a("RDWP_APPLY_UPLOAD_TOKEN_REPLY", new okp());
        a("RDWP_APPLY_UPLOAD_REPLY", new oks());
        a("RDWP_LOG_UPLOAD", new okz());
        a("RDWP_LOG_CONFIGURE", new okw());
        a("RDWP_USER_DEFINED_UPLOAD", new old());
    }

    public void a(byte[] bArr, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c168fcd", new Object[]{this, bArr, str, str2, str3});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                String.format("dealCommandData serverID = %s, content = %s", str3, str);
                jhg a2 = jhc.a().a(bArr, str, str2, str3);
                if (a2 != null) {
                    f.a().h().a(oko.f32142a, "RECEIVE MESSAGE", "接收消息后，基础信息解析完成");
                    if (a2.l.equals(ApiConstants.ResultActionType.NOTIFY)) {
                        f.a().h().a(oko.f32142a, "RECEIVE MESSAGE", "接收到notify消息，开始拉任务");
                        ola.a();
                    }
                    okv okvVar = this.b.get(a2.j);
                    if (okvVar != null) {
                        okn h = f.a().h();
                        String str4 = oko.f32142a;
                        h.a(str4, "RECEIVE MESSAGE", "开始处理任务，opcode=" + a2.j);
                        TLogEventHelper.a(d.UT_TLOG_CMD_EXECUTE, d.PARAM_OP_CODE, a2.j);
                        okvVar.a(a2);
                        return;
                    }
                    okn h2 = f.a().h();
                    String str5 = oko.f32142a;
                    h2.a(str5, "RECEIVE MESSAGE", "没有对应的任务存在，opcode=" + a2.j);
                    return;
                }
                TLogEventHelper.a(d.UT_TLOG_CMD_PARSE_ERR, ErrorCode.DATA_EMPTY, "commandInfo is null");
                f.a().h().b(oko.c, this.f32143a, "CommandInfo is null");
            } catch (Exception e) {
                Log.e(this.f32143a, "parse command info error", e);
                f.a().h().a(oko.c, this.f32143a, e);
                TLogEventHelper.a(d.UT_TLOG_CMD_EXECUTE_ERR, ErrorCode.CODE_EXC, e.getMessage());
            }
        } else {
            TLogEventHelper.a(d.UT_TLOG_CMD_PARSE_ERR, ErrorCode.DATA_EMPTY, "dealCommandData content is null");
            f.a().h().b(oko.c, this.f32143a, "MESSAGE IS NULL");
        }
    }

    public void a(String str, okv okvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3803c848", new Object[]{this, str, okvVar});
        } else {
            this.b.put(str, okvVar);
        }
    }
}
