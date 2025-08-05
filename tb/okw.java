package tb;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.e;
import com.taobao.tao.log.f;
import com.taobao.tao.log.g;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.d;
import com.taobao.tao.log.utils.a;
import com.taobao.tao.log.utils.c;
import com.taobao.tlog.adapter.b;
import java.util.Map;

/* loaded from: classes.dex */
public class okw implements okv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32145a = "TLOG.LogConfigRequestTask";

    static {
        kge.a(1786227469);
        kge.a(-2073055194);
    }

    @Override // tb.okv
    public okv a(jhg jhgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okv) ipChange.ipc$dispatch("c57c657d", new Object[]{this, jhgVar});
        }
        try {
            TLogEventHelper.a(d.UT_TLOG_CONFIG_RECEIVE);
            f.a().h().b(oko.c, this.f32145a, "消息处理：请求修改日志配置消息");
            jhs jhsVar = new jhs();
            jhsVar.a(jhgVar.m, jhgVar);
            Boolean bool = jhsVar.f29563a;
            Boolean bool2 = jhsVar.b;
            String str = jhsVar.c;
            String str2 = jhsVar.d;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(f.a().j()).edit();
            edit.putString(EnvironmentSwitcher.TLOG_VERSION, f.a().n()).apply();
            if (bool2 != null && bool2.booleanValue()) {
                f.a().h().b(oko.c, this.f32145a, "消息处理：销毁日志");
                e.a().c();
                g.a(a.b());
                edit.putBoolean("tlog_destroy", true).apply();
            } else {
                edit.putBoolean("tlog_destroy", false).apply();
            }
            if (bool != null && !bool.booleanValue()) {
                okn h = f.a().h();
                String str3 = oko.c;
                String str4 = this.f32145a;
                h.b(str3, str4, "消息处理：日志开关 " + bool);
                e.a().c();
                edit.putBoolean(b.REMOTE_TLOG_CONFIG, bool.booleanValue()).apply();
            }
            if (str != null) {
                okn h2 = f.a().h();
                String str5 = oko.c;
                String str6 = this.f32145a;
                h2.b(str5, str6, "消息处理：日志级别修改 " + str);
                LogLevel b = g.b(str);
                edit.putString(EnvironmentSwitcher.TLOG_LEVEL, str).apply();
                e.a().a(b);
                c.a(b);
                okn h3 = f.a().h();
                String str7 = oko.c;
                String str8 = this.f32145a;
                h3.b(str7, str8, "消息处理：日志级别修改完成:" + b.getName());
            }
            if ("off".equals(str2)) {
                f.a().h().b(oko.c, this.f32145a, "消息处理：log model关闭");
                e.a().b();
                edit.remove("tlog_module").apply();
                c.a(str2);
            } else {
                okn h4 = f.a().h();
                String str9 = oko.c;
                String str10 = this.f32145a;
                h4.b(str9, str10, "消息处理：修改module信息: " + str2);
                Map<String, LogLevel> a2 = g.a(str2);
                if (a2 != null && a2.size() > 0) {
                    e.a().a(a2);
                    edit.putString("tlog_module", str2).apply();
                    c.a(str2);
                }
            }
            okx.a(jhgVar);
        } catch (Exception e) {
            Log.e(this.f32145a, "execute error", e);
            TLogEventHelper.a(d.UT_TLOG_CONFIG_ERR);
            f.a().h().a(oko.c, this.f32145a, e);
        }
        return this;
    }
}
