package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.media.frame.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class ocv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(909319697);
    }

    public static float a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938b", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return -0.319f;
        }
        if (i == 2) {
            return -0.3f;
        }
        if (i == 3) {
            return -0.306f;
        }
        return i != 8 ? -0.24f : -0.301f;
    }

    public static float b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2a", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return 0.105f;
        }
        if (i == 2) {
            return 0.096f;
        }
        if (i == 3) {
            return 0.116f;
        }
        return i != 8 ? 0.066f : 0.125f;
    }

    public static float c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44c9", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return 0.15f;
        }
        if (i == 3) {
            return 0.11f;
        }
        return i != 8 ? 0.186f : 0.13f;
    }

    public static float d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad401d68", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return 0.64f;
        }
        if (i == 3) {
            return 0.36f;
        }
        return i != 8 ? 0.8f : 0.48f;
    }

    public static float e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aef4f607", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 0) {
            return 0.343f;
        }
        if (i == 1) {
            return 0.332f;
        }
        if (i == 3) {
            return 0.327f;
        }
        return i != 8 ? 0.323f : 0.336f;
    }

    public static float f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0a9cea6", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return 0.275f;
        }
        if (i == 3) {
            return 0.155f;
        }
        return i != 8 ? 0.342f : 0.207f;
    }

    public static float g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b25ea745", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return 0.096f;
        }
        if (i == 3) {
            return 0.066f;
        }
        return i != 8 ? 0.12f : 0.085f;
    }

    public static float h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4137fe4", new Object[]{new Integer(i)})).floatValue();
        }
        if (i == 1) {
            return 0.46f;
        }
        if (i == 2) {
            return 0.45f;
        }
        if (i == 3) {
            return 0.453f;
        }
        return i != 8 ? 0.442f : 0.464f;
    }

    public static float a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20f12c95", new Object[]{new Integer(i), str})).floatValue();
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject != null) {
                return a(parseObject).get(Integer.valueOf(i)).floatValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i == 1) {
            return 0.257f;
        }
        return (i == 3 || i == 8) ? 0.193f : 0.321f;
    }

    private static Map<Integer, Float> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(0, Float.valueOf(Float.parseFloat(jSONObject.getString("9:16"))));
        hashMap.put(2, Float.valueOf(Float.parseFloat(jSONObject.getString(b.VALUE_THREE_FOUR_RATIO))));
        hashMap.put(1, Float.valueOf(Float.parseFloat(jSONObject.getString(emh.sDefaultDimension))));
        hashMap.put(8, Float.valueOf(Float.parseFloat(jSONObject.getString("4:3"))));
        hashMap.put(3, Float.valueOf(Float.parseFloat(jSONObject.getString(b.VALUE_SIXTEEN_NINE_RATIO))));
        return hashMap;
    }

    public static float[] b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("8164b5dd", new Object[]{new Integer(i), str});
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject != null) {
                return b(parseObject).get(Integer.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i == 1) {
            return new float[]{0.473f, 0.46f};
        }
        if (i == 2) {
            return new float[]{0.473f, 0.455f};
        }
        if (i == 3) {
            return new float[]{0.473f, 0.462f};
        }
        if (i != 8) {
            return new float[]{0.473f, 0.466f};
        }
        return new float[]{0.473f, 0.464f};
    }

    public static float[] c(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("59502de", new Object[]{new Integer(i), str});
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject != null) {
                return b(parseObject).get(Integer.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new float[]{0.5f, 0.5f};
    }

    private static Map<Integer, float[]> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("592eda1c", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(0, a(jSONObject.getString("9:16")));
        hashMap.put(2, a(jSONObject.getString(b.VALUE_THREE_FOUR_RATIO)));
        hashMap.put(1, a(jSONObject.getString(emh.sDefaultDimension)));
        hashMap.put(8, a(jSONObject.getString("4:3")));
        hashMap.put(3, a(jSONObject.getString(b.VALUE_SIXTEEN_NINE_RATIO)));
        return hashMap;
    }

    private static float[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("81233aef", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf(40);
        String[] split = str.substring(lastIndexOf + 1, str.indexOf(41, lastIndexOf)).split(",");
        return new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1])};
    }
}
