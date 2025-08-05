package com.taobao.android.detail.wrapper.ext.request.client.newmtop;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.main.MainRequestParams;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class PrefetchMtopRequestCallback extends MtopRequestCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PrefetchMtopRequestCallback";

    static {
        kge.a(-918198081);
    }

    public static /* synthetic */ Object ipc$super(PrefetchMtopRequestCallback prefetchMtopRequestCallback, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PrefetchMtopRequestCallback(Context context, MainRequestParams mainRequestParams, RemoteBusiness remoteBusiness, String str, WeakReference<MtopRequestListener<String>> weakReference, String str2) {
        super(context, mainRequestParams, remoteBusiness, str, weakReference, str2);
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.newmtop.PrefetchMtopRequestCallback");
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            prefetchRequestCallback(mtopResponse, "success");
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            prefetchRequestCallback(mtopResponse, "error");
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            prefetchRequestCallback(mtopResponse, "systemError");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void prefetchRequestCallback(mtopsdk.mtop.domain.MtopResponse r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.wrapper.ext.request.client.newmtop.PrefetchMtopRequestCallback.prefetchRequestCallback(mtopsdk.mtop.domain.MtopResponse, java.lang.String):void");
    }
}
