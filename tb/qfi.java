package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taopai2.material.base.b;
import com.taobao.taopai2.material.request.Response;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.qff;
import tb.qfg;

/* loaded from: classes8.dex */
public class qfi<T extends qfg> implements qff {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RemoteBusiness f32910a;

    static {
        kge.a(-1750323353);
        kge.a(-1640146124);
    }

    @Override // tb.qff
    public Response<T> a(qff.a aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("5b20dd18", new Object[]{this, aVar});
        }
        b a2 = aVar.a();
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(a2.getAPI());
        mtopRequest.setNeedSession(a2.needLogin());
        mtopRequest.setData(JSON.toJSONString(a2, new PropertyFilter() { // from class: tb.qfi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.fastjson.serializer.PropertyFilter
            public boolean apply(Object obj, String str2, Object obj2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("12c7643b", new Object[]{this, obj, str2, obj2})).booleanValue() : !StringUtils.equals("requestPolicy", str2) && !StringUtils.equals("requestName", str2) && !StringUtils.equals("priority", str2) && !StringUtils.equals("method", str2) && !StringUtils.equals("cachePath", str2) && !StringUtils.equals("aPI", str2) && !StringUtils.equals("cacheTimeS", str2);
            }
        }, new SerializerFeature[0]));
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(false);
        this.f32910a = RemoteBusiness.build(mtopRequest);
        this.f32910a.mtopProp.method = a2.getMethod();
        MtopResponse syncRequest = this.f32910a.syncRequest();
        if (syncRequest == null) {
            return new Response<>(-101, "response is null");
        }
        if (syncRequest.getBytedata() == null) {
            if (syncRequest.getMtopStat() != null) {
                str = syncRequest.getMtopStat().toString();
            } else {
                str = syncRequest.getRetCode() + "|" + syncRequest.getMappingCode();
            }
            return new Response<>(syncRequest.getResponseCode(), str);
        }
        try {
            return (Response) JSON.parseObject(new String(syncRequest.getBytedata()), new TypeReference<Response<T>>(aVar.b()) { // from class: tb.qfi.2
            }, new Feature[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return new Response<>(syncRequest.getResponseCode(), e.getMessage());
        }
    }

    public void cancel() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.f32910a;
        if (remoteBusiness == null) {
            return;
        }
        remoteBusiness.cancelRequest();
    }
}
