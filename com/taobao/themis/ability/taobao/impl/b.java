package com.taobao.themis.ability.taobao.impl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.biz.contacts.MessageBoxService;
import com.taobao.message.kit.core.GlobalContainer;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        MessageBoxService messageBoxService = (MessageBoxService) GlobalContainer.getInstance().get(MessageBoxService.class);
        if (messageBoxService != null && messageBoxService.getUnreadInfo() != null) {
            jSONObject.put(g.KEY_MSG_COUNT, (Object) Integer.valueOf(messageBoxService.getUnreadInfo().getTipNumber()));
        }
        return jSONObject;
    }
}
