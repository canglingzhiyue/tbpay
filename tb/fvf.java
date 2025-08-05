package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.security.realidentity.f2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.share.ui.engine.friend.a;

/* loaded from: classes.dex */
public class fvf extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_LOCALIMAGE = -3536948596548552968L;

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : f2.g;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Context i;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String) || (a2 = a((i = DinamicXEngine.i()), (String) obj)) == 0) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return i.getDrawable(a2);
        }
        return i.getResources().getDrawable(a2);
    }

    public int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{this, context, str})).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
            } catch (Exception unused) {
                return 0;
            }
        }
        return context.getResources().getIdentifier(str, a.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName());
    }
}
