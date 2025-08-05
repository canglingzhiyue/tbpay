package com.taobao.tao.recommend4.recyclerview;

import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jbg;
import tb.kge;
import tb.kss;

@Deprecated
/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f20975a = "Page_Home";
    private static final HandlerThread b;
    private static final Handler c;

    static {
        kge.a(2132869574);
        HandlerThread a2 = jbg.a("recommend.UT");
        b = a2;
        a2.start();
        c = new Handler(b.getLooper());
    }

    public static void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (Thread.currentThread() != b.getLooper().getThread()) {
            c.post(new Runnable() { // from class: com.taobao.tao.recommend4.recyclerview.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        kss.a(JSONObject.this, (JSONObject) null);
                    }
                }
            });
        } else {
            kss.a(jSONObject, (JSONObject) null);
        }
    }
}
