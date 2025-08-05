package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.b;

/* loaded from: classes2.dex */
public class bcm extends bcj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-802629643);
    }

    public static /* synthetic */ Object ipc$super(bcm bcmVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.bcj
    public void b(jny jnyVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2589f413", new Object[]{this, jnyVar, requestConfig});
        }
    }

    public bcm(bcb bcbVar) {
        super(bcbVar);
    }

    @Override // tb.bcj
    public void a(jny jnyVar, RequestConfig requestConfig) {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425e40d2", new Object[]{this, jnyVar, requestConfig});
        } else if (!(jnyVar instanceof b) || (c = jnyVar.c()) == null) {
        } else {
            bdw.a((b) jnyVar, c);
        }
    }

    @Override // tb.bcj
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        bdw.a(this.f25799a.w(), 3);
    }
}
