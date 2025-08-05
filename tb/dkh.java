package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class dkh implements dkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final dkf[] f26810a;

    public dkh(dkf... dkfVarArr) {
        this.f26810a = (dkf[]) Arrays.copyOf(dkfVarArr, dkfVarArr.length);
    }

    @Override // tb.dkf
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        for (dkf dkfVar : this.f26810a) {
            dkfVar.a(context);
        }
    }

    @Override // tb.dkf
    public Boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3961d127", new Object[]{this, context, str});
        }
        for (dkf dkfVar : this.f26810a) {
            Boolean a2 = dkfVar.a(context, str);
            if (a2 != null) {
                return a2;
            }
        }
        return false;
    }

    @Override // tb.dkf
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        for (dkf dkfVar : this.f26810a) {
            dkfVar.a(context, str, z);
        }
    }

    @Override // tb.dkf
    public void a(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
            return;
        }
        for (dkf dkfVar : this.f26810a) {
            dkfVar.a(context, map);
        }
    }

    @Override // tb.dkf
    public c b(Context context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("be53a6fd", new Object[]{this, context});
        }
        c[] cVarArr = new c[this.f26810a.length];
        while (true) {
            dkf[] dkfVarArr = this.f26810a;
            if (i < dkfVarArr.length) {
                cVarArr[i] = dkfVarArr[i].b(context);
                i++;
            } else {
                return dko.a(dkl.EMPTY, cVarArr);
            }
        }
    }

    @Override // tb.dkf
    public Map<String, dkl> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ab12153", new Object[]{this, context});
        }
        HashMap hashMap = new HashMap();
        for (dkf dkfVar : this.f26810a) {
            try {
                Map<String, dkl> c = dkfVar.c(context);
                if (!c.isEmpty()) {
                    HashMap hashMap2 = new HashMap(c);
                    hashMap2.remove(dkf.KEY_AGE_VARIATIONS);
                    hashMap.putAll(hashMap2);
                }
            } catch (UnsupportedOperationException unused) {
            }
        }
        HashMap hashMap3 = new HashMap(hashMap);
        hashMap3.put(dkf.KEY_AGE_VARIATIONS, (dkl) b(context));
        return hashMap3;
    }
}
