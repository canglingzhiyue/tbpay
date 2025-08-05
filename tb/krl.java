package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class krl extends aec<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-533397469);
    }

    public static /* synthetic */ Object ipc$super(krl krlVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public krl(bbz bbzVar) {
        super(bbzVar);
    }

    @Override // tb.abg
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        String action = intent.getAction();
        if (!intent.hasExtra("cartWVAddCartNotify")) {
            return false;
        }
        if (intent.hasExtra("params")) {
            String stringExtra = intent.getStringExtra("params");
            boolean a2 = a(stringExtra);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("action", action);
                hashMap.put("params", stringExtra);
                hashMap.put("refreshImmediately", Boolean.valueOf(a2));
                bdx.a("AddCartNotifyProcessor", "broadcast", hashMap);
            } catch (Exception unused) {
            }
            if (a2) {
                if (this.f25281a.u().isVisible() && this.f25281a.u().isResumed()) {
                    this.f25281a.n().o().i(true);
                    ((aat) this.f25281a.S()).j();
                }
                return true;
            }
        }
        this.f25281a.n().o().i(true);
        return true;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Boolean.TRUE.toString().equalsIgnoreCase(((JSONObject) JSON.parse(str)).getString("refreshImmediately"));
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
