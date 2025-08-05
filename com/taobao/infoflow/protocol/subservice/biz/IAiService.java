package com.taobao.infoflow.protocol.subservice.biz;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public interface IAiService extends ISubService {
    public static final String SERVICE_NAME = "AiService";

    /* loaded from: classes7.dex */
    public interface IApiInfo extends Serializable {
        String getApi();

        String getVersion();
    }

    /* loaded from: classes7.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1591724181);
        }

        public abstract String a();

        public abstract IApiInfo b();
    }

    void setConfig(a aVar);
}
