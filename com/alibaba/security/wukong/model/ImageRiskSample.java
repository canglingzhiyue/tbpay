package com.alibaba.security.wukong.model;

import com.alibaba.security.wukong.model.meta.Data;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCVImage;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ImageRiskSample extends CCRCRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ImageRiskSample(String str) {
        super(str);
    }

    public abstract int getHeight();

    public Map<String, Object> getImageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8297f5af", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("image_width", Integer.valueOf(getWidth()));
        hashMap.put("image_height", Integer.valueOf(getHeight()));
        hashMap.put("image_format", Integer.valueOf(getMNNCVImageFormat()));
        return hashMap;
    }

    public abstract int getMNNCVImageFormat();

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public String getMetaType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3168d9c4", new Object[]{this}) : "image";
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public abstract Data getRawData();

    public abstract int getWidth();

    public abstract MNNCVImage toMNNCVImage();

    public ImageRiskSample(String str, Map<String, Object> map) {
        super(str, map);
    }
}
