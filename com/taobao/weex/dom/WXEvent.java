package com.taobao.weex.dom;

import android.support.v4.util.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.dom.binding.ELUtils;
import com.taobao.weex.dom.binding.JSONUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class WXEvent extends ArrayList<String> implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_KEY_ARGS = "params";
    public static final String EVENT_KEY_TYPE = "type";
    private static final long serialVersionUID = -8186587029452440107L;
    private ArrayMap mEventBindingArgs;
    private ArrayMap<String, List<Object>> mEventBindingArgsValues;

    static {
        kge.a(-1261007983);
        kge.a(1028243835);
        kge.a(-723128125);
    }

    public static /* synthetic */ Object ipc$super(WXEvent wXEvent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272099756) {
            super.clear();
            return null;
        } else if (hashCode != -332530133) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.remove(objArr[0]));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ArrayMap arrayMap = this.mEventBindingArgs;
        if (arrayMap != null) {
            arrayMap.clear();
        }
        ArrayMap<String, List<Object>> arrayMap2 = this.mEventBindingArgsValues;
        if (arrayMap2 != null) {
            arrayMap2.clear();
        }
        super.clear();
    }

    public boolean remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39af3819", new Object[]{this, str})).booleanValue();
        }
        ArrayMap arrayMap = this.mEventBindingArgs;
        if (arrayMap != null) {
            arrayMap.remove(str);
        }
        ArrayMap<String, List<Object>> arrayMap2 = this.mEventBindingArgsValues;
        if (arrayMap2 != null) {
            arrayMap2.remove(str);
        }
        return super.remove((Object) str);
    }

    public ArrayMap getEventBindingArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayMap) ipChange.ipc$dispatch("b6e038a1", new Object[]{this}) : this.mEventBindingArgs;
    }

    public ArrayMap<String, List<Object>> getEventBindingArgsValues() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayMap) ipChange.ipc$dispatch("7933371f", new Object[]{this}) : this.mEventBindingArgsValues;
    }

    public void addEvent(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5adc365c", new Object[]{this, obj});
        } else if (obj instanceof CharSequence) {
            if (JSONUtils.isJSON(obj.toString())) {
                addEvent(JSONUtils.toJSON(obj.toString()));
                return;
            }
            String obj2 = obj.toString();
            if (contains(obj2)) {
                return;
            }
            add(obj2);
        } else if (!(obj instanceof JSONObject)) {
        } else {
            addBindingEvent((JSONObject) obj);
        }
    }

    public static String getEventName(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67d8e5ee", new Object[]{obj});
        }
        if (obj instanceof CharSequence) {
            return obj.toString();
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).getString("type");
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public void parseStatements() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0328fe", new Object[]{this});
        } else if (!isEmpty()) {
            for (int i = 0; i < size(); i++) {
                String str = get(i);
                if (JSONUtils.isJSON(str)) {
                    set(i, addBindingEvent(JSONUtils.toJSON(str)));
                }
            }
        }
    }

    private String addBindingEvent(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65bb524d", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("type");
        Object obj = jSONObject.get("params");
        if (string != null) {
            addBindingArgsEvent(string, obj);
        }
        return string;
    }

    private void addBindingArgsEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19c360a6", new Object[]{this, str, obj});
            return;
        }
        if (!contains(str)) {
            add(str);
        }
        if (obj == null) {
            return;
        }
        if (this.mEventBindingArgs == null) {
            this.mEventBindingArgs = new ArrayMap();
        }
        this.mEventBindingArgs.put(str, ELUtils.bindingBlock(obj));
    }

    public void putEventBindingArgsValue(String str, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3fd27c", new Object[]{this, str, list});
            return;
        }
        if (this.mEventBindingArgsValues == null) {
            this.mEventBindingArgsValues = new ArrayMap<>();
        }
        if (list == null) {
            this.mEventBindingArgsValues.remove(str);
        } else {
            this.mEventBindingArgsValues.put(str, list);
        }
    }

    @Override // java.util.ArrayList
    /* renamed from: clone */
    public WXEvent mo1584clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXEvent) ipChange.ipc$dispatch("28b62724", new Object[]{this});
        }
        WXEvent wXEvent = new WXEvent();
        wXEvent.addAll(this);
        ArrayMap arrayMap = this.mEventBindingArgs;
        if (arrayMap != null) {
            wXEvent.mEventBindingArgs = new ArrayMap(arrayMap);
        }
        wXEvent.mEventBindingArgsValues = null;
        return wXEvent;
    }
}
