package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.H5PlatfomListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.openarchitecture.single.b;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class pjc extends pje {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String f;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f32701a;
    public String b = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"HideHiglightLive\":{\"enable\":true,\"identifer\":\"HideHiglightLive\"}},{\"HideFandom\":{\"enable\":true,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":true,\"identifer\":\"HideReplayLive\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"HideVideoShowError\":{\"enable\":true,\"identifer\":\"HideVideoShowError\"}},{\"Link\":{\"enable\":false,\"identifer\":\"Link\"}},{\"MiniPlayer\":{\"enable\":true,\"identifer\":\"MiniPlayer\"}},{\"PaiMai\":{\"enable\":false,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":false,\"identifer\":\"Ubee\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"WatchNum\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"BottomGroup\",\"cList\":[{\"cName\":\"CommentInputButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"MoreButton\"},{\"cName\":\"LikeButton\"},{\"cName\":\"GoodEntrance\"}]},{\"cName\":\"LeftSideGroup\",\"cList\":[{\"cName\":\"LeftTopEntrance\"},{\"cName\":\"LiveQABiz\"},{\"cName\":\"LeftBanner\"},{\"cName\":\"FansPush\"},{\"cName\":\"LeftNotice\"}]},{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"},{\"cName\":\"GiftShow\"},{\"cName\":\"ImportantNotice\"},{\"cName\":\"AtmosEnter\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"VirtualHostTag\"},{\"cName\":\"InteractionEntrance\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"DoubleLike\"},{\"cName\":\"CleanScreen\"},{\"cName\":\"TopNotice\"},{\"cName\":\"LinkWatchGroup\",\"cList\":[{\"cName\":\"MultiBBLinkWatch\"}]},{\"cName\":\"BCLinkWatch\"},{\"cName\":\"LiveBCLinkBiz\"}]},{\"cName\":\"LiveAbilityGroup\",\"cList\":[{\"cName\":\"LiveFeedback\"},{\"cName\":\"MuteWatchTrack\"}]}]}},\"identifer\":\"LRComponent\"}}]}";
    public String c = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}]}";
    public String d = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":true,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":true,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":true,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":true,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":true,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"AccountInfo\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"BottomGroup\",\"cList\":[{\"cName\":\"CommentInputButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"MoreButton\"},{\"cName\":\"LikeButton\"},{\"cName\":\"GoodEntrance\"},{\"cName\":\"ShareButton\"},{\"cName\":\"RewardButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"ReportLiveRoom\"}]},{\"cName\":\"LeftSideGroup\",\"cList\":[{\"cName\":\"LeftTopEntrance\"},{\"cName\":\"LiveQABiz\"},{\"cName\":\"LeftBanner\"},{\"cName\":\"FansPush\"},{\"cName\":\"LeftNotice\"}]},{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"},{\"cName\":\"GiftShow\"},{\"cName\":\"ImportantNotice\"},{\"cName\":\"AtmosEnter\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"VirtualHostTag\"},{\"cName\":\"InteractionEntrance\"},{\"cName\":\"LiveWaterMark\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"DoubleLike\"},{\"cName\":\"CleanScreen\"},{\"cName\":\"TopNotice\"},{\"cName\":\"LinkWatchGroup\",\"cList\":[{\"cName\":\"MultiBBLinkWatch\"},{\"cName\":\"BCLinkWatch\"}]},{\"cName\":\"LiveAnchorPage\"},{\"cName\":\"LiveBCLinkBiz\"}]},{\"cName\":\"LiveAbilityGroup\",\"cList\":[{\"cName\":\"LiveFeedback\"},{\"cName\":\"MuteWatchTrack\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":true,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":false,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}}]}";
    public String e = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":true,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":true,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":true,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":true,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":true,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"WatchNum\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"BottomGroup\",\"cList\":[{\"cName\":\"CommentInputButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"MoreButton\"},{\"cName\":\"LikeButton\"},{\"cName\":\"GoodEntrance\"},{\"cName\":\"ShareButton\"},{\"cName\":\"RewardButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"ReportLiveRoom\"}]},{\"cName\":\"LeftSideGroup\",\"cList\":[{\"cName\":\"LeftTopEntrance\"},{\"cName\":\"LiveQABiz\"},{\"cName\":\"LeftBanner\"},{\"cName\":\"FansPush\"},{\"cName\":\"LeftNotice\"}]},{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"},{\"cName\":\"GiftShow\"},{\"cName\":\"ImportantNotice\"},{\"cName\":\"AtmosEnter\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"VirtualHostTag\"},{\"cName\":\"InteractionEntrance\"},{\"cName\":\"LiveWaterMark\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"DoubleLike\"},{\"cName\":\"CleanScreen\"},{\"cName\":\"TopNotice\"},{\"cName\":\"LinkWatchGroup\",\"cList\":[{\"cName\":\"MultiBBLinkWatch\"},{\"cName\":\"BCLinkWatch\"}]},{\"cName\":\"LiveAnchorPage\"},{\"cName\":\"LiveBCLinkBiz\"}]},{\"cName\":\"LiveAbilityGroup\",\"cList\":[{\"cName\":\"LiveFeedback\"},{\"cName\":\"MuteWatchTrack\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":true,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":false,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}}]}";
    public String g = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":false,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":true,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":false,\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":true,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":true,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":true,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":true,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":true,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"HorizontalScrolle\":{\"enable\":true,\"identifer\":\"HorizontalScrolle\"}}]}";
    public String l = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":false,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":true,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"AccountInfo\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"InteractionEntrance\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":true,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":true,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":true,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":true,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":true,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"HorizontalScrolle\":{\"enable\":true,\"identifer\":\"HorizontalScrolle\"}}]}";
    public String k = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":false,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":true,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":false,\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":false,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":true,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":true,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":true,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":true,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":true,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"HorizontalScrolle\":{\"enable\":true,\"identifer\":\"HorizontalScrolle\"}}]}";
    public String m = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":true,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":false,\"identifer\":\"MiniPlayer\"},\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"}]},{\"cName\":\"BottomGroup\",\"cList\":[]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"CleanScreen\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":false,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":false,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":true,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":false,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":false,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":false,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":true,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":false,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":false,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"HorizontalScrolle\":{\"enable\":false,\"identifer\":\"HorizontalScrolle\"}},{\"LRCommentFeatMap\": {\"enable\": true,\"extConfigMap\": {\"json\": {\"disableShopAtmosphere\":true,\"disableFusionComment\":true,\"disableAiResp\":true,\"disableCommentButton\":true,\"disableCommentInteraction\":true,\"disableAtmosphere\":true}}, \"identifer\": \"LRCommentFeatMap\"}},{\"CustomizedSimpleLive\":{\"enable\":true,\"identifer\":\"CustomizedSimpleLive\"}},{\"ReplayStatusShowLiveEnd\":{\"enable\":true,\"identifer\":\"ReplayStatusShowLiveEnd\"}}]}";
    public String h = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":true,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":false,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"AccountInfo\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"BottomGroup\",\"cList\":[{\"cName\":\"CommentInputButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"MoreButton\"},{\"cName\":\"LikeButton\"},{\"cName\":\"GoodEntrance\"},{\"cName\":\"ShareButton\"},{\"cName\":\"RewardButton\"},{\"cName\":\"BackLivingButton\"}]},{\"cName\":\"LeftSideGroup\",\"cList\":[{\"cName\":\"LeftTopEntrance\"},{\"cName\":\"LiveQABiz\"},{\"cName\":\"LeftBanner\"},{\"cName\":\"FansPush\"},{\"cName\":\"LeftNotice\"}]},{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"},{\"cName\":\"GiftShow\"},{\"cName\":\"ImportantNotice\"},{\"cName\":\"AtmosEnter\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"VirtualHostTag\"},{\"cName\":\"InteractionEntrance\"},{\"cName\":\"LiveWaterMark\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"DoubleLike\"},{\"cName\":\"CleanScreen\"},{\"cName\":\"TopNotice\"},{\"cName\":\"LinkWatchGroup\",\"cList\":[{\"cName\":\"MultiBBLinkWatch\"},{\"cName\":\"BCLinkWatch\"}]},{\"cName\":\"LiveAnchorPage\"},{\"cName\":\"LiveBCLinkBiz\"}]},{\"cName\":\"LiveAbilityGroup\",\"cList\":[{\"cName\":\"LiveFeedback\"},{\"cName\":\"MuteWatchTrack\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":false,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":true,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":true,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":false,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":true,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"HorizontalScrolle\":{\"enable\":false,\"identifer\":\"HorizontalScrolle\"}}]}";
    public String i = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"EnablePerceptionHalfDetailByEvent\":{\"enable\":true,\"identifer\":\"EnablePerceptionHalfDetailByEvent\"}},{\"HideContainerCloseICON\":{\"enable\":true,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":false,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"AccountInfo\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"BottomGroup\",\"cList\":[{\"cName\":\"CommentInputButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"MoreButton\"},{\"cName\":\"LikeButton\"},{\"cName\":\"GoodEntrance\"},{\"cName\":\"ShareButton\"},{\"cName\":\"RewardButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"ReportLiveRoom\"}]},{\"cName\":\"LeftSideGroup\",\"cList\":[{\"cName\":\"LeftTopEntrance\"},{\"cName\":\"LiveQABiz\"},{\"cName\":\"LeftBanner\"}]},{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"},{\"cName\":\"GiftShow\"},{\"cName\":\"ImportantNotice\"},{\"cName\":\"AtmosEnter\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"VirtualHostTag\"},{\"cName\":\"InteractionEntrance\"},{\"cName\":\"LiveWaterMark\"},{\"cName\":\"Tab2LiveMoreEntrance\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"DoubleLike\"},{\"cName\":\"CleanScreen\"},{\"cName\":\"TopNotice\"},{\"cName\":\"LinkWatchGroup\",\"cList\":[{\"cName\":\"MultiBBLinkWatch\"},{\"cName\":\"BCLinkWatch\"}]},{\"cName\":\"LiveAnchorPage\"},{\"cName\":\"LiveBCLinkBiz\"}]},{\"cName\":\"LiveAbilityGroup\",\"cList\":[{\"cName\":\"LiveFeedback\"},{\"cName\":\"MuteWatchTrack\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":false,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":true,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":true,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":false,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":true,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"DisableFinish\":{\"enable\":true,\"identifer\":\"DisableFinish\"}},{\"EnableResetMuteFromSettingWhenResume\":{\"enable\":true,\"identifer\":\"EnableResetMuteFromSettingWhenResume\"}},{\"HorizontalScrolle\":{\"enable\":false,\"identifer\":\"HorizontalScrolle\"}},{\"AddCustomPageExtParams\":{\"enable\":true,\"identifer\":\"AddCustomPageExtParams\"}},{\"SpecialSmallWindow\":{\"enable\":true,\"identifer\":\"SpecialSmallWindow\"}},{\"CustomizedToast\":{\"enable\":true,\"identifer\":\"CustomizedToast\"}},{\"CustomizedTopLeftOrder\":{\"enable\":true,\"identifer\":\"CustomizedTopLeftOrder\"}},{\"CustomizedTopMask\":{\"enable\":true,\"identifer\":\"CustomizedTopMask\"}},{\"TabUnselectedReportLiveEnd\":{\"enable\":true,\"identifer\":\"TabUnselectedReportLiveEnd\"}},{\"HideFandomAndRefreshLiveRoom\":{\"enable\":true,\"identifer\":\"HideFandomAndRefreshLiveRoom\"}},{\"ReplayStatusShowLiveEnd\":{\"enable\":true,\"identifer\":\"ReplayStatusShowLiveEnd\"}},{\"RefreshOrRemoveLiveRoomWhenVisible\":{\"enable\":true,\"identifer\":\"RefreshOrRemoveLiveRoomWhenVisible\"}}]}";
    public String j = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"EnablePerceptionHalfDetailByEvent\":{\"enable\":true,\"identifer\":\"EnablePerceptionHalfDetailByEvent\"}},{\"HideContainerCloseICON\":{\"enable\":true,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":false,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"WatchNum\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"BottomGroup\",\"cList\":[{\"cName\":\"CommentInputButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"MoreButton\"},{\"cName\":\"LikeButton\"},{\"cName\":\"GoodEntrance\"},{\"cName\":\"ShareButton\"},{\"cName\":\"RewardButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"ReportLiveRoom\"}]},{\"cName\":\"LeftSideGroup\",\"cList\":[{\"cName\":\"LeftTopEntrance\"},{\"cName\":\"LiveQABiz\"},{\"cName\":\"LeftBanner\"}]},{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"},{\"cName\":\"GiftShow\"},{\"cName\":\"ImportantNotice\"},{\"cName\":\"AtmosEnter\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"VirtualHostTag\"},{\"cName\":\"InteractionEntrance\"},{\"cName\":\"LiveWaterMark\"},{\"cName\":\"Tab2LiveMoreEntrance\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"DoubleLike\"},{\"cName\":\"CleanScreen\"},{\"cName\":\"TopNotice\"},{\"cName\":\"LinkWatchGroup\",\"cList\":[{\"cName\":\"MultiBBLinkWatch\"},{\"cName\":\"BCLinkWatch\"}]},{\"cName\":\"LiveAnchorPage\"},{\"cName\":\"LiveBCLinkBiz\"}]},{\"cName\":\"LiveAbilityGroup\",\"cList\":[{\"cName\":\"LiveFeedback\"},{\"cName\":\"MuteWatchTrack\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":false,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":true,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":true,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":false,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":true,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"DisableFinish\":{\"enable\":true,\"identifer\":\"DisableFinish\"}},{\"EnableResetMuteFromSettingWhenResume\":{\"enable\":true,\"identifer\":\"EnableResetMuteFromSettingWhenResume\"}},{\"HorizontalScrolle\":{\"enable\":false,\"identifer\":\"HorizontalScrolle\"}},{\"AddCustomPageExtParams\":{\"enable\":true,\"identifer\":\"AddCustomPageExtParams\"}},{\"SpecialSmallWindow\":{\"enable\":true,\"identifer\":\"SpecialSmallWindow\"}},{\"CustomizedToast\":{\"enable\":true,\"identifer\":\"CustomizedToast\"}},{\"CustomizedTopLeftOrder\":{\"enable\":true,\"identifer\":\"CustomizedTopLeftOrder\"}},{\"CustomizedTopMask\":{\"enable\":true,\"identifer\":\"CustomizedTopMask\"}},{\"TabUnselectedReportLiveEnd\":{\"enable\":true,\"identifer\":\"TabUnselectedReportLiveEnd\"}},{\"HideFandomAndRefreshLiveRoom\":{\"enable\":true,\"identifer\":\"HideFandomAndRefreshLiveRoom\"}},{\"ReplayStatusShowLiveEnd\":{\"enable\":true,\"identifer\":\"ReplayStatusShowLiveEnd\"}},{\"RefreshOrRemoveLiveRoomWhenVisible\":{\"enable\":true,\"identifer\":\"RefreshOrRemoveLiveRoomWhenVisible\"}}]}";

    /* renamed from: tb.pjc$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32702a = new int[TaoliveGatewayEnum.values().length];

        static {
            try {
                f32702a[TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveRoom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32702a[TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveRoomView.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32702a[TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveCompontent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(pjc pjcVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1513874502);
        f = pjc.class.getSimpleName();
    }

    @Override // tb.pje
    public Object b(TaoliveGatewayEnum taoliveGatewayEnum, pkg pkgVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("281620d2", new Object[]{this, taoliveGatewayEnum, pkgVar, objArr});
        }
        String obj = (objArr == null || objArr.length <= 1 || objArr[1] == null) ? null : objArr[1].toString();
        TLog.logi("TaoliveOpen-2.1", "Gateway", " gatewayEnum: " + taoliveGatewayEnum + " invockHandleCommand: " + obj);
        int i = AnonymousClass1.f32702a[taoliveGatewayEnum.ordinal()];
        if (i == 1) {
            return d(pkgVar);
        }
        if (i == 2) {
            return c(pkgVar);
        }
        if (i != 3 || objArr == null || objArr.length <= 1 || objArr[1] == null) {
            return null;
        }
        Integer a2 = a(pkgVar, objArr);
        if (a2 != null && a2.intValue() == -1) {
            Log.e(f + "没有权限:", objArr[1].toString());
        }
        return a2;
    }

    public pjb a(pkg pkgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pjb) ipChange.ipc$dispatch("73a3ead2", new Object[]{this, pkgVar});
        }
        this.f32701a = a("2.1");
        b(pkgVar);
        return this;
    }

    private Integer a(pkg pkgVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("8798e0c", new Object[]{this, pkgVar, objArr});
        }
        if (objArr[1] instanceof AccessListenerEnum) {
            return a(((AccessListenerEnum) objArr[1]).toString(), "accessor", pkgVar);
        }
        if (objArr[1] instanceof PlatformListenerEnum) {
            return a(((PlatformListenerEnum) objArr[1]).toString(), "platform", pkgVar);
        }
        if (objArr[1] instanceof H5PlatfomListenerEnum) {
            return a(((H5PlatfomListenerEnum) objArr[1]).toString(), "platform", pkgVar);
        }
        if (!(objArr[1] instanceof WatchPlatformListenerEnum)) {
            return null;
        }
        return a(((WatchPlatformListenerEnum) objArr[1]).toString(), "platform", pkgVar);
    }

    private Integer a(String str, String str2, pkg pkgVar) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("49bb5dc7", new Object[]{this, str, str2, pkgVar});
        }
        if (this.f32701a != null && pkgVar != null && !StringUtils.isEmpty(pkgVar.b) && (jSONObject = this.f32701a.getJSONObject(pkgVar.b)) != null && (jSONArray = jSONObject.getJSONArray("invokeConfig")) != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject(str)) != null) {
                    return jSONObject2.getJSONArray("eventChannel").contains(str2) ? -1 : null;
                }
            }
        }
        return null;
    }

    private Integer c(pkg pkgVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2a03be35", new Object[]{this, pkgVar});
        }
        if (pkgVar != null && !StringUtils.isEmpty(pkgVar.b) && (jSONObject = this.f32701a) != null && (jSONObject2 = jSONObject.getJSONObject(pkgVar.b)) != null && (jSONArray = jSONObject2.getJSONArray("invokeConfig")) != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                if (jSONObject4 != null && (jSONObject3 = jSONObject4.getJSONObject("Create_OpenLiveRoomView")) != null) {
                    return jSONObject3.getJSONArray("eventChannel").contains("platform") ? null : -1;
                }
            }
        }
        return -1;
    }

    private Integer d(pkg pkgVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("3eec8676", new Object[]{this, pkgVar});
        }
        if (pkgVar != null && !StringUtils.isEmpty(pkgVar.b) && (jSONObject = this.f32701a.getJSONObject(pkgVar.b)) != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("abilityConfig");
            if (jSONArray == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.getJSONObject("LRComponent") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRComponent, jSONObject2.getJSONObject("LRComponent"));
                } else if (jSONObject2.getJSONObject("Goods_Highlight_Frame") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Goods_Highlight_Frame, jSONObject2.getJSONObject("Goods_Highlight_Frame"));
                } else if (jSONObject2.getJSONObject("Link") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Link, jSONObject2.getJSONObject("Link"));
                } else if (jSONObject2.getJSONObject("MiniPlayer") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_MiniPlayer, jSONObject2.getJSONObject("MiniPlayer"));
                } else if (jSONObject2.getJSONObject("PaiMai") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PaiMai, jSONObject2.getJSONObject("PaiMai"));
                } else if (jSONObject2.getJSONObject("Ubee") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Ubee, jSONObject2.getJSONObject("Ubee"));
                } else if (jSONObject2.getJSONObject("Horizontal_live_rotate") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_live_rotate, jSONObject2.getJSONObject("Horizontal_live_rotate"));
                } else if (jSONObject2.getJSONObject("Reward") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Reward, jSONObject2.getJSONObject("Reward"));
                } else if (jSONObject2.getJSONObject("PCG") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PCG, jSONObject2.getJSONObject("PCG"));
                } else if (jSONObject2.getJSONObject("NegativeFeedback") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_NegativeFeedback, jSONObject2.getJSONObject("NegativeFeedback"));
                } else if (jSONObject2.getJSONObject("HideVideoShowError") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideShowVideoError, jSONObject2.getJSONObject("HideVideoShowError"));
                } else if (jSONObject2.getJSONObject("HideFandom") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandom, jSONObject2.getJSONObject("HideFandom"));
                } else if (jSONObject2.getJSONObject("HideReplayLive") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideReplayLive, jSONObject2.getJSONObject("HideReplayLive"));
                } else if (jSONObject2.getJSONObject("HideHiglightLive") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideHiglightLive, jSONObject2.getJSONObject("HideHiglightLive"));
                } else if (jSONObject2.getJSONObject("HideContainerCloseICON") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Container_HideCloseICON, jSONObject2.getJSONObject("HideContainerCloseICON"));
                } else if (jSONObject2.getJSONObject("HideHalfDetail") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Hide_Half_Detail, jSONObject2.getJSONObject("HideHalfDetail"));
                } else if (jSONObject2.getJSONObject("HorizontalScrolle") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_Scrolle, jSONObject2.getJSONObject("HorizontalScrolle"));
                } else if (jSONObject2.getJSONObject("DisableAVATARCOMMENTMIX") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_AVATAR_COMMENT_MIX, jSONObject2.getJSONObject("DisableAVATARCOMMENTMIX"));
                } else if (jSONObject2.getJSONObject("DisableBackwardTips") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_BackwardTips, jSONObject2.getJSONObject("DisableBackwardTips"));
                } else if (jSONObject2.getJSONObject("TLOAI_RecommendDXCard") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_RecommendDXCard, jSONObject2.getJSONObject("TLOAI_RecommendDXCard"));
                } else if (jSONObject2.getJSONObject("PvBySelf") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PV_BYSELF, jSONObject2.getJSONObject("PvBySelf"));
                } else if (jSONObject2.getJSONObject("EnablePerceptionHalfDetailByEvent") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Enable_Perception_Half_Detail_By_Event, jSONObject2.getJSONObject("EnablePerceptionHalfDetailByEvent"));
                } else if (jSONObject2.getJSONObject("EnableResetMuteFromSettingWhenResume") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_EnableResetMuteFromSettingWhenResume, jSONObject2.getJSONObject("EnableResetMuteFromSettingWhenResume"));
                } else if (jSONObject2.getJSONObject("EnableTopMask") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TOP_MASK, jSONObject2.getJSONObject("EnableTopMask"));
                } else if (jSONObject2.getJSONObject("DisableFinish") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_Finish, jSONObject2.getJSONObject("DisableFinish"));
                } else if (jSONObject2.getJSONObject("AddCustomPageExtParams") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_AddCustomPageExtParams, jSONObject2.getJSONObject("AddCustomPageExtParams"));
                } else if (jSONObject2.getJSONObject("SpecialSmallWindow") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_SpecialSmallWindow, jSONObject2.getJSONObject("SpecialSmallWindow"));
                } else if (jSONObject2.getJSONObject("CustomizedTopLeftOrder") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopLeftOrder, jSONObject2.getJSONObject("CustomizedTopLeftOrder"));
                } else if (jSONObject2.getJSONObject("CustomizedToast") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedToast, jSONObject2.getJSONObject("CustomizedToast"));
                } else if (jSONObject2.getJSONObject("CustomizedTopMask") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopMask, jSONObject2.getJSONObject("CustomizedTopMask"));
                } else if (jSONObject2.getJSONObject("TabUnselectedReportLiveEnd") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TabUnselectedReportLiveEnd, jSONObject2.getJSONObject("TabUnselectedReportLiveEnd"));
                } else if (jSONObject2.getJSONObject("HideFandomAndRefreshLiveRoom") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandomAndRefreshLiveRoom, jSONObject2.getJSONObject("HideFandomAndRefreshLiveRoom"));
                } else if (jSONObject2.getJSONObject("ReplayStatusShowLiveEnd") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_ReplayStatusShowLiveEnd, jSONObject2.getJSONObject("ReplayStatusShowLiveEnd"));
                } else if (jSONObject2.getJSONObject("RefreshOrRemoveLiveRoomWhenVisible") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_RefreshOrRemoveLiveRoomWhenVisible, jSONObject2.getJSONObject("RefreshOrRemoveLiveRoomWhenVisible"));
                } else if (jSONObject2.getJSONObject("LRCommentFeatMap") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRCommentFeatMap, jSONObject2.getJSONObject("LRCommentFeatMap"));
                } else if (jSONObject2.getJSONObject("CustomizedSimpleLive") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive, jSONObject2.getJSONObject("CustomizedSimpleLive"));
                }
            }
            pkgVar.c = hashMap;
            return null;
        }
        return -1;
    }

    private JSONObject a(String str) {
        JSONObject b;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        String b2 = b(str);
        String customConfig = OrangeConfig.getInstance().getCustomConfig("tbliveOpenConfig", b2);
        String str2 = "AuthConfig_" + str;
        if (!StringUtils.isEmpty(customConfig) && (b = pqj.b(customConfig)) != null) {
            JSONObject jSONObject2 = b.getJSONObject(str2);
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            JSONObject b3 = pqj.b(b2);
            if (b3 != null && (jSONObject = b3.getJSONObject(str2)) != null) {
                return jSONObject;
            }
        }
        return JSONObject.parseObject(customConfig);
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString(), (Object) JSONObject.parseObject(this.b));
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_H5VideoCard.toString(), (Object) JSONObject.parseObject(this.c));
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString(), (Object) JSONObject.parseObject(this.d));
            if (a()) {
                jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.toString(), (Object) JSONObject.parseObject(this.l));
            } else {
                jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.toString(), (Object) JSONObject.parseObject(this.g));
            }
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_HomeTab.toString(), (Object) JSONObject.parseObject(this.h));
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString(), (Object) JSONObject.parseObject(this.i));
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Shop2F.toString(), (Object) JSONObject.parseObject(this.k));
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_NewShop.toString(), (Object) JSONObject.parseObject(this.m));
        } catch (Exception e) {
            String str2 = f;
            q.b(str2, "createLocalRules error" + e);
            e.printStackTrace();
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("AuthConfig_" + str, (Object) jSONObject);
        return jSONObject2.toJSONString();
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : u.bb() == 5;
    }

    public void b(pkg pkgVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e84a600d", new Object[]{this, pkgVar});
            return;
        }
        String str2 = null;
        if (pkgVar != null && !StringUtils.isEmpty(pkgVar.b) && TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString().equals(pkgVar.b)) {
            if (pkgVar.f == null || pkgVar.f.get(d.LIVE_HOME_PAGE_TYPE) == null) {
                str = null;
            } else if (d.LIVE_HOME_PAGE_TYPE_mixLiveAndTab.equals(String.valueOf(pkgVar.f.get(d.LIVE_HOME_PAGE_TYPE)))) {
                str = b.a("2.1", this.e);
            } else {
                str = b.b("2.1", this.d);
            }
            if (this.f32701a != null && !StringUtils.isEmpty(str)) {
                this.f32701a.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString(), (Object) pqj.b(str));
            }
        }
        if (pkgVar == null || StringUtils.isEmpty(pkgVar.b) || !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(pkgVar.b)) {
            return;
        }
        if (pkgVar.f != null && pkgVar.f.get(d.LIVE_HOME_PAGE_TYPE) != null) {
            if (d.LIVE_HOME_PAGE_TYPE_mixLiveAndTab.equals(String.valueOf(pkgVar.f.get(d.LIVE_HOME_PAGE_TYPE)))) {
                str2 = b.a("2.1", this.j);
            } else {
                str2 = b.b("2.1", this.i);
            }
        }
        if (this.f32701a == null || StringUtils.isEmpty(str2)) {
            return;
        }
        this.f32701a.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString(), (Object) pqj.b(str2));
    }
}
