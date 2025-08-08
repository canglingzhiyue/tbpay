package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.widget.m;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class gex extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1735750737);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "runtimeData";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length != 2 || gfxVar == null) {
            return gfx.a((Map<String, Object>) dXRuntimeContext.e());
        }
        String i2 = (gfxVarArr[0] == null || !gfxVarArr[0].k()) ? "" : gfxVarArr[0].i();
        if (StringUtils.isEmpty(i2)) {
            str = gfxVarArr[1].i();
        } else {
            str = i2 + "." + gfxVarArr[1].i();
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, dmp.DELIMITER, false);
        Object obj = dXRuntimeContext;
        while (stringTokenizer.hasMoreElements()) {
            try {
                String nextToken = stringTokenizer.nextToken();
                if (obj instanceof Map) {
                    obj = ((Map) obj).get(nextToken);
                } else if (obj instanceof List) {
                    obj = ((List) obj).get(Integer.parseInt(nextToken));
                } else if (obj instanceof DXRuntimeContext) {
                    String lowerCase = nextToken.toLowerCase(Locale.ROOT);
                    char c = 65535;
                    switch (lowerCase.hashCode()) {
                        case -1868067350:
                            if (lowerCase.equals("subdata")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -263078616:
                            if (lowerCase.equals("subdataindex")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -166383732:
                            if (lowerCase.equals("rootdata")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 3076010:
                            if (lowerCase.equals("data")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1346117960:
                            if (lowerCase.equals("listdata")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        return gfx.a(((DXRuntimeContext) obj).i());
                    }
                    if (c == 1) {
                        obj = ((DXRuntimeContext) obj).f();
                    } else if (c == 2) {
                        obj = ((DXRuntimeContext) obj).s().getData();
                    } else if (c == 3) {
                        obj = null;
                        if (dXRuntimeContext.d() instanceof m) {
                            obj = ((m) dXRuntimeContext.d()).getListData();
                        }
                    } else {
                        obj = dXRuntimeContext.e();
                    }
                } else {
                    continue;
                }
            } catch (Exception e) {
                throw new DXExprFunctionError(e);
            }
        }
        if (obj == null) {
            return gfx.e();
        }
        return gfx.a(obj);
    }
}
