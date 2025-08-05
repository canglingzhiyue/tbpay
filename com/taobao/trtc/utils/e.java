package com.taobao.trtc.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import tb.kge;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILE_STATIC_CONFIG = "trtc_static_config";
    public static final String FILE_STATIC_CONFIG_DIR = "/shared_prefs/";

    static {
        kge.a(932721331);
    }

    public static void a(Context context, String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        File file = new File(context.getApplicationInfo().dataDir + FILE_STATIC_CONFIG_DIR + FILE_STATIC_CONFIG + ".xml");
        if (!file.exists()) {
            TrtcLog.d("TrtcLocalConfig", "trtc config file path is not exist: " + file.getPath());
            file.createNewFile();
        }
        if (!file.exists()) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(FILE_STATIC_CONFIG, 0).edit();
            edit.putString(str, str2);
            edit.apply();
            TrtcLog.d("TrtcLocalConfig", "onWriteLocalConfig, key: " + str + " , value: " + str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
