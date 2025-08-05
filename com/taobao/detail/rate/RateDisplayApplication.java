package com.taobao.detail.rate;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.kil;

/* loaded from: classes7.dex */
public class RateDisplayApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static JSONObject previewDatas;
    public int MAX_IMUMSIZE = 100;
    public static HashMap<String, JSONObject> previewDataMap = new HashMap<>();
    public static boolean isColdStart = true;

    public static /* synthetic */ Object ipc$super(RateDisplayApplication rateDisplayApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        isColdStart = false;
        ab.a((Context) this);
        if (!kil.a(this)) {
            return;
        }
        previewDataMap = new LinkedHashMap<String, JSONObject>() { // from class: com.taobao.detail.rate.RateDisplayApplication.1
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            private static final long serialVersionUID = 1;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, JSONObject> entry) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > RateDisplayApplication.this.MAX_IMUMSIZE;
            }
        };
    }

    public static void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
        } else {
            previewDataMap.clear();
        }
    }
}
