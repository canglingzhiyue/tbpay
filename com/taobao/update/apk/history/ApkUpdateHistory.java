package com.taobao.update.apk.history;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.framework.UpdateRuntime;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class ApkUpdateHistory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public static class Data implements Serializable {
        public String ext;
        public String fromVersion;
        public String toVersion;

        static {
            kge.a(-536266786);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-531463152);
    }

    public static Data getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("e8f96c3a", new Object[0]);
        }
        String string = PreferenceManager.getDefaultSharedPreferences(UpdateRuntime.getContext()).getString("update_history", "");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (Data) JSON.parseObject(string, Data.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void update(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1305d3", new Object[]{data});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(UpdateRuntime.getContext()).edit();
        edit.putString("update_history", JSON.toJSONString(data));
        edit.apply();
    }

    public static void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(UpdateRuntime.getContext()).edit();
        edit.remove("update_history");
        edit.apply();
    }
}
