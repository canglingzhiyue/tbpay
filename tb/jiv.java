package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class jiv extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<jiw> f29575a;

    static {
        kge.a(-2015557777);
    }

    public static /* synthetic */ Object ipc$super(jiv jivVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public jiv(Looper looper) {
        super(looper);
    }

    public void a(jiw jiwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef755cc0", new Object[]{this, jiwVar});
        } else {
            this.f29575a = new WeakReference<>(jiwVar);
        }
    }

    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        sendMessage(obtain);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        jiw a2 = a();
        if (a2 != null) {
            a2.a(message);
        } else {
            removeCallbacksAndMessages(null);
        }
    }

    private jiw a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jiw) ipChange.ipc$dispatch("f066d06", new Object[]{this});
        }
        WeakReference<jiw> weakReference = this.f29575a;
        if (weakReference != null && weakReference.get() != null) {
            return this.f29575a.get();
        }
        return null;
    }
}
