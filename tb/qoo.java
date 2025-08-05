package tb;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class qoo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context) {
        ClipData.Item itemAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        return (clipboardManager.getPrimaryClip() == null || (itemAt = clipboardManager.getPrimaryClip().getItemAt(0)) == null || itemAt.getText() == null) ? "" : itemAt.getText().toString();
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", str));
        }
    }
}
