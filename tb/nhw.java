package tb;

import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public abstract class nhw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Handler c;

    static {
        kge.a(1819463782);
    }

    public void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
            return;
        }
        Handler handler = this.c;
        if (handler == null) {
            return;
        }
        handler.sendMessage(message);
    }
}
