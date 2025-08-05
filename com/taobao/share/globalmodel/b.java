package com.taobao.share.globalmodel;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19628a;
    public ComponentType b;
    private c c;

    static {
        kge.a(1159788337);
    }

    public c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("5b0e1046", new Object[]{this}) : this.c;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8f7900", new Object[]{this, cVar});
        } else {
            this.c = cVar;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f19628a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f19628a = str;
        }
    }

    public ComponentType c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ComponentType) ipChange.ipc$dispatch("d6435030", new Object[]{this}) : this.b;
    }

    public void a(ComponentType componentType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc41eac", new Object[]{this, componentType});
        } else {
            this.b = componentType;
        }
    }
}
