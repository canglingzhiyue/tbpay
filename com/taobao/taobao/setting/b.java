package com.taobao.taobao.setting;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.taobao.setting.item.PaySettingItem;
import java.util.ArrayList;
import java.util.List;
import tb.mvn;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CACHE_SETTING_PAY = "key_cache_setting_pay";

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
        PaySettingItem.SettingsEvent settingsEvent = new PaySettingItem.SettingsEvent("H5", "onClick", jSONObject2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(settingsEvent);
        arrayList.add(new PaySettingItem(mvn.ITEM_FINGER_TITLE, null, mvn.ITEM_FINGER_DESC, false, false, arrayList2));
        return arrayList;
    }
}
