package tb;

import android.webkit.ConsoleMessage;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes7.dex */
public class nfw implements ngc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31435a;
    private ngk b;

    static {
        kge.a(-343954722);
        kge.a(766322742);
        f31435a = nfw.class.getSimpleName();
    }

    @Override // tb.ngc
    public void a(ngf ngfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce765a78", new Object[]{this, ngfVar, new Integer(i)});
            return;
        }
        ngk ngkVar = this.b;
        if (ngkVar == null) {
            return;
        }
        ngkVar.a(ngfVar, i);
    }

    @Override // tb.ngc
    public boolean a(ConsoleMessage consoleMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("885039a0", new Object[]{this, consoleMessage})).booleanValue();
        }
        if (consoleMessage != null && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            String str = f31435a;
            ngr.b(str, consoleMessage.lineNumber() + ResponseProtocolType.COMMENT + consoleMessage.message());
        }
        return false;
    }

    public void a(ngk ngkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6271bc6", new Object[]{this, ngkVar});
        } else {
            this.b = ngkVar;
        }
    }
}
