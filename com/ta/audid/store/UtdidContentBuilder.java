package com.ta.audid.store;

import android.content.Context;
import com.alibaba.analytics.core.config.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Variables;
import com.ta.audid.upload.UtdidKeyFile;
import com.ta.utdid2.android.utils.StringUtils;
import java.util.HashMap;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes4.dex */
public class UtdidContentBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BODY = "{\"type\":\"%s\",\"timestamp\":%s,\"data\":%s}";
    private static final String MODULE_APPKEY = "appkey";
    private static final String MODULE_APPNAME = "appName";
    private static final String MODULE_AUDID = "audid";
    private static final String MODULE_UTDID = "utdid";
    private static final String TYPE_AUDID = "audid";

    static {
        kge.a(1381681820);
    }

    public static String buildUDID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d70efd7", new Object[]{str});
        }
        Context context = Variables.getInstance().getContext();
        return context == null ? "" : StringUtils.getStringWithoutBlank(String.format(BODY, a.KEY, Variables.getInstance().getCurrentTimeMillisString(), buildAudidDataJsonString(str, UtdidKeyFile.readAudidFile(), "", context.getPackageName())));
    }

    private static String buildAudidDataJsonString(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe994911", new Object[]{str, str2, str3, str4});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(a.KEY, str2);
        hashMap.put("utdid", str);
        hashMap.put("appkey", str3);
        hashMap.put("appName", str4);
        return new JSONObject(StringUtils.sortMapByKey(hashMap)).toString();
    }
}
