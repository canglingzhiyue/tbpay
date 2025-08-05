package com.taobao.alilive.aliliveframework.context.atmo.bean;

import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class AtmosphereResListResponseDataNew implements INetDataObject {
    public List<AtmosphereResListResponseData.AtmosphereResItem> otherAtmosphere;
    public List<TabInfo> tabInfoList;

    /* loaded from: classes4.dex */
    public static class TabInfo implements INetDataObject {
        public List<AtmosphereResListResponseData.AtmosphereResItem> stickerList;
        public String tabIcon;
        public String tabKey;
        public String unTabIcon;

        static {
            kge.a(-76054944);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-896163263);
        kge.a(-540945145);
    }
}
