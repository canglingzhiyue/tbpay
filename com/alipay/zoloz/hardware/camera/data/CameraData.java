package com.alipay.zoloz.hardware.camera.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class CameraData {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FRAME_TYPE_COLOR = 1;
    public static final int FRAME_TYPE_DEPTH = 2;
    public static final int FRAME_TYPE_INVALID = 0;
    public static final int FRAME_TYPE_SLIR = 4;
    public static final int MODE_BGR = 2;
    public static final int MODE_BGRA = 1;
    public static final int MODE_DEPTH_100UM = 51;
    public static final int MODE_DEPTH_1_MM = 50;
    public static final int MODE_GRAY_16 = 6;
    public static final int MODE_GRAY_8 = 5;
    public static final int MODE_IR_GRAY_16 = 6;
    public static final int MODE_IR_GRAY_8 = 5;
    public static final int MODE_NV21 = 0;
    public static final int MODE_RGB = 4;
    public static final int MODE_RGBA = 3;
    public ByteBuffer data;
    public long timestamp;

    public static String convert(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("515c1e37", new Object[]{new Integer(i)});
        }
        if (i == 50) {
            return "DEPTH_1_MM";
        }
        if (i == 51) {
            return "DEPTH_100UM";
        }
        switch (i) {
            case 0:
                return "NV21";
            case 1:
                return "BGRA";
            case 2:
                return "BGR";
            case 3:
                return "RGBA";
            case 4:
                return "RGB";
            case 5:
                return "IR_GRAY_8";
            case 6:
                return "IR_GRAY_16";
            default:
                return "UNKNOWN";
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CameraData{data=[");
        ByteBuffer byteBuffer = this.data;
        sb.append(byteBuffer == null ? "null" : Integer.valueOf(byteBuffer.remaining()));
        sb.append("], timestamp=");
        sb.append(this.timestamp);
        sb.append('}');
        return sb.toString();
    }
}
