package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import java.io.File;
import java.lang.reflect.Constructor;

/* loaded from: classes5.dex */
public class fpm extends fpf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Constructor<?> f28094a;

    static {
        kge.a(-573283431);
    }

    public fpm() {
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            this.f28094a = Class.forName("android.content.res.XmlBlock").getConstructor(byte[].class);
            this.f28094a.setAccessible(true);
        } catch (Exception e) {
            Log.e("Home.FileParser", "Fail to get XmlBlock", e);
        }
    }

    public boolean a(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dbc25676", new Object[]{this, dinamicTemplate})).booleanValue() : new File("/sdcard/com.taobao.taobao/home", dinamicTemplate.name).exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: Exception -> 0x0079, TRY_LEAVE, TryCatch #1 {Exception -> 0x0079, blocks: (B:21:0x005e, B:23:0x0076), top: B:30:0x005e }] */
    @Override // tb.fpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.xmlpull.v1.XmlPullParser a(java.lang.String r5, com.taobao.android.dinamic.tempate.DinamicTemplate r6, com.taobao.android.dinamic.view.b r7) {
        /*
            r4 = this;
            java.lang.String r5 = "Home.FileParser"
            java.lang.reflect.Constructor<?> r0 = r4.f28094a
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r6.name
            boolean r0 = android.text.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            return r1
        L11:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = "/sdcard/com.taobao.taobao/home"
            java.lang.String r3 = r6.name     // Catch: java.lang.Exception -> L2a
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> L2a
            boolean r2 = r0.exists()     // Catch: java.lang.Exception -> L2a
            if (r2 == 0) goto L41
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L2a
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2a
            byte[] r0 = tb.fpj.a(r2)     // Catch: java.lang.Exception -> L2a
            goto L42
        L2a:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fail to read sdcard layout: "
            r2.append(r3)
            java.lang.String r3 = r6.name
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r5, r2, r0)
        L41:
            r0 = r1
        L42:
            byte[] r7 = r4.a(r0, r7)
            if (r7 == 0) goto L90
            int r0 = r7.length
            if (r0 != 0) goto L4c
            goto L90
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "File parser is applied: "
            r0.append(r2)
            java.lang.String r2 = r6.name
            r0.append(r2)
            r0.toString()
            java.lang.reflect.Constructor<?> r0 = r4.f28094a     // Catch: java.lang.Exception -> L79
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L79
            r3 = 0
            r2[r3] = r7     // Catch: java.lang.Exception -> L79
            java.lang.Object r7 = r0.newInstance(r2)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = "newParser"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L79
            java.lang.Object r7 = tb.fpk.a(r7, r0, r2)     // Catch: java.lang.Exception -> L79
            boolean r0 = r7 instanceof android.content.res.XmlResourceParser     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L90
            android.content.res.XmlResourceParser r7 = (android.content.res.XmlResourceParser) r7     // Catch: java.lang.Exception -> L79
            return r7
        L79:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "New sdcard parser exception: "
            r0.append(r2)
            java.lang.String r6 = r6.name
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.e(r5, r6, r7)
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fpm.a(java.lang.String, com.taobao.android.dinamic.tempate.DinamicTemplate, com.taobao.android.dinamic.view.b):org.xmlpull.v1.XmlPullParser");
    }
}
