package com.taobao.ask.nav;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.ASK_CONST;
import com.taobao.tao.log.TLog;
import com.taobao.vividsocial.utils.j;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1104843332);
    }

    public static void a(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7efd343", new Object[]{intent, context});
            return;
        }
        Uri data = intent.getData();
        if (com.taobao.ask.utils.c.a("isGetContextByApmManager", true)) {
            context = com.taobao.application.common.c.b();
        }
        if (data == null || context == null) {
            return;
        }
        TLog.loge(ASK_CONST.LOG_TAG, "AskPublishNavProcessor:" + data.toString());
        if (com.taobao.ask.utils.d.a((Object) data.getQueryParameter(ASK_CONST.KEY_IS_URL_PROCESSED), false)) {
            return;
        }
        Uri build = data.buildUpon().appendQueryParameter(ASK_CONST.KEY_IS_URL_PROCESSED, "true").build();
        intent.setData(build);
        Map<String, String> a2 = j.a(build);
        String str = a2.get("sessionId");
        String str2 = a2.get("type");
        if ("answer".equals(str2)) {
            new a().a(context, build, a2);
        } else if ("question".equals(str2)) {
            new f().a(context, build, a2);
        } else {
            com.taobao.social.sdk.jsbridge.a.callback(str, false, false, ASK_CONST.ERROR.INVALID_PARAMS.toJSONObject());
            com.taobao.vividsocial.utils.a.a("TBAskEveryonePublisherOpenFailed", ASK_CONST.ERROR.INVALID_PARAMS.toJSONObject());
        }
    }
}
