package com.flybird.deploy.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CustomInfoMap f7221a;
    public Object b;

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b f7222a = new b();

        public a a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("99d1561f", new Object[]{this, obj});
            }
            this.f7222a.b = obj;
            return this;
        }

        public a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("743a45e7", new Object[]{this, str, str2});
            }
            this.f7222a.f7221a.putPreDefEntry(str, str2);
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("bfccfed8", new Object[]{this}) : this.f7222a;
        }
    }

    public CustomInfoMap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CustomInfoMap) ipChange.ipc$dispatch("647d5f1d", new Object[]{this}) : this.f7221a;
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
        return "FBDelayedUpdateOptions{customInfo=" + this.f7221a + '}';
    }

    private b() {
        this.f7221a = CustomInfoMap.a();
    }
}
