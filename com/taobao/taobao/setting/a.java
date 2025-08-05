package com.taobao.taobao.setting;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.c;
import com.taobao.alivfssdk.cache.h;
import com.taobao.global.setting.d;
import com.taobao.login4android.api.Login;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final a f21297a = new a();
    private static final h b = AVFSCacheManager.getInstance().cacheForModule(d.BIZ_NAME).a(a.class.getClassLoader()).a(new c()).a();

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ce440125", new Object[0]) : f21297a;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        h hVar = b;
        return (String) hVar.b(Login.getUserId() + "_" + str);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        h hVar = b;
        hVar.a(Login.getUserId() + "_" + str, (Object) str2);
    }
}
