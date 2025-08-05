package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public interface d {
    public static final int BIZ_ID = 59;
    public static final String BUNDLE_BUSINESS_ANDROID_NORMAL_ICON = "andorid_normal_icon";
    public static final String BUNDLE_BUSINESS_ANDROID_PRESSED_ICON = "android_pressed_icon";
    public static final String BUNDLE_BUSINESS_ID = "channel_id";
    public static final String BUNDLE_BUSINESS_JUMP_URL = "jump_url";
    public static final String BUNDLE_BUSINESS_POSITION = "page_position";
    public static final String BUNDLE_BUSINESS_TAB_BOTTOM = "tab_bottom";
    public static final String BUNDLE_BUSINESS_TAB_TITLE_NAME = "tab_title_name";
    public static final String BUNDLE_BUSINESS_TAB_TOP = "tab_top";
    public static final String BUNDLE_BUSINESS_TYPE = "business_type";
    public static final String BUNDLE_ENTRY_BOTTOM_CHANNELTYPE = "entry_bottom_channeltype";
    public static final String BUNDLE_ENTRY_CHANNELTYPE = "entry_channeltype";
    public static final String BUNDLE_JINGXUAN_POSITION = "jingxuan_position";
    public static final String BUNDLE_QUERY_PARAMS = "query_params";
    public static final String BUNDLE_SUB_CHANNEL_WSWG_ITEM_ID = "sub_wswg_item_id";
    public static final String BUNDLE_SUB_CHANNEL_WSWG_LIVE_ID = "sub_wswg_live_id";
    public static final String BUNDLE__ENTRY_LIVE_SOURCE = "entryLiveSource";
    public static final String CACHE_KEY_HOME_TABS = "live_home_tabs";
    public static final String CACHE_KEY_HOME_TABS_EVENT = "live_home_tabs_event";
    public static final String CACHE_KEY_SUB_CHANNEL = "live_sub_channel_list";
    public static final String CLICK_MAIDIAN = "clickMaidian";
    public static final String CT_LIVE_FOLLOW_NO_LIVE = "taolive_follow_no_live";
    public static final String CT_LIVE_FOLLOW_RECENT_WATCH = "taoliveRecentWatch";
    public static final String DINAMIC_BIZ_TYPE = "live_channel";
    public static final String DX_FOLLOW_LIVE_CARD = "taolive_live_card";
    public static final String DX_LIVE_HOME_PAGE_TYPE_MIXNOSELECT = "mixNoSelect";
    public static final String DX_LIVE_HOME_PAGE_TYPE_MIXSELECT = "mixSelect";
    public static final String DX_LIVE_HOME_PAGE_TYPE_NORMAL = "normal";
    public static final String EXPOSE_URL = "exposureUrl";
    public static final int IMG_BIE_ID = 31;
    public static final String IMG_BIE_TYPE = "taolivehome";
    public static final String KEY_EXTEND_DEVICE_LEVEL = "deviceLevel";
    public static final String KEY_EXTEND_UUID = "currentSceneUUID";
    public static final String LIVE_EVENT_ON_NEW_INTENT = "com.taobao.live.home.on.new.intent";
    public static final String LIVE_EVENT_TAOLIVE_FAXIAN_INSERTCARD = "com.taobao.taolive.faxian.insertCard";
    public static final String LIVE_EVENT_TAOLIVE_FAXIAN_SCROLLOUTERTOTOP = "com.taobao.taolive.faxian.scrollOuterToTop";
    public static final String LIVE_HOME_PAGE_TYPE = "liveHomePageType";
    public static final String LIVE_HOME_PAGE_TYPE_mixLive = "mixLive";
    public static final String LIVE_HOME_PAGE_TYPE_mixLiveAndTab = "mixLiveAndTab";
    public static final String LIVE_HOME_PAGE_TYPE_normal = "normal";
    public static final String LPM_BIZ_CODE = "HomePage";
    public static final String PARAM_CLICK_CARD_TIME = "clickCardTime";
    public static final String PARAM_COVER_IMAGE = "coverImage";
    public static final String PARAM_GOOD_INFO_JSON = "bubbleGoodInfoJson";
    public static final String PARAM_GOOD_INFO_WEITAO = "goodInfoWeitao";
    public static final String PARAM_LANDSCAPE_VIDEO = "landScapeVideo";
    public static final String PARAM_MEDIA_INFO = "mediaInfo";
    public static final String PARAM_MEDIA_INFO_ADTRANSPARAMS = "adTransParams";
    public static final String PARAM_MEDIA_INFO_ARTPURL = "artpUrl";
    public static final String PARAM_MEDIA_INFO_AUTHKEY = "auth_key";
    public static final String PARAM_MEDIA_INFO_FLVURL = "flvUrl";
    public static final String PARAM_MEDIA_INFO_H265 = "h265";
    public static final String PARAM_MEDIA_INFO_H265URL = "h265Url";
    public static final String PARAM_MEDIA_INFO_HLSURL = "hlsUrl";
    public static final String PARAM_MEDIA_INFO_LIVEURL = "liveUrl";
    public static final String PARAM_MEDIA_INFO_LIVEURLHLS = "liveUrlHls";
    public static final String PARAM_MEDIA_INFO_MEDIACONFIG = "mediaConfig";
    public static final String PARAM_MEDIA_INFO_NAME = "name";
    public static final String PARAM_MEDIA_INFO_RATEADAPTE = "rateAdapte";
    public static final String PARAM_MEDIA_INFO_RESOURCES = "liveUrlList";
    public static final String PARAM_MEDIA_INFO_USEARTP = "useArtp";
    public static final String PARAM_MEDIA_INFO_definition = "definition";
    public static final String PARAM_MEDIA_INFO_wholeH265FlvUrl = "wholeH265FlvUrl";
    public static final String PARAM_TIME_PLAY_URL = "timePointPlayUrl";
    public static final String QUERY_PARAMS = "queryParams";
    public static final String SHARED_PREFERENCES_EXIT_HOME_LAST_ONSELECT_TAB = "exit_home_last_onselect_tab";
    public static final String SHARED_PREFERENCES_SHOWTASKINSIGNIN_KEY = "show_taskinsignin_interval_time";
    public static final String SHOW_MAIDIAN = "showMaidian";
    public static final String START_CHANNEL_TYPE = "START_CHANNEL_TYPE";
    public static final String START_CONTENT_ID = "START_CONTENT_ID";
    public static final String START_SUB_CONTENT_ID = "START_SUB_CONTENT_ID";
    public static final String TAB_B_CROSS_STREET = "crossStreet";
    public static final String TAB_B_ITEM_CHANNEL = "itemChannel";
    public static final String TAB_B_LIKE_BIG = "likeBig";
    public static final String TAB_B_SELECTED = "jingxuan";
    public static final String TAB_FOLLOW = "followTab";
    public static final String TAB_SELECTED = "jingxuan";
    public static final String TAB_SINGLELIVE = "singleLiveTab";
    public static final String TAB_SUB_CHANNEL = "subChannel";
    public static final String TAB_TYPE_DX = "dx";
    public static final String TAB_TYPE_H5 = "h5";
    public static final String TAB_TYPE_SINGLESTREAM = "singleStream";
    public static final String TAB_TYPE_WEEX = "weex";
    public static final String TAO_LIVE_FOLLOW_ICON_SJSD_PARAM = "taoliveFollowIconSjsdParam";
    public static final String TAO_LIVE_FOLLOW_ICON_SJSD_SHOW_TIME = "taoliveFollowIconSjsdShowTime";
    public static final String TAO_LIVE_ROOM_SERVICE_VISITEDLIST = "com.taobao.taolive.room.service.VisitedList";
    public static final String URI_FOLLOW_ERROR_TIPS_IMG = "https://gw.alicdn.com/tfs/TB1a2EAtRBh1e4jSZFhXXcC9VXa-330-330.png";
    public static final String URI_SUB_CHANNEL_URL = "https://h5.m.taobao.com/live/channel.html";
    public static final Map<String, String> TABS_TEMPLATE = new HashMap<String, String>() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.utils.Constants$1
        {
            put("jingxuan", "taolive_live_card_longpress");
            put(d.TAB_SUB_CHANNEL, "taolive_live_card_longpress");
            put(d.TAB_FOLLOW, "taolive_live_card_longpress");
            put(d.TAB_B_CROSS_STREET, "taolive_cross_street");
            put(d.TAB_B_LIKE_BIG, "taolive_like_big");
            put(d.TAB_B_ITEM_CHANNEL, "taolive_live_card_longpress");
        }
    };
    public static final Map<String, String> TABS_POPLAYER_URI = new HashMap<String, String>() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.utils.Constants$2
        {
            put(d.TAB_SINGLELIVE, "poplayer://TBLHomepagePopLayerJingXuan_JingXuan");
            put(d.TAB_FOLLOW, "poplayer://TBLHomepagePopLayerJingXuan_GuanZhu");
            put("jingxuan", "poplayer://TBLHomepagePopLayerJingXuan_FaXian");
            put("all", "poplayer://TBLHomepagePopLayerJingXuan");
        }
    };
}
