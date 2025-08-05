package com.taobao.calendar.synchro;

import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    static {
        kge.a(-1529759015);
    }

    public static void a(IRemoteListener iRemoteListener, CalendarAddRequest calendarAddRequest) {
        RemoteBusiness registeListener = RemoteBusiness.build((IMTOPDataObject) calendarAddRequest, TaoHelper.getTTID()).registeListener(iRemoteListener);
        registeListener.mo1341setErrorNotifyAfterCache(false);
        registeListener.startRequest(CalendarAddOrCancelResponse.class);
    }

    public static void a(IRemoteListener iRemoteListener, CalendarCancelRequest calendarCancelRequest) {
        RemoteBusiness registeListener = RemoteBusiness.build((IMTOPDataObject) calendarCancelRequest, TaoHelper.getTTID()).registeListener(iRemoteListener);
        registeListener.mo1341setErrorNotifyAfterCache(false);
        registeListener.startRequest(CalendarAddOrCancelResponse.class);
    }

    public static void a(IRemoteListener iRemoteListener, CalendarSyncAllRequest calendarSyncAllRequest) {
        RemoteBusiness registeListener = RemoteBusiness.build((IMTOPDataObject) calendarSyncAllRequest, TaoHelper.getTTID()).registeListener(iRemoteListener);
        registeListener.mo1341setErrorNotifyAfterCache(false);
        registeListener.startRequest(CalendarSyncAllResponse.class);
    }
}
