package com.taobao.android.searchbaseframe.datasource.param;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.noa;

/* loaded from: classes6.dex */
public interface SearchParam extends Serializable {
    void addParamSetValue(String str, String str2);

    void addParamSetValues(String str, Collection<String> collection);

    void addParams(Map<String, Param> map);

    void clearParamSetValue(String str);

    boolean containsKey(String str);

    boolean containsParamValue(String str, String str2);

    Map<String, String> createUrlParams();

    Param getParam(String str);

    Map<String, String> getParamSnapshot();

    String getParamStr(String str);

    String getParamValue(String str);

    Set<String> getParamValueSet(String str);

    Map<String, Param> getParams();

    void removeAllParams();

    void removeParam(String str);

    void removeParamSetValue(String str, String str2);

    void removeParams(Collection<String> collection);

    void setParam(String str, Param param);

    void setParam(String str, String str2);

    void setParam(String str, Collection<String> collection);

    void setParams(Map<String, Param> map);

    /* loaded from: classes6.dex */
    public static class Param implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String LOG_TAG = "Param";
        private static final Map<String, String> SEPARATOR_MAP;
        public String mKey;
        public String mValue;
        public Set<String> mValueSet;
        public String mValuesCache;

        static {
            kge.a(-1693891248);
            kge.a(1028243835);
            HashMap hashMap = new HashMap();
            SEPARATOR_MAP = hashMap;
            hashMap.put(noa.KEY_PROPERTY, ";");
            SEPARATOR_MAP.put(noa.KEY_AUCTION_TAG, ";");
            SEPARATOR_MAP.put("biz_rule_tag", ";");
        }

        public Param(String str) {
            this.mKey = str;
        }

        private void setValueSetInternal(Set<String> set) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("802079c8", new Object[]{this, set});
                return;
            }
            this.mValueSet = set;
            this.mValuesCache = null;
        }

        public boolean hasMultiValues() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("20ac5ccc", new Object[]{this})).booleanValue();
            }
            Set<String> set = this.mValueSet;
            return set != null && !set.isEmpty();
        }

        public String getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            if (this.mValueSet != null) {
                k.a(LOG_TAG, "getValue on multi value param:" + this.mKey);
            }
            return this.mValue;
        }

        public void setValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bae52f80", new Object[]{this, str});
                return;
            }
            this.mValue = str;
            if (this.mValueSet == null) {
                return;
            }
            k.a(LOG_TAG, "setValue on multi value param:" + this.mKey);
        }

        public Set<String> getValueSet() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("f7eb5b1d", new Object[]{this});
            }
            if (this.mValue != null) {
                k.a(LOG_TAG, "getValueSet on single value param:" + this.mKey + "--" + this.mValue);
                this.mValue = null;
            }
            return this.mValueSet;
        }

        public void setValueSet(Set<String> set) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7a90c5", new Object[]{this, set});
                return;
            }
            setValueSetInternal(set);
            if (this.mValue == null) {
                return;
            }
            k.a(LOG_TAG, "setValueSet on single value param:" + this.mKey + "--" + this.mValue);
            this.mValue = null;
        }

        public boolean containsValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("328047a7", new Object[]{this, str})).booleanValue();
            }
            if (this.mValue != null) {
                k.a(LOG_TAG, "call containsValue on single value param:" + this.mKey);
                this.mValue = null;
            }
            Set<String> set = this.mValueSet;
            if (set != null) {
                return set.contains(str);
            }
            return false;
        }

        public void addSetValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1d52481", new Object[]{this, str});
                return;
            }
            if (this.mValueSet == null) {
                this.mValueSet = new HashSet();
            }
            if (this.mValue != null) {
                k.a(LOG_TAG, "addSetValue on single value param:" + this.mKey + "--" + str);
                this.mValueSet.add(this.mValue);
                this.mValue = null;
            }
            this.mValueSet.add(str);
            this.mValuesCache = null;
        }

        public void addSetValue(Collection<String> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1e094e8", new Object[]{this, collection});
                return;
            }
            if (this.mValueSet == null) {
                this.mValueSet = new HashSet();
            }
            if (this.mValue != null) {
                k.a(LOG_TAG, "addSetValue on single value param:" + this.mKey + "--" + collection);
                this.mValueSet.add(this.mValue);
                this.mValue = null;
            }
            this.mValueSet.addAll(collection);
            this.mValuesCache = null;
        }

        public void removeSetValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a1ff524", new Object[]{this, str});
                return;
            }
            if (this.mValue != null) {
                k.a(LOG_TAG, "removeSetValue on single value param:" + this.mKey + "--" + str);
                this.mValue = null;
            }
            if (this.mValueSet == null) {
                this.mValueSet = new HashSet();
            }
            this.mValueSet.remove(str);
            this.mValuesCache = null;
        }

        public void clearSetValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2042623", new Object[]{this});
                return;
            }
            if (this.mValue != null) {
                k.a(LOG_TAG, "clearSetValue on single value param:" + this.mKey + "--" + this.mValue);
                this.mValue = null;
            }
            Set<String> set = this.mValueSet;
            if (set != null) {
                set.clear();
            }
            this.mValuesCache = null;
        }

        public String toUrlParamString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1b58afcf", new Object[]{this});
            }
            String str = this.mValue;
            if (str != null) {
                return str;
            }
            String str2 = this.mValuesCache;
            if (str2 != null) {
                return str2;
            }
            if (this.mValueSet == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            String paramSeparator = getParamSeparator();
            for (String str3 : this.mValueSet) {
                sb.append(str3);
                sb.append(paramSeparator);
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            this.mValuesCache = sb.toString();
            return this.mValuesCache;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : toUrlParamString();
        }

        public String getParamSeparator() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea2375eb", new Object[]{this}) : getParamSeparator(this.mKey);
        }

        public static String getParamSeparator(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("363e3ca1", new Object[]{str});
            }
            String str2 = SEPARATOR_MAP.get(str);
            return !TextUtils.isEmpty(str2) ? str2 : ",";
        }
    }
}
