package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.flowout.e;
import com.ut.share.utils.IFlowOutHelper;

/* loaded from: classes8.dex */
public class odb implements IFlowOutHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-692264762);
        kge.a(-271561739);
    }

    @Override // com.ut.share.utils.IFlowOutHelper
    public void startActivity(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861f90ed", new Object[]{this, context, intent});
        } else {
            e.a("share", context, intent);
        }
    }

    @Override // com.ut.share.utils.IFlowOutHelper
    public void startActivityForResult(Fragment fragment, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f5d30", new Object[]{this, fragment, intent, new Integer(i)});
        } else {
            e.a("share", fragment, intent, i);
        }
    }

    @Override // com.ut.share.utils.IFlowOutHelper
    public void startActivityForResult(Activity activity, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59168a98", new Object[]{this, activity, intent, new Integer(i)});
        } else {
            e.a("share", activity, intent, i);
        }
    }
}
