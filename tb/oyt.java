package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaResult;

/* loaded from: classes8.dex */
public class oyt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1681089512);
    }

    public static MaResult[] a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaResult[]) ipChange.ipc$dispatch("bf0246d5", new Object[]{bitmap}) : oyi.a(bitmap, 36607, false);
    }
}
