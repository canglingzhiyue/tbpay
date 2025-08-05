package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class InteractiveMsg implements INetDataObject {
    public ArrayList<Component> components;
    public String messageSubType;
    public String name;

    /* loaded from: classes8.dex */
    public static class Component implements INetDataObject {
        public String action;
        public Data data;
        public int duration;
        public String name;
        public String traceInfo;
        public String type;

        static {
            kge.a(-230968561);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class Data implements INetDataObject {
        public String message;
        public String replyName;
        public String userNick;

        static {
            kge.a(847074904);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(1259323734);
        kge.a(-540945145);
    }
}
