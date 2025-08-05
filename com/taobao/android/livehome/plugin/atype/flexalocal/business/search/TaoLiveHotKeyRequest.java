package com.taobao.android.livehome.plugin.atype.flexalocal.business.search;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class TaoLiveHotKeyRequest implements IMTOPDataObject {
    public String source;
    public String API_NAME = "mtop.mediaplatform.live.hotquery";
    public String VERSION = "3.0";
    public int n = 5;
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;

    static {
        kge.a(954070100);
        kge.a(-350052935);
    }
}
