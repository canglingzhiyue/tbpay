package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;

/* loaded from: classes2.dex */
public final class abi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-841223815);
    }

    public static void a(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9e64", new Object[]{context, new Long(j)});
            return;
        }
        jpo b = jpo.b(context);
        UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel("apmClientNetwork");
        ultronPerformanceStageModel.setStartMills(j);
        ultronPerformanceStageModel.setEndMills(System.currentTimeMillis());
        ultronPerformanceStageModel.setFreeStage(true);
        b.a(ultronPerformanceStageModel, (String) null, false);
        b.a("apmClientAfterNetworkLogicProcess", (String) null);
        b.b("isLoadFromCache", "true");
        UltronPerformanceStageModel ultronPerformanceStageModel2 = new UltronPerformanceStageModel("apmClientUltronProcess");
        ultronPerformanceStageModel2.setStartMills(0L);
        ultronPerformanceStageModel2.setEndMills(0L);
        ultronPerformanceStageModel2.setFreeStage(true);
        b.a(ultronPerformanceStageModel2, "apmClientAfterNetworkLogicProcess", false);
        UltronPerformanceStageModel ultronPerformanceStageModel3 = new UltronPerformanceStageModel("apmBizServerProcess");
        ultronPerformanceStageModel3.setStartMills(0L);
        ultronPerformanceStageModel3.setEndMills(0L);
        ultronPerformanceStageModel3.setFreeStage(true);
        b.a(ultronPerformanceStageModel3, "apmClientNetwork", false);
    }
}
