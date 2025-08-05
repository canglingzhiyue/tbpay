package com.taobao.android.sns4android;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile e b;

    /* renamed from: a  reason: collision with root package name */
    private Map<SNSPlatform, f> f15263a;

    static {
        kge.a(-881721520);
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a16de3c7", new Object[0]);
        }
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }

    private e() {
        this.f15263a = new HashMap();
        if (this.f15263a == null) {
            this.f15263a = new HashMap();
        }
    }

    public f a(SNSPlatform sNSPlatform) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("ed972e73", new Object[]{this, sNSPlatform}) : this.f15263a.get(sNSPlatform);
    }

    public void a(SNSPlatform sNSPlatform, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a56473", new Object[]{this, sNSPlatform, fVar});
        } else {
            this.f15263a.put(sNSPlatform, fVar);
        }
    }
}
