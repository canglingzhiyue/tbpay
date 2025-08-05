package com.taobao.taolive.crossplatformfoundation.arch.core.service.playcontrol.listener;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/listener/MediaEventType;", "", "<init>", "(Ljava/lang/String;I)V", "MEDIA_NOP", "MEDIA_PREPARED", "MEDIA_PLAYBACK_COMPLETE", "MEDIA_BUFFERING_UPDATE", "MEDIA_SEEK_COMPLETE", "MEDIA_SET_VIDEO_SIZE", "MEDIA_TIMED_TEXT", "MEDIA_ERROR", "MEDIA_INFO", "MEDIA_SEEK_START", "MEDIA_SET_VIDEO_SAR", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MediaEventType extends Enum<MediaEventType> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MediaEventType[] $VALUES;
    public static final MediaEventType MEDIA_NOP = new MediaEventType("MEDIA_NOP", 0);
    public static final MediaEventType MEDIA_PREPARED = new MediaEventType("MEDIA_PREPARED", 1);
    public static final MediaEventType MEDIA_PLAYBACK_COMPLETE = new MediaEventType("MEDIA_PLAYBACK_COMPLETE", 2);
    public static final MediaEventType MEDIA_BUFFERING_UPDATE = new MediaEventType("MEDIA_BUFFERING_UPDATE", 3);
    public static final MediaEventType MEDIA_SEEK_COMPLETE = new MediaEventType("MEDIA_SEEK_COMPLETE", 4);
    public static final MediaEventType MEDIA_SET_VIDEO_SIZE = new MediaEventType("MEDIA_SET_VIDEO_SIZE", 5);
    public static final MediaEventType MEDIA_TIMED_TEXT = new MediaEventType("MEDIA_TIMED_TEXT", 6);
    public static final MediaEventType MEDIA_ERROR = new MediaEventType("MEDIA_ERROR", 7);
    public static final MediaEventType MEDIA_INFO = new MediaEventType("MEDIA_INFO", 8);
    public static final MediaEventType MEDIA_SEEK_START = new MediaEventType("MEDIA_SEEK_START", 9);
    public static final MediaEventType MEDIA_SET_VIDEO_SAR = new MediaEventType("MEDIA_SET_VIDEO_SAR", 10);

    private static final /* synthetic */ MediaEventType[] $values() {
        return new MediaEventType[]{MEDIA_NOP, MEDIA_PREPARED, MEDIA_PLAYBACK_COMPLETE, MEDIA_BUFFERING_UPDATE, MEDIA_SEEK_COMPLETE, MEDIA_SET_VIDEO_SIZE, MEDIA_TIMED_TEXT, MEDIA_ERROR, MEDIA_INFO, MEDIA_SEEK_START, MEDIA_SET_VIDEO_SAR};
    }

    static {
        MediaEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private MediaEventType(String str, int i) {
    }

    public static a<MediaEventType> getEntries() {
        return $ENTRIES;
    }

    public static MediaEventType valueOf(String str) {
        return (MediaEventType) Enum.valueOf(MediaEventType.class, str);
    }

    public static MediaEventType[] values() {
        return (MediaEventType[]) $VALUES.clone();
    }
}
