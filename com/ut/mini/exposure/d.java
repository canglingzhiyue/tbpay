package com.ut.mini.exposure;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;
import tb.mto;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INITIAL = 0;
    public static final int SEEN = 1;
    public static final int UNSEEN = 2;
    public String block;
    public String tag;
    public View view;
    public Map<String, Object> viewData;
    public long beginTime = 0;
    public long endTime = 0;
    public long lastCalTime = 0;
    public int lastState = 0;
    public double area = mto.a.GEO_NOT_SUPPORT;

    static {
        kge.a(1458667038);
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : i == 1 ? "可见" : i == 2 ? "不可见" : "初始值";
    }

    public d(View view) {
        this.view = view;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        return StringUtils.equals(this.tag, ((d) obj).tag);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.tag.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.view.getClass().getSimpleName());
        sb.append(":");
        sb.append(this.tag);
        sb.append(":");
        sb.append(StringUtils.isEmpty(this.view.getContentDescription()) ? "" : this.view.getContentDescription());
        sb.append(":");
        sb.append(a(this.lastState));
        return sb.toString();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.beginTime;
        a.a(null, "tag", this.tag, "duration", Long.valueOf(currentTimeMillis));
        return currentTimeMillis > ((long) b.timeThreshold) && currentTimeMillis < ((long) b.maxTimeThreshold);
    }
}
