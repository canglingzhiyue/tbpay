package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pjs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-399290930);
    }

    public Map<OpenAbilityCompontentTypeEnum, b> a(pkg pkgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b327c6c1", new Object[]{this, pkgVar});
        }
        HashMap hashMap = new HashMap();
        if (pkgVar != null && (pkgVar.c instanceof Map)) {
            Map map = (Map) pkgVar.c;
            JSONObject jSONObject = (JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRComponent);
            if (jSONObject != null && jSONObject.getJSONObject("extConfigMap") != null) {
                hashMap.putAll(new b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRComponent, jSONObject.getBoolean("enable").booleanValue(), jSONObject.getJSONObject("extConfigMap").getJSONObject("json").toJSONString()).a());
            }
            JSONObject jSONObject2 = (JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRCommentFeatMap);
            if (jSONObject2 != null && jSONObject2.getJSONObject("extConfigMap") != null) {
                hashMap.putAll(new b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRCommentFeatMap, jSONObject2.getBoolean("enable").booleanValue(), jSONObject2.getJSONObject("extConfigMap").getJSONObject("json").toJSONString()).a());
            }
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_MiniPlayer), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_MiniPlayer, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Link), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Link, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PaiMai), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PaiMai, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Ubee), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Ubee, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Goods_Highlight_Frame), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Goods_Highlight_Frame, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_live_rotate), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_live_rotate, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PCG), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PCG, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Reward), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Reward, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_NegativeFeedback), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_NegativeFeedback, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideShowVideoError), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideShowVideoError, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandom), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandom, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideReplayLive), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideReplayLive, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideHiglightLive), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideHiglightLive, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Container_HideCloseICON), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Container_HideCloseICON, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Hide_Half_Detail), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Hide_Half_Detail, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_Scrolle), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_Scrolle, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_AVATAR_COMMENT_MIX), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_AVATAR_COMMENT_MIX, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_BackwardTips), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_BackwardTips, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_RecommendDXCard), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_RecommendDXCard, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PV_BYSELF), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PV_BYSELF, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Enable_Perception_Half_Detail_By_Event), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Enable_Perception_Half_Detail_By_Event, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_EnableResetMuteFromSettingWhenResume), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_EnableResetMuteFromSettingWhenResume, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_Finish), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_Finish, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TOP_MASK), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TOP_MASK, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_AddCustomPageExtParams), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_AddCustomPageExtParams, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_SpecialSmallWindow), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_SpecialSmallWindow, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedToast), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedToast, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopLeftOrder), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopLeftOrder, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopMask), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopMask, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TabUnselectedReportLiveEnd), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TabUnselectedReportLiveEnd, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandomAndRefreshLiveRoom), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandomAndRefreshLiveRoom, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_ReplayStatusShowLiveEnd), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_ReplayStatusShowLiveEnd, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_RefreshOrRemoveLiveRoomWhenVisible), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_RefreshOrRemoveLiveRoomWhenVisible, hashMap);
            a((JSONObject) map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive, hashMap);
        }
        return hashMap;
    }

    private void a(JSONObject jSONObject, OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum, Map<OpenAbilityCompontentTypeEnum, b> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09bdc19", new Object[]{this, jSONObject, openAbilityCompontentTypeEnum, map});
        } else if (jSONObject != null) {
            map.putAll(new b(openAbilityCompontentTypeEnum, jSONObject.getBoolean("enable").booleanValue(), jSONObject.getJSONObject("extConfigMap")).a());
        } else {
            map.putAll(new b(openAbilityCompontentTypeEnum, false, null).a());
        }
    }
}
