package com.taobao.taolive.crossplatformfoundation.openarch.component.ability;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;
import kotlin.jvm.internal.q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/openarch/component/ability/TaoLiveOpenAbilityIdentiferEnum;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "Ubee", "MiniPlayer", "Link", "PlayerSetting", "SwithRoom", "PaiMai", "LRUIComponent", "LiveRoomExceptionUI", "AliveConfig", "Share", "UTConfig", "HalfScreenDetail", "SupportTimeMove", "MoreLiveComponent", "GoodsListHighlight", "Change2Landscape", "NotSeeHim", "ReduceContent", "JuvenileRefund", "OpenWatchCloseArea", "Backward", "RecommendDXCard", "PlayBack", "TimeMove", "ChatRoom", "RewardRankEntryInTopLiveRoom", "PageUT", "DefaultLifeCycle", "DefaultWatchLifeCycle", "MiniLiveAnimation", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaoLiveOpenAbilityIdentiferEnum extends Enum<TaoLiveOpenAbilityIdentiferEnum> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaoLiveOpenAbilityIdentiferEnum[] $VALUES;
    private String code;
    public static final TaoLiveOpenAbilityIdentiferEnum Ubee = new TaoLiveOpenAbilityIdentiferEnum("Ubee", 0, "TLOAI_Ubee");
    public static final TaoLiveOpenAbilityIdentiferEnum MiniPlayer = new TaoLiveOpenAbilityIdentiferEnum("MiniPlayer", 1, "TLOAI_MP");
    public static final TaoLiveOpenAbilityIdentiferEnum Link = new TaoLiveOpenAbilityIdentiferEnum("Link", 2, "TLOAI_Link");
    public static final TaoLiveOpenAbilityIdentiferEnum PlayerSetting = new TaoLiveOpenAbilityIdentiferEnum("PlayerSetting", 3, "TLOAI_PlayerSetting");
    public static final TaoLiveOpenAbilityIdentiferEnum SwithRoom = new TaoLiveOpenAbilityIdentiferEnum("SwithRoom", 4, "TLOAI_SwithRoom");
    public static final TaoLiveOpenAbilityIdentiferEnum PaiMai = new TaoLiveOpenAbilityIdentiferEnum("PaiMai", 5, "TLOAI_PM");
    public static final TaoLiveOpenAbilityIdentiferEnum LRUIComponent = new TaoLiveOpenAbilityIdentiferEnum("LRUIComponent", 6, "TLOAI_LRC");
    public static final TaoLiveOpenAbilityIdentiferEnum LiveRoomExceptionUI = new TaoLiveOpenAbilityIdentiferEnum("LiveRoomExceptionUI", 7, "TLOAI_LREUI");
    public static final TaoLiveOpenAbilityIdentiferEnum AliveConfig = new TaoLiveOpenAbilityIdentiferEnum("AliveConfig", 8, "TLOAI_AliveConfig");
    public static final TaoLiveOpenAbilityIdentiferEnum Share = new TaoLiveOpenAbilityIdentiferEnum("Share", 9, "TLOAI_Share");
    public static final TaoLiveOpenAbilityIdentiferEnum UTConfig = new TaoLiveOpenAbilityIdentiferEnum("UTConfig", 10, "TLOAI_UTConfig");
    public static final TaoLiveOpenAbilityIdentiferEnum HalfScreenDetail = new TaoLiveOpenAbilityIdentiferEnum("HalfScreenDetail", 11, "TLOAI_HalfScreenDetail");
    public static final TaoLiveOpenAbilityIdentiferEnum SupportTimeMove = new TaoLiveOpenAbilityIdentiferEnum("SupportTimeMove", 12, "TLOAI_SupportTimeMove");
    public static final TaoLiveOpenAbilityIdentiferEnum MoreLiveComponent = new TaoLiveOpenAbilityIdentiferEnum("MoreLiveComponent", 13, "TLOAI_MoreLiveComponent");
    public static final TaoLiveOpenAbilityIdentiferEnum GoodsListHighlight = new TaoLiveOpenAbilityIdentiferEnum("GoodsListHighlight", 14, "TLOAI_GLHighlight");
    public static final TaoLiveOpenAbilityIdentiferEnum Change2Landscape = new TaoLiveOpenAbilityIdentiferEnum("Change2Landscape", 15, "TLOAI_Change2Landscape");
    public static final TaoLiveOpenAbilityIdentiferEnum NotSeeHim = new TaoLiveOpenAbilityIdentiferEnum("NotSeeHim", 16, "TLOAI_NotSeeHim");
    public static final TaoLiveOpenAbilityIdentiferEnum ReduceContent = new TaoLiveOpenAbilityIdentiferEnum("ReduceContent", 17, "TLOAI_ReduceContent");
    public static final TaoLiveOpenAbilityIdentiferEnum JuvenileRefund = new TaoLiveOpenAbilityIdentiferEnum("JuvenileRefund", 18, "TLOAI_JuvenileRefund");
    public static final TaoLiveOpenAbilityIdentiferEnum OpenWatchCloseArea = new TaoLiveOpenAbilityIdentiferEnum("OpenWatchCloseArea", 19, "TLOAI_OpenWatchCloseArea");
    public static final TaoLiveOpenAbilityIdentiferEnum Backward = new TaoLiveOpenAbilityIdentiferEnum("Backward", 20, "TLOAI_Backward");
    public static final TaoLiveOpenAbilityIdentiferEnum RecommendDXCard = new TaoLiveOpenAbilityIdentiferEnum("RecommendDXCard", 21, "TLOAI_RecommendDXCard");
    public static final TaoLiveOpenAbilityIdentiferEnum PlayBack = new TaoLiveOpenAbilityIdentiferEnum("PlayBack", 22, "TLOAI_PlayBack");
    public static final TaoLiveOpenAbilityIdentiferEnum TimeMove = new TaoLiveOpenAbilityIdentiferEnum("TimeMove", 23, "TLOAI_TimeMove");
    public static final TaoLiveOpenAbilityIdentiferEnum ChatRoom = new TaoLiveOpenAbilityIdentiferEnum("ChatRoom", 24, "TLOAI_ChatRoom");
    public static final TaoLiveOpenAbilityIdentiferEnum RewardRankEntryInTopLiveRoom = new TaoLiveOpenAbilityIdentiferEnum("RewardRankEntryInTopLiveRoom", 25, "TLOAI_RewardRankEntryInTopLiveRoom");
    public static final TaoLiveOpenAbilityIdentiferEnum PageUT = new TaoLiveOpenAbilityIdentiferEnum("PageUT", 26, "TLOAI_PageUT");
    public static final TaoLiveOpenAbilityIdentiferEnum DefaultLifeCycle = new TaoLiveOpenAbilityIdentiferEnum("DefaultLifeCycle", 27, "TLOAI_DefaultLifeCycle");
    public static final TaoLiveOpenAbilityIdentiferEnum DefaultWatchLifeCycle = new TaoLiveOpenAbilityIdentiferEnum("DefaultWatchLifeCycle", 28, "TLOAI_DefaultWatchLifeCycle");
    public static final TaoLiveOpenAbilityIdentiferEnum MiniLiveAnimation = new TaoLiveOpenAbilityIdentiferEnum("MiniLiveAnimation", 29, "TLOAI_MiniLiveAnimation");

    private static final /* synthetic */ TaoLiveOpenAbilityIdentiferEnum[] $values() {
        return new TaoLiveOpenAbilityIdentiferEnum[]{Ubee, MiniPlayer, Link, PlayerSetting, SwithRoom, PaiMai, LRUIComponent, LiveRoomExceptionUI, AliveConfig, Share, UTConfig, HalfScreenDetail, SupportTimeMove, MoreLiveComponent, GoodsListHighlight, Change2Landscape, NotSeeHim, ReduceContent, JuvenileRefund, OpenWatchCloseArea, Backward, RecommendDXCard, PlayBack, TimeMove, ChatRoom, RewardRankEntryInTopLiveRoom, PageUT, DefaultLifeCycle, DefaultWatchLifeCycle, MiniLiveAnimation};
    }

    static {
        TaoLiveOpenAbilityIdentiferEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TaoLiveOpenAbilityIdentiferEnum(String str, int i, String str2) {
        this.code = str2;
    }

    public static a<TaoLiveOpenAbilityIdentiferEnum> getEntries() {
        return $ENTRIES;
    }

    public static TaoLiveOpenAbilityIdentiferEnum valueOf(String str) {
        return (TaoLiveOpenAbilityIdentiferEnum) Enum.valueOf(TaoLiveOpenAbilityIdentiferEnum.class, str);
    }

    public static TaoLiveOpenAbilityIdentiferEnum[] values() {
        return (TaoLiveOpenAbilityIdentiferEnum[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        q.d(str, "<set-?>");
        this.code = str;
    }
}
