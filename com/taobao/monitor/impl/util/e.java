package com.taobao.monitor.impl.util;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f18210a = new StringBuilder();

    public e a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("63548c82", new Object[]{this, obj});
        }
        this.f18210a.append(obj);
        return this;
    }

    public e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("f86aedde", new Object[]{this});
        }
        this.f18210a.append("\t");
        return this;
    }

    public e b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("6caa263d", new Object[]{this});
        }
        this.f18210a.append("\n");
        return this;
    }

    public e a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c794d4", new Object[]{this, str});
        }
        StringBuilder sb = this.f18210a;
        sb.append("****************************************** ");
        sb.append(str);
        sb.append(" *****************************************");
        sb.append("\n");
        return this;
    }

    public e b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("1ae31373", new Object[]{this, str});
        }
        StringBuilder sb = this.f18210a;
        sb.append("+ --------------------------------------------------------------------------------------------");
        sb.append("\n");
        StringBuilder sb2 = this.f18210a;
        sb2.append("| ");
        sb2.append(str);
        sb2.append(" :");
        sb2.append("\n");
        return this;
    }

    public e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("e0e95e9c", new Object[]{this});
        }
        StringBuilder sb = this.f18210a;
        sb.append("| ");
        sb.append("  -> ");
        return this;
    }

    public e a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("4740aa4a", new Object[]{this, str, str2});
        }
        StringBuilder sb = this.f18210a;
        sb.append("| ");
        sb.append("  -> ");
        sb.append(str);
        sb.append("\t= ");
        sb.append(str2);
        sb.append("\n");
        return this;
    }

    public e d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("552896fb", new Object[]{this});
        }
        this.f18210a.append("**********************************************************************************************");
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f18210a.toString();
    }
}
