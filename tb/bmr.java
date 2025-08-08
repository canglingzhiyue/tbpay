package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.trade.utils.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* loaded from: classes2.dex */
public class bmr extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "tdcolor";

    static {
        kge.a(-384406291);
    }

    public static /* synthetic */ Object ipc$super(bmr bmrVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            return a(objArr, dXRuntimeContext);
        } catch (Exception e) {
            UnifyLog.d(PARSER_TAG, String.valueOf(objArr), e.toString(), String.valueOf(dXRuntimeContext));
            return null;
        }
    }

    private Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ebd01cf8", new Object[]{this, objArr, dXRuntimeContext});
        }
        String a2 = bmv.a(objArr, 2, new Class[]{null, String.class});
        if (!StringUtils.isEmpty(a2)) {
            throw new RuntimeException(a2);
        }
        Object obj = objArr[0];
        String str = (String) objArr[1];
        if (obj == null) {
            return str;
        }
        String obj2 = obj.toString();
        if (b.a(obj2, 0) == 0) {
            return str;
        }
        if (obj2.startsWith("#")) {
            return obj2;
        }
        return obj2 + "#";
    }
}
