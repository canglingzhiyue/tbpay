package com.taobao.mytaobao.ultron.event;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.mytaobao.homepage.busniess.model.DeliverInfoBean;
import com.taobao.mytaobao.ultron.fatigue.a;
import com.taobao.mytaobao.ultron.model.UserTrackBean;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class c extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MTBORDERSLIDEREVENTHANDLE = -1149665750309895767L;

    /* renamed from: a  reason: collision with root package name */
    private DeliverInfoBean f18508a = null;
    private final boolean b;

    static {
        kge.a(2131215932);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(boolean z) {
        this.b = z;
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DeliverInfoBean deliverInfoBean;
        UserTrackBean userTrackBean;
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (!this.b) {
            DXPageChangeEvent dXPageChangeEvent = (DXPageChangeEvent) dXEvent;
            if (objArr == null || objArr.length < 2) {
                return;
            }
            try {
                deliverInfoBean = (DeliverInfoBean) JSON.parseObject(JSON.toJSONString(((List) objArr[0]).get(dXPageChangeEvent.pageIndex)), DeliverInfoBean.class);
            } catch (Exception unused) {
                deliverInfoBean = null;
            }
            if (deliverInfoBean == null) {
                return;
            }
            DeliverInfoBean deliverInfoBean2 = this.f18508a;
            if (deliverInfoBean2 != null && deliverInfoBean2.orderId != null && this.f18508a.orderId.equals(deliverInfoBean.orderId)) {
                return;
            }
            this.f18508a = deliverInfoBean;
            com.taobao.mytaobao.ultron.fatigue.b a2 = a.a();
            if (a2 != null) {
                a2.a(deliverInfoBean.orderId, deliverInfoBean.fatigue);
            }
            int i = deliverInfoBean.index;
            List list = (List) objArr[1];
            if (list == null || list.size() <= 0) {
                return;
            }
            for (Object obj : list) {
                if ((obj instanceof JSONObject) && (userTrackBean = (UserTrackBean) ((JSONObject) obj).getObject("fields", UserTrackBean.class)) != null && userTrackBean.args != null && (integer = userTrackBean.args.getInteger("index")) != null && integer.intValue() == i) {
                    com.taobao.mytaobao.ut.c.a(userTrackBean.page, 2101, userTrackBean.arg1, (String) null, (String) null, userTrackBean.args);
                }
            }
        }
    }
}
