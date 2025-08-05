package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

@Deprecated
/* loaded from: classes8.dex */
public class prt extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SparseIntArray f32836a;
    private long b;
    private boolean c;
    private a d;

    /* loaded from: classes8.dex */
    public interface a {
        int a();

        void b();
    }

    static {
        kge.a(-2019589628);
    }

    public static /* synthetic */ Object ipc$super(prt prtVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public prt(a aVar, long j, Looper looper) {
        super(looper);
        this.c = true;
        this.d = aVar;
        this.b = j;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (87208 != message.what || (aVar = this.d) == null) {
        } else {
            int a2 = aVar.a();
            try {
                this.d.b();
            } catch (Exception e) {
                TLog.loge("live_uikit.TimerHandler", "handlerMessage exp.", e);
            }
            a(a2);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            sendEmptyMessageDelayed(87208, b(i));
        }
    }

    private long b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2e", new Object[]{this, new Integer(i)})).longValue();
        }
        long j = this.b;
        SparseIntArray sparseIntArray = this.f32836a;
        if (sparseIntArray == null) {
            return j;
        }
        long j2 = sparseIntArray.get(i, -1);
        return j2 > 0 ? j2 : j;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca6bd89", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public void a(SparseIntArray sparseIntArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f57d0962", new Object[]{this, sparseIntArray});
        } else {
            this.f32836a = sparseIntArray;
        }
    }
}
