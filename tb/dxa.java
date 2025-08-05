package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.observer.a;
import com.taobao.android.detail.core.aura.utils.g;
import com.taobao.tao.log.TLog;

@AURAExtensionImpl(code = "aura.impl.event.changeSkuFrameImage")
/* loaded from: classes4.dex */
public final class dxa extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "change_sku_frame";

    static {
        kge.a(-1066907426);
    }

    public static /* synthetic */ Object ipc$super(dxa dxaVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "change_sku_frame";
    }

    public dxa() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.sku.AliDetailSKUChangeEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        iyh a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        AURARenderComponent d = aURAEventIO.getEventModel().d();
        if (d == null || d.data == null || d.data.fields == null) {
            TLog.loge("AliDetailSKUChangeEvent", "component.data.fields is null");
        } else if (aURAEventIO.getEventModel().e() == null) {
            TLog.loge("AliDetailSKUChangeEvent", "getArgs is null");
        } else {
            String a3 = a(aURAEventIO.getEventModel().e());
            if (TextUtils.isEmpty(a3)) {
                TLog.loge("AliDetailSKUChangeEvent", "getSelectedPropPath is null");
            }
            if (!(b().e() instanceof a) || (a2 = ((a) b().e()).a()) == null) {
                return;
            }
            a2.a(a.KEY_PROP_PATH, g.a(a2.a(a.KEY_PROP_PATH), a3));
        }
    }

    private String a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2583e9f7", new Object[]{this, objArr});
        }
        if (objArr != null && objArr.length >= 2 && (objArr[1] instanceof String)) {
            return (String) objArr[1];
        }
        return null;
    }
}
