package mtopsdk.instanceconfigs;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes9.dex */
public class MtopExternalInstanceConfigsGetRequest implements IMTOPDataObject {
    public String API_NAME = "mtop.external.instanceConfigs.get";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public String innerInstanceConfigs = null;

    static {
        kge.a(-1868737902);
        kge.a(-350052935);
    }
}
