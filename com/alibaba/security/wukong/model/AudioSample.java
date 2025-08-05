package com.alibaba.security.wukong.model;

import com.alibaba.security.wukong.model.config.AudioSampleConfig;
import com.alibaba.security.wukong.model.meta.AudioSegment;
import com.alibaba.security.wukong.model.meta.Data;
import com.alibaba.secutiry.mnn.pykit.MNNAudioData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class AudioSample extends CCRCRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AudioSampleConfig audioSampleConfig;
    public final AudioSegment mAudioSegment;

    public AudioSample(String str, AudioSegment audioSegment) {
        super(str);
        this.mAudioSegment = audioSegment;
        getExtras().putAll(audioSegment.getExtras());
    }

    public static /* synthetic */ Object ipc$super(AudioSample audioSample, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AudioSampleConfig getAudioSampleConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioSampleConfig) ipChange.ipc$dispatch("7792f311", new Object[]{this});
        }
        if (this.audioSampleConfig == null) {
            this.audioSampleConfig = new AudioSampleConfig();
        }
        return this.audioSampleConfig;
    }

    public byte[] getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("e6eec916", new Object[]{this}) : this.mAudioSegment.getData();
    }

    public int getLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("33609456", new Object[]{this})).intValue() : this.mAudioSegment.getLength();
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public String getMetaType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3168d9c4", new Object[]{this}) : "audio";
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public Data getRawData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Data) ipChange.ipc$dispatch("b1c4156c", new Object[]{this}) : this.mAudioSegment;
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public long getTs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("31735e70", new Object[]{this})).longValue() : this.mAudioSegment.getTs();
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : super.isValid() && this.mAudioSegment.getData() != null && this.mAudioSegment.getLength() > 0 && getAudioSampleConfig().getChannel() > 0;
    }

    public void setAudioSampleConfig(AudioSampleConfig audioSampleConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc07575", new Object[]{this, audioSampleConfig});
        } else {
            this.audioSampleConfig = audioSampleConfig;
        }
    }

    public void setData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252501ba", new Object[]{this, bArr});
        } else {
            this.mAudioSegment.setData(bArr);
        }
    }

    public void setLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf17de74", new Object[]{this, new Integer(i)});
        } else {
            this.mAudioSegment.setLength(i);
        }
    }

    public MNNAudioData toMNNAudioData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MNNAudioData) ipChange.ipc$dispatch("d98888e1", new Object[]{this});
        }
        MNNAudioData mNNAudioData = new MNNAudioData();
        mNNAudioData.f3628a = getData();
        mNNAudioData.b = getLength();
        return mNNAudioData;
    }

    public AudioSample(String str, Map<String, Object> map, AudioSegment audioSegment) {
        super(str, map);
        this.mAudioSegment = audioSegment;
        getExtras().putAll(audioSegment.getExtras());
    }

    public AudioSample(String str, Map<String, Object> map, byte[] bArr, int i) {
        super(str, map);
        this.mAudioSegment = new AudioSegment(bArr, i);
    }
}
