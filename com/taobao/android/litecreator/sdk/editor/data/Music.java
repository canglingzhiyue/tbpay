package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Objects;
import tb.kge;

/* loaded from: classes5.dex */
public class Music extends EditableBean<Music> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String audioId;
    public String coverUrl;
    public long endClipTime;
    public boolean isAlgorithm;
    public String loadFrom;
    public String musicClipId;
    public String musicId;
    public int musicVendorType;
    public String name;
    public String path;
    public String position;
    public String soundId;
    public long startClipTime;
    public String utLog;
    public float volume;
    public String wavePath;
    public long duration;
    public long cutDuration = this.duration;

    static {
        kge.a(-1689675095);
    }

    public static /* synthetic */ Object ipc$super(Music music, String str, Object... objArr) {
        if (str.hashCode() == 1403628309) {
            return new Integer(super.hashCode());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public String uniqueId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f0df81ad", new Object[]{this}) : com.taobao.android.litecreator.base.media.a.a(this.musicId, this.audioId, this.soundId);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Music{musicId=" + this.musicId + "audioId=" + this.audioId + ", path=" + this.path + ", startClipTime=" + this.startClipTime + ", endClipTime=" + this.endClipTime + ", volume=" + this.volume + ", coverUrl=" + this.coverUrl + ", loadFrom=" + this.loadFrom + ", position=" + this.position + ", utLog=" + this.utLog + ", isAlgorithm=" + this.isAlgorithm + '}';
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
        if (!(obj instanceof Music)) {
            return false;
        }
        Music music = (Music) obj;
        return this.musicVendorType == music.musicVendorType && this.duration == music.duration && this.cutDuration == music.cutDuration && this.startClipTime == music.startClipTime && this.endClipTime == music.endClipTime && Float.compare(music.volume, this.volume) == 0 && Objects.equals(this.musicId, music.musicId) && Objects.equals(this.audioId, music.audioId) && Objects.equals(this.name, music.name) && Objects.equals(this.coverUrl, music.coverUrl);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(super.hashCode()), this.musicId, this.audioId, Integer.valueOf(this.musicVendorType), this.name, Long.valueOf(this.duration), Long.valueOf(this.cutDuration), Long.valueOf(this.startClipTime), Long.valueOf(this.endClipTime), Float.valueOf(this.volume));
    }
}
