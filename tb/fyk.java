package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fya;
import tb.fye;

/* loaded from: classes5.dex */
public class fyk implements fye.a<fxw, fym> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final float f28216a;

    static {
        kge.a(-1226608822);
        kge.a(1922608311);
    }

    public fyk(float f) {
        this.f28216a = f;
    }

    @Override // tb.fye.a
    public boolean a(fym fymVar, fya.a<fxw> aVar) {
        View c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aba3687", new Object[]{this, fymVar, aVar})).booleanValue();
        }
        if (aVar != null && (c = aVar.a().c()) != null) {
            return fzh.a(c, this.f28216a);
        }
        return true;
    }
}
