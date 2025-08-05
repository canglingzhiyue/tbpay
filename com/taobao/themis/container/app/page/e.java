package com.taobao.themis.container.app.page;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSHomeFragmentManager;", "Lcom/taobao/themis/container/app/page/TMSFragmentManager;", "mActivity", "Landroid/support/v4/app/FragmentActivity;", "containerId", "", "mFragmentManager", "Landroid/support/v4/app/FragmentManager;", "(Landroid/support/v4/app/FragmentActivity;ILandroid/support/v4/app/FragmentManager;)V", "release", "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2086233678);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 97456367) {
            super.h();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FragmentActivity mActivity, int i, FragmentManager mFragmentManager) {
        super(mActivity, i, mFragmentManager);
        q.d(mActivity, "mActivity");
        q.d(mFragmentManager, "mFragmentManager");
    }

    @Override // com.taobao.themis.container.app.page.d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        for (TMSBaseFragment tMSBaseFragment : d()) {
            k().beginTransaction().remove(tMSBaseFragment).commitAllowingStateLoss();
        }
        TMSBaseFragment a2 = a();
        if (a2 != null) {
            k().beginTransaction().remove(a2).commitAllowingStateLoss();
        }
        super.h();
    }
}
