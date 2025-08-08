package com.taobao.weex.ui.animation;

import android.animation.PropertyValuesHolder;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.Constants;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class WXAnimationBean {
    public static final String CUBIC_BEZIER = "cubic-bezier";
    public static final String EASE_IN = "ease-in";
    public static final String EASE_IN_OUT = "ease-in-out";
    public static final String EASE_OUT = "ease-out";
    public static final String LINEAR = "linear";
    public static final int NUM_CUBIC_PARAM = 4;
    public long delay;
    public long duration;
    public boolean needLayout;
    public Style styles;
    public String timingFunction;

    static {
        kge.a(-1855182040);
    }

    /* loaded from: classes9.dex */
    public static class Style {
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
        public static final String WX_SCALE = "scale";
        public static final String WX_SCALE_X = "scaleX";
        public static final String WX_SCALE_Y = "scaleY";
        public static final String WX_TRANSLATE = "translate";
        public static final String WX_TRANSLATE_X = "translateX";
        public static final String WX_TRANSLATE_Y = "translateY";
        private static final String ZERO = "0%";
        private static Map<Property<View, Float>, Float> defaultMap;
        public static Map<String, List<Property<View, Float>>> wxToAndroidMap;
        public String backgroundColor;
        public String height;
        public String opacity;
        private Pair<Float, Float> pivot;
        public String transform;
        public String transformOrigin;
        public String width;
        private Map<Property<View, Float>, Float> transformMap = new LinkedHashMap();
        private List<PropertyValuesHolder> holders = new LinkedList();
        private float cameraDistance = Float.MAX_VALUE;

        static {
            kge.a(42979605);
            wxToAndroidMap = new ArrayMap();
            defaultMap = new ArrayMap();
            wxToAndroidMap.put("translate", Arrays.asList(View.TRANSLATION_X, View.TRANSLATION_Y));
            wxToAndroidMap.put("translateX", Collections.singletonList(View.TRANSLATION_X));
            wxToAndroidMap.put("translateY", Collections.singletonList(View.TRANSLATION_Y));
            wxToAndroidMap.put("rotate", Collections.singletonList(View.ROTATION));
            wxToAndroidMap.put("rotateX", Collections.singletonList(View.ROTATION_X));
            wxToAndroidMap.put("rotateY", Collections.singletonList(View.ROTATION_Y));
            wxToAndroidMap.put("scale", Arrays.asList(View.SCALE_X, View.SCALE_Y));
            wxToAndroidMap.put("scaleX", Collections.singletonList(View.SCALE_X));
            wxToAndroidMap.put("scaleY", Collections.singletonList(View.SCALE_Y));
            wxToAndroidMap.put(Constants.Name.PERSPECTIVE, Collections.singletonList(CameraDistanceProperty.getInstance()));
            wxToAndroidMap = Collections.unmodifiableMap(wxToAndroidMap);
            Map<Property<View, Float>, Float> map = defaultMap;
            Property<View, Float> property = View.TRANSLATION_X;
            Float valueOf = Float.valueOf(0.0f);
            map.put(property, valueOf);
            defaultMap.put(View.TRANSLATION_Y, valueOf);
            Map<Property<View, Float>, Float> map2 = defaultMap;
            Property<View, Float> property2 = View.SCALE_X;
            Float valueOf2 = Float.valueOf(1.0f);
            map2.put(property2, valueOf2);
            defaultMap.put(View.SCALE_Y, valueOf2);
            defaultMap.put(View.ROTATION, valueOf);
            defaultMap.put(View.ROTATION_X, valueOf);
            defaultMap.put(View.ROTATION_Y, valueOf);
        }

        private static Pair<Float, Float> parsePivot(WXSDKInstance wXSDKInstance, String str, int i, int i2, int i3) {
            int indexOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("6ab942cb", new Object[]{wXSDKInstance, str, new Integer(i), new Integer(i2), new Integer(i3)});
            }
            if (StringUtils.isEmpty(str) || (indexOf = str.indexOf(32)) == -1) {
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

        private void resetToDefaultIfAbsent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbd3c094", new Object[]{this});
                return;
            }
            for (Map.Entry<Property<View, Float>, Float> entry : defaultMap.entrySet()) {
                if (!this.transformMap.containsKey(entry.getKey())) {
                    this.transformMap.put(entry.getKey(), entry.getValue());
                }
            }
        }

        public Pair<Float, Float> getPivot() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("ee1bc49d", new Object[]{this}) : this.pivot;
        }

        public void init(String str, String str2, int i, int i2, int i3, WXSDKInstance wXSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74f72356", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Integer(i3), wXSDKInstance});
                return;
            }
            this.pivot = parsePivot(wXSDKInstance, str, i, i2, i3);
            this.transformMap.putAll(TransformParser.parseTransForm(wXSDKInstance, str2, i, i2, i3));
            resetToDefaultIfAbsent();
            if (this.transformMap.containsKey(CameraDistanceProperty.getInstance())) {
                this.cameraDistance = this.transformMap.remove(CameraDistanceProperty.getInstance()).floatValue();
            }
            initHolders();
        }

        public void init(Map<Property<View, Float>, Pair<Float, Float>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1cfb90e", new Object[]{this, map});
                return;
            }
            for (Map.Entry<Property<View, Float>, Pair<Float, Float>> entry : map.entrySet()) {
                this.holders.add(PropertyValuesHolder.ofFloat(entry.getKey(), ((Float) entry.getValue().first).floatValue(), ((Float) entry.getValue().second).floatValue()));
            }
        }

        private void initHolders() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd4e6a1e", new Object[]{this});
                return;
            }
            for (Map.Entry<Property<View, Float>, Float> entry : this.transformMap.entrySet()) {
                this.holders.add(PropertyValuesHolder.ofFloat(entry.getKey(), entry.getValue().floatValue()));
            }
            if (StringUtils.isEmpty(this.opacity)) {
                return;
            }
            this.holders.add(PropertyValuesHolder.ofFloat(View.ALPHA, WXUtils.fastGetFloat(this.opacity, 3)));
        }

        public List<PropertyValuesHolder> getHolders() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1728672f", new Object[]{this}) : this.holders;
        }

        public float getCameraDistance() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea0af7a7", new Object[]{this})).floatValue() : this.cameraDistance;
        }
    }
}
