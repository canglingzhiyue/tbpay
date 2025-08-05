package com.taobao.tao.friends.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.contacts.data.member.RecentMember;
import com.taobao.share.ui.engine.friend.ContactInfo;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends com.taobao.share.globalmodel.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ContactInfo c;
    public b d;
    public RecentMember e;
    public String f;
    public String g;
    public String h;
    public String i;
    private SourceType j;
    private String k;

    static {
        kge.a(1246058045);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.i;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.g;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.h;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public RecentMember g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecentMember) ipChange.ipc$dispatch("78967849", new Object[]{this}) : this.e;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.f;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void a(RecentMember recentMember) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59daab49", new Object[]{this, recentMember});
        } else {
            this.e = recentMember;
        }
    }

    public b i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("879e9453", new Object[]{this}) : this.d;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7a48d5", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    public SourceType j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SourceType) ipChange.ipc$dispatch("7f445c4d", new Object[]{this}) : this.j;
    }

    public void a(SourceType sourceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab407c4", new Object[]{this, sourceType});
        } else {
            this.j = sourceType;
        }
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.k;
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }
}
