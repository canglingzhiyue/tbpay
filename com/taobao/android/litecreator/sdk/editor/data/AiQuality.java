package com.taobao.android.litecreator.sdk.editor.data;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Objects;
import tb.kge;

/* loaded from: classes5.dex */
public class AiQuality extends EditableBean<AiQuality> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long QUALITY_FLAG = 1;
    public static final String QUALITY_KEY = "beauty";
    public String dirPath;
    public boolean enable = true;
    public boolean isUserSelect;

    static {
        kge.a(-1905026501);
    }

    public static /* synthetic */ Object ipc$super(AiQuality aiQuality, String str, Object... objArr) {
        if (str.hashCode() == 1403628309) {
            return new Integer(super.hashCode());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AiQuality{id='" + this.id + "', enable='" + this.enable + "', localPath=" + this.dirPath + '}';
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
        if (!(obj instanceof AiQuality)) {
            return false;
        }
        AiQuality aiQuality = (AiQuality) obj;
        return StringUtils.equals(this.dirPath, aiQuality.dirPath) && this.enable == aiQuality.enable;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(super.hashCode()), this.dirPath, Boolean.valueOf(this.enable));
    }
}
