package tb;

import com.alibaba.android.ultron.event.base.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.dnu;

/* loaded from: classes4.dex */
public final class dmx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1610375391);
    }

    public dmx a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dmx) ipChange.ipc$dispatch("1748079e", new Object[]{this, dinamicXEngine});
        }
        dmy.a(dinamicXEngine);
        return this;
    }

    public dmx b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dmx) ipChange.ipc$dispatch("187e5a7d", new Object[]{this, dinamicXEngine});
        }
        dmy.b(dinamicXEngine);
        return this;
    }

    public dmx a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dmx) ipChange.ipc$dispatch("1460d7b5", new Object[]{this, fVar});
        }
        if (fVar != null) {
            fVar.a(new dnp());
        }
        return this;
    }

    public dmx a(DinamicXEngine dinamicXEngine, bol bolVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dmx) ipChange.ipc$dispatch("c0a9632d", new Object[]{this, dinamicXEngine, bolVar});
        }
        if (dinamicXEngine != null && dinamicXEngine.l() != null && bolVar != null) {
            dinamicXEngine.l().a(dnu.ULTRONBRIDGE, new dnu.a(bolVar));
        }
        return this;
    }
}
