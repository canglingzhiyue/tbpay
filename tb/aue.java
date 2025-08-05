package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public final class aue extends atz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25605a;

    static {
        kge.a(-2041395703);
    }

    public static /* synthetic */ Object ipc$super(aue aueVar, String str, Object... objArr) {
        if (str.hashCode() == 101150451) {
            super.l();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.atz, tb.aua
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : "overlay";
    }

    public aue(AURARenderComponent aURARenderComponent) {
        super(aURARenderComponent);
        this.f25605a = "AURAReverseRenderOverlayLayoutHelper";
    }

    @Override // tb.atz
    public c h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("5c31e54a", new Object[]{this}) : new aur(k());
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

    @Override // tb.atz
    public boolean a(atz atzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0b61ed5", new Object[]{this, atzVar})).booleanValue();
        }
        if ("overlay".equalsIgnoreCase(atzVar.g())) {
            return true;
        }
        ard a2 = arc.a();
        a2.c("AURAReverseRenderOverlayLayoutHelper", "supportContainByParentLayout", atzVar + " not support parent layoutType:" + atzVar);
        return false;
    }
}
