package com.taobao.android.live.plugin.proxy.ir.room;

import android.app.Activity;
import android.content.Context;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.ir.IRProxy;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import java.util.HashMap;
import java.util.Map;
import tb.dds;
import tb.plh;

/* loaded from: classes6.dex */
public interface IRRoomProxy extends IRProxy {
    public static final String CLICK_COMMENT_SEND = "CLICK_COMMENT_SEND";
    public static final String KEY = "IRRoomProxy";
    public static final String KEY_CHAT_WISH_LIST = "KEY_CHAT_WISH_LIST";
    public static final String KEY_DIANTAO = "IRRoomProxyDianTao";
    public static final String OPEN_COMMENT = "OPEN_COMMENT";
    public static final String PARAM_CHAT_RENDERS_ENHANCE = "PARAM_CHAT_RENDERS_ENHANCE";
    public static final String R_ID_TAOLIVE_BTN_HOME = "R.id.taolive_btn_home";
    public static final String R_ID_TAOLIVE_CHATROOM_BCLINK_CONTAINER = "R.id.taolive_chatroom_bclink_container";
    public static final String R_ID_TAOLIVE_CLOSE_BTN = "R.id.taolive_close_btn";
    public static final String R_ID_TAOLIVE_OPEN_GOODS_FRAME = "R.id.taolive_open_goods_frame";
    public static final String R_ID_TAOLIVE_OPEN_H_5_ROOT_VIEW_FRAME = "R.id.taolive_open_h5_root_view_frame";
    public static final String R_ID_TAOLIVE_OPEN_INTERACT_PANEL_FRAME = "R.id.taolive_open_interact_panel_frame";
    public static final String R_ID_TAOLIVE_VIDEO_HOLE_IMAGE = "R.id.taolive_video_hole_image";

    BaseFrame createH5DynamicSDKFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar);

    BaseFrame createMediaPlatformFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar);

    BaseFrame createMediaPlatformFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar);

    plh createSendMessageListener(Context context, a aVar);

    boolean enableNewSpm4Shop();

    HashMap<String, String> getConstantsValue();

    String getLiveAndHomeMixSpm();

    dds getLiveDetailMessInfo(a aVar);

    Map<String, Integer> getRoomRIdMap();

    plh getSendMessageListener(Context context);

    ATaoLiveOpenEntity getTaoliveOpenLiveRoomEntity(a aVar);

    boolean instanceofTBLiveBizDataModel(Object obj);

    String liveDetailMessInfoGetSNSNick();

    boolean liveDetailMessInfoIsLegal();

    boolean liveInteractiveManagerNotNull(Object obj);

    boolean platformUtilsShouldOpenOnce(String str, String str2);

    AccountInfo roomDataAdapterGetBroadCaster();

    String roomDataAdapterGetTopic();

    void showShare(Activity activity, boolean z, Map<String, String> map);

    void tbLiveContainerManagerNotifyMsg(String str, Map<String, Object> map);

    void trackUtilsCommitTap(String str, String... strArr);

    void updateNextPageProperties();

    void userActionManagerAddUserAction(Context context, String str, String str2);

    boolean userActionManagerHasUserAction(Context context, String str, String str2);
}
