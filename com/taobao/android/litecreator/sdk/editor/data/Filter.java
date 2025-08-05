package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Objects;
import tb.kge;

/* loaded from: classes5.dex */
public class Filter extends EditableBean<Filter> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VI_VALUE_HIDE = 2;
    public static final int VI_VALUE_SHOW = 1;
    public static final int VI_VALUE_UNKOWN = 0;
    public String bizLine;
    public int filterId;
    public int level;
    public String localPath;
    public String name;
    public String resUrl;
    public String srcDirPath;
    public int version;
    public int visibilityValue = 0;

    static {
        kge.a(-1052004492);
    }

    public static /* synthetic */ Object ipc$super(Filter filter, String str, Object... objArr) {
        if (str.hashCode() == 1403628309) {
            return new Integer(super.hashCode());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public Filter() {
    }

    public Filter(int i, String str, int i2, String str2) {
        this.filterId = i;
        this.name = str;
        this.level = i2;
        this.bizLine = str2;
    }

    public Filter(int i, String str, int i2, String str2, String str3, String str4) {
        this.filterId = i;
        this.name = str;
        this.level = i2;
        this.bizLine = str2;
        this.localPath = str3;
        this.srcDirPath = str4;
    }

    public static Filter copy(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Filter) ipChange.ipc$dispatch("2e2c9a0e", new Object[]{filter});
        }
        if (filter == null) {
            return null;
        }
        return new Filter(filter.filterId, filter.name, filter.level, filter.bizLine, filter.localPath, filter.srcDirPath);
    }

    public boolean isVisibilityChange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a6d5937", new Object[]{this})).booleanValue() : this.visibilityValue != 0;
    }

    public void resetVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dc01c8", new Object[]{this});
        } else {
            this.visibilityValue = 0;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Filter{id='" + this.id + "', name='" + this.name + "', bizLine='" + this.bizLine + "', level=" + this.level + ", localPath=" + this.localPath + '}';
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Filter)) {
            return false;
        }
        Filter filter = (Filter) obj;
        return this.level == filter.level && this.filterId == filter.filterId && Objects.equals(this.name, filter.name);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(super.hashCode()), this.name, Integer.valueOf(this.level), Integer.valueOf(this.filterId));
    }
}
