package com.alibaba.security.realidentity;

import android.app.Activity;
import com.alibaba.fastjson.JSONException;
import com.alibaba.security.realidentity.biz.dynamic.model.CtidConfigResponse;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.agd;
import tb.agf;
import tb.agi;
import tb.agj;

/* loaded from: classes3.dex */
public class i2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = "C0000000";
    public static final String c = "C0412002";
    public static final String d = "C0412003";
    public static final String e = "C0412004";
    public static final String f = "C0412005";
    public static final String g = "C0412006";
    public static final String h = "C0412007";
    public static final String i = "C0400001";
    public static final String j = "C0405001";
    public static final String k = "C0401009";
    public static final String l = "C0401010";
    public static final String m = "C0402001";
    public static final String n = "C0401001";
    public static final String o = "C0401003";
    public static final String p = "C0401004";
    public static final String q = "i2";

    /* renamed from: a  reason: collision with root package name */
    public c4 f3441a;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CtidConfigResponse f3442a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ j2 d;

        public a(CtidConfigResponse ctidConfigResponse, String str, Activity activity, j2 j2Var) {
            this.f3442a = ctidConfigResponse;
            this.b = str;
            this.c = activity;
            this.d = j2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                i2.a(i2.this, this.f3442a, this.b, this.c, this.d);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements agd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3443a;
        public final /* synthetic */ j2 b;

        public b(String str, j2 j2Var) {
            this.f3443a = str;
            this.b = j2Var;
        }

        @Override // tb.agd
        public void onResult(agi agiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db30f0f0", new Object[]{this, agiVar});
                return;
            }
            String a2 = i2.a();
            com.alibaba.security.realidentity.a.a(a2, "CTID result: " + agiVar.b() + ", resultDesc: " + agiVar.c());
            i2.a(i2.this, agiVar, this.f3443a);
            int a3 = i2.a(i2.this, agiVar.b());
            String a4 = agiVar.a().a();
            j2 j2Var = this.b;
            if (j2Var == null) {
                return;
            }
            j2Var.a(a3, a4);
        }
    }

    public static /* synthetic */ void a(i2 i2Var, CtidConfigResponse ctidConfigResponse, String str, Activity activity, j2 j2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ae00f0", new Object[]{i2Var, ctidConfigResponse, str, activity, j2Var});
        } else {
            i2Var.a(ctidConfigResponse, str, activity, j2Var);
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            Class.forName("tb.agd");
            Class.forName("tb.agf");
            Class.forName("tb.agi");
            Class.forName("tb.agj");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : q;
    }

    public static /* synthetic */ void a(i2 i2Var, agi agiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822c6a20", new Object[]{i2Var, agiVar, str});
        } else {
            i2Var.a(agiVar, str);
        }
    }

    public static /* synthetic */ int a(i2 i2Var, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf667dc6", new Object[]{i2Var, str})).intValue() : i2Var.a(str);
    }

    public void a(c4 c4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26cd001", new Object[]{this, c4Var});
        } else {
            this.f3441a = c4Var;
        }
    }

    public void a(Activity activity, CtidConfigResponse ctidConfigResponse, String str, j2 j2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c4f2d8f", new Object[]{this, activity, ctidConfigResponse, str, j2Var});
        } else {
            activity.runOnUiThread(new a(ctidConfigResponse, str, activity, j2Var));
        }
    }

    private void a(CtidConfigResponse ctidConfigResponse, String str, Activity activity, j2 j2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("728497cf", new Object[]{this, ctidConfigResponse, str, activity, j2Var});
            return;
        }
        agj agjVar = new agj(ctidConfigResponse.orgId, ctidConfigResponse.androidAppId, str, ctidConfigResponse.type);
        a(ctidConfigResponse, str);
        new agf(activity, agjVar).a(new b(str, j2Var));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bb, code lost:
        if (r7.equals(com.alibaba.security.realidentity.i2.c) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int a(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.i2.a(java.lang.String):int");
    }

    private void a(CtidConfigResponse ctidConfigResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f6131b", new Object[]{this, ctidConfigResponse, str});
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("orgId", ctidConfigResponse.orgId);
            hashMap.put("appId", ctidConfigResponse.androidAppId);
            hashMap.put("bizSeq", str);
            hashMap.put("type", String.valueOf(ctidConfigResponse.type));
        } catch (JSONException e2) {
            com.alibaba.security.realidentity.a.a(q, e2);
        }
        a(str, TrackLog.createCtidAppStartLog(com.alibaba.security.realidentity.b.b(hashMap)));
    }

    private void a(agi agiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23697f", new Object[]{this, agiVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("resultCode", agiVar.b());
        hashMap.put("idAuthData", agiVar.a().a());
        hashMap.put("resultMsg", agiVar.c());
        a(str, TrackLog.createCtidAppEndLog(com.alibaba.security.realidentity.b.b(hashMap)));
    }

    private void a(String str, TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2970415f", new Object[]{this, str, trackLog});
            return;
        }
        trackLog.addTag9(g2.f3421a + "/" + g2.b);
        trackLog.addTag10("Android");
        this.f3441a.a(str, trackLog);
    }
}
