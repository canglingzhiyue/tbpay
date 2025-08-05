package tb;

import android.os.Handler;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.d;
import com.uploader.export.e;
import com.uploader.export.i;
import com.uploader.export.j;

/* loaded from: classes9.dex */
public class rnr implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final d f33246a;
    public final i b;
    public final Object c;
    public final int d;

    public static void a(Handler handler, int i, i iVar, d dVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa107d2c", new Object[]{handler, new Integer(i), iVar, dVar, obj});
        } else if (dVar == null) {
        } else {
            rnr rnrVar = new rnr(i, iVar, dVar, obj);
            if (handler == null) {
                rpa.a(rnrVar);
            } else {
                handler.post(rnrVar);
            }
        }
    }

    private rnr(int i, i iVar, d dVar, Object obj) {
        this.d = i;
        this.b = iVar;
        this.f33246a = dVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        switch (this.d) {
            case 0:
                this.f33246a.onSuccess(this.b, (e) this.c);
                return;
            case 1:
                this.f33246a.onCancel(this.b);
                return;
            case 2:
                this.f33246a.onFailure(this.b, (j) this.c);
                return;
            case 3:
                this.f33246a.onProgress(this.b, ((Integer) ((Pair) this.c).first).intValue());
                return;
            case 4:
                this.f33246a.onPause(this.b);
                return;
            case 5:
                this.f33246a.onStart(this.b);
                return;
            case 6:
                this.f33246a.onResume(this.b);
                return;
            case 7:
                this.f33246a.onWait(this.b);
                return;
            default:
                return;
        }
    }
}
