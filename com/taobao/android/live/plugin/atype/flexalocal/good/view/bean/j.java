package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f13852a;
    public long b;
    public String c;
    public boolean d;
    public boolean e;
    public int f = 0;
    public boolean g = false;

    static {
        kge.a(881817708);
    }

    public void a(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa210a1c", new Object[]{this, str, new Long(j), str2});
            return;
        }
        this.f13852a = str;
        this.b = j;
        this.c = str2;
        this.d = false;
        this.g = false;
        this.e = true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.e = false;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b > 0;
    }
}
