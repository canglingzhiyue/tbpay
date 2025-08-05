package tb;

import android.graphics.Bitmap;
import com.alipay.ma.encode.InputParameters.Gen0InputParameters;
import com.alipay.ma.encode.InputParameters.Gen3InputParameters;
import com.alipay.ma.encode.InputParameters.LogoBWInputParameters;
import com.alipay.ma.encode.api.MaEncodeAPI;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.gateway.util.o;

/* loaded from: classes8.dex */
public class oyj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-773369918);
    }

    public static Bitmap a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("453b1c83", new Object[]{new Integer(i), str});
        }
        o.a("EncodeWrapper.encodeGen0:{size:" + i + ",text:" + str + riy.BLOCK_END_STR, new Object[0]);
        return MaEncodeAPI.encodeMa2(new Gen0InputParameters(i, str));
    }

    public static Bitmap a(String str, Bitmap bitmap, int i, char c, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b817388b", new Object[]{str, bitmap, new Integer(i), new Character(c), new Integer(i2)});
        }
        o.a("EncodeWrapper.encodeGen3:{_publicData:" + str + ",version:" + i2 + riy.BLOCK_END_STR, new Object[0]);
        return MaEncodeAPI.encodeMa2(new Gen3InputParameters(str, bitmap, i, c, i2));
    }

    public static Bitmap a(String str, int i, Bitmap bitmap, int i2, int i3, char c, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c1521021", new Object[]{str, new Integer(i), bitmap, new Integer(i2), new Integer(i3), new Character(c), new Integer(i4)});
        }
        o.a("EncodeWrapper.encodeLogo:{content:" + str + ",version:" + i4 + riy.BLOCK_END_STR, new Object[0]);
        return MaEncodeAPI.encodeMa2(new LogoBWInputParameters(str, -16777216, bitmap, i2, i3, c, i4));
    }
}
