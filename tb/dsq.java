package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.j;
import com.taobao.android.behavix.utils.f;
import com.taobao.android.testutils.log.LogUtils;
import com.ut.mini.h;
import com.ut.mini.module.trackerlistener.a;
import com.ut.mini.module.trackerlistener.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class dsq extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final dsq f26947a;
    private Map<String, drp> b = new ConcurrentHashMap();
    private boolean c = false;

    public static /* synthetic */ Object ipc$super(dsq dsqVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2123720361:
                super.updateEvent((h) objArr[0]);
                return null;
            case -1660636611:
                super.updateEventPageName((h) objArr[0]);
                return null;
            case -902481609:
                super.beginEvent((h) objArr[0]);
                return null;
            case 1613428460:
                super.sendEvent((Map) objArr[0]);
                return null;
            case 1675711337:
                super.endEvent((h) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public String trackerListenerName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this}) : "BehaviX";
    }

    public static /* synthetic */ Map a(dsq dsqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f2979d8b", new Object[]{dsqVar}) : dsqVar.b;
    }

    public static /* synthetic */ boolean a(dsq dsqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d28d73c2", new Object[]{dsqVar, new Boolean(z)})).booleanValue();
        }
        dsqVar.c = z;
        return z;
    }

    static {
        kge.a(-1624797262);
        f26947a = new dsq();
    }

    private dsq() {
    }

    public static dsq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dsq) ipChange.ipc$dispatch("f03d79c", new Object[0]) : f26947a;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            b.getInstance().unregisterListener(f26947a);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updateEventPageName(h hVar) {
        drp b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d04b23d", new Object[]{this, hVar});
            return;
        }
        super.updateEventPageName(hVar);
        if (!a.b.k() || !a.b.h() || dro.i() || hVar == null) {
            return;
        }
        try {
            if (hVar.getContext() == null || (b = b(hVar.getContext())) == null) {
                return;
            }
            if (!StringUtils.isEmpty(b.d) && StringUtils.equals(b.d, hVar.getPageName())) {
                if (StringUtils.isEmpty(hVar.getPageName()) || StringUtils.equals(b.d, hVar.getPageName())) {
                    return;
                }
                LogUtils.a(LogUtils.BX_BIZ_NAME, "updateEventPageName_not_equal", hVar.getPageName());
                return;
            }
            dsp a2 = a(hVar.getPageName(), hVar.getEventId(), hVar.getArg1(), hVar.getArg2(), hVar.getArg3(), hVar.getProperties());
            if (drh.a(a2)) {
                return;
            }
            b.d = hVar.getPageName();
            Map<String, String> properties = hVar.getProperties();
            if (properties == null) {
                return;
            }
            com.taobao.android.behavix.h.a(hVar.getPageName(), hVar.getBizId(), hVar.getContext(), a(properties, a2, hVar.getEventId(), 0));
        } catch (Throwable th) {
            dsb.a("UtEventListener_updateEventPageName", null, null, th);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void beginEvent(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca353937", new Object[]{this, hVar});
            return;
        }
        super.beginEvent(hVar);
        if (!a.b.k() || !a.b.h() || hVar == null || dro.i()) {
            return;
        }
        try {
            dsp a2 = a(hVar.getPageName(), hVar.getEventId(), hVar.getArg1(), hVar.getArg2(), hVar.getArg3(), hVar.getProperties());
            if (drh.a(a2)) {
                return;
            }
            String[] a3 = a(hVar.getProperties(), a2, hVar.getEventId(), 0);
            if (a(hVar.getEventId(), "pv")) {
                Object context = hVar.getContext();
                if (context == null) {
                    return;
                }
                drv drvVar = new drv();
                drvVar.b = context.hashCode() + "";
                if (!StringUtils.isEmpty(hVar.getPageName())) {
                    com.taobao.android.behavix.h.a(hVar.getPageName(), hVar.getBizId(), context, a3);
                    drvVar.d = hVar.getPageName();
                }
                a(context, drvVar);
            } else if (a(hVar.getEventId(), "expose")) {
                Object context2 = hVar.getContext();
                if (context2 != null && !(context2 instanceof View)) {
                    return;
                }
                com.taobao.android.behavix.h.a(hVar.getPageName(), hVar.getArg1(), hVar.getBizId(), (View) context2, a3);
            } else if (!a(hVar.getEventId(), "scroll")) {
            } else {
                String arg2 = hVar.getArg2();
                if (StringUtils.isEmpty(arg2)) {
                    return;
                }
                String[] split = arg2.split(",");
                if (split.length != 2) {
                    return;
                }
                try {
                    com.taobao.android.behavix.h.a(hVar.getPageName(), hVar.getArg1(), Integer.parseInt(split[0]), Integer.parseInt(split[1]), a3);
                } catch (Exception e) {
                    dsb.a("UtEventScroll", null, null, e);
                }
            }
        } catch (Throwable th) {
            dsb.a("UtEventListener_beginEvent", null, null, th);
        }
    }

    private void a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38873cb1", new Object[]{this, map, str, str2});
        } else if (map == null || str == null || str2 == null) {
        } else {
            map.put(str, str2);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updateEvent(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816a9957", new Object[]{this, hVar});
            return;
        }
        super.updateEvent(hVar);
        if (!a.b.k() || !a.b.h() || dro.i()) {
            return;
        }
        try {
            if (drh.a(a(hVar.getPageName(), hVar.getEventId(), hVar.getArg1(), hVar.getArg2(), hVar.getArg3(), hVar.getProperties()))) {
                if (hVar.getEventId() != 2001 || hVar.getContext() == null || StringUtils.isEmpty(hVar.getPageName())) {
                    return;
                }
                Map<String, String> properties = hVar.getProperties();
                HashMap hashMap = new HashMap();
                a(hashMap, "spm-cnt", properties.get("spm-cnt"));
                a(hashMap, "spm-url", properties.get("spm-url"));
                a(hashMap, bip.KEY_UMBRELLA_SPM_PRE, properties.get(bip.KEY_UMBRELLA_SPM_PRE));
                if (hashMap.size() <= 0) {
                    return;
                }
                com.taobao.android.behavix.h.a(hVar.getPageName(), hVar.getContext(), hashMap);
            } else if (!a(hVar.getEventId(), "pv") || hVar.getContext() == null || StringUtils.isEmpty(hVar.getPageName())) {
            } else {
                com.taobao.android.behavix.h.a(hVar.getPageName(), hVar.getContext(), hVar.getProperties());
            }
        } catch (Throwable th) {
            dsb.a("UtEventListener_updateEvent", null, null, th);
        }
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void endEvent(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e15369", new Object[]{this, hVar});
            return;
        }
        super.endEvent(hVar);
        if (!a.b.k() || !a.b.h() || dro.i()) {
            return;
        }
        try {
            if (a(hVar.getEventId(), "pv")) {
                if (hVar.getContext() == null) {
                    return;
                }
                a(hVar.getContext());
            }
            dsp a2 = a(hVar.getPageName(), hVar.getEventId(), hVar.getArg1(), hVar.getArg2(), hVar.getArg3(), hVar.getProperties());
            if (drh.a(a2)) {
                return;
            }
            String[] a3 = a(hVar.getProperties(), a2, hVar.getEventId(), 0);
            if (a(hVar.getEventId(), "pv")) {
                com.taobao.android.behavix.h.b(hVar.getPageName(), hVar.getBizId(), hVar.getContext(), a3);
            } else if (a(hVar.getEventId(), "expose")) {
                Object context = hVar.getContext();
                if (context != null && !(context instanceof View)) {
                    return;
                }
                com.taobao.android.behavix.h.b(hVar.getPageName(), hVar.getArg1(), hVar.getBizId(), (View) context, a3);
            } else if (!a(hVar.getEventId(), "scroll")) {
            } else {
                String arg2 = hVar.getArg2();
                if (StringUtils.isEmpty(arg2)) {
                    return;
                }
                String[] split = arg2.split(",");
                if (split.length != 2) {
                    return;
                }
                try {
                    com.taobao.android.behavix.h.b(hVar.getPageName(), hVar.getArg1(), Integer.parseInt(split[0]), Integer.parseInt(split[1]), a3);
                } catch (Exception e) {
                    dsb.a("UtEventScroll", null, null, e);
                }
            }
        } catch (Throwable th) {
            dsb.a("UtEventListener_endEvent", null, null, th);
        }
    }

    private dsp a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dsp) ipChange.ipc$dispatch("91cd18af", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
        }
        dsp dspVar = new dsp();
        dspVar.i = BHRTaskConfigBase.TYPE_CONFIG_UT;
        dspVar.h = true;
        dspVar.f26946a = str;
        dspVar.b = dro.a(i + "");
        dspVar.c = str2;
        dspVar.d = str3;
        dspVar.e = str4;
        if (map != null) {
            dspVar.f = new HashMap(map);
        }
        return dspVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[Catch: Throwable -> 0x00d4, TryCatch #1 {Throwable -> 0x00d4, blocks: (B:15:0x002e, B:16:0x0042, B:19:0x007d, B:22:0x008d, B:24:0x0093, B:27:0x009d, B:29:0x00aa, B:31:0x00b3, B:32:0x00bb, B:34:0x00c4, B:35:0x00c8, B:37:0x00d0, B:28:0x00a4), top: B:43:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[Catch: Throwable -> 0x00d4, TryCatch #1 {Throwable -> 0x00d4, blocks: (B:15:0x002e, B:16:0x0042, B:19:0x007d, B:22:0x008d, B:24:0x0093, B:27:0x009d, B:29:0x00aa, B:31:0x00b3, B:32:0x00bb, B:34:0x00c4, B:35:0x00c8, B:37:0x00d0, B:28:0x00a4), top: B:43:0x002e }] */
    @Override // com.ut.mini.module.trackerlistener.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendEvent(java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.dsq.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r12
            r1[r2] = r13
            java.lang.String r13 = "602af6ec"
            r0.ipc$dispatch(r13, r1)
            return
        L15:
            super.sendEvent(r13)
            boolean r0 = com.taobao.android.behavix.behavixswitch.a.b.k()
            if (r0 == 0) goto Lda
            boolean r0 = com.taobao.android.behavix.behavixswitch.a.b.h()
            if (r0 != 0) goto L26
            goto Lda
        L26:
            boolean r0 = tb.dro.i()
            if (r0 == 0) goto L2d
            return
        L2d:
            r0 = 0
            com.alibaba.analytics.core.model.LogField r1 = com.alibaba.analytics.core.model.LogField.EVENTID     // Catch: java.lang.Throwable -> Ld4 java.lang.Exception -> Lda
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld4 java.lang.Exception -> Lda
            java.lang.Object r1 = r13.get(r1)     // Catch: java.lang.Throwable -> Ld4 java.lang.Exception -> Lda
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Ld4 java.lang.Exception -> Lda
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Ld4 java.lang.Exception -> Lda
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> Ld4 java.lang.Exception -> Lda
            com.alibaba.analytics.core.model.LogField r3 = com.alibaba.analytics.core.model.LogField.PAGE     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r3 = r13.get(r3)     // Catch: java.lang.Throwable -> Ld4
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Ld4
            com.alibaba.analytics.core.model.LogField r3 = com.alibaba.analytics.core.model.LogField.ARG1     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r3 = r13.get(r3)     // Catch: java.lang.Throwable -> Ld4
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Ld4
            com.alibaba.analytics.core.model.LogField r3 = com.alibaba.analytics.core.model.LogField.ARG2     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r3 = r13.get(r3)     // Catch: java.lang.Throwable -> Ld4
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Ld4
            com.alibaba.analytics.core.model.LogField r3 = com.alibaba.analytics.core.model.LogField.ARG3     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r3 = r13.get(r3)     // Catch: java.lang.Throwable -> Ld4
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> Ld4
            boolean r3 = r12.a(r10, r1, r11)     // Catch: java.lang.Throwable -> Ld4
            if (r3 == 0) goto L7d
            return
        L7d:
            r3 = r12
            r4 = r10
            r5 = r1
            r6 = r11
            r9 = r13
            tb.dsp r3 = r3.a(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ld4
            boolean r4 = tb.drh.a(r3)     // Catch: java.lang.Throwable -> Ld4
            if (r4 == 0) goto L8d
            return
        L8d:
            boolean r4 = com.taobao.android.behavix.behavixswitch.a.b.q()     // Catch: java.lang.Throwable -> Ld4
            if (r4 == 0) goto La4
            java.lang.String r4 = "ut_tbs"
            boolean r4 = r13.containsKey(r4)     // Catch: java.lang.Throwable -> Ld4
            if (r4 == 0) goto L9d
            goto La4
        L9d:
            java.util.Map r13 = r12.b(r13, r3, r1, r2)     // Catch: java.lang.Throwable -> Ld4
            r8 = r13
            r9 = r0
            goto Laa
        La4:
            java.lang.String[] r13 = r12.a(r13, r3, r1, r2)     // Catch: java.lang.Throwable -> Ld4
            r9 = r13
            r8 = r0
        Laa:
            java.lang.String r13 = "expose"
            boolean r13 = r12.a(r1, r13)     // Catch: java.lang.Throwable -> Ld4
            if (r13 == 0) goto Lbb
            r6 = 0
            r7 = 0
            r4 = r10
            r5 = r11
            com.taobao.android.behavix.h.a(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ld4
            goto Lda
        Lbb:
            java.lang.String r13 = "tap"
            boolean r13 = r12.a(r1, r13)     // Catch: java.lang.Throwable -> Ld4
            if (r13 == 0) goto Lc8
            com.taobao.android.behavix.h.a(r10, r11, r0, r8, r9)     // Catch: java.lang.Throwable -> Ld4
            goto Lda
        Lc8:
            java.lang.String r13 = "custom"
            boolean r13 = r12.a(r1, r13)     // Catch: java.lang.Throwable -> Ld4
            if (r13 == 0) goto Ld3
            com.taobao.android.behavix.h.b(r10, r11, r0, r8, r9)     // Catch: java.lang.Throwable -> Ld4
        Ld3:
            return
        Ld4:
            r13 = move-exception
            java.lang.String r1 = "UtEventListener_sendEvent"
            tb.dsb.a(r1, r0, r0, r13)
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dsq.sendEvent(java.util.Map):void");
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public int[] getAttentionEventIdsForSendEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("ec81ea0e", new Object[]{this}) : a.b.b();
    }

    public boolean a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed88149f", new Object[]{this, str, new Integer(i), str2})).booleanValue();
        }
        JSONObject c = com.taobao.android.behavix.behavixswitch.b.a().c();
        if (c != null && c.size() != 0) {
            if (StringUtils.isEmpty(str2)) {
                return true;
            }
            JSONArray jSONArray = c.getJSONArray(i + "|" + str);
            if (jSONArray == null) {
                return false;
            }
            if (jSONArray.size() == 0) {
                return true;
            }
            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                if (StringUtils.equals(str2, (String) jSONArray.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        JSONObject c = a.b.c();
        if (c.getJSONArray(str) == null) {
            return false;
        }
        return c.getJSONArray(str).contains(Integer.valueOf(i));
    }

    private void a(Object obj, drp drpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4c6f7d2", new Object[]{this, obj, drpVar});
        } else if (obj == null || drpVar == null) {
        } else {
            if ("1".equals(a.d.a("delayClearPV", "1", true))) {
                if (this.c) {
                    this.b.clear();
                    this.c = false;
                }
                this.b.put(obj.hashCode() + "", drpVar);
                f.a().a(new Runnable() { // from class: tb.dsq.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (dsq.a(dsq.this).size() < 4) {
                        } else {
                            dsq.a(dsq.this, true);
                        }
                    }
                });
                return;
            }
            if (this.b.size() >= 5) {
                this.b.clear();
            }
            this.b.put(obj.hashCode() + "", drpVar);
        }
    }

    private void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj == null) {
        } else {
            this.b.remove(obj.hashCode() + "");
        }
    }

    private drp b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("1766c9ff", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        return this.b.get(obj.hashCode() + "");
    }

    private String[] a(Map<String, String> map, dsp dspVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("236b345b", new Object[]{this, map, dspVar, new Integer(i), new Integer(i2)});
        }
        if (map == null || dspVar == null) {
            return null;
        }
        String[] strArr = new String[6];
        strArr[0] = map.get("ARGS");
        strArr[1] = j.a(dspVar.g(), "=", ",");
        strArr[2] = "BXUtListener=true";
        strArr[3] = "bx_eventId=" + i;
        strArr[4] = "BXUTEventType=" + i2;
        return strArr;
    }

    private Map<String, String> b(Map<String, String> map, dsp dspVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f1f80220", new Object[]{this, map, dspVar, new Integer(i), new Integer(i2)});
        }
        if (map == null || dspVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap(dspVar.g());
        hashMap.put("BXUtListener", "true");
        hashMap.put("bx_eventId", String.valueOf(i));
        hashMap.put("BXUTEventType", String.valueOf(i2));
        return hashMap;
    }
}
