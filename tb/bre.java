package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.android.umf.node.service.data.rule.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bre implements brd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Class<? extends DXEvent> EventType;

    /* renamed from: a  reason: collision with root package name */
    private final String f26057a;

    static {
        kge.a(1994343904);
        kge.a(371667525);
        EventType = DXEvent.class;
    }

    public bre(String str) {
        this.f26057a = str;
    }

    @Override // tb.brd
    public void a(AURARenderComponent aURARenderComponent, DXEvent dXEvent, Object[] objArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("967ab349", new Object[]{this, aURARenderComponent, dXEvent, objArr, map});
            return;
        }
        List<String> a2 = b.a();
        int a3 = a(objArr, RuleType.PROPS_WRITE_BACK);
        if (a3 != -1) {
            a(objArr, a3, map);
        } else {
            a(objArr, a2, map);
        }
    }

    private int a(Object[] objArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2fb9df46", new Object[]{this, objArr, str})).intValue();
        }
        for (int i = 0; i < objArr.length; i++) {
            if (str.equals(objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    private void a(Object[] objArr, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183925eb", new Object[]{this, objArr, new Integer(i), map});
            return;
        }
        int i2 = i + 2;
        if (objArr.length <= i2) {
            return;
        }
        Object obj = objArr[i + 1];
        Object obj2 = objArr[i2];
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return;
        }
        map.put((String) obj, (String) obj2);
    }

    private void a(Object[] objArr, List<String> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6215ff8b", new Object[]{this, objArr, list, map});
            return;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (list.contains(objArr[i])) {
                int i2 = i + 1;
                if (objArr.length <= i2) {
                    return;
                }
                map.put("clickId", objArr[i2]);
                return;
            }
        }
    }

    @Override // tb.brd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f26057a;
    }

    public Class<? extends DXEvent> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("6a1d2296", new Object[]{this}) : EventType;
    }
}
