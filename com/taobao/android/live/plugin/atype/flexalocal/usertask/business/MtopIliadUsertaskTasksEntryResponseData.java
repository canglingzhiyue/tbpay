package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopIliadUsertaskTasksEntryResponseData implements INetDataObject {
    public JSONObject asset;
    public BizData bizData;
    public String bizId;
    public String bizType;
    public long deliveryId;
    public EntryConfig entryConfig;
    public String entryType;
    public String entryUrl;
    public boolean hideProcessBar;
    public String jumpData;
    public String jumpType;
    public JSONObject newAtmosphere;
    public UserTaskProcess process;
    public JSONObject rewards;
    public JSONObject taskWelfarePopLayer;
    public Map<String, String> utParams;
    public boolean showEntry = false;
    public int countdownTime = 20;

    /* loaded from: classes6.dex */
    public static class BizData implements INetDataObject {
        public ArrayList<String> anchorIdList;
        public boolean userJoin;

        static {
            kge.a(1012348221);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes6.dex */
    public static class EntryConfig implements INetDataObject {
        public int animationDuration;
        public String normalIcon;
        public String pauseIcon;
        public String pauseText;
        public String successIcon;
        public String text;

        static {
            kge.a(2130313268);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-1616375132);
        kge.a(-540945145);
    }
}
