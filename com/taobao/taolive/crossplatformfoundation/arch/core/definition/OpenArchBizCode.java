package com.taobao.taolive.crossplatformfoundation.arch.core.definition;

import com.taobao.android.weex_framework.util.a;
import kotlin.Metadata;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/definition/OpenArchBizCode;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", a.ATOM_EXT_Undefined, "SingleLiveRoomStandard", "SingleLiveRoomPublic", "SingleLiveRoomShopTab3", "WatchLiveRoomStandard", "WatchLiveRoomPublic", "WatchLiveRoomChanelMixType1", "WatchLiveRoomChanelMixType2", "WatchLiveRoomHomeTab", "WatchLiveRoomGuangGuangTab2Type1", "WatchLiveRoomGuangGuangTab2Type2", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenArchBizCode extends Enum<OpenArchBizCode> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OpenArchBizCode[] $VALUES;
    private final int code;
    public static final OpenArchBizCode Undefined = new OpenArchBizCode(a.ATOM_EXT_Undefined, 0, 0);
    public static final OpenArchBizCode SingleLiveRoomStandard = new OpenArchBizCode("SingleLiveRoomStandard", 1, 16);
    public static final OpenArchBizCode SingleLiveRoomPublic = new OpenArchBizCode("SingleLiveRoomPublic", 2, 17);
    public static final OpenArchBizCode SingleLiveRoomShopTab3 = new OpenArchBizCode("SingleLiveRoomShopTab3", 3, 18);
    public static final OpenArchBizCode WatchLiveRoomStandard = new OpenArchBizCode("WatchLiveRoomStandard", 4, 1);
    public static final OpenArchBizCode WatchLiveRoomPublic = new OpenArchBizCode("WatchLiveRoomPublic", 5, 2);
    public static final OpenArchBizCode WatchLiveRoomChanelMixType1 = new OpenArchBizCode("WatchLiveRoomChanelMixType1", 6, 3);
    public static final OpenArchBizCode WatchLiveRoomChanelMixType2 = new OpenArchBizCode("WatchLiveRoomChanelMixType2", 7, 4);
    public static final OpenArchBizCode WatchLiveRoomHomeTab = new OpenArchBizCode("WatchLiveRoomHomeTab", 8, 5);
    public static final OpenArchBizCode WatchLiveRoomGuangGuangTab2Type1 = new OpenArchBizCode("WatchLiveRoomGuangGuangTab2Type1", 9, 6);
    public static final OpenArchBizCode WatchLiveRoomGuangGuangTab2Type2 = new OpenArchBizCode("WatchLiveRoomGuangGuangTab2Type2", 10, 7);

    private static final /* synthetic */ OpenArchBizCode[] $values() {
        return new OpenArchBizCode[]{Undefined, SingleLiveRoomStandard, SingleLiveRoomPublic, SingleLiveRoomShopTab3, WatchLiveRoomStandard, WatchLiveRoomPublic, WatchLiveRoomChanelMixType1, WatchLiveRoomChanelMixType2, WatchLiveRoomHomeTab, WatchLiveRoomGuangGuangTab2Type1, WatchLiveRoomGuangGuangTab2Type2};
    }

    static {
        OpenArchBizCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OpenArchBizCode(String str, int i, int i2) {
        this.code = i2;
    }

    public static kotlin.enums.a<OpenArchBizCode> getEntries() {
        return $ENTRIES;
    }

    public static OpenArchBizCode valueOf(String str) {
        return (OpenArchBizCode) Enum.valueOf(OpenArchBizCode.class, str);
    }

    public static OpenArchBizCode[] values() {
        return (OpenArchBizCode[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
