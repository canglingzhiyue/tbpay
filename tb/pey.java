package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class pey extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<pet> f32578a;

    public pey(pet petVar) {
        super(Looper.getMainLooper());
        this.f32578a = new WeakReference<>(petVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        pet petVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        WeakReference<pet> weakReference = this.f32578a;
        if (weakReference == null || (petVar = weakReference.get()) == null) {
            return;
        }
        petVar.a(message);
    }
}
