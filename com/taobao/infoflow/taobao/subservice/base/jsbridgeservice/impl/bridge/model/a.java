package com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1272760784);
    }

    public static JsActionModel a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsActionModel) ipChange.ipc$dispatch("ba92b4ad", new Object[]{str, str2});
        }
        if (!TextUtils.equals(e.RECORD_EXECUTE, str)) {
            ldf.d("JsActionModelCreator", "error action : " + str);
            return null;
        } else if (TextUtils.isEmpty(str2)) {
            ldf.d("JsActionModelCreator", "params is empty");
            return null;
        } else {
            try {
                return (JsActionModel) JSON.parseObject(str2, JsActionModel.class);
            } catch (Throwable th) {
                ldf.a("JsActionModelCreator", "create JsActionModel error :" + th.getMessage(), th);
                return null;
            }
        }
    }
}
