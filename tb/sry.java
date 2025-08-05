package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.fatigue.a;
import com.taobao.bootimage.arch.flow.view.d;
import com.taobao.bootimage.data.BootImageInfo;

/* loaded from: classes6.dex */
public abstract class sry implements srs, ssb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final d.a f33876a;
    public final sro b;
    public final srk c;
    public final srw d;
    public int e;
    public final a f;
    private final Handler g = new Handler(Looper.getMainLooper()) { // from class: tb.sry.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            removeCallbacksAndMessages(null);
            kej.a("2ARCH_AbsBaseState", "handleMessage result: " + message.what + " , 超时状态 state: " + sry.this.b());
            sry.this.a();
        }
    };

    static {
        kge.a(912232743);
        kge.a(1473342881);
        kge.a(-1772741672);
    }

    public sry(sro sroVar, srk srkVar, a aVar, srw srwVar, d.a aVar2) {
        this.b = sroVar;
        this.c = srkVar;
        this.d = srwVar;
        this.f = aVar;
        this.f33876a = aVar2;
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e = i2;
        kej.a("2ARCH_AbsBaseState", "handleState current state: " + i + " 开始超时计时");
        this.g.sendEmptyMessageDelayed(2000, 500L);
    }

    @Override // tb.srs
    public void a(BootImageInfo bootImageInfo, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1729a26e", new Object[]{this, bootImageInfo, new Integer(i), new Integer(i2)});
            return;
        }
        kej.a("2ARCH_AbsBaseState", "notifyOnStart 停止计时: ");
        this.g.removeCallbacksAndMessages(null);
    }

    @Override // tb.srs
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        kej.a("2ARCH_AbsBaseState", "notifyViewCreate 停止计时: ");
        this.g.removeCallbacksAndMessages(null);
    }

    @Override // tb.srs
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        kej.a("2ARCH_AbsBaseState", "notifyViewShown 停止计时: ");
        this.g.removeCallbacksAndMessages(null);
    }

    @Override // tb.srs
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        kej.a("2ARCH_AbsBaseState", "notifyTerminate 停止计时: ");
        this.g.removeCallbacksAndMessages(null);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.g.sendEmptyMessageDelayed(2000, 500L);
        }
    }
}
