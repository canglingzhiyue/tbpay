package com.ap.zoloz.hummer.common;

import android.content.DialogInterface;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;
import com.zoloz.zhub.common.factor.model.FactorNextResponseInner;
import java.util.HashMap;
import java.util.Map;
import tb.cji;
import tb.cjn;
import tb.cjo;
import tb.cjr;
import tb.cjt;
import tb.kge;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HummerCore";

    /* renamed from: a  reason: collision with root package name */
    private b f6458a;
    private Map<Integer, TaskTracker> b = new HashMap();
    private int c = 0;
    private f d;
    private e e;

    static {
        kge.a(1494961831);
    }

    public static /* synthetic */ b a(c cVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("42197634", new Object[]{cVar, bVar});
        }
        cVar.f6458a = bVar;
        return bVar;
    }

    public static /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b3c502", new Object[]{cVar});
        } else {
            cVar.g();
        }
    }

    public static /* synthetic */ void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c54e41", new Object[]{cVar, new Integer(i)});
        } else {
            cVar.a(i);
        }
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8c84c3", new Object[]{cVar});
        } else {
            cVar.i();
        }
    }

    public static /* synthetic */ b c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("17293acd", new Object[]{cVar}) : cVar.f6458a;
    }

    public static /* synthetic */ void d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283e0445", new Object[]{cVar});
        } else {
            cVar.f();
        }
    }

    public static /* synthetic */ void e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f16c406", new Object[]{cVar});
        } else {
            cVar.h();
        }
    }

    public static /* synthetic */ e f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("924c46c7", new Object[]{cVar}) : cVar.e;
    }

    public static /* synthetic */ void g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc84388", new Object[]{cVar});
        } else {
            cVar.e();
        }
    }

    public TaskTracker a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaskTracker) ipChange.ipc$dispatch("af698618", new Object[]{this}) : this.b.get(Integer.valueOf(this.f6458a.a().index));
    }

    public void a(b bVar, f fVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7eb28fa", new Object[]{this, bVar, fVar, new Boolean(z)});
            return;
        }
        BioLog.i("HummerCore schedule called");
        this.f6458a = bVar;
        b bVar2 = this.f6458a;
        if (bVar2 != null) {
            bVar2.a("currentTaskName", "context", TAG);
        }
        this.d = fVar;
        this.e = new e() { // from class: com.ap.zoloz.hummer.common.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ap.zoloz.hummer.common.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!z) {
                } else {
                    c.a(c.this);
                }
            }

            @Override // com.ap.zoloz.hummer.common.e
            public void a(boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
                } else if (z2) {
                    c.b(c.this);
                } else if (c.c(c.this) == null) {
                } else {
                    cji cjiVar = new cji();
                    cjiVar.d = c.c(c.this).f6457a;
                    cjiVar.f26311a = 1003;
                    c.c(c.this).a("hummer_response", "context", cjiVar);
                    c.d(c.this);
                }
            }
        };
        this.c = this.f6458a.d.clientStartIndex;
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01af, code lost:
        if (r1.equals("realIdFinalize") == false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ap.zoloz.hummer.common.c.d():void");
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.f6458a;
        if (bVar == null) {
            return;
        }
        bVar.a("currentTaskName", "context", TAG);
        this.f6458a.a(cjn.ZIM_IDENTIFY_NEXTINDEX, "context", Integer.valueOf(i));
        if (i == -1) {
            e();
        } else if (i == 0 || i < -1) {
            this.f6458a.b(TAG, "Z7028");
            a.a().a(this.e);
        } else {
            this.c = i;
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r1.equals(com.taobao.login4android.qrcode.result.Result.MSG_SUCCESS) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e() {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.ap.zoloz.hummer.common.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r8
            java.lang.String r2 = "5a4ca6c"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            tb.cji r0 = new tb.cji
            r0.<init>()
            com.ap.zoloz.hummer.common.b r1 = r8.f6458a
            if (r1 == 0) goto Lb6
            java.lang.String r1 = r1.f6457a
            r0.d = r1
            com.ap.zoloz.hummer.common.b r1 = r8.f6458a
            java.lang.String r4 = "EKYC_STATUS"
            java.lang.Object r1 = r1.a(r4)
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r1)
            if (r4 != 0) goto L8b
            r4 = -1
            int r5 = r1.hashCode()
            r6 = -202516509(0xfffffffff3edd7e3, float:-3.7687776E31)
            r7 = 2
            if (r5 == r6) goto L59
            r2 = 578079082(0x2274c96a, float:3.3174794E-18)
            if (r5 == r2) goto L4f
            r2 = 982065527(0x3a892177, float:0.0010462244)
            if (r5 == r2) goto L45
            goto L62
        L45:
            java.lang.String r2 = "Pending"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L62
            r2 = 2
            goto L63
        L4f:
            java.lang.String r2 = "Failure"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L62
            r2 = 1
            goto L63
        L59:
            java.lang.String r5 = "Success"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L62
            goto L63
        L62:
            r2 = -1
        L63:
            if (r2 == 0) goto L86
            if (r2 == r3) goto L81
            if (r2 == r7) goto L7c
            com.ap.zoloz.hummer.common.b r0 = r8.f6458a
            java.lang.String r1 = "HummerCore"
            java.lang.String r2 = "Z7024"
            r0.b(r1, r2)
            com.ap.zoloz.hummer.common.a r0 = com.ap.zoloz.hummer.common.a.a()
            com.ap.zoloz.hummer.common.e r1 = r8.e
            r0.a(r1)
            return
        L7c:
            r1 = 3000(0xbb8, float:4.204E-42)
            r0.f26311a = r1
            goto La9
        L81:
            r1 = 2006(0x7d6, float:2.811E-42)
            r0.f26311a = r1
            goto La9
        L86:
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.f26311a = r1
            goto La9
        L8b:
            com.ap.zoloz.hummer.common.b r1 = r8.f6458a
            java.lang.String r2 = "zimResponse"
            java.lang.Object r1 = r1.a(r2)
            if (r1 == 0) goto La5
            com.ap.zoloz.hummer.common.b r1 = r8.f6458a
            java.lang.Object r1 = r1.a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.f26311a = r1
            goto La9
        La5:
            r1 = 1003(0x3eb, float:1.406E-42)
            r0.f26311a = r1
        La9:
            com.ap.zoloz.hummer.common.b r1 = r8.f6458a
            java.lang.String r2 = "hummer_response"
            java.lang.String r3 = "context"
            r1.a(r2, r3, r0)
            r8.f()
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ap.zoloz.hummer.common.c.e():void");
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.c = 0;
        b bVar = this.f6458a;
        if (bVar != null) {
            bVar.a((TaskConfig) null);
        }
        i.a().b();
        f fVar = this.d;
        if (fVar == null) {
            return;
        }
        fVar.a(this.f6458a);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = 0;
        for (TaskTracker taskTracker : this.b.values()) {
            taskTracker.release();
        }
        this.b.clear();
        b bVar = this.f6458a;
        if (bVar != null) {
            bVar.b();
            this.f6458a = null;
        }
        this.d = null;
        this.e = null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        BioLog.i("HummerCore forceQuit");
        this.c = 0;
        for (TaskTracker taskTracker : this.b.values()) {
            BioLog.i("HummerCore forceQuit task");
            taskTracker.forceQuit();
        }
        this.b.clear();
        b bVar = this.f6458a;
        if (bVar == null) {
            return;
        }
        bVar.c();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        b bVar = this.f6458a;
        if (bVar == null) {
            return;
        }
        int i = bVar.i();
        if (i == 0) {
            this.f6458a.b(TAG, "Z7034");
            h();
            return;
        }
        cjr.a().a(new cjo() { // from class: com.ap.zoloz.hummer.common.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.cjo
            public void a(cjt cjtVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e3902acb", new Object[]{this, cjtVar});
                } else {
                    c.e(c.this);
                }
            }
        }, cjr.a().a(this.f6458a, i, false));
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        i.a().b();
        if (this.f6458a != null) {
            cji cjiVar = new cji();
            cjiVar.f26311a = 1003;
            cjiVar.d = this.f6458a.f6457a;
            this.f6458a.a("hummer_response", "context", cjiVar);
        }
        f();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        a.a().a("", false, new DialogInterface.OnCancelListener() { // from class: com.ap.zoloz.hummer.common.c.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                }
            }
        }, true);
        cjr a2 = cjr.a();
        cjo cjoVar = new cjo() { // from class: com.ap.zoloz.hummer.common.c.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.cjo
            public void a(cjt cjtVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e3902acb", new Object[]{this, cjtVar});
                    return;
                }
                a.a().c();
                if (c.c(c.this) == null || cjtVar == null) {
                    return;
                }
                FactorNextResponse factorNextResponse = cjtVar.f26322a;
                if (factorNextResponse == null || "network_exception".equals(cjtVar.b)) {
                    a.a().b(c.f(c.this));
                } else if ("exception".equals(cjtVar.b) || factorNextResponse.response == null || factorNextResponse.response.size() <= 0) {
                    c.c(c.this).b(c.TAG, "Z7022");
                    a.a().a(c.f(c.this));
                } else {
                    String str = factorNextResponse.versionToken;
                    if (!StringUtil.isNullorEmpty(str)) {
                        c.c(c.this).a("versionToken", "context", str);
                    }
                    c.c(c.this).a(cjtVar.f26322a.zStack);
                    FactorNextResponseInner factorNextResponseInner = factorNextResponse.response.get(0);
                    if (!"SYSTEM_SUCCESS".equals(factorNextResponseInner.retCode)) {
                        c.c(c.this).b(c.TAG, factorNextResponseInner.retCodeSub);
                        a.a().a(c.f(c.this));
                        return;
                    }
                    if (factorNextResponse.response.get(0).outParams != null) {
                        for (Map.Entry<String, Object> entry : factorNextResponse.response.get(0).outParams.entrySet()) {
                            c.c(c.this).a(entry.getKey(), "serverResponse", entry.getValue());
                        }
                    }
                    c.g(c.this);
                }
            }
        };
        cjr a3 = cjr.a();
        b bVar = this.f6458a;
        a2.a(cjoVar, a3.a(bVar, ((Integer) bVar.a(cjn.ZIM_IDENTIFY_NEXTINDEX)).intValue(), true));
    }
}
