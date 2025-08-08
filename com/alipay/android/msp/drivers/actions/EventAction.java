package com.alipay.android.msp.drivers.actions;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;

/* loaded from: classes3.dex */
public class EventAction implements Action {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FROM_INVOKE = "invoke";
    public static final String FROM_NATIVE = "native";
    public static final String FROM_SUBMIT = "submit";
    private Object c;
    private String d;
    private int e;
    private String f;
    private int g;
    private SubmitType h;
    private int k;
    private MspEvent[] l;
    private long m;
    private long n;
    private FBDocument q;
    private ITemplateClickCallback r;

    /* renamed from: a  reason: collision with root package name */
    private final DataBundle<DataKeys, Object> f4571a = new DataBundle<>();
    private boolean j = false;
    private boolean i = false;
    private String o = "native";
    private long p = 0;
    private final ActionTypes b = ActionTypes.COMMAND;

    /* loaded from: classes3.dex */
    public enum DataKeys implements DataKey {
        mspEvent
    }

    /* loaded from: classes3.dex */
    public enum SubmitType {
        FirstRequest,
        FirstRequestAfterPage,
        CommonRequest,
        CommonRequestWithoutUI
    }

    @Override // com.alipay.android.msp.drivers.actions.Action
    public ActionTypes getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionTypes) ipChange.ipc$dispatch("9edfc33d", new Object[]{this}) : this.b;
    }

    @Override // com.alipay.android.msp.drivers.actions.Action
    @Deprecated
    public DataBundle<DataKeys, Object> getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataBundle) ipChange.ipc$dispatch("d3409a3a", new Object[]{this}) : this.f4571a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("<EventAction@%d with type: %s from: %s data: %s>", Integer.valueOf(hashCode()), this.b, this.o, this.d);
    }

    public EventAction() {
        this.f4571a.put(DataKeys.mspEvent, this);
    }

    public EventAction(String str) {
        this.f4571a.put(DataKeys.mspEvent, this);
        this.l = new MspEvent[1];
        this.l[0] = new MspEvent(str);
    }

    public long getInvokeFunKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa21dae9", new Object[]{this})).longValue() : this.p;
    }

    public void setInvokeFunKey(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b006e3", new Object[]{this, new Long(j)});
        } else {
            this.p = j;
        }
    }

    public FBDocument getInvokeDoc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBDocument) ipChange.ipc$dispatch("e0b77f6c", new Object[]{this}) : this.q;
    }

    public void setInvokeDoc(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6e7b0c", new Object[]{this, fBDocument});
        } else {
            this.q = fBDocument;
        }
    }

    public String getEventFrom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1118b50b", new Object[]{this}) : this.o;
    }

    public void setEventFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943ba833", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public Object getSender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2fbf8d40", new Object[]{this}) : this.c;
    }

    public void setSender(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff39e9a", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    public void setMspActionFromScheme(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c856ad92", new Object[]{this, str, str2, str3});
        } else if (!StringUtils.equals(str, MspEventTypes.ACTION_INVOKE_LOC)) {
        } else {
            this.l = new MspEvent[1];
            this.l[0] = new MspEvent(str2);
            if (StringUtils.isEmpty(str3)) {
                return;
            }
            this.l[0].setActionParamsJson(JSONObject.parseObject(str3));
        }
    }

    public void setActionParamsArray(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68d72bd", new Object[]{this, strArr});
            return;
        }
        MspEvent[] mspEventArr = this.l;
        if (mspEventArr == null || mspEventArr.length <= 0) {
            return;
        }
        for (MspEvent mspEvent : mspEventArr) {
            mspEvent.setActionParamsArray(strArr);
        }
    }

    public void setActionParamsJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26e0e823", new Object[]{this, jSONObject});
            return;
        }
        MspEvent[] mspEventArr = this.l;
        if (mspEventArr == null || mspEventArr.length <= 0) {
            return;
        }
        for (MspEvent mspEvent : mspEventArr) {
            mspEvent.setActionParamsJson(jSONObject);
        }
    }

    public int getDelayTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee424fb4", new Object[]{this})).intValue() : this.e;
    }

    public void setDelayTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fe836e", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public String getActionData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("90f6b5c3", new Object[]{this}) : this.d;
    }

    public void setActionData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c98a13", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public SubmitType getSubmitType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubmitType) ipChange.ipc$dispatch("f23c2bc8", new Object[]{this}) : this.h;
    }

    public void setSubmitType(SubmitType submitType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e9a270e", new Object[]{this, submitType});
        } else {
            this.h = submitType;
        }
    }

    public boolean isAjax() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c094cdf5", new Object[]{this})).booleanValue() : this.j;
    }

    public void setAjax(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678992cb", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public boolean isFromLocalEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("865c480e", new Object[]{this})).booleanValue() : this.i;
    }

    public void setFromLocalEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687e41d2", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public int getLogFieldEndCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5b198b6", new Object[]{this})).intValue() : this.g;
    }

    public void setLogFieldEndCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad521ac", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public MspEvent[] getMspEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspEvent[]) ipChange.ipc$dispatch("5315fb78", new Object[]{this}) : this.l;
    }

    public void setMspEvents(MspEvent[] mspEventArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecae73e", new Object[]{this, mspEventArr});
        } else {
            this.l = mspEventArr;
        }
    }

    public ITemplateClickCallback getTemplateClickCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITemplateClickCallback) ipChange.ipc$dispatch("ca9146e7", new Object[]{this}) : this.r;
    }

    public void setTemplateClickCallback(ITemplateClickCallback iTemplateClickCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2412684d", new Object[]{this, iTemplateClickCallback});
        } else {
            this.r = iTemplateClickCallback;
        }
    }

    public long getStartDispatchTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e1020e2e", new Object[]{this})).longValue() : this.n;
    }

    public void setStartDispatchTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7183cbd6", new Object[]{this, new Long(j)});
        } else {
            this.n = j;
        }
    }

    public long getStartExecuteTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("79f8df11", new Object[]{this})).longValue() : this.m;
    }

    public void setStartExecuteTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95362dbb", new Object[]{this, new Long(j)});
        } else {
            this.m = j;
        }
    }

    public String getNetErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b876c64b", new Object[]{this}) : this.f;
    }

    public void setNetErrorCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e700778b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public boolean isDelayEventType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fba75986", new Object[]{this})).booleanValue();
        }
        MspEvent[] mspEventArr = this.l;
        return mspEventArr != null && mspEventArr.length == 1 && StringUtils.equals(mspEventArr[0].getActionName(), "auth");
    }

    public void setBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public int getBizId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue() : this.k;
    }

    /* loaded from: classes3.dex */
    public static class MspEvent {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f4572a;
        private JSONObject b;
        private String[] c;

        public MspEvent() {
        }

        public MspEvent(String str) {
            setActionName(str);
        }

        public String getActionName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd957182", new Object[]{this}) : this.f4572a;
        }

        public void setActionName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c024634", new Object[]{this, str});
            } else if (StringUtils.isEmpty(str)) {
            } else {
                if (str.startsWith("loc:")) {
                    str = str.substring(4);
                }
                if (str.startsWith("alias-")) {
                    str = str.substring(6);
                }
                this.f4572a = str;
            }
        }

        public String[] getActionParamsArray() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("c687fcfd", new Object[]{this}) : this.c;
        }

        public void setActionParamsArray(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a68d72bd", new Object[]{this, strArr});
            } else {
                this.c = strArr;
            }
        }

        public JSONObject getActionParamsJson() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2f440c81", new Object[]{this}) : this.b;
        }

        public void setActionParamsJson(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26e0e823", new Object[]{this, jSONObject});
            } else {
                this.b = jSONObject;
            }
        }
    }
}
