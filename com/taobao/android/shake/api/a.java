package com.taobao.android.shake.api;

import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shake.b;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f15063a;

    static {
        kge.a(-1321236910);
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6cb8fd6d", new Object[0]);
        }
        if (f15063a == null) {
            synchronized (a.class) {
                if (f15063a == null) {
                    f15063a = new a();
                }
            }
        }
        return f15063a;
    }

    public boolean a(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("28a16ae0", new Object[]{this, viewStub})).booleanValue() : b.a().a(viewStub);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            b.a().b();
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : b.a().c();
    }

    public static boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue() : b.a().a(z);
    }
}
