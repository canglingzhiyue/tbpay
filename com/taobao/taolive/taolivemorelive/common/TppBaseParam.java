package com.taobao.taolive.taolivemorelive.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class TppBaseParam implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mLiveId;
    private String mSSjsdItemId;
    private HashMap<String, String> mTppParams = new HashMap<>();

    public void setParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed056aa3", new Object[]{this, str, str2});
        } else {
            this.mTppParams.put(str, str2);
        }
    }

    public HashMap<String, String> getmTppParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("e0ab77ed", new Object[]{this}) : this.mTppParams;
    }

    public String getmLiveId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7bbdabdb", new Object[]{this}) : this.mLiveId;
    }

    public void setmLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb5863", new Object[]{this, str});
        } else {
            this.mLiveId = str;
        }
    }

    public String getmSSjsdItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8556e927", new Object[]{this}) : this.mSSjsdItemId;
    }

    public void setmSSjsdItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b624b02f", new Object[]{this, str});
        } else {
            this.mSSjsdItemId = str;
        }
    }
}
