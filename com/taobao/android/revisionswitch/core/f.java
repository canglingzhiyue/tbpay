package com.taobao.android.revisionswitch.core;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f DefaultOrangeAllOpenSwitch = new f();

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.revisionswitch.utils.c<String> f14887a = new com.taobao.android.revisionswitch.utils.c<>();

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        com.taobao.android.revisionswitch.utils.c<String> cVar = this.f14887a;
        if (cVar != null) {
            return cVar.a(str);
        }
        return false;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        com.taobao.android.revisionswitch.utils.c<String> cVar = this.f14887a;
        if (cVar != null) {
            return cVar.b(str);
        }
        return false;
    }

    public void a(com.taobao.android.revisionswitch.utils.c<String> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6aa641", new Object[]{this, cVar});
        } else {
            this.f14887a = cVar;
        }
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            this.f14887a.a((com.taobao.android.revisionswitch.utils.c<String>) str, Boolean.valueOf(z));
        }
    }

    public com.taobao.android.revisionswitch.utils.c<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.revisionswitch.utils.c) ipChange.ipc$dispatch("e659bcc3", new Object[]{this}) : this.f14887a;
    }
}
