package com.taobao.weex.ui.animation;

import android.animation.PropertyValuesHolder;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.utils.FunctionParser;
import com.taobao.weex.utils.WXDataStructureUtil;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class TransformParser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BACKGROUND_COLOR = "backgroundColor";
    public static final String BOTTOM = "bottom";
    public static final String CENTER = "center";
    private static final String DEG = "deg";
    private static final String FULL = "100%";
    private static final String HALF = "50%";
    public static final String HEIGHT = "height";
    public static final String LEFT = "left";
    private static final String PX = "px";
    public static final String RIGHT = "right";
    public static final String TOP = "top";
    public static final String WIDTH = "width";
    public static final String WX_ROTATE = "rotate";
    public static final String WX_ROTATE_X = "rotateX";
    public static final String WX_ROTATE_Y = "rotateY";
    public static final String WX_ROTATE_Z = "rotateZ";
    public static final String WX_SCALE = "scale";
    public static final String WX_SCALE_X = "scaleX";
    public static final String WX_SCALE_Y = "scaleY";
    public static final String WX_TRANSLATE = "translate";
    public static final String WX_TRANSLATE_X = "translateX";
    public static final String WX_TRANSLATE_Y = "translateY";
    private static final String ZERO = "0%";
    public static Map<String, List<Property<View, Float>>> wxToAndroidMap;

    public static /* synthetic */ float access$000(WXSDKInstance wXSDKInstance, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("be13e1b1", new Object[]{wXSDKInstance, str, new Integer(i), new Integer(i2)})).floatValue() : parsePercentOrPx(wXSDKInstance, str, i, i2);
    }

    static {
        kge.a(1371232704);
        ArrayMap arrayMap = new ArrayMap();
        wxToAndroidMap = arrayMap;
        arrayMap.put("translate", Arrays.asList(View.TRANSLATION_X, View.TRANSLATION_Y));
        wxToAndroidMap.put("translateX", Collections.singletonList(View.TRANSLATION_X));
        wxToAndroidMap.put("translateY", Collections.singletonList(View.TRANSLATION_Y));
        wxToAndroidMap.put("rotate", Collections.singletonList(View.ROTATION));
        wxToAndroidMap.put("rotateZ", Collections.singletonList(View.ROTATION));
        wxToAndroidMap.put("rotateX", Collections.singletonList(View.ROTATION_X));
        wxToAndroidMap.put("rotateY", Collections.singletonList(View.ROTATION_Y));
        wxToAndroidMap.put("scale", Arrays.asList(View.SCALE_X, View.SCALE_Y));
        wxToAndroidMap.put("scaleX", Collections.singletonList(View.SCALE_X));
        wxToAndroidMap.put("scaleY", Collections.singletonList(View.SCALE_Y));
        wxToAndroidMap.put(Constants.Name.PERSPECTIVE, Collections.singletonList(CameraDistanceProperty.getInstance()));
        wxToAndroidMap = Collections.unmodifiableMap(wxToAndroidMap);
    }

    public static PropertyValuesHolder[] toHolders(Map<Property<View, Float>, Float> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PropertyValuesHolder[]) ipChange.ipc$dispatch("40de0f38", new Object[]{map});
        }
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[map.size()];
        int i = 0;
        for (Map.Entry<Property<View, Float>, Float> entry : map.entrySet()) {
            propertyValuesHolderArr[i] = PropertyValuesHolder.ofFloat(entry.getKey(), entry.getValue().floatValue());
            i++;
        }
        return propertyValuesHolderArr;
    }

    public static Map<Property<View, Float>, Float> parseTransForm(final WXSDKInstance wXSDKInstance, String str, final int i, final int i2, final int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("55190080", new Object[]{wXSDKInstance, str, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return new FunctionParser(str, new FunctionParser.Mapper<Property<View, Float>, Float>() { // from class: com.taobao.weex.ui.animation.TransformParser.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.weex.utils.FunctionParser.Mapper
                    public Map<Property<View, Float>, Float> map(String str2, List<String> list) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Map) ipChange2.ipc$dispatch("7f9ebb93", new Object[]{this, str2, list});
                        }
                        if (list != null && !list.isEmpty() && TransformParser.wxToAndroidMap.containsKey(str2)) {
                            return convertParam(i, i2, i3, TransformParser.wxToAndroidMap.get(str2), list);
                        }
                        return new HashMap();
                    }

                    private Map<Property<View, Float>, Float> convertParam(int i4, int i5, int i6, List<Property<View, Float>> list, List<String> list2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Map) ipChange2.ipc$dispatch("e01b0ff9", new Object[]{this, new Integer(i4), new Integer(i5), new Integer(i6), list, list2});
                        }
                        HashMap newHashMapWithExpectedSize = WXDataStructureUtil.newHashMapWithExpectedSize(list.size());
                        ArrayList arrayList = new ArrayList(list.size());
                        if (list.contains(View.ROTATION) || list.contains(View.ROTATION_X) || list.contains(View.ROTATION_Y)) {
                            arrayList.addAll(parseRotationZ(list2));
                        } else if (list.contains(View.TRANSLATION_X) || list.contains(View.TRANSLATION_Y)) {
                            arrayList.addAll(parseTranslation(list, i4, i5, list2, i6));
                        } else if (list.contains(View.SCALE_X) || list.contains(View.SCALE_Y)) {
                            arrayList.addAll(parseScale(list.size(), list2));
                        } else if (list.contains(CameraDistanceProperty.getInstance())) {
                            arrayList.add(parseCameraDistance(list2));
                        }
                        if (list.size() == arrayList.size()) {
                            for (int i7 = 0; i7 < list.size(); i7++) {
                                newHashMapWithExpectedSize.put(list.get(i7), arrayList.get(i7));
                            }
                        }
                        return newHashMapWithExpectedSize;
                    }

                    private List<Float> parseScale(int i4, List<String> list) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (List) ipChange2.ipc$dispatch("b84cd131", new Object[]{this, new Integer(i4), list});
                        }
                        ArrayList arrayList = new ArrayList(list.size() << 1);
                        ArrayList arrayList2 = new ArrayList(list.size());
                        for (String str2 : list) {
                            arrayList2.add(Float.valueOf(WXUtils.fastGetFloat(str2)));
                        }
                        arrayList.addAll(arrayList2);
                        if (i4 != 1 && list.size() == 1) {
                            arrayList.addAll(arrayList2);
                        }
                        return arrayList;
                    }

                    private List<Float> parseRotationZ(List<String> list) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (List) ipChange2.ipc$dispatch("e770b806", new Object[]{this, list});
                        }
                        ArrayList arrayList = new ArrayList(1);
                        for (String str2 : list) {
                            int lastIndexOf = str2.lastIndexOf(TransformParser.DEG);
                            if (lastIndexOf != -1) {
                                arrayList.add(Float.valueOf(WXUtils.fastGetFloat(str2.substring(0, lastIndexOf))));
                            } else {
                                arrayList.add(Float.valueOf((float) Math.toDegrees(WXUtils.fastGetFloat(str2))));
                            }
                        }
                        return arrayList;
                    }

                    private List<Float> parseTranslation(List<Property<View, Float>> list, int i4, int i5, List<String> list2, int i6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (List) ipChange2.ipc$dispatch("d1b5012b", new Object[]{this, list, new Integer(i4), new Integer(i5), list2, new Integer(i6)});
                        }
                        ArrayList arrayList = new ArrayList(2);
                        String str2 = list2.get(0);
                        if (list.size() == 1) {
                            parseSingleTranslation(list, i4, i5, arrayList, str2, i6);
                        } else {
                            parseDoubleTranslation(wXSDKInstance, i4, i5, list2, arrayList, str2, i6);
                        }
                        return arrayList;
                    }

                    private void parseSingleTranslation(List<Property<View, Float>> list, int i4, int i5, List<Float> list2, String str2, int i6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9e462afa", new Object[]{this, list, new Integer(i4), new Integer(i5), list2, str2, new Integer(i6)});
                        } else if (list.contains(View.TRANSLATION_X)) {
                            list2.add(Float.valueOf(TransformParser.access$000(wXSDKInstance, str2, i4, i6)));
                        } else if (!list.contains(View.TRANSLATION_Y)) {
                        } else {
                            list2.add(Float.valueOf(TransformParser.access$000(wXSDKInstance, str2, i5, i6)));
                        }
                    }

                    private void parseDoubleTranslation(WXSDKInstance wXSDKInstance2, int i4, int i5, List<String> list, List<Float> list2, String str2, int i6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c3c0c57d", new Object[]{this, wXSDKInstance2, new Integer(i4), new Integer(i5), list, list2, str2, new Integer(i6)});
                            return;
                        }
                        String str3 = list.size() == 1 ? str2 : list.get(1);
                        list2.add(Float.valueOf(TransformParser.access$000(wXSDKInstance2, str2, i4, i6)));
                        list2.add(Float.valueOf(TransformParser.access$000(wXSDKInstance2, str3, i5, i6)));
                    }

                    private Float parseCameraDistance(List<String> list) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Float) ipChange2.ipc$dispatch("2000b50e", new Object[]{this, list});
                        }
                        float f = Float.MAX_VALUE;
                        if (list.size() == 1) {
                            float realPxByWidth = WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, WXUtils.getFloat(list.get(0)), i3);
                            float f2 = WXEnvironment.getApplication().getResources().getDisplayMetrics().density;
                            if (!Float.isNaN(realPxByWidth) && realPxByWidth > 0.0f) {
                                f = realPxByWidth * f2;
                            }
                        }
                        return Float.valueOf(f);
                    }
                }).parse();
            }
        } catch (Exception e) {
            WXLogUtils.e("TransformParser", e);
            String N = wXSDKInstance.N();
            WXErrorCode wXErrorCode = WXErrorCode.WX_RENDER_ERR_TRANSITION;
            WXExceptionUtils.commitCriticalExceptionRT(N, wXErrorCode, "parse animation transition", WXErrorCode.WX_RENDER_ERR_TRANSITION.getErrorMsg() + "parse transition error: " + e.getMessage(), null);
        }
        return new LinkedHashMap();
    }

    private static Pair<Float, Float> parsePivot(WXSDKInstance wXSDKInstance, String str, int i, int i2, int i3) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("6ab942cb", new Object[]{wXSDKInstance, str, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf(32)) == -1) {
            return null;
        }
        int i4 = indexOf;
        while (i4 < str.length() && str.charAt(i4) == ' ') {
            i4++;
        }
        if (i4 >= str.length() || str.charAt(i4) == ' ') {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(str.substring(0, indexOf).trim());
        arrayList.add(str.substring(i4, str.length()).trim());
        return parsePivot(wXSDKInstance, arrayList, i, i2, i3);
    }

    private static Pair<Float, Float> parsePivot(WXSDKInstance wXSDKInstance, List<String> list, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("3f8c1804", new Object[]{wXSDKInstance, list, new Integer(i), new Integer(i2), new Integer(i3)}) : new Pair<>(Float.valueOf(parsePivotX(wXSDKInstance, list.get(0), i, i3)), Float.valueOf(parsePivotY(wXSDKInstance, list.get(1), i2, i3)));
    }

    private static float parsePivotX(WXSDKInstance wXSDKInstance, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dafa798", new Object[]{wXSDKInstance, str, new Integer(i), new Integer(i2)})).floatValue();
        }
        if ("left".equals(str)) {
            str = ZERO;
        } else if ("right".equals(str)) {
            str = FULL;
        } else if ("center".equals(str)) {
            str = HALF;
        }
        return parsePercentOrPx(wXSDKInstance, str, i, i2);
    }

    private static float parsePivotY(WXSDKInstance wXSDKInstance, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ee5fa77", new Object[]{wXSDKInstance, str, new Integer(i), new Integer(i2)})).floatValue();
        }
        if ("top".equals(str)) {
            str = ZERO;
        } else if ("bottom".equals(str)) {
            str = FULL;
        } else if ("center".equals(str)) {
            str = HALF;
        }
        return parsePercentOrPx(wXSDKInstance, str, i, i2);
    }

    private static float parsePercentOrPx(WXSDKInstance wXSDKInstance, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79f81984", new Object[]{wXSDKInstance, str, new Integer(i), new Integer(i2)})).floatValue();
        }
        int lastIndexOf = str.lastIndexOf(37);
        if (lastIndexOf != -1) {
            return parsePercent(str.substring(0, lastIndexOf), i, 1);
        }
        int lastIndexOf2 = str.lastIndexOf(PX);
        if (lastIndexOf2 != -1) {
            return WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, WXUtils.fastGetFloat(str.substring(0, lastIndexOf2), 1), i2);
        }
        return WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, WXUtils.fastGetFloat(str, 1), i2);
    }

    private static float parsePercent(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7d6ea6b3", new Object[]{str, new Integer(i), new Integer(i2)})).floatValue() : (WXUtils.fastGetFloat(str, i2) / 100.0f) * i;
    }
}
