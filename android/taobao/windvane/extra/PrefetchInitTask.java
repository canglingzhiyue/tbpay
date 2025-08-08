package android.taobao.windvane.extra;

import android.app.Application;
import android.net.Uri;
import android.taobao.windvane.extra.uc.WVPrefetchTrigger;
import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.util.a;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.guc;
import tb.kge;

/* loaded from: classes2.dex */
public class PrefetchInitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ENABLE_WV_PREFETCH = "enable_wv_prefetch";
    private static final String TAG = "PrefetchInitTask";

    static {
        kge.a(1480644303);
    }

    public static void init(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            if (!guc.a(application, ENABLE_WV_PREFETCH)) {
                return;
            }
            final String str = (String) hashMap.get("startupUrl");
            WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.extra.PrefetchInitTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String str2 = str;
                        Thread.currentThread().setPriority(10);
                        if (!StringUtils.isEmpty(str)) {
                            String queryParameter = Uri.parse(str).getQueryParameter(RVStartParams.KEY_URL_SHORT);
                            if (!StringUtils.isEmpty(queryParameter) && Uri.parse(queryParameter).isHierarchical()) {
                                str2 = queryParameter;
                            }
                        }
                        WVPrefetchTrigger.getInstance().preloadMainHtml(application, str2);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
            m.e(TAG, "startupUrl=" + str);
        } catch (Throwable th) {
            m.e(TAG, a.a(th));
        }
    }
}
