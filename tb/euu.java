package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.i;
import com.taobao.android.detail.mainpic.g;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d;

/* loaded from: classes4.dex */
public class euu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(IDMComponent iDMComponent, g gVar) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("283ed26a", new Object[]{iDMComponent, gVar})).intValue();
        }
        if (iDMComponent == null) {
            return -1;
        }
        try {
            f = Float.valueOf(iDMComponent.getFields().getString(d.ASPECT_RATIO)).floatValue();
        } catch (Exception unused) {
            f = 1.0f;
        }
        return gVar.k().j() ? (int) (b(gVar.e()) / 1.0f) : (int) (a(gVar.e()) / f);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        int c = c(context);
        return c > 0 ? c : context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue() : (a(context) / 2) - eur.a(context, 32.0f);
    }

    private static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT < 19 || !(context instanceof Activity)) {
            return 0;
        }
        return i.a((Activity) context).width();
    }
}
