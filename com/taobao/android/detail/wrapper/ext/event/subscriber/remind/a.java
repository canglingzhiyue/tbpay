package com.taobao.android.detail.wrapper.ext.event.subscriber.remind;

import android.content.Context;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.DetailEvent;
import com.taobao.android.detail.datasdk.protocol.adapter.core.d;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.calendar.aidl.business.CalendarAidlAdapter;
import com.taobao.calendar.aidl.listener.CalendarListener;
import tb.eee;
import tb.egs;
import tb.egu;
import tb.egv;
import tb.emu;
import tb.epj;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements j<eee> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private Context f11290a;

    static {
        kge.a(-98493112);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Context a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9008efd", new Object[]{aVar}) : aVar.f11290a;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(eee eeeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eeeVar}) : a(eeeVar);
    }

    public a(Context context) {
        this.f11290a = context;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.remind.CheckRemindSubscriber");
    }

    public i a(eee eeeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("8a65d29c", new Object[]{this, eeeVar});
        }
        if (eeeVar == null || eeeVar.getParam() == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        egv egvVar = (egv) eeeVar.getParam();
        d c = epj.c();
        if ((egvVar instanceof egs) && c.b()) {
            egs egsVar = (egs) egvVar;
            if (egsVar.b != 1) {
                return com.taobao.android.detail.core.event.a.FAILURE;
            }
            CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
            calendarAidlAdapter.registerListener(new CalendarListener.Stub() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.remind.CheckRemindSubscriber$1
                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onError(String str, String str2) throws RemoteException {
                }

                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onSuccess(boolean z, String str, String[] strArr) throws RemoteException {
                    if (z) {
                        DetailEvent detailEvent = new DetailEvent(3);
                        detailEvent.params = true;
                        f.a(a.a(a.this), detailEvent);
                    }
                }
            });
            egsVar.getClass();
            calendarAidlAdapter.checkReminderExist(10019, egsVar.n);
        }
        if ((egvVar instanceof egu) && c.b()) {
            egu eguVar = (egu) egvVar;
            CalendarAidlAdapter calendarAidlAdapter2 = CalendarAidlAdapter.getInstance();
            calendarAidlAdapter2.registerListener(new CalendarListener.Stub() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.remind.CheckRemindSubscriber$2
                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onError(String str, String str2) throws RemoteException {
                }

                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onSuccess(boolean z, String str, String[] strArr) throws RemoteException {
                    if (z) {
                        DetailEvent detailEvent = new DetailEvent(3);
                        detailEvent.params = true;
                        f.a(a.a(a.this), detailEvent);
                    }
                }
            });
            eguVar.getClass();
            calendarAidlAdapter2.checkReminderExist(WXExceptionConfig.EXCEPTION_JS_RUNTIME_ERROR, eguVar.n);
        }
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
