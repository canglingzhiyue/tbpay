package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.r;
import com.taobao.android.ultron.performence.model.UltronPerformanceFlowModel;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import java.util.List;
import tb.rid;

/* loaded from: classes5.dex */
public final class rhr extends rid.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(751007180);
    }

    public static /* synthetic */ Object ipc$super(rhr rhrVar, String str, Object... objArr) {
        if (str.hashCode() == 1543639542) {
            return new Boolean(super.a((UltronPerformanceFlowModel) objArr[0], (fgf) objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rid.a
    public boolean b(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5735aec", new Object[]{this, ultronPerformanceFlowModel})).booleanValue();
        }
        return false;
    }

    @Override // tb.rid.a
    public boolean a(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        List<UltronPerformanceStageModel> childStages;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4a4dc6b", new Object[]{this, ultronPerformanceFlowModel})).booleanValue();
        }
        if (c(ultronPerformanceFlowModel)) {
            a(ultronPerformanceFlowModel.getEndMills(), Boolean.parseBoolean(ultronPerformanceFlowModel.getCommonArg("isLoadFromCache")));
        }
        return ultronPerformanceFlowModel.mDurationMills >= ((long) jqi.a("iCart", "maxDurationOfUploadPerformance", 20000)) || (childStages = ultronPerformanceFlowModel.getChildStages()) == null || childStages.isEmpty() || !krq.a(ultronPerformanceFlowModel);
    }

    @Override // tb.rid.a
    public boolean a(UltronPerformanceFlowModel ultronPerformanceFlowModel, fgf fgfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0211f6", new Object[]{this, ultronPerformanceFlowModel, fgfVar})).booleanValue();
        }
        if (ultronPerformanceFlowModel.mChildStages == null) {
            return true;
        }
        if (c(ultronPerformanceFlowModel)) {
            for (UltronPerformanceStageModel ultronPerformanceStageModel : ultronPerformanceFlowModel.mChildStages) {
                if ("navStage".equals(ultronPerformanceStageModel.getStageCode()) && ultronPerformanceStageModel.getDurationMills() <= 0) {
                    return true;
                }
            }
        }
        if ("mtop.trade.query.bag".equals(ultronPerformanceFlowModel.mFlowCode)) {
            fgfVar.b(0.01f);
        } else {
            fgfVar.b(0.001f);
        }
        return super.a(ultronPerformanceFlowModel, fgfVar);
    }

    private static boolean c(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d641d96d", new Object[]{ultronPerformanceFlowModel})).booleanValue() : Boolean.parseBoolean(ultronPerformanceFlowModel.getCommonArg(nfc.PHA_MONITOR_IS_COLD_START));
    }

    private void a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{this, new Long(j), new Boolean(z)});
        } else if (!jqi.a("iCart", "reportToRUM", true)) {
        } else {
            try {
                r rVar = FalcoGlobalTracer.get();
                shc h = rVar.h();
                if (h == null) {
                    return;
                }
                shc av_ = rVar.a(shc.MODULE, shc.SCENE_TAP).a(h).av_();
                av_.a(h);
                av_.c(akg.b());
                av_.b(z);
                av_.c_(Long.valueOf(j));
                av_.c();
            } catch (Throwable th) {
                bed.a("reportToRUM", th.getMessage());
            }
        }
    }
}
