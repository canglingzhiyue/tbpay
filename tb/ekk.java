package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ekk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27374a;
    private final JSONArray b;
    private AURARenderComponent c;
    private final AURARenderComponent d;
    private final int e;
    private int f = 0;
    private int g = -1;
    private int h = 0;

    static {
        kge.a(-725589747);
    }

    public ekk(String str, JSONArray jSONArray, AURARenderComponent aURARenderComponent, int i) {
        this.f27374a = str;
        this.b = jSONArray;
        this.d = aURARenderComponent;
        this.e = i;
        emu.a("com.taobao.android.detail.core.standard.mainpic.locator.extension.AliSDetailLocatorModel");
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.h;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        } else {
            this.c = aURARenderComponent;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f27374a;
    }

    public JSONArray c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("c49d9194", new Object[]{this}) : this.b;
    }

    public AURARenderComponent d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("4aa17516", new Object[]{this}) : this.d;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.g;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public AURARenderComponent f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("2246c98", new Object[]{this}) : this.c;
    }

    public AURARenderComponent g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("dde5e859", new Object[]{this});
        }
        AURARenderComponent b = b(this.d);
        if (b != null) {
            return b;
        }
        arc.a().a("AliSDetailLocatorModel", "getFirstFrameComponent", "cannot find first renderable content component");
        return c(this.d);
    }

    private AURARenderComponent b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("194d01d", new Object[]{this, aURARenderComponent}) : emi.a(aURARenderComponent, true);
    }

    private AURARenderComponent c(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("95b3e03c", new Object[]{this, aURARenderComponent}) : emi.a(aURARenderComponent, false);
    }

    public List<AURARenderComponent> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        AURARenderComponent aURARenderComponent = this.c;
        if (aURARenderComponent != null && aURARenderComponent.parent != null) {
            emi.a(arrayList, this.c.parent);
        }
        return arrayList;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AURARenderLocatorModel{mTargetLocatorId='" + this.f27374a + "', mIndexOfAllLocatorGroup=" + this.e + ", mIndexInCurrentLocatorGroup=" + this.g + ", mTotalSizeInCurrentLocatorGroup=" + this.h + ", mTotalSizeOfAllLocatorGroup=" + this.f + ", mLocatorLayoutComponent=" + this.d + '}';
    }
}
