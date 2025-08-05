package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import tb.lji;

/* loaded from: classes7.dex */
public class mut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lji f31271a;
    private final lji.a b = e();
    private final Context c;
    private JSONObject d;
    private boolean e;

    static {
        kge.a(204180279);
    }

    public static /* synthetic */ void a(mut mutVar, String str, JSONObject jSONObject, lji.a.InterfaceC1153a interfaceC1153a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ade145", new Object[]{mutVar, str, jSONObject, interfaceC1153a});
        } else {
            mutVar.a(str, jSONObject, interfaceC1153a);
        }
    }

    public static /* synthetic */ boolean a(mut mutVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f53ba390", new Object[]{mutVar})).booleanValue() : mutVar.e;
    }

    public mut(lji ljiVar, Context context) {
        this.c = context;
        this.f31271a = ljiVar;
        this.f31271a.a(this.b);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f31271a.b(this.b);
        }
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.d;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.e = true;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.e = false;
        }
    }

    public void a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd717ce7", new Object[]{this, context, uri});
            return;
        }
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        if (context == null || uri == null) {
            return;
        }
        defaultTracker.updatePageUrl(context, uri);
    }

    private lji.a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lji.a) ipChange.ipc$dispatch("f2078b32", new Object[]{this}) : new lji.a() { // from class: tb.mut.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lji.a
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "userTrack";
            }

            @Override // tb.lji.a
            public void a(String str, JSONObject jSONObject, lji.a.InterfaceC1153a interfaceC1153a) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0e36ce9", new Object[]{this, str, jSONObject, interfaceC1153a});
                } else if (str == null) {
                    interfaceC1153a.a("没有传入方法");
                    ldf.d("UserTrackerService", "没有传入方法");
                } else {
                    ldf.d("UserTrackerService", "executeFeature method:" + str);
                    if (!mut.a(mut.this)) {
                        ldf.d("UserTrackerService", "更新的时候视图没有在屏幕上");
                        return;
                    }
                    try {
                        mut.a(mut.this, str, jSONObject, interfaceC1153a);
                    } catch (Exception e) {
                        interfaceC1153a.a("出现异常: " + e.getMessage());
                    }
                }
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r8.equals("updatePageUtParam") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r8, com.alibaba.fastjson.JSONObject r9, tb.lji.a.InterfaceC1153a r10) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.mut.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 4
            if (r1 == 0) goto L1b
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r7
            r1[r4] = r8
            r1[r3] = r9
            r1[r2] = r10
            java.lang.String r8 = "e0e36ce9"
            r0.ipc$dispatch(r8, r1)
            return
        L1b:
            r0 = -1
            int r1 = r8.hashCode()
            switch(r1) {
                case -2000505633: goto L64;
                case 859698569: goto L5a;
                case 1392047779: goto L4f;
                case 1421600451: goto L44;
                case 1729443235: goto L39;
                case 1850454806: goto L2f;
                case 1880007478: goto L24;
                default: goto L23;
            }
        L23:
            goto L6f
        L24:
            java.lang.String r1 = "updatePageUtparam"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L6f
            r2 = 2
            goto L70
        L2f:
            java.lang.String r1 = "updatePageUtParam"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L6f
            goto L70
        L39:
            java.lang.String r1 = "updatePageName"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L6f
            r2 = 6
            goto L70
        L44:
            java.lang.String r1 = "updateNextPageUtparam"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L6f
            r2 = 4
            goto L70
        L4f:
            java.lang.String r1 = "updateNextPageUtParam"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L6f
            r2 = 5
            goto L70
        L5a:
            java.lang.String r1 = "pageEnter"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L6f
            r2 = 0
            goto L70
        L64:
            java.lang.String r1 = "updateNextProp"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L6f
            r2 = 1
            goto L70
        L6f:
            r2 = -1
        L70:
            switch(r2) {
                case 0: goto L88;
                case 1: goto L84;
                case 2: goto L7e;
                case 3: goto L7e;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L74;
                default: goto L73;
            }
        L73:
            goto L8f
        L74:
            android.content.Context r8 = r7.c
            r7.a(r8, r9, r10)
            goto L8f
        L7a:
            r7.a(r9, r10)
            return
        L7e:
            android.content.Context r8 = r7.c
            r7.b(r8, r9, r10)
            return
        L84:
            r7.b(r9, r10)
            return
        L88:
            r7.d = r9
            android.content.Context r8 = r7.c
            r7.c(r8, r9, r10)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mut.a(java.lang.String, com.alibaba.fastjson.JSONObject, tb.lji$a$a):void");
    }

    private void a(Context context, JSONObject jSONObject, lji.a.InterfaceC1153a interfaceC1153a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48ec77b", new Object[]{this, context, jSONObject, interfaceC1153a});
        } else if (jSONObject == null) {
            interfaceC1153a.a("updatePageName jsParams == null");
        } else {
            String string = jSONObject.getString("pageName");
            ldf.d("UserTrackerService", "updatePageName,pageName: " + string);
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, string);
            interfaceC1153a.b("updatePageName success");
        }
    }

    private void a(JSONObject jSONObject, lji.a.InterfaceC1153a interfaceC1153a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c92c73", new Object[]{this, jSONObject, interfaceC1153a});
        } else if (jSONObject == null) {
            interfaceC1153a.a("updateNextPageUtParam jsParams == null");
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(jSONObject.toJSONString());
            interfaceC1153a.b("updateNextPageUtParam success");
        }
    }

    private void b(Context context, JSONObject jSONObject, lji.a.InterfaceC1153a interfaceC1153a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83cf23c", new Object[]{this, context, jSONObject, interfaceC1153a});
        } else if (jSONObject == null) {
            interfaceC1153a.a("updateUtParam jsParams == null");
            ldf.d("UserTrackerService", "updateUtParam jsParams == null");
        } else {
            String jSONString = jSONObject.toJSONString();
            ldf.d("UserTrackerService", "updateUtParam,obj: " + jSONString);
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(context, jSONString);
            interfaceC1153a.b("updateUtParam success");
        }
    }

    private void b(JSONObject jSONObject, lji.a.InterfaceC1153a interfaceC1153a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb72d292", new Object[]{this, jSONObject, interfaceC1153a});
        } else if (jSONObject == null) {
            interfaceC1153a.a("updateNextProp params == null");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (jSONObject2 == null) {
                interfaceC1153a.a("updateNextProp jsParams == null");
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(jSONObject2);
            interfaceC1153a.b("updateNextProp success");
        }
    }

    private void c(Context context, JSONObject jSONObject, lji.a.InterfaceC1153a interfaceC1153a) {
        String str;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3beb1cfd", new Object[]{this, context, jSONObject, interfaceC1153a});
            return;
        }
        String str2 = null;
        if (jSONObject != null) {
            String string = jSONObject.getString("pageName");
            String string2 = jSONObject.getString("spmUrl");
            jSONObject2 = jSONObject.getJSONObject("params");
            str = string;
            str2 = string2;
        } else {
            str = null;
            jSONObject2 = null;
        }
        ldf.d("UserTrackerService", "页面进入埋点,spmUrl: " + str2 + " pageName: " + str + " context: " + context);
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        defaultTracker.updatePageName(context, str);
        defaultTracker.updatePageProperties(context, jSONObject2);
        if (!TextUtils.isEmpty(str2)) {
            defaultTracker.updatePageUrl(context, Uri.parse(str2));
        }
        interfaceC1153a.b("更新页面埋点成功");
    }
}
