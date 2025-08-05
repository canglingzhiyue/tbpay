package com.taobao.themis.open.permission.auth.model;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/open/permission/auth/model/AuthResultModel;", "", "()V", "authContentResult", "Lcom/taobao/themis/open/permission/auth/model/AuthContentResultModel;", "getAuthContentResult", "()Lcom/taobao/themis/open/permission/auth/model/AuthContentResultModel;", "setAuthContentResult", "(Lcom/taobao/themis/open/permission/auth/model/AuthContentResultModel;)V", "authExecuteResult", "Lcom/taobao/themis/open/permission/auth/model/AuthExecuteResultModel;", "getAuthExecuteResult", "()Lcom/taobao/themis/open/permission/auth/model/AuthExecuteResultModel;", "setAuthExecuteResult", "(Lcom/taobao/themis/open/permission/auth/model/AuthExecuteResultModel;)V", "isShareScene", "", "()Z", "setShareScene", "(Z)V", "isSuccess", "setSuccess", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f22690a = new b();
    private a b = new a();
    private boolean c;

    static {
        kge.a(-2010129944);
    }

    public final b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("68569db7", new Object[]{this}) : this.f22690a;
    }

    public final a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("962f37f7", new Object[]{this}) : this.b;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }
}
