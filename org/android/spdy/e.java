package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements Intenalcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // org.android.spdy.Intenalcb
    public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, long j, SpdyByteArray spdyByteArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b58bc17", new Object[]{this, spdySession, new Boolean(z), new Long(j), spdyByteArray, new Integer(i)});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyDataChunkRecvCB] - ", spdySession);
        long begin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i);
        if (spdyStream != null && spdyStream.callBack != null) {
            spdyStream.callBack.spdyDataChunkRecvCB(spdySession, z, j, spdyByteArray, spdyStream.streamContext);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyDataChunkRecvCB] - no sessionCallBack.");
        }
        NetTimeGaurd.end("spdyDataChunkRecvCB", 3, begin);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyDataRecvCallback(SpdySession spdySession, boolean z, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce72dfb", new Object[]{this, spdySession, new Boolean(z), new Long(j), new Integer(i), new Integer(i2)});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyDataRecvCallback] - ", spdySession);
        long begin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i2);
        if (spdyStream != null && spdyStream.callBack != null) {
            spdyStream.callBack.spdyDataRecvCallback(spdySession, z, j, i, spdyStream.streamContext);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyDataRecvCallback] - no sessionCallBack.");
        }
        NetTimeGaurd.end("spdyDataRecvCallback", 3, begin);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyDataSendCallback(SpdySession spdySession, boolean z, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87af181d", new Object[]{this, spdySession, new Boolean(z), new Long(j), new Integer(i), new Integer(i2)});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyDataSendCallback] - ");
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i2);
        if (spdyStream != null && spdyStream.callBack != null) {
            spdyStream.callBack.spdyDataSendCallback(spdySession, z, j, i, spdyStream.streamContext);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyDataSendCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyStreamCloseCallback(SpdySession spdySession, long j, int i, int i2, SuperviseData superviseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808b770c", new Object[]{this, spdySession, new Long(j), new Integer(i), new Integer(i2), superviseData});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyStreamCloseCallback] - ", spdySession);
        long begin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i2);
        if (spdyStream != null && spdyStream.callBack != null) {
            spdyStream.callBack.spdyStreamCloseCallback(spdySession, j, i, spdyStream.streamContext, superviseData);
            spdySession.removeSpdyStream(i2);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyStreamCloseCallback] - no sessionCallBack.");
        }
        NetTimeGaurd.end("spdyStreamCloseCallback", 3, begin);
        NetTimeGaurd.finish(3);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyRequestRecvCallback(SpdySession spdySession, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5f7cab", new Object[]{this, spdySession, new Long(j), new Integer(i)});
            return;
        }
        spduLog.Logd("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyOnStreamResponse] - ", spdySession.toString());
        long begin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i);
        if (spdyStream != null && spdyStream.callBack != null) {
            spdyStream.callBack.spdyRequestRecvCallback(spdySession, j, spdyStream.streamContext);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyRequestRecvCallback] - no sessionCallBack.");
        }
        NetTimeGaurd.end("spdyPingRecvCallback", 3, begin);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyOnStreamResponse(SpdySession spdySession, long j, Map<String, List<String>> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4def92c", new Object[]{this, spdySession, new Long(j), map, new Integer(i)});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyOnStreamResponse] - ", spdySession);
        NetTimeGaurd.start(3);
        long begin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i);
        if (spdyStream != null && spdyStream.callBack != null) {
            spdyStream.callBack.spdyOnStreamResponse(spdySession, j, map, spdyStream.streamContext);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyOnStreamResponse] - no sessionCallBack.");
        }
        NetTimeGaurd.end("spdyOnStreamResponse", 3, begin);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2bcf0e", new Object[]{this, spdySession, superviseConnectInfo});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdySessionConnectCB] - ", spdySession);
        NetTimeGaurd.start(0);
        if (spdySession.sessionCallBack != null) {
            long begin = NetTimeGaurd.begin();
            spdySession.sessionCallBack.spdySessionConnectCB(spdySession, superviseConnectInfo);
            NetTimeGaurd.end("spdySessionConnectCB", 0, begin);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdySessionConnectCB] - no sessionCallBack.");
        }
        NetTimeGaurd.finish(0);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d5bd4", new Object[]{this, spdySession, new Integer(i), obj});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdySessionFailedError] - ", spdySession);
        NetTimeGaurd.start(2);
        if (spdySession.sessionCallBack != null) {
            long begin = NetTimeGaurd.begin();
            spdySession.sessionCallBack.spdySessionFailedError(spdySession, i, obj);
            spdySession.clearAllStreamCb();
            NetTimeGaurd.end("spdySessionFailedError", 2, begin);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdySessionFailedError] - no sessionCallBack.");
        }
        NetTimeGaurd.finish(2);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76348e5", new Object[]{this, spdySession, obj, superviseConnectInfo, new Integer(i)});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdySessionCloseCallback] - ", spdySession);
        if (spdySession.sessionCallBack != null) {
            spdySession.sessionCallBack.spdySessionCloseCallback(spdySession, obj, superviseConnectInfo, i);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdySessionCloseCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c4fe4d", new Object[]{this, spdySession, new Long(j), obj});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyPingRecvCallback] - ", spdySession);
        NetTimeGaurd.start(1);
        if (spdySession.sessionCallBack != null) {
            long begin = NetTimeGaurd.begin();
            spdySession.sessionCallBack.spdyPingRecvCallback(spdySession, j, obj);
            NetTimeGaurd.end("spdyPingRecvCallback", 1, begin);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyPingRecvCallback] - no sessionCallBack.");
        }
        NetTimeGaurd.finish(1);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc5fc5", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyCustomControlFrameRecvCallback] - ", spdySession);
        if (spdySession.sessionCallBack != null) {
            spdySession.sessionCallBack.spdyCustomControlFrameRecvCallback(spdySession, obj, i, i2, i3, i4, bArr);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyCustomControlFrameRecvCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7576ccd6", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2)});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyCustomControlFrameFailCallback] - ", spdySession);
        if (spdySession.sessionCallBack != null) {
            spdySession.sessionCallBack.spdyCustomControlFrameFailCallback(spdySession, obj, i, i2);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdyCustomControlFrameFailCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5c8a40", new Object[]{this, spdySession, obj, new Integer(i)});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdySessionOnWritable] - ", spdySession);
        NetTimeGaurd.start(2);
        if (spdySession.sessionCallBack != null && (spdySession.sessionCallBack instanceof SessionExtraCb)) {
            long begin = NetTimeGaurd.begin();
            ((SessionExtraCb) spdySession.sessionCallBack).spdySessionOnWritable(spdySession, obj, i);
            NetTimeGaurd.end("spdySessionOnWritable", 2, begin);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.spdySessionOnWritable] - no sessionCallBack.");
        }
        NetTimeGaurd.finish(2);
    }

    @Override // org.android.spdy.Intenalcb
    public void bioPingRecvCallback(SpdySession spdySession, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6dabda", new Object[]{this, spdySession, new Integer(i)});
            return;
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.bioPingRecvCallback] - ", spdySession);
        if (spdySession.sessionCallBack != null) {
            spdySession.sessionCallBack.bioPingRecvCallback(spdySession, i);
        } else {
            spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.bioPingRecvCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public byte[] getSSLMeta(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9362ffe", new Object[]{this, spdySession});
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.getSSLMeta] - ", spdySession);
        if (spdySession.sessionCallBack != null) {
            return spdySession.sessionCallBack.getSSLMeta(spdySession);
        }
        spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.getSSLMeta] - no sessionCallBack.");
        return null;
    }

    @Override // org.android.spdy.Intenalcb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ce64c60", new Object[]{this, spdySession, bArr})).intValue();
        }
        spduLog.Logi("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.putSSLMeta] - ", spdySession);
        if (spdySession.sessionCallBack != null) {
            return spdySession.sessionCallBack.putSSLMeta(spdySession, bArr);
        }
        spduLog.Loge("tnetsdk.SpdySessionCallBack", "[SpdySessionCallBack.putSSLMeta] - no sessionCallBack.");
        return -1;
    }
}
