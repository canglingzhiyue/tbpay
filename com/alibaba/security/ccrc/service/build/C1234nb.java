package com.alibaba.security.ccrc.service.build;

import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.wukong.bx.algo.BxData;
import com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.alibaba.security.ccrc.service.build.nb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1234nb extends BaseWorkConfHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3316a = "add";
    public static final String b = "splice";

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r1.equals("add") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.Map<java.lang.String, java.lang.Object> r8, com.alibaba.security.wukong.bx.algo.BxData.OpConfItemValue r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.security.ccrc.service.build.C1234nb.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r1[r3] = r8
            r8 = 2
            r1[r8] = r9
            java.lang.String r8 = "de3b232e"
            r0.ipc$dispatch(r8, r1)
            return
        L18:
            java.lang.String r0 = r9.name
            java.lang.Object r0 = r8.get(r0)
            if (r0 != 0) goto L21
            return
        L21:
            java.lang.String r1 = r9.op
            r4 = -1
            int r5 = r1.hashCode()
            r6 = -895859076(0xffffffffca9a467c, float:-5055294.0)
            if (r5 == r6) goto L3b
            r6 = 96417(0x178a1, float:1.35109E-40)
            if (r5 != r6) goto L46
            java.lang.String r5 = "add"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L46
            goto L47
        L3b:
            java.lang.String r2 = "splice"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L46
            r2 = 1
            goto L47
        L46:
            r2 = -1
        L47:
            if (r2 == 0) goto L5e
            if (r2 != r3) goto L6e
            java.lang.String r1 = r9.input
            java.lang.String r0 = r7.a(r0, r1)
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 == 0) goto L58
            return
        L58:
            java.lang.String r9 = r9.name
            r8.put(r9, r0)
            return
        L5e:
            java.lang.String r0 = r7.b(r0)
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 == 0) goto L69
            return
        L69:
            java.lang.String r9 = r9.name
            r8.put(r9, r0)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.ccrc.service.build.C1234nb.a(java.util.Map, com.alibaba.security.wukong.bx.algo.BxData$OpConfItemValue):void");
    }

    public static /* synthetic */ Object ipc$super(C1234nb c1234nb, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler
    public Map<String, Object> b(Map<String, Object> map, Map<String, Object> map2, List<BxData.OpConfItemValue> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b3d8fb2f", new Object[]{this, map, map2, list});
        }
        for (BxData.OpConfItemValue opConfItemValue : list) {
            a(map2, opConfItemValue);
        }
        return map2;
    }

    private String b(Object obj) {
        int parseInt;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e17923bb", new Object[]{this, obj});
        }
        try {
            for (Object obj2 : BaseWorkConfHandler.a(obj)) {
                if (obj2 instanceof String) {
                    if (!StringUtils.isEmpty((String) obj2)) {
                        parseInt = Integer.parseInt((String) obj2);
                        i += parseInt;
                    }
                } else if (obj2 instanceof Integer) {
                    parseInt = ((Integer) obj2).intValue();
                    i += parseInt;
                }
            }
            return Integer.toString(i);
        } catch (Throwable unused) {
            return null;
        }
    }

    private String a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93e4ff52", new Object[]{this, obj, str});
        }
        try {
            StringBuilder sb = new StringBuilder();
            List<String> a2 = a(BaseWorkConfHandler.a(obj));
            Map map = (Map) JsonUtils.parseObject(str, (Class<Object>) Map.class);
            String str2 = map == null ? "" : (String) map.get("sep");
            if (!StringUtils.isEmpty(str2) && !a2.isEmpty()) {
                String str3 = null;
                for (String str4 : a2) {
                    if (!StringUtils.isEmpty(str4)) {
                        if (str3 != null) {
                            sb.append(str2);
                        }
                        sb.append(str4);
                        if (str3 == null) {
                            str3 = str4;
                        }
                    }
                }
                return sb.toString();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private List<String> a(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            arrayList.add(obj.toString());
        }
        return arrayList;
    }
}
