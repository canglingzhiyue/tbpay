package com.taobao.android.detail.wrapper.ultronengine.event;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.calendar.aidl.business.CalendarAidlAdapter;
import com.taobao.calendar.aidl.listener.CalendarListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import mtopsdk.mtop.global.SDKUtils;
import tb.emu;
import tb.eoh;
import tb.fgi;
import tb.fpz;
import tb.kge;

/* loaded from: classes5.dex */
public class r extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "checkPresale";

    /* renamed from: a */
    private com.alibaba.android.ultron.event.base.e f11456a;
    private Handler b = new Handler(Looper.getMainLooper());
    private Runnable l;

    static {
        kge.a(1974345889);
    }

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d0b08c", new Object[]{rVar});
        } else {
            rVar.e();
        }
    }

    public r() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.PresaleCheckUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        Long l;
        Long l2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        JSONObject c = c();
        if (c == null) {
            com.taobao.android.detail.core.utils.i.a("PresaleCheckUltronSubscriber", "eventFields == null");
            return;
        }
        Integer integer = c.getInteger("status");
        if (integer == null) {
            com.taobao.android.detail.core.utils.i.a("PresaleCheckUltronSubscriber", "status == null)");
            return;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) fpz.c(eVar.a());
        if (detailCoreActivity == null || detailCoreActivity.C() == null) {
            com.taobao.android.detail.core.utils.i.a("PresaleCheckUltronSubscriber", "detailCoreActivity == null || detailCoreActivity.getNodeBundleWrapper() == null");
            return;
        }
        this.f11456a = eVar;
        com.taobao.android.detail.core.utils.i.c("PresaleCheckUltronSubscriber", "onHandleEvent status:" + integer);
        Boolean bool = c.getBoolean("disableRefresh");
        if (integer.intValue() == 1) {
            a(c.getInteger("sourceId").intValue(), detailCoreActivity.C().i());
            if (bool.booleanValue() || (l2 = c.getLong("startTime")) == null) {
                return;
            }
            a(l2.longValue() - ((SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis()));
        } else if (integer.intValue() != 2 || bool.booleanValue() || (l = c.getLong("endTime")) == null) {
        } else {
            a(l.longValue() - ((SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis()));
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (j <= 0) {
        } else {
            Runnable runnable = this.l;
            if (runnable != null) {
                this.b.removeCallbacks(runnable);
            }
            this.l = new a(this.d);
            this.b.postDelayed(this.l, j);
        }
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        com.taobao.android.detail.core.utils.i.a("PresaleCheckUltronSubscriber", "checkRemind sourceId:" + i + " itemId:" + str);
        CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
        calendarAidlAdapter.registerListener(new CalendarListener.Stub() { // from class: com.taobao.android.detail.wrapper.ultronengine.event.PresaleCheckUltronSubscriber$1
            @Override // com.taobao.calendar.aidl.listener.CalendarListener
            public void onSuccess(boolean z, String str2, String[] strArr) throws RemoteException {
                com.taobao.android.detail.core.utils.i.c("PresaleCheckUltronSubscriber", "checkRemind onSuccess:" + z);
                if (z) {
                    r.a(r.this);
                }
            }

            @Override // com.taobao.calendar.aidl.listener.CalendarListener
            public void onError(String str2, String str3) throws RemoteException {
                com.taobao.android.detail.core.utils.i.a("PresaleCheckUltronSubscriber", "checkRemind onError:" + str2 + " " + str3);
            }
        });
        calendarAidlAdapter.checkReminderExist(i, str);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("PresaleCheckUltronSubscriber", "onRemindSet invoke");
        try {
            JSONObject jSONObject = c().getJSONObject(s.WRITE_BACK_ROUTES);
            if (jSONObject == null) {
                com.taobao.android.detail.core.utils.i.a("PresaleCheckUltronSubscriber", "writeBackJson == null");
                return;
            }
            JSONArray jSONArray = new JSONArray(2);
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                JSONObject jSONObject2 = new JSONObject(1);
                jSONObject2.put("sourcePath", (Object) entry.getKey());
                jSONObject2.put("targetPath", entry.getValue());
                jSONArray.add(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("btnTitle", (Object) "已设置提醒");
            jSONObject3.put("rightFirstStatus", (Object) true);
            jSONObject3.put("rightSecondStatus", (Object) true);
            fgi.a(this.f11456a, jSONArray, jSONObject3);
            com.taobao.android.detail.core.utils.i.c("PresaleCheckUltronSubscriber", "onRemindSet adjust dataMergeParams:" + jSONArray);
        } catch (Throwable th) {
            com.taobao.android.detail.core.utils.i.a("PresaleCheckUltronSubscriber", "dataMergeParams", th);
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private WeakReference<Context> f11457a;

        static {
            kge.a(-270975497);
            kge.a(-1390502639);
        }

        public a(Context context) {
            this.f11457a = new WeakReference<>(context);
        }

        @Override // java.lang.Runnable
        public void run() {
            com.taobao.android.detail.datasdk.model.datamodel.node.c C;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Context context = this.f11457a.get();
            if (context == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if ((context instanceof DetailCoreActivity) && (C = ((DetailCoreActivity) context).C()) != null) {
                jSONObject.put("itemId", (Object) C.i());
            }
            com.taobao.android.trade.event.f.a(context, new eoh(jSONObject));
            com.taobao.android.detail.core.utils.i.c("PresaleCheckUltronSubscriber", "CountDownTimer post UpdateItemIdEvent");
        }
    }
}
