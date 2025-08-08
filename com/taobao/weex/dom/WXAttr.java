package com.taobao.weex.dom;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.WXImageSharpen;
import com.taobao.weex.dom.binding.ELUtils;
import com.taobao.weex.dom.binding.WXStatement;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.qnt;
import tb.riz;

/* loaded from: classes9.dex */
public class WXAttr implements Cloneable, Map<String, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_GRID_LAYOUT = 2;
    public static final int TYPE_LINEAR_LAYOUT = 1;
    public static final int TYPE_STAGGERED_GRID_LAYOUT = 3;
    private static final long serialVersionUID = -2619357510079360946L;
    private Map<String, Object> attr;
    private ArrayMap<String, Object> mBindingAttrs;
    private WXStatement mStatement;
    private Map<String, Object> writeAttr;

    static {
        kge.a(-456440294);
        kge.a(1104193276);
        kge.a(-723128125);
    }

    public WXAttr() {
        this.attr = new HashMap();
    }

    public WXAttr(Map<String, Object> map) {
        this.attr = map;
    }

    public WXAttr(Map<String, Object> map, int i) {
        this.attr = map;
    }

    public static String getPrefix(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("145b4dca", new Object[]{map});
        }
        if (map != null && (obj = map.get("prefix")) != null) {
            return obj.toString();
        }
        return null;
    }

    public static String getSuffix(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27895f09", new Object[]{map});
        }
        if (map != null && (obj = map.get(Constants.Name.SUFFIX)) != null) {
            return obj.toString();
        }
        return null;
    }

    public static String getValue(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("115fd27d", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        Object obj = map.get("value");
        if (obj != null || (obj = map.get("content")) != null) {
            return obj.toString();
        }
        return null;
    }

    public WXImageQuality getImageQuality() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXImageQuality) ipChange.ipc$dispatch("87c9c717", new Object[]{this});
        }
        String str = "quality";
        if (!containsKey(str)) {
            str = Constants.Name.IMAGE_QUALITY;
        }
        Object obj = get(str);
        WXImageQuality wXImageQuality = WXImageQuality.AUTO;
        if (obj == null) {
            return wXImageQuality;
        }
        String obj2 = obj.toString();
        if (StringUtils.isEmpty(obj2)) {
            return wXImageQuality;
        }
        try {
            return WXImageQuality.valueOf(obj2.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            WXLogUtils.e(qnt.TYPE_IMAGE, "Invalid value image quality. Only low, normal, high, original are valid");
            return wXImageQuality;
        }
    }

    public WXImageSharpen getImageSharpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXImageSharpen) ipChange.ipc$dispatch("54e7e124", new Object[]{this});
        }
        Object obj = get(Constants.Name.SHARPEN);
        if (obj == null) {
            obj = get(Constants.Name.IMAGE_SHARPEN);
        }
        if (obj == null) {
            return WXImageSharpen.UNSHARPEN;
        }
        return obj.toString().equals(Constants.Name.SHARPEN) ? WXImageSharpen.SHARPEN : WXImageSharpen.UNSHARPEN;
    }

    public String getImageSrc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c316dc5a", new Object[]{this});
        }
        Object obj = get("src");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public boolean canRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c236802c", new Object[]{this})).booleanValue();
        }
        Object obj = get("recycle");
        if (obj == null) {
            return true;
        }
        try {
            return Boolean.parseBoolean(String.valueOf(obj));
        } catch (Exception e) {
            WXLogUtils.e("[WXAttr] recycle:", e);
            return true;
        }
    }

    public boolean showIndicators() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea8ef2c", new Object[]{this})).booleanValue();
        }
        Object obj = get(Constants.Name.SHOW_INDICATORS);
        if (obj == null) {
            return true;
        }
        try {
            return Boolean.parseBoolean(String.valueOf(obj));
        } catch (Exception e) {
            WXLogUtils.e("[WXAttr] showIndicators:", e);
            return true;
        }
    }

    public boolean autoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("658c788e", new Object[]{this})).booleanValue();
        }
        Object obj = get(Constants.Name.AUTO_PLAY);
        if (obj == null) {
            return false;
        }
        try {
            return Boolean.parseBoolean(String.valueOf(obj));
        } catch (Exception e) {
            WXLogUtils.e("[WXAttr] autoPlay:", e);
            return false;
        }
    }

    public String getScope() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6e9f91b", new Object[]{this});
        }
        Object obj = get(Constants.Name.SCOPE);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public String getLoadMoreRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18785d02", new Object[]{this});
        }
        Object obj = get(Constants.Name.LOADMORERETRY);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public String getLoadMoreOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbbfd2b5", new Object[]{this});
        }
        Object obj = get(Constants.Name.LOADMOREOFFSET);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public String optString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94d7750b", new Object[]{this, str});
        }
        if (!containsKey(str)) {
            return "";
        }
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj != null ? String.valueOf(obj) : "";
    }

    public boolean getIsRecycleImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ae0a53", new Object[]{this})).booleanValue();
        }
        Object obj = get(Constants.Name.RECYCLE_IMAGE);
        if (obj == null) {
            return true;
        }
        try {
            return Boolean.parseBoolean(String.valueOf(obj));
        } catch (Exception e) {
            WXLogUtils.e("[WXAttr] recycleImage:", e);
            return false;
        }
    }

    public String getScrollDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("561f7b7d", new Object[]{this});
        }
        Object obj = get(Constants.Name.SCROLL_DIRECTION);
        return obj == null ? "vertical" : obj.toString();
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        String scrollDirection = getScrollDirection();
        if (!StringUtils.isEmpty(scrollDirection) && scrollDirection.equals(Constants.Value.HORIZONTAL)) {
            return 0;
        }
        Object obj = get("orientation");
        return (obj == null || !Constants.Value.HORIZONTAL.equals(obj.toString())) ? 1 : 0;
    }

    public float getElevation(WXSDKInstance wXSDKInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfc1e773", new Object[]{this, wXSDKInstance, new Integer(i)})).floatValue();
        }
        Object obj = get(Constants.Name.ELEVATION);
        if (obj == null) {
            return Float.NaN;
        }
        String obj2 = obj.toString();
        if (StringUtils.isEmpty(obj2)) {
            return 0.0f;
        }
        return WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance, WXUtils.getFloat(obj2), i);
    }

    public float getColumnWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8819de51", new Object[]{this})).floatValue();
        }
        Object obj = get(Constants.Name.COLUMN_WIDTH);
        if (obj == null) {
            return -1.0f;
        }
        String valueOf = String.valueOf(obj);
        if ("auto".equals(valueOf)) {
            return -1.0f;
        }
        try {
            float parseFloat = Float.parseFloat(valueOf);
            if (parseFloat <= 0.0f) {
                return 0.0f;
            }
            return parseFloat;
        } catch (Exception e) {
            WXLogUtils.e("[WXAttr] getColumnWidth:", e);
            return -1.0f;
        }
    }

    public int getColumnCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbbe351d", new Object[]{this})).intValue();
        }
        Object obj = get(Constants.Name.COLUMN_COUNT);
        if (obj == null) {
            return -1;
        }
        String valueOf = String.valueOf(obj);
        if ("auto".equals(valueOf)) {
            return -1;
        }
        try {
            int parseInt = Integer.parseInt(valueOf);
            if (parseInt <= 0) {
                return -1;
            }
            return parseInt;
        } catch (Exception e) {
            WXLogUtils.e("[WXAttr] getColumnCount:", e);
            return -1;
        }
    }

    public float getColumnGap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1a2ec61", new Object[]{this})).floatValue();
        }
        Object obj = get(Constants.Name.COLUMN_GAP);
        if (obj == null) {
            return 32.0f;
        }
        String valueOf = String.valueOf(obj);
        if ("normal".equals(valueOf)) {
            return 32.0f;
        }
        try {
            float parseFloat = Float.parseFloat(valueOf);
            if (parseFloat < 0.0f) {
                return -1.0f;
            }
            return parseFloat;
        } catch (Exception e) {
            WXLogUtils.e("[WXAttr] getColumnGap:", e);
            return 32.0f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r1 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        return 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getLayoutType() {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.weex.dom.WXAttr.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r6
            java.lang.String r2 = "79fa48f4"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L19:
            java.lang.String r0 = "layout"
            java.lang.Object r0 = r6.get(r0)
            if (r0 != 0) goto L22
            return r3
        L22:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L52
            r1 = -1
            int r4 = r0.hashCode()     // Catch: java.lang.Exception -> L52
            r5 = 3181382(0x308b46, float:4.458066E-39)
            if (r4 == r5) goto L40
            r5 = 674874986(0x2839c66a, float:1.0312587E-14)
            if (r4 == r5) goto L36
            goto L49
        L36:
            java.lang.String r4 = "multi-column"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L49
            r1 = 0
            goto L49
        L40:
            java.lang.String r2 = "grid"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L49
            r1 = 1
        L49:
            if (r1 == 0) goto L50
            if (r1 == r3) goto L4e
            return r3
        L4e:
            r0 = 2
            return r0
        L50:
            r0 = 3
            return r0
        L52:
            r0 = move-exception
            java.lang.String r1 = "[WXAttr] getLayoutType:"
            com.taobao.weex.utils.WXLogUtils.e(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.dom.WXAttr.getLayoutType():int");
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : this.attr.equals(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.attr.hashCode();
    }

    @Override // java.util.Map
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.attr.clear();
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue() : this.attr.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, obj})).booleanValue() : this.attr.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("b3acf2c6", new Object[]{this}) : this.attr.entrySet();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj});
        }
        Map<String, Object> map = this.writeAttr;
        return (map == null || (obj2 = map.get(obj)) == null) ? this.attr.get(obj) : obj2;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue() : this.attr.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this}) : this.attr.keySet();
    }

    @Override // java.util.Map
    public Object put(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fd14d676", new Object[]{this, str, obj});
        }
        if (!addBindingAttrIfStatement(str, obj)) {
            return this.attr.put(str, obj);
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
        if (this.writeAttr == null) {
            this.writeAttr = new ArrayMap();
        }
        this.writeAttr.putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, obj}) : this.attr.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : this.attr.size();
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this}) : this.attr.values();
    }

    public ArrayMap<String, Object> getBindingAttrs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayMap) ipChange.ipc$dispatch("bd97afac", new Object[]{this}) : this.mBindingAttrs;
    }

    public WXStatement getStatement() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXStatement) ipChange.ipc$dispatch("c38a7615", new Object[]{this}) : this.mStatement;
    }

    public void setBindingAttrs(ArrayMap<String, Object> arrayMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d546d6", new Object[]{this, arrayMap});
        } else {
            this.mBindingAttrs = arrayMap;
        }
    }

    public void setStatement(WXStatement wXStatement) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c98a831", new Object[]{this, wXStatement});
        } else {
            this.mStatement = wXStatement;
        }
    }

    public void parseStatements() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0328fe", new Object[]{this});
            return;
        }
        Map<String, Object> map = this.attr;
        if (map == null) {
            return;
        }
        this.attr = filterStatementsFromAttrs(map);
    }

    private Map<String, Object> filterStatementsFromAttrs(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("44814157", new Object[]{this, map});
        }
        if (map != null && map.size() != 0) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (ELUtils.COMPONENT_PROPS.equals(entry.getKey())) {
                    entry.setValue(ELUtils.bindingBlock(entry.getValue()));
                } else if (addBindingAttrIfStatement((String) entry.getKey(), entry.getValue())) {
                    it.remove();
                }
            }
        }
        return map;
    }

    private boolean addBindingAttrIfStatement(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b143c60e", new Object[]{this, str, obj})).booleanValue();
        }
        for (String str2 : ELUtils.EXCLUDES_BINDING) {
            if (str.equals(str2)) {
                return false;
            }
        }
        if (ELUtils.isBinding(obj)) {
            if (this.mBindingAttrs == null) {
                this.mBindingAttrs = new ArrayMap<>();
            }
            this.mBindingAttrs.put(str, ELUtils.bindingBlock(obj));
            return true;
        } else if (WXStatement.WX_IF.equals(str)) {
            if (this.mStatement == null) {
                this.mStatement = new WXStatement();
            }
            if (obj != null) {
                this.mStatement.put(str, riz.a(obj.toString()));
            }
            return true;
        } else {
            if (WXStatement.WX_FOR.equals(str)) {
                if (this.mStatement == null) {
                    this.mStatement = new WXStatement();
                }
                Object vforBlock = ELUtils.vforBlock(obj);
                if (vforBlock != null) {
                    this.mStatement.put(str, vforBlock);
                    return true;
                }
            }
            if (WXStatement.WX_ONCE.equals(str)) {
                if (this.mStatement == null) {
                    this.mStatement = new WXStatement();
                }
                this.mStatement.put(str, true);
            }
            return false;
        }
    }

    public void skipFilterPutAll(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cddeb8b5", new Object[]{this, map});
        } else {
            this.attr.putAll(map);
        }
    }

    public void mergeAttr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2114e50", new Object[]{this});
            return;
        }
        Map<String, Object> map = this.writeAttr;
        if (map == null) {
            return;
        }
        this.attr.putAll(map);
        this.writeAttr = null;
    }

    /* renamed from: clone */
    public WXAttr m1583clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXAttr) ipChange.ipc$dispatch("53abc9c7", new Object[]{this});
        }
        WXAttr wXAttr = new WXAttr();
        wXAttr.skipFilterPutAll(this.attr);
        ArrayMap<String, Object> arrayMap = this.mBindingAttrs;
        if (arrayMap != null) {
            wXAttr.mBindingAttrs = new ArrayMap<>(arrayMap);
        }
        WXStatement wXStatement = this.mStatement;
        if (wXStatement != null) {
            wXAttr.mStatement = new WXStatement(wXStatement);
        }
        return wXAttr;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.attr.toString();
    }
}
