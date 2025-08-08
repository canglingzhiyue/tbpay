package tb;

import android.support.v4.view.InputDeviceCompat;
import mtopsdk.common.util.StringUtils;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class dav {
    public static String a(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                bytes[0] = (byte) (bytes[0] ^ 69);
            } else {
                int i2 = i - 1;
                if (bytes[i] != bytes[i2]) {
                    bytes[i] = (byte) (bytes[i] ^ bytes[i2]);
                }
            }
        }
        int i3 = length - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            if (i4 == i3) {
                bytes[i4] = (byte) (bytes[i4] ^ 98);
            } else {
                int i5 = i4 + 1;
                if (bytes[i4] != bytes[i5]) {
                    bytes[i4] = (byte) (bytes[i4] ^ bytes[i5]);
                }
            }
        }
        String str2 = "";
        for (int i6 = 0; i6 < length; i6++) {
            str2 = str2 + Integer.toHexString((bytes[i6] & 255) | InputDeviceCompat.SOURCE_ANY).substring(6);
        }
        return str2;
    }

    public static String b(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer(str);
            ByteBuffer allocate = ByteBuffer.allocate(str.length() / 2);
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 1;
                i += 2;
                allocate.put((byte) (Integer.parseInt(stringBuffer.substring(i2, i), 16) | (Integer.parseInt(stringBuffer.substring(i, i2), 16) << 4)));
            }
            byte[] array = allocate.array();
            for (int i3 = 0; i3 < array.length; i3++) {
                if (i3 == array.length - 1) {
                    int length = array.length - 1;
                    array[length] = (byte) (array[length] ^ 98);
                } else {
                    int i4 = i3 + 1;
                    if (array[i3] != array[i4]) {
                        array[i3] = (byte) (array[i3] ^ array[i4]);
                    }
                }
            }
            for (int length2 = array.length - 1; length2 >= 0; length2--) {
                if (length2 == 0) {
                    array[0] = (byte) (array[0] ^ 69);
                } else {
                    int i5 = length2 - 1;
                    if (array[length2] != array[i5]) {
                        array[length2] = (byte) (array[length2] ^ array[i5]);
                    }
                }
            }
            return new String(array, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
