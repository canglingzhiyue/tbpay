package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class Image extends Media implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean hasCrop;
    private boolean hasPreCrop;
    private int heightAfterCrop;
    private boolean isCropFinished;
    private float preCropRatio;
    private int widthAfterCrop;

    static {
        kge.a(-1693624865);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(Image image, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 73631764) {
            if (hashCode != 1111497677) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Integer(super.getDisplayHeight());
        }
        return new Integer(super.getDisplayWidth());
    }

    public boolean isCropFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff242ff7", new Object[]{this})).booleanValue() : this.isCropFinished;
    }

    public void setCropFinished(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80fe2909", new Object[]{this, new Boolean(z)});
        } else {
            this.isCropFinished = z;
        }
    }

    public boolean hasCrop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("299933d5", new Object[]{this})).booleanValue() : this.hasCrop;
    }

    public boolean hasPreCrop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7d78be4", new Object[]{this})).booleanValue() : this.hasPreCrop;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.Media
    public int getDisplayWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4638814", new Object[]{this})).intValue() : this.hasCrop ? this.widthAfterCrop : super.getDisplayWidth();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.Media
    public int getDisplayHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("42401bcd", new Object[]{this})).intValue() : this.hasCrop ? this.heightAfterCrop : super.getDisplayHeight();
    }

    public void setCropInfo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27a6107", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.hasCrop = true;
        this.widthAfterCrop = i;
        this.heightAfterCrop = i2;
    }

    public void setPreCropInfo(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22932e1a", new Object[]{this, new Float(f)});
            return;
        }
        this.hasPreCrop = true;
        this.preCropRatio = f;
    }

    public float preCropInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("27f59b18", new Object[]{this})).floatValue() : this.preCropRatio;
    }
}
