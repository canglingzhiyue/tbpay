package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.i;

/* loaded from: classes.dex */
public class kvy extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HISCLIENTCACHE = 5172138049776867429L;

    static {
        kge.a(1284076789);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject e = dXRuntimeContext.e();
        if (e != null) {
            boolean d = i.d(i.b(e));
            e.e("DataParserHIsClientCache", "isRemoteData = " + d);
            return Boolean.valueOf(!d);
        }
        e.e("DataParserHIsClientCache", "default false");
        return false;
    }
}
