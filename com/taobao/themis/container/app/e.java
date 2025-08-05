package com.taobao.themis.container.app;

import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qqb;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/container/app/SinglePageContainerHelper;", "Lcom/taobao/themis/container/app/TMSAppContainerHelper;", "activity", "Landroid/support/v4/app/FragmentActivity;", "(Landroid/support/v4/app/FragmentActivity;)V", "createPageManager", "Lcom/taobao/themis/kernel/page/ITMSPageManager;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "launch", "", "solutionType", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "renderListener", "Lcom/taobao/themis/kernel/TMSInstance$IRenderListener;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1304290342);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 1135491724) {
            super.a((TMSSolutionType) objArr[0], (f.c) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FragmentActivity activity) {
        super(activity, null, 2, null);
        q.d(activity, "activity");
    }

    @Override // com.taobao.themis.container.app.a, tb.qos, tb.trk
    public void a(TMSSolutionType tMSSolutionType, f.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ae3a8c", new Object[]{this, tMSSolutionType, cVar});
        } else {
            super.a(tMSSolutionType, cVar);
        }
    }

    @Override // tb.qos
    public qqb a(com.taobao.themis.kernel.f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qqb) ipChange.ipc$dispatch("dd2781b7", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        return new h(d(), instance);
    }
}
