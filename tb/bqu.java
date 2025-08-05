package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final UltronDeltaProtocol f26047a;
    private final Delta b;
    private final boolean c;

    static {
        kge.a(153083818);
    }

    public bqu(Delta delta, UltronDeltaProtocol ultronDeltaProtocol, boolean z) {
        this.b = delta;
        this.f26047a = ultronDeltaProtocol;
        this.c = z;
    }

    public Delta a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Delta) ipChange.ipc$dispatch("bfaf00cd", new Object[]{this}) : this.b;
    }

    public UltronDeltaProtocol b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UltronDeltaProtocol) ipChange.ipc$dispatch("1d523d14", new Object[]{this}) : this.f26047a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }
}
