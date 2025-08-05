package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Map;

/* loaded from: classes2.dex */
public class art extends ba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public q f25540a;
    public AURARenderComponent b;
    public f c;
    private DXEvent d;
    private Object[] e;
    private Map<String, Object> f;
    private AURAGlobalData g;

    static {
        kge.a(30308908);
    }

    public art(q qVar, AURARenderComponent aURARenderComponent, f fVar) {
        this.f25540a = qVar;
        this.b = aURARenderComponent;
        this.c = fVar;
    }

    public art(q qVar, AURARenderComponent aURARenderComponent, f fVar, AURAGlobalData aURAGlobalData) {
        this.f25540a = qVar;
        this.b = aURARenderComponent;
        this.c = fVar;
        this.g = aURAGlobalData;
    }

    public q a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("3c3eac17", new Object[]{this}) : this.f25540a;
    }

    public AURARenderComponent b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("931e7d94", new Object[]{this}) : this.b;
    }

    public f c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("4c9f2a80", new Object[]{this}) : this.c;
    }

    public AURAGlobalData g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("a7dca884", new Object[]{this}) : this.g;
    }

    public DXEvent d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXEvent) ipChange.ipc$dispatch("f07e760d", new Object[]{this}) : this.d;
    }

    public void a(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed70072a", new Object[]{this, dXEvent});
        } else {
            this.d = dXEvent;
        }
    }

    public Object[] e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("fd747dcd", new Object[]{this}) : this.e;
    }

    public void a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
        } else {
            this.e = objArr;
        }
    }

    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.f;
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.f = map;
        }
    }
}
