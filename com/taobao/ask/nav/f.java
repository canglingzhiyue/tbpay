package com.taobao.ask.nav;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.ask.ASK_CONST;
import com.taobao.tao.log.TLog;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1317568731);
    }

    public final void a(Context context, Uri uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd813be", new Object[]{this, context, uri, map});
            return;
        }
        String str = map.get("sessionId");
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(System.currentTimeMillis());
            map.put("sessionId", str);
        }
        String str2 = map.get("scene");
        boolean a2 = com.taobao.ask.utils.d.a((Object) map.get(ASK_CONST.KEY_CALL_FROM_WINDVANE), false);
        if (TextUtils.isEmpty(map.get("itemId"))) {
            com.taobao.social.sdk.jsbridge.a.callback(str, false, false, ASK_CONST.ERROR.INVALID_PARAMS.toJSONObject());
            com.taobao.vividsocial.utils.a.a("TBAskEveryonePublisherOpenFailed", ASK_CONST.ERROR.INVALID_PARAMS.toJSONObject());
            TLog.loge(ASK_CONST.LOG_TAG, "answer publish open failed , item id is null");
        } else if (d.a("question", str2)) {
            a(context, map);
        } else {
            TLog.loge(ASK_CONST.LOG_TAG, "open failed , question publish is not enale");
            if (!a2) {
                return;
            }
            com.taobao.social.sdk.jsbridge.a.callback(str, false, false, ASK_CONST.ERROR.PUBLISHER_DEGRADED.toJSONObject());
            com.taobao.vividsocial.utils.a.a("TBAskEveryonePublisherOpenFailed", ASK_CONST.ERROR.PUBLISHER_DEGRADED.toJSONObject());
        }
    }

    private static void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
            return;
        }
        com.taobao.ask.utils.d.a(map, ASK_CONST.KEY_TNODE_TIME, String.valueOf(System.nanoTime()));
        String str = map.get("openMode");
        if (!"present".equals(str) && !"push".equals(str)) {
            map.put("openMode", "push");
        }
        com.taobao.vividsocial.utils.a.a("TBAskEveryonePublisherWillOpen", null);
        Uri.Builder buildUpon = Uri.parse(ASK_CONST.PUBLISH_PRIVATE_URL).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        Nav.from(context).toUri(buildUpon.build());
        TLog.loge(ASK_CONST.LOG_TAG, "open new answer publish using activity");
    }
}
