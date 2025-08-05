package org.java_websocket.framing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;
import tb.sbx;

/* loaded from: classes9.dex */
public class i extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public i() {
        super(Framedata.Opcode.TEXT);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // org.java_websocket.framing.e, org.java_websocket.framing.f
    public void c() throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        if (!sbx.b(d())) {
            throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
        }
    }
}
