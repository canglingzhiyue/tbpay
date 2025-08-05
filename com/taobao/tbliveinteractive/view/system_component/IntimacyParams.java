package com.taobao.tbliveinteractive.view.system_component;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class IntimacyParams implements INetDataObject {
    public String accountId;
    public boolean follow;
    public String liveId;
    public String liveSource;
    public int roomType;
    public String spm;
    public boolean isFandom = false;
    public boolean shopVip = false;
    public boolean shopHasVip = false;

    static {
        kge.a(-648983940);
        kge.a(-540945145);
    }
}
