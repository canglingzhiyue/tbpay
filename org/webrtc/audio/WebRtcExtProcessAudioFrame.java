package org.webrtc.audio;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import org.webrtc.RefCounted;
import tb.kge;

/* loaded from: classes9.dex */
public class WebRtcExtProcessAudioFrame implements RefCounted {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_OBSERVER = 0;
    public static final int TYPE_PLAYER = 2;
    public static final int TYPE_PROCESSOR = 1;
    private final ByteBuffer audioData;
    private final int audioLevel;
    private final int channels;
    private final boolean isSpeech;
    private final int rms_db;
    private final int samplePerChannel;
    private final int sampleRate;
    private final int type;

    static {
        kge.a(101206530);
        kge.a(211517522);
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e496b0c", new Object[]{this});
        }
    }

    public WebRtcExtProcessAudioFrame(int i, int i2, int i3, int i4, boolean z, ByteBuffer byteBuffer, int i5, int i6) {
        this.sampleRate = i;
        this.channels = i2;
        this.samplePerChannel = i3;
        this.audioLevel = i4;
        this.isSpeech = z;
        this.audioData = byteBuffer;
        this.type = i5;
        this.rms_db = i6;
        retain();
    }

    public int getSampleRate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("da7fbe1a", new Object[]{this})).intValue() : this.sampleRate;
    }

    public int getChannels() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5d15d2c0", new Object[]{this})).intValue() : this.channels;
    }

    public int getSamplePerChannel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d261a760", new Object[]{this})).intValue() : this.samplePerChannel;
    }

    public int getAudioLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9934ffbe", new Object[]{this})).intValue() : this.audioLevel;
    }

    public int getAudioDb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d97d3838", new Object[]{this})).intValue() : this.rms_db;
    }

    public boolean isSpeech() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5c44937", new Object[]{this})).booleanValue() : this.isSpeech;
    }

    public ByteBuffer getAudioData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("5366e032", new Object[]{this}) : this.audioData.slice();
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.type;
    }
}
