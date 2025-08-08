package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.b;
import com.taobao.tbpoplayer.nativerender.dsl.TriggerActionsModel;
import com.taobao.tbpoplayer.nativerender.e;
import java.util.List;

/* loaded from: classes7.dex */
public class kgx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TRIGGER_AUTO_COUNT_DOWN = "autoCountDown";
    public static final String TRIGGER_CLOSE = "close";
    public static final String TRIGGER_EXPOSE = "expose";

    static {
        kge.a(1523187019);
    }

    public static /* synthetic */ void lambda$eD34QQAwKlWJ67uX62b5MG81SnQ(e eVar, b bVar, String str, TriggerActionsModel triggerActionsModel) {
        a(eVar, bVar, str, triggerActionsModel);
    }

    private static TriggerActionsModel a(String str, List<TriggerActionsModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerActionsModel) ipChange.ipc$dispatch("9c4a5b84", new Object[]{str, list});
        }
        TriggerActionsModel triggerActionsModel = null;
        if (list != null && !list.isEmpty()) {
            for (TriggerActionsModel triggerActionsModel2 : list) {
                if (triggerActionsModel2 != null && triggerActionsModel2.isValid() && str.equals(triggerActionsModel2.trigger.getString("type"))) {
                    triggerActionsModel = triggerActionsModel2;
                }
            }
        }
        return triggerActionsModel;
    }

    public static void a(final e eVar, final b bVar, final String str, List<TriggerActionsModel> list) {
        final TriggerActionsModel a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f26f657", new Object[]{eVar, bVar, str, list});
        } else if (StringUtils.isEmpty(str) || (a2 = a(str, list)) == null) {
        } else {
            JSONObject jSONObject = a2.trigger;
            if ("autoCountDown".equals(str)) {
                long longValue = jSONObject.getLongValue("countDownTime");
                if (longValue <= 0) {
                    return;
                }
                eVar.a(new Runnable() { // from class: tb.-$$Lambda$kgx$eD34QQAwKlWJ67uX62b5MG81SnQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        kgx.lambda$eD34QQAwKlWJ67uX62b5MG81SnQ(e.this, bVar, str, a2);
                    }
                }, longValue);
            } else if (!"expose".equals(str)) {
            } else {
                kgv.a(eVar, bVar, eVar.a().j(), str, a2.action, a2.actions);
            }
        }
    }

    public static /* synthetic */ void a(e eVar, b bVar, String str, TriggerActionsModel triggerActionsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da687e17", new Object[]{eVar, bVar, str, triggerActionsModel});
        } else if (eVar.a() != null && eVar.a().g()) {
        } else {
            kgv.a(eVar, bVar, eVar.a().j(), str, triggerActionsModel.action, triggerActionsModel.actions);
        }
    }

    public static boolean a(e eVar, b bVar, List<TriggerActionsModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a738f91", new Object[]{eVar, bVar, list})).booleanValue();
        }
        TriggerActionsModel a2 = a("close", list);
        if (a2 == null) {
            return false;
        }
        boolean booleanValue = a2.trigger.getBooleanValue("interrupt");
        kgv.a(eVar, bVar, eVar.a().j(), "close", a2.action, a2.actions);
        return booleanValue;
    }
}
