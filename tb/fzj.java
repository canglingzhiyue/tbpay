package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.MUSConstants;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes5.dex */
public class fzj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int METHOD_ROTATE = 4;
    public static final int METHOD_ROTATE_Z = 5;
    public static final int METHOD_SCALE = 6;
    public static final int METHOD_SCALE_X = 7;
    public static final int METHOD_SCALE_Y = 8;
    public static final int METHOD_TRANSLATE = 0;
    public static final int METHOD_TRANSLATE_3D = 1;
    public static final int METHOD_TRANSLATE_X = 2;
    public static final int METHOD_TRANSLATE_Y = 3;

    static {
        kge.a(665852957);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f28233a;
        public float[] b;

        static {
            kge.a(-1381852024);
        }

        public a(int i, float[] fArr) {
            this.f28233a = i;
            this.b = fArr;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TransformProp{method=" + this.f28233a + ", args=" + Arrays.toString(this.b) + '}';
        }
    }

    private static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (str == null) {
            throw new IllegalArgumentException("Invalid Transform method: " + str);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1840653217:
                if (str.equals(MUSConstants.TRANSLATE_3D)) {
                    c = 1;
                    break;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    c = 2;
                    break;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    c = 3;
                    break;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    c = 4;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\b';
                    break;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    c = 6;
                    break;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    c = 0;
                    break;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case '\b':
                return 8;
            default:
                throw new IllegalArgumentException("Invalid Transform method: " + str);
        }
    }

    public static List<a> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        float[] fArr = new float[3];
        Arrays.fill(fArr, Float.NaN);
        LinkedList linkedList = new LinkedList();
        float[] fArr2 = fArr;
        boolean z = false;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == ' ') {
                i++;
            } else if (!z) {
                if (charAt == '(') {
                    i2 = b(str.substring(i, i4).trim());
                    i = i4 + 1;
                    z = true;
                }
            } else if (!z) {
                continue;
            } else if (charAt == ',') {
                float a2 = a(str.substring(i, i4).trim(), i2, i3);
                if (i3 >= 3) {
                    throw new IllegalArgumentException("Invalid Transform args, too many args: " + str);
                }
                fArr2[i3] = a2;
                i3++;
                i = i4 + 1;
            } else if (charAt == ')') {
                float a3 = a(str.substring(i, i4).trim(), i2, i3);
                if (i3 >= 3) {
                    throw new IllegalArgumentException("Invalid Transform args, too many args: " + str);
                }
                fArr2[i3] = a3;
                linkedList.add(new a(i2, fArr2));
                float[] fArr3 = new float[3];
                Arrays.fill(fArr3, Float.NaN);
                fArr2 = fArr3;
                i = i4 + 1;
                z = false;
                i2 = -1;
                i3 = 0;
            } else {
                continue;
            }
        }
        LinkedList linkedList2 = linkedList.isEmpty() ? null : linkedList;
        if (linkedList2 != null || TextUtils.isEmpty(str.trim())) {
            return linkedList2;
        }
        throw new IllegalArgumentException("Invalid Transform format: " + str);
    }

    private static float a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3526802", new Object[]{str, new Integer(i), new Integer(i2)})).floatValue();
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return Float.parseFloat(str);
            case 4:
            case 5:
                if (!str.endsWith("deg")) {
                    throw new IllegalArgumentException("Invalid Transform deg arg: " + str);
                }
                return Float.parseFloat(str.substring(0, str.length() - 3));
            case 6:
            case 7:
            case 8:
                return Float.parseFloat(str);
            default:
                throw new IllegalArgumentException("Invalid Transform method: " + i);
        }
    }
}
