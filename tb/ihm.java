package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import java.util.List;

/* loaded from: classes6.dex */
public class ihm implements ihx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ihx f29029a = new ihm();
    private static final iht d = iht.a(RSoException.error(1001));
    private final RSoException b = RSoException.error(1001);
    private final RSoException c = RSoException.error(1001);

    @Override // tb.ihx
    public ihw a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihw) ipChange.ipc$dispatch("7c709ddc", new Object[]{this, str}) : ihw.a(str, this.b);
    }

    @Override // tb.ihx
    public iht a(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iht) ipChange.ipc$dispatch("fa5cf678", new Object[]{this, list}) : d;
    }

    @Override // tb.ihx
    public ihw b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihw) ipChange.ipc$dispatch("7d1d497b", new Object[]{this, str}) : ihw.a(str, this.b);
    }

    @Override // tb.ihx
    public void a(String str, ihu ihuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9bf9ac", new Object[]{this, str, ihuVar});
        } else {
            ihuVar.onFetchFinished(ihw.a(str, this.c));
        }
    }

    @Override // tb.ihx
    public void a(List<String> list, ihs ihsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d39d715", new Object[]{this, list, ihsVar});
        } else {
            ihsVar.a(d);
        }
    }
}
