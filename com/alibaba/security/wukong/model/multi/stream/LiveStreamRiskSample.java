package com.alibaba.security.wukong.model.multi.stream;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.AlgoResultSample;
import com.alibaba.security.wukong.model.AudioSample;
import com.alibaba.security.wukong.model.BitmapImageSample;
import com.alibaba.security.wukong.model.ByteImageSample;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.model.TextRiskSample;
import com.alibaba.security.wukong.model.meta.AlgoResult;
import com.alibaba.security.wukong.model.meta.AudioSegment;
import com.alibaba.security.wukong.model.meta.BitmapImage;
import com.alibaba.security.wukong.model.meta.ByteImage;
import com.alibaba.security.wukong.model.meta.Data;
import com.alibaba.security.wukong.model.meta.Text;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* loaded from: classes3.dex */
public class LiveStreamRiskSample extends StreamRiskSample<Data> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public LiveStreamRiskSample(String str) {
        super(str);
    }

    @Override // com.alibaba.security.wukong.model.multi.stream.StreamRiskSample
    public void detect(CcrcService ccrcService, Data data, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f809d078", new Object[]{this, ccrcService, data, new Boolean(z)});
        } else if (data == null) {
        } else {
            String uuid = UUID.randomUUID().toString();
            CCRCRiskSample cCRCRiskSample = null;
            if (data instanceof BitmapImage) {
                cCRCRiskSample = new BitmapImageSample(uuid, (BitmapImage) data);
            }
            if (data instanceof ByteImage) {
                cCRCRiskSample = new ByteImageSample(uuid, (ByteImage) data);
            }
            if (data instanceof AudioSegment) {
                cCRCRiskSample = new AudioSample(uuid, (AudioSegment) data);
            }
            if (data instanceof Text) {
                cCRCRiskSample = new TextRiskSample(uuid, (Text) data);
            }
            if (data instanceof AlgoResult) {
                cCRCRiskSample = new AlgoResultSample(uuid, (AlgoResult) data);
            }
            if (cCRCRiskSample == null) {
                return;
            }
            a(cCRCRiskSample);
            ccrcService.detect(cCRCRiskSample, z);
        }
    }

    @Override // com.alibaba.security.wukong.model.multi.MultiModelRiskSample
    public String type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("426047ff", new Object[]{this}) : "liveStream";
    }
}
