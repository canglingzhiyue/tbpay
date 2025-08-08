package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class opy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<opz> f32272a = new CopyOnWriteArrayList();

    static {
        kge.a(-1405523168);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        for (opz opzVar : this.f32272a) {
            if (!StringUtils.isEmpty(opzVar.b())) {
                jSONObject.put(opzVar.a(), (Object) opzVar.b());
            }
        }
        return jSONObject.toJSONString();
    }

    public opy a(opz opzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (opy) ipChange.ipc$dispatch("b892086f", new Object[]{this, opzVar});
        }
        if (!this.f32272a.contains(opzVar)) {
            this.f32272a.add(opzVar);
        }
        return this;
    }
}
