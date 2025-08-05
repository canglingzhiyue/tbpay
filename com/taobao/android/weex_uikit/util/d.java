package com.taobao.android.weex_uikit.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.util.FunctionParser;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class d<V> extends FunctionParser<String, List<V>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public interface a<V> {
        V a(String str);
    }

    static {
        kge.a(-11563628);
    }

    public d(String str, final a<V> aVar) {
        super(str, new FunctionParser.b<String, List<V>>() { // from class: com.taobao.android.weex_uikit.util.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_uikit.util.FunctionParser.b
            public Map<String, List<V>> a(String str2, List<String> list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Map) ipChange.ipc$dispatch("bbdb0e18", new Object[]{this, str2, list});
                }
                HashMap hashMap = new HashMap();
                LinkedList linkedList = new LinkedList();
                for (String str3 : list) {
                    linkedList.add(a.this.a(str3));
                }
                hashMap.put(str2, linkedList);
                return hashMap;
            }
        });
    }

    public List<V> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        LinkedHashMap<String, V> a2 = a();
        if (!a2.containsKey(str)) {
            return null;
        }
        return (List) a2.get(str);
    }
}
