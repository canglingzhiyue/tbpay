package com.taobao.android.abilitykit.ability;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dlb;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.hsu;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PARAMS = "params";
    public static final String KEY_QUERY_PARAMS = "queryParams";
    public static final String KEY_TYPE = "type";
    public static final String KEY_URL = "url";
    public static final String OPEN_URL_KEY = "5176777946386787820";
    public static final String TYPE_OPEN_URL_NATIVE = "Native";

    static {
        kge.a(-1195559100);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlb.c() != null) {
            return dlb.c().a(dleVar.a(), dlhVar);
        }
        if (dlhVar != null) {
            String c = dlhVar.c("type");
            String c2 = dlhVar.c("url");
            JSONObject a2 = dlhVar.a("queryParams");
            if (a2 != null) {
                c2 = hsu.a(c2, a2);
            }
            JSONObject a3 = dlhVar.a("params");
            if ("Native".equalsIgnoreCase(c) && !StringUtils.isEmpty(c2)) {
                a(dleVar.a(), c2, a3);
            } else {
                if (StringUtils.isEmpty(c2)) {
                    str = "open url ability has not inject impl,and url is empty";
                } else {
                    str = "open url ability has not inject impl,and type is not native";
                }
                return new dkw(new dkv(10002, str), true);
            }
        }
        return new dla();
    }

    public void a(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564cf206", new Object[]{this, context, str, jSONObject});
            return;
        }
        Bundle a2 = hsu.a(new Bundle(), jSONObject);
        Intent intent = new Intent(str);
        intent.putExtras(a2);
        context.startActivity(intent);
    }
}
