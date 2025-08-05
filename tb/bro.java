package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.umf.datamodel.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public final class bro extends brm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(198959964);
    }

    public static /* synthetic */ Object ipc$super(bro broVar, String str, Object... objArr) {
        if (str.hashCode() == -1054399266) {
            super.a((b) objArr[0], (brk) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.brj
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        }
    }

    @Override // tb.brm, tb.brj
    public void a(b bVar, brk brkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12724de", new Object[]{this, bVar, brkVar});
        } else {
            super.a(bVar, brkVar);
        }
    }

    @Override // tb.brj
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer}) : new Space(viewGroup.getContext());
    }

    @Override // tb.brj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : a.b.d;
    }

    @Override // tb.brj
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent}) : a.C0066a.f2132a;
    }
}
