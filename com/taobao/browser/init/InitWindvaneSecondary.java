package com.taobao.browser.init;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.taobao.windvane.d;
import android.taobao.windvane.jsbridge.c;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.h;
import com.taobao.calendar.aidl.business.CalendarAidlAdapter;
import com.taobao.tao.util.WVTBProxyImpl;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.t;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.mte;

/* loaded from: classes6.dex */
public class InitWindvaneSecondary implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-971021163);
        kge.a(1028243835);
    }

    public void run(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else if (t.b(application.getApplicationContext())) {
            TMSLogger.d("TMSEarlyInitializer", "skip InitWindvaneSecondary");
            CalendarAidlAdapter.initCalendarJS();
            h.a(null);
        } else {
            d.f1580a = new WVTBProxyImpl();
            mte.a();
            CalendarAidlAdapter.initCalendarJS();
            q.a(new c() { // from class: com.taobao.browser.init.InitWindvaneSecondary.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.taobao.windvane.jsbridge.c
                public Class<? extends e> getBridgeClass(String str) {
                    ServiceInfo serviceInfo;
                    if (application != null && !TextUtils.isEmpty(str)) {
                        Intent intent = new Intent(str.contains(q.a().f1672a) ? q.a().f1672a : str);
                        intent.setPackage(application.getPackageName());
                        List<ResolveInfo> queryIntentServices = application.getPackageManager().queryIntentServices(intent, 4);
                        if (queryIntentServices != null && queryIntentServices.size() > 0 && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null && serviceInfo.name != null) {
                            try {
                                return ((c) application.getClassLoader().loadClass(serviceInfo.name).newInstance()).getBridgeClass(str);
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    }
                    return null;
                }
            });
            h.a(null);
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            run(application, hashMap);
        }
    }
}
