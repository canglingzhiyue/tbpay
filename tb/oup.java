package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.jsbridge.a;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;
import java.util.HashMap;
import tb.obi;

/* loaded from: classes8.dex */
public class oup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_LIST_KEY = "channelList2Show";
    public static final String CONFIG_DATA_KEY = "configData";
    public static final String PANEL_TYPE_KEY = "panelType";
    public static final String SHARE_UT_ARGS = "shareUTArgs";
    public static final String SHOW_CHANNEL_TYPE_KEY = "showChannelType";
    public static final String SHOW_FRIEND_KEY = "showFriend";
    public static final String SHOW_FRIEND_TYPE_KEY = "showFriendType";
    public static final String TAG = "EventBridge";
    public static final String TOOL_LIST_KEY = "toolList2Show";

    static {
        kge.a(-1198632735);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) SubstituteConstants.KEY_CHANNEL_FRIENDS);
        jSONObject.put("state", (Object) (-1));
        a.a().a(a.DATA_STATE_EVENT, jSONObject);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String e = obi.b.e();
        if (StringUtils.isEmpty(e)) {
            e = com.taobao.tao.config.a.a().getString(R.string.share_guide_tips);
        }
        jSONObject.put("url", (Object) e);
        a.a().a(a.SHOW_COVER_EVENT, jSONObject);
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", (Object) Integer.valueOf(i));
        if (i == 2) {
            jSONObject.put("password", (Object) ShareBizAdapter.getInstance().getAppEnv().g());
        }
        a.a().a(a.SHOW_TIPS_EVENT, jSONObject);
    }

    public static void a(String str, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c169bf7b", new Object[]{str, tBShareContent});
        } else if (StringUtils.isEmpty(str) || tBShareContent == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            HashMap hashMap = new HashMap();
            if (tBShareContent.extraParams != null) {
                hashMap.putAll(tBShareContent.extraParams);
            }
            hashMap.put("bizID", tBShareContent.businessId);
            hashMap.put("url", tBShareContent.url);
            hashMap.put("imageUrl", tBShareContent.imageUrl);
            hashMap.put("title", tBShareContent.title);
            hashMap.put("desc", tBShareContent.description);
            jSONObject.put("weexUrl", (Object) str);
            jSONObject.put("params", (Object) new JSONObject(hashMap));
            a.a().a(a.SHOW_GIFT_EVENT, jSONObject);
            nyy.c("showGiftEvent", "weexUrl:" + str);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("date", str);
        hashMap.put("originDate", str2);
        a.a().a("qrCodeValidDate", new JSONObject(hashMap));
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        String targetByType = ShareTargetType.getTargetByType(str);
        HashMap hashMap = new HashMap();
        hashMap.put("target", targetByType);
        hashMap.put("shareTarget", targetByType);
        hashMap.put("shareChannelType", str2);
        hashMap.put("name", str);
        hashMap.put("params", JSON.toJSONString(e.b().j()));
        a.a().a("wvShareClickEvent", new JSONObject(hashMap));
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        String targetByType = ShareTargetType.getTargetByType(str);
        HashMap hashMap = new HashMap();
        hashMap.put("target", targetByType);
        hashMap.put("shareTarget", targetByType);
        hashMap.put("shareChannelType", str2);
        hashMap.put("name", str);
        hashMap.put("params", str3);
        a.a().a("wvShareClickEvent", new JSONObject(hashMap));
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) "false");
        jSONObject.put("errorCode", (Object) "0");
        jSONObject.put("errorMsg", (Object) "saveFail");
        a.a().a("saveScreenShotWithQR", jSONObject);
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) "false");
        jSONObject.put("errorCode", (Object) "1");
        jSONObject.put("errorMsg", (Object) "noPermission");
        a.a().a("saveScreenShotWithQR", jSONObject);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) "true");
        a.a().a("saveScreenShotWithQR", jSONObject);
    }

    public static void a(TBShareContent tBShareContent, String str, String str2, String str3, int i, boolean z, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ff89a8", new Object[]{tBShareContent, str, str2, str3, new Integer(i), new Boolean(z), str4, str5});
            return;
        }
        if (StringUtils.isEmpty(str4)) {
            str4 = "2";
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(JSONObject.toJSONString(tBShareContent));
            parseObject.put(CHANNEL_LIST_KEY, (Object) str);
            parseObject.put(TOOL_LIST_KEY, (Object) str2);
            parseObject.put(CONFIG_DATA_KEY, (Object) str3);
            parseObject.put(PANEL_TYPE_KEY, (Object) String.valueOf(i));
            parseObject.put(SHOW_FRIEND_KEY, (Object) (z ? "1" : "0"));
            parseObject.put(SHOW_FRIEND_TYPE_KEY, (Object) str4);
            parseObject.put(SHOW_CHANNEL_TYPE_KEY, (Object) str5);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(a.SHARE_CONTENT_KEY, (Object) parseObject.toJSONString());
            a.a().a(parseObject);
            a.a().a(a.REGISTER_SHARE_LISTENER_EVENT, jSONObject);
        } catch (Exception e) {
            nyy.c(TAG, "updateShareContent err:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", (Object) str);
        a.a().a("saveShareImageSuccess", jSONObject);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_KEY, (Object) str);
        if (StringUtils.isEmpty(str)) {
            jSONObject.put(com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_STATUS_KEY, (Object) "exception");
        } else {
            jSONObject.put(com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_STATUS_KEY, (Object) com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS);
        }
        a.a().a(a.GET_CONTACTS_INFO_EVENT, jSONObject);
    }
}
