package com.taobao.themis.ability.basic.router;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.ability.result.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsRouterAbility;
import com.taobao.android.abilityidl.ability.dx;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.extension.page.ab;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.als;
import tb.gml;
import tb.kge;
import tb.qqb;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002J*\u0010\u000f\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u001a"}, d2 = {"Lcom/taobao/themis/ability/basic/router/TMSRouterAbility;", "Lcom/taobao/android/abilityidl/ability/AbsRouterAbility;", "()V", "closeApp", "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "callback", "Lcom/taobao/android/abilityidl/callback/IAbilityCallback;", "generatePage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "params", "Lcom/taobao/android/abilityidl/ability/RouterPushPageParams;", "getPageProps", "Lcom/alibaba/ability/result/Result;", "", "", "", "Lcom/alibaba/ability/result/ErrorResult;", "popPage", "popToRoot", com.taobao.tmgcashier.constant.a.BRIDGE_ACTION_PUSHPAGE, "replacePage", "resetToPage", "themis_ability_basic_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSRouterAbility extends AbsRouterAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-858201487);
    }

    public static /* synthetic */ Object ipc$super(TMSRouterAbility tMSRouterAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public void closeApp(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c38d42", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
        } else if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f("容器实例未找到"));
        } else {
            ab abVar = (ab) a2.a(ab.class);
            if (abVar == null) {
                callback.a(a$a.g("容器能力未实现"));
            } else {
                abVar.d();
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public void replacePage(als context, dx params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1d1dd", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        f b = com.taobao.themis.kernel.utils.a.b(context);
        if (b == null) {
            callback.a(a$a.f("容器实例未找到"));
        } else if (b.i() == TMSContainerType.EMBEDDED) {
            callback.a(a$a.g("容器能力未实现"));
        } else {
            ITMSPage a2 = a(b, params, callback);
            if (a2 == null) {
                return;
            }
            b.b().b(a2);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public void resetToPage(als context, dx params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766cf9d3", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        f b = com.taobao.themis.kernel.utils.a.b(context);
        if (b == null) {
            callback.a(a$a.f("容器实例未找到"));
        } else if (b.i() == TMSContainerType.EMBEDDED) {
            callback.a(a$a.g("容器能力未实现"));
        } else {
            ITMSPage a2 = a(b, params, callback);
            if (a2 == null) {
                return;
            }
            b.b().c(a2);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public g<Map<String, Object>, ErrorResult> getPageProps(als context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("427ada10", new Object[]{this, context});
        }
        q.d(context, "context");
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            return new g<>(null, a$a.d("容器页面未找到"));
        }
        LinkedHashMap i = a2.c().i();
        if (i == null) {
            i = new LinkedHashMap();
        }
        return new g<>(i);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public void popPage(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d6339", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        f b = com.taobao.themis.kernel.utils.a.b(context);
        if (b == null) {
            callback.a(a$a.f("容器实例未找到"));
        } else if (b.i() == TMSContainerType.EMBEDDED) {
            callback.a(a$a.g("容器能力未实现"));
        } else if (n.aX()) {
            b.b().a(true);
        } else {
            qqb.a.a(b.b(), false, 1, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public void popToRoot(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc53367", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        f b = com.taobao.themis.kernel.utils.a.b(context);
        if (b == null) {
            callback.a(a$a.f("容器实例未找到"));
        } else if (b.i() == TMSContainerType.EMBEDDED) {
            callback.a(a$a.g("容器能力未实现"));
        } else {
            b.b().a(0);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRouterAbility
    public void pushPage(als context, dx params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1021cc3", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        f b = com.taobao.themis.kernel.utils.a.b(context);
        if (b == null) {
            callback.a(a$a.f("容器实例未找到"));
        } else if (b.i() == TMSContainerType.EMBEDDED) {
            callback.a(a$a.g("容器能力未实现"));
        } else {
            ITMSPage a2 = a(b, params, callback);
            if (a2 == null) {
                return;
            }
            b.b().a(a2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0173, code lost:
        if (r3.equals("weex") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017a, code lost:
        if (r3.equals(r14) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0183, code lost:
        if (r3.equals("") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b0, code lost:
        r14 = "weex";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r3.equals(r14) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bd, code lost:
        if (r3.equals("h5") != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.taobao.themis.kernel.page.ITMSPage a(com.taobao.themis.kernel.f r21, com.taobao.android.abilityidl.ability.dx r22, tb.gml r23) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability.basic.router.TMSRouterAbility.a(com.taobao.themis.kernel.f, com.taobao.android.abilityidl.ability.dx, tb.gml):com.taobao.themis.kernel.page.ITMSPage");
    }
}
