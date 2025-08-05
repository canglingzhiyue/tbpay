package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class SmartLandingTask implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject extInfo;
    public TaskAction popAction;
    public HashMap<String, ArrayList<ArrayList<Condition>>> popConditions;
    public String popId;
    public ShowStrategy showStrategy;
    public boolean enableTerminalCtrl = true;
    public boolean disableConditionCheck = false;
    public boolean isRunComplete = false;

    /* loaded from: classes6.dex */
    public static class Condition implements INetDataObject {
        public String behavior;
        public String operation;
        public String paramKey;
        public String paramValue;

        static {
            kge.a(-64512156);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes6.dex */
    public @interface Operation {
        public static final String EQUAL = "==";
        public static final String GREATER = ">";
        public static final String GREATER_EQUAL = ">=";
        public static final String LESSER = "<";
        public static final String LESSER_EQUAL = "<=";
        public static final String NOT_EQUAL = "!=";
        public static final String STR_EQUAL = "equal";
        public static final String STR_IN = "in";
        public static final String STR_INCLUDE = "include";
        public static final String STR_UNEQUAL = "inequal";
    }

    /* loaded from: classes6.dex */
    public static class TaskAction implements INetDataObject {
        public JSONObject actionData;
        public String actionType;

        static {
            kge.a(-629948686);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-1835669939);
        kge.a(-540945145);
    }

    /* loaded from: classes6.dex */
    public static class ShowStrategy implements INetDataObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long interval;
        public String life;
        private boolean mCanShow = true;
        private HashMap<String, Boolean> mValues = new HashMap<>();
        public int times;

        static {
            kge.a(107303591);
            kge.a(-540945145);
        }

        public boolean canShow(String str) {
            HashMap<String, Boolean> hashMap;
            Boolean bool;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bf9a01c2", new Object[]{this, str})).booleanValue();
            }
            if (!TextUtils.isEmpty(str) && (hashMap = this.mValues) != null && hashMap.containsKey(str) && (bool = this.mValues.get(str)) != null) {
                return bool.booleanValue();
            }
            return this.mCanShow;
        }

        public void updateShow(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f855c3d", new Object[]{this, str, new Boolean(z)});
            } else if (!TextUtils.isEmpty(str)) {
                this.mValues.put(str, Boolean.valueOf(z));
            } else {
                this.mCanShow = z;
            }
        }
    }

    public synchronized String getIdentificationId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f29f9b0", new Object[]{this, str});
        }
        return this.popId + "#" + str;
    }
}
