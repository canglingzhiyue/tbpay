package com.taobao.android.sku.bizevent;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mtopsdk.mtop.domain.MtopResponse;
import tb.jpy;
import tb.kge;

/* loaded from: classes6.dex */
public class e extends com.alibaba.android.ultron.event.i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_request";

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f15141a;

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1814481661) {
            super.a((com.alibaba.android.ultron.event.base.e) objArr[0]);
            return null;
        } else if (hashCode != -1128373982) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.a((JSONObject) objArr[0], objArr[1], (String) objArr[2], (JSONObject) objArr[3], (MtopResponse) objArr[4]);
        }
    }

    public static /* synthetic */ Pattern e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pattern) ipChange.ipc$dispatch("3260ee35", new Object[0]) : f15141a;
    }

    static {
        kge.a(-61161163);
        f15141a = Pattern.compile("\\$response\\[([a-zA-Z()_\\-0-9]*)\\]\\{(ret\\[0\\]|mtopRetCode|mtopRetMsg)\\}");
    }

    @Override // com.alibaba.android.ultron.event.i, com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
        } else {
            super.a(eVar);
        }
    }

    @Override // com.alibaba.android.ultron.event.q
    public com.alibaba.android.ultron.event.base.e a(JSONObject jSONObject, Object obj, String str, JSONObject jSONObject2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.event.base.e) ipChange.ipc$dispatch("bcbe6122", new Object[]{this, jSONObject, obj, str, jSONObject2, mtopResponse});
        }
        final com.alibaba.android.ultron.event.base.e a2 = super.a(jSONObject, obj, str, jSONObject2, mtopResponse);
        if (jSONObject != null && a2 != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("fields");
            JSONObject parseObject = jSONObject3 != null ? JSONObject.parseObject(jSONObject3.toJSONString()) : null;
            jpy.a(null, parseObject, new jpy.a(Pattern.compile("\\$response\\[[a-zA-Z()_\\-0-9]*\\]\\{[a-zA-Z()\\. _\\-\\[\\]0-9]*(?!\\$\\{[a-zA-Z()\\. _\\-\\[\\]0-9]*\\})[a-zA-Z()\\. _\\-\\[\\]0-9]*\\}"), new JSONObject() { // from class: com.taobao.android.sku.bizevent.SkuRequestHandler$1
                {
                    put(InputFrame3.TYPE_RESPONSE, (Object) a2.e().a());
                    put("__Mtop__", (Object) a2.e().b());
                }
            }) { // from class: com.taobao.android.sku.bizevent.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                    if (str2.hashCode() == -1591598620) {
                        return super.a(objArr[0], (String) objArr[1]);
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                }

                @Override // tb.jpy.a
                public Object a(Object obj2, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("a12221e4", new Object[]{this, obj2, str2});
                    }
                    Object a3 = super.a(obj2, str2);
                    if (TextUtils.isEmpty(str2) || !str2.startsWith("$response") || a3 != null || !(obj2 instanceof JSONObject)) {
                        return a3;
                    }
                    JSONObject jSONObject4 = (JSONObject) obj2;
                    Matcher matcher = e.e().matcher(str2);
                    String str3 = "";
                    String str4 = str3;
                    while (matcher.find()) {
                        str3 = matcher.group(1);
                        str4 = matcher.group(2);
                    }
                    if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                        return a3;
                    }
                    Object obj3 = jSONObject4.get("__Mtop__");
                    if (!(obj3 instanceof Map)) {
                        return a3;
                    }
                    Object obj4 = ((Map) obj3).get(str3);
                    if (!(obj4 instanceof MtopResponse)) {
                        return a3;
                    }
                    MtopResponse mtopResponse2 = (MtopResponse) obj4;
                    if (!"ret[0]".equals(str4)) {
                        return "mtopRetMsg".equals(str4) ? mtopResponse2.getRetMsg() : "mtopRetCode".equals(str4) ? mtopResponse2.getRetCode() : a3;
                    }
                    return mtopResponse2.getRetCode() + "::" + mtopResponse2.getRetMsg();
                }
            });
            a2.a(new DMEvent(a2.b(), parseObject, null));
        }
        return a2;
    }
}
