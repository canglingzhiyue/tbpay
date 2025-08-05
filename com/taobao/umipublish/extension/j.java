package com.taobao.umipublish.extension;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes9.dex */
public class j implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1675767007);
        kge.a(2036031735);
    }

    @Override // com.taobao.umipublish.extension.d
    public void a(Activity activity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea7fe7f", new Object[]{this, activity, str, new Integer(i)});
            return;
        }
        try {
            Nav.from(activity).forResult(i).toUri(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.umipublish.extension.d
    public void a(Fragment fragment, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68c88ef", new Object[]{this, fragment, str, new Integer(i)});
            return;
        }
        try {
            Nav.from(fragment.getContext()).withFragment(fragment).forResult(i).toUri(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
