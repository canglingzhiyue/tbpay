package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.b;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "overseabuy.impl.response.monitor")
/* loaded from: classes9.dex */
public final class nsr extends asf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static long b;

    /* renamed from: a  reason: collision with root package name */
    private q f31738a;

    public static /* synthetic */ Object ipc$super(nsr nsrVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 1702025934) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((a) objArr[0]);
            return null;
        }
    }

    static {
        kge.a(1949071888);
        b = 0L;
    }

    @Override // tb.asf, tb.asg
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6572dace", new Object[]{this, aVar});
            return;
        }
        super.a(aVar);
        try {
            if ("mtop.trade.order.build".equalsIgnoreCase(aVar.c())) {
                b = System.currentTimeMillis();
            }
            PositionInfo b2 = b.b(this.f31738a.e());
            String str = b2 != null ? b2.countryCode : "";
            if ("CN".equalsIgnoreCase(str)) {
                TLog.logd("Page_OverseaConfirmOrder", "OverSeaOrderNextRPCExtention", "中国地区不做上报！");
                return;
            }
            String a2 = aVar.a();
            String c = aVar.c();
            StringBuilder sb = new StringBuilder("countryCode:" + str);
            Map<String, List<String>> e = aVar.e();
            if (e != null && !e.isEmpty()) {
                for (Map.Entry<String, List<String>> entry : e.entrySet()) {
                    if ("eagleeye-traceid".equalsIgnoreCase(entry.getKey())) {
                        sb.append(", traceId:");
                        sb.append(entry.getValue().get(0));
                    }
                }
            }
            if ("SUCCESS".equalsIgnoreCase(a2)) {
                String[] split = aVar.f().getJSONArray(com.taobao.mtop.wvplugin.a.RESULT_KEY).getString(0).split("::");
                if ("SUCCESS".equalsIgnoreCase(split[0])) {
                    AppMonitor.Alarm.commitSuccess("Page_OverseaConfirmOrder", c, sb.toString());
                    return;
                }
                sb.append(", errMsg:");
                sb.append(aVar.b());
                AppMonitor.Alarm.commitFail("Page_OverseaConfirmOrder", c, split[0], sb.toString());
                return;
            }
            sb.append(", errMsg:");
            sb.append(aVar.b());
            AppMonitor.Alarm.commitFail("Page_OverseaConfirmOrder", c, a2, sb.toString());
        } catch (Exception e2) {
            TLog.loge("Page_OverseaConfirmOrder", "OverSeaOrderNextRPCExtention", "didReceiveResponse 方法出错：" + e2.getMessage());
        }
    }

    @Override // tb.asf, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.f31738a = qVar;
    }
}
