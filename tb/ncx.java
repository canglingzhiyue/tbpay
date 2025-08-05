package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.c;
import tb.lcu;

/* loaded from: classes7.dex */
public class ncx extends ncv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ncx(c cVar) {
        super(cVar, "");
    }

    @Override // tb.ncv
    public lcu a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lcu) ipChange.ipc$dispatch("21b613cf", new Object[]{this, cVar, str}) : new lcu.a(new ncz()).a(new nda(new lud(this, cVar))).a();
    }
}
