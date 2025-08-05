package tb;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rme extends rmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-579817463);
    }

    public static /* synthetic */ Object ipc$super(rme rmeVar, String str, Object... objArr) {
        if (str.hashCode() == -326148900) {
            super.a((View) objArr[0], (HashMap) objArr[1], (rlw) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rmj, tb.rmg
    public void a(Object obj, String str, String str2, rlw rlwVar, String str3) {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605ad635", new Object[]{this, obj, str, str2, rlwVar, str3});
        } else if (!(obj instanceof LinearLayout) || (linearLayout = (LinearLayout) obj) == null) {
        } else {
            String str4 = rlz.a().g(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = rlz.a().d(str, str3).get(str2);
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            a(linearLayout, hashMap, rlwVar);
        }
    }

    @Override // tb.rmj, tb.rmg
    public void a(Object obj, HashMap<String, Object> hashMap, rlw rlwVar) {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedfb5c2", new Object[]{this, obj, hashMap, rlwVar});
        } else if (!(obj instanceof LinearLayout) || (linearLayout = (LinearLayout) obj) == null || hashMap == null || hashMap.size() == 0) {
        } else {
            a(linearLayout, hashMap, rlwVar);
        }
    }

    public void a(LinearLayout linearLayout, HashMap<String, Object> hashMap, rlw rlwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d045a7", new Object[]{this, linearLayout, hashMap, rlwVar});
        } else if (linearLayout != null && hashMap != null && hashMap.size() != 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                if (!TextUtils.isEmpty(valueOf)) {
                    Object value = entry.getValue();
                    try {
                        switch (rlp.a(valueOf)) {
                            case 10352:
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.gravity = Integer.parseInt(value.toString());
                                    linearLayout.setLayoutParams(layoutParams);
                                    break;
                                } else {
                                    break;
                                }
                            case 10353:
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                                if (layoutParams2 != null) {
                                    layoutParams2.weight = Integer.parseInt(value.toString());
                                    linearLayout.setLayoutParams(layoutParams2);
                                    break;
                                } else {
                                    break;
                                }
                            case 10354:
                                if (Integer.parseInt(value.toString()) == 0) {
                                    linearLayout.setOrientation(0);
                                    break;
                                } else {
                                    linearLayout.setOrientation(1);
                                    break;
                                }
                        }
                    } catch (Throwable th) {
                        rmn.a(th);
                    }
                }
            }
            super.a((View) linearLayout, hashMap, (rlw) null);
        }
    }
}
