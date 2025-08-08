package com.taobao.android.litecreator.sdk.editor.data;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import tb.kge;

/* loaded from: classes5.dex */
public class Canvas extends EditableBean<Canvas> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float EPSILON = 1.0E-5f;
    public String aspectRatioTitle;
    public float aspectRatioX;
    public float aspectRatioY;
    public String bgPath;
    public long height;
    public long width;
    public boolean customizeBg = false;
    public int bgColor = 0;
    public int tid = 0;
    public float xPosition = 0.0f;
    public float yPosition = 0.0f;

    static {
        kge.a(-1145218732);
    }

    public static /* synthetic */ Object ipc$super(Canvas canvas, String str, Object... objArr) {
        if (str.hashCode() == 2025021518) {
            return super.mo940clone();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    /* renamed from: clone */
    public Canvas mo940clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Canvas) ipChange.ipc$dispatch("2598f541", new Object[]{this});
        }
        Canvas canvas = (Canvas) super.mo940clone();
        canvas.aspectRatioX = this.aspectRatioX;
        canvas.aspectRatioY = this.aspectRatioY;
        canvas.aspectRatioTitle = this.aspectRatioTitle;
        canvas.width = this.width;
        canvas.height = this.height;
        canvas.customizeBg = this.customizeBg;
        canvas.bgColor = this.bgColor;
        canvas.xPosition = this.xPosition;
        canvas.yPosition = this.yPosition;
        canvas.bgPath = this.bgPath;
        canvas.tid = this.tid;
        return canvas;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Canvas{ratioX=" + this.aspectRatioX + ", ratioY=" + this.aspectRatioY + ", ratioTitle=" + this.aspectRatioTitle + ", width=" + this.width + ", height=" + this.height + ", customizeBg=" + this.customizeBg + ", bgColor=" + this.bgColor + ", xPosition=" + this.xPosition + ", yPosition=" + this.yPosition + ", bgPath=" + this.bgPath + ", tid=" + this.tid + '}';
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Canvas)) {
            return false;
        }
        Canvas canvas = (Canvas) obj;
        return this.aspectRatioX == canvas.aspectRatioX && this.aspectRatioY == canvas.aspectRatioY && StringUtils.equals(this.aspectRatioTitle, canvas.aspectRatioTitle) && this.width == canvas.width && this.height == canvas.height && this.customizeBg == canvas.customizeBg && this.bgColor == canvas.bgColor && this.xPosition == canvas.xPosition && this.yPosition == canvas.yPosition && StringUtils.equals(this.bgPath, canvas.bgPath) && this.tid == canvas.tid;
    }
}
