package org.webrtc;

import com.alipay.mobile.security.faceauth.api.AntDetector;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class Size {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int height;
    public int width;

    static {
        kge.a(721243064);
    }

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.width + "x" + this.height;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (this.width * AntDetector.ACTION_ID_LOGIN) + 1 + this.height;
    }
}
