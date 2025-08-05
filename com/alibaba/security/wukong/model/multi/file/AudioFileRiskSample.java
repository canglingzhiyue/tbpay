package com.alibaba.security.wukong.model.multi.file;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.Rb;
import com.alibaba.security.wukong.model.config.AudioSampleConfig;
import com.alibaba.security.wukong.model.multi.file.FileRiskSample;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AudioFileRiskSample extends FileRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String f = "AudioFileRiskSample";
    public Rb audioFileRiskSamplePre;
    public AudioSampleConfig audioSampleConfig;
    public String filePath;
    public int oneDetectAudioTime;

    public AudioFileRiskSample(String str, String str2) {
        super(str);
        this.oneDetectAudioTime = 10;
        this.filePath = str2;
        this.audioFileRiskSamplePre = new Rb();
    }

    @Override // com.alibaba.security.wukong.model.multi.file.FileRiskSample
    public void detect(CcrcService ccrcService, FileRiskSample.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb4a5a9", new Object[]{this, ccrcService, callback});
            return;
        }
        this.audioFileRiskSamplePre.a(callback);
        this.audioFileRiskSamplePre.a(ccrcService, this);
    }

    public AudioSampleConfig getAudioSampleConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioSampleConfig) ipChange.ipc$dispatch("7792f311", new Object[]{this}) : this.audioSampleConfig;
    }

    public String getFilePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this}) : this.filePath;
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

    public void setFilePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8812494", new Object[]{this, str});
        } else {
            this.filePath = str;
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

    @Override // com.alibaba.security.wukong.model.multi.file.FileRiskSample, com.alibaba.security.wukong.model.multi.MultiModelRiskSample
    public String type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("426047ff", new Object[]{this}) : "audioFile";
    }
}
