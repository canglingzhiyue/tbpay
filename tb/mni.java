package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class mni implements mnf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mni INSTANCE = new mni();

    /* renamed from: a  reason: collision with root package name */
    private mnf f31135a;

    public mni a(mnf mnfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mni) ipChange.ipc$dispatch("2a49c76b", new Object[]{this, mnfVar});
        }
        this.f31135a = mnfVar;
        return this;
    }

    @Override // tb.mnf
    public boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        mnf mnfVar = this.f31135a;
        if (mnfVar == null) {
            return false;
        }
        return mnfVar.a(view);
    }

    @Override // tb.mnf
    public int c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d05011b", new Object[]{this, view})).intValue();
        }
        mnf mnfVar = this.f31135a;
        if (mnfVar == null) {
            return 0;
        }
        return mnfVar.c(view);
    }
}
