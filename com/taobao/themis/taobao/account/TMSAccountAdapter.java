package com.taobao.themis.taobao.account;

import com.alibaba.ability.impl.user.UserAbility;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.remotebusiness.login.c;
import com.taobao.tao.remotebusiness.login.h;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\r"}, d2 = {"Lcom/taobao/themis/taobao/account/TMSAccountAdapter;", "Lcom/taobao/themis/kernel/adapter/IAccountAdapter;", "()V", "getMtop", "Lmtopsdk/mtop/intf/Mtop;", "getNick", "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "getUserAvatar", "getUserId", UserAbility.API_IS_LOGIN, "", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSAccountAdapter implements IAccountAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(626275855);
        kge.a(-1618983153);
    }

    @Override // com.taobao.themis.kernel.adapter.IAccountAdapter
    public boolean isLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue() : Login.getSid() != null;
    }

    @Override // com.taobao.themis.kernel.adapter.IAccountAdapter
    public boolean isLogin(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2ebaae2f", new Object[]{this, fVar})).booleanValue() : h.a(a(), (String) null);
    }

    @Override // com.taobao.themis.kernel.adapter.IAccountAdapter
    public String getUserId(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a613698", new Object[]{this, fVar});
        }
        c a2 = h.a(a());
        q.b(a2, "RemoteLogin.getLogin(getMtop())");
        if (a2.getLoginContext() == null) {
            return null;
        }
        return a2.getLoginContext().b;
    }

    @Override // com.taobao.themis.kernel.adapter.IAccountAdapter
    public String getNick(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de15299b", new Object[]{this, fVar});
        }
        c a2 = h.a(a());
        q.b(a2, "RemoteLogin.getLogin(getMtop())");
        return a2.getLoginContext() != null ? a2.getLoginContext().c : "";
    }

    @Override // com.taobao.themis.kernel.adapter.IAccountAdapter
    public String getUserAvatar(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7582269a", new Object[]{this, fVar});
        }
        try {
            return Login.getHeadPicLink();
        } catch (Throwable th) {
            TMSLogger.b("TMSAccountAdapter", "getUserAvatar has Error", th);
            return null;
        }
    }

    private final Mtop a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("93743b87", new Object[]{this});
        }
        Object a2 = qpt.a(IEnvironmentService.class);
        q.b(a2, "TMSAdapterManager.getNot…nmentService::class.java)");
        Mtop instance = Mtop.instance(Mtop.Id.INNER, ((IEnvironmentService) a2).getApplicationContext());
        q.b(instance, "Mtop.instance(\n         …licationContext\n        )");
        return instance;
    }
}
