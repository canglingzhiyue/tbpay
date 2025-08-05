package com.taobao.taolive.taolivemorelive.morelive.business;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* loaded from: classes8.dex */
public class TabMenuResponseData implements IMTOPDataObject {
    public List<AbilitySwitch> abilitySwitch;
    public List<BottomTab> bottomTab;

    /* loaded from: classes8.dex */
    public static class AbilitySwitch implements IMTOPDataObject {
        public String enable;
        public String name;
    }

    /* loaded from: classes8.dex */
    public static class BottomTab implements IMTOPDataObject {
        public String name;
        public List<TopTab> topTab;
    }

    /* loaded from: classes8.dex */
    public static class TopTab implements IMTOPDataObject {
        public String channelId;
        public String channelType;
        public String isDefault;
        public String jumpUrl;
        public String name;
        public String tabType;
    }
}
