package com.alibaba.security.wukong.model.multi.stream;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.BitmapImageSample;
import com.alibaba.security.wukong.model.ByteImageSample;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.model.meta.BitmapImage;
import com.alibaba.security.wukong.model.meta.ByteImage;
import com.alibaba.security.wukong.model.meta.Image;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* loaded from: classes3.dex */
public class ImageStreamRiskSample extends StreamRiskSample<Image> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ImageStreamRiskSample(String str) {
        super(str);
    }

    @Override // com.alibaba.security.wukong.model.multi.MultiModelRiskSample
    public String type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("426047ff", new Object[]{this}) : "imageStream";
    }

    @Override // com.alibaba.security.wukong.model.multi.stream.StreamRiskSample
    public void detect(CcrcService ccrcService, Image image, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7da865", new Object[]{this, ccrcService, image, new Boolean(z)});
        } else if (image == null) {
        } else {
            CCRCRiskSample cCRCRiskSample = null;
            String uuid = UUID.randomUUID().toString();
            if (image instanceof ByteImage) {
                cCRCRiskSample = new ByteImageSample(uuid, (ByteImage) image);
            }
            if (image instanceof BitmapImage) {
                cCRCRiskSample = new BitmapImageSample(uuid, (BitmapImage) image);
            }
            if (cCRCRiskSample == null) {
                return;
            }
            a(cCRCRiskSample);
            ccrcService.detect(cCRCRiskSample, z);
        }
    }
}
