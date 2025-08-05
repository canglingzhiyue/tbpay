package com.taobao.tao.purchase.inject;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f20888a;
    public Class b;
    public boolean c;
    private volatile Object d;

    public Object a() throws IllegalAccessException, InstantiationException {
        if (this.c) {
            if (this.d == null) {
                synchronized (this) {
                    if (this.d == null) {
                        this.d = this.b.newInstance();
                    }
                }
            }
            return this.d;
        }
        return this.b.newInstance();
    }
}
