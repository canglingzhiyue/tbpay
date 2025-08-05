package tb;

import com.alibaba.alibity.container.file.a;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.open.extension.e;
import com.taobao.themis.open.resource.c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/taobao/themis/open/utils/TMSPkgUtils;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", a.API_EXISTS, "", "path", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "getData", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class toj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final toj INSTANCE;

    static {
        kge.a(626926354);
        INSTANCE = new toj();
    }

    private toj() {
    }

    @JvmStatic
    public static final boolean a(String path, f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f09b36fb", new Object[]{path, instance})).booleanValue();
        }
        q.d(path, "path");
        q.d(instance, "instance");
        if (path.length() == 0) {
            return false;
        }
        e eVar = (e) instance.b(e.class);
        c cVar = null;
        if ((eVar != null ? eVar.a(path) : null) != null) {
            return true;
        }
        e eVar2 = (e) instance.b(e.class);
        if (eVar2 != null) {
            cVar = eVar2.b(path);
        }
        return cVar != null;
    }

    @JvmStatic
    public static final byte[] b(String path, f instance) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("50a44325", new Object[]{path, instance});
        }
        q.d(path, "path");
        q.d(instance, "instance");
        if (path.length() != 0) {
            z = false;
        }
        if (z) {
            return null;
        }
        e eVar = (e) instance.b(e.class);
        c a2 = eVar != null ? eVar.a(path) : null;
        if (a2 != null) {
            return a2.a();
        }
        e eVar2 = (e) instance.b(e.class);
        c b = eVar2 != null ? eVar2.b(path) : null;
        if (b == null) {
            return null;
        }
        return b.a();
    }
}
