package com.taobao.android.detail.alicom.model;

import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class FetchComponentData {

    /* loaded from: classes4.dex */
    public static class FetchModel implements Serializable {
        public ComponentData componentData;

        /* loaded from: classes4.dex */
        public static class ComponentData implements Serializable {
            public List<Area> area;
            public String areaName;
            public List<Network> network;
            public String networkName;
            public Number phoneNumber;
            public String phoneNumberName;
            public List<Plan> plan;
            public List<Plan> planLite;
            public String planLiteName;
            public String planName;

            /* loaded from: classes4.dex */
            public static class Area implements Serializable {
                public List<City> city;
                public String code;
                public String name;

                /* loaded from: classes4.dex */
                public static class City implements Serializable {
                    public String cityInitial;
                    public String code;
                    public String name;
                    public List<String> network;
                    public List<String> planIds;
                    public String selected;

                    static {
                        kge.a(-150858784);
                        kge.a(1028243835);
                    }
                }

                static {
                    kge.a(-1107219153);
                    kge.a(1028243835);
                }
            }

            /* loaded from: classes4.dex */
            public static class Network implements Serializable {
                public String code;
                public String name;

                static {
                    kge.a(-1521868212);
                    kge.a(1028243835);
                }
            }

            /* loaded from: classes4.dex */
            public static class Number implements Serializable {
                public int selectNumType;

                static {
                    kge.a(1489475435);
                    kge.a(1028243835);
                }
            }

            /* loaded from: classes4.dex */
            public static class Plan implements Serializable {
                public String contractDesc;
                public String feeRuleMemo;
                public String name;
                public String nativeDesc;
                public String numPreFree;
                public String planId;

                static {
                    kge.a(-1106778165);
                    kge.a(1028243835);
                }
            }

            static {
                kge.a(1461576418);
                kge.a(1028243835);
            }
        }

        static {
            kge.a(1894817951);
            kge.a(1028243835);
        }

        public FetchModel(ComponentData componentData) {
            this.componentData = componentData;
        }
    }

    static {
        kge.a(-262467916);
    }
}
