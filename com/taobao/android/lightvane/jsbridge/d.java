package com.taobao.android.lightvane.jsbridge;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.lightvane.webview.a f13289a;
    private String b;
    private String c;
    private b d;
    private a e;

    static {
        kge.a(4346349);
    }

    public d(com.taobao.android.lightvane.webview.a aVar, String str, String str2, b bVar, a aVar2) {
        this.f13289a = aVar;
        this.b = str;
        this.c = str2;
        this.d = bVar;
        this.e = aVar2;
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f77de3", new Object[]{this, iVar});
        } else if (iVar == null) {
        } else {
            iVar.a();
            a(iVar.b());
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        b bVar = this.d;
        if (bVar == null) {
            return;
        }
        bVar.a(str);
    }

    public void b(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6f0b82", new Object[]{this, iVar});
        } else if (iVar == null) {
        } else {
            b(iVar.b());
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(str);
    }

    public com.taobao.android.lightvane.webview.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.lightvane.webview.a) ipChange.ipc$dispatch("71a3adbc", new Object[]{this}) : this.f13289a;
    }
}
