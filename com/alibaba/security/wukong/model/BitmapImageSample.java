package com.alibaba.security.wukong.model;

import android.graphics.Bitmap;
import com.alibaba.security.wukong.model.meta.BitmapImage;
import com.alibaba.security.wukong.model.meta.Data;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.core.MNNCVImageFormat;
import com.taobao.android.mnncv.MNNCVImage;
import java.util.Map;

/* loaded from: classes3.dex */
public class BitmapImageSample extends ImageRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final BitmapImage image;

    public BitmapImageSample(String str, Bitmap bitmap) {
        super(str);
        this.image = new BitmapImage(bitmap);
    }

    public static /* synthetic */ Object ipc$super(BitmapImageSample bitmapImageSample, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this}) : this.image.getBitmap();
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        BitmapImage bitmapImage = this.image;
        if (bitmapImage == null) {
            return 0;
        }
        return bitmapImage.getHeight();
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample
    public int getMNNCVImageFormat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4aec84e2", new Object[]{this})).intValue() : MNNCVImageFormat.BGRA.format;
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample, com.alibaba.security.wukong.model.CCRCRiskSample
    public Data getRawData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Data) ipChange.ipc$dispatch("b1c4156c", new Object[]{this}) : this.image;
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public long getTs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("31735e70", new Object[]{this})).longValue() : this.image.getTs();
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        BitmapImage bitmapImage = this.image;
        if (bitmapImage == null) {
            return 0;
        }
        return bitmapImage.getWidth();
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public boolean isValid() {
        BitmapImage bitmapImage;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : (!super.isValid() || (bitmapImage = this.image) == null || bitmapImage.getBitmap() == null) ? false : true;
    }

    public void setBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61407cf6", new Object[]{this, bitmap});
        } else {
            this.image.setBitmap(bitmap);
        }
    }

    @Override // com.alibaba.security.wukong.model.ImageRiskSample
    public MNNCVImage toMNNCVImage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MNNCVImage) ipChange.ipc$dispatch("9b73a671", new Object[]{this}) : new MNNCVImage(this.image.getBitmap());
    }

    public BitmapImageSample(String str, BitmapImage bitmapImage) {
        super(str);
        this.image = bitmapImage;
        getExtras().putAll(bitmapImage.getExtras());
    }

    public BitmapImageSample(String str, Map<String, Object> map, BitmapImage bitmapImage) {
        super(str, map);
        this.image = bitmapImage;
        getExtras().putAll(bitmapImage.getExtras());
    }
}
