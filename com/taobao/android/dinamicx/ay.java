package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;
import tb.fxi;

/* loaded from: classes.dex */
public class ay implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dxTplName", fxi.f28190a);
        hashMap.put("dxTplV", Long.valueOf(fxi.b));
        hashMap.put("dxBiz", fxi.c);
        hashMap.put("dxThreadName", fxi.d);
        hashMap.put("dxPipeName", fxi.e);
        Map<String, String> a2 = com.taobao.android.dinamicx.monitor.d.a();
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        return hashMap;
    }
}
