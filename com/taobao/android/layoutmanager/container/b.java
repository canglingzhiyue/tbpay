package com.taobao.android.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.BaseContainerFragment;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout;
import tb.kge;
import tb.oec;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f13180a;
    public m.b b;
    public BaseContainerFragment c;
    public boolean d;

    static {
        kge.a(-1470242634);
    }

    public void a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
        }
    }

    public b(Context context, BaseContainerFragment baseContainerFragment, m.b bVar) {
        this.f13180a = context;
        this.c = baseContainerFragment;
        this.b = bVar;
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        ViewGroup tNodeContainer = this.c.getTNodeContainer();
        tNodeContainer.setClickable(true);
        boolean a2 = oec.a((Object) this.b.b.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PULL_DOWN), false);
        if (!(tNodeContainer instanceof PullDownCloseLayout)) {
            return;
        }
        ((PullDownCloseLayout) tNodeContainer).setForbidGesture(!a2);
    }

    public void a(Activity activity, BaseContainerFragment.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96316b9", new Object[]{this, activity, aVar});
            return;
        }
        boolean a2 = oec.a((Object) this.b.b.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PULL_DOWN), false);
        aVar.a();
        if (a2) {
            if (activity == null) {
                return;
            }
            activity.overridePendingTransition(0, this.d ? 0 : 17432577);
        } else if (activity == null || b(activity)) {
        } else {
            activity.overridePendingTransition(0, 0);
        }
    }

    public boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{this, activity})).booleanValue();
        }
        boolean a2 = oec.a((Object) this.b.b.getQueryParameter("animated"), true);
        return (!a2 || activity == null) ? a2 : oec.a((Object) activity.getIntent().getStringExtra("animated"), true);
    }
}
