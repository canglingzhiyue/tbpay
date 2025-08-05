package com.taobao.augecore.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes.dex */
public class GroupData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String crowd;
    private String expireTime;
    private String userId;

    public String getCrowd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8fec062", new Object[]{this}) : this.crowd;
    }

    public void setCrowd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b1e1bc", new Object[]{this, str});
        } else {
            this.crowd = str;
        }
    }

    public String getExpireTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1ea09fb7", new Object[]{this}) : this.expireTime;
    }

    public void setExpireTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c5cde9f", new Object[]{this, str});
        } else {
            this.expireTime = str;
        }
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.userId;
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }
}
