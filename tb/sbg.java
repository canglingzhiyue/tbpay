package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.framing.Framedata;

/* loaded from: classes9.dex */
public class sbg implements sbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.sbh
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "";
    }

    @Override // tb.sbh
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // tb.sbh
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "";
    }

    @Override // tb.sbh
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // tb.sbh
    public void a(Framedata framedata) throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24be8e5f", new Object[]{this, framedata});
        } else if (!framedata.f() && !framedata.g() && !framedata.h()) {
        } else {
            throw new InvalidFrameException("bad rsv RSV1: " + framedata.f() + " RSV2: " + framedata.g() + " RSV3: " + framedata.h());
        }
    }

    @Override // tb.sbh
    public sbh c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sbh) ipChange.ipc$dispatch("1e6db303", new Object[]{this}) : new sbg();
    }

    @Override // tb.sbh
    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : getClass().getSimpleName();
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : getClass().hashCode();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }
}
