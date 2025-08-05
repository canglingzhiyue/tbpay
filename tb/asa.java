package tb;

import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class asa {

    /* renamed from: a  reason: collision with root package name */
    private Handler.Callback f25544a = new Handler.Callback() { // from class: tb.asa.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            bnk bnkVar = (bnk) message.obj;
            if (bnkVar.e == null) {
                bnkVar.c.a("create failed");
            } else {
                bnkVar.b.a(bnkVar.e);
            }
            csr.a().a(bnkVar);
            return true;
        }
    };
    public Handler c;
    public csr d;

    static {
        kge.a(-216803840);
    }

    public asa() {
        this.c = null;
        this.d = null;
        this.c = new Handler(this.f25544a);
        this.d = csr.a();
    }
}
