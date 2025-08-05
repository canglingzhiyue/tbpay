package com.flybird.deploy.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CustomInfoMap f7223a;
    public Object b;

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final c f7224a = new c();

        public a a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("99d1ca7e", new Object[]{this, obj});
            }
            this.f7224a.b = obj;
            return this;
        }

        public a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("743aba46", new Object[]{this, str, str2});
            }
            this.f7224a.f7223a.putPreDefEntry(str, str2);
            return this;
        }

        public c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("bfccfef7", new Object[]{this}) : this.f7224a;
        }
    }

    public CustomInfoMap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CustomInfoMap) ipChange.ipc$dispatch("647d5f1d", new Object[]{this}) : this.f7223a;
    }

    public Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FBEnhancedUpdateOptions{customInfo=" + this.f7223a + '}';
    }

    private c() {
        this.f7223a = CustomInfoMap.a();
    }
}
