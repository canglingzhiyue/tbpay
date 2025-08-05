package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.ImageStrategyDecider;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1005964443);
    }

    public void a(Context context) {
        JSONArray parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        com.taobao.phenix.intf.b h = com.taobao.phenix.intf.b.h();
        String string = context.getSharedPreferences("taobao_live_home", 0).getString("jingxuanFirstPageImageSp", "");
        if (TextUtils.isEmpty(string) || (parseArray = JSON.parseArray(string)) == null || parseArray.size() <= 0) {
            return;
        }
        for (int i = 0; i < parseArray.size(); i++) {
            JSONObject jSONObject = parseArray.getJSONObject(i);
            if (jSONObject != null) {
                String string2 = jSONObject.getString("imageUrl");
                int intValue = jSONObject.getInteger("width").intValue();
                int intValue2 = jSONObject.getInteger("height").intValue();
                if (!TextUtils.isEmpty(string2) && intValue > 0 && intValue2 > 0) {
                    h.a(ImageStrategyDecider.decideUrl(string2, Integer.valueOf(intValue), Integer.valueOf(intValue2), null)).limitSize(null, intValue, intValue2).fetch();
                }
            }
        }
        TLog.loge("TBLiveImageCtr", "TBLiveImageCtr batchFetchImage end");
    }
}
