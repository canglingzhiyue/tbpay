package com.taobao.android.detail.core.event.subscriber.jhs;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.params.JoinJhsParams;
import com.taobao.android.detail.core.request.jhs.JoinJhsRequestClient;
import com.taobao.android.detail.core.request.jhs.JoinJhsRequestParams;
import com.taobao.android.detail.datasdk.event.params.c;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopConvert;
import tb.bgc;
import tb.edu;
import tb.emu;
import tb.eoj;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class JoinJhsSubscriber implements j<edu> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNKNOWN_ERROR_MSG = "小二很忙，系统很累，请稍后重试";

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f9726a = new ArrayList<>();
    private DetailCoreActivity b;

    /* loaded from: classes4.dex */
    public static class JoinJhsResponseData implements Serializable {
        public String errorMessage;
        public boolean isSuccess;
        public Map<String, String> params;

        static {
            kge.a(-1254886018);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-1053598292);
        kge.a(-1453870097);
    }

    public static /* synthetic */ DetailCoreActivity a(JoinJhsSubscriber joinJhsSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("2465ff38", new Object[]{joinJhsSubscriber}) : joinJhsSubscriber.b;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(edu eduVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eduVar}) : a(eduVar);
    }

    public JoinJhsSubscriber(DetailCoreActivity detailCoreActivity) {
        this.b = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.jhs.JoinJhsSubscriber");
    }

    public i a(edu eduVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("63906e0d", new Object[]{this, eduVar});
        }
        JoinJhsParams joinJhsParams = eduVar.f27220a;
        JoinJhsRequestParams joinJhsRequestParams = new JoinJhsRequestParams(joinJhsParams.itemId, joinJhsParams.action);
        a aVar = new a(joinJhsParams.baseTradeParams, joinJhsParams.nextEvent);
        this.f9726a.add(aVar);
        new JoinJhsRequestClient().execute(joinJhsRequestParams, aVar, epo.f());
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    /* loaded from: classes4.dex */
    public class a implements com.taobao.android.trade.boost.request.mtop.a<MtopResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.android.detail.datasdk.event.params.a b;
        private eoj c;

        static {
            kge.a(1423183548);
            kge.a(1595456606);
        }

        @Override // com.taobao.android.trade.boost.request.mtop.c
        public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
            } else {
                b(mtopResponse);
            }
        }

        @Override // com.taobao.android.trade.boost.request.mtop.c
        public /* synthetic */ void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else {
                a((MtopResponse) obj);
            }
        }

        public a(com.taobao.android.detail.datasdk.event.params.a aVar, eoj eojVar) {
            this.b = aVar;
            this.c = eojVar;
        }

        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                return;
            }
            if (JoinJhsSubscriber.this.f9726a != null) {
                JoinJhsSubscriber.this.f9726a.remove(this);
            }
            if (mtopResponse == null) {
                epo.a("小二很忙，系统很累，请稍后重试");
                return;
            }
            bgc.b("detail", mtopResponse);
            if (!mtopResponse.isApiSuccess()) {
                epo.a(mtopResponse.getRetMsg());
                return;
            }
            try {
                JoinJhsResponseData joinJhsResponseData = (JoinJhsResponseData) MtopConvert.jsonToOutputDO(mtopResponse.getBytedata(), JoinJhsResult.class).mo2429getData();
                if (joinJhsResponseData != null && !joinJhsResponseData.isSuccess) {
                    if (StringUtils.isEmpty(joinJhsResponseData.errorMessage)) {
                        return;
                    }
                    epo.a(joinJhsResponseData.errorMessage);
                    return;
                }
                c cVar = new c(this.b, false);
                if (joinJhsResponseData != null && joinJhsResponseData.params != null) {
                    String str = joinJhsResponseData.params.get("tgKey");
                    if (!StringUtils.isEmpty(str)) {
                        try {
                            joinJhsResponseData.params.put("tgKey", URLDecoder.decode(str, "utf-8"));
                        } catch (Throwable unused) {
                        }
                    }
                    cVar.c = joinJhsResponseData.params;
                }
                this.c.c = cVar;
                f.a(JoinJhsSubscriber.a(JoinJhsSubscriber.this), this.c);
            } catch (Exception unused2) {
            }
        }

        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("743cc56e", new Object[]{this, mtopResponse});
                return;
            }
            c(mtopResponse);
            bgc.a("detail", mtopResponse);
        }

        @Override // com.taobao.android.trade.boost.request.mtop.a
        public void onSystemFailure(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                return;
            }
            c(mtopResponse);
            bgc.a("detail", mtopResponse);
        }

        private void c(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d3dbcaf", new Object[]{this, mtopResponse});
                return;
            }
            if (JoinJhsSubscriber.this.f9726a != null) {
                JoinJhsSubscriber.this.f9726a.remove(this);
            }
            if (mtopResponse == null) {
                epo.a("小二很忙，系统很累，请稍后重试");
            } else {
                epo.a(mtopResponse.getRetMsg());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class JoinJhsResult extends BaseOutDo {
        private JoinJhsResponseData data;

        static {
            kge.a(-1177780144);
        }

        @Override // mtopsdk.mtop.domain.BaseOutDo
        /* renamed from: getData */
        public Object mo2429getData() {
            return this.data;
        }

        public void setData(JoinJhsResponseData joinJhsResponseData) {
            this.data = joinJhsResponseData;
        }
    }
}
