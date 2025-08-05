package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes4.dex */
public class emg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-427090708);
        emu.a("com.taobao.android.detail.core.standard.utils.AliSDetailLocatorUtils");
    }

    public static boolean a(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e703dc37", new Object[]{ekkVar})).booleanValue();
        }
        List<AURARenderComponent> h = ekkVar.h();
        if (h.isEmpty()) {
            return false;
        }
        for (AURARenderComponent aURARenderComponent : h) {
            if (a(aURARenderComponent)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null) {
            return "video".equals(aURARenderComponent.data.fields.get("type"));
        }
        return false;
    }

    public static boolean b(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d586e2b8", new Object[]{ekkVar})).booleanValue() : a(ekkVar) && !TextUtils.equals(ekkVar.b(), "video") && ekkVar.h().size() > 1;
    }
}
