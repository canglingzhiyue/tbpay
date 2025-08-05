package com.alibaba.ability.localization;

import android.app.Application;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.kge;
import tb.tez;

/* loaded from: classes2.dex */
public class InitLocalization {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InitLocalization";

    static {
        kge.a(1619247609);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        TLog.logd(b.LOG_MODULE, TAG, "start initialization");
        c.a(application);
        b.a(new b.a() { // from class: com.alibaba.ability.localization.InitLocalization.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ability.localization.b.a
            public void a(Language language, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("246661b", new Object[]{this, language, str});
                } else {
                    tez.a(str, language);
                }
            }
        });
        tez.a(b.d(), b.a());
        com.taobao.application.common.c.a(new IApmEventListener() { // from class: com.alibaba.ability.localization.InitLocalization.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.application.common.IApmEventListener
            public void onEvent(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                } else if (i != 2) {
                } else {
                    tez.a(b.d(), b.a());
                }
            }
        });
    }
}
