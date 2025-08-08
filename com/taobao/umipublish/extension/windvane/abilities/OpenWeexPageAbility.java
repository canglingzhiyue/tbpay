package com.taobao.umipublish.extension.windvane.abilities;

import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes9.dex */
public class OpenWeexPageAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLASS_NAME = "com.taobao.umipublish.biz.weex.UnifyWeexActivity";

    static {
        kge.a(1745541810);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback("1", "Params is null");
        } else {
            String string = jSONObject.getString("weexUrl");
            if (StringUtils.isEmpty(string)) {
                errorCallback("2", "WeexUrl is null");
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            Uri.Builder buildUpon = Uri.parse(string).buildUpon();
            buildUpon.appendQueryParameter(e.LARGE_SCREEN_STYLE_KEY, "fullscreen");
            successCallback(new JSONObject());
            Bundle bundle = new Bundle();
            bundle.putSerializable("unify_weex_init_data", jSONObject2);
            Nav.from(this.mContext).withExtras(bundle).withAction("android.intent.action.UMI").withClassName(this.mContext.getPackageName(), CLASS_NAME).forResult(60004).toUri(buildUpon.build());
        }
    }
}
