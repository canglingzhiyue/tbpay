package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import tb.kge;

/* loaded from: classes5.dex */
public class MediaClips implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isChange;
    public List<String> mediaPaths = new ArrayList();

    static {
        kge.a(-1693828197);
        kge.a(1028243835);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaClips)) {
            return false;
        }
        MediaClips mediaClips = (MediaClips) obj;
        return this.isChange == mediaClips.isChange && Objects.equals(this.mediaPaths, mediaClips.mediaPaths);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.mediaPaths, Boolean.valueOf(this.isChange));
    }
}
