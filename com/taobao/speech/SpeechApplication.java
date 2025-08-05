package com.taobao.speech;

import android.app.Application;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.jarviswe.b;
import com.taobao.android.jarviswe.bean.EnvType;
import com.taobao.tao.Globals;

/* loaded from: classes8.dex */
public class SpeechApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "SpeechApplication";

    public static /* synthetic */ Object ipc$super(SpeechApplication speechApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        int i = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(EnvironmentSwitcher.SPKEY_ENV, 0);
        b.a(i != 1 ? i != 2 ? EnvType.ONLINE : EnvType.DAILY : EnvType.PRE);
    }
}
