package com.alibaba.security.wukong.model.multi.stream;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.Sb;
import com.alibaba.security.wukong.model.config.AudioSampleConfig;
import com.alibaba.security.wukong.model.meta.AudioSegment;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AudioStreamRiskSample extends StreamRiskSample<AudioSegment> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AudioSampleConfig audioSampleConfig;
    public Sb audioStreamRiskSamplePre;
    public int oneDetectAudioTime;

    public AudioStreamRiskSample(String str) {
        super(str);
        this.oneDetectAudioTime = 10;
        this.audioSampleConfig = new AudioSampleConfig();
        this.audioStreamRiskSamplePre = new Sb();
    }

    public AudioSampleConfig getAudioSampleConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioSampleConfig) ipChange.ipc$dispatch("7792f311", new Object[]{this}) : this.audioSampleConfig;
    }

    public int getOneDetectAudioTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9d98d78a", new Object[]{this})).intValue() : this.oneDetectAudioTime;
    }

    public void setAudioSampleConfig(AudioSampleConfig audioSampleConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc07575", new Object[]{this, audioSampleConfig});
        } else {
            this.audioSampleConfig = audioSampleConfig;
        }
    }

    public void setOneDetectAudioTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb273c0", new Object[]{this, new Integer(i)});
        } else {
            this.oneDetectAudioTime = i;
        }
    }

    @Override // com.alibaba.security.wukong.model.multi.MultiModelRiskSample
    public String type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("426047ff", new Object[]{this}) : "audioStream";
    }

    @Override // com.alibaba.security.wukong.model.multi.stream.StreamRiskSample
    public void detect(CcrcService ccrcService, AudioSegment audioSegment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23781bcb", new Object[]{this, ccrcService, audioSegment, new Boolean(z)});
            return;
        }
        this.audioStreamRiskSamplePre.a(z);
        this.audioStreamRiskSamplePre.a(ccrcService, this, audioSegment);
    }
}
