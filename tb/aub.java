package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class aub extends atz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-171601035);
    }

    public static /* synthetic */ Object ipc$super(aub aubVar, String str, Object... objArr) {
        if (str.hashCode() == 101150451) {
            super.l();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.atz
    public boolean a(atz atzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0b61ed5", new Object[]{this, atzVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.atz, tb.aua
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : "card";
    }

    public aub(AURARenderComponent aURARenderComponent) {
        super(aURARenderComponent);
    }

    @Override // tb.atz
    public c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("5c31e54a", new Object[]{this});
        }
        aun aunVar = new aun(k());
        int max = Math.max(0, a());
        int max2 = Math.max(1, b());
        a(aunVar, max, max2);
        a(max, max2);
        return aunVar;
    }

    private void a(aun aunVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2422be", new Object[]{this, aunVar, new Integer(i), new Integer(i2)});
        } else if (!(aunVar instanceof auv)) {
        } else {
            aunVar.b(i);
            aunVar.a(i2);
        }
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int k = k();
        AURARenderComponent d = d();
        if (d == null) {
            return;
        }
        if (1 == i2 && 1 == k) {
            a(d, "both");
            return;
        }
        AURARenderComponent e = e();
        if (e == null) {
            return;
        }
        if (1 == i2) {
            a(d, "top");
            a(e, "bottom");
        } else if (i == 0) {
            a(d, "top");
        } else if (i != i2 - 1) {
        } else {
            a(e, "bottom");
        }
    }

    private void a(AURARenderComponent aURARenderComponent, String str) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a501edd", new Object[]{this, aURARenderComponent, str});
        } else if (aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null) {
        } else {
            if (aURARenderComponentData.fields == null) {
                aURARenderComponentData.fields = new HashMap();
            }
            aURARenderComponentData.fields.put("cornerType", str);
        }
    }

    @Override // tb.atz, tb.aua
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            super.l();
        }
    }
}
