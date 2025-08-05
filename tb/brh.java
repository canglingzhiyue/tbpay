package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.ultron.event.base.f;
import com.alibaba.android.umf.datamodel.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* loaded from: classes2.dex */
public class brh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f26060a;
    private String b;
    private String c;
    private JSONObject d;
    private b e;
    private AURARenderComponent f;
    private Object[] g;
    private DXEvent h;
    private f i;
    private int j = 0;

    static {
        kge.a(-2021359154);
    }

    public brh(String str, b bVar, AURARenderComponent aURARenderComponent, Object[] objArr) {
        this.f26060a = str;
        this.e = bVar;
        this.f = aURARenderComponent;
        a(objArr);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.d = jSONObject;
        }
    }

    public b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("68c7732b", new Object[]{this}) : this.e;
    }

    public AURARenderComponent d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("4aa17516", new Object[]{this}) : this.f;
    }

    public Object[] e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("fd747dcd", new Object[]{this}) : this.g;
    }

    public void a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
            return;
        }
        this.g = objArr;
        if (objArr.length <= 0) {
            bqe.a().c("UMFEventModel", "setArgs#eventFlag is empty");
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            this.c = (String) obj;
        } else {
            bqe.a().c("UMFEventModel", "setArgs#eventFlag is empty");
        }
    }

    public DXEvent f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXEvent) ipChange.ipc$dispatch("a58a44b", new Object[]{this}) : this.h;
    }

    public void a(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed70072a", new Object[]{this, dXEvent});
        } else {
            this.h = dXEvent;
        }
    }

    public f g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("121f85e8", new Object[]{this}) : this.i;
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d9a962", new Object[]{this, fVar});
        } else {
            this.i = fVar;
        }
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
