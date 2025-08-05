package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.weex.a;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.d;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/mytaobao/pagev2/basement/dataservice/FeedMtopNextFetcher;", "", "apiMethod", "", "apiVersion", "unitStrategy", "requestData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "fetch", "", "saveSnapshot", "str", "syncFetchMtopData", "Lmtopsdk/mtop/domain/MtopResponse;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xoj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34432a;
    private final String b;
    private final String c;
    private final String d;

    static {
        kge.a(-1162280308);
    }

    public xoj(String apiMethod, String apiVersion, String str, String requestData) {
        q.c(apiMethod, "apiMethod");
        q.c(apiVersion, "apiVersion");
        q.c(requestData, "requestData");
        this.f34432a = apiMethod;
        this.b = apiVersion;
        this.c = str;
        this.d = requestData;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MtopResponse b = b();
        if ((b != null ? b.getBytedata() : null) == null) {
            return;
        }
        byte[] bytedata = b.getBytedata();
        q.a((Object) bytedata, "mtopResponse.bytedata");
        String str = new String(bytedata, d.UTF_8);
        a(str);
        TLog.loge("我淘二屏数据层", "预请求next完成");
        a.INSTANCE.c(str);
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            muh.a(a.DB_KEY_FEED_DATA, str);
        }
    }

    private final MtopResponse b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("23e6c092", new Object[]{this});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(this.f34432a);
        mtopRequest.setVersion(this.b);
        mtopRequest.setData(this.d);
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopRequest, TaoHelper.getTTID());
        String str = this.c;
        if (str != null) {
            build.mo1328setUnitStrategy(str);
        }
        build.mo1305reqMethod(MethodEnum.POST);
        try {
            return build.syncRequest();
        } catch (Throwable unused) {
            return null;
        }
    }
}
