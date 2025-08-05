package com.taobao.metrickit;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class m implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile g f18096a;

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final m f18097a = new m();

        public static /* synthetic */ m a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("9d9408c", new Object[0]) : f18097a;
        }
    }

    private m() {
        this.f18096a = null;
    }

    public static m a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("9d9408c", new Object[0]) : a.a();
    }

    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9b328c", new Object[]{this, gVar});
        } else {
            this.f18096a = gVar;
        }
    }
}
