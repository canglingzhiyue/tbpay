package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.net.URLEncoder;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class y implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openTmallApp";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_tmall_app";

    /* renamed from: a  reason: collision with root package name */
    private Context f10731a;
    private eyx b;

    static {
        kge.a(-1894452616);
        kge.a(1967244270);
    }

    public y(Context context, eyx eyxVar) {
        this.f10731a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        String string = b.getString("url");
        try {
            com.taobao.android.detail.ttdetail.utils.l.a(this.f10731a, String.format("tbout://m.taobao.com/out.htm?url=%s&linkKey=tmall&degradeH5Url=%s&visa=8038aae9c566568b&meanwhile=true", URLEncoder.encode(a(string), "UTF-8"), URLEncoder.encode(string, "UTF-8")));
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a("OpenTmallAppImplementor", "run openTmallApp error", th);
        }
        return true;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("dl_redirect");
            return queryParameter == null ? "" : queryParameter;
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a("OpenTmallAppImplementor", "getRedirectUrl error", th);
            return "";
        }
    }
}
