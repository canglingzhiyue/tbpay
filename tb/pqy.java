package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class pqy extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<pqu> f32824a;

    static {
        kge.a(-844127377);
    }

    public pqy(pqu pquVar) {
        super(Looper.getMainLooper());
        this.f32824a = new WeakReference<>(pquVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        pqu pquVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        WeakReference<pqu> weakReference = this.f32824a;
        if (weakReference == null || (pquVar = weakReference.get()) == null) {
            return;
        }
        pquVar.handleMessage(message);
    }
}
