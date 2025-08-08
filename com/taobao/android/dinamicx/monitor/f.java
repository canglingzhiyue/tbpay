package com.taobao.android.dinamicx.monitor;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.fuw;
import tb.fxe;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11902a;
    private static String b;

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b;
    }

    static {
        kge.a(-202313012);
        f11902a = false;
    }

    public static void a(String str, long j, DXTemplateItem dXTemplateItem) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8092cfb", new Object[]{str, new Long(j), dXTemplateItem});
        } else if (!f11902a) {
        } else {
            if (dXTemplateItem != null) {
                aVar = new a(str, j, dXTemplateItem.f(), dXTemplateItem.g());
            } else {
                aVar = new a(str, j, "null", -1L);
            }
            fxe.g(aVar);
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f11903a;
        public long b;
        public String c;
        public long d;

        static {
            kge.a(1427498109);
            kge.a(-1390502639);
        }

        public a(String str, long j, String str2, long j2) {
            this.f11903a = str;
            this.b = j;
            this.c = str2;
            this.d = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("templateName", (Object) this.c);
            jSONObject.put("templateVersion", (Object) Long.valueOf(this.d));
            jSONObject.put("consumeTime", (Object) Long.valueOf(this.b));
            jSONObject.put("protocolV", (Object) 1);
            jSONObject.put("perfName", (Object) this.f11903a);
            jSONObject.put("name", (Object) this.f11903a);
            jSONObject.put("platform", (Object) "Android");
            if (!StringUtils.isEmpty(f.a())) {
                jSONObject.put("sdkVersion", (Object) f.a());
            } else {
                jSONObject.put("sdkVersion", (Object) "4.1.27.18");
            }
            if (fuw.f28135a && ("DX-Pipeline-Parser".equals(this.f11903a) || "DX-RenderTemplate".equals(this.f11903a))) {
                Log.e("shandian", this.c + " " + this.f11903a + " " + this.b);
            }
            String jSONString = jSONObject.toJSONString();
            fuw.d(jSONString);
            a(jSONString);
        }

        /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0110 A[Catch: IOException -> 0x010c, TRY_LEAVE, TryCatch #6 {IOException -> 0x010c, blocks: (B:55:0x0108, B:59:0x0110), top: B:81:0x0108 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0130 A[Catch: IOException -> 0x012c, TRY_LEAVE, TryCatch #7 {IOException -> 0x012c, blocks: (B:71:0x0128, B:75:0x0130), top: B:83:0x0128 }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a(java.lang.String r10) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.monitor.f.a.a(java.lang.String):void");
        }
    }
}
