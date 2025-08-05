package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.g;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.event.a;
import com.taobao.tao.log.TLog;

/* loaded from: classes4.dex */
public class ioh extends iog implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long b;

    static {
        kge.a(-1115477152);
        kge.a(1967244270);
    }

    public static /* synthetic */ Object ipc$super(ioh iohVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ioh(q qVar) {
        super(qVar);
        emu.a("com.taobao.android.detail.core.standard.mainscreen.implementor.ChangeSkuFrameImplementor");
    }

    @Override // tb.ezm
    public boolean a(a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        String a2 = aVar.a();
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b < 150) {
            return false;
        }
        this.b = currentTimeMillis;
        if (a2.equals("change_sku_frame")) {
            a(runtimeAbilityParamArr);
        } else if (a2.equals("switch_main_pic")) {
            b();
        }
        return true;
    }

    private String a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2583e9f7", new Object[]{this, objArr});
        }
        if (objArr != null && objArr.length > 0 && (objArr[0] instanceof String)) {
            return (String) objArr[0];
        }
        return null;
    }

    private void a(RuntimeAbilityParam... runtimeAbilityParamArr) {
        iyh a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa4e5ee", new Object[]{this, runtimeAbilityParamArr});
        } else if (runtimeAbilityParamArr == null || runtimeAbilityParamArr.length <= 0) {
            TLog.loge("ChangeSkuFrameImplementor", "check runtimeAbilityParams empty");
        } else {
            String a3 = a(b(runtimeAbilityParamArr));
            if (!(a().e() instanceof com.taobao.android.detail.core.aura.observer.a) || (a2 = ((com.taobao.android.detail.core.aura.observer.a) a().e()).a()) == null) {
                return;
            }
            a2.a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH, g.a(a2.a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH), a3));
        }
    }

    private void b() {
        iyh a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!elt.a(a()) || !(a().e() instanceof com.taobao.android.detail.core.aura.observer.a) || (a2 = ((com.taobao.android.detail.core.aura.observer.a) a().e()).a()) == null) {
        } else {
            a2.a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH, (String) null);
        }
    }
}
