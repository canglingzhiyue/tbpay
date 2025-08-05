package com.taobao.android.dinamicx.expression.event.tab;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class TabEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject data;
    public int fromIndex;
    public int index;
    public int indexChangeType;
    public boolean isFirstSelected;
    private boolean isTapEvent;

    static {
        kge.a(-1434191720);
    }

    public int getIndexChangeType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("37d3e3c9", new Object[]{this, new Integer(i)})).intValue() : i;
    }

    public TabEvent(long j, int i, int i2, JSONObject jSONObject, boolean z, boolean z2, int i3) {
        super(j);
        this.index = i;
        this.data = jSONObject;
        this.isFirstSelected = z;
        this.isTapEvent = z2;
        this.indexChangeType = i3;
        HashMap hashMap = new HashMap();
        hashMap.put("index", f.a(i));
        hashMap.put("fromIndex", f.a(i2));
        hashMap.put("data", f.a(jSONObject));
        hashMap.put("isFirstSelected", f.a(z));
        hashMap.put("isTapEvent", f.a(z2));
        hashMap.put("indexChangeType", f.a(i3));
        setArgs(hashMap);
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.index;
    }

    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.index = i;
        }
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.data;
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else {
            this.data = jSONObject;
        }
    }

    public boolean isFirstSelected() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a8d3c6c", new Object[]{this})).booleanValue() : this.isFirstSelected;
    }

    public void setFirstSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef454a4", new Object[]{this, new Boolean(z)});
        } else {
            this.isFirstSelected = z;
        }
    }

    public int getFromIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5cb80c", new Object[]{this})).intValue() : this.fromIndex;
    }

    public void setFromIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47312616", new Object[]{this, new Integer(i)});
        } else {
            this.fromIndex = i;
        }
    }

    public boolean isTapEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1326540c", new Object[]{this})).booleanValue() : this.isTapEvent;
    }

    public void setTapEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209bab94", new Object[]{this, new Boolean(z)});
        } else {
            this.isTapEvent = z;
        }
    }

    public void setIndexChangeType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22712e2", new Object[]{this, new Integer(i)});
        } else {
            this.indexChangeType = i;
        }
    }
}
