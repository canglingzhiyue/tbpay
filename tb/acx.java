package tb;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.util.i;
import com.android.alibaba.ip.runtime.IpChange;

@Deprecated
/* loaded from: classes2.dex */
public class acx extends Dialog implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private i f25255a;
    private Message b;
    private Message c;

    static {
        kge.a(1166579467);
        kge.a(-1043440182);
    }

    public acx(Context context, int i) {
        super(context, i);
        this.f25255a = new i(Looper.getMainLooper(), this);
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e04fa50f", new Object[]{this, onCancelListener});
        } else if (onCancelListener != null) {
            this.b = this.f25255a.obtainMessage(68, onCancelListener);
            setCancelMessage(this.b);
        } else {
            Message message = this.b;
            if (message != null) {
                message.recycle();
            }
            this.b = null;
            setCancelMessage(null);
        }
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d2d87", new Object[]{this, onDismissListener});
        } else if (onDismissListener != null) {
            this.c = this.f25255a.obtainMessage(67, onDismissListener);
            setDismissMessage(this.c);
        } else {
            Message message = this.c;
            if (message != null) {
                message.recycle();
            }
            this.c = null;
            setDismissMessage(null);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 67) {
            ((DialogInterface.OnDismissListener) message.obj).onDismiss(this);
        } else if (i == 68) {
            ((DialogInterface.OnCancelListener) message.obj).onCancel(this);
        }
        return true;
    }
}
