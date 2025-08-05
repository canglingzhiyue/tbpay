package com.taobao.android.abilitykit.mega;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.alo;
import tb.dky;
import tb.dkz;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dll;
import tb.kge;

/* loaded from: classes4.dex */
public final class c extends dlg<dle> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.ability.b f8951a;
    private final String b;
    private final String c;
    private final d d;

    /* loaded from: classes4.dex */
    public static final class a implements alo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ dll b;

        public a(dll dllVar) {
            this.b = dllVar;
        }

        @Override // tb.alo
        public void onCallback(ExecuteResult result) {
            dla dkyVar;
            dla dlaVar;
            ExecuteResult a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, result});
                return;
            }
            q.d(result, "result");
            d a3 = c.a(c.this);
            if (a3 != null && (a2 = a3.a(result)) != null) {
                result = a2;
            }
            JSONObject jSONObject = null;
            if (result instanceof FinishResult) {
                Map<String, Object> e = result.e();
                if (e != null) {
                    jSONObject = new JSONObject(e);
                }
                dlaVar = new dla(jSONObject);
            } else {
                if (result instanceof ErrorResult) {
                    ErrorResult errorResult = (ErrorResult) result;
                    String a4 = errorResult.a();
                    String b = errorResult.b();
                    JSONObject jSONObject2 = new JSONObject(2);
                    jSONObject2.put("code", (Object) a4);
                    jSONObject2.put("msg", (Object) b);
                    dkyVar = new dkz(jSONObject2);
                } else {
                    Map<String, Object> e2 = result.e();
                    if (e2 != null) {
                        jSONObject = new JSONObject(e2);
                    }
                    dkyVar = new dky(jSONObject);
                }
                dlaVar = dkyVar;
            }
            this.b.callback(result.f(), dlaVar);
        }
    }

    static {
        kge.a(530167060);
    }

    public static final /* synthetic */ d a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("7ed7116d", new Object[]{cVar}) : cVar.d;
    }

    public /* synthetic */ c(com.alibaba.ability.b bVar, String str, String str2, d dVar, int i, o oVar) {
        this(bVar, str, str2, (i & 8) != 0 ? null : dVar);
    }

    public c(com.alibaba.ability.b bVar, String str, String megaApi, d dVar) {
        q.d(megaApi, "megaApi");
        this.f8951a = bVar;
        this.b = str;
        this.c = megaApi;
        this.d = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
        if (r12 == null) goto L52;
     */
    @Override // tb.dlg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.dkx<?> a(tb.dlh r12, tb.dle r13, tb.dll r14) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.abilitykit.mega.c.a(tb.dlh, tb.dle, tb.dll):tb.dkx");
    }
}
