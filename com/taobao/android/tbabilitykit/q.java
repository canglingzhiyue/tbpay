package com.taobao.android.tbabilitykit;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dld;
import tb.dlh;
import tb.hsu;
import tb.jae;
import tb.jaf;
import tb.jag;
import tb.jah;
import tb.jai;
import tb.kge;

/* loaded from: classes.dex */
public class q implements dld {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CAN_ESCAPE = "canEscape";
    public static final String KEY_H5_POST_DATA = "postdata";
    public static final String KEY_METHOD = "method";
    public static final String KEY_OPEN_URL_H5_IS_POST_URL = "isPostUrl";
    public static final String KEY_PARAMS = "params";
    public static final String KEY_QUERY_PARAMS = "queryParams";
    public static final String KEY_TYPE = "type";
    public static final String KEY_URL = "url";
    public static final String TYPE_OPEN_URL_H5 = "H5";
    public static final String TYPE_OPEN_URL_METHOD_GET = "get";
    public static final String TYPE_OPEN_URL_METHOD_POST = "post";
    public static final String TYPE_OPEN_URL_NATIVE = "Native";
    public static final String TYPE_OPEN_URL_POPLAYER = "PopLayer";
    public static final String TYPE_OPEN_URL_WEEX = "Weex";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, jae> f15355a = new HashMap();

    static {
        kge.a(660723361);
        kge.a(-753000299);
    }

    public q() {
        this.f15355a.put("H5", new jaf());
        this.f15355a.put("Native", new jag());
        this.f15355a.put("PopLayer", new jah());
        this.f15355a.put("Weex", new jai());
    }

    @Override // tb.dld
    public dkx a(Context context, dlh dlhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("15c19fe5", new Object[]{this, context, dlhVar});
        }
        if (dlhVar != null) {
            String c = dlhVar.c("type");
            String c2 = dlhVar.c("url");
            String c3 = dlhVar.c("method");
            JSONObject a2 = dlhVar.a("queryParams");
            String c4 = dlhVar.c(KEY_CAN_ESCAPE);
            if (a2 != null) {
                c2 = hsu.a(c2, a2);
            }
            String str = c2;
            JSONObject a3 = dlhVar.a("params");
            if (TextUtils.isEmpty(c)) {
                c = "H5";
            }
            if (str == null) {
                return new dkw(new dkv(10006, "TAKOpenUrlAbilityImpl miss url"), false);
            }
            jae jaeVar = this.f15355a.get(c);
            if (jaeVar != null) {
                jaeVar.a(context, str, a3, c3, c4);
            }
        }
        return new dla();
    }
}
