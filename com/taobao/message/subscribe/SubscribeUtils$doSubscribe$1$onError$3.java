package com.taobao.message.subscribe;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SubscribeUtils$doSubscribe$1$onError$3 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SubscribeUtils$doSubscribe$1$onError$3 INSTANCE = new SubscribeUtils$doSubscribe$1$onError$3();

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            TBToast.makeText(Globals.getApplication(), Constants.DEFAULT_TOAST).show();
        }
    }
}
