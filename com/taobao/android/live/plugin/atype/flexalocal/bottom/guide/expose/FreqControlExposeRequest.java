package com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.expose;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class FreqControlExposeRequest implements INetDataObject {
    public Map<String, String> extendParams;
    public String key;
    private String API_NAME = "mtop.roomstudio.live.component.expose";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;

    static {
        kge.a(-1030815450);
        kge.a(-540945145);
    }
}
