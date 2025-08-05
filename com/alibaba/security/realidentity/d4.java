package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.common.http.MTopManager;
import com.alibaba.security.common.http.interfaces.OnHttpCallBack;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.common.http.model.HttpResponse;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.entity.ClientInfo;
import com.alibaba.security.realidentity.service.track.RPTrackHttpModel;
import com.alibaba.security.realidentity.service.track.RPTrackRequest;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class d4 implements f4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String d = "TrackUpload";

    /* renamed from: a  reason: collision with root package name */
    public final Context f3381a;
    public final MTopManager b;
    public RPBizConfig c;

    /* loaded from: classes3.dex */
    public class a implements OnHttpCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.security.common.http.interfaces.OnHttpCallBack
        public void onFail(HttpRequest httpRequest, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7806fd23", new Object[]{this, httpRequest, exc});
                return;
            }
            com.alibaba.security.realidentity.a.b(d4.d, "doUpload response error: " + d.a(exc));
        }

        @Override // com.alibaba.security.common.http.interfaces.OnHttpCallBack
        public void onSuccess(HttpRequest httpRequest, HttpResponse httpResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66498457", new Object[]{this, httpRequest, httpResponse});
            }
        }
    }

    public d4(Context context) {
        this.f3381a = context;
        this.b = new MTopManager(context);
    }

    private ClientInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientInfo) ipChange.ipc$dispatch("7232f1ff", new Object[]{this, str});
        }
        ClientInfo clientInfo = new ClientInfo(this.f3381a);
        clientInfo.setVersionTag(c.a(r.a().a(this.f3381a, str)));
        return clientInfo;
    }

    public void a(RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f7964c", new Object[]{this, rPBizConfig});
        } else {
            this.c = rPBizConfig;
        }
    }

    @Override // com.alibaba.security.realidentity.f4
    public void a(List<TrackLog> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        RPBizConfig rPBizConfig = this.c;
        a(rPBizConfig == null ? "" : rPBizConfig.getBasicsConfig().verifyToken, list);
    }

    private void a(String str, List<TrackLog> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
            return;
        }
        RPTrackHttpModel rPTrackHttpModel = new RPTrackHttpModel();
        rPTrackHttpModel.clientInfo = a(str);
        rPTrackHttpModel.verifyToken = str;
        rPTrackHttpModel.wirelessLogs = list;
        RPTrackRequest rPTrackRequest = new RPTrackRequest(str, "");
        rPTrackRequest.setRequest(rPTrackHttpModel);
        this.b.asyncRequest(rPTrackRequest, new a());
    }
}
