package com.taobao.taopai.material.bean.funny.bean;

import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class FunnyConfigBean implements Serializable {
    public BaseAttr audio;
    public CameraSetting camera;
    public CountDownSetting countdown;
    public BaseAttr filter;
    public BaseAttr paster;
    public RateSetting rate;
    public RatioSetting ratio;

    /* loaded from: classes8.dex */
    public static class BaseAttr implements Serializable {
        public boolean featureOff;

        static {
            kge.a(2035862247);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes8.dex */
    public static class CameraSetting extends BaseAttr implements Serializable {
        public boolean enableSwitch;
        public boolean front;

        static {
            kge.a(369820678);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes8.dex */
    public static class CountDownSetting extends BaseAttr implements Serializable {
        public int defaultValue;
        public boolean enableSwitch;

        static {
            kge.a(-1772502972);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes8.dex */
    public static class RateSetting extends BaseAttr implements Serializable {
        public int defaultValue;
        public ArrayList<Integer> enableSwitch;

        static {
            kge.a(-988967765);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes8.dex */
    public static class RatioSetting extends BaseAttr implements Serializable {
        public int defaultValue;
        public ArrayList<Integer> enableSwitch;

        static {
            kge.a(-1198342198);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-276464481);
        kge.a(1028243835);
    }
}
