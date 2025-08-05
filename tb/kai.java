package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import java.util.List;

/* loaded from: classes6.dex */
public class kai extends kae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f29907a;
    private final kae b;
    private final kae c;

    static {
        kge.a(-1022289564);
        f29907a = false;
    }

    public kai(Uri uri) {
        this.b = new kag(uri);
        this.c = new kaj(uri);
    }

    @Override // tb.kae
    public Reply b(Call call) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("634e04d1", new Object[]{this, call});
        }
        if (f29907a) {
            return this.b.b(call);
        }
        try {
            return this.c.b(call);
        } catch (IPCException e) {
            int errorCode = e.getErrorCode();
            if (errorCode != 1) {
                if (errorCode == 19) {
                    f29907a = true;
                } else {
                    throw e;
                }
            }
            return this.b.b(call);
        }
    }

    @Override // tb.kah
    public void b(List<String> list) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (f29907a) {
            this.b.b(list);
        } else {
            try {
                this.c.b(list);
            } catch (IPCException e) {
                int errorCode = e.getErrorCode();
                if (errorCode != 1) {
                    if (errorCode == 19) {
                        f29907a = true;
                    } else {
                        throw e;
                    }
                }
                this.b.b(list);
            }
        }
    }
}
