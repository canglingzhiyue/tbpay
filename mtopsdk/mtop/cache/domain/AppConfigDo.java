package mtopsdk.mtop.cache.domain;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class AppConfigDo implements Serializable {
    public String appConf;
    public long appConfigVersion;

    static {
        kge.a(1210126842);
        kge.a(1028243835);
    }

    public AppConfigDo(String str, long j) {
        this.appConf = str;
        this.appConfigVersion = j;
    }
}
