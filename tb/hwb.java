package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.festival.FestivalMgr;

/* loaded from: classes6.dex */
public class hwb extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GET_FESTIVAL = 8374386162445244297L;

    static {
        kge.a(-762523858);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        hyn.a("DXDataParserGetFestival", "evalWithArgs", "----");
        if (objArr != null && objArr.length >= 2) {
            try {
                String obj = objArr[0].toString();
                String obj2 = objArr[1].toString();
                String obj3 = objArr.length > 2 ? objArr[2].toString() : null;
                hyn.a("DXDataParserGetFestival", "evalWithArgs", "module = " + obj + "   festivalKey = " + obj2);
                String a2 = FestivalMgr.a().a(obj, obj2);
                StringBuilder sb = new StringBuilder();
                sb.append("festivalValue = ");
                sb.append(a2);
                hyn.a("DXDataParserGetFestival", "evalWithArgs", sb.toString());
                return StringUtils.isEmpty(a2) ? obj3 : a2;
            } catch (Throwable th) {
                hyn.a("DXDataParserGetFestival", "evalWithArgs", th.toString());
                hyq.b(dXRuntimeContext.m(), "DXDataParserGetFestival", "evalWithArgs", "8374386162445244297", th.toString(), null);
            }
        }
        return null;
    }
}
