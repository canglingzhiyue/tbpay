package com.taobao.themis.kernel.ability.base;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;

/* loaded from: classes9.dex */
public class ApiContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f22490a;
    public Source b;
    public f c;
    public ITMSPage d;
    public boolean e;
    public String f;
    public boolean g;

    /* loaded from: classes9.dex */
    public enum Source {
        INSTANCE,
        PLUGIN,
        FRAMEWORK
    }

    static {
        kge.a(-1940037070);
    }

    public ApiContext(a aVar) {
        this.f22490a = aVar.f22491a;
        this.b = aVar.b;
        this.d = aVar.c;
        ITMSPage iTMSPage = this.d;
        if (iTMSPage != null) {
            this.c = iTMSPage.b();
        } else {
            this.c = aVar.d;
        }
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
    }

    public Activity a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this}) : this.f22490a;
    }

    public Source b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Source) ipChange.ipc$dispatch("59a1edcd", new Object[]{this}) : this.b;
    }

    public f c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("6333e9f1", new Object[]{this}) : this.c;
    }

    public ITMSPage d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("7f0e0b36", new Object[]{this}) : this.d;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.g;
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Activity f22491a;
        public Source b;
        public ITMSPage c;
        public f d;
        public String f;
        public boolean e = true;
        public boolean g = false;

        static {
            kge.a(333440777);
        }

        public a a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ab9687fc", new Object[]{this, activity});
            }
            this.f22491a = activity;
            return this;
        }

        public a a(Source source) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("56d3d12a", new Object[]{this, source});
            }
            this.b = source;
            return this;
        }

        public a a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("57fa4703", new Object[]{this, iTMSPage});
            }
            this.c = iTMSPage;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b98d110a", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("df211a0b", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("256cfe84", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public ApiContext a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ApiContext) ipChange.ipc$dispatch("fdc2f7ab", new Object[]{this}) : new ApiContext(this);
        }
    }
}
