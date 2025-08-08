package com.taobao.taolive.sdk.configurable;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.pnj;

/* loaded from: classes8.dex */
public class ComponentGroupConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BOTTOM_BOTTOM_GROUP = "BottomGroup";
    public static final String BOTTOM_COMMENT_BACK_LIVING_BUTTON = "BackLivingButton";
    public static final String BOTTOM_COMMENT_INPUT_BUTTON = "CommentInputButton";
    public static final String BOTTOM_GOOD_ENTRANCE = "GoodEntrance";
    public static final String BOTTOM_LIKE_BUTTON = "LikeButton";
    public static final String BOTTOM_MINI_BUTTON = "MiniButton";
    public static final String BOTTOM_MORE_BUTTON = "MoreButton";
    public static final String BOTTOM_REFUND_FOR_MINORS = "RefundForMinors";
    public static final String BOTTOM_REPORT_LIVE_ROOM = "ReportLiveRoom";
    public static final String BOTTOM_REWARD_BUTTON = "RewardButton";
    public static final String BOTTOM_SHARE_BUTTON = "ShareButton";
    public static final String GROUP_BOTTOM = "BottomGroup";
    public static final String GROUP_LEFT_BOTTOM = "LeftBottomGroup";
    public static final String GROUP_LEFT_SIDE = "LeftSideGroup";
    public static final String GROUP_NON_FIRST_SCREEN = "NonFirstScreenGroup";
    public static final String GROUP_RIGHT_BOTTOM = "RightBottomGroup";
    public static final String GROUP_RIGHT_SIDE = "RightSideGroup";
    public static final String GROUP_TOP = "TopGroup";
    public static final String LEFT_BOTTOM_ATMOS_ENTER = "AtmosEnter";
    public static final String LEFT_BOTTOM_COMMENTS = "Comments";
    public static final String LEFT_BOTTOM_GIFT_SHOW = "GiftShow";
    public static final String LEFT_BOTTOM_IMPORTANT_NOTICE = "ImportantNotice";
    public static final String LEFT_SIDE_FANS_PUSH = "FansPush";
    public static final String LEFT_SIDE_LEFT_BANNER = "LeftBanner";
    public static final String LEFT_SIDE_LEFT_NOTICE = "LeftNotice";
    public static final String LEFT_SIDE_LIVE_QA_BIZ = "LiveQABiz";
    public static final String NON_FIRST_SCREEN_BC_LINK_WATCH = "BCLinkWatch";
    public static final String NON_FIRST_SCREEN_CLEAN_SCREEN = "CleanScreen";
    public static final String NON_FIRST_SCREEN_DOUBLE_LIKE = "DoubleLike";
    public static final String NON_FIRST_SCREEN_LIVE_ANCHOR_PAGE = "LiveAnchorPage";
    public static final String NON_FIRST_SCREEN_LIVE_BC_LINK_BIZ = "LiveBCLinkBiz";
    public static final String NON_FIRST_SCREEN_MULTI_BB_LINK_WATCH = "MultiBBLinkWatch";
    public static final String NON_FIRST_SCREEN_TOP_NOTICE = "TopNotice";
    public static final String RIGHT_BOTTOM_RIGHT_GOODS_CARD = "RightGoodsCard";
    public static final String RIGHT_SIDE_INTERACTION_ENTRANCE = "InteractionEntrance";
    public static final String RIGHT_SIDE_LIVE_MORE_ENTRANCE = "LiveMoreEntrance";
    public static final String RIGHT_SIDE_LIVE_WATER_MARK = "LiveWaterMark";
    public static final String RIGHT_SIDE_TAB2_LIVE_MORE_ENTRANCE = "Tab2LiveMoreEntrance";
    public static final String RIGHT_SIDE_VIRTUAL_HOST_TAG = "VirtualHostTag";
    private static final String TAG = "ComponentGroupConfig";
    public static final String TOP_ACCOUNT_INFO = "AccountInfo";
    public static final String TOP_INTIMACY_ENTRANCE = "IntimacyEntrance";
    public static final String TOP_REWARD_RANK = "RewardRank";
    public static final String TOP_WATCH_NUM = "WatchNum";
    private ConfigurableConfig configurableConfig;

    static {
        kge.a(-86799);
        kge.a(1028243835);
    }

    public void setConfigurableConfig(ConfigurableConfig configurableConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5373eb", new Object[]{this, configurableConfig});
        } else {
            this.configurableConfig = configurableConfig;
        }
    }

    public ConfigurableConfig getConfigurableConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConfigurableConfig) ipChange.ipc$dispatch("ca35f905", new Object[]{this}) : this.configurableConfig;
    }

    public static ComponentGroupConfig defaultComponentGroupConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentGroupConfig) ipChange.ipc$dispatch("59924868", new Object[0]);
        }
        ComponentGroupConfig componentGroupConfig = new ComponentGroupConfig();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ITaoLiveComponentConfig iTaoLiveComponentConfig = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig.cName = TOP_ACCOUNT_INFO;
        iTaoLiveComponentConfig.objName = TOP_ACCOUNT_INFO;
        arrayList.add(iTaoLiveComponentConfig);
        ITaoLiveComponentConfig iTaoLiveComponentConfig2 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig2.cName = TOP_REWARD_RANK;
        iTaoLiveComponentConfig2.objName = TOP_REWARD_RANK;
        arrayList.add(iTaoLiveComponentConfig2);
        ITaoLiveComponentConfig iTaoLiveComponentConfig3 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig3.cName = TOP_INTIMACY_ENTRANCE;
        iTaoLiveComponentConfig3.objName = TOP_INTIMACY_ENTRANCE;
        arrayList.add(iTaoLiveComponentConfig3);
        ITaoLiveComponentConfig iTaoLiveComponentConfig4 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig4.cName = TOP_WATCH_NUM;
        iTaoLiveComponentConfig4.objName = TOP_WATCH_NUM;
        arrayList.add(iTaoLiveComponentConfig4);
        ITaoLiveComponentConfig iTaoLiveComponentConfig5 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig5.cName = GROUP_TOP;
        iTaoLiveComponentConfig5.objName = GROUP_TOP;
        iTaoLiveComponentConfig5.cList = arrayList;
        hashMap.put(GROUP_TOP, iTaoLiveComponentConfig5);
        ArrayList arrayList2 = new ArrayList();
        ITaoLiveComponentConfig iTaoLiveComponentConfig6 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig6.cName = LEFT_SIDE_LEFT_BANNER;
        iTaoLiveComponentConfig6.objName = LEFT_SIDE_LEFT_BANNER;
        arrayList2.add(iTaoLiveComponentConfig6);
        ITaoLiveComponentConfig iTaoLiveComponentConfig7 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig7.cName = LEFT_SIDE_LIVE_QA_BIZ;
        iTaoLiveComponentConfig7.objName = LEFT_SIDE_LIVE_QA_BIZ;
        arrayList2.add(iTaoLiveComponentConfig7);
        ITaoLiveComponentConfig iTaoLiveComponentConfig8 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig8.cName = LEFT_SIDE_LEFT_NOTICE;
        iTaoLiveComponentConfig8.objName = LEFT_SIDE_LEFT_NOTICE;
        arrayList2.add(iTaoLiveComponentConfig8);
        ITaoLiveComponentConfig iTaoLiveComponentConfig9 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig9.cName = LEFT_SIDE_FANS_PUSH;
        iTaoLiveComponentConfig9.objName = LEFT_SIDE_FANS_PUSH;
        arrayList2.add(iTaoLiveComponentConfig9);
        ITaoLiveComponentConfig iTaoLiveComponentConfig10 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig10.cName = GROUP_LEFT_SIDE;
        iTaoLiveComponentConfig10.objName = GROUP_LEFT_SIDE;
        iTaoLiveComponentConfig10.cList = arrayList2;
        hashMap.put(GROUP_LEFT_SIDE, iTaoLiveComponentConfig10);
        ArrayList arrayList3 = new ArrayList();
        ITaoLiveComponentConfig iTaoLiveComponentConfig11 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig11.cName = RIGHT_SIDE_LIVE_WATER_MARK;
        iTaoLiveComponentConfig11.objName = RIGHT_SIDE_LIVE_WATER_MARK;
        arrayList3.add(iTaoLiveComponentConfig11);
        ITaoLiveComponentConfig iTaoLiveComponentConfig12 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig12.cName = RIGHT_SIDE_LIVE_MORE_ENTRANCE;
        iTaoLiveComponentConfig12.objName = RIGHT_SIDE_LIVE_MORE_ENTRANCE;
        arrayList3.add(iTaoLiveComponentConfig12);
        ITaoLiveComponentConfig iTaoLiveComponentConfig13 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig12.cName = RIGHT_SIDE_TAB2_LIVE_MORE_ENTRANCE;
        iTaoLiveComponentConfig12.objName = RIGHT_SIDE_TAB2_LIVE_MORE_ENTRANCE;
        arrayList3.add(iTaoLiveComponentConfig13);
        ITaoLiveComponentConfig iTaoLiveComponentConfig14 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig14.cName = RIGHT_SIDE_VIRTUAL_HOST_TAG;
        iTaoLiveComponentConfig14.objName = RIGHT_SIDE_VIRTUAL_HOST_TAG;
        arrayList3.add(iTaoLiveComponentConfig14);
        ITaoLiveComponentConfig iTaoLiveComponentConfig15 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig15.cName = RIGHT_SIDE_INTERACTION_ENTRANCE;
        iTaoLiveComponentConfig15.objName = RIGHT_SIDE_INTERACTION_ENTRANCE;
        arrayList3.add(iTaoLiveComponentConfig15);
        ITaoLiveComponentConfig iTaoLiveComponentConfig16 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig16.cName = GROUP_RIGHT_SIDE;
        iTaoLiveComponentConfig16.objName = GROUP_RIGHT_SIDE;
        iTaoLiveComponentConfig16.cList = arrayList3;
        hashMap.put(GROUP_RIGHT_SIDE, iTaoLiveComponentConfig16);
        ArrayList arrayList4 = new ArrayList();
        ITaoLiveComponentConfig iTaoLiveComponentConfig17 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig17.cName = LEFT_BOTTOM_GIFT_SHOW;
        iTaoLiveComponentConfig17.objName = LEFT_BOTTOM_GIFT_SHOW;
        arrayList4.add(iTaoLiveComponentConfig17);
        ITaoLiveComponentConfig iTaoLiveComponentConfig18 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig18.cName = LEFT_BOTTOM_IMPORTANT_NOTICE;
        iTaoLiveComponentConfig18.objName = LEFT_BOTTOM_IMPORTANT_NOTICE;
        arrayList4.add(iTaoLiveComponentConfig18);
        ITaoLiveComponentConfig iTaoLiveComponentConfig19 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig19.cName = LEFT_BOTTOM_ATMOS_ENTER;
        iTaoLiveComponentConfig19.objName = LEFT_BOTTOM_ATMOS_ENTER;
        arrayList4.add(iTaoLiveComponentConfig19);
        ITaoLiveComponentConfig iTaoLiveComponentConfig20 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig20.cName = LEFT_BOTTOM_COMMENTS;
        iTaoLiveComponentConfig20.objName = LEFT_BOTTOM_COMMENTS;
        arrayList4.add(iTaoLiveComponentConfig20);
        ITaoLiveComponentConfig iTaoLiveComponentConfig21 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig21.cName = GROUP_LEFT_BOTTOM;
        iTaoLiveComponentConfig21.objName = GROUP_LEFT_BOTTOM;
        iTaoLiveComponentConfig21.cList = arrayList4;
        hashMap.put(GROUP_LEFT_BOTTOM, iTaoLiveComponentConfig21);
        ArrayList arrayList5 = new ArrayList();
        ITaoLiveComponentConfig iTaoLiveComponentConfig22 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig22.cName = RIGHT_BOTTOM_RIGHT_GOODS_CARD;
        iTaoLiveComponentConfig22.objName = RIGHT_BOTTOM_RIGHT_GOODS_CARD;
        arrayList5.add(iTaoLiveComponentConfig22);
        ITaoLiveComponentConfig iTaoLiveComponentConfig23 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig23.cName = GROUP_RIGHT_BOTTOM;
        iTaoLiveComponentConfig23.objName = GROUP_RIGHT_BOTTOM;
        iTaoLiveComponentConfig23.cList = arrayList5;
        hashMap.put(GROUP_RIGHT_BOTTOM, iTaoLiveComponentConfig23);
        ArrayList arrayList6 = new ArrayList();
        ITaoLiveComponentConfig iTaoLiveComponentConfig24 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig24.cName = "BottomGroup";
        iTaoLiveComponentConfig24.objName = "BottomGroup";
        arrayList6.add(iTaoLiveComponentConfig24);
        ITaoLiveComponentConfig iTaoLiveComponentConfig25 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig25.cName = BOTTOM_COMMENT_INPUT_BUTTON;
        iTaoLiveComponentConfig25.objName = BOTTOM_COMMENT_INPUT_BUTTON;
        arrayList6.add(iTaoLiveComponentConfig25);
        ITaoLiveComponentConfig iTaoLiveComponentConfig26 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig26.cName = BOTTOM_MORE_BUTTON;
        iTaoLiveComponentConfig26.objName = BOTTOM_MORE_BUTTON;
        arrayList6.add(iTaoLiveComponentConfig26);
        ITaoLiveComponentConfig iTaoLiveComponentConfig27 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig27.cName = BOTTOM_MINI_BUTTON;
        iTaoLiveComponentConfig27.objName = BOTTOM_MINI_BUTTON;
        arrayList6.add(iTaoLiveComponentConfig27);
        ITaoLiveComponentConfig iTaoLiveComponentConfig28 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig28.cName = BOTTOM_SHARE_BUTTON;
        iTaoLiveComponentConfig28.objName = BOTTOM_SHARE_BUTTON;
        arrayList6.add(iTaoLiveComponentConfig28);
        ITaoLiveComponentConfig iTaoLiveComponentConfig29 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig29.cName = BOTTOM_LIKE_BUTTON;
        iTaoLiveComponentConfig29.objName = BOTTOM_LIKE_BUTTON;
        arrayList6.add(iTaoLiveComponentConfig29);
        ITaoLiveComponentConfig iTaoLiveComponentConfig30 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig30.cName = BOTTOM_REWARD_BUTTON;
        iTaoLiveComponentConfig30.objName = BOTTOM_REWARD_BUTTON;
        arrayList6.add(iTaoLiveComponentConfig30);
        ITaoLiveComponentConfig iTaoLiveComponentConfig31 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig31.cName = BOTTOM_GOOD_ENTRANCE;
        iTaoLiveComponentConfig31.objName = BOTTOM_GOOD_ENTRANCE;
        arrayList6.add(iTaoLiveComponentConfig31);
        ITaoLiveComponentConfig iTaoLiveComponentConfig32 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig32.cName = BOTTOM_REFUND_FOR_MINORS;
        iTaoLiveComponentConfig32.objName = BOTTOM_REFUND_FOR_MINORS;
        arrayList6.add(iTaoLiveComponentConfig32);
        ITaoLiveComponentConfig iTaoLiveComponentConfig33 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig33.cName = BOTTOM_REPORT_LIVE_ROOM;
        iTaoLiveComponentConfig33.objName = BOTTOM_REPORT_LIVE_ROOM;
        arrayList6.add(iTaoLiveComponentConfig33);
        ITaoLiveComponentConfig iTaoLiveComponentConfig34 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig34.cName = "BottomGroup";
        iTaoLiveComponentConfig34.objName = "BottomGroup";
        iTaoLiveComponentConfig34.cList = arrayList6;
        hashMap.put("BottomGroup", iTaoLiveComponentConfig34);
        ArrayList arrayList7 = new ArrayList();
        ITaoLiveComponentConfig iTaoLiveComponentConfig35 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig35.cName = NON_FIRST_SCREEN_MULTI_BB_LINK_WATCH;
        iTaoLiveComponentConfig35.objName = NON_FIRST_SCREEN_MULTI_BB_LINK_WATCH;
        arrayList7.add(iTaoLiveComponentConfig35);
        ITaoLiveComponentConfig iTaoLiveComponentConfig36 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig36.cName = NON_FIRST_SCREEN_BC_LINK_WATCH;
        iTaoLiveComponentConfig36.objName = NON_FIRST_SCREEN_BC_LINK_WATCH;
        arrayList7.add(iTaoLiveComponentConfig36);
        ITaoLiveComponentConfig iTaoLiveComponentConfig37 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig37.cName = NON_FIRST_SCREEN_LIVE_BC_LINK_BIZ;
        iTaoLiveComponentConfig37.objName = NON_FIRST_SCREEN_LIVE_BC_LINK_BIZ;
        arrayList7.add(iTaoLiveComponentConfig37);
        ITaoLiveComponentConfig iTaoLiveComponentConfig38 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig38.cName = NON_FIRST_SCREEN_LIVE_ANCHOR_PAGE;
        iTaoLiveComponentConfig38.objName = NON_FIRST_SCREEN_LIVE_ANCHOR_PAGE;
        arrayList7.add(iTaoLiveComponentConfig38);
        ITaoLiveComponentConfig iTaoLiveComponentConfig39 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig39.cName = NON_FIRST_SCREEN_CLEAN_SCREEN;
        iTaoLiveComponentConfig39.objName = NON_FIRST_SCREEN_CLEAN_SCREEN;
        arrayList7.add(iTaoLiveComponentConfig39);
        ITaoLiveComponentConfig iTaoLiveComponentConfig40 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig40.cName = NON_FIRST_SCREEN_DOUBLE_LIKE;
        iTaoLiveComponentConfig40.objName = NON_FIRST_SCREEN_DOUBLE_LIKE;
        arrayList7.add(iTaoLiveComponentConfig40);
        ITaoLiveComponentConfig iTaoLiveComponentConfig41 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig41.cName = NON_FIRST_SCREEN_TOP_NOTICE;
        iTaoLiveComponentConfig41.objName = NON_FIRST_SCREEN_TOP_NOTICE;
        arrayList7.add(iTaoLiveComponentConfig41);
        ITaoLiveComponentConfig iTaoLiveComponentConfig42 = new ITaoLiveComponentConfig();
        iTaoLiveComponentConfig42.cName = GROUP_NON_FIRST_SCREEN;
        iTaoLiveComponentConfig42.objName = GROUP_NON_FIRST_SCREEN;
        iTaoLiveComponentConfig42.cList = arrayList7;
        hashMap.put(GROUP_NON_FIRST_SCREEN, iTaoLiveComponentConfig42);
        ConfigurableConfig configurableConfig = new ConfigurableConfig();
        configurableConfig.setConfigMap(hashMap);
        componentGroupConfig.setConfigurableConfig(configurableConfig);
        return componentGroupConfig;
    }

    public static ITaoLiveComponentConfig findITaoLiveComponentConfig(String str, List<ITaoLiveComponentConfig> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveComponentConfig) ipChange.ipc$dispatch("123e37c7", new Object[]{str, list});
        }
        if (!StringUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            for (ITaoLiveComponentConfig iTaoLiveComponentConfig : list) {
                if (iTaoLiveComponentConfig != null && StringUtils.equals(str, iTaoLiveComponentConfig.cName)) {
                    return iTaoLiveComponentConfig;
                }
            }
        }
        return null;
    }

    public static ITaoLiveComponentConfig findITaoLiveComponentConfig(String str, String str2, a aVar) {
        ComponentGroupConfig n;
        Map<String, ITaoLiveComponentConfig> configMap;
        ITaoLiveComponentConfig iTaoLiveComponentConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveComponentConfig) ipChange.ipc$dispatch("9d01fd6d", new Object[]{str, str2, aVar});
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && aVar != null && (n = aVar.n()) != null && n.configurableConfig.getConfigMap() != null && (configMap = n.configurableConfig.getConfigMap()) != null && !configMap.isEmpty() && (iTaoLiveComponentConfig = configMap.get(str)) != null) {
            return findITaoLiveComponentConfig(str2, iTaoLiveComponentConfig.cList);
        }
        return null;
    }

    public static boolean componentEntranceHidden(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28d71c51", new Object[]{str, str2, aVar})).booleanValue();
        }
        ITaoLiveComponentConfig findITaoLiveComponentConfig = findITaoLiveComponentConfig(str, str2, aVar);
        if (findITaoLiveComponentConfig == null || findITaoLiveComponentConfig.entranceHidden == null) {
            return false;
        }
        boolean booleanValue = findITaoLiveComponentConfig.entranceHidden.booleanValue();
        pnj m = pmd.a().m();
        m.a(TAG, "group: " + str + ", component: " + str2 + ", entranceHidden: " + booleanValue);
        return booleanValue;
    }

    public static void setShowComponent(ITaoLiveComponentConfig iTaoLiveComponentConfig, a aVar) {
        ComponentGroupConfig n;
        Map<String, ITaoLiveComponentConfig> configMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782816d6", new Object[]{iTaoLiveComponentConfig, aVar});
        } else if (aVar != null && (n = aVar.n()) != null && n.configurableConfig.getConfigMap() != null && (configMap = n.configurableConfig.getConfigMap()) != null && !configMap.isEmpty() && iTaoLiveComponentConfig != null && iTaoLiveComponentConfig.cList != null && !iTaoLiveComponentConfig.cList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ITaoLiveComponentConfig iTaoLiveComponentConfig2 : iTaoLiveComponentConfig.cList) {
                if (iTaoLiveComponentConfig2 != null && !StringUtils.isEmpty(iTaoLiveComponentConfig2.cName)) {
                    if (iTaoLiveComponentConfig2.cName.contains("Group")) {
                        if (iTaoLiveComponentConfig2.cList != null && !iTaoLiveComponentConfig2.cList.isEmpty()) {
                            for (ITaoLiveComponentConfig iTaoLiveComponentConfig3 : iTaoLiveComponentConfig2.cList) {
                                if (iTaoLiveComponentConfig3 != null) {
                                    if (iTaoLiveComponentConfig3.cName.contains("Group")) {
                                        if (iTaoLiveComponentConfig3.cList != null && !iTaoLiveComponentConfig3.cList.isEmpty()) {
                                            for (ITaoLiveComponentConfig iTaoLiveComponentConfig4 : iTaoLiveComponentConfig3.cList) {
                                                if (iTaoLiveComponentConfig4 != null && !StringUtils.isEmpty(iTaoLiveComponentConfig4.cName) && !iTaoLiveComponentConfig4.cName.contains("Group")) {
                                                    arrayList.add(iTaoLiveComponentConfig4.cName);
                                                }
                                            }
                                        }
                                    } else if (!StringUtils.isEmpty(iTaoLiveComponentConfig3.cName) && !iTaoLiveComponentConfig3.cName.contains("Group")) {
                                        arrayList.add(iTaoLiveComponentConfig3.cName);
                                    }
                                }
                            }
                        }
                    } else {
                        arrayList.add(iTaoLiveComponentConfig2.cName);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            for (Map.Entry<String, ITaoLiveComponentConfig> entry : configMap.entrySet()) {
                if (entry != null && entry.getValue() != null && entry.getValue().cList != null && !entry.getValue().cList.isEmpty()) {
                    for (ITaoLiveComponentConfig iTaoLiveComponentConfig5 : entry.getValue().cList) {
                        if (iTaoLiveComponentConfig5 != null && !StringUtils.isEmpty(iTaoLiveComponentConfig5.cName)) {
                            if (arrayList.contains(iTaoLiveComponentConfig5.cName)) {
                                iTaoLiveComponentConfig5.entranceHidden = false;
                            } else {
                                iTaoLiveComponentConfig5.entranceHidden = true;
                            }
                        }
                    }
                }
            }
        }
    }
}
