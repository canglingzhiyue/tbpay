package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class lfa extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CONTAINERDATA = 6875012019473020234L;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f30543a;
    private final LruCache<String, LruCache<String, Object>> b = new LruCache<>(4);

    public static /* synthetic */ Object ipc$super(lfa lfaVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1231078704);
        f30543a = new Object();
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            try {
                if (objArr.length > 0 && (objArr[0] instanceof String)) {
                    String str = (String) objArr[0];
                    if (TextUtils.isEmpty(str)) {
                        ldf.d("home.hContainerData", "key is empty");
                        return null;
                    }
                    ljs a2 = lfq.a(dXRuntimeContext);
                    if (a2 == null) {
                        ldf.d("home.hContainerData", "infoFlowContext is null");
                        return null;
                    }
                    IContainerDataService iContainerDataService = (IContainerDataService) a2.a(IContainerDataService.class);
                    if (iContainerDataService == null) {
                        ldf.d("home.hContainerData", "containerDataService is null");
                        return null;
                    }
                    IContainerDataModel containerData = iContainerDataService.getContainerData();
                    if (containerData == null) {
                        ldf.d("home.hContainerData", "containerDataService is null");
                        return null;
                    }
                    String str2 = a2.a().a() + containerData.getBase().getCacheTime();
                    Object a3 = a(str2, str);
                    if (a3 != null) {
                        if (a3 != f30543a) {
                            return a3;
                        }
                        return null;
                    }
                    String[] split = str.split("\\.");
                    if (split.length <= 0) {
                        return null;
                    }
                    Object a4 = a(containerData, split);
                    a(str2, str, a4);
                    return a4;
                }
            } catch (Throwable th) {
                ldf.a("home.hContainerData", "parse container data error", th);
            }
        }
        return null;
    }

    private Object a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c254b136", new Object[]{this, str, str2});
        }
        LruCache<String, Object> lruCache = this.b.get(str);
        if (lruCache != null) {
            return lruCache.get(str2);
        }
        return null;
    }

    private void a(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45199658", new Object[]{this, str, str2, obj});
            return;
        }
        LruCache<String, Object> lruCache = this.b.get(str);
        if (lruCache == null) {
            lruCache = new LruCache<>(32);
            this.b.put(str, lruCache);
        }
        String[] strArr = new String[4];
        strArr[0] = "saveCacheResult, key=";
        strArr[1] = str2;
        strArr[2] = ", value=";
        strArr[3] = obj == null ? "null" : obj.toString();
        ldf.d("home.hContainerData", strArr);
        if (obj == null) {
            obj = f30543a;
        }
        lruCache.put(str2, obj);
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
            if (!TextUtils.isEmpty(str)) {
                if (obj instanceof IContainerDataModel) {
                    obj = a((IContainerDataModel) obj, str);
                } else if (obj instanceof IContainerInnerDataModel) {
                    obj = a((IContainerInnerDataModel) obj, str);
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
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        return r8.getDelta();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
        return r8.getBase();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object a(com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel r8, java.lang.String r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.lfa.$ipChange
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
            java.lang.String r8 = "3916e1f5"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            return r8
        L19:
            r0 = -1
            r1 = 0
            int r5 = r9.hashCode()     // Catch: java.lang.Throwable -> L6e
            r6 = 100897(0x18a21, float:1.41387E-40)
            if (r5 == r6) goto L43
            r2 = 3016401(0x2e06d1, float:4.226878E-39)
            if (r5 == r2) goto L39
            r2 = 95468472(0x5b0bbb8, float:1.6619917E-35)
            if (r5 == r2) goto L2f
            goto L4d
        L2f:
            java.lang.String r2 = "delta"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> L6e
            if (r9 == 0) goto L4d
            r0 = 2
            goto L4d
        L39:
            java.lang.String r2 = "base"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> L6e
            if (r9 == 0) goto L4d
            r0 = 1
            goto L4d
        L43:
            java.lang.String r5 = "ext"
            boolean r9 = r9.equals(r5)     // Catch: java.lang.Throwable -> L6e
            if (r9 == 0) goto L4d
            r0 = 0
        L4d:
            if (r0 == 0) goto L5e
            if (r0 == r4) goto L59
            if (r0 == r3) goto L54
            return r1
        L54:
            com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel r8 = r8.getDelta()     // Catch: java.lang.Throwable -> L6e
            return r8
        L59:
            com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel r8 = r8.getBase()     // Catch: java.lang.Throwable -> L6e
            return r8
        L5e:
            com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel r9 = r8.getBase()     // Catch: java.lang.Throwable -> L6e
            if (r9 == 0) goto L6d
            com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel r8 = r8.getBase()     // Catch: java.lang.Throwable -> L6e
            com.alibaba.fastjson.JSONObject r8 = r8.getExt()     // Catch: java.lang.Throwable -> L6e
            return r8
        L6d:
            return r1
        L6e:
            r8 = move-exception
            java.lang.String r9 = "home.hContainerData"
            java.lang.String r0 = "parse single container data error"
            tb.ldf.a(r9, r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lfa.a(com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel, java.lang.String):java.lang.Object");
    }

    private Object a(IContainerInnerDataModel<?> iContainerInnerDataModel, String str) {
        IpChange ipChange = $ipChange;
        char c = 2;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("73e3bd13", new Object[]{this, iContainerInnerDataModel, str});
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
                    return iContainerInnerDataModel.getDataType();
                case 1:
                    return Long.valueOf(iContainerInnerDataModel.getCacheTime());
                case 2:
                    return Long.valueOf(iContainerInnerDataModel.getExpTimeInterval());
                case 3:
                    return iContainerInnerDataModel.getExt();
                case 4:
                    return iContainerInnerDataModel.getSections();
                case 5:
                    return iContainerInnerDataModel.getRangerParams();
                case 6:
                    return iContainerInnerDataModel.getClientCache();
                case 7:
                    return iContainerInnerDataModel.getPassParams();
                case '\b':
                    return iContainerInnerDataModel.mo1280getPageParams();
                case '\t':
                    return iContainerInnerDataModel.getVersionInfo();
                default:
                    return null;
            }
        } catch (Throwable th) {
            ldf.a("home.hContainerData", "parse single container data error", th);
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
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0 && parseInt < list.size()) {
                return list.get(parseInt);
            }
            return null;
        } catch (Throwable th) {
            ldf.a("home.hContainerData", "parse array data error", th);
            return null;
        }
    }
}
