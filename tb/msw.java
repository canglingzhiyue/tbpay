package tb;

import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class msw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1427726026);
    }

    public static CharSequence a(CharSequence charSequence, CharSequence charSequence2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("d3df280a", new Object[]{charSequence, charSequence2}) : (Build.VERSION.SDK_INT < 24 || TextUtils.isEmpty(charSequence2)) ? charSequence : Html.fromHtml(String.format("<font color=\"%s\">%s</font>", charSequence2, charSequence), 0);
    }
}
