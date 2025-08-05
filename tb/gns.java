package tb;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import com.taobao.android.ultron.performence.model.f;
import com.taobao.tao.TBMainHost;

/* loaded from: classes5.dex */
public final class gns {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(223538533);
    }

    public static void a(Fragment fragment) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0514a", new Object[]{fragment});
            return;
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        jpo b = jpo.b(activity);
        rid ridVar = new rid("iCart", "购物车");
        ridVar.a(new f(bed.PID, bed.b()));
        ridVar.a(new rhr());
        b.a(activity, ridVar);
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = TBMainHost.a().getContext() != activity;
        Bundle arguments = fragment.getArguments();
        if (z) {
            j = activity.getIntent().getLongExtra("NAV_TO_URL_START_TIME", 0L);
            if (arguments != null) {
                j2 = arguments.getLong("tabCartStartTime");
            }
            j2 = 0;
        } else if (arguments != null) {
            j = a(arguments.getLong("CLICK_TIME"));
            j2 = 0;
        } else {
            j = 0;
            j2 = 0;
        }
        if (currentTimeMillis - j > jqi.a("iCart", "giveUpTabUpTimeInterval", 1000)) {
            j = currentTimeMillis;
        }
        if (j <= 0) {
            j = currentTimeMillis;
        }
        akg.a(activity, "mtop.trade.query.bag", j);
        UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel("navStage");
        ultronPerformanceStageModel.setStartMills(j);
        ultronPerformanceStageModel.setEndMills(currentTimeMillis);
        b.a(ultronPerformanceStageModel, (String) null, false);
        if (j2 > 0) {
            UltronPerformanceStageModel ultronPerformanceStageModel2 = new UltronPerformanceStageModel("tabFragmentLoadStage");
            ultronPerformanceStageModel2.setStartMills(j2);
            ultronPerformanceStageModel2.setEndMills(currentTimeMillis);
            ultronPerformanceStageModel2.setFreeStage(true);
            b.a(ultronPerformanceStageModel2, "navStage", false);
        }
        b.a("apmClientBeforeNetworkLogicProcess", (String) null);
        b.b("startFrom", z ? "nav" : "tab");
    }

    private static long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue() : j > 0 ? (System.currentTimeMillis() - SystemClock.uptimeMillis()) + j : j;
    }
}
