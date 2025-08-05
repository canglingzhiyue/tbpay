package com.taobao.family.globalbubble;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes7.dex */
public class GlobalBlackOrWhiteList implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<String> activity;
    public List<String> url;

    public void setActivity(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9f4289", new Object[]{this, list});
        } else {
            this.activity = list;
        }
    }

    public void setUrl(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80028a5", new Object[]{this, list});
        } else {
            this.url = list;
        }
    }

    public List<String> getActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6683fe3b", new Object[]{this}) : this.activity;
    }

    public List<String> getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d7745407", new Object[]{this}) : this.url;
    }
}
