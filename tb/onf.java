package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.d;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.model.ErrorMessage;
import com.taobao.tao.messagekit.core.model.b;
import tao.reactivex.e;

/* loaded from: classes8.dex */
public class onf implements olv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1041555084);
        kge.a(-1909143075);
    }

    @Override // tb.olv
    public Ack a(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("3702b6b0", new Object[]{this, command});
        }
        ErrorMessage errorMessage = new ErrorMessage(command);
        errorMessage.header.c = 2021;
        e.a(new b(errorMessage)).b(d.a().c());
        return null;
    }
}
