package com.taobao.taolive.crossplatformfoundation.arch.core.service.playcontrol.context;

import com.taobao.android.weex_framework.util.a;
import kotlin.Metadata;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\n\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/playcontrol/context/PlayControlStreamType;", "", "code", "", "<init>", "(Ljava/lang/String;IS)V", "getCode", "()S", a.ATOM_EXT_Undefined, "VideoOnDemand", "Live", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlayControlStreamType extends Enum<PlayControlStreamType> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ PlayControlStreamType[] $VALUES;
    private final short code;
    public static final PlayControlStreamType Undefined = new PlayControlStreamType(a.ATOM_EXT_Undefined, 0, 0);
    public static final PlayControlStreamType VideoOnDemand = new PlayControlStreamType("VideoOnDemand", 1, 1);
    public static final PlayControlStreamType Live = new PlayControlStreamType("Live", 2, 2);

    private static final /* synthetic */ PlayControlStreamType[] $values() {
        return new PlayControlStreamType[]{Undefined, VideoOnDemand, Live};
    }

    static {
        PlayControlStreamType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PlayControlStreamType(String str, int i, short s) {
        this.code = s;
    }

    public static kotlin.enums.a<PlayControlStreamType> getEntries() {
        return $ENTRIES;
    }

    public static PlayControlStreamType valueOf(String str) {
        return (PlayControlStreamType) Enum.valueOf(PlayControlStreamType.class, str);
    }

    public static PlayControlStreamType[] values() {
        return (PlayControlStreamType[]) $VALUES.clone();
    }

    public final short getCode() {
        return this.code;
    }
}
