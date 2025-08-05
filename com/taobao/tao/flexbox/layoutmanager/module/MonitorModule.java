package com.taobao.tao.flexbox.layoutmanager.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.w;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class MonitorModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1574398124);
        kge.a(-818961104);
    }

    public static void report(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e08ca4", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            w.a(cVar.f19938a, (Map) cVar.b, cVar.f19938a.A());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r4.equals("begin") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void apmTrace(com.taobao.tao.flexbox.layoutmanager.ac.g.c r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.module.MonitorModule.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r9
            java.lang.String r9 = "2dc89c71"
            r0.ipc$dispatch(r9, r1)
            return
        L12:
            com.alibaba.fastjson.JSON r0 = r9.b
            boolean r0 = r0 instanceof com.alibaba.fastjson.JSONObject
            if (r0 == 0) goto L88
            com.alibaba.fastjson.JSON r0 = r9.b
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            java.lang.String r1 = "taskName"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r4 = "type"
            java.lang.String r4 = r0.getString(r4)
            r5 = -1
            int r6 = r4.hashCode()
            r7 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            r8 = 2
            if (r6 == r7) goto L53
            r7 = 3135262(0x2fd71e, float:4.393438E-39)
            if (r6 == r7) goto L49
            r7 = 93616297(0x59478a9, float:1.3962177E-35)
            if (r6 == r7) goto L40
            goto L5e
        L40:
            java.lang.String r6 = "begin"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L5e
            goto L5f
        L49:
            java.lang.String r2 = "fail"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L5e
            r2 = 2
            goto L5f
        L53:
            java.lang.String r2 = "success"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L5e
            r2 = 1
            goto L5f
        L5e:
            r2 = -1
        L5f:
            if (r2 == 0) goto L83
            java.lang.String r4 = "properties"
            if (r2 == r3) goto L79
            if (r2 == r8) goto L69
            goto L88
        L69:
            java.lang.String r2 = "errorType"
            java.lang.String r2 = r0.getString(r2)
            com.taobao.tao.flexbox.layoutmanager.core.ab r9 = r9.f19938a
            com.alibaba.fastjson.JSONObject r0 = r0.getJSONObject(r4)
            tb.ogt.a(r9, r1, r2, r0)
            goto L88
        L79:
            com.taobao.tao.flexbox.layoutmanager.core.ab r9 = r9.f19938a
            com.alibaba.fastjson.JSONObject r0 = r0.getJSONObject(r4)
            tb.ogt.a(r9, r1, r0)
            return
        L83:
            com.taobao.tao.flexbox.layoutmanager.core.ab r9 = r9.f19938a
            tb.ogt.a(r9, r1)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.MonitorModule.apmTrace(com.taobao.tao.flexbox.layoutmanager.ac.g$c):void");
    }
}
