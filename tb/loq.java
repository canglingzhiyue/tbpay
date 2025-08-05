package tb;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class loq extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long SHOWPOP = 5324305154466847095L;

    static {
        kge.a(-1747722151);
    }

    public static /* synthetic */ Object ipc$super(loq loqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (lVar.h() == null) {
            return d();
        }
        String c = dlhVar.c("event");
        String c2 = dlhVar.c("param");
        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
        intent.putExtra("event", c);
        intent.putExtra("param", c2);
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
        return new dla();
    }

    private dkw d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkw) ipChange.ipc$dispatch("2618aa6b", new Object[]{this}) : new dkw(new dkv(30000, "runtimeContext为空"), true);
    }

    /* loaded from: classes.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1905963472);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public loq a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (loq) ipChange.ipc$dispatch("16bdb634", new Object[]{this, obj}) : new loq();
        }
    }
}
