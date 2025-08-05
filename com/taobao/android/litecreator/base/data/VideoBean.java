package com.taobao.android.litecreator.base.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.media.IVisualMedia;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public final class VideoBean extends FileBean implements IVisualMedia, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VIDEO_RATIO_4_3 = 16;
    public static final int VIDEO_RATIO_OTHERS = 128;
    public static final int VIDEO_RATIO_OVER_16_9 = 32;
    public static final int VIDEO_RATIO_OVER_9_16 = 64;
    public final HashMap<String, Serializable> attach = new HashMap<>();
    public int bitRate;
    public ImageBean cover;
    public long duration;
    public String fileId;
    public long fileSize;
    public float framerate;
    public int height;
    public boolean notSupportEdit;
    public int ratioType;
    public int rotate;
    public int width;

    /* loaded from: classes5.dex */
    public @interface RatioType {
    }

    static {
        kge.a(-137671552);
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

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VideoBean{attach=" + this.attach + ", width=" + this.width + ", fileSize=" + this.fileSize + ", height=" + this.height + ", framerate=" + this.framerate + ", bitRate=" + this.bitRate + ", rotate=" + this.rotate + ", duration=" + this.duration + ", cover=" + this.cover + ", ratioType=" + this.ratioType + ", type=" + this.type + ", id=" + this.id + ", uri='" + this.uri + "', mimeType='" + this.mimeType + "', path='" + this.path + "', fileId=" + this.fileId + "'}";
    }
}
