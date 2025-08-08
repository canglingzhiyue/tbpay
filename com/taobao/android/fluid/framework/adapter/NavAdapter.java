package com.taobao.android.fluid.framework.adapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes5.dex */
public class NavAdapter implements INavAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1492431733);
        kge.a(-595100596);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : INavAdapter.ADAPTER_NAME;
    }

    public void doNav(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643404e1", new Object[]{this, context, str, bundle});
        } else {
            Nav.from(context).withExtras(bundle).toUri(str);
        }
    }

    public void doNavDisableTransition(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794c91ae", new Object[]{this, context, str, bundle});
            return;
        }
        Nav.setTransition(0, 0);
        Nav.from(context).withExtras(bundle).toUri(str);
    }

    public void doNav(Context context, String str, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224d0a42", new Object[]{this, context, str, bundle, new Integer(i)});
        } else {
            Nav.from(context).withFlags(i).withExtras(bundle).toUri(str);
        }
    }

    public void doNav(Context context, String str, Bundle bundle, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2754b101", new Object[]{this, context, str, bundle, new Integer(i), new Integer(i2)});
        } else {
            Nav.from(context).forResult(i2).withFlags(i).withExtras(bundle).toUri(str);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.INavAdapter
    public final void nav(FluidContext fluidContext, Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7465f5e", new Object[]{this, fluidContext, context, str, bundle});
            return;
        }
        checkIfShowSmallVideo(fluidContext, context, str);
        doNav(context, str, ensureModalMode(bundle));
    }

    @Override // com.taobao.android.fluid.framework.adapter.INavAdapter
    public void navDisableTransition(FluidContext fluidContext, Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2af68975", new Object[]{this, fluidContext, context, str, bundle});
            return;
        }
        checkIfShowSmallVideo(fluidContext, context, str);
        doNavDisableTransition(context, str, ensureModalMode(bundle));
    }

    @Override // com.taobao.android.fluid.framework.adapter.INavAdapter
    public final void nav(FluidContext fluidContext, Context context, String str, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e185ff65", new Object[]{this, fluidContext, context, str, bundle, new Integer(i)});
            return;
        }
        checkIfShowSmallVideo(fluidContext, context, str);
        doNav(context, str, ensureModalMode(bundle), i);
    }

    @Override // com.taobao.android.fluid.framework.adapter.INavAdapter
    public final void nav(FluidContext fluidContext, Context context, String str, Bundle bundle, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f3a603e", new Object[]{this, fluidContext, context, str, bundle, new Integer(i), new Integer(i2)});
            return;
        }
        checkIfShowSmallVideo(fluidContext, context, str);
        doNav(context, str, ensureModalMode(bundle), i, i2);
    }

    @Override // com.taobao.android.fluid.framework.adapter.INavAdapter
    public final void nav(FluidContext fluidContext, Fragment fragment, String str, Bundle bundle, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a86ec14", new Object[]{this, fluidContext, fragment, str, bundle, new Integer(i), new Integer(i2)});
            return;
        }
        checkIfShowSmallVideo(fluidContext, fragment.getActivity(), str);
        doNav(fragment, str, ensureModalMode(bundle), i, i2);
    }

    public void doNav(Fragment fragment, String str, Bundle bundle, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb71c9d7", new Object[]{this, fragment, str, bundle, new Integer(i), new Integer(i2)});
        } else {
            Nav.from(fragment.getActivity()).withFragment(fragment).forResult(i2).withFlags(i).withExtras(bundle).toUri(str);
        }
    }

    private void checkIfShowSmallVideo(FluidContext fluidContext, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2047c4c3", new Object[]{this, fluidContext, context, str});
        } else if (StringUtils.isEmpty(str) || !(context instanceof Activity) || !Boolean.parseBoolean(Uri.parse(str).getQueryParameter("miniwindow"))) {
        } else {
            ((IMediaService) fluidContext.getService(IMediaService.class)).setNeedFloatWindow(true);
        }
    }

    private Bundle ensureModalMode(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("e5e4b95f", new Object[]{this, bundle});
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("stdPopModal", true);
        return bundle;
    }
}
