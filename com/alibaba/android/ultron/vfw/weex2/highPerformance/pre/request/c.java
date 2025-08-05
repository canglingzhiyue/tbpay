package com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.e;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.d;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.p;
import com.taobao.login4android.api.Login;
import java.util.ArrayList;
import java.util.Iterator;
import tb.iro;
import tb.jqg;
import tb.kge;
import tb.riy;
import tb.spk;

/* loaded from: classes2.dex */
public class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f2803a;
    private d b;
    private JSONObject c;
    private ArrayList<a> d;

    static {
        kge.a(369743696);
        kge.a(1582550433);
    }

    public c(String str, d dVar, JSONObject jSONObject) {
        this.f2803a = str;
        this.b = dVar;
        this.c = jSONObject;
    }

    public c(String str, d dVar, JSONObject jSONObject, ArrayList<a> arrayList) {
        this.f2803a = str;
        this.b = dVar;
        this.c = jSONObject;
        this.d = arrayList;
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a
    public void a(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        String str2 = "UltronTradeHybridPreRequestCallback.onSuccess";
        if (jSONObject2 == null) {
            UnifyLog.d(str2, "responseData is null");
        } else if (this.c == null) {
            UnifyLog.d(str2, "mParams is null");
        } else {
            b(jSONObject2);
            String str3 = this.b.f;
            if (str3 != null) {
                if (str3.contains("${userId}")) {
                    str3 = str3.replace("${userId}", Login.getUserId());
                }
                com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().f().a(str3, jSONObject2.toJSONString(), this.b.f2791a);
                a();
                return;
            }
            String str4 = this.b.c.f2795a;
            if (str4.startsWith("${") && str4.endsWith(riy.BLOCK_END_STR)) {
                try {
                    String[] split = str4.substring(2, str4.length() - 1).split("\\.");
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.putAll(this.c);
                    JSONObject jSONObject4 = jSONObject3;
                    for (int i = 0; i < split.length; i++) {
                        if (i == split.length - 1) {
                            str2 = jSONObject4.getString(split[i]);
                            str = str2;
                            break;
                        }
                        jSONObject4 = jSONObject4.getJSONObject(split[i]);
                        if (jSONObject4 == null) {
                            break;
                        }
                    }
                } catch (Exception e) {
                    UnifyLog.d(str2, e.toString());
                }
            }
            str = str4;
            e c = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().c();
            String str5 = this.f2803a;
            d dVar = this.b;
            c.a(str5, dVar, str, jSONObject2, dVar.c.b);
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ArrayList<a> arrayList = this.d;
        if (arrayList == null) {
            return;
        }
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) this.b.b.f2788a);
            it.next().a(jSONObject);
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        UnifyLog.d("UltronTradeHybridPreRequestCallback.onFailed", "errorCode:" + str + ",errorMsg:" + str2);
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (!spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "enableTradeHybridBackgroundTransfer", false)) {
            jqg.b("UltronTradeHybridPreRequestCallback.sendBackgroundMessageToWeex2", "orange is off");
        } else {
            String str = this.b.g;
            if (TextUtils.isEmpty(str)) {
                jqg.b("UltronTradeHybridPreRequestCallback.sendBackgroundMessageToWeex2", "relatedPreRenderUrl is EMPTY");
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ZimMessageChannel.K_RPC_RES, (Object) jSONObject);
            JSONObject jSONObject3 = this.c;
            if (jSONObject3 != null) {
                jSONObject2.putAll(jSONObject3);
                if (jSONObject2.containsKey("context")) {
                    jSONObject2.remove("context");
                }
            }
            Object b = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().b(str);
            if (b instanceof String) {
                com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().b(b, jSONObject2);
                jqg.b("UltronTradeHybridPreRequestCallback.sendBackgroundMessageToWeex2", "backgroundPreRenderInstance is not ready(instance is string)");
            } else if (!(b instanceof p)) {
                jqg.b("UltronTradeHybridPreRequestCallback.sendBackgroundMessageToWeex2", "backgroundPreRenderInstance is null");
            } else {
                p pVar = (p) b;
                com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c b2 = com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c.b(pVar);
                if (b2 == null || !b2.c()) {
                    com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().b(pVar, jSONObject2);
                    jqg.b("UltronTradeHybridPreRequestCallback.sendBackgroundMessageToWeex2", "backgroundPreRenderInstance is not ready");
                    return;
                }
                pVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.background", jSONObject2);
            }
        }
    }
}
