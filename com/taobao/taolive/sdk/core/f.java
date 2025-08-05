package com.taobao.taolive.sdk.core;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.core.impl.TBLiveDataProvider;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import tb.kge;
import tb.ppp;
import tb.ppq;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static f f21824a;
    private static Application b;
    private ISmallWindowStrategy c;
    private ppp d;
    private ppq e;
    private String f;
    private String g;

    static {
        kge.a(1802315287);
    }

    private f() {
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("494cf1fa", new Object[0]);
        }
        if (f21824a == null) {
            f21824a = new f();
        }
        return f21824a;
    }

    public Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[]{this}) : b;
    }

    public void a(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be04981", new Object[]{this, application, str});
        } else {
            a(application, str, null);
        }
    }

    private void a(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef60750b", new Object[]{this, application, str, str2});
            return;
        }
        b = application;
        this.f = str;
        this.g = str2;
    }

    public ppq c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppq) ipChange.ipc$dispatch("1e6c8b8b", new Object[]{this});
        }
        ppq ppqVar = this.e;
        return ppqVar == null ? new TBLiveDataProvider() : ppqVar;
    }

    public ISmallWindowStrategy d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISmallWindowStrategy) ipChange.ipc$dispatch("426bb3ad", new Object[]{this}) : this.c;
    }

    public void a(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4d14aa", new Object[]{this, iSmallWindowStrategy});
        } else {
            this.c = iSmallWindowStrategy;
        }
    }

    public void a(ppp pppVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa11e668", new Object[]{this, pppVar});
        } else {
            this.d = pppVar;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
