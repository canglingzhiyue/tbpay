package android.taobao.windvane.extra.uc;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class WVThread extends HandlerThread {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler mHandler;

    static {
        kge.a(-1555847833);
    }

    public static /* synthetic */ Object ipc$super(WVThread wVThread, String str, Object... objArr) {
        if (str.hashCode() == -1052580006) {
            return new Boolean(super.quit());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public WVThread(String str) {
        super(str);
        start();
        this.mHandler = new Handler(getLooper());
    }

    public WVThread(String str, int i) {
        super(str, i);
        start();
        this.mHandler = new Handler(getLooper());
    }

    public WVThread(String str, Handler.Callback callback) {
        super(str);
        start();
        this.mHandler = new Handler(getLooper(), callback);
    }

    public WVThread(String str, int i, Handler.Callback callback) {
        super(str, i);
        start();
        this.mHandler = new Handler(getLooper(), callback);
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c142e75a", new Object[]{this})).booleanValue();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        return super.quit();
    }

    public Handler getHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this}) : this.mHandler;
    }
}
