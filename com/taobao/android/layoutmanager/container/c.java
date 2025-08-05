package com.taobao.android.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.BaseContainerFragment;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import tb.kge;
import tb.oec;

/* loaded from: classes5.dex */
public class c extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1590291101);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -110946631) {
            super.a((Activity) objArr[0], (BaseContainerFragment.a) objArr[1]);
            return null;
        } else if (hashCode != 109716922) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((Activity) objArr[0]);
            return null;
        }
    }

    public c(Context context, BaseContainerFragment baseContainerFragment, m.b bVar) {
        super(context, baseContainerFragment, bVar);
    }

    @Override // com.taobao.android.layoutmanager.container.b
    public void a(Activity activity, BaseContainerFragment.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96316b9", new Object[]{this, activity, aVar});
            return;
        }
        boolean b = b(activity);
        boolean a2 = oec.a((Object) this.b.b.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PULL_DOWN), false);
        if (!b || a2) {
            super.a(activity, aVar);
        } else {
            aVar.a();
        }
    }

    @Override // com.taobao.android.layoutmanager.container.b
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        super.a(activity);
        if (activity != null && !b(activity)) {
            activity.overridePendingTransition(0, 0);
        }
        if (oec.a((Object) this.b.b.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_FULLTRANSPARENT), false)) {
            return;
        }
        this.c.getTNodeContainer().setBackgroundColor(-1);
    }
}
