package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.AudioSample;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.model.meta.AudioSegment;
import com.alibaba.security.wukong.model.multi.stream.AudioStreamRiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* loaded from: classes3.dex */
public class Sb extends Wb<AudioStreamRiskSample, AudioSegment> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int c = -1;
    public byte[] d;
    public int e;

    public static /* synthetic */ Object ipc$super(Sb sb, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.ccrc.service.build.Wb
    public void a(CcrcService ccrcService, AudioStreamRiskSample audioStreamRiskSample, AudioSegment audioSegment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e03bb3a", new Object[]{this, ccrcService, audioStreamRiskSample, audioSegment});
        } else if (audioSegment != null && audioSegment.getData() != null && audioSegment.getLength() > 0) {
            if (this.c == -1) {
                this.c = a(audioStreamRiskSample);
                this.d = new byte[this.c];
                this.e = 0;
            }
            if (audioSegment.getLength() + this.e < this.c) {
                a(audioSegment);
            } else if (audioSegment.getLength() + this.e == this.c) {
                a(audioSegment);
                a(ccrcService, audioStreamRiskSample);
                a();
            } else if (audioSegment.getLength() + this.e <= this.c) {
            } else {
                a(ccrcService, audioStreamRiskSample);
                a();
                a(audioSegment);
            }
        } else {
            a(ccrcService, "audio data is null", (String) audioStreamRiskSample);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.e = 0;
        }
    }

    private void a(CcrcService ccrcService, AudioStreamRiskSample audioStreamRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4537b64c", new Object[]{this, ccrcService, audioStreamRiskSample});
            return;
        }
        byte[] bArr = this.d;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, this.e);
        AudioSegment audioSegment = new AudioSegment(bArr2, this.e);
        AudioSample audioSample = new AudioSample(audioStreamRiskSample.getSampleId() + "_" + audioStreamRiskSample.type() + "_" + UUID.randomUUID().toString(), audioSegment);
        audioSample.setAudioSampleConfig(audioStreamRiskSample.getAudioSampleConfig());
        a((Sb) audioStreamRiskSample, (CCRCRiskSample) audioSample);
        a(ccrcService, audioSample);
    }

    private void a(AudioSegment audioSegment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd569e9e", new Object[]{this, audioSegment});
            return;
        }
        System.arraycopy(audioSegment.getData(), 0, this.d, this.e, audioSegment.getLength());
        this.e = audioSegment.getLength() + this.e;
    }

    private int a(AudioStreamRiskSample audioStreamRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90136c68", new Object[]{this, audioStreamRiskSample})).intValue() : audioStreamRiskSample.getAudioSampleConfig().calDetectBuffer(audioStreamRiskSample.getOneDetectAudioTime());
    }
}
