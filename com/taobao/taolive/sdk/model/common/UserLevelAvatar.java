package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.interact.MedalLevelEntity;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class UserLevelAvatar implements INetDataObject {
    public String anchorId;
    public String bgColor;
    public String flowSource;
    public String flowSourceText;
    public HashMap<String, String> identify;
    public boolean isMember;
    public String liveId;
    public String medalFrameImg;
    public int medalLeftMargin;
    public List<MedalLevelEntity> medalList;
    public String nick;
    public String userid;

    static {
        kge.a(-1229848099);
        kge.a(-540945145);
    }
}
