package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.eventchain.l;

/* loaded from: classes6.dex */
public class hvt extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PRELOADGOODSDETAIL = "-1316851294519874744";

    static {
        kge.a(-1632776358);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (lVar == null) {
            return new dla();
        }
        final Context a2 = lVar.a();
        if (a2 == null || dlhVar == null) {
            return new dla();
        }
        final JSONObject c = dlhVar.c();
        DXRootView i = lVar.i();
        if (c != null && i != null && hyk.p()) {
            i.post(new Runnable() { // from class: tb.hvt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
                    intent.setPackage("com.taobao.taobao");
                    intent.putExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS, c.toJSONString());
                    a2.sendBroadcast(intent);
                }
            });
        }
        return new dla();
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(606383153);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public hvt a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hvt) ipChange.ipc$dispatch("16bbff5c", new Object[]{this, obj}) : new hvt();
        }
    }
}
