package com.alibaba.security.wukong.model.meta;

import android.graphics.Bitmap;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class BitmapImage extends Image {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(serialize = false)
    public Bitmap bitmap;

    public BitmapImage(Bitmap bitmap) {
        super(System.currentTimeMillis());
        this.bitmap = bitmap;
    }

    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this}) : this.bitmap;
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public Map<String, Object> getRawMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49177706", new Object[]{this});
        }
        return null;
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public int length() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getRowBytes();
    }

    public void setBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61407cf6", new Object[]{this, bitmap});
        } else {
            this.bitmap = bitmap;
        }
    }

    public BitmapImage(Bitmap bitmap, long j) {
        super(j);
        this.bitmap = bitmap;
    }
}
