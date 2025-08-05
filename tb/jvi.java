package tb;

import com.alibaba.ability.b;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jvi implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1769141112);
        kge.a(-948502777);
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String str, als alsVar, Map<String, ?> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, str, alsVar, map, alnVar});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -625809843) {
            if (hashCode == -541487286 && str.equals("removeEventListener")) {
                c = 1;
            }
        } else if (str.equals("addEventListener")) {
            c = 0;
        }
        if (c == 0) {
            return a(alsVar, map, alnVar);
        }
        if (c == 1) {
            return b(alsVar, map, alnVar);
        }
        return new ErrorResult("404", "error", (Map<String, ? extends Object>) null);
    }

    private ExecuteResult a(als alsVar, Map<String, ?> map, final aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e3d9aefd", new Object[]{this, alsVar, map, alnVar});
        }
        String str = (String) map.get("eventName");
        com.taobao.android.weex_framework.bridge.b bVar = new com.taobao.android.weex_framework.bridge.b() { // from class: tb.jvi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.bridge.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // com.taobao.android.weex_framework.bridge.b
            public void a(Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b63135c9", new Object[]{this, objArr});
                }
            }

            @Override // com.taobao.android.weex_framework.bridge.b
            public void b(Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
                } else if (objArr != null && objArr.length > 0 && (objArr[0] instanceof HashMap)) {
                    alnVar.a(new ExecutingResult((HashMap) objArr[0], "result"));
                } else {
                    alnVar.a(new ExecutingResult());
                }
            }
        };
        if (alsVar == null) {
            a("404", "context = null", alnVar);
            return null;
        }
        Map<String, Object> e = alsVar.e();
        if (e == null) {
            a("404", "userDataMap = null", alnVar);
            return null;
        }
        p pVar = (p) e.get("instance");
        if (pVar != null) {
            pVar.addEventListener(str, bVar);
            alnVar.a(new FinishResult(new JSONObject(), "result"));
        }
        return null;
    }

    private ExecuteResult b(als alsVar, Map<String, ?> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e4a82d7e", new Object[]{this, alsVar, map, alnVar});
        }
        String str = (String) map.get("eventName");
        if (alsVar == null) {
            a("404", "context = null", alnVar);
            return null;
        }
        Map<String, Object> e = alsVar.e();
        if (e == null) {
            a("404", "userDataMap = null", alnVar);
            return null;
        }
        p pVar = (p) e.get("instance");
        if (pVar != null) {
            pVar.removeEventListener(str);
            alnVar.a(new FinishResult(new JSONObject(), "result"));
        }
        return null;
    }

    private void a(String str, String str2, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b2bb69", new Object[]{this, str, str2, alnVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", (Object) str);
        jSONObject.put("errorMessage", (Object) str2);
        alnVar.a(new ErrorResult("500", "", jSONObject));
    }
}
