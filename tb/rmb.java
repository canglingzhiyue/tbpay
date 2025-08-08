package tb;

import android.text.InputFilter;
import android.text.Spanned;
import mtopsdk.common.util.StringUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rmb extends rmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(267628465);
    }

    public static /* synthetic */ Object ipc$super(rmb rmbVar, String str, Object... objArr) {
        if (str.hashCode() == 540568106) {
            super.a((TextView) objArr[0], (HashMap) objArr[1], (rlw) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rmi, tb.rmj, tb.rmg
    public void a(Object obj, String str, String str2, rlw rlwVar, String str3) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605ad635", new Object[]{this, obj, str, str2, rlwVar, str3});
        } else if (!(obj instanceof EditText) || (editText = (EditText) obj) == null) {
        } else {
            String str4 = rlz.a().g(str3).get(str2);
            if (!StringUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = rlz.a().d(str, str3).get(str2);
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            a(editText, hashMap, rlwVar);
        }
    }

    @Override // tb.rmi, tb.rmj, tb.rmg
    public void a(Object obj, HashMap<String, Object> hashMap, rlw rlwVar) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedfb5c2", new Object[]{this, obj, hashMap, rlwVar});
        } else if (!(obj instanceof EditText) || (editText = (EditText) obj) == null || hashMap == null || hashMap.size() == 0) {
        } else {
            a(editText, hashMap, rlwVar);
        }
    }

    public void a(EditText editText, HashMap<String, Object> hashMap, rlw rlwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f441084f", new Object[]{this, editText, hashMap, rlwVar});
        } else if (editText != null && hashMap != null && hashMap.size() != 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                if (StringUtils.isEmpty(valueOf)) {
                    return;
                }
                Object value = entry.getValue();
                try {
                    int a2 = rlp.a(valueOf);
                    if (a2 == 10352) {
                        editText.setInputType(129);
                    } else if (a2 == 10354) {
                        a(editText, Boolean.parseBoolean(value.toString()));
                    }
                } catch (Throwable th) {
                    rmn.a(th);
                }
            }
            super.a((TextView) editText, hashMap, (rlw) null);
        }
    }

    private void a(EditText editText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c6d1dd", new Object[]{this, editText, new Boolean(z)});
        } else if (z) {
            editText.setFilters(new InputFilter[]{new InputFilter() { // from class: tb.rmb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.text.InputFilter
                public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (CharSequence) ipChange2.ipc$dispatch("cf65d449", new Object[]{this, charSequence, new Integer(i), new Integer(i2), spanned, new Integer(i3), new Integer(i4)}) : charSequence.length() <= 0 ? spanned.subSequence(i3, i4) : "";
                }
            }});
        } else {
            editText.setFilters(new InputFilter[]{new InputFilter() { // from class: tb.rmb.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.text.InputFilter
                public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (CharSequence) ipChange2.ipc$dispatch("cf65d449", new Object[]{this, charSequence, new Integer(i), new Integer(i2), spanned, new Integer(i3), new Integer(i4)});
                    }
                    return null;
                }
            }});
        }
    }
}
