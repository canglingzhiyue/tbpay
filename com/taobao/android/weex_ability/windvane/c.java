package com.taobao.android.weex_ability.windvane;

import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.IJsApiSucceedCallBack;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c implements IJsApiFailedCallBack, IJsApiSucceedCallBack, android.taobao.windvane.jsbridge.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.android.weex.b f15973a;
    private boolean b;
    private com.taobao.android.weex.b c;

    static {
        kge.a(445451493);
        kge.a(-235203866);
        kge.a(411173315);
        kge.a(1076802696);
    }

    public c(com.taobao.android.weex.b bVar, boolean z, com.taobao.android.weex.b bVar2) {
        this.c = bVar;
        this.b = z;
        this.f15973a = bVar2;
    }

    @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
    public void succeed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
        } else if (this.b) {
            try {
                Object parse = JSONObject.parse(str);
                if (this.c != null) {
                    this.c.a(parse);
                }
                if (this.f15973a == null) {
                    return;
                }
                this.f15973a.a();
            } catch (Exception unused) {
            }
        } else {
            com.taobao.android.weex.b bVar = this.c;
            if (bVar != null) {
                bVar.a(str);
            }
            com.taobao.android.weex.b bVar2 = this.f15973a;
            if (bVar2 == null) {
                return;
            }
            bVar2.a();
        }
    }

    @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
    public void fail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534fc72f", new Object[]{this, str});
        } else if (this.b) {
            try {
                Object parse = JSONObject.parse(str);
                if (this.c != null) {
                    this.c.a(parse);
                }
                if (this.f15973a == null) {
                    return;
                }
                this.f15973a.a();
            } catch (Exception unused) {
            }
        } else {
            com.taobao.android.weex.b bVar = this.c;
            if (bVar != null) {
                bVar.a(str);
            }
            com.taobao.android.weex.b bVar2 = this.f15973a;
            if (bVar2 == null) {
                return;
            }
            bVar2.a();
        }
    }

    @Override // android.taobao.windvane.jsbridge.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.b) {
            try {
                Object parse = JSONObject.parse(str);
                if (this.c == null) {
                    return;
                }
                this.c.b(parse);
            } catch (Exception unused) {
            }
        } else {
            com.taobao.android.weex.b bVar = this.c;
            if (bVar == null) {
                return;
            }
            bVar.b(str);
        }
    }
}
