package com.taobao.android.detail.wrapper.ext.request.client;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.annotations.MtopParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import tb.ecg;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f11353a;
    public Map<String, String> b;
    public RemoteBusiness c;

    /* renamed from: com.taobao.android.detail.wrapper.ext.request.client.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0446a {

        /* renamed from: a  reason: collision with root package name */
        public String f11354a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public JSONObject i;

        static {
            kge.a(1193275282);
        }

        public C0446a() {
        }
    }

    static {
        kge.a(176877312);
    }

    public a(Context context) {
        this.f11353a = context;
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.BaseApiRequestClient");
    }

    public void a(C0446a c0446a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ff221a8", new Object[]{this, c0446a});
            return;
        }
        try {
            this.c = b(c0446a);
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put("exception", th.toString());
            ecg.c(this.f11353a, "CustomApiRequest", "initRemoteBusinessError", "initRemoteBusinessError", hashMap);
        }
    }

    private RemoteBusiness b(C0446a c0446a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("5a5cf6ad", new Object[]{this, c0446a});
        }
        MtopRequest mtopRequest = new MtopRequest();
        String str = c0446a.f11354a;
        String str2 = c0446a.b;
        String str3 = c0446a.c;
        String str4 = c0446a.d;
        String str5 = c0446a.e;
        String str6 = c0446a.f;
        String str7 = c0446a.g;
        String str8 = c0446a.h;
        JSONObject jSONObject = c0446a.i;
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(Boolean.parseBoolean(str6));
        mtopRequest.setNeedSession(Boolean.parseBoolean(str7));
        mtopRequest.setData(str8);
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.mo1305reqMethod("get".equalsIgnoreCase(str3) ? MethodEnum.GET : MethodEnum.POST);
        if (Boolean.parseBoolean(str5)) {
            build.mo1335useWua();
        }
        if ("TRADE".equalsIgnoreCase(str4)) {
            build.mo1328setUnitStrategy(MtopParams.UnitStrategy.UNIT_TRADE.toString());
        } else if ("GUIDE".equalsIgnoreCase(str4)) {
            build.mo1328setUnitStrategy(MtopParams.UnitStrategy.UNIT_GUIDE.toString());
        } else {
            build.mo1328setUnitStrategy(MtopParams.UnitStrategy.UNIT_NULL.toString());
        }
        if (jSONObject != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            build.mo1297headers((Map<String, String>) hashMap);
        }
        return build;
    }

    public void a(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2600e", new Object[]{this, iRemoteBaseListener});
            return;
        }
        RemoteBusiness remoteBusiness = this.c;
        if (remoteBusiness == null) {
            return;
        }
        remoteBusiness.registeListener((IRemoteListener) iRemoteBaseListener);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.c;
        if (remoteBusiness == null) {
            return;
        }
        remoteBusiness.startRequest();
    }
}
