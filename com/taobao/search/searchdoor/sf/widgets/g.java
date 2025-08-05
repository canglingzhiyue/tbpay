package com.taobao.search.searchdoor.sf.widgets;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;
import tb.kge;
import tb.nre;
import tb.nrj;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f19392a;
    private boolean b;

    static {
        kge.a(-1595212701);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b) {
        } else {
            this.b = true;
            this.f19392a = UUID.randomUUID().toString();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.b) {
        } else {
            this.b = false;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f19392a;
    }

    public void onEventMainThread(nre.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8b0453", new Object[]{this, eVar});
        } else {
            b();
        }
    }

    public void onEventMainThread(nrj.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811e251", new Object[]{this, bVar});
        } else if (bVar.a()) {
            b();
        } else {
            a();
        }
    }
}
