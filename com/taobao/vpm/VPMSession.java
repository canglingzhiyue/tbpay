package com.taobao.vpm;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vpm.utils.a;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class VPMSession {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long mNativePtr;

    private native void _feedAudioToFrame(int i, byte[] bArr, int i2, int i3, int i4);

    private native void _feedVideoToFrame(int i, byte[] bArr, int i2, int i3);

    private native void _setHeartInterval(int i);

    private native boolean _shouldFeedVideoToFrame(int i);

    private native void _start();

    private native void _stop();

    public native void _setUserStatDict(String str);

    public VPMSession(long j) {
        this.mNativePtr = 0L;
        this.mNativePtr = j;
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.mNativePtr == 0) {
        } else {
            _start();
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.mNativePtr == 0) {
        } else {
            _stop();
            this.mNativePtr = 0L;
        }
    }

    public void feedVideoFrameToFrame(int i, byte[] bArr, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1adaab61", new Object[]{this, new Integer(i), bArr, new Integer(i2), new Integer(i3)});
        } else if (this.mNativePtr == 0) {
        } else {
            _feedVideoToFrame(i, bArr, i2, i3);
        }
    }

    public void feedAudioFrameToFrame(int i, byte[] bArr, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("930af4dd", new Object[]{this, new Integer(i), bArr, new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.mNativePtr == 0 || !a.b() || i != 0) {
        } else {
            _feedAudioToFrame(i, bArr, i2, i3, i4);
        }
    }

    public boolean shouldFeedVideoToFrame(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50a1e918", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mNativePtr != 0) {
            return _shouldFeedVideoToFrame(i);
        }
        return false;
    }

    public void setHeartInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe1313", new Object[]{this, new Integer(i)});
        } else if (this.mNativePtr == 0) {
        } else {
            _setHeartInterval(i);
        }
    }

    public void setUserStatMap(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2000f111", new Object[]{this, hashMap});
            return;
        }
        StringBuilder sb = new StringBuilder("");
        for (String str : hashMap.keySet()) {
            sb.append(str + "=" + hashMap.get(str) + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.toString();
        _setUserStatDict(sb.toString());
    }
}
