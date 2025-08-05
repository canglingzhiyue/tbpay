package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class UltronConfigRequest implements INetDataObject {
    public String API_NAME = "mtop.tblive.live.item.ultron.render";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;
    public String VERSION = "1.0";
    public String domainCode = "taolivegoods";
    public List<String> pageCodes;

    static {
        kge.a(-1072083775);
        kge.a(-540945145);
    }
}
