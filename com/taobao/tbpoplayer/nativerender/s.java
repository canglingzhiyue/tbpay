package com.taobao.tbpoplayer.nativerender;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.TriggerActionsModel;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TRIGGER_ACTION_KEY_BACK = "actionKeyBack";
    public static final String TRIGGER_AUTO_COUNT_DOWN = "autoCountDown";
    public static final String TRIGGER_EXPOSE = "expose";

    static {
        kge.a(497001424);
    }

    public static /* synthetic */ void lambda$VgtUhgsTLGH7QR_uallwjJUEwIc(e eVar, boolean z, int i, String str, TriggerActionsModel triggerActionsModel) {
        a(eVar, z, i, str, triggerActionsModel);
    }

    public static boolean a(String str, List<TriggerActionsModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1aa3527", new Object[]{str, list})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        TriggerActionsModel triggerActionsModel = null;
        if (list != null && !list.isEmpty()) {
            for (TriggerActionsModel triggerActionsModel2 : list) {
                if (triggerActionsModel2 != null && triggerActionsModel2.isValid() && str.equals(triggerActionsModel2.trigger.getString("type"))) {
                    triggerActionsModel = triggerActionsModel2;
                }
            }
        }
        return triggerActionsModel != null;
    }

    public static boolean a(final e eVar, final String str, final boolean z, List<TriggerActionsModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce5f15d9", new Object[]{eVar, str, new Boolean(z), list})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        TriggerActionsModel triggerActionsModel = null;
        if (list != null && !list.isEmpty()) {
            for (TriggerActionsModel triggerActionsModel2 : list) {
                if (triggerActionsModel2 != null && triggerActionsModel2.isValid() && str.equals(triggerActionsModel2.trigger.getString("type"))) {
                    triggerActionsModel = triggerActionsModel2;
                }
            }
        }
        final TriggerActionsModel triggerActionsModel3 = triggerActionsModel;
        if (triggerActionsModel3 == null) {
            return false;
        }
        if ("autoCountDown".equals(str)) {
            long longValue = triggerActionsModel3.trigger.getLongValue("countDownTime");
            if (longValue > 0) {
                final int o = eVar.a().o();
                eVar.a(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$s$VgtUhgsTLGH7QR_uallwjJUEwIc
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.lambda$VgtUhgsTLGH7QR_uallwjJUEwIc(e.this, z, o, str, triggerActionsModel3);
                    }
                }, longValue);
            }
            return true;
        }
        eVar.a(eVar.a().j(), str, triggerActionsModel3.action, triggerActionsModel3.actions);
        return true;
    }

    public static /* synthetic */ void a(e eVar, boolean z, int i, String str, TriggerActionsModel triggerActionsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2d8090", new Object[]{eVar, new Boolean(z), new Integer(i), str, triggerActionsModel});
        } else if (eVar.a() != null && eVar.a().g()) {
            com.alibaba.poplayer.utils.c.a("TriggerActionHandler.executeCountDownTime.isEngineClosed", new Object[0]);
        } else if (z && eVar.a().o() != i) {
            com.alibaba.poplayer.utils.c.a("TriggerActionHandler.executeCountDownTime.stateIndexChanged", new Object[0]);
        } else {
            eVar.a(eVar.a().j(), str, triggerActionsModel.action, triggerActionsModel.actions);
        }
    }
}
