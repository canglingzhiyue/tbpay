package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.newsetting.business.model.PaySettingItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class mvn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_USER_AVATAR_CHANGED = "AVATAR_CHANGED_SUCCESS";
    public static final String ITEM_FINGER_DESC = "开启生物支付，安全又快捷";
    public static final String ITEM_FINGER_TITLE = "指纹 / 面容支付";
    public static final String KEY_ACCOUNT_SAFETY_PAGE = "account201501";
    public static final String KEY_CACHE_SETTING_PAY = "key_cache_setting_pay";
    public static final String KEY_SETTING_INDEX_PAGE = "newSetting";
    public static final String PREFIX_SETTING_CACHE = "SCP_";

    static {
        kge.a(-1988500839);
    }

    public static List<PaySettingItem> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) ("https://my.m.taobao.com/finger.htm?sceneId=mobileic_biopay_biopay_setup_mobileClient&bizId=" + System.currentTimeMillis() + "&tbsid=" + Login.getSid()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("openUrl", (Object) jSONObject);
        PaySettingItem.SettingsEvent settingsEvent = new PaySettingItem.SettingsEvent("h5", "onClick", jSONObject2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(settingsEvent);
        arrayList.add(new PaySettingItem(ITEM_FINGER_TITLE, null, ITEM_FINGER_DESC, false, false, arrayList2));
        return arrayList;
    }
}
