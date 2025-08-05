package com.taobao.taolive.sdk.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.ShareGoodMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.model.message.TextMessage;
import java.util.HashMap;
import org.json.JSONException;
import tb.kge;
import tb.nog;
import tb.pqj;

/* loaded from: classes8.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SYS_PREFIX = "⁂∰⏇";

    static {
        kge.a(-1286036612);
    }

    public static ChatMessage a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("9ce3ccec", new Object[]{tLiveMsg});
        }
        ChatMessage chatMessage = new ChatMessage();
        if (tLiveMsg.type == 10105) {
            try {
                TextMessage textMessage = (TextMessage) JSON.parseObject(new String(tLiveMsg.data), TextMessage.class);
                chatMessage.mContent = textMessage.message;
                chatMessage.mMessageId = tLiveMsg.timestamp;
                chatMessage.mUserNick = tLiveMsg.from;
                chatMessage.mTimestamp = tLiveMsg.timestamp;
                chatMessage.mUserId = l.b(tLiveMsg.userId);
                chatMessage.renders = (HashMap) textMessage.params;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return chatMessage;
    }

    public static ChatMessage b(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("f5ef186d", new Object[]{tLiveMsg});
        }
        try {
            ChatMessage chatMessage = new ChatMessage();
            JSONObject parseObject = JSON.parseObject(new String(tLiveMsg.data));
            chatMessage.mContent = parseObject.getString("content");
            chatMessage.mTimestamp = tLiveMsg.timestamp;
            JSONObject jSONObject = parseObject.getJSONObject("userInfo");
            if (jSONObject != null) {
                chatMessage.mUserNick = jSONObject.getString("publisherNick");
                chatMessage.mUserId = jSONObject.getLongValue("publisherId");
            }
            JSONArray jSONArray = parseObject.getJSONArray(ChatMessage.KEY_MEDAL_LIST_DT);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(ChatMessage.KEY_MEDAL_LIST_DT, jSONArray.toJSONString());
            chatMessage.renders = hashMap;
            return chatMessage;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new org.json.JSONObject(str).optString("type");
        } catch (Exception unused) {
            return null;
        }
    }

    public static LiveItem a(ShareGoodMessage shareGoodMessage) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem) ipChange.ipc$dispatch("c0ac673a", new Object[]{shareGoodMessage});
        }
        LiveItem liveItem = new LiveItem();
        liveItem.itemName = shareGoodMessage.itemName;
        liveItem.itemPrice = shareGoodMessage.itemPrice;
        liveItem.itemPic = shareGoodMessage.itemPic;
        liveItem.itemId = l.b(shareGoodMessage.itemId);
        liveItem.liveId = shareGoodMessage.liveId;
        liveItem.itemUrl = shareGoodMessage.itemUrl;
        liveItem.itemH5TaokeUrl = shareGoodMessage.itemH5TaokeUrl;
        Object b = pqj.b(shareGoodMessage.itemExtData);
        if (b instanceof JSONObject) {
            liveItem.itemExtData = (JSONObject) b;
            for (String str : liveItem.itemExtData.keySet()) {
                if (!TextUtils.isEmpty(str) && (obj = liveItem.itemExtData.get(str)) != null && !(obj instanceof JSON)) {
                    liveItem.itemExtData.put(str, (Object) obj.toString());
                }
            }
        }
        liveItem.extendVal = (LiveItem.Ext) pqj.a(pqj.a(shareGoodMessage.extendVal), LiveItem.Ext.class);
        if (liveItem.extendVal == null) {
            liveItem.extendVal = new LiveItem.Ext();
        }
        if (shareGoodMessage.extendVal != null) {
            liveItem.extendVal.itemType = shareGoodMessage.extendVal.get("itemType");
            liveItem.extendVal.groupInfo = shareGoodMessage.extendVal.get("groupInfo");
            liveItem.extendVal.anchorId = shareGoodMessage.extendVal.get("anchorId");
            liveItem.extendVal.liveId = shareGoodMessage.extendVal.get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
            liveItem.extendVal.adgrid = shareGoodMessage.extendVal.get("adgrid");
            liveItem.extendVal.refpid = shareGoodMessage.extendVal.get("refpid");
            liveItem.extendVal.isBulk = shareGoodMessage.extendVal.get("isBulk");
            liveItem.extendVal.bulkPrice = shareGoodMessage.extendVal.get("bulkPrice");
            liveItem.extendVal.bulkSize = l.a(shareGoodMessage.extendVal.get("bulkSize"));
            liveItem.extendVal.bulkEndTime = shareGoodMessage.extendVal.get("bulkEndTime");
            liveItem.extendVal.itemPick = shareGoodMessage.extendVal.get("itemPick");
            liveItem.extendVal.commission = shareGoodMessage.extendVal.get("commission");
            liveItem.extendVal.business = shareGoodMessage.extendVal.get("business");
            liveItem.extendVal.needJumpH5 = l.d(shareGoodMessage.extendVal.get("needJumpH5"));
            liveItem.extendVal.userType = shareGoodMessage.extendVal.get(nog.PRD_USER_TYPE);
            liveItem.extendVal.itemTags = shareGoodMessage.extendVal.get("itemTags");
            liveItem.extendVal.msgUuid = shareGoodMessage.extendVal.get(com.taobao.taolive.sdk.model.d.TYPE_MSG_UUID);
            liveItem.extendVal.enableSKU = c(shareGoodMessage.extendVal.get("enableSKU"));
            liveItem.extendVal.itemBizType = shareGoodMessage.extendVal.get("itemBizType");
            liveItem.extendVal.groupItemTradeParams = shareGoodMessage.extendVal.get("groupItemTradeParams");
            liveItem.extendVal.groupItemTitle = shareGoodMessage.extendVal.get("groupItemTitle");
            liveItem.extendVal.canEnjoyDiscounts = shareGoodMessage.extendVal.get("canEnjoyDiscounts");
            liveItem.extendVal.groupItemShowPrice = shareGoodMessage.extendVal.get("groupItemShowPrice");
            liveItem.extendVal.discountsQuota = shareGoodMessage.extendVal.get("discountsQuota");
            liveItem.extendVal.groupItemInfos = shareGoodMessage.extendVal.get("groupItemInfos");
        }
        return liveItem;
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return true;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("jsData");
            if (optJSONObject != null) {
                return optJSONObject.optBoolean("presentingHierarchy");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }
}
