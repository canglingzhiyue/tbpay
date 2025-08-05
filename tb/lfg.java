package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes.dex */
public class lfg extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HVIEWPROP = -8153571820491057491L;

    static {
        kge.a(-901058123);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode queryWTByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = null;
        if (objArr != null && objArr.length >= 2) {
            String valueOf = String.valueOf(objArr[0]);
            String valueOf2 = String.valueOf(objArr[1]);
            if (!TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(valueOf2)) {
                if (dXRuntimeContext.d().queryWTByUserId(valueOf) == null) {
                    return null;
                }
                float f = dXRuntimeContext.m().getResources().getDisplayMetrics().density;
                char c = 65535;
                int hashCode = valueOf2.hashCode();
                if (hashCode != -1221029593) {
                    if (hashCode == 113126854 && valueOf2.equals("width")) {
                        c = 0;
                    }
                } else if (valueOf2.equals("height")) {
                    c = 1;
                }
                if (c == 0) {
                    str = (queryWTByUserId.getMeasuredWidth() / f) + "np";
                } else if (c == 1) {
                    str = (queryWTByUserId.getMeasuredHeight() / f) + "np";
                }
                ldf.d("home.HViewProp", "viewId=" + valueOf + ", attr=" + valueOf2 + ", result=" + str);
            }
        }
        return str;
    }
}
