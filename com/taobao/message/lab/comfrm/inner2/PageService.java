package com.taobao.message.lab.comfrm.inner2;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes7.dex */
public class PageService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Activity mActivity;

    static {
        kge.a(-40066523);
    }

    public PageService(Activity activity) {
        this.mActivity = activity;
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this}) : this.mActivity;
    }

    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            this.mActivity.finish();
        }
    }

    public Nav nav() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Nav) ipChange.ipc$dispatch("f3d660b7", new Object[]{this}) : Nav.from(this.mActivity);
    }
}
