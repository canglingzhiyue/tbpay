package com.alibaba.android.nextrpc.request;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bfq;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f2386a;
    private String b;

    public c a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("393e912c", new Object[]{this, context});
        }
        this.f2386a = context;
        return this;
    }

    public c a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("eaad0b7e", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fd0f5315", new Object[]{this});
        }
        c();
        return new bfq(this.f2386a, this.b);
    }

    public d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("e250c214", new Object[]{this});
        }
        c();
        return new bfq(this.f2386a, this.b);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f2386a == null) {
            throw new IllegalArgumentException("param context can not be null");
        } else {
            if (this.b == null) {
                throw new IllegalArgumentException("param serviceName can not be null");
            }
        }
    }
}
