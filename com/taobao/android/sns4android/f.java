package com.taobao.android.sns4android;

import android.app.Activity;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Properties;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g f15264a;

    static {
        kge.a(-901219397);
    }

    public void a(Activity activity, g gVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8cefcd", new Object[]{this, activity, gVar, jSONObject});
        }
    }

    public abstract void a(Activity activity, Map<String, String> map);

    public f a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("580c56f", new Object[]{this, gVar});
        }
        this.f15264a = gVar;
        return this;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("result", str2);
        UserTrackAdapter.sendUT(str, "GetAuthKey_Result", properties);
    }
}
