package com.taobao.taolive.crossplatformfoundation.arch.core.dto_and_do;

import com.taobao.taolive.room.utils.aw;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/NavConst;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "QueryKey_SJSDItemID", "QueryKey_LiveSource", "QueryKey_EntryLiveSource", "QueryKey_CustomPlayCtrlParams", "QueryKey_CoverImage", "QueryKey_SPM", "QueryKey_UTParam", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavConst extends Enum<NavConst> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ NavConst[] $VALUES;
    private final String code;
    public static final NavConst QueryKey_SJSDItemID = new NavConst("QueryKey_SJSDItemID", 0, aw.PARAM_SJSD_ITEM_ID);
    public static final NavConst QueryKey_LiveSource = new NavConst("QueryKey_LiveSource", 1, "livesource");
    public static final NavConst QueryKey_EntryLiveSource = new NavConst("QueryKey_EntryLiveSource", 2, "entryLiveSource");
    public static final NavConst QueryKey_CustomPlayCtrlParams = new NavConst("QueryKey_CustomPlayCtrlParams", 3, aw.PARAM_CUSTOM_PLAY_CTRL);
    public static final NavConst QueryKey_CoverImage = new NavConst("QueryKey_CoverImage", 4, "coverImage");
    public static final NavConst QueryKey_SPM = new NavConst("QueryKey_SPM", 5, "spm");
    public static final NavConst QueryKey_UTParam = new NavConst("QueryKey_UTParam", 6, aw.PARAM_UT_PARAMS);

    private static final /* synthetic */ NavConst[] $values() {
        return new NavConst[]{QueryKey_SJSDItemID, QueryKey_LiveSource, QueryKey_EntryLiveSource, QueryKey_CustomPlayCtrlParams, QueryKey_CoverImage, QueryKey_SPM, QueryKey_UTParam};
    }

    static {
        NavConst[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private NavConst(String str, int i, String str2) {
        this.code = str2;
    }

    public static a<NavConst> getEntries() {
        return $ENTRIES;
    }

    public static NavConst valueOf(String str) {
        return (NavConst) Enum.valueOf(NavConst.class, str);
    }

    public static NavConst[] values() {
        return (NavConst[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }
}
