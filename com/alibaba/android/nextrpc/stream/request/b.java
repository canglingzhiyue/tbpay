package com.alibaba.android.nextrpc.stream.request;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f2396a;
    private String b;

    public b a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("85d80d94", new Object[]{this, context});
        }
        this.f2396a = context;
        return this;
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("922cb302", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("bb12726d", new Object[]{this});
        }
        b();
        return new c(this.f2396a, this.b);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f2396a == null) {
            throw new IllegalArgumentException("param context can not be null");
        } else {
            if (this.b == null) {
                throw new IllegalArgumentException("param serviceName can not be null");
            }
        }
    }
}
