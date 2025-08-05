package com.taobao.weex.dom;

import android.support.v4.util.ArrayMap;
import android.text.Layout;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.Constants;
import com.taobao.weex.dom.binding.ELUtils;
import com.taobao.weex.ui.component.WXTextDecoration;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class WXStyle implements Cloneable, Map<String, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TEXT_DEFAULT_SIZE = 32;
    public static final int UNSET = -1;
    private static final long serialVersionUID = 611132641365274134L;
    private ArrayMap<String, Object> mBindingStyle;
    private Map<String, Object> mPesudoResetStyleMap;
    private Map<String, Map<String, Object>> mPesudoStyleMap;
    private Map<String, Object> mStyles;

    static {
        kge.a(-1248119128);
        kge.a(1104193276);
        kge.a(-723128125);
    }

    public WXStyle() {
        this.mStyles = new ConcurrentHashMap();
    }

    public WXStyle(Map<String, Object> map) {
        this();
        putAll(map);
        processPesudoClasses(this.mStyles);
    }

    public WXStyle(Map<String, Object> map, boolean z) {
        this();
        putAll(map, z);
    }

    public String getBlur() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("442eb23c", new Object[]{this});
        }
        if (get("filter") != null) {
            return get("filter").toString().trim();
        }
        return null;
    }

    public static WXTextDecoration getTextDecoration(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXTextDecoration) ipChange.ipc$dispatch("4d5fdcec", new Object[]{map});
        }
        if (map == null || (obj = map.get("textDecoration")) == null) {
            return WXTextDecoration.NONE;
        }
        String obj2 = obj.toString();
        char c = 65535;
        int hashCode = obj2.hashCode();
        if (hashCode != -1171789332) {
            if (hashCode != -1026963764) {
                if (hashCode == 3387192 && obj2.equals("none")) {
                    c = 2;
                }
            } else if (obj2.equals("underline")) {
                c = 0;
            }
        } else if (obj2.equals("line-through")) {
            c = 1;
        }
        if (c == 0) {
            return WXTextDecoration.UNDERLINE;
        }
        if (c == 1) {
            return WXTextDecoration.LINETHROUGH;
        }
        if (c == 2) {
            return WXTextDecoration.NONE;
        }
        return WXTextDecoration.INVALID;
    }

    public static String getTextColor(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fb5c7bc2", new Object[]{map}) : (map == null || (obj = map.get("color")) == null) ? "" : obj.toString();
    }

    public static int getFontWeight(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17de3554", new Object[]{map})).intValue();
        }
        if (map == null || (obj = map.get("fontWeight")) == null) {
            return 0;
        }
        String obj2 = obj.toString();
        char c = 65535;
        switch (obj2.hashCode()) {
            case 53430:
                if (obj2.equals("600")) {
                    c = 0;
                    break;
                }
                break;
            case 54391:
                if (obj2.equals("700")) {
                    c = 1;
                    break;
                }
                break;
            case 55352:
                if (obj2.equals("800")) {
                    c = 2;
                    break;
                }
                break;
            case 56313:
                if (obj2.equals("900")) {
                    c = 3;
                    break;
                }
                break;
            case 3029637:
                if (obj2.equals("bold")) {
                    c = 4;
                    break;
                }
                break;
        }
        return (c == 0 || c == 1 || c == 2 || c == 3 || c == 4) ? 1 : 0;
    }

    public static int getFontStyle(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc0faca5", new Object[]{map})).intValue() : (map == null || (obj = map.get("fontStyle")) == null || !obj.toString().equals("italic")) ? 0 : 2;
    }

    public static int getFontSize(WXSDKInstance wXSDKInstance, Map<String, Object> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2c53272", new Object[]{wXSDKInstance, map, new Integer(i)})).intValue();
        }
        if (map == null) {
            return (int) WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, 32.0f, i);
        }
        int i2 = WXUtils.getInt(map.get("fontSize"));
        if (i2 <= 0) {
            i2 = 32;
        }
        return (int) WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, i2, i);
    }

    public static String getFontFamily(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe05204b", new Object[]{map});
        }
        if (map != null && (obj = map.get("fontFamily")) != null) {
            return obj.toString();
        }
        return null;
    }

    public static Layout.Alignment getTextAlignment(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Layout.Alignment) ipChange.ipc$dispatch("9a912944", new Object[]{map}) : getTextAlignment(map, false);
    }

    public static Layout.Alignment getTextAlignment(Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout.Alignment) ipChange.ipc$dispatch("1564ac9c", new Object[]{map, new Boolean(z)});
        }
        Layout.Alignment alignment = z ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        String str = (String) map.get("textAlign");
        if (TextUtils.equals("left", str)) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (TextUtils.equals("center", str)) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return TextUtils.equals("right", str) ? Layout.Alignment.ALIGN_OPPOSITE : alignment;
    }

    public static TextUtils.TruncateAt getTextOverflow(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextUtils.TruncateAt) ipChange.ipc$dispatch("78d12f6f", new Object[]{map});
        }
        if (!TextUtils.equals("ellipsis", (String) map.get("textOverflow"))) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    public static int getLines(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("587ee428", new Object[]{map})).intValue() : WXUtils.getInt(map.get("lines"));
    }

    public static int getLineHeight(WXSDKInstance wXSDKInstance, Map<String, Object> map, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4287fcc7", new Object[]{wXSDKInstance, map, new Integer(i)})).intValue();
        }
        if (map == null || (i2 = WXUtils.getInt(map.get("lineHeight"))) <= 0) {
            return -1;
        }
        return (int) WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, i2, i);
    }

    public float getBorderRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("909bc8cb", new Object[]{this})).floatValue();
        }
        float f = WXUtils.getFloat(get("borderRadius"));
        if (!WXUtils.isUndefined(f)) {
            return f;
        }
        return Float.NaN;
    }

    public String getBorderColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("925d3838", new Object[]{this});
        }
        Object obj = get("borderColor");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public String getBorderStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d98e6aa", new Object[]{this});
        }
        Object obj = get("borderStyle");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public boolean isSticky() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b2496be", new Object[]{this})).booleanValue();
        }
        Object obj = get("position");
        if (obj != null) {
            return obj.toString().equals("sticky");
        }
        return false;
    }

    public boolean isFixed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72b8d3f5", new Object[]{this})).booleanValue();
        }
        Object obj = get("position");
        if (obj != null) {
            return obj.toString().equals("fixed");
        }
        return false;
    }

    public float getLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350674", new Object[]{this})).floatValue();
        }
        float f = WXUtils.getFloat(get("left"));
        if (!WXUtils.isUndefined(f)) {
            return f;
        }
        return Float.NaN;
    }

    public float getRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449dd", new Object[]{this})).floatValue();
        }
        float f = WXUtils.getFloat(get("right"));
        if (!WXUtils.isUndefined(f)) {
            return f;
        }
        return Float.NaN;
    }

    public float getTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c9cf16", new Object[]{this})).floatValue();
        }
        float f = WXUtils.getFloat(get("top"));
        if (!WXUtils.isUndefined(f)) {
            return f;
        }
        return Float.NaN;
    }

    public float getBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e4c918", new Object[]{this})).floatValue();
        }
        float f = WXUtils.getFloat(get("bottom"));
        if (!WXUtils.isUndefined(f)) {
            return f;
        }
        return Float.NaN;
    }

    public String getBackgroundColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66ad4fba", new Object[]{this});
        }
        Object obj = get("backgroundColor");
        return obj == null ? "" : obj.toString();
    }

    public int getTimeFontSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a1704d", new Object[]{this})).intValue();
        }
        int i = WXUtils.getInt(get("timeFontSize"));
        if (i > 0) {
            return i;
        }
        return 32;
    }

    public float getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cc", new Object[]{this})).floatValue();
        }
        Object obj = get("opacity");
        if (obj != null) {
            return WXUtils.getFloat(obj);
        }
        return 1.0f;
    }

    public String getOverflow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f01f5881", new Object[]{this});
        }
        Object obj = get("overflow");
        return obj == null ? "visible" : obj.toString();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : this.mStyles.equals(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.mStyles.hashCode();
    }

    @Override // java.util.Map
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mStyles.clear();
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue() : this.mStyles.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, obj})).booleanValue() : this.mStyles.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("b3acf2c6", new Object[]{this}) : this.mStyles.entrySet();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj}) : this.mStyles.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue() : this.mStyles.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this}) : this.mStyles.keySet();
    }

    @Override // java.util.Map
    public Object put(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fd14d676", new Object[]{this, str, obj});
        }
        if (!addBindingStyleIfStatement(str, obj) && str != null && obj != null) {
            return this.mStyles.put(str, obj);
        }
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6703aacc", new Object[]{this, map});
            return;
        }
        for (Map.Entry<? extends String, ? extends Object> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.mStyles.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void putAll(Map<? extends String, ?> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79726188", new Object[]{this, map, new Boolean(z)});
            return;
        }
        putAll(map);
        if (z) {
            return;
        }
        processPesudoClasses(map);
    }

    public void updateStyle(Map<? extends String, ?> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6fa4de", new Object[]{this, map, new Boolean(z)});
            return;
        }
        parseBindingStylesStatements(map);
        putAll(map, z);
    }

    public Map<String, Object> getPesudoResetStyles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("62db8d55", new Object[]{this});
        }
        if (this.mPesudoResetStyleMap == null) {
            this.mPesudoResetStyleMap = new ArrayMap();
        }
        return this.mPesudoResetStyleMap;
    }

    public Map<String, Map<String, Object>> getPesudoStyles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7434d7d6", new Object[]{this});
        }
        if (this.mPesudoStyleMap == null) {
            this.mPesudoStyleMap = new ArrayMap();
        }
        return this.mPesudoStyleMap;
    }

    public <T extends String, V> void processPesudoClasses(Map<T, V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571b5449", new Object[]{this, map});
            return;
        }
        ArrayMap arrayMap = null;
        for (Map.Entry<T, V> entry : map.entrySet()) {
            T key = entry.getKey();
            int indexOf = key.indexOf(":");
            if (indexOf > 0) {
                initPesudoMapsIfNeed(map);
                String substring = key.substring(indexOf);
                if (substring.equals(Constants.PSEUDO.ENABLED)) {
                    String substring2 = key.substring(0, indexOf);
                    if (arrayMap == null) {
                        arrayMap = new ArrayMap();
                    }
                    arrayMap.put(substring2, entry.getValue());
                    this.mPesudoResetStyleMap.put(substring2, entry.getValue());
                } else {
                    String replace = substring.replace(Constants.PSEUDO.ENABLED, "");
                    Map<String, Object> map2 = this.mPesudoStyleMap.get(replace);
                    if (map2 == null) {
                        map2 = new ArrayMap<>();
                        this.mPesudoStyleMap.put(replace, map2);
                    }
                    map2.put(key.substring(0, indexOf), entry.getValue());
                }
            }
        }
        if (arrayMap == null || arrayMap.isEmpty()) {
            return;
        }
        putAll(arrayMap);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, obj}) : this.mStyles.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : this.mStyles.size();
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this}) : this.mStyles.values();
    }

    private void initPesudoMapsIfNeed(Map<? extends String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27f6d22", new Object[]{this, map});
            return;
        }
        if (this.mPesudoStyleMap == null) {
            this.mPesudoStyleMap = new ArrayMap();
        }
        if (this.mPesudoResetStyleMap == null) {
            this.mPesudoResetStyleMap = new ArrayMap();
        }
        if (!this.mPesudoResetStyleMap.isEmpty()) {
            return;
        }
        this.mPesudoResetStyleMap.putAll(map);
    }

    public void parseStatements() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0328fe", new Object[]{this});
            return;
        }
        Map<String, Object> map = this.mStyles;
        if (map == null) {
            return;
        }
        this.mStyles = parseBindingStylesStatements(map);
    }

    private Map<String, Object> parseBindingStylesStatements(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9bb244fb", new Object[]{this, map});
        }
        if (map != null && map.size() != 0) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (addBindingStyleIfStatement((String) entry.getKey(), entry.getValue())) {
                    Map<String, Map<String, Object>> map2 = this.mPesudoStyleMap;
                    if (map2 != null) {
                        map2.remove(entry.getKey());
                    }
                    Map<String, Object> map3 = this.mPesudoResetStyleMap;
                    if (map3 != null) {
                        map3.remove(entry.getKey());
                    }
                    it.remove();
                }
            }
        }
        return map;
    }

    private boolean addBindingStyleIfStatement(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70833056", new Object[]{this, str, obj})).booleanValue();
        }
        if (!ELUtils.isBinding(obj)) {
            return false;
        }
        if (this.mBindingStyle == null) {
            this.mBindingStyle = new ArrayMap<>();
        }
        this.mBindingStyle.put(str, ELUtils.bindingBlock(obj));
        return true;
    }

    public ArrayMap<String, Object> getBindingStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayMap) ipChange.ipc$dispatch("edc0c3fd", new Object[]{this}) : this.mBindingStyle;
    }

    /* renamed from: clone */
    public WXStyle m1585clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXStyle) ipChange.ipc$dispatch("4086deed", new Object[]{this});
        }
        WXStyle wXStyle = new WXStyle();
        wXStyle.putAll(this.mStyles);
        ArrayMap<String, Object> arrayMap = this.mBindingStyle;
        if (arrayMap != null) {
            wXStyle.mBindingStyle = new ArrayMap<>(arrayMap);
        }
        if (this.mPesudoStyleMap != null) {
            wXStyle.mPesudoStyleMap = new ArrayMap();
            for (Map.Entry<String, Map<String, Object>> entry : this.mPesudoStyleMap.entrySet()) {
                ArrayMap arrayMap2 = new ArrayMap();
                arrayMap2.putAll(entry.getValue());
                wXStyle.mPesudoStyleMap.put(entry.getKey(), arrayMap2);
            }
        }
        if (this.mPesudoResetStyleMap != null) {
            wXStyle.mPesudoResetStyleMap = new ArrayMap();
            wXStyle.mPesudoResetStyleMap.putAll(this.mPesudoResetStyleMap);
        }
        return wXStyle;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.mStyles.toString();
    }
}
