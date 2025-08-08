package com.taobao.android.weex_uikit.ui;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.MUSConstants;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int METHOD_ROTATE = 4;
    public static final int METHOD_ROTATE_X = 10;
    public static final int METHOD_ROTATE_Y = 11;
    public static final int METHOD_ROTATE_Z = 5;
    public static final int METHOD_SCALE = 6;
    public static final int METHOD_SCALE_X = 7;
    public static final int METHOD_SCALE_Y = 8;
    public static final int METHOD_SKEW = 9;
    public static final int METHOD_TRANSLATE = 0;
    public static final int METHOD_TRANSLATE_3D = 1;
    public static final int METHOD_TRANSLATE_X = 2;
    public static final int METHOD_TRANSLATE_Y = 3;

    static {
        kge.a(-593099667);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f16139a;
        public float[] b;

        static {
            kge.a(-21776168);
        }

        public a(int i, float[] fArr) {
            this.f16139a = i;
            this.b = fArr;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TransformProp{method=" + this.f16139a + ", args=" + Arrays.toString(this.b) + '}';
        }
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
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
                    c = '\t';
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\n';
                    break;
                }
                break;
            case 3532042:
                if (str.equals(MUSConstants.SKEW)) {
                    c = 11;
                    break;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    c = '\b';
                    break;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    c = 0;
                    break;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    c = 6;
                    break;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    c = 7;
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
                return 10;
            case 7:
                return 11;
            case '\b':
                return 6;
            case '\t':
                return 7;
            case '\n':
                return 8;
            case 11:
                return 9;
            default:
                throw new IllegalArgumentException("Invalid Transform method: " + str);
        }
    }

    public static List<a> a(String str, float f) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("34ec9ab9", new Object[]{str, new Float(f)});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length();
        float[] fArr = new float[3];
        Arrays.fill(fArr, Float.NaN);
        LinkedList linkedList = new LinkedList();
        float[] fArr2 = fArr;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == ' ') {
                i2++;
            } else if (!z2) {
                if (charAt == '(') {
                    i3 = a(str.substring(i2, i).trim());
                    i2 = i + 1;
                    z2 = true;
                }
            } else if (z2 != z) {
                continue;
            } else if (charAt == ',') {
                float a2 = a(str.substring(i2, i).trim(), i3, f);
                if (i4 >= 3) {
                    throw new IllegalArgumentException("Invalid Transform args, too many args: " + str);
                }
                fArr2[i4] = a2;
                i4++;
                i2 = i + 1;
            } else if (charAt == ')') {
                float a3 = a(str.substring(i2, i).trim(), i3, f);
                if (i4 >= 3) {
                    throw new IllegalArgumentException("Invalid Transform args, too many args: " + str);
                }
                fArr2[i4] = a3;
                linkedList.add(new a(i3, fArr2));
                float[] fArr3 = new float[3];
                Arrays.fill(fArr3, Float.NaN);
                fArr2 = fArr3;
                i2 = i + 1;
                z2 = false;
                i3 = -1;
                i4 = 0;
            } else {
                continue;
            }
            i++;
            z = true;
        }
        LinkedList linkedList2 = linkedList.isEmpty() ? null : linkedList;
        if (linkedList2 != null || StringUtils.isEmpty(str.trim())) {
            return linkedList2;
        }
        throw new IllegalArgumentException("Invalid Transform format: " + str);
    }

    private static float b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e563", new Object[]{str})).floatValue() : Float.parseFloat(str.substring(0, str.length() - 3));
    }

    private static float a(String str, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3525cbf", new Object[]{str, new Integer(i), new Float(f)})).floatValue();
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return com.taobao.android.weex_framework.util.i.a(str, f);
            case 4:
            case 5:
            case 10:
            case 11:
                if (!str.endsWith("deg")) {
                    throw new IllegalArgumentException("Invalid Transform deg arg: " + str);
                }
                return b(str);
            case 6:
            case 7:
            case 8:
                return Float.parseFloat(str);
            case 9:
                if (str.endsWith("deg")) {
                    return (float) (b(str) * 0.017453292519943295d);
                }
                if (str.endsWith("rad")) {
                    return b(str);
                }
                if (!str.endsWith(BindingXConstants.STATE_TURNING)) {
                    return 0.0f;
                }
                return (float) (Float.parseFloat(str.substring(0, str.length() - 4)) * 6.283185307179586d);
            default:
                throw new IllegalArgumentException("Invalid Transform method: " + i);
        }
    }
}
