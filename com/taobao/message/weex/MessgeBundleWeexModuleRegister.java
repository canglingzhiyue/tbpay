package com.taobao.message.weex;

import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.message.message_open_api_adapter.OpenAPI4WindVane;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.bridge.ModuleFactory;
import com.taobao.weex.common.WXException;
import com.taobao.weex.ui.IFComponentHolder;
import com.taobao.weex.ui.config.ConfigComponentHolder;
import com.taobao.weex.ui.config.ConfigModuleFactory;
import tb.kge;

/* loaded from: classes7.dex */
public class MessgeBundleWeexModuleRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "IMWeexModuleRegister";

    static {
        kge.a(-1855096709);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        try {
            TLog.logd(TAG, "init:", "IMWeexModuleRegister init called");
            registerModule("msg-weexContainer", "com.taobao.message.weex.WeexContainerModule", new String[]{"show", "dismiss", "margin"});
            registerModule("msg-send", "com.taobao.message.weex.WeexMsgSendModule", new String[]{"sendText", "sendRichShare", "sendWeexCard", "sendGoodsFocusCard", "sendSystemMessage"});
            registerModule("msgRoute", "com.taobao.message.weex.MsgWeexRouteModule", new String[]{"sendMessage"});
            registerModule("msg-wxcard", "com.taobao.message.message_open_api_adapter.weexcompat.interact.WXInteractBaseModule", new String[]{"sendNotifyEvent", LoginConstants.SHOW_TOAST, "showSelectDialog", "deleteMessage", "forward"});
            registerModule("msgKV", "com.taobao.message.message_open_api_adapter.weexcompat.WeexMsgKVModule", new String[]{"setKV", "getKV"});
            String[] strArr = {"selector", "send", LoginConstants.SHOW_TOAST, "showSelectDialog", "showAlertDialog", "checkNetwork", "getUserInfo", "showSelectGoodsPage", "onEventMainThread", "getServerTimestamp", "addSystemMessage", WindvanePluginRegister.WVWindowInfoPlugin.ACTION_GET_STATUS_BAR_HEIGHT, "getCapitalLetter", "beta", "isEmptyLocalGoodsList", "deleteConversation", "encode64", "decode64", "getABResultAsync"};
            registerModule("msgExtend", "com.taobao.message.weex.MsgWeexBaseModule", strArr);
            registerModule("tbmsg-weex-base", "com.taobao.message.weex.MsgWeexBaseModule", strArr);
            registerModule("msgExtendProfile", "com.taobao.message.message_open_api_adapter.weexcompat.MsgWeexProfileModule", new String[]{"registerReceiverOnCreated", "unRegisterReceiverOnDestroyed", "nav", "addFriend", "removeFriend", "updateGroupUserInfo", "showUserImage", "getRemindWithSessionId", "setRemindWithSessionId"});
            registerModule("mpm-interact-base", "com.taobao.message.message_open_api_adapter.weexcompat.interact.WXInteractBaseModule", new String[]{"sendNotifyEvent", LoginConstants.SHOW_TOAST, "showSelectDialog", "deleteMessage", "forward", "sendWeexServiceEvent"});
            registerModule("mpm-interact-chatLayer", "com.taobao.message.message_open_api_adapter.weexcompat.interact.WXInteractChatModule", new String[]{"setExtendStatus", "setInitSpaceHeight", "setInputText", "setReplyMessage", "setInputStickyWidget", "closeInputStickyWidget"});
            registerModule("mpm-interact-common", "com.taobao.message.message_open_api_adapter.weexcompat.interact.WXInteractCommonModule", new String[]{"setBackgroundColor", "setBackgroundImage", "setBgGradientColor"});
            registerModule("mpm-interact-fixLayer", "com.taobao.message.message_open_api_adapter.weexcompat.interact.WXInteractFixModule", new String[]{"addComponent", "updateComponent", "removeComponent"});
            registerModule("mpm-interact-navibar", "com.taobao.message.message_open_api_adapter.weexcompat.interact.WXInteractHeaderModule", new String[]{"setTitle", "setSubTitle", "setLeftItem", "setRightItem", "setMoreItem", "setBackgroundColor", "setBgGradientColor", "setBackgroundImage", "setFontColor", "setVisible"});
            registerModule("msg-chat-interact", "com.taobao.message.message_open_api_adapter.weexcompat.interact.CompatWXInteractChatModule", new String[]{"setExtendStatus", "setInitSpaceHeight", "setInputText", "setFixedStatus"});
            registerModule("msg-chat-navigation", "com.taobao.message.message_open_api_adapter.weexcompat.interact.CompatWXInteractHeaderModule", new String[]{"setTitle", "setSubTitle", "setLeftItem", "setRightItem", "setMoreItem", "setBackgroundColor", "setFontColor", "setVisibility"});
            registerModule("msg-dynamic-panel", "com.taobao.message.message_open_api_adapter.weexcompat.interact.CompatWXInteractContextModule", new String[]{NetworkAbility.API_GET_TYPE, "getVersion", "actionEvent", "setBackgroundColor"});
            registerModule("msg-global-event", "com.taobao.message.message_open_api_adapter.weexcompat.WeexMsgGlobalEventModule", new String[]{"messageCountChanged"});
            registerModule("msg-permission-request", "com.taobao.message.message_open_api_adapter.weexcompat.WeexPermissionRequestModule", new String[]{TBRunTimePermission.REQUEST_PERMISSION_API_NAME, "requestPermissionForResult"});
            registerModule("msg-contacts", "com.taobao.message.weex.WeexContactsModule", new String[]{"refresh", "markReaded", "markPlayBubble", "showAddTaoFriendDialog", "operateFriend", "share", "getTaoFriendsList", "getSubscibeList"});
            registerModule("msg-xhq", "com.taobao.message.weex.WeexWHQModule", new String[]{"isGuide"});
            registerModule("msg-pinyin", "com.taobao.message.message_open_api_adapter.WeexPinyinModule", new String[]{"getSimplePinyin", "getFullPinyin", "getFirstChar", "pinyinCompare"});
            registerModule("msg-category", "com.taobao.message.weex.WeexMsgCategoryModule", new String[]{"setItem", "getItem"});
            registerModule("mpm-open-api", "com.taobao.message.message_open_api_adapter.OpenAPI4Weex", new String[]{"call", "getVersions"});
            q.a("OpenAPI4WindVane", (Class<? extends e>) OpenAPI4WindVane.class);
        } catch (WXException e) {
            TLog.loge(TAG, "init:", e);
        }
    }

    private static void registerModule(String str, String str2, String[] strArr) throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239b02d5", new Object[]{str, str2, strArr});
        } else {
            WXSDKEngine.registerModule(str, (ModuleFactory) new ConfigModuleFactory(str, str2, strArr), false);
        }
    }

    private static void registerComonent(String str, String str2, String[] strArr) throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16494cd6", new Object[]{str, str2, strArr});
        } else {
            WXSDKEngine.registerComponent((IFComponentHolder) new ConfigComponentHolder(str, false, str2, strArr), false, str);
        }
    }
}
