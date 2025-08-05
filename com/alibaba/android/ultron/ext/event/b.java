package com.alibaba.android.ultron.ext.event;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(963559979);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ com.alibaba.android.ultron.event.base.e a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.event.base.e) ipChange.ipc$dispatch("d0953e2d", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ void a(b bVar, com.alibaba.android.ultron.event.base.e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20976063", new Object[]{bVar, eVar, str});
        } else {
            bVar.b(eVar, str);
        }
    }

    public static /* synthetic */ com.alibaba.android.ultron.event.base.e b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.event.base.e) ipChange.ipc$dispatch("8881abae", new Object[]{bVar}) : bVar.c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r1.equals("checkout") != false) goto L16;
     */
    @Override // com.alibaba.android.ultron.ext.event.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a_(final com.alibaba.android.ultron.event.base.e r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.ext.event.b.a_(com.alibaba.android.ultron.event.base.e):void");
    }

    private void b(com.alibaba.android.ultron.event.base.e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ffb47ec", new Object[]{this, eVar, str});
            return;
        }
        b(this.c, "refreshPageV3", d(eVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        b(this.c, "openUrlV3", jSONObject);
    }

    private void c(com.alibaba.android.ultron.event.base.e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d340b6cf", new Object[]{this, eVar, jSONObject});
            return;
        }
        String string = jSONObject.getString("errorMsg");
        JSONObject jSONObject2 = new JSONObject();
        if (TextUtils.isEmpty(string)) {
            string = "服务异常";
        }
        jSONObject2.put("message", (Object) string);
        b(eVar, "toastV3", jSONObject2);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        final JSONObject jSONObject2 = jSONObject.getJSONObject("verifyIdentity");
        JSONObject jSONObject3 = jSONObject.getJSONObject("verifyIdentityParams");
        if (jSONObject3 == null) {
            return;
        }
        String string = jSONObject3.getString(Constants.VI_ENGINE_VERIFYID);
        jSONObject3.getJSONObject("extParams");
        String string2 = jSONObject3.getString("bizName");
        String string3 = jSONObject3.getString("token");
        final String string4 = jSONObject3.getString("errorMsg");
        if (string == null) {
            return;
        }
        VerifyIdentityEngine.getInstance(this.d).startVerifyByVerifyId(string, string3, string2, new Bundle(), new VIListenerByVerifyId() { // from class: com.alibaba.android.ultron.ext.event.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId
            public void onVerifyResult(String str, String str2, String str3, VerifyIdentityResult verifyIdentityResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aa9841f2", new Object[]{this, str, str2, str3, verifyIdentityResult});
                } else if (verifyIdentityResult == null) {
                } else {
                    String code = verifyIdentityResult.getCode();
                    if (TextUtils.isEmpty(code)) {
                        return;
                    }
                    char c = 65535;
                    int hashCode = code.hashCode();
                    if (hashCode != 1507423) {
                        if (hashCode == 1507426 && code.equals("1003")) {
                            c = 1;
                        }
                    } else if (code.equals("1000")) {
                        c = 0;
                    }
                    if (c == 0) {
                        JSONObject jSONObject4 = jSONObject2;
                        if (jSONObject4 == null) {
                            return;
                        }
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("fields");
                        b bVar = b.this;
                        bVar.b(b.a(bVar), "mtopWithOpenUrlV3", jSONObject5);
                    } else if (c == 1) {
                    } else {
                        String message = verifyIdentityResult.getMessage() != null ? verifyIdentityResult.getMessage() : string4;
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("message", (Object) message);
                        b bVar2 = b.this;
                        bVar2.b(b.b(bVar2), "toastV3", jSONObject6);
                    }
                }
            }
        });
    }

    private JSONObject a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fc81489c", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONObject.put("pageType", (Object) "H5");
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("pageType", (Object) str2);
        }
        return jSONObject;
    }
}
