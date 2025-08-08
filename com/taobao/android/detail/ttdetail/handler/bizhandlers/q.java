package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.net.URLEncoder;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class q implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openPopLayer";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_poplayer";

    /* renamed from: a  reason: collision with root package name */
    private Context f10721a;

    static {
        kge.a(-987757807);
        kge.a(1967244270);
    }

    public q(Context context) {
        this.f10721a = context;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        String string = b.getString("url");
        if (StringUtils.isEmpty(string)) {
            return false;
        }
        if (Uri.parse(string).getScheme() == null) {
            string = com.taobao.search.common.util.k.HTTPS_PREFIX + parse.getSchemeSpecificPart();
        }
        try {
            com.taobao.android.detail.ttdetail.utils.l.a(this.f10721a, "poplayer://abcd?openType=directly&uuid=" + System.currentTimeMillis() + "&params=" + URLEncoder.encode(String.format("{\"url\":\"%s\"}", string), "UTF-8"));
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a("OpenPopLayerImplementor", "execute error", th);
        }
        return true;
    }
}
