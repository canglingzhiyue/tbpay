package tb;

import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.node.service.data.rule.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.List;
import tb.arc;

/* loaded from: classes2.dex */
public class axd extends axe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_URULETAP = 7023701163946200378L;

    /* renamed from: a  reason: collision with root package name */
    private final String f25666a = "AURADXURulesTapEventHandler";

    static {
        kge.a(1202985759);
    }

    public static /* synthetic */ Object ipc$super(axd axdVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 1732145304) {
            if (hashCode != 1785185506) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        return new Boolean(super.a((d) objArr[0], (s) objArr[1]));
    }

    @Override // tb.axe, com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.axe, tb.aru
    public boolean a(d dVar, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("673e7098", new Object[]{this, dVar, sVar})).booleanValue();
        }
        a(dVar);
        a("adjustRules", dVar, sVar);
        return super.a(dVar, sVar);
    }

    private void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb347aad", new Object[]{this, dVar});
            return;
        }
        String a2 = a(dVar.e());
        JSONObject c = dVar.c();
        if (c == null) {
            c = new JSONObject();
            dVar.a(c);
        }
        c.put("actionType", (Object) a2);
    }

    private String a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2583e9f7", new Object[]{this, objArr});
        }
        if (objArr == null || objArr.length < 2) {
            arc.a().b("getRuleType#", arc.a.a().b("AURADXURulesTapEventHandler").b());
            return null;
        }
        Object b = b(objArr);
        if (!(b instanceof String)) {
            arc.a().b("getRuleType#args[1] is not string type", arc.a.a().b("AURADXURulesTapEventHandler").a("ruleType", b).b());
            return null;
        }
        return (String) b;
    }

    private Object b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bf61378a", new Object[]{this, objArr});
        }
        List<String> a2 = b.a();
        for (Object obj : objArr) {
            if (a2.contains(obj)) {
                return obj;
            }
        }
        return null;
    }
}
