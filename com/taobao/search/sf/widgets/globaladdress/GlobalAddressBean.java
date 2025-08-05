package com.taobao.search.sf.widgets.globaladdress;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import java.util.HashMap;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes8.dex */
public final class GlobalAddressBean extends BaseTypedBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeexBean dropBean;
    private String guideActivity;
    private int guideCount;
    private long guideInterval;
    private String locationText;
    private final HashMap<String, String> utLogMap = new HashMap<>();
    private String mode = "changeLocation";

    static {
        kge.a(-1383395269);
    }

    public final String getLocationText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2ed3f101", new Object[]{this}) : this.locationText;
    }

    public final void setLocationText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c48a395", new Object[]{this, str});
        } else {
            this.locationText = str;
        }
    }

    public final HashMap<String, String> getUtLogMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("35009ed7", new Object[]{this}) : this.utLogMap;
    }

    public final WeexBean getDropBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexBean) ipChange.ipc$dispatch("813d3a6d", new Object[]{this}) : this.dropBean;
    }

    public final void setDropBean(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47830bdb", new Object[]{this, weexBean});
        } else {
            this.dropBean = weexBean;
        }
    }

    public final String getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("24310680", new Object[]{this}) : this.mode;
    }

    public final void setMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66f09f6", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.mode = str;
    }

    public final String getGuideActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b0cd27a4", new Object[]{this}) : this.guideActivity;
    }

    public final void setGuideActivity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d77aeba", new Object[]{this, str});
        } else {
            this.guideActivity = str;
        }
    }

    public final int getGuideCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ad40363", new Object[]{this})).intValue() : this.guideCount;
    }

    public final void setGuideCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46837707", new Object[]{this, new Integer(i)});
        } else {
            this.guideCount = i;
        }
    }

    public final long getGuideInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bab0fb26", new Object[]{this})).longValue() : this.guideInterval;
    }

    public final void setGuideInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329a63de", new Object[]{this, new Long(j)});
        } else {
            this.guideInterval = j;
        }
    }
}
