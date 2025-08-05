package com.taobao.message.uikit.media.image;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class ImageInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String normalPath;
    public int origHeight;
    public String origPath;
    public int origWidth;
    public String other;
    public String previewPath;
    public String type;

    static {
        kge.a(823138562);
    }

    public void copy(ImageInfo imageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ad15e9", new Object[]{this, imageInfo});
            return;
        }
        this.previewPath = imageInfo.previewPath;
        this.normalPath = imageInfo.normalPath;
        this.origPath = imageInfo.origPath;
        this.origWidth = imageInfo.origWidth;
        this.origHeight = imageInfo.origHeight;
        this.other = imageInfo.other;
    }
}
