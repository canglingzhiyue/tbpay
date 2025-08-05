package com.alibaba.ariver.app.api.ui.tabbar.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class TabBarColorModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_BACKGROUND_COLOR = -460551;
    @JSONField

    /* renamed from: a  reason: collision with root package name */
    private Integer f2895a;
    @JSONField
    private Integer b;
    @JSONField
    private long c = DEFAULT_BACKGROUND_COLOR;

    static {
        kge.a(1500428742);
    }

    public Integer getTextColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("5a1baf6e", new Object[]{this}) : this.f2895a;
    }

    public void setTextColor(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ec901c", new Object[]{this, num});
        } else {
            this.f2895a = num;
        }
    }

    public Integer getSelectedColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("6a111840", new Object[]{this}) : this.b;
    }

    public void setSelectedColor(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa86db8a", new Object[]{this, num});
        } else {
            this.b = num;
        }
    }

    public long getBackgroundColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7cbe59a", new Object[]{this})).longValue() : this.c;
    }

    public void setBackgroundColor(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0474ea", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TabBarColorModel{textColor=" + this.f2895a + ", selectedColor=" + this.b + ", backgroundColor=" + this.c + '}';
    }
}
