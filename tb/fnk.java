package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.e;
import com.taobao.android.dinamic.expressionv2.h;
import com.taobao.android.dinamic.view.a;

/* loaded from: classes5.dex */
public class fnk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String currentVersion = "2.0";

    static {
        kge.a(872971139);
    }

    public static Object a(String str, String str2, fpd fpdVar) {
        a b;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("af1ccca0", new Object[]{str, str2, fpdVar});
        }
        if (fpdVar == null || fpdVar.e() == null || str == null) {
            return null;
        }
        if (str.startsWith("@")) {
            return h.a(str, str2, fpdVar);
        }
        char[] charArray = str.toCharArray();
        String str4 = null;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        boolean z = false;
        boolean z2 = false;
        Object obj = null;
        for (char c : charArray) {
            if ('$' == c) {
                stringBuffer = new StringBuffer();
                stringBuffer2 = new StringBuffer();
                z = true;
            } else {
                if ('{' == c && z) {
                    String stringBuffer3 = stringBuffer.toString();
                    if (fnq.b(stringBuffer3)) {
                        str4 = stringBuffer3;
                        z = false;
                        z2 = true;
                    } else {
                        str4 = stringBuffer3;
                        z = false;
                    }
                } else if ('}' == c && z2) {
                    String stringBuffer4 = stringBuffer2.toString();
                    if (StringUtils.isEmpty(stringBuffer4)) {
                        obj = fpdVar.e();
                    } else {
                        fnp a2 = fnq.a(str4);
                        if (a2 != null) {
                            try {
                                obj = a2.a(stringBuffer4, fpdVar);
                            } catch (Throwable th) {
                                if (e.a()) {
                                    fpa.a("DinamicExpresstion", th, "parse express failed, parser=", a2.getClass().getName());
                                }
                                b = fpdVar.c().b();
                                str3 = a.ERROR_CODE_TEMPLATE_PARSER_EXCEPTION;
                            }
                        } else {
                            b = fpdVar.c().b();
                            str3 = a.ERROR_CODE_TEMPLATE_PARSER_NOT_FOUND;
                        }
                        b.a(str3, str2);
                    }
                    if (obj != null && (!(obj instanceof String) || !StringUtils.isEmpty(obj.toString()))) {
                        return obj;
                    }
                    z = false;
                } else if (z) {
                    stringBuffer.append(c);
                } else if (z2) {
                    stringBuffer2.append(c);
                }
            }
            z2 = false;
        }
        return obj;
    }
}
