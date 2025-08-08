package com.taobao.android.detail.wrapper.aura.event;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.calendar.aidl.business.CalendarAidlAdapter;
import com.taobao.calendar.aidl.listener.CalendarListener;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.global.SDKUtils;
import tb.arc;
import tb.ard;
import tb.arv;
import tb.emu;
import tb.eoh;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.event.checkPreSale")
/* loaded from: classes5.dex */
public final class AliDetailCheckPreSaleEvent extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "checkPresale";
    public static final String STATUS_BEGIN = "2";
    public static final String STATUS_NOT_BEGIN = "1";

    /* renamed from: a  reason: collision with root package name */
    private Handler f11103a = new Handler(Looper.getMainLooper());
    private a b;

    static {
        kge.a(1489398275);
    }

    public static /* synthetic */ Object ipc$super(AliDetailCheckPreSaleEvent aliDetailCheckPreSaleEvent, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "checkPresale";
    }

    public AliDetailCheckPreSaleEvent() {
        emu.a("com.taobao.android.detail.wrapper.aura.event.AliDetailCheckPreSaleEvent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r5.equals("1") != false) goto L25;
     */
    @Override // tb.arv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.alibaba.android.aura.service.event.AURAEventIO r12) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.wrapper.aura.event.AliDetailCheckPreSaleEvent.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r11
            r1[r3] = r12
            java.lang.String r12 = "186833d5"
            r0.ipc$dispatch(r12, r1)
            return
        L15:
            com.alibaba.android.aura.q r0 = r11.b()
            android.content.Context r0 = r0.e()
            boolean r0 = r0 instanceof com.taobao.android.detail.core.detail.activity.DetailCoreActivity
            if (r0 != 0) goto L22
            return
        L22:
            com.alibaba.android.aura.q r0 = r11.b()
            android.content.Context r0 = r0.e()
            com.taobao.android.detail.core.detail.activity.DetailCoreActivity r0 = (com.taobao.android.detail.core.detail.activity.DetailCoreActivity) r0
            com.taobao.android.detail.datasdk.model.datamodel.node.c r1 = r0.C()
            if (r1 != 0) goto L33
            return
        L33:
            com.alibaba.android.aura.service.event.d r4 = r12.getEventModel()
            com.alibaba.fastjson.JSONObject r4 = r4.c()
            if (r4 != 0) goto L3e
            return
        L3e:
            java.lang.String r5 = "status"
            java.lang.String r5 = r4.getString(r5)
            boolean r6 = android.text.StringUtils.isEmpty(r5)
            if (r6 == 0) goto L4b
            return
        L4b:
            r6 = -1
            int r7 = r5.hashCode()
            r8 = 49
            if (r7 == r8) goto L63
            r2 = 50
            if (r7 == r2) goto L59
            goto L6c
        L59:
            java.lang.String r2 = "2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L6c
            r2 = 1
            goto L6d
        L63:
            java.lang.String r7 = "1"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L6c
            goto L6d
        L6c:
            r2 = -1
        L6d:
            if (r2 == 0) goto L78
            if (r2 == r3) goto L72
            goto Lac
        L72:
            java.lang.String r12 = "endTime"
            r11.a(r0, r4, r12)
            goto Lac
        L78:
            java.lang.String r2 = "sourceId"
            java.lang.String r6 = r4.getString(r2)
            java.lang.String r7 = r1.i()
            com.alibaba.android.aura.q r1 = r11.b()
            com.alibaba.android.aura.s r8 = r1.b()
            com.alibaba.android.aura.service.event.d r12 = r12.getEventModel()
            com.alibaba.android.aura.datamodel.render.AURARenderComponent r9 = r12.d()
            boolean r12 = android.text.StringUtils.isEmpty(r6)
            if (r12 != 0) goto Lac
            boolean r12 = android.text.StringUtils.isEmpty(r7)
            if (r12 != 0) goto Lac
            if (r8 == 0) goto Lac
            if (r9 == 0) goto Lac
            r5 = r11
            r10 = r4
            r5.a(r6, r7, r8, r9, r10)
            java.lang.String r12 = "startTime"
            r11.a(r0, r4, r12)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.wrapper.aura.event.AliDetailCheckPreSaleEvent.b(com.alibaba.android.aura.service.event.AURAEventIO):void");
    }

    private void a(String str, String str2, s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75bf3f8", new Object[]{this, str, str2, sVar, aURARenderComponent, jSONObject});
            return;
        }
        CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
        calendarAidlAdapter.registerListener(new InnerCalendarListener(sVar, aURARenderComponent, jSONObject));
        try {
            calendarAidlAdapter.checkReminderExist(Integer.parseInt(str), str2);
        } catch (Exception e) {
            arc.a().c("AliDetailCheckPreSaleEvent", "checkCalendarRemind", e.toString());
        }
    }

    private void a(DetailCoreActivity detailCoreActivity, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692dbee7", new Object[]{this, detailCoreActivity, jSONObject, str});
            return;
        }
        Boolean bool = jSONObject.getBoolean("disableRefresh");
        if (bool == null || bool.booleanValue()) {
            return;
        }
        long longValue = jSONObject.getLong(str).longValue() - ((SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis());
        if (longValue <= 0) {
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            this.f11103a.removeCallbacks(aVar);
        }
        this.b = new a(detailCoreActivity);
        this.f11103a.postDelayed(this.b, longValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class InnerCalendarListener extends CalendarListener.Stub {
        AURARenderComponent mComponent;
        JSONObject mEventFields;
        s mInstance;

        static {
            kge.a(89223303);
        }

        public InnerCalendarListener(s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
            this.mInstance = sVar;
            this.mComponent = aURARenderComponent;
            this.mEventFields = jSONObject;
        }

        @Override // com.taobao.calendar.aidl.listener.CalendarListener
        public void onSuccess(boolean z, String str, String[] strArr) throws RemoteException {
            if (z) {
                doAdjustState();
            }
        }

        @Override // com.taobao.calendar.aidl.listener.CalendarListener
        public void onError(String str, String str2) throws RemoteException {
            ard a2 = arc.a();
            StringBuilder sb = new StringBuilder();
            sb.append("errorCode:");
            if (StringUtils.isEmpty(str)) {
                str = "";
            }
            sb.append(str);
            sb.append(",eventId:");
            if (StringUtils.isEmpty(str2)) {
                str2 = "";
            }
            sb.append(str2);
            a2.c("AliDetailCheckPreSaleEvent.InnerCalendarListener", "onError", sb.toString());
        }

        private void doAdjustState() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.mEventFields);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("beReplaced", (Object) "bottomBarVO");
            jSONObject2.put("toReplace", (Object) "fields");
            jSONObject.put("targetReplacement", (Object) jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("btnTitle", (Object) "已设置提醒");
            jSONObject3.put("rightFirstStatus", (Object) true);
            jSONObject3.put("rightSecondStatus", (Object) true);
            jSONObject.put("payload", (Object) jSONObject3);
            com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d();
            dVar.a(this.mComponent);
            dVar.a("" + System.currentTimeMillis());
            dVar.a(jSONObject);
            com.alibaba.android.aura.service.event.c.a(this.mInstance, "adjustState", dVar);
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DetailCoreActivity> f11104a;

        static {
            kge.a(-1955423447);
            kge.a(-1390502639);
        }

        public a(DetailCoreActivity detailCoreActivity) {
            this.f11104a = new WeakReference<>(null);
            this.f11104a = new WeakReference<>(detailCoreActivity);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DetailCoreActivity detailCoreActivity = this.f11104a.get();
            if (detailCoreActivity == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            com.taobao.android.detail.datasdk.model.datamodel.node.c C = detailCoreActivity.C();
            if (C != null) {
                jSONObject.put("itemId", (Object) C.i());
            }
            com.taobao.android.trade.event.f.a(detailCoreActivity, new eoh(jSONObject));
        }
    }
}
