package org.java_websocket.framing;

import com.android.alibaba.ip.runtime.IpChange;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.framing.Framedata;

/* loaded from: classes9.dex */
public abstract class d extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public d(Framedata.Opcode opcode) {
        super(opcode);
    }

    @Override // org.java_websocket.framing.f
    public void c() throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!e()) {
            throw new InvalidFrameException("Control frame cant have fin==false set");
        } else {
            if (f()) {
                throw new InvalidFrameException("Control frame cant have rsv1==true set");
            }
            if (g()) {
                throw new InvalidFrameException("Control frame cant have rsv2==true set");
            }
            if (h()) {
                throw new InvalidFrameException("Control frame cant have rsv3==true set");
            }
        }
    }
}
