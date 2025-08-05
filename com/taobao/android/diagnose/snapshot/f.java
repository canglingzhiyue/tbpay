package com.taobao.android.diagnose.snapshot;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import com.taobao.orange.sync.IndexUpdateHandler;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes.dex */
public class f implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f11731a;

    static {
        kge.a(-2105385017);
        kge.a(-1900621027);
    }

    public f(Context context) {
        this.f11731a = context;
    }

    @Override // com.taobao.android.diagnose.snapshot.b
    public void a(String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8d0f55", new Object[]{this, str, str2, cVar});
        } else if (!com.taobao.android.diagnose.config.a.d()) {
            v.d("MtopUploader", "Diagnose upload is disable");
        } else {
            b(str, str2, cVar);
        }
    }

    private void b(final String str, String str2, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f066556", new Object[]{this, str, str2, cVar});
            return;
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.alibaba.emas.publish.update.resource.get");
            mtopRequest.setVersion("1.0");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", (Object) com.taobao.android.diagnose.c.a().e().f11708a);
            jSONObject.put("resourceType", (Object) "snapshot");
            jSONObject.put(IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID, (Object) str);
            jSONObject.put("resourceContent", (Object) str2);
            jSONObject.put("appVersion", (Object) com.taobao.android.diagnose.c.a().d().i().appVer);
            mtopRequest.setData(jSONObject.toJSONString());
            MtopBusiness.build(Mtop.instance(com.taobao.android.diagnose.c.a().e().b, this.f11731a), mtopRequest).mo1305reqMethod(MethodEnum.POST).mo1339retryTime(2).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.diagnose.snapshot.SnapshotMtopUploader$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    c cVar2 = cVar;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.a(str, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    c cVar2 = cVar;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.a(str);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    c cVar2 = cVar;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.a(str, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                }
            }).startRequest();
        } catch (Exception e) {
            v.a("MtopUploader", "sendRequest", e);
            if (cVar == null) {
                return;
            }
            cVar.a(str, TLogTracker.SCENE_EXCEPTION, e.getMessage());
        }
    }
}
