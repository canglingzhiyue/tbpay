package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.performence.model.UltronPerformanceFlowModel;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class krq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-207498729);
    }

    public static boolean a(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4a4dc6b", new Object[]{ultronPerformanceFlowModel})).booleanValue();
        }
        String str = ultronPerformanceFlowModel.mBizCode;
        boolean a2 = jqi.a(str, "enablePerformanceInvalidGapCheck", false);
        List<UltronPerformanceStageModel> childStages = ultronPerformanceFlowModel.getChildStages();
        if (childStages == null || childStages.isEmpty()) {
            return !a2;
        }
        String str2 = str + "_ultronPerformanceInvalidGap";
        if (a2) {
            jpr.a(jpt.a(str, str2).c("性能数据校验").a(0.001f).b(true));
        }
        Collections.sort(childStages, new Comparator<UltronPerformanceStageModel>() { // from class: tb.krq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(UltronPerformanceStageModel ultronPerformanceStageModel, UltronPerformanceStageModel ultronPerformanceStageModel2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, ultronPerformanceStageModel, ultronPerformanceStageModel2})).intValue() : a(ultronPerformanceStageModel, ultronPerformanceStageModel2);
            }

            public int a(UltronPerformanceStageModel ultronPerformanceStageModel, UltronPerformanceStageModel ultronPerformanceStageModel2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("81ff8abb", new Object[]{this, ultronPerformanceStageModel, ultronPerformanceStageModel2})).intValue() : Long.compare(ultronPerformanceStageModel.getStartMills(), ultronPerformanceStageModel2.getStartMills());
            }
        });
        long j = 0;
        long startMills = ultronPerformanceFlowModel.getStartMills();
        for (UltronPerformanceStageModel ultronPerformanceStageModel : childStages) {
            if (!ultronPerformanceStageModel.isFreeStage()) {
                long startMills2 = ultronPerformanceStageModel.getStartMills() - startMills;
                int a3 = jqi.a(str, "ultronPerformanceInvalidGapMills", 10);
                if (Math.abs(startMills2) >= a3) {
                    jqg.a("性能数据分析", "性能数据异常：阶段【" + ultronPerformanceStageModel.getStageCode() + "】和上一个阶段的结束时间相差超过" + a3 + "ms");
                    if (a2) {
                        jpt c = jpt.a(str, str2).c("性能数据校验#有误");
                        z = true;
                        jpr.a(c.a("误差值：" + startMills2).a(1.0f).a(1));
                    } else {
                        z = true;
                    }
                    if (a2) {
                        return false;
                    }
                    return z;
                }
                startMills = ultronPerformanceStageModel.getEndMills();
                j += ultronPerformanceStageModel.getDurationMills();
            }
        }
        return Math.abs(j - ultronPerformanceFlowModel.mDurationMills) <= ((long) jqi.a(str, "tolerableDeltaDurationOfPerformance", 100));
    }

    public static void b(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5735ae8", new Object[]{ultronPerformanceFlowModel});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(jpp.UMBRELLA_ARGS_PARAM_KEY, JSONObject.toJSON(ultronPerformanceFlowModel));
        jqg.b("性能数据分析", "性能埋点(原始数据)", hashMap);
        StringBuilder sb = new StringBuilder();
        sb.append(ultronPerformanceFlowModel.mFlowCode);
        sb.append("\n总耗时：");
        sb.append(ultronPerformanceFlowModel.mDurationMills);
        sb.append(" => [");
        sb.append(ultronPerformanceFlowModel.getStartMills());
        sb.append(",");
        sb.append(ultronPerformanceFlowModel.getEndMills());
        sb.append(riy.ARRAY_END_STR);
        sb.append("\n");
        List<UltronPerformanceStageModel> childStages = ultronPerformanceFlowModel.getChildStages();
        if (childStages != null) {
            Collections.sort(childStages, new Comparator<UltronPerformanceStageModel>() { // from class: tb.krq.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public /* synthetic */ int compare(UltronPerformanceStageModel ultronPerformanceStageModel, UltronPerformanceStageModel ultronPerformanceStageModel2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, ultronPerformanceStageModel, ultronPerformanceStageModel2})).intValue() : a(ultronPerformanceStageModel, ultronPerformanceStageModel2);
                }

                public int a(UltronPerformanceStageModel ultronPerformanceStageModel, UltronPerformanceStageModel ultronPerformanceStageModel2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("81ff8abb", new Object[]{this, ultronPerformanceStageModel, ultronPerformanceStageModel2})).intValue() : Long.compare(ultronPerformanceStageModel.getStartMills(), ultronPerformanceStageModel2.getStartMills());
                }
            });
            int a2 = a(childStages);
            for (UltronPerformanceStageModel ultronPerformanceStageModel : childStages) {
                a(sb, ultronPerformanceStageModel, a2, 1);
            }
        }
        sb.toString();
    }

    private static int a(List<UltronPerformanceStageModel> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{list})).intValue();
        }
        for (UltronPerformanceStageModel ultronPerformanceStageModel : list) {
            i = Math.max(ultronPerformanceStageModel.getStageCode().length(), i);
        }
        return i;
    }

    private static void a(StringBuilder sb, UltronPerformanceStageModel ultronPerformanceStageModel, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655995a8", new Object[]{sb, ultronPerformanceStageModel, new Integer(i), new Integer(i2)});
            return;
        }
        sb.append(a(i2));
        sb.append("|");
        sb.append(a(i, ultronPerformanceStageModel.getStageCode()));
        sb.append(" => ");
        sb.append(riy.ARRAY_START_STR);
        sb.append(ultronPerformanceStageModel.getStartMills());
        sb.append(",");
        sb.append(ultronPerformanceStageModel.getEndMills());
        sb.append("],耗时：");
        sb.append(ultronPerformanceStageModel.getDurationMills());
        sb.append("\n");
        List<UltronPerformanceStageModel> childStages = ultronPerformanceStageModel.getChildStages();
        if (childStages == null || childStages.isEmpty()) {
            return;
        }
        int a2 = a(childStages);
        int i3 = i2 + 1;
        for (UltronPerformanceStageModel ultronPerformanceStageModel2 : childStages) {
            a(sb, ultronPerformanceStageModel2, a2, i3);
        }
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (1 == i) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < (i - 1) * 3; i2++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    private static String a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd4d069b", new Object[]{new Integer(i), str});
        }
        int length = str.length();
        if (length == i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i2 = 0; i2 < i - length; i2++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
