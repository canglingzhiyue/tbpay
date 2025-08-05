package com.alibaba.security.wukong.model.config;

import com.alibaba.security.wukong.model.meta.AudioSegment;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class AudioSampleConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int sampleRate = 16000;
    public int channel = 1;
    public AudioSegment.AudioFormat audioFormat = AudioSegment.AudioFormat.pcm;
    public AudioSegment.AudioEncodingConfig bitWidth = AudioSegment.AudioEncodingConfig.ENCODING_PCM_16BIT;

    public int calDetectBuffer(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8aef363e", new Object[]{this, new Integer(i)})).intValue() : (((this.sampleRate * this.bitWidth.value) * this.channel) / 8) * i;
    }

    public AudioSegment.AudioFormat getAudioFormat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioSegment.AudioFormat) ipChange.ipc$dispatch("d0f90a6b", new Object[]{this}) : this.audioFormat;
    }

    public AudioSegment.AudioEncodingConfig getBitWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioSegment.AudioEncodingConfig) ipChange.ipc$dispatch("383024a5", new Object[]{this}) : this.bitWidth;
    }

    public int getChannel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea1b0ec7", new Object[]{this})).intValue() : this.channel;
    }

    public int getSampleRate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("da7fbe1a", new Object[]{this})).intValue() : this.sampleRate;
    }

    public void setAudioFormat(AudioSegment.AudioFormat audioFormat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e8bd4b", new Object[]{this, audioFormat});
        } else {
            this.audioFormat = audioFormat;
        }
    }

    public void setBitWidth(AudioSegment.AudioEncodingConfig audioEncodingConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d93c7d", new Object[]{this, audioEncodingConfig});
        } else {
            this.bitWidth = audioEncodingConfig;
        }
    }

    public void setChannel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9039bb", new Object[]{this, new Integer(i)});
        } else {
            this.channel = i;
        }
    }

    public void setSampleRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4f1330", new Object[]{this, new Integer(i)});
        } else {
            this.sampleRate = i;
        }
    }
}
