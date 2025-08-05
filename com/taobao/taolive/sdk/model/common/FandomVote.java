package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class FandomVote implements INetDataObject {
    public String materialName;
    public String name;
    public int optionType;
    public ArrayList<Options> options;
    public int votedOption;

    /* loaded from: classes8.dex */
    public static class Options implements INetDataObject {
        public int id;
        public String name;
        public String picUrl;
        public String rate;

        static {
            kge.a(-260073176);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-1180346034);
        kge.a(-540945145);
    }
}
