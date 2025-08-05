package com.taobao.message.chatv2.viewcenter.monitor;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class AvailabilityResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int errorCode;
    private String errorMsg;
    private List<AvailabilityError> errors = new ArrayList();
    private boolean ignore;

    static {
        kge.a(1674256898);
    }

    public boolean hasError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue() : this.errors.size() > 0;
    }

    public Object getErrorDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("46d21228", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        for (AvailabilityError availabilityError : this.errors) {
            jSONArray.add(JSONObject.toJSON(availabilityError));
        }
        return jSONArray;
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue() : this.errorCode;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : this.errorMsg;
    }

    public List<AvailabilityError> getErrors() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d74c36df", new Object[]{this}) : this.errors;
    }

    public void setErrors(List<AvailabilityError> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb37165", new Object[]{this, list});
            return;
        }
        this.errors = list;
        if (this.errors == null) {
            this.errors = new ArrayList();
        }
        AvailabilityError availabilityError = null;
        Iterator<AvailabilityError> it = this.errors.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AvailabilityError next = it.next();
            if (next.errCode == -103) {
                availabilityError = next;
                break;
            }
        }
        if (availabilityError != null) {
            setErrorCode(availabilityError.errCode);
            setErrorMsg(availabilityError.errMsg);
        } else if (this.errors.size() <= 1) {
        } else {
            setErrorCode(list.get(0).errCode);
            setErrorMsg(list.get(0).errMsg);
        }
    }

    public void setErrorCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd0c969", new Object[]{this, new Integer(i)});
        } else {
            this.errorCode = i;
        }
    }

    public void setErrorMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
        } else {
            this.errorMsg = str;
        }
    }

    public boolean isIgnore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b5d54627", new Object[]{this})).booleanValue() : this.ignore;
    }

    public void setIgnore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c91b4ed9", new Object[]{this, new Boolean(z)});
        } else {
            this.ignore = z;
        }
    }
}
