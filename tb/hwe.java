package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.c;
import com.taobao.android.searchbaseframe.net.RequestStats;
import com.taobao.android.searchbaseframe.track.d;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.mmd.util.j;
import com.taobao.search.rainbow.a;

/* loaded from: classes8.dex */
public class hwe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28826a;

    static {
        kge.a(1290904921);
        f28826a = false;
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e35165", new Object[]{dVar});
            return;
        }
        if (!f28826a) {
            a();
            f28826a = true;
        }
        if (dVar.s == 0) {
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("page_name", dVar.d);
        create.setValue("traceId", dVar.p);
        String c = ntz.INSTANCE.c("base_optimize");
        if (c == null) {
            c = "-1";
        }
        create.setValue(djy.SERIALIZE_EXP_BUCKET_ID, c);
        create.setValue("good_price", String.valueOf(j.INSTANCE.c()));
        create.setValue("device_level", c.a());
        create.setValue("srp_perf", a.c("tbAndroidSrpPerf"));
        create.setValue("zstd", String.valueOf(dVar.z));
        create.setValue("coldLaunch", String.valueOf(dVar.D));
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("time_all", dVar.g);
        create2.setValue("time_mtop", dVar.h);
        create2.setValue("time_parse", dVar.i);
        create2.setValue("time_template", dVar.j);
        create2.setValue("time_render", dVar.u - dVar.t);
        create2.setValue("time_all_ui", dVar.u - dVar.s);
        create2.setValue("time_dipatch_to_main", dVar.C - dVar.B);
        create2.setValue("time_setup_page", dVar.A);
        RequestStats requestStats = dVar.q;
        if (requestStats != null) {
            create2.setValue("time_server_rt", requestStats.serverRt);
            create2.setValue("time_send_size", requestStats.sendDataSize);
            create2.setValue("time_recv_size", requestStats.recvDataSize);
            create2.setValue("time_recv_time", requestStats.recvDataTime);
            create2.setValue("time_one_way_aserver", requestStats.oneWayTime);
        }
        k.d("TBSearch.FirstScreenPerformance", "commit first screen performance, coldLaunch=" + dVar.D, new Object[0]);
        AppMonitor.Stat.commit("tbsearch", "FirstScreenPerformance", create, create2);
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure("time_all");
        create.addMeasure("time_mtop");
        create.addMeasure("time_parse");
        create.addMeasure("time_template");
        create.addMeasure("time_send_size");
        create.addMeasure("time_recv_time");
        create.addMeasure("time_recv_size");
        create.addMeasure("time_server_rt");
        create.addMeasure("time_one_way_aserver");
        create.addMeasure("time_all_ui");
        create.addMeasure("time_render");
        create.addMeasure("time_setup_page");
        create.addMeasure("time_dipatch_to_main");
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("page_name");
        create2.addDimension("device_level");
        create2.addDimension("traceId");
        create2.addDimension("good_price");
        create2.addDimension(djy.SERIALIZE_EXP_BUCKET_ID);
        create2.addDimension("srp_perf");
        create2.addDimension("zstd");
        create2.addDimension("coldLaunch");
        AppMonitor.register("tbsearch", "FirstScreenPerformance", create, create2);
    }
}
