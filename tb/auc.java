package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.Map;

/* loaded from: classes2.dex */
public class auc extends atz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-191663173);
    }

    public static /* synthetic */ Object ipc$super(auc aucVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.atz
    public boolean a(atz atzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0b61ed5", new Object[]{this, atzVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.atz, tb.aua
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : a.ATOM_EXT_column;
    }

    public auc(AURARenderComponent aURARenderComponent) {
        super(aURARenderComponent);
    }

    @Override // tb.atz
    public c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("5c31e54a", new Object[]{this});
        }
        auo auoVar = new auo(k());
        auoVar.a(n());
        Map<String, Object> m = m();
        auoVar.f(a(m, "marginLeft", 0));
        auoVar.g(a(m, "marginRight", 0));
        auoVar.h(a(m, "marginTop", 0));
        auoVar.i(a(m, "marginBottom", 0));
        auoVar.a(a(m, "divisionWidth", 0));
        return auoVar;
    }

    private int a(Map<String, Object> map, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ec6792f", new Object[]{this, map, str, new Integer(i)})).intValue();
        }
        if (map == null) {
            return i;
        }
        String str2 = (String) bbc.a(map, str, String.class, String.valueOf(i));
        if (bbk.a(str2)) {
            return i;
        }
        try {
            return bay.a(Integer.parseInt(str2));
        } catch (Exception unused) {
            return i;
        }
    }

    private Map<String, Object> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("44113da9", new Object[]{this});
        }
        AURARenderComponent f = f();
        if (f.data != null) {
            return f.data.fields;
        }
        return null;
    }

    private float[] n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("be50218c", new Object[]{this});
        }
        Map<String, Object> m = m();
        if (m == null) {
            return o();
        }
        Object obj = m.get("weights");
        if (!(obj instanceof String)) {
            return o();
        }
        String[] split = ((String) obj).split(":");
        int k = k();
        float[] fArr = new float[k];
        for (int i = 0; i < k; i++) {
            fArr[i] = 0.0f;
        }
        int min = Math.min(split.length, k);
        float f = 0.0f;
        for (int i2 = 0; i2 < min; i2++) {
            try {
                float max = Math.max(Float.parseFloat(split[i2]), 0.0f);
                fArr[i2] = max;
                f += max;
            } catch (Exception unused) {
                return o();
            }
        }
        if (f <= 0.0f) {
            return o();
        }
        for (int i3 = 0; i3 < k; i3++) {
            fArr[i3] = (fArr[i3] / f) * 100.0f;
        }
        return fArr;
    }

    private float[] o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("c004fa2b", new Object[]{this});
        }
        int k = k();
        float[] fArr = new float[k];
        float f = 100.0f / k;
        for (int i = 0; i < k; i++) {
            fArr[i] = f;
        }
        return fArr;
    }
}
