package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class auy extends arj<UMFRuleIO, AURAParseIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.service.rule";

    /* renamed from: a  reason: collision with root package name */
    private auz f25625a;

    static {
        kge.a(806234479);
    }

    public static /* synthetic */ Object ipc$super(auy auyVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 339629984) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((AURAInputData) objArr[0], (aqq) objArr[1]);
            return null;
        }
    }

    @Override // tb.arj
    public void a(AURAInputData<UMFRuleIO> aURAInputData, aqq<AURAParseIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143e57a0", new Object[]{this, aURAInputData, aqqVar});
            return;
        }
        super.a(aURAInputData, aqqVar);
        this.f25625a = new aux(aURAInputData, getExtensionManager());
        UMFRuleIO data = aURAInputData.getData();
        String type = data.getType();
        if (TextUtils.isEmpty(type)) {
            baw.a("ruleType is NULL!!");
            aqqVar.a(new b(1, "AURARulesServiceDomain", "-1000_EMPTY_ACTION", "规则服务type为null"));
        } else if ("rollback".equals(type)) {
            aqqVar.a(c.a(new AURAParseIO(null, a(type)), aURAInputData));
        } else {
            List<a> actions = data.getActions();
            if (actions == null) {
                aqqVar.a(new b(0, "AURARulesServiceDomain", "-1000_EMPTY_ACTION", "规则服务actions为null"));
                return;
            }
            UltronDeltaProtocol a2 = this.f25625a.a(actions, aqqVar);
            if (a2 == null) {
                return;
            }
            aqqVar.a(c.a(new AURAParseIO(Arrays.asList(new com.alibaba.android.aura.datamodel.parse.a((JSONObject) JSONObject.toJSON(a2), data.isConfirm())), a(type)), aURAInputData));
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1068795718) {
            if (hashCode == -259719452 && str.equals("rollback")) {
                c = 1;
            }
        } else if (str.equals("modify")) {
            c = 0;
        }
        return c != 0 ? c != 1 ? "default" : "rollback" : "modify";
    }

    @Override // com.alibaba.android.aura.n, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        auz auzVar = this.f25625a;
        if (auzVar == null) {
            return;
        }
        auzVar.a();
    }
}
