package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.engine.action.a;
import com.taobao.android.diagnose.scene.engine.reader.RuleDefine;
import com.taobao.android.diagnose.scene.engine.reader.c;
import com.taobao.android.diagnose.v;
import java.util.List;

/* loaded from: classes.dex */
public class fnh extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-40030581);
    }

    @Override // com.taobao.android.diagnose.scene.engine.reader.c
    public fmy a(RuleDefine ruleDefine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fmy) ipChange.ipc$dispatch("82f9794", new Object[]{this, ruleDefine});
        }
        if (ruleDefine == null || TextUtils.isEmpty(ruleDefine.id) || TextUtils.isEmpty(ruleDefine.sceneCode) || TextUtils.isEmpty(ruleDefine.sceneRuleCode) || ruleDefine.actions == null || ruleDefine.actions.isEmpty()) {
            v.a("ELV1RuleFactory", "Rule define invalid!!");
            return null;
        } else if ("scene_custom".equals(ruleDefine.sceneCode) && TextUtils.isEmpty(ruleDefine.bizName)) {
            v.a("ELV1RuleFactory", "Custom Rule define invalid!!");
            return null;
        } else {
            fnf fnfVar = new fnf(ruleDefine.condition);
            List<fmu> a2 = a.a(ruleDefine.actions);
            if (a2 == null) {
                v.a("ELV1RuleFactory", "Action is empty!!");
                return null;
            }
            return new fnd().a(ruleDefine.id).a(ruleDefine.sceneVersion).b(ruleDefine.sceneCode).c(ruleDefine.sceneRuleCode).a(ruleDefine.sampling).a(fnfVar).a(a2).a();
        }
    }
}
