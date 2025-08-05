package com.taobao.tao.flexbox.layoutmanager.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.af;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import com.taobao.tao.flexbox.layoutmanager.filter.Utils;
import tb.kge;

/* loaded from: classes8.dex */
public class ag implements Utils.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public h.b f20344a;
    public Object b;
    public Object c;
    public af.b d;
    public h.b e;
    public String f;
    public Utils.a g;

    static {
        kge.a(1137639263);
        kge.a(-1424308304);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        if (this.g == null) {
            this.g = new Utils.a();
        }
        this.g.a(str, obj);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
    public Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str});
        }
        Utils.a aVar = this.g;
        if (aVar == null) {
            return null;
        }
        return aVar.b(str);
    }
}
