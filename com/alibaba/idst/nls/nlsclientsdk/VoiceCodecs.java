package com.alibaba.idst.nls.nlsclientsdk;

import com.alibaba.idst.nls.nlsclientsdk.util.OpusCodec;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class VoiceCodecs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String TAG = null;
    public static final int WAVE_FRAM_SIZE = 320;
    private static VoiceCodecs instance;
    private OpusCodec mOupsCodec;

    static {
        kge.a(1560426438);
        TAG = "AliSpeechWSClient-VoiceCodecs";
        instance = null;
    }

    public static VoiceCodecs getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VoiceCodecs) ipChange.ipc$dispatch("454a8c3d", new Object[0]);
        }
        if (instance == null) {
            instance = new VoiceCodecs();
        }
        return instance;
    }

    private VoiceCodecs() {
        this.mOupsCodec = null;
        this.mOupsCodec = new OpusCodec();
    }

    public boolean open(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5955f727", new Object[]{this, new Boolean(z)})).booleanValue() : this.mOupsCodec.open(z);
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.mOupsCodec.close();
        }
    }

    public int bufferFrame(short[] sArr, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("be57bc66", new Object[]{this, sArr, bArr})).intValue() : this.mOupsCodec.encodec(sArr, 0, 320, bArr);
    }
}
