package tb;

import mtopsdk.common.util.StringUtils;
import android.widget.Button;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rma extends rmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1169924788);
    }

    public static /* synthetic */ Object ipc$super(rma rmaVar, String str, Object... objArr) {
        if (str.hashCode() == 540568106) {
            super.a((TextView) objArr[0], (HashMap) objArr[1], (rlw) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rmi, tb.rmj, tb.rmg
    public void a(Object obj, String str, String str2, rlw rlwVar, String str3) {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605ad635", new Object[]{this, obj, str, str2, rlwVar, str3});
        } else if (!(obj instanceof Button) || (button = (Button) obj) == null) {
        } else {
            String str4 = rlz.a().g(str3).get(str2);
            if (!StringUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = rlz.a().d(str, str3).get(str2);
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            a(button, hashMap, rlwVar);
        }
    }

    @Override // tb.rmi, tb.rmj, tb.rmg
    public void a(Object obj, HashMap<String, Object> hashMap, rlw rlwVar) {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedfb5c2", new Object[]{this, obj, hashMap, rlwVar});
        } else if (!(obj instanceof Button) || (button = (Button) obj) == null || hashMap == null || hashMap.size() == 0) {
        } else {
            a(button, hashMap, rlwVar);
        }
    }

    public void a(Button button, HashMap<String, Object> hashMap, rlw rlwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb1826a", new Object[]{this, button, hashMap, rlwVar});
        } else if (button != null && hashMap != null && hashMap.size() != 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                if (StringUtils.isEmpty(valueOf)) {
                    return;
                }
                Object value = entry.getValue();
                try {
                    if (rlp.a(valueOf) == 10302) {
                        button.setClickable(Boolean.parseBoolean(value.toString()));
                    }
                } catch (Throwable th) {
                    rmn.a(th);
                }
            }
            super.a((TextView) button, hashMap, (rlw) null);
        }
    }
}
