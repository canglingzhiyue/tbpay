package com.etao.feimagesearch;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.m;
import com.etao.feimagesearch.util.album.a;
import com.taobao.message.disk.IStorageClearService;
import tb.kge;
import tb.nti;

/* loaded from: classes3.dex */
public class CaptureBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_CODE = 999;

    static {
        kge.a(-494919424);
    }

    public static void openAlbumPage(Activity activity, final m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8c37be", new Object[]{activity, mVar});
        } else if (mVar == null || !(activity instanceof FragmentActivity)) {
        } else {
            nti.a(com.ut.mini.l.getInstance().getCurrentPageName(), CaptureBridge.class.getSimpleName());
            a.a((FragmentActivity) activity, false, new a.InterfaceC0249a() { // from class: com.etao.feimagesearch.CaptureBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.album.a.InterfaceC0249a
                public void a(com.etao.feimagesearch.album.o oVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("238d8ad7", new Object[]{this, oVar});
                    } else if (oVar.c()) {
                    } else {
                        oVar.j().toString();
                        oVar.i();
                    }
                }
            }, IStorageClearService.Keys.OUTER);
        }
    }
}
