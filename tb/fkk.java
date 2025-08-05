package tb;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.VideoRoundCornerLayout;
import tb.shm;

/* loaded from: classes5.dex */
public class fkk extends shm.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f28012a;
    private Window b;
    private int c = -1;
    private final sii d;

    static {
        kge.a(2144994966);
    }

    public static /* synthetic */ Object ipc$super(fkk fkkVar, String str, Object... objArr) {
        if (str.hashCode() == -1355309186) {
            super.onCreateView((psw) objArr[0], (snp) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public fkk(sii siiVar) {
        this.d = siiVar;
        siiVar.t().addCardLifecycleListener(this);
    }

    @Override // tb.shm.a, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        super.onCreateView(pswVar, snpVar);
        VideoRoundCornerLayout c = this.d.Z().c();
        if (c == null) {
            return;
        }
        this.f28012a = c.getContext();
        Context context = this.f28012a;
        if (!(context instanceof Activity)) {
            return;
        }
        this.b = ((Activity) context).getWindow();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        if (i != this.c) {
            b();
        }
        this.c = i;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!sjt.n()) {
        } else {
            b();
        }
    }

    private void b() {
        Window window;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!d() || (window = this.b) == null) {
        } else {
            if ((window.getAttributes().flags & 128) != 0) {
                z = true;
            }
            if (z) {
                return;
            }
            spz.c("KeepScreenManager", "setWindowKeepScreenOnTask,屏幕保持常亮状态未设置");
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Window window = this.b;
        if (window == null) {
            return;
        }
        window.addFlags(128);
        spz.c("KeepScreenManager", "keepScreenOn");
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableWindowKeepScreenOnTask", true);
    }
}
