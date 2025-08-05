package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.Hierarchy;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.alibaba.android.umf.node.service.data.rule.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class bqj implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private aqq<AURAParseIO> f26043a;

    static {
        kge.a(658400073);
        kge.a(-247916910);
    }

    public abstract Map<String, Component> a(com.alibaba.android.umf.datamodel.service.rule.a aVar, bqi bqiVar);

    private UltronDeltaProtocol a(String str, Map<String, Component> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("3cd5c6be", new Object[]{this, str, map});
        }
        if (map == null) {
            return null;
        }
        UltronDeltaProtocol ultronDeltaProtocol = new UltronDeltaProtocol();
        Delta delta = new Delta();
        delta.opType = "merge";
        delta.target = str;
        Hierarchy hierarchy = new Hierarchy();
        hierarchy.delta = new ArrayList(Arrays.asList(delta));
        ultronDeltaProtocol.hierarchy = hierarchy;
        ultronDeltaProtocol.data = map;
        return ultronDeltaProtocol;
    }

    @Override // com.alibaba.android.umf.node.service.data.rule.a
    public UltronDeltaProtocol a(com.alibaba.android.umf.datamodel.service.rule.a aVar, aqq<AURAParseIO> aqqVar, bqi bqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("320557ed", new Object[]{this, aVar, aqqVar, bqiVar});
        }
        if (TextUtils.isEmpty(aVar.b)) {
            return null;
        }
        this.f26043a = aqqVar;
        return a(aVar.b, a(aVar, bqiVar));
    }

    public void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        aqq<AURAParseIO> aqqVar = this.f26043a;
        if (aqqVar == null) {
            return;
        }
        aqqVar.a(new b(i, "AURARulesServiceDomain", str, str2));
    }
}
