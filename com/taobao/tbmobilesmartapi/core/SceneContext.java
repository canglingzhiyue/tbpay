package com.taobao.tbmobilesmartapi.core;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class SceneContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f22196a;
    public Context b;
    public JSONObject c;
    public a d;

    /* loaded from: classes8.dex */
    public @interface SceneContextCallBackKey {
    }

    /* loaded from: classes8.dex */
    public interface a {
        public static final String COMMON_TRACK_PARAMS = "CommonTrackParams";

        JSONObject a(String str, JSONObject jSONObject);
    }

    static {
        kge.a(1353233208);
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9490f01e", new Object[]{this, str, jSONObject});
        }
        a aVar = this.d;
        if (aVar == null) {
            return new JSONObject();
        }
        return aVar.a(str, jSONObject);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = null;
        this.f22196a = null;
        this.c = null;
        this.d = null;
    }
}
