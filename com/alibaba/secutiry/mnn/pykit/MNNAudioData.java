package com.alibaba.secutiry.mnn.pykit;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPythonJavaToPythonCallback;

/* loaded from: classes3.dex */
public class MNNAudioData implements AliNNPythonJavaToPythonCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MNNAudioData";

    /* renamed from: a  reason: collision with root package name */
    public byte[] f3628a;
    public int b;

    public static native long nativeConvertToPythonObj(byte[] bArr, int i);

    @Override // com.taobao.android.alinnpython.AliNNPythonJavaToPythonCallback
    public long javaToPython() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2470f74", new Object[]{this})).longValue() : nativeConvertToPythonObj(this.f3628a, this.b);
    }
}
