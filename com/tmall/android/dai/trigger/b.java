package com.tmall.android.dai.trigger;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_GROUP_WALLE = "Walle";
    public static final String TAG = "JarvisTriggerManager";

    /* renamed from: a  reason: collision with root package name */
    private static final b f23727a;
    private final ConcurrentHashMap<String, List<String>> b = new ConcurrentHashMap<>();

    static {
        kge.a(2072817065);
        f23727a = new b();
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e0866966", new Object[0]) : f23727a;
    }

    public void a(com.tmall.android.dai.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0230f6", new Object[]{this, aVar});
        } else {
            c.a().a(CONFIG_GROUP_WALLE, aVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            c.a().a(CONFIG_GROUP_WALLE, str);
        }
    }
}
