package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.a;
import com.taobao.android.diagnose.v;
import com.taobao.tao.log.TLog;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes.dex */
public class fnc implements fna {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(408027978);
        kge.a(-1098688424);
    }

    @Override // tb.fna
    public int a(fmz fmzVar, fmx fmxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71ad9161", new Object[]{this, fmzVar, fmxVar, str})).intValue();
        }
        if (fmzVar != null) {
            return b(fmzVar, fmxVar, str);
        }
        return 0;
    }

    public int b(fmz fmzVar, fmx fmxVar, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3aae88a2", new Object[]{this, fmzVar, fmxVar, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            v.c("CommonRulesEngine", "The scene code is null");
            return 0;
        } else if (fmzVar.a()) {
            v.c("CommonRulesEngine", "No rules registered for " + str);
            return 0;
        } else {
            if (fmxVar == null) {
                fmxVar = new fmx();
            }
            fmxVar.a(a.b());
            fmxVar.a("fact_time_hh", Integer.valueOf(Calendar.getInstance().get(11)));
            Iterator<fmy> it = fmzVar.iterator();
            int i = 0;
            while (it.hasNext()) {
                fmy next = it.next();
                if (next != null && str.equals(next.c())) {
                    if (next.h()) {
                        v.a("CommonRulesEngine", "The rule is out of date：" + next.toString());
                    } else if (!"scene_custom".equals(str) || (next.g() != null && next.g().equals(fmxVar.a("fact_biz_name")))) {
                        try {
                            z = next.a(fmxVar);
                        } catch (RuntimeException e) {
                            TLog.loge("Diagnose", "CommonRulesEngine", "Rule '" + next.toString() + "' evaluated with error", e);
                            z = false;
                        }
                        if (z) {
                            v.d("CommonRulesEngine", String.format("Execute rule %s form channel %b", next.toString(), Boolean.valueOf(next.e())));
                            i++;
                            try {
                                next.b(fmxVar);
                            } catch (Exception e2) {
                                TLog.loge("Diagnose", "CommonRulesEngine", "Rule '" + next.toString() + "' performed with error", e2);
                            }
                        }
                    }
                }
            }
            return i;
        }
    }
}
