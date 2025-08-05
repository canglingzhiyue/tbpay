package com.alibaba.android.nextrpc.stream.internal.response;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.stream.internal.mtop.IStreamMtopRequestCallback;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public class a implements com.alibaba.android.nextrpc.internal.accs.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, IStreamMtopRequestCallback> f2393a;
    public Handler b = new Handler(Looper.getMainLooper());

    public static /* synthetic */ void a(a aVar, String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8788d90f", new Object[]{aVar, str, str2, str3, jSONObject});
        } else {
            aVar.b(str, str2, str3, jSONObject);
        }
    }

    public a(Map<String, IStreamMtopRequestCallback> map) {
        this.f2393a = map;
    }

    @Override // com.alibaba.android.nextrpc.internal.accs.b
    public void a(final String str, final String str2, final String str3, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            b(str, str2, str3, jSONObject);
        } else {
            this.b.post(new Runnable() { // from class: com.alibaba.android.nextrpc.stream.internal.response.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this, str, str2, str3, jSONObject);
                    }
                }
            });
        }
    }

    private void b(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c839ac9", new Object[]{this, str, str2, str3, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            String a2 = a(jSONObject);
            UnifyLog.b("StreamAccsResponse", "Received accs data,current reqId = " + a2, new Object[0]);
            for (Map.Entry<String, IStreamMtopRequestCallback> entry : this.f2393a.entrySet()) {
                IStreamMtopRequestCallback value = entry.getValue();
                if (entry.getKey().equals(a2)) {
                    value.onReceiveAccsData(str, str2, str3, jSONObject);
                }
            }
        }
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject}) : jSONObject.getString("reqId");
    }
}
