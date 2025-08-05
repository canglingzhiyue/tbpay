package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class am implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "clickContent";

    /* renamed from: a  reason: collision with root package name */
    private Context f10688a;
    private eyx b;
    private a c;

    /* loaded from: classes5.dex */
    public interface a {
        void a(String str, String str2);
    }

    static {
        kge.a(1941191882);
        kge.a(1967244270);
    }

    public am(Context context, eyx eyxVar, a aVar) {
        this.f10688a = context;
        this.b = eyxVar;
        this.c = aVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        String str;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        try {
            JSONObject jSONObject = (JSONObject) ((Object[]) runtimeAbilityParamArr[0].getValue())[0];
            str = jSONObject.getString("contentId");
            try {
                str2 = jSONObject.getString("title");
                this.c.a(str, str2);
            } catch (Exception unused) {
                this.c.a(str, str2);
                return true;
            }
        } catch (Exception unused2) {
            str = str2;
        }
        return true;
    }
}
