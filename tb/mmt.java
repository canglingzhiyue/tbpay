package tb;

import mtopsdk.common.util.StringUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.appmonitor.IAppMonitor;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.RequestStatistic;
import anet.channel.statist.StatObject;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class mmt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static mpj f31119a = new mmu();

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            AppMonitor.setApmMonitor(new IAppMonitor() { // from class: tb.mmt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.appmonitor.IAppMonitor
                public void commitAlarm(AlarmObject alarmObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e5af4398", new Object[]{this, alarmObject});
                    }
                }

                @Override // anet.channel.appmonitor.IAppMonitor
                public void commitCount(CountObject countObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6908fad8", new Object[]{this, countObject});
                    }
                }

                @Override // anet.channel.appmonitor.IAppMonitor
                public void register() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a23a9aa", new Object[]{this});
                    }
                }

                @Override // anet.channel.appmonitor.IAppMonitor
                public void register(Class<?> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("21a0f6d3", new Object[]{this, cls});
                    }
                }

                @Override // anet.channel.appmonitor.IAppMonitor
                public void commitStat(StatObject statObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fbe12d44", new Object[]{this, statObject});
                    } else if (!(statObject instanceof RequestStatistic)) {
                    } else {
                        mmt.a((RequestStatistic) statObject);
                        mym.a().a(statObject);
                    }
                }
            });
        }
    }

    public static void a(RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a090a480", new Object[]{requestStatistic});
        } else if (requestStatistic == null) {
        } else {
            try {
                if (d.f) {
                    String jSONString = JSON.toJSONString(requestStatistic);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("procedureName", (Object) "NetworkLib");
                    jSONObject.put("stage", (Object) "procedureSuccess");
                    jSONObject.put("content", (Object) jSONString);
                    f31119a.a("network", jSONObject.toJSONString(), new Object[0]);
                }
            } catch (Exception unused) {
            }
            String str = requestStatistic.url;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append((str + System.currentTimeMillis()).hashCode());
            String sb2 = sb.toString();
            if (StringUtils.isEmpty(sb2)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("timestamp", Long.valueOf(requestStatistic.start - requestStatistic.retryCostTime));
            myk.a().a(sb2, str, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("timestamp", Long.valueOf(requestStatistic.start));
            myk.a().b(sb2, str, hashMap2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("timestamp", Long.valueOf(requestStatistic.reqStart));
            myk.a().c(sb2, "data_request", hashMap3);
            HashMap hashMap4 = new HashMap();
            hashMap4.put("timestamp", Long.valueOf(requestStatistic.rspStart));
            myk.a().c(sb2, "first_package_response", hashMap4);
            HashMap hashMap5 = new HashMap();
            hashMap5.put("timestamp", Long.valueOf(requestStatistic.rspEnd));
            hashMap5.put("statusCode", Integer.valueOf(requestStatistic.statusCode));
            hashMap5.put("tnetErrorCode", Integer.valueOf(requestStatistic.tnetErrorCode));
            myk.a().b(sb2, hashMap5);
        }
    }
}
