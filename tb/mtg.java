package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mtk;

/* loaded from: classes7.dex */
public class mtg implements mtd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.mtd
    public boolean cancel(mtj mtjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9299d0f2", new Object[]{this, mtjVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.mtd
    public boolean asyncSend(final mtj mtjVar, final mtc mtcVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d571220", new Object[]{this, mtjVar, mtcVar, handler})).booleanValue();
        }
        final mtk a2 = new mtk.a().a(417).a("SSRE_NOT_SUPPORT").b("未集成MTOPSDK").a();
        Runnable runnable = new Runnable() { // from class: tb.mtg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                mtc mtcVar2 = mtcVar;
                if (mtcVar2 == null) {
                    return;
                }
                mtcVar2.onError(mtjVar, a2);
            }
        };
        if (handler != null) {
            handler.post(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
        return false;
    }
}
