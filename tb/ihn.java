package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import java.io.PrintStream;

/* loaded from: classes6.dex */
public class ihn implements iia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final iia f29030a = new ihn();

    @Override // tb.iia
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.iia
    public ihz b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihz) ipChange.ipc$dispatch("7d1d49d8", new Object[]{this, str});
        }
        try {
            System.loadLibrary(str);
            PrintStream printStream = System.out;
            printStream.println("W/RemoteSoload() - empty impl, do System.loadLibrary(" + str + riy.BRACKET_END_STR);
            return ihz.a(str);
        } catch (Throwable th) {
            RSoException error = RSoException.error(1001, th);
            PrintStream printStream2 = System.err;
            printStream2.println("W/RemoteSoload() - empty impl, System.loadLibrary(" + str + ") caught exception=" + error.getErrorMsg());
            return ihz.a(str, error);
        }
    }

    @Override // tb.iia
    public ihz c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihz) ipChange.ipc$dispatch("7dc9f577", new Object[]{this, str}) : b(str);
    }

    @Override // tb.iia
    public void a(String str, ihy ihyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9dcb28", new Object[]{this, str, ihyVar});
        } else if (ihyVar == null) {
            System.out.println("W/RemoteSoloadAsync() - empty impl, return , callback == null");
        } else {
            ihyVar.onLoadFinished(b(str));
        }
    }
}
