package com.taobao.tao.combo;

import android.app.Application;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.combo.dataobject.ComboResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.request.BasicRequest;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends com.taobao.tao.request.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f19879a;
    private Handler b;

    static {
        kge.a(-835791091);
    }

    public static /* synthetic */ IRemoteBaseListener a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRemoteBaseListener) ipChange.ipc$dispatch("d790199d", new Object[]{aVar}) : aVar.mRequestListener;
    }

    public a(Application application, long j, Handler handler) {
        super(application);
        this.f19879a = j;
        this.b = handler;
    }

    public void a(final int i, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261a2d6b", new Object[]{this, new Integer(i), new Long(j), new Boolean(z)});
            return;
        }
        final ComboResponse a2 = b.a().a(Long.valueOf(j));
        if (a2 != null && this.mRequestListener != null) {
            this.b.postDelayed(new Runnable() { // from class: com.taobao.tao.combo.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this).onSuccess(i, null, a2, null);
                    }
                }
            }, 1L);
            return;
        }
        BasicRequest basicRequest = new BasicRequest();
        basicRequest.setAPI_NAME("mtop.gebsupport.shop.getMeal");
        basicRequest.setNEED_ECODE(false);
        basicRequest.setNEED_SESSION(true);
        basicRequest.setORIGINALJSON(true);
        basicRequest.setVERSION("2.0");
        HashMap hashMap = new HashMap();
        hashMap.put("sellerId", Long.valueOf(this.f19879a));
        hashMap.put("mealId", Long.valueOf(j));
        hashMap.put("needMealIdList", Boolean.valueOf(z));
        startRequest(null, i, basicRequest, ComboResponse.class, hashMap);
    }
}
