package com.taobao.android.detail.wrapper.ext.event.subscriber.jhs;

import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.utils.n;
import com.taobao.android.detail.core.request.jhs.RemindJhsRequestClient;
import com.taobao.android.detail.core.request.jhs.RemindJhsRequestParams;
import com.taobao.android.detail.core.request.jhs.RemindResult;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.JhsNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.calendar.aidl.business.CalendarAidlAdapter;
import com.taobao.calendar.aidl.listener.CalendarListener;
import com.taobao.calendar.aidl.model.ScheduleDTO;
import java.text.SimpleDateFormat;
import mtopsdk.mtop.domain.MtopResponse;
import tb.edf;
import tb.emu;
import tb.eob;
import tb.epj;
import tb.epo;
import tb.eqb;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements com.taobao.android.trade.boost.request.mtop.a<RemindResult>, j<eob> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DetailCoreActivity f11289a;
    private String b = "系统异常，请重试";
    private a c;

    /* loaded from: classes5.dex */
    public interface a {
        void a(RemindResult remindResult);
    }

    static {
        kge.a(-1326153375);
        kge.a(-1453870097);
        kge.a(1595456606);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(eob eobVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eobVar}) : a(eobVar);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
        } else {
            a((RemindResult) obj);
        }
    }

    public b(DetailCoreActivity detailCoreActivity) {
        this.f11289a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.jhs.RemindJhsSubscriber");
    }

    public i a(eob eobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("1ca8764f", new Object[]{this, eobVar});
        }
        if (eobVar == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        com.taobao.android.detail.datasdk.event.params.b bVar = eobVar.f27487a;
        RemindJhsRequestParams remindJhsRequestParams = new RemindJhsRequestParams(bVar.f9950a);
        remindJhsRequestParams.salesSite = bVar.f;
        new RemindJhsRequestClient().execute(remindJhsRequestParams, this, epo.f());
        DetailCoreActivity detailCoreActivity = this.f11289a;
        if (detailCoreActivity == null || detailCoreActivity.y() == null) {
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
        c cVar = this.f11289a.y().t;
        if (a()) {
            a(cVar, new CalendarListener.Stub() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.jhs.RemindJhsSubscriber$1
                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onError(String str, String str2) throws RemoteException {
                }

                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onSuccess(boolean z, String str, String[] strArr) throws RemoteException {
                }
            });
        }
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5dc62f", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public void a(RemindResult remindResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359db738", new Object[]{this, remindResult});
        } else if (remindResult == null) {
            epo.a(this.b);
        } else {
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(remindResult);
            }
            edf.a aVar2 = new edf.a();
            aVar2.c = remindResult.actionText;
            aVar2.e = remindResult.btnColor;
            aVar2.f = remindResult.btnDisable;
            aVar2.b = remindResult.errorMessage;
            aVar2.d = remindResult.btnText;
            aVar2.f27208a = remindResult.isSuccess;
            edf edfVar = new edf();
            edfVar.f27207a = aVar2;
            f.a(this.f11289a, edfVar);
            epo.a(aVar2.b);
        }
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else {
            epo.a(this.b);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.a
    public void onSystemFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void a(c cVar, CalendarListener.Stub stub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b71bb3a", new Object[]{this, cVar, stub});
        } else if (cVar == null || cVar.f10055a == null) {
        } else {
            ScheduleDTO scheduleDTO = new ScheduleDTO();
            if (!TextUtils.isEmpty(String.valueOf(cVar.i()))) {
                scheduleDTO.setEventId(String.valueOf(cVar.i()));
            } else {
                scheduleDTO.setEventId(String.valueOf(n.a()));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            scheduleDTO.setSourceId(10016);
            scheduleDTO.setTitle(cVar.k());
            scheduleDTO.setDescription(cVar.k());
            VerticalNode g = eqb.g(cVar.f10055a);
            if (g != null && g.jhsNode != null) {
                JhsNode jhsNode = g.jhsNode;
                Long valueOf = Long.valueOf(jhsNode.startTime);
                Long valueOf2 = Long.valueOf(jhsNode.endTime);
                if (valueOf != null) {
                    scheduleDTO.setStartTime(simpleDateFormat.format(valueOf));
                }
                if (valueOf2 != null) {
                    scheduleDTO.setEndTime(simpleDateFormat.format(valueOf2));
                }
            }
            scheduleDTO.setRemind(180);
            scheduleDTO.setIsallday(0);
            ItemNode c = eqb.c(cVar.f10055a);
            if (c != null && !TextUtils.isEmpty(c.itemUrl)) {
                scheduleDTO.setLink(Uri.parse(c.itemUrl).buildUpon().appendQueryParameter("reminded", "1").appendQueryParameter("fromCalendar", "1").appendQueryParameter("backurl", "index").build().toString());
            }
            CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
            calendarAidlAdapter.registerListener(stub);
            calendarAidlAdapter.setReminder(scheduleDTO);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !"false".equals(epj.h().a("android_detail", "detail_jhs_tip_to_calendar", "false"));
    }
}
