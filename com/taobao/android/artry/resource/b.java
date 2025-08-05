package com.taobao.android.artry.resource;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.resource.a;
import java.io.File;
import tb.kge;

/* loaded from: classes4.dex */
public class b implements a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;

    /* renamed from: a  reason: collision with root package name */
    public a.b f9072a;

    static {
        kge.a(-271026857);
        kge.a(-1710987721);
        b = b.class.getSimpleName();
    }

    @Override // com.taobao.android.artry.resource.a.b
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        new File(str2).setLastModified(System.currentTimeMillis());
        a.b bVar = this.f9072a;
        if (bVar == null) {
            return;
        }
        try {
            bVar.a(str, str2);
        } catch (Throwable unused) {
            Log.e(b, "some exceptions happened, when invoking onResourceLoaded...");
        }
    }

    @Override // com.taobao.android.artry.resource.a.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        a.b bVar = this.f9072a;
        if (bVar == null) {
            return;
        }
        try {
            bVar.a(i);
        } catch (Throwable unused) {
            Log.e(b, "some exceptions happened, when invoking onProgress...");
        }
    }

    @Override // com.taobao.android.artry.resource.a.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        a.b bVar = this.f9072a;
        if (bVar == null) {
            return;
        }
        try {
            bVar.a(str);
        } catch (Throwable unused) {
            Log.e(b, "some exceptions happened, when invoking onResourceLoadFail...");
        }
    }

    @Override // com.taobao.android.artry.resource.a.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a.b bVar = this.f9072a;
        if (bVar == null) {
            return;
        }
        try {
            bVar.a();
        } catch (Throwable unused) {
            Log.e(b, "some exceptions happened, when invoking onResourceLoadAllFinish...");
        }
    }

    @Override // com.taobao.android.artry.resource.a.b
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        a.b bVar = this.f9072a;
        if (bVar == null) {
            return;
        }
        try {
            bVar.b(str);
        } catch (Throwable unused) {
            Log.e(b, "some exceptions happened, when invoking onError...");
        }
    }
}
