package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveCommonTipsMsg implements INetDataObject {
    public String bgColor;
    public HashMap<String, String> identify;
    public String text;
    public String userId;
    public String userNick;

    static {
        kge.a(-405807173);
        kge.a(-540945145);
    }
}
