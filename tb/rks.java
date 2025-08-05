package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import com.tmall.android.dai.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rks implements DAICallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f33212a;
    private String b;
    private Map c;

    static {
        kge.a(1295773359);
        kge.a(-51216999);
    }

    public rks(String str, Map map, c cVar) {
        this.f33212a = cVar;
        this.b = str;
        this.c = map;
    }

    @Override // com.tmall.android.dai.DAICallback
    public void onSuccess(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
        } else if (this.f33212a == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("code", 1);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", this.b);
            Map map = this.c;
            if (map != null && map.containsKey(DAI.WALLE_INNER_EXTEND_ARGS)) {
                this.c.remove(DAI.WALLE_INNER_EXTEND_ARGS);
            }
            hashMap2.put("input", this.c);
            hashMap.put("model", hashMap2);
            if (objArr != null && objArr.length > 0) {
                hashMap.put("result", objArr[0]);
            }
            this.f33212a.a(true, hashMap);
        }
    }

    @Override // com.tmall.android.dai.DAICallback
    public void onError(DAIError dAIError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326e086b", new Object[]{this, dAIError});
        } else if (this.f33212a == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("code", 0);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", this.b);
            Map map = this.c;
            if (map != null && map.containsKey(DAI.WALLE_INNER_EXTEND_ARGS)) {
                this.c.remove(DAI.WALLE_INNER_EXTEND_ARGS);
            }
            hashMap2.put("input", this.c);
            hashMap.put("model", hashMap2);
            HashMap hashMap3 = new HashMap();
            if (dAIError != null) {
                hashMap3.put("code", Integer.valueOf(dAIError.errorCode));
            }
            hashMap.put("error", hashMap3);
            this.f33212a.a(false, hashMap);
        }
    }
}
