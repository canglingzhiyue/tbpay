package com.tmall.android.dai.internal.jsbridge;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAIKVStoreage;
import com.tmall.android.dai.internal.util.d;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class KKVParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "KKVParams";
    private static final int TYPE_ALL = 0;
    private static final int TYPE_DISK = 2;
    private static final int TYPE_MEMORY = 1;
    @JSONField(name = "key")
    public String key;
    @JSONField(name = "subKey")
    public String subKey;
    @JSONField(name = "type")
    public int type = 0;
    @JSONField(name = "value")
    public String value;

    static {
        kge.a(-1920638279);
        kge.a(1028243835);
    }

    public static KKVParams parseStringToKKVParams(String str) {
        KKVParams kKVParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KKVParams) ipChange.ipc$dispatch("c9ac3326", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return new KKVParams();
        }
        try {
            kKVParams = (KKVParams) d.a(str, KKVParams.class);
        } catch (Throwable th) {
            com.taobao.mrt.utils.a.b(TAG, "parseKKVParams ", th);
            kKVParams = null;
        }
        return kKVParams == null ? new KKVParams() : kKVParams;
    }

    public static KKVParams parseMapToKVParams(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KKVParams) ipChange.ipc$dispatch("3fb3e001", new Object[]{map});
        }
        if (map == null) {
            return new KKVParams();
        }
        KKVParams kKVParams = new KKVParams();
        kKVParams.key = toString(map.get("key"));
        kKVParams.subKey = toString(map.get("subKey"));
        kKVParams.value = toString(map.get("value"));
        Object obj = map.get("type");
        if (obj != null) {
            try {
                kKVParams.type = Integer.valueOf(obj.toString()).intValue();
            } catch (Throwable unused) {
            }
        }
        return kKVParams;
    }

    public boolean save() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84643f88", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.key)) {
            return false;
        }
        String str = TextUtils.isEmpty(this.subKey) ? "#" : this.subKey;
        int i = this.type;
        if (i == 0) {
            return DAIKVStoreage.put(this.key, str, this.value);
        }
        if (i == 1) {
            return DAIKVStoreage.putToMemory(this.key, str, this.value);
        }
        if (i != 2) {
            return false;
        }
        return DAIKVStoreage.putToDisk(this.key, str, this.value);
    }

    public String get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5615b163", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.key)) {
            return null;
        }
        String str = TextUtils.isEmpty(this.subKey) ? "#" : this.subKey;
        int i = this.type;
        if (i == 0) {
            return DAIKVStoreage.getValue(this.key, str);
        }
        if (i == 1) {
            return DAIKVStoreage.getMemoryValue(this.key, str);
        }
        if (i != 2) {
            return null;
        }
        return DAIKVStoreage.getDiskValue(this.key, str);
    }

    public static String toString(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cf5fa71", new Object[]{obj});
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
