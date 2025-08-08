package com.taobao.infoflow.jsbridge.impl.bridge.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1968783556);
    }

    public static JsActionModel a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsActionModel) ipChange.ipc$dispatch("716a1339", new Object[]{str, str2});
        }
        if (!StringUtils.equals(e.RECORD_EXECUTE, str)) {
            ldf.d("JsActionModelCreator", "error action : " + str);
            return null;
        } else if (StringUtils.isEmpty(str2)) {
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
