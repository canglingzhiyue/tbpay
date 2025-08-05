package com.taobao.android.fluid.framework.preload.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex_framework.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes5.dex */
public class PreloadWeexData {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CREATE_INSTANCE = 1;
    public static final String INNER_PRELOAD = "innerPreload";
    public static final String OUTSIDE_PRELOAD = "outsidePreload";
    public static final int RENDER_FAIL = 3;
    public static final int RENDER_SUCCESS = 2;

    /* renamed from: a  reason: collision with root package name */
    private WeexInstance f12628a;
    private int b;
    private boolean c;
    private String d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface WeexInstanceStatus {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface WeexPreloadScene {
    }

    static {
        kge.a(-685673250);
    }

    public p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("8088e5e5", new Object[]{this});
        }
        WeexInstance weexInstance = this.f12628a;
        if (weexInstance == null) {
            return null;
        }
        return ((WeexInstanceImpl) weexInstance).getAdapterMUSInstance();
    }

    public WeexInstance d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("ba60fb69", new Object[]{this}) : this.f12628a;
    }

    public void a(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7ec586", new Object[]{this, weexInstance});
        } else {
            this.f12628a = weexInstance;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreloadWeexData{mWeexInstance=" + this.f12628a + ", mStatus=" + this.b + '}';
    }
}
