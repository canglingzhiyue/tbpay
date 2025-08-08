package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class kvp extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CONTAINERDATA = 6875012019473020234L;

    static {
        kge.a(-1673246661);
    }

    public static /* synthetic */ Object ipc$super(kvp kvpVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            try {
                if (objArr.length > 0 && (objArr[0] instanceof String)) {
                    String str = (String) objArr[0];
                    if (StringUtils.isEmpty(str)) {
                        return null;
                    }
                    String str2 = ksk.NEW_FACE_PARENT.f30287a;
                    ope f = d.f(str2);
                    AwesomeGetContainerData b = f == null ? null : f.b(str2);
                    if (b != null && (split = str.split("\\.")) != null && split.length > 0) {
                        return a(b, split);
                    }
                    return null;
                }
            } catch (Throwable th) {
                e.a("home.hContainerData", "parse container data error", th);
            }
        }
        return null;
    }

    private Object a(Object obj, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("669d1437", new Object[]{this, obj, strArr});
        }
        if (obj == null || strArr == null || strArr.length <= 0) {
            return null;
        }
        for (String str : strArr) {
            if (!StringUtils.isEmpty(str)) {
                if (obj instanceof AwesomeGetContainerData) {
                    obj = a((AwesomeGetContainerData) obj, str);
                } else if (obj instanceof AwesomeGetContainerInnerData) {
                    obj = a((AwesomeGetContainerInnerData) obj, str);
                } else if (obj instanceof JSONObject) {
                    obj = ((JSONObject) obj).get(str);
                } else if (obj instanceof List) {
                    obj = a((List) obj, str);
                } else {
                    obj = obj instanceof Map ? ((Map) obj).get(str) : null;
                }
                if (obj == null) {
                    break;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
        if (r0 == 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        if (r0 == 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
        return r8.delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        return r8.base;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object a(com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData r8, java.lang.String r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.kvp.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L19
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r1[r4] = r8
            r1[r3] = r9
            java.lang.String r8 = "2a806444"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            return r8
        L19:
            r0 = -1
            r1 = 0
            int r5 = r9.hashCode()     // Catch: java.lang.Throwable -> L5f
            r6 = 100897(0x18a21, float:1.41387E-40)
            if (r5 == r6) goto L43
            r2 = 3016401(0x2e06d1, float:4.226878E-39)
            if (r5 == r2) goto L39
            r2 = 95468472(0x5b0bbb8, float:1.6619917E-35)
            if (r5 == r2) goto L2f
            goto L4d
        L2f:
            java.lang.String r2 = "delta"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> L5f
            if (r9 == 0) goto L4d
            r0 = 2
            goto L4d
        L39:
            java.lang.String r2 = "base"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> L5f
            if (r9 == 0) goto L4d
            r0 = 1
            goto L4d
        L43:
            java.lang.String r5 = "ext"
            boolean r9 = r9.equals(r5)     // Catch: java.lang.Throwable -> L5f
            if (r9 == 0) goto L4d
            r0 = 0
        L4d:
            if (r0 == 0) goto L5a
            if (r0 == r4) goto L57
            if (r0 == r3) goto L54
            return r1
        L54:
            com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData r8 = r8.delta     // Catch: java.lang.Throwable -> L5f
            return r8
        L57:
            com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData r8 = r8.base     // Catch: java.lang.Throwable -> L5f
            return r8
        L5a:
            com.alibaba.fastjson.JSONObject r8 = r8.getExt()     // Catch: java.lang.Throwable -> L5f
            return r8
        L5f:
            r8 = move-exception
            java.lang.String r9 = "home.hContainerData"
            java.lang.String r0 = "parse single container data error"
            com.taobao.android.home.component.utils.e.a(r9, r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kvp.a(com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData, java.lang.String):java.lang.Object");
    }

    private Object a(AwesomeGetContainerInnerData awesomeGetContainerInnerData, String str) {
        IpChange ipChange = $ipChange;
        char c = 2;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("687e3506", new Object[]{this, awesomeGetContainerInnerData, str});
        }
        try {
            switch (str.hashCode()) {
                case -1891131205:
                    if (str.equals("rangerParams")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -553589393:
                    if (str.equals("cacheTime")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -317646481:
                    if (str.equals("expTimeInterval")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -200117641:
                    if (str.equals("clientCache")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 100897:
                    if (str.equals("ext")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 162740471:
                    if (str.equals("passParams")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 688769446:
                    if (str.equals("versionInfo")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 947936814:
                    if (str.equals("sections")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1183703285:
                    if (str.equals("pageParams")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1789070852:
                    if (str.equals("dataType")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return awesomeGetContainerInnerData.dataType;
                case 1:
                    return Long.valueOf(awesomeGetContainerInnerData.cacheTime);
                case 2:
                    return Long.valueOf(awesomeGetContainerInnerData.expTimeInterval);
                case 3:
                    return awesomeGetContainerInnerData.ext;
                case 4:
                    return awesomeGetContainerInnerData.sections;
                case 5:
                    return awesomeGetContainerInnerData.rangerParams;
                case 6:
                    return awesomeGetContainerInnerData.clientCache;
                case 7:
                    return awesomeGetContainerInnerData.passParams;
                case '\b':
                    return awesomeGetContainerInnerData.pageParams;
                case '\t':
                    return awesomeGetContainerInnerData.versionInfo;
                default:
                    return null;
            }
        } catch (Throwable th) {
            e.a("home.hContainerData", "parse single container data error", th);
            return null;
        }
    }

    private Object a(List list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b824aaf", new Object[]{this, list, str});
        }
        if (list == null) {
            return null;
        }
        try {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue >= 0 && intValue < list.size()) {
                return list.get(intValue);
            }
            return null;
        } catch (Throwable th) {
            e.a("home.hContainerData", "parse array data error", th);
            return null;
        }
    }
}
