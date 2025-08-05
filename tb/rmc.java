package tb;

import android.text.TextUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class rmc extends rmd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-325399297);
    }

    public static /* synthetic */ Object ipc$super(rmc rmcVar, String str, Object... objArr) {
        if (str.hashCode() == -348551388) {
            super.a((ImageView) objArr[0], (HashMap) objArr[1], (rlw) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rmd, tb.rmj, tb.rmg
    public void a(Object obj, String str, String str2, rlw rlwVar, String str3) {
        ImageButton imageButton;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605ad635", new Object[]{this, obj, str, str2, rlwVar, str3});
        } else if (!(obj instanceof ImageButton) || (imageButton = (ImageButton) obj) == null) {
        } else {
            String str4 = rlz.a().g(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = rlz.a().d(str, str3).get(str2);
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            a(imageButton, hashMap, rlwVar);
        }
    }

    @Override // tb.rmd, tb.rmj, tb.rmg
    public void a(Object obj, HashMap<String, Object> hashMap, rlw rlwVar) {
        ImageButton imageButton;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedfb5c2", new Object[]{this, obj, hashMap, rlwVar});
        } else if (!(obj instanceof ImageButton) || (imageButton = (ImageButton) obj) == null || hashMap == null || hashMap.size() == 0) {
        } else {
            a(imageButton, hashMap, rlwVar);
        }
    }

    public void a(ImageButton imageButton, HashMap<String, Object> hashMap, rlw rlwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b815a2b1", new Object[]{this, imageButton, hashMap, rlwVar});
        } else if (imageButton == null || hashMap == null || hashMap.size() == 0) {
        } else {
            super.a((ImageView) imageButton, hashMap, (rlw) null);
        }
    }
}
