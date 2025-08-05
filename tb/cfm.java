package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cfm implements cfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.cfo
    public void a(Context context, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f702a86", new Object[]{this, context, intent, new Integer(i)});
        } else if (context == null) {
        } else {
            ((Activity) context).startActivityForResult(intent, i);
        }
    }
}
