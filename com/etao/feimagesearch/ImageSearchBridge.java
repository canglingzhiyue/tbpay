package com.etao.feimagesearch;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.a;
import com.etao.feimagesearch.model.b;
import tb.kge;

/* loaded from: classes3.dex */
public class ImageSearchBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(310577757);
    }

    public static void startAlbum(Activity activity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8db6333", new Object[]{activity, str, new Integer(i)});
            return;
        }
        b bVar = new b();
        bVar.setPssource(str);
        activity.startActivityForResult(new a(bVar).createJumpIntent(), i);
        activity.overridePendingTransition(0, 0);
    }

    public static void startAlbum(Fragment fragment, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfaebbb", new Object[]{fragment, str, new Integer(i)});
            return;
        }
        b bVar = new b();
        bVar.setPssource(str);
        fragment.startActivityForResult(new a(bVar).createJumpIntent(), i);
        if (fragment.getActivity() == null) {
            return;
        }
        fragment.getActivity().overridePendingTransition(0, 0);
    }
}
