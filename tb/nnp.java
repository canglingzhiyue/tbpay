package tb;

import mtopsdk.common.util.StringUtils;
import anetwork.channel.Response;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.http.HttpNetwork;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.search.sf.j;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class nnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1942341256);
    }

    public static nnk a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nnk) ipChange.ipc$dispatch("953d903f", new Object[]{str, str2});
        }
        nnk nnkVar = new nnk();
        if (StringUtils.isEmpty(str)) {
            return nnkVar;
        }
        if (j.f19452a != null) {
            str = j.f19452a.k().a(str, str2);
        }
        try {
            q.i("SearchRequestUtil", "request url：" + str);
            HttpNetwork httpNetwork = new HttpNetwork(Globals.getApplication());
            RequestImpl requestImpl = new RequestImpl(str);
            requestImpl.setBizId(89);
            requestImpl.setConnectTimeout(20000);
            requestImpl.setReadTimeout(20000);
            requestImpl.setRetryTime(0);
            Response syncSend = httpNetwork.syncSend(requestImpl, null);
            int statusCode = syncSend.getStatusCode();
            nnkVar.f31591a = statusCode;
            q.i("SearchRequestUtil", "status code：" + statusCode);
            if (statusCode > 0) {
                nnkVar.e = true;
                nnkVar.f = syncSend.getBytedata();
                q.i("SearchRequestUtil", "success：" + str);
                if (j.f19452a != null) {
                    j.f19452a.k().a(str, nnkVar.f, str2, false);
                }
            } else {
                q.e("SearchRequestUtil", "failure：" + str);
            }
        } catch (Exception e) {
            q.a("SearchRequestUtil", "fail to request with the url", e);
        }
        return nnkVar;
    }
}
