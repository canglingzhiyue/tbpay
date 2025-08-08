package com.taobao.android.litecreator.sdk.editor.data;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.AbsEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import com.taobao.android.litecreator.util.u;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import tb.kge;

/* loaded from: classes5.dex */
public class VideoEditInfo extends AbsEditInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SOURCE_TITLE;
    public static final String TAG = "VideoEditInfo";
    public AiQuality aiQuality;
    public Beauty beauty;
    public Cut cut;
    public Filter filter;
    public boolean isInputMusic;
    public List<RichLabel> labels;
    public MediaClips mediaClips;
    public List<? extends Media> medias;
    public Music music;
    public List<Paster> pasters;
    public Sticker sticker;
    public Template template;
    public transient Video video;
    public long videoOriginDurationUs;
    public Volume volume;

    public static /* synthetic */ Object ipc$super(VideoEditInfo videoEditInfo, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(545253367);
        kge.a(1028243835);
        SOURCE_TITLE = b.a(R.string.gg_pub_original);
    }

    public boolean isEdited() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("12be64fe", new Object[]{this})).booleanValue() : isFilterChange() || isCutTimeChange() || isCutCanvasChange() || isMusicChange() || isStickerChange() || isVolumeChange() || isMediaClipChange() || isPasterChange() || isTemplateChange() || isMediasChange() || isAiQualityChange() || isBeautyChange();
    }

    private boolean isAiQualityChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba8b9c8", new Object[]{this})).booleanValue();
        }
        AiQuality aiQuality = this.aiQuality;
        return aiQuality != null && aiQuality.enable;
    }

    public void setMedias(List<Media> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e95509", new Object[]{this, list});
        } else {
            this.medias = list;
        }
    }

    public boolean isMediasChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbae9ff4", new Object[]{this})).booleanValue();
        }
        List<? extends Media> list = this.medias;
        return list != null && list.size() > 1;
    }

    public boolean isEditedWithoutTemplateChange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3a8888a", new Object[]{this})).booleanValue() : isFilterChange() || isCutTimeChange() || isCutCanvasChange() || isSetMusic() || isStickerChange() || isVolumeChange() || isMediaClipChange() || isPasterChange() || isAiQualityChange() || isBeautyChange();
    }

    private boolean isMediaClipChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b57a3f25", new Object[]{this})).booleanValue();
        }
        MediaClips mediaClips = this.mediaClips;
        return mediaClips != null && mediaClips.isChange;
    }

    private boolean isTemplateChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee84ab1f", new Object[]{this})).booleanValue();
        }
        Template template = this.template;
        return template != null && !StringUtils.isEmpty(template.tid);
    }

    public boolean isOnlyTimeRangeChange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5ea6af5", new Object[]{this})).booleanValue() : isCutTimeChange() && !isCutCanvasChange() && !isMusicChange() && !isStickerChange() && !isFilterChange() && !isVolumeChange() && !isPasterChange() && !isMediasChange() && !isAiQualityChange() && !isBeautyChange();
    }

    private boolean isFilterChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1090af1d", new Object[]{this})).booleanValue();
        }
        boolean z = this.filter != null;
        u.b(TAG, "isFilterChange: " + z + " " + this.filter);
        return z;
    }

    private boolean isBeautyChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2807f21", new Object[]{this})).booleanValue();
        }
        boolean z = this.beauty != null;
        u.b(TAG, "isFilterChange: " + z + " " + this.filter);
        return z;
    }

    public boolean isCutTimeChange() {
        Cut cut;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("810531c0", new Object[]{this})).booleanValue();
        }
        boolean z = (this.video == null || (cut = this.cut) == null || cut.getDuration() >= this.videoOriginDurationUs) ? false : true;
        u.b(TAG, "isCutTimeChange: " + z);
        return z;
    }

    private boolean isCutCanvasChange() {
        Cut cut;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47678c8b", new Object[]{this})).booleanValue();
        }
        boolean z = (this.video == null || (cut = this.cut) == null || cut.canvas == null || (SOURCE_TITLE.equalsIgnoreCase(this.cut.canvas.aspectRatioTitle) && !this.cut.canvas.customizeBg)) ? false : true;
        u.b(TAG, "isCutCanvasChange: " + z);
        return z;
    }

    private boolean isMusicChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8465d1b6", new Object[]{this})).booleanValue();
        }
        boolean z = this.music != null || this.isInputMusic;
        u.b(TAG, "isMusicChange: " + z + " " + this.music);
        return z;
    }

    private boolean isSetMusic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("458efc38", new Object[]{this})).booleanValue();
        }
        boolean z = this.music != null;
        u.b(TAG, "isMusicChange: " + z + " " + this.music);
        return z;
    }

    private boolean isStickerChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38b8694e", new Object[]{this})).booleanValue();
        }
        boolean z = this.sticker != null;
        u.b(TAG, "isStickerChange: " + z + " " + this.sticker);
        return z;
    }

    private boolean isPasterChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e788b24", new Object[]{this})).booleanValue();
        }
        List<Paster> list = this.pasters;
        boolean z = list != null && list.size() > 0;
        u.b(TAG, "isPasterChange: " + z + " " + this.pasters);
        return z;
    }

    private boolean isVolumeChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e146283f", new Object[]{this})).booleanValue();
        }
        Volume volume = this.volume;
        boolean z = (volume == null || (volume.originVolume == Volume.DEFAULT_VOLUME_VALUE && this.volume.musicVolume == Volume.DEFAULT_VOLUME_VALUE)) ? false : true;
        u.b(TAG, "isVolumeChange: " + z + "" + this.volume);
        return z;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.AbsEditInfo
    public String toJSONString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this}) : JSON.toJSONString(this);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VideoEditInfo videoEditInfo = (VideoEditInfo) obj;
            if (Objects.equals(this.cut, videoEditInfo.cut) && Objects.equals(this.filter, videoEditInfo.filter) && Objects.equals(this.music, videoEditInfo.music) && Objects.equals(this.volume, videoEditInfo.volume) && Objects.equals(this.sticker, videoEditInfo.sticker) && Objects.equals(this.labels, videoEditInfo.labels) && Objects.equals(this.mediaClips, videoEditInfo.mediaClips) && Objects.equals(this.template, videoEditInfo.template) && Objects.equals(this.medias, videoEditInfo.medias) && Objects.equals(this.aiQuality, videoEditInfo.aiQuality) && isPasterEquals(videoEditInfo)) {
                return true;
            }
        }
        return false;
    }

    private boolean isPasterEquals(VideoEditInfo videoEditInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9157c8b", new Object[]{this, videoEditInfo})).booleanValue();
        }
        if (videoEditInfo.pasters == null && this.pasters == null) {
            return true;
        }
        List<Paster> list = videoEditInfo.pasters;
        if (list == null || this.pasters == null) {
            return false;
        }
        if (!(list.size() == this.pasters.size())) {
            return false;
        }
        int size = this.pasters.size();
        for (int i = 0; i < size; i++) {
            if (!this.pasters.get(i).isSameAs(videoEditInfo.pasters.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.cut, this.filter, this.music, this.volume, this.sticker, this.labels, this.aiQuality);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VideoEditInfo{cut=" + this.cut + ", filter=" + this.filter + ", music=" + this.music + ", volume=" + this.volume + ", sticker=" + this.sticker + ", isInputMusic=" + this.isInputMusic + ", videoDurationUs=" + this.videoOriginDurationUs + ", video=" + this.video + ", labels=" + this.labels + ", pasters=" + this.pasters + ", mediaClips=" + this.mediaClips + ", template=" + this.template + ", aiquality=" + this.aiQuality + '}';
    }

    public boolean isEditedForCanExitDirectly() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("792f4339", new Object[]{this})).booleanValue() : isFilterChange() || isCutTimeChange() || isCutCanvasChange() || isMusicChange() || isStickerChange() || isVolumeChange() || isMediaClipChange() || isPasterChange() || isTemplateChange() || isMediasChange();
    }
}
