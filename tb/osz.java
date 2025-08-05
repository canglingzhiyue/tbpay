package tb;

import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;

/* loaded from: classes8.dex */
public interface osz {

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z);

        void a(String str, String str2, AwesomeGetData awesomeGetData, boolean z);

        void a(String str, String str2, String str3);
    }

    /* loaded from: classes8.dex */
    public interface b extends a {
        void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, com.taobao.tao.recommend3.gateway.request.a aVar);
    }

    void a(a aVar);

    void b(a aVar);
}
