package org.android.spdy;

import java.util.Map;

/* loaded from: classes.dex */
public interface SessionCustomExtraCb {
    void onCustomFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr, SuperviseData superviseData, Map<String, Object> map);
}
