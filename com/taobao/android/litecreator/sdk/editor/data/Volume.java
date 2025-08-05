package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Objects;
import tb.kge;

/* loaded from: classes5.dex */
public class Volume extends EditableBean<Volume> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static float DEFAULT_VOLUME_VALUE;
    public static float MUTE_VOLUME_VALUE;
    public float musicVolume;
    public float originScaleValue;
    public float originVolume;

    public static /* synthetic */ Object ipc$super(Volume volume, String str, Object... objArr) {
        if (str.hashCode() == 1403628309) {
            return new Integer(super.hashCode());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public Volume() {
        float f = DEFAULT_VOLUME_VALUE;
        this.originVolume = f;
        this.musicVolume = f;
        this.originScaleValue = 1.0f;
    }

    static {
        kge.a(-588395754);
        DEFAULT_VOLUME_VALUE = 1.0f;
        MUTE_VOLUME_VALUE = 0.0f;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Volume{originVolume=" + this.originVolume + ", musicVolume=" + this.musicVolume + '}';
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
        if (!(obj instanceof Volume)) {
            return false;
        }
        Volume volume = (Volume) obj;
        return Float.compare(volume.originVolume, this.originVolume) == 0 && Float.compare(volume.musicVolume, this.musicVolume) == 0;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(super.hashCode()), Float.valueOf(this.originVolume), Float.valueOf(this.musicVolume));
    }
}
