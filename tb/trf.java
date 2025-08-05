package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.weex.common.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/serviceinterface/platformspecific/ITLDataTimeService;", "", "<init>", "()V", a.ATOM_EXT_getTime, "", "time", "", Constants.Name.SUFFIX, "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class trf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final trf INSTANCE;

    static {
        kge.a(297778169);
        INSTANCE = new trf();
    }

    private trf() {
    }

    public final String a(long j, String suffix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e9fa33a", new Object[]{this, new Long(j), suffix});
        }
        q.d(suffix, "suffix");
        String format = new SimpleDateFormat("MM.dd HH:mm" + suffix).format(new Date(j));
        q.b(format, "format(...)");
        return format;
    }
}
