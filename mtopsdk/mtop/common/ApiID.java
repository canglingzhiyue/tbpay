package mtopsdk.mtop.common;

import android.os.Handler;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.riy;
import tb.ryh;
import tb.ryl;
import tb.ryn;

/* loaded from: classes.dex */
public class ApiID implements IMTOPDataObject {
    private static final String TAG = "mtopsdk.ApiID";
    private volatile ryn call;
    private volatile boolean isCancelled = false;
    private a mtopContext;

    static {
        kge.a(-1767074565);
        kge.a(-350052935);
    }

    public ApiID(ryn rynVar, a aVar) {
        this.call = rynVar;
        this.mtopContext = aVar;
    }

    public a getMtopContext() {
        return this.mtopContext;
    }

    public ryn getCall() {
        return this.call;
    }

    public void setCall(ryn rynVar) {
        this.call = rynVar;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public boolean cancelApiCall() {
        if (this.call != null) {
            this.call.b();
            this.isCancelled = true;
        }
        return true;
    }

    public ApiID retryApiCall(Handler handler) {
        a aVar = this.mtopContext;
        if (aVar == null) {
            return null;
        }
        aVar.d.handler = handler;
        ryh ryhVar = this.mtopContext.f25000a.getMtopConfig().filterManager;
        if (ryhVar != null) {
            ryhVar.a(null, this.mtopContext);
        }
        ryl.a(ryhVar, this.mtopContext);
        return new ApiID(null, this.mtopContext);
    }

    public ApiID retryApiCall() {
        return retryApiCall(null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("ApiID [call=");
        sb.append(this.call);
        sb.append(", mtopContext=");
        sb.append(this.mtopContext);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
