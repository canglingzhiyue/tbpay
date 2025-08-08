package tb;

import android.graphics.drawable.GradientDrawable;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;

/* loaded from: classes4.dex */
public class dtb extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long PARSER_ID;
    public static final String PARSER_NAME = "theme";
    public static final String TYPE_COLOR = "color";
    public static final String TYPE_GRADIENT = "gradient";
    public static final String TYPE_SIZE = "size";
    public static final String TYPE_STRING = "string";

    /* renamed from: a  reason: collision with root package name */
    private final dtc f26951a;

    public static /* synthetic */ Object ipc$super(dtb dtbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-939368717);
        PARSER_ID = fxa.a("theme");
    }

    public dtb(dtc dtcVar) {
        this.f26951a = dtcVar;
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
            UnifyLog.d("TDTheme", String.valueOf(objArr), e.toString(), String.valueOf(dXRuntimeContext));
            return null;
        }
    }

    private Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ebd01cf8", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = null;
        if (objArr != null && objArr.length >= 3) {
            String valueOf = String.valueOf(objArr[0]);
            String valueOf2 = String.valueOf(objArr[1]);
            String valueOf3 = String.valueOf(objArr[2]);
            dtc dtcVar = this.f26951a;
            List<String> a2 = dtcVar != null ? dtcVar.a(valueOf2) : null;
            if ("gradient".equalsIgnoreCase(valueOf)) {
                GradientDrawable a3 = dtd.a(a2);
                if (a3 != null) {
                    return a3;
                }
                if (!StringUtils.isEmpty(valueOf3)) {
                    return dtd.a(valueOf3.split(SymbolExpUtil.SYMBOL_VERTICALBAR));
                }
            } else if ("color".equalsIgnoreCase(valueOf)) {
                if (a2 != null && a2.size() > 0) {
                    str = a2.get(0);
                }
                return dtd.a(str, -1) != -1 ? str : valueOf3;
            } else if ("size".equalsIgnoreCase(valueOf)) {
                if (a2 == null || a2.size() <= 0) {
                    return valueOf3;
                }
                String str2 = a2.get(0);
                return (a.e() || dtd.a(str2)) ? dtd.b(str2) : valueOf3;
            } else if ("string".equalsIgnoreCase(valueOf)) {
                if (a2 != null && a2.size() > 0) {
                    str = a2.get(0);
                }
                return StringUtils.isEmpty(str) ? valueOf3 : str;
            }
        }
        return null;
    }
}
