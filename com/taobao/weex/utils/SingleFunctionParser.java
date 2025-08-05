package com.taobao.weex.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.FunctionParser;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class SingleFunctionParser<V> extends FunctionParser<String, List<V>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public interface FlatMapper<V> {
        /* renamed from: map */
        V mo1597map(String str);
    }

    /* loaded from: classes9.dex */
    public interface NonUniformMapper<V> {
        List<V> map(List<String> list);
    }

    static {
        kge.a(818146680);
    }

    public SingleFunctionParser(String str, final FlatMapper<V> flatMapper) {
        super(str, new FunctionParser.Mapper<String, List<V>>() { // from class: com.taobao.weex.utils.SingleFunctionParser.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.utils.FunctionParser.Mapper
            public Map<String, List<V>> map(String str2, List<String> list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Map) ipChange.ipc$dispatch("7f9ebb93", new Object[]{this, str2, list});
                }
                HashMap hashMap = new HashMap();
                LinkedList linkedList = new LinkedList();
                for (String str3 : list) {
                    linkedList.add(FlatMapper.this.mo1597map(str3));
                }
                hashMap.put(str2, linkedList);
                return hashMap;
            }
        });
    }

    public SingleFunctionParser(String str, final NonUniformMapper<V> nonUniformMapper) {
        super(str, new FunctionParser.Mapper<String, List<V>>() { // from class: com.taobao.weex.utils.SingleFunctionParser.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.utils.FunctionParser.Mapper
            public Map<String, List<V>> map(String str2, List<String> list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Map) ipChange.ipc$dispatch("7f9ebb93", new Object[]{this, str2, list});
                }
                HashMap hashMap = new HashMap();
                hashMap.put(str2, NonUniformMapper.this.map(list));
                return hashMap;
            }
        });
    }

    public List<V> parse(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4981acc3", new Object[]{this, str});
        }
        LinkedHashMap<String, V> parse = parse();
        if (!parse.containsKey(str)) {
            return null;
        }
        return (List) parse.get(str);
    }
}
