package com.taobao.android.ucp;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.sync.IndexUpdateHandler;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class UcpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a bestBizItem;
    public List<a> bizList;
    public JSONObject ext;
    public transient JSONObject rawData;
    private String schemeId;
    private int statusCode = Status.UNKNOWN.value;

    /* loaded from: classes6.dex */
    public enum Status {
        UNKNOWN(0),
        MODEL_SUCCESS(1),
        MODEL_ERROR(2),
        REQUEST_SUCCESS(4),
        REQUEST_DATA_ERROR(8),
        REQUEST_ERROR(16);
        
        private final int value;

        Status(int i) {
            this.value = i;
        }

        public static Status valueOf(int i) {
            Status status = MODEL_SUCCESS;
            if (i == status.value) {
                return status;
            }
            Status status2 = MODEL_ERROR;
            if (i == status2.value) {
                return status2;
            }
            Status status3 = REQUEST_SUCCESS;
            if (i == status3.value) {
                return status3;
            }
            Status status4 = REQUEST_DATA_ERROR;
            if (i == status4.value) {
                return status4;
            }
            Status status5 = REQUEST_ERROR;
            return i == status5.value ? status5 : UNKNOWN;
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f15693a;
        public final String b;
        public JSONObject[] c;
        @JSONField(serialize = false)
        public transient JSONObject d;
        private final String e;
        private final String f;
        private final String g;
        private final JSONObject h;
        private final JSONObject i;

        public a(JSONObject jSONObject) {
            this.e = jSONObject.getString("schemeId");
            this.f = jSONObject.getString("bizId");
            this.g = jSONObject.getString(IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID);
            this.h = jSONObject.getJSONObject("actualResult");
            this.i = jSONObject.getJSONObject("algParams");
            this.f15693a = jSONObject.getJSONObject("ext");
            this.b = jSONObject.getString("features");
            JSONArray jSONArray = jSONObject.getJSONArray("materialSchemeList");
            if (jSONArray != null) {
                this.c = new JSONObject[jSONArray.size()];
                for (int i = 0; i < jSONArray.size(); i++) {
                    this.c[i] = jSONArray.getJSONObject(i);
                }
            }
            this.d = jSONObject;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e;
        }
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : this.statusCode;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : isRequestSuccess();
    }

    public boolean isAllSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("31ac2277", new Object[]{this})).booleanValue() : isModelSuccess() && isRequestSuccess();
    }

    public boolean isModelSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c116f", new Object[]{this})).booleanValue() : (Status.MODEL_SUCCESS.value & this.statusCode) == Status.MODEL_SUCCESS.value;
    }

    public boolean isRequestSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6ee73c9", new Object[]{this})).booleanValue() : (Status.REQUEST_SUCCESS.value & this.statusCode) == Status.REQUEST_SUCCESS.value;
    }

    public void setModelData(JSONObject jSONObject) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d15c49b8", new Object[]{this, jSONObject});
            return;
        }
        this.rawData = jSONObject;
        JSONArray jSONArray = jSONObject.getJSONArray("bizList");
        if (jSONArray != null && (size = jSONArray.size()) > 0) {
            this.bestBizItem = new a(jSONArray.getJSONObject(0));
            this.schemeId = this.bestBizItem.a();
            this.bizList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                this.bizList.add(new a(jSONArray.getJSONObject(i)));
            }
            return;
        }
        this.bestBizItem = null;
        this.bizList = null;
        this.schemeId = null;
    }

    public void addStatus(Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6994ac54", new Object[]{this, status});
        } else {
            this.statusCode = status.value | this.statusCode;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("statusCode", (Object) Integer.valueOf(this.statusCode));
        jSONObject.put("schemeId", (Object) this.schemeId);
        jSONObject.put("bizList", (Object) this.bizList);
        jSONObject.put("bestBizItem", (Object) this.bestBizItem);
        return jSONObject.toJSONString();
    }
}
