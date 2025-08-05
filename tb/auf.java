package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aty;

/* loaded from: classes2.dex */
public final class auf extends atz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final aty f25606a;

    static {
        kge.a(-1834527474);
    }

    public static /* synthetic */ Object ipc$super(auf aufVar, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : "sticky";
    }

    public static /* synthetic */ String a(auf aufVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("461c6ee6", new Object[]{aufVar, str, str2}) : aufVar.a(str, str2);
    }

    public auf(AURARenderComponent aURARenderComponent) {
        super(aURARenderComponent);
        this.f25606a = new aty(new aty.a() { // from class: tb.auf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aty.a
            public String a(String str, String str2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : auf.a(auf.this, str, str2);
            }
        });
    }

    @Override // tb.atz
    public c h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("5c31e54a", new Object[]{this}) : this.f25606a.a();
    }

    @Override // tb.atz, tb.aua
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        super.l();
        this.f25606a.b();
    }
}
