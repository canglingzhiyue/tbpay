package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.a;

/* loaded from: classes7.dex */
public class lhl implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f30606a;
    private final boolean b;
    private final boolean c;

    static {
        kge.a(-1095844249);
        kge.a(458294217);
    }

    public lhl(boolean z, boolean z2, boolean z3) {
        this.f30606a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f30606a;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.a
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }
}
