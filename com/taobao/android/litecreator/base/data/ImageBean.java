package com.taobao.android.litecreator.base.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.media.IVisualMedia;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class ImageBean extends FileBean implements IVisualMedia, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int height;
    public int rotate;
    public int width;

    static {
        kge.a(1946186080);
        kge.a(1028243835);
        kge.a(-266725952);
    }

    public int getRotation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c471376e", new Object[]{this})).intValue() : this.rotate;
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : this.width;
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : this.height;
    }

    public int getDisplayWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4638814", new Object[]{this})).intValue() : com.taobao.android.litecreator.base.media.a.a(this.width, this.height, this.rotate);
    }

    public int getDisplayHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("42401bcd", new Object[]{this})).intValue() : com.taobao.android.litecreator.base.media.a.b(this.width, this.height, this.rotate);
    }

    public int getOriginDisplayWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8df87eda", new Object[]{this})).intValue() : getDisplayWidth();
    }

    public int getOriginDisplayHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eb49fdc7", new Object[]{this})).intValue() : getDisplayHeight();
    }

    public float ratio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("147cd702", new Object[]{this})).floatValue();
        }
        int displayWidth = getDisplayWidth();
        int displayHeight = getDisplayHeight();
        if (displayHeight != 0) {
            return displayWidth / displayHeight;
        }
        return Float.MAX_VALUE;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ImageBean{width=" + this.width + ", height=" + this.height + ", rotate=" + this.rotate + ", type=" + this.type + ", id=" + this.id + ", uri='" + this.uri + "', mimeType='" + this.mimeType + "', path='" + this.path + "'}";
    }
}
