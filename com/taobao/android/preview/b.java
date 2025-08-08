package com.taobao.android.preview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import tb.kge;
import tb.oqn;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2084039748);
    }

    public static void a(Context context, String str) {
        if (context == null || StringUtils.isEmpty(str)) {
            return;
        }
        try {
            Log.e(DXTemplatePreviewActivity.PREVIEW_TAG, "url--->" + str);
            String decode = !StringUtils.isEmpty(str) ? URLDecoder.decode(str, "UTF-8") : "";
            Log.e(DXTemplatePreviewActivity.PREVIEW_TAG, "result--->" + decode);
            if (!StringUtils.isEmpty(decode) && decode.contains("DinamicXTemplateDebug=")) {
                try {
                    Class<?> cls = Class.forName("com.taobao.android.dinamicx.dinamicx_debug_plugin.DXDebugController");
                    if (cls == null) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("DXUrl", (Object) str);
                    cls.getDeclaredMethod("show", Context.class, JSONObject.class).invoke(null, context, jSONObject);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } else if (StringUtils.isEmpty(decode) || !decode.contains("templateMock=")) {
            } else {
                String queryParameter = Uri.parse(decode).getQueryParameter(oqn.KEY_PREVIEW_PARAM);
                String substring = queryParameter.substring(queryParameter.indexOf("=") + 1);
                Log.e(DXTemplatePreviewActivity.PREVIEW_TAG, "info-->:" + substring);
                Intent intent = new Intent(context, DXTemplatePreviewActivity.class);
                intent.putExtra(DXTemplatePreviewActivity.PREVIEW_INFO, substring);
                context.startActivity(intent);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
