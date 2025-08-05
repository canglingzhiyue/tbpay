package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zlz.toyger.zdoc.b;
import com.taobao.android.searchbaseframe.net.RequestStats;
import com.taobao.android.searchbaseframe.track.d;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jyv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final imn f29866a;
    private final jyw b;

    static {
        kge.a(-1420658845);
    }

    public jyv(imn imnVar, jyw jywVar) {
        this.f29866a = imnVar;
        this.b = jywVar;
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure("time_all");
        create.addMeasure("time_mtop");
        create.addMeasure("time_parse");
        create.addMeasure("time_template");
        create.addMeasure("time_template_num");
        create.addMeasure("time_send_size");
        create.addMeasure("time_recv_time");
        create.addMeasure("time_recv_size");
        create.addMeasure("time_server_rt");
        create.addMeasure("time_retry_times");
        create.addMeasure("time_one_way_aserver");
        create.addMeasure("time_async_bonus");
        create.addMeasure("time_template_and_parse");
        create.addMeasure("time_dipatch_to_main");
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("name");
        create2.addDimension("page_name");
        create2.addDimension(b.INFO_PAGE_NUMBER);
        create2.addDimension("bucketId");
        create2.addDimension("traceId");
        create2.addDimension("templateAsync");
        create2.addDimension("zstd");
        create2.addDimension("coldLaunch");
        this.b.a(create2);
        AppMonitor.register(this.b.a(), "SearchTime", create, create2);
        MeasureSet create3 = MeasureSet.create();
        create3.addMeasure("time_all");
        create3.addMeasure("time_page");
        DimensionSet create4 = DimensionSet.create();
        create4.addDimension("name");
        create4.addDimension("page_name");
        this.b.a(create4);
        AppMonitor.register(this.b.a(), "FirstScreenTime", create3, create4);
        MeasureSet create5 = MeasureSet.create();
        create5.addMeasure("time_all");
        DimensionSet create6 = DimensionSet.create();
        create6.addDimension("name");
        create6.addDimension("not_found");
        this.b.a(create6);
        AppMonitor.register(this.b.a(), "CacheLoadTime", create5, create6);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e35165", new Object[]{this, dVar});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("name", dVar.c);
        create.setValue("page_name", dVar.d);
        create.setValue(b.INFO_PAGE_NUMBER, String.valueOf(dVar.n));
        create.setValue("bucketId", dVar.o);
        create.setValue("traceId", dVar.p);
        create.setValue("templateAsync", String.valueOf(dVar.v));
        create.setValue("zstd", String.valueOf(dVar.z));
        create.setValue("coldLaunch", String.valueOf(dVar.D));
        this.b.a(create);
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("time_all", dVar.g);
        a("time_all", dVar.g);
        create2.setValue("time_mtop", dVar.h);
        a("time_mtop", dVar.h);
        create2.setValue("time_parse", dVar.i);
        a("time_parse", dVar.i);
        create2.setValue("time_template", dVar.j);
        a("time_template", dVar.j);
        create2.setValue("time_template_num", dVar.k);
        create2.setValue("time_template_and_parse", dVar.y);
        create2.setValue("time_async_bonus", (dVar.j + dVar.i) - dVar.y);
        create2.setValue("time_dipatch_to_main", dVar.C - dVar.B);
        a("time_dipatch_to_main", dVar.C - dVar.B);
        RequestStats requestStats = dVar.q;
        if (requestStats != null) {
            create2.setValue("time_server_rt", requestStats.serverRt);
            create2.setValue("time_send_size", requestStats.sendDataSize);
            create2.setValue("time_recv_size", requestStats.recvDataSize);
            create2.setValue("time_recv_time", requestStats.recvDataTime);
            create2.setValue("time_retry_times", requestStats.retryTimes);
            create2.setValue("time_one_way_aserver", requestStats.oneWayTime);
            a("time_server_rt", requestStats.serverRt);
        }
        AppMonitor.Stat.commit(this.b.a(), "SearchTime", create, create2);
    }

    private void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            TLog.loge("tbsearch_performance", str, String.valueOf(j));
        }
    }

    public void a(String str, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6998f6fc", new Object[]{this, str, str2, new Long(j), new Long(j2)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("name", str);
        create.setValue("page_name", str2);
        this.b.a(create);
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("time_all", j);
        create2.setValue("time_page", j2);
        AppMonitor.Stat.commit(this.b.a(), "FirstScreenTime", create, create2);
        this.f29866a.b().c("SFMonitor", "CommitStateEvent %s(%s:%s)(%s:%s): <%s:%d> <%s:%d>", "FirstScreenTime", "name", str, "page_name", str2, "time_all", Long.valueOf(j), "time_page", Long.valueOf(j2));
    }

    private void a(boolean z, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296c31fb", new Object[]{this, new Boolean(z), str, str2, str3, map});
            return;
        }
        String a2 = a(map);
        this.f29866a.b().c("SFMonitor", "CommitAlarmEvent: %s<succ: %b>: errCode:%s; errMsg:%s; arg:%s", str, Boolean.valueOf(z), str2, str3, a2);
        if (z) {
            AppMonitor.Alarm.commitSuccess(this.b.a(), str, a2);
        } else {
            AppMonitor.Alarm.commitFail(this.b.a(), str, a2, str2, str3);
        }
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            b(true, str, null, null, map);
        }
    }

    public void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{this, str, str2, str3, map});
        } else {
            b(false, str, str2, str3, map);
        }
    }

    private void b(boolean z, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d1a5cbc", new Object[]{this, new Boolean(z), str, str2, str3, map});
            return;
        }
        Map<String, String> b = b();
        b.put("bizType", str);
        if (map != null) {
            b.putAll(map);
        }
        a(z, "SearchRequest", str2, str3, b);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(true, str, (String) null, (String) null);
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            a(false, str, str2, str3);
        }
    }

    private void a(boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2e4c4a", new Object[]{this, new Boolean(z), str, str2, str3});
            return;
        }
        Map<String, String> b = b();
        b.put("api", str);
        a(z, "MtopRequest", str2, str3, b);
    }

    private Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : new HashMap();
    }

    private String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            jSONObject.putAll(map);
        }
        return jSONObject.toJSONString();
    }
}
