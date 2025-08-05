package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.oversea.theme.a;
import com.taobao.tao.topmultitab.protocol.c;
import tb.lcu;

/* loaded from: classes7.dex */
public class ndf extends ncv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ndf ndfVar, String str, Object... objArr) {
        if (str.hashCode() == -1717520895) {
            super.syncGreyStatus(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ndf(c cVar, String str) {
        super(cVar, str);
    }

    @Override // tb.ncv
    public lcu a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("21b613cf", new Object[]{this, cVar, str});
        }
        ndg ndgVar = new ndg();
        return new lcu.a(ndgVar).a(new ndh(str, ndgVar, new lud(this, cVar))).a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void syncGreyStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a0b601", new Object[]{this, new Boolean(z)});
            return;
        }
        super.syncGreyStatus(z);
        a.d(z);
    }
}
