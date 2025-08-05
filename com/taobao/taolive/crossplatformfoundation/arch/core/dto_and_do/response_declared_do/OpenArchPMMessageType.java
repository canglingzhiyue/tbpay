package com.taobao.taolive.crossplatformfoundation.arch.core.dto_and_do.response_declared_do;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.o;
import tb.kge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\bB\b\u0086\u0081\u0002\u0018\u0000 F2\u00060\u0002j\u0002`\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001FB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bE¨\u0006G"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/response_declared_do/OpenArchPMMessageType;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "", "value", "", "<init>", "(Ljava/lang/String;IJ)V", "getValue", "()J", "GPBUnrecognizedEnumeratorValue", "TbliveMessageSubTypeNone", "TbliveMessageSubTypeShareMessage", "TbliveMessageSubTypeJoinNotify", "TbliveMessageSubTypeDigMessage", "TbliveMessageSubTypeShareGoodsList", "TbliveMessageSubTypeCloseGoodsShowCase", "TbliveMessageSubTypeTradeShow", "TbliveMessageSubTypeEndEditItem", "TbliveMessageSubTypeGiveVote", "TbliveMessageSubTypeRunloopUpdateBroadCasterScore", "TbliveMessageSubTypeActivityMsg", "TbliveMessageSubTypeTbtvChangeProgramMsg", "TbliveMessageSubTypePointsActivitySyncMsg", "TbliveMessageSubTypeEnterLiveRoom", "TbliveMessageSubTypeUserLevelUp", "TbliveMessageSubTypeCommonTipsMessage", "TbliveMessageSubTypeCustomerAnswer", "TbliveMessageSubTypeCustomerAddAsk", "TbliveMessageSubTypeCustomerExitRoom", "StepGrouponSuccess", "TbliveMessageSubTypeCommentCrit", "TbliveMessageSubTypeAddGroupSuccess", "TbliveMessageSubTypeLinkLive", "TbliveMessageSubTypeLinkLivePKScore", "TbliveMessageSubTypeLinkLivePKAmbience", "TbliveMessageSubTypeLinkLivePKRank", "TbliveMessageSubTypeJumpH5URL", "TbliveMessageSubTypeInteractiveMsg", "TbliveMessageSubTypeH265Down", "TbliveMessageSubTypeGiftAnimation", "TbliveMessageSubTypeGlobalNotice", "TbliveMessageSubTypeBarrage", "TbliveMessageSubTypeLikeCombo", "TbliveMessageSubTypeJiuGongGe", "TbliveMessageSubTypeCredibleActivityMsg", "TbliveMessageSubTypeAnthorResponse", "TbliveMessageSubTypeSmartPoint", "TbliveMessageSubTypeNewEnterLiveRoom", "TbliveMessageSubTypeRankChange", "TbliveMessageSubTypeSpecialComment", "TbliveMessageSubTypeSwitchStation", "TbliveMessageSubTypeTopAtmosphere", "ChatRoomPVUpdate", "ChatRoomFavUpdate", "ChatRoomStartLive", "NormalComment", "EndSmartPoint", "InteractTypes", "SecKillSoldOut", "CancelTopHotGoods", "newSmartPoint", "TbliveMessageSubTypeGift", "TbliveMessageRewardRankRefresh", "TaoliveMessageBizCommonPM", "TaoliveMessageRewardSmallCardRefresh", "TaoliveMessageSubTypeLeftBanner", "TaoliveMessageRewardTopNotice", "TaoliveMessageDebug", "TaoliveMessageFansClubUpdate", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenArchPMMessageType extends Enum<OpenArchPMMessageType> implements Serializable {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OpenArchPMMessageType[] $VALUES;
    public static final a Companion;
    private final long value;
    public static final OpenArchPMMessageType GPBUnrecognizedEnumeratorValue = new OpenArchPMMessageType("GPBUnrecognizedEnumeratorValue", 0, 4222467823L);
    public static final OpenArchPMMessageType TbliveMessageSubTypeNone = new OpenArchPMMessageType("TbliveMessageSubTypeNone", 1, 0);
    public static final OpenArchPMMessageType TbliveMessageSubTypeShareMessage = new OpenArchPMMessageType("TbliveMessageSubTypeShareMessage", 2, 10003);
    public static final OpenArchPMMessageType TbliveMessageSubTypeJoinNotify = new OpenArchPMMessageType("TbliveMessageSubTypeJoinNotify", 3, 10103);
    public static final OpenArchPMMessageType TbliveMessageSubTypeDigMessage = new OpenArchPMMessageType("TbliveMessageSubTypeDigMessage", 4, 10104);
    public static final OpenArchPMMessageType TbliveMessageSubTypeShareGoodsList = new OpenArchPMMessageType("TbliveMessageSubTypeShareGoodsList", 5, 10101);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCloseGoodsShowCase = new OpenArchPMMessageType("TbliveMessageSubTypeCloseGoodsShowCase", 6, 10009);
    public static final OpenArchPMMessageType TbliveMessageSubTypeTradeShow = new OpenArchPMMessageType("TbliveMessageSubTypeTradeShow", 7, 10010);
    public static final OpenArchPMMessageType TbliveMessageSubTypeEndEditItem = new OpenArchPMMessageType("TbliveMessageSubTypeEndEditItem", 8, 10011);
    public static final OpenArchPMMessageType TbliveMessageSubTypeGiveVote = new OpenArchPMMessageType("TbliveMessageSubTypeGiveVote", 9, 10012);
    public static final OpenArchPMMessageType TbliveMessageSubTypeRunloopUpdateBroadCasterScore = new OpenArchPMMessageType("TbliveMessageSubTypeRunloopUpdateBroadCasterScore", 10, 10013);
    public static final OpenArchPMMessageType TbliveMessageSubTypeActivityMsg = new OpenArchPMMessageType("TbliveMessageSubTypeActivityMsg", 11, 10015);
    public static final OpenArchPMMessageType TbliveMessageSubTypeTbtvChangeProgramMsg = new OpenArchPMMessageType("TbliveMessageSubTypeTbtvChangeProgramMsg", 12, 10016);
    public static final OpenArchPMMessageType TbliveMessageSubTypePointsActivitySyncMsg = new OpenArchPMMessageType("TbliveMessageSubTypePointsActivitySyncMsg", 13, 10018);
    public static final OpenArchPMMessageType TbliveMessageSubTypeEnterLiveRoom = new OpenArchPMMessageType("TbliveMessageSubTypeEnterLiveRoom", 14, 10031);
    public static final OpenArchPMMessageType TbliveMessageSubTypeUserLevelUp = new OpenArchPMMessageType("TbliveMessageSubTypeUserLevelUp", 15, 10033);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCommonTipsMessage = new OpenArchPMMessageType("TbliveMessageSubTypeCommonTipsMessage", 16, 10055);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCustomerAnswer = new OpenArchPMMessageType("TbliveMessageSubTypeCustomerAnswer", 17, 10056);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCustomerAddAsk = new OpenArchPMMessageType("TbliveMessageSubTypeCustomerAddAsk", 18, 10057);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCustomerExitRoom = new OpenArchPMMessageType("TbliveMessageSubTypeCustomerExitRoom", 19, 10058);
    public static final OpenArchPMMessageType StepGrouponSuccess = new OpenArchPMMessageType("StepGrouponSuccess", 20, 10119);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCommentCrit = new OpenArchPMMessageType("TbliveMessageSubTypeCommentCrit", 21, 10110);
    public static final OpenArchPMMessageType TbliveMessageSubTypeAddGroupSuccess = new OpenArchPMMessageType("TbliveMessageSubTypeAddGroupSuccess", 22, 10035);
    public static final OpenArchPMMessageType TbliveMessageSubTypeLinkLive = new OpenArchPMMessageType("TbliveMessageSubTypeLinkLive", 23, 10021);
    public static final OpenArchPMMessageType TbliveMessageSubTypeLinkLivePKScore = new OpenArchPMMessageType("TbliveMessageSubTypeLinkLivePKScore", 24, 122233);
    public static final OpenArchPMMessageType TbliveMessageSubTypeLinkLivePKAmbience = new OpenArchPMMessageType("TbliveMessageSubTypeLinkLivePKAmbience", 25, 122234);
    public static final OpenArchPMMessageType TbliveMessageSubTypeLinkLivePKRank = new OpenArchPMMessageType("TbliveMessageSubTypeLinkLivePKRank", 26, 100000009);
    public static final OpenArchPMMessageType TbliveMessageSubTypeJumpH5URL = new OpenArchPMMessageType("TbliveMessageSubTypeJumpH5URL", 27, 10098);
    public static final OpenArchPMMessageType TbliveMessageSubTypeInteractiveMsg = new OpenArchPMMessageType("TbliveMessageSubTypeInteractiveMsg", 28, 10086);
    public static final OpenArchPMMessageType TbliveMessageSubTypeH265Down = new OpenArchPMMessageType("TbliveMessageSubTypeH265Down", 29, 10099);
    public static final OpenArchPMMessageType TbliveMessageSubTypeGiftAnimation = new OpenArchPMMessageType("TbliveMessageSubTypeGiftAnimation", 30, 20001);
    public static final OpenArchPMMessageType TbliveMessageSubTypeGlobalNotice = new OpenArchPMMessageType("TbliveMessageSubTypeGlobalNotice", 31, 20002);
    public static final OpenArchPMMessageType TbliveMessageSubTypeBarrage = new OpenArchPMMessageType("TbliveMessageSubTypeBarrage", 32, 20003);
    public static final OpenArchPMMessageType TbliveMessageSubTypeLikeCombo = new OpenArchPMMessageType("TbliveMessageSubTypeLikeCombo", 33, 20004);
    public static final OpenArchPMMessageType TbliveMessageSubTypeJiuGongGe = new OpenArchPMMessageType("TbliveMessageSubTypeJiuGongGe", 34, 20005);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCredibleActivityMsg = new OpenArchPMMessageType("TbliveMessageSubTypeCredibleActivityMsg", 35, 60008);
    public static final OpenArchPMMessageType TbliveMessageSubTypeAnthorResponse = new OpenArchPMMessageType("TbliveMessageSubTypeAnthorResponse", 36, 70008);
    public static final OpenArchPMMessageType TbliveMessageSubTypeSmartPoint = new OpenArchPMMessageType("TbliveMessageSubTypeSmartPoint", 37, 30005);
    public static final OpenArchPMMessageType TbliveMessageSubTypeNewEnterLiveRoom = new OpenArchPMMessageType("TbliveMessageSubTypeNewEnterLiveRoom", 38, 100000000);
    public static final OpenArchPMMessageType TbliveMessageSubTypeRankChange = new OpenArchPMMessageType("TbliveMessageSubTypeRankChange", 39, 100000011);
    public static final OpenArchPMMessageType TbliveMessageSubTypeSpecialComment = new OpenArchPMMessageType("TbliveMessageSubTypeSpecialComment", 40, 100000010);
    public static final OpenArchPMMessageType TbliveMessageSubTypeSwitchStation = new OpenArchPMMessageType("TbliveMessageSubTypeSwitchStation", 41, 880000112);
    public static final OpenArchPMMessageType TbliveMessageSubTypeTopAtmosphere = new OpenArchPMMessageType("TbliveMessageSubTypeTopAtmosphere", 42, 10144);
    public static final OpenArchPMMessageType ChatRoomPVUpdate = new OpenArchPMMessageType("ChatRoomPVUpdate", 43, 200001);
    public static final OpenArchPMMessageType ChatRoomFavUpdate = new OpenArchPMMessageType("ChatRoomFavUpdate", 44, 200002);
    public static final OpenArchPMMessageType ChatRoomStartLive = new OpenArchPMMessageType("ChatRoomStartLive", 45, 200003);
    public static final OpenArchPMMessageType NormalComment = new OpenArchPMMessageType("NormalComment", 46, 881000048);
    public static final OpenArchPMMessageType EndSmartPoint = new OpenArchPMMessageType("EndSmartPoint", 47, 880000090);
    public static final OpenArchPMMessageType InteractTypes = new OpenArchPMMessageType("InteractTypes", 48, 880000157);
    public static final OpenArchPMMessageType SecKillSoldOut = new OpenArchPMMessageType("SecKillSoldOut", 49, 880000160);
    public static final OpenArchPMMessageType CancelTopHotGoods = new OpenArchPMMessageType("CancelTopHotGoods", 50, 880000204);
    public static final OpenArchPMMessageType newSmartPoint = new OpenArchPMMessageType("newSmartPoint", 51, 880000205);
    public static final OpenArchPMMessageType TbliveMessageSubTypeGift = new OpenArchPMMessageType("TbliveMessageSubTypeGift", 52, 880000238);
    public static final OpenArchPMMessageType TbliveMessageRewardRankRefresh = new OpenArchPMMessageType("TbliveMessageRewardRankRefresh", 53, 880000242);
    public static final OpenArchPMMessageType TaoliveMessageBizCommonPM = new OpenArchPMMessageType("TaoliveMessageBizCommonPM", 54, 881000244);
    public static final OpenArchPMMessageType TaoliveMessageRewardSmallCardRefresh = new OpenArchPMMessageType("TaoliveMessageRewardSmallCardRefresh", 55, 880000247);
    public static final OpenArchPMMessageType TaoliveMessageSubTypeLeftBanner = new OpenArchPMMessageType("TaoliveMessageSubTypeLeftBanner", 56, 880000249);
    public static final OpenArchPMMessageType TaoliveMessageRewardTopNotice = new OpenArchPMMessageType("TaoliveMessageRewardTopNotice", 57, 880000253);
    public static final OpenArchPMMessageType TaoliveMessageDebug = new OpenArchPMMessageType("TaoliveMessageDebug", 58, 888888888);
    public static final OpenArchPMMessageType TaoliveMessageFansClubUpdate = new OpenArchPMMessageType("TaoliveMessageFansClubUpdate", 59, 880000272);

    private static final /* synthetic */ OpenArchPMMessageType[] $values() {
        return new OpenArchPMMessageType[]{GPBUnrecognizedEnumeratorValue, TbliveMessageSubTypeNone, TbliveMessageSubTypeShareMessage, TbliveMessageSubTypeJoinNotify, TbliveMessageSubTypeDigMessage, TbliveMessageSubTypeShareGoodsList, TbliveMessageSubTypeCloseGoodsShowCase, TbliveMessageSubTypeTradeShow, TbliveMessageSubTypeEndEditItem, TbliveMessageSubTypeGiveVote, TbliveMessageSubTypeRunloopUpdateBroadCasterScore, TbliveMessageSubTypeActivityMsg, TbliveMessageSubTypeTbtvChangeProgramMsg, TbliveMessageSubTypePointsActivitySyncMsg, TbliveMessageSubTypeEnterLiveRoom, TbliveMessageSubTypeUserLevelUp, TbliveMessageSubTypeCommonTipsMessage, TbliveMessageSubTypeCustomerAnswer, TbliveMessageSubTypeCustomerAddAsk, TbliveMessageSubTypeCustomerExitRoom, StepGrouponSuccess, TbliveMessageSubTypeCommentCrit, TbliveMessageSubTypeAddGroupSuccess, TbliveMessageSubTypeLinkLive, TbliveMessageSubTypeLinkLivePKScore, TbliveMessageSubTypeLinkLivePKAmbience, TbliveMessageSubTypeLinkLivePKRank, TbliveMessageSubTypeJumpH5URL, TbliveMessageSubTypeInteractiveMsg, TbliveMessageSubTypeH265Down, TbliveMessageSubTypeGiftAnimation, TbliveMessageSubTypeGlobalNotice, TbliveMessageSubTypeBarrage, TbliveMessageSubTypeLikeCombo, TbliveMessageSubTypeJiuGongGe, TbliveMessageSubTypeCredibleActivityMsg, TbliveMessageSubTypeAnthorResponse, TbliveMessageSubTypeSmartPoint, TbliveMessageSubTypeNewEnterLiveRoom, TbliveMessageSubTypeRankChange, TbliveMessageSubTypeSpecialComment, TbliveMessageSubTypeSwitchStation, TbliveMessageSubTypeTopAtmosphere, ChatRoomPVUpdate, ChatRoomFavUpdate, ChatRoomStartLive, NormalComment, EndSmartPoint, InteractTypes, SecKillSoldOut, CancelTopHotGoods, newSmartPoint, TbliveMessageSubTypeGift, TbliveMessageRewardRankRefresh, TaoliveMessageBizCommonPM, TaoliveMessageRewardSmallCardRefresh, TaoliveMessageSubTypeLeftBanner, TaoliveMessageRewardTopNotice, TaoliveMessageDebug, TaoliveMessageFansClubUpdate};
    }

    static {
        OpenArchPMMessageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        Companion = new a(null);
    }

    private OpenArchPMMessageType(String str, int i, long j) {
        this.value = j;
    }

    public static kotlin.enums.a<OpenArchPMMessageType> getEntries() {
        return $ENTRIES;
    }

    public static OpenArchPMMessageType valueOf(String str) {
        return (OpenArchPMMessageType) Enum.valueOf(OpenArchPMMessageType.class, str);
    }

    public static OpenArchPMMessageType[] values() {
        return (OpenArchPMMessageType[]) $VALUES.clone();
    }

    public final long getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/response_declared_do/OpenArchPMMessageType$Companion;", "", "<init>", "()V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1866967721);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
