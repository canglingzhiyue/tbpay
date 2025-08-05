package com.alibaba.security.ccrc.service.build;

import android.util.LruCache;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Timer;

/* loaded from: classes3.dex */
public class Ma extends LruCache<C1265ya<String, String>, SampleData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final int f3260a = 104857600;
    public static final HashMap<String, Ma> b = new HashMap<>();

    public Ma(String str) {
        super(104857600);
        b.put(str, this);
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
            return;
        }
        Ma ma = b.get(str);
        if (ma == null) {
            return;
        }
        ma.b(str2, str3);
    }

    public void a(String str, String str2, SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc79402f", new Object[]{this, str, str2, sampleData});
        } else if (sampleData == null) {
        } else {
            put(new C1265ya(str, str2), sampleData);
        }
    }

    public static SampleData a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SampleData) ipChange.ipc$dispatch("e8475e83", new Object[]{str, str2, str3});
        }
        Ma ma = b.get(str);
        if (ma == null) {
            return null;
        }
        return ma.a(str2, str3);
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            remove(new C1265ya(str, str2));
        }
    }

    public SampleData a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SampleData) ipChange.ipc$dispatch("becf7c8d", new Object[]{this, str, str2}) : get(new C1265ya(str, str2));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            new Timer(false).schedule(new La(this), 3000L);
        }
    }
}
