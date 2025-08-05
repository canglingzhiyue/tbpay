package com.taobao.android.litecreator.sdk.editor.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.media.IVisualMedia;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import tb.kge;

/* loaded from: classes5.dex */
public class Media implements IVisualMedia, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long clipDurationMs;
    public long clipEndTimeUs;
    public Map<String, String> clipExtendInfo;
    public String clipId;
    public long clipStartTimeUs;
    public long durationMs;
    public int height;
    public float isMute;
    public boolean isPlaceHolderClip = true;
    public int mediaId;
    public String mediaType;
    public long originDurationMs;
    public String path;
    public int rotation;
    public long sourceEndTimeUs;
    public long sourceStartTimeUs;
    public String subClipId;
    public String uri;
    public int width;

    static {
        kge.a(-1690166168);
        kge.a(1028243835);
        kge.a(-266725952);
    }

    public int getRotation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c471376e", new Object[]{this})).intValue() : this.rotation;
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4638814", new Object[]{this})).intValue() : com.taobao.android.litecreator.base.media.a.a(this.width, this.height, this.rotation);
    }

    public int getDisplayHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("42401bcd", new Object[]{this})).intValue() : com.taobao.android.litecreator.base.media.a.b(this.width, this.height, this.rotation);
    }

    public int getOriginDisplayWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8df87eda", new Object[]{this})).intValue() : com.taobao.android.litecreator.base.media.a.a(this.width, this.height, this.rotation);
    }

    public int getOriginDisplayHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eb49fdc7", new Object[]{this})).intValue() : com.taobao.android.litecreator.base.media.a.b(this.width, this.height, this.rotation);
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

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        Media media = (Media) obj;
        return getWidth() == media.getWidth() && getHeight() == media.getHeight() && getRotation() == media.getRotation() && this.originDurationMs == media.originDurationMs && this.durationMs == media.durationMs && this.clipDurationMs == media.clipDurationMs && Float.compare(media.isMute, this.isMute) == 0 && this.sourceStartTimeUs == media.sourceStartTimeUs && this.sourceEndTimeUs == media.sourceEndTimeUs && this.clipStartTimeUs == media.clipStartTimeUs && this.clipEndTimeUs == media.clipEndTimeUs && this.isPlaceHolderClip == media.isPlaceHolderClip && this.mediaId == media.mediaId && Objects.equals(this.path, media.path) && TextUtils.equals(this.mediaType, media.mediaType);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.path, Integer.valueOf(this.mediaId), this.mediaType);
    }
}
