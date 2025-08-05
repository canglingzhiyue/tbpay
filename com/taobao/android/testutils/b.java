package com.taobao.android.testutils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.jgw;
import tb.jgx;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static b c;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<jgw> f15517a;
    private boolean b;

    static {
        kge.a(-315558822);
    }

    private b() {
        c();
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e6e21efe", new Object[0]);
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    public void a(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else if (hashMap == null || hashMap.isEmpty()) {
        } else {
            this.b = b(hashMap);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.f15517a == null) {
            this.f15517a = new ArrayList<>();
        }
        this.f15517a.add(new jgx());
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005c -> B:22:0x005d). Please submit an issue!!! */
    private boolean b(HashMap<String, Object> hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("616d4b2e", new Object[]{this, hashMap})).booleanValue();
        }
        try {
            str = (String) hashMap.get(jgw.IS_GRAY_VERSION);
        } catch (Throwable th) {
            TLog.loge("TestConfigUtils", "isGrayVersion exception", th);
        }
        if (str != null) {
            return Boolean.valueOf(str).booleanValue();
        }
        if (this.f15517a != null) {
            Iterator<jgw> it = this.f15517a.iterator();
            while (it.hasNext()) {
                jgw next = it.next();
                if (next.a(hashMap) && next.b(hashMap)) {
                    return true;
                }
            }
        }
        return false;
    }
}
