package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.Hierarchy;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class avc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f25627a;
    private aqq<AURAParseIO> b;

    static {
        kge.a(-209118034);
    }

    public abstract String a();

    public abstract Map<String, Component> a(a aVar);

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

    public UltronDeltaProtocol a(a aVar, JSONObject jSONObject, aqq<AURAParseIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("66c76acd", new Object[]{this, aVar, jSONObject, aqqVar});
        }
        if (StringUtils.isEmpty(aVar.b)) {
            return null;
        }
        this.f25627a = jSONObject;
        this.b = aqqVar;
        return a(aVar.b, a(aVar));
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.f25627a;
    }

    public aqq<AURAParseIO> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqq) ipChange.ipc$dispatch("1e65bdbb", new Object[]{this}) : this.b;
    }
}
