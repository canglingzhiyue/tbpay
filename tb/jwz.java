package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bg;
import com.taobao.android.dinamicx.u;
import java.util.Locale;

/* loaded from: classes5.dex */
public class jwz extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ADAPTIVESCREENCONFIG = 6435735300035904024L;

    static {
        kge.a(-2136837343);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "adaptiveScreenConfig";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String lowerCase;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            Context m = dXRuntimeContext.m();
            bg f = u.f();
            if (m != null && f != null) {
                if (m instanceof Activity) {
                    lowerCase = f.b((Activity) m).toLowerCase(Locale.ROOT);
                } else {
                    lowerCase = f.d(m).toLowerCase(Locale.ROOT);
                }
                char c = 65535;
                if (objArr.length == 3) {
                    switch (lowerCase.hashCode()) {
                        case -1078030475:
                            if (lowerCase.equals("medium")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 107876:
                            if (lowerCase.equals("max")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 108114:
                            if (lowerCase.equals("min")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 102742843:
                            if (lowerCase.equals("large")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 109548807:
                            if (lowerCase.equals("small")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if (c == 0 || c == 1) {
                        return objArr[0];
                    }
                    if (c == 2) {
                        return objArr[1];
                    }
                    if (c != 3 && c != 4) {
                        return null;
                    }
                    return objArr[2];
                } else if (objArr.length == 5) {
                    switch (lowerCase.hashCode()) {
                        case -1078030475:
                            if (lowerCase.equals("medium")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 107876:
                            if (lowerCase.equals("max")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 108114:
                            if (lowerCase.equals("min")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 102742843:
                            if (lowerCase.equals("large")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 109548807:
                            if (lowerCase.equals("small")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        return objArr[0];
                    }
                    if (c == 1) {
                        return objArr[1];
                    }
                    if (c == 2) {
                        return objArr[2];
                    }
                    if (c == 3) {
                        return objArr[3];
                    }
                    if (c == 4) {
                        return objArr[4];
                    }
                    return null;
                }
            }
        }
        return null;
    }
}
