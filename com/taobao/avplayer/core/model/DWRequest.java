package com.taobao.avplayer.core.model;

import com.taobao.avplayer.core.IDWObject;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class DWRequest implements IDWObject {
    private static final long serialVersionUID = 3052085037769716049L;
    public String apiName;
    public String apiVersion;
    public boolean needLogin;
    public Map<String, String> paramMap;
    public Class<?> responseClass;
    public boolean useWua;

    static {
        kge.a(508726380);
        kge.a(-996138287);
    }
}
