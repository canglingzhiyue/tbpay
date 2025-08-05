package com.alibaba.security.wukong.bx.algo;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.ccrc.common.keep.IKeep;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.AbstractC1219ib;
import com.alibaba.security.ccrc.service.build.C1222jb;
import com.alibaba.security.ccrc.service.build.Yb;
import com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler;
import com.alibaba.security.wukong.bx.workconf.WorkConfOperator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;

/* loaded from: classes3.dex */
public class BxData {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OP_CONF = "opConf";
    public static final String TAG = "BxData";
    public static final String WORK_CONF = "workConf";
    public String TT;
    public List<List<String>> data;

    /* loaded from: classes3.dex */
    public static class OpConfItemValue implements IKeep {
        public String input;
        public boolean isKey;
        public String name;
        public String op;
    }

    /* loaded from: classes3.dex */
    public static class OpResult implements IKeep {
        public boolean del;
        public String name;
        public Object value;

        public OpResult(String str, Object obj, boolean z) {
            this.name = str;
            this.value = obj;
            this.del = z;
        }
    }

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f3623a;
        public Map<String, Object> b;
        public String c;
        public boolean d;
        public String e;

        public a() {
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f7bfc37", new Object[0]);
            }
            a aVar = new a();
            aVar.d = true;
            aVar.c = "success";
            return aVar;
        }

        public a(String str, Map<String, Object> map) {
            this.f3623a = str;
            this.b = map;
        }

        public static a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("50298ba3", new Object[]{str, str2});
            }
            a aVar = new a();
            aVar.d = false;
            aVar.c = str;
            aVar.e = str2;
            return aVar;
        }
    }

    public static a doParseSeqResult(String str, String str2, String str3, String str4, Map<String, Object> map) {
        BaseWorkConfHandler.WorkConfResult a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a55d76bd", new Object[]{str, str2, str3, str4, map});
        }
        if (str != null && (a2 = new WorkConfOperator().a(map, str)) != null && !a2.finalResult.isEmpty()) {
            map.putAll(a2.finalResult);
            map.remove(a2.featureNeedDelete);
            map.remove(WORK_CONF);
        }
        if (str2 == null) {
            return returnOriginResult(str4, str3, map, "opConf is null, ");
        }
        Map map2 = (Map) JsonUtils.parseObject(str2, (Class<Object>) Map.class);
        if (map2 != null && !map2.isEmpty()) {
            return getSeqResultByOpConf(str4, str3, map, map2);
        }
        return returnOriginResult(str4, str3, map, "confValueMap is null, ");
    }

    private List<String> getFeatureData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7eebf74c", new Object[]{this, str});
        }
        List<List<String>> list = this.data;
        if (list == null) {
            return null;
        }
        for (List<String> list2 : list) {
            if (list2 != null && list2.size() > 0 && TextUtils.equals(list2.get(0), str)) {
                return list2;
            }
        }
        return null;
    }

    private String getSafelyString(String[] strArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6959b54", new Object[]{this, strArr, new Integer(i)});
        }
        if (strArr.length <= i) {
            return null;
        }
        return strArr[i];
    }

    private a getSeqResult(List<String> list, String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3c017737", new Object[]{this, list, str});
        }
        if (list == null) {
            return a.a("getSeqResult featureData is null", str);
        }
        if (list.isEmpty()) {
            return a.a("getSeqResult featureData is empty", str);
        }
        if (list.size() <= 2) {
            return a.a("getSeqResult featureData size is invalid", str);
        }
        try {
            String str2 = list.get(0);
            HashMap hashMap = new HashMap();
            String[] split2 = list.get(1).split(SymbolExpUtil.SYMBOL_VERTICALBAR);
            String str3 = list.get(2);
            if (!str3.contains("#")) {
                split = str3.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
            } else {
                String[] split3 = str3.split("#");
                split = split3[split3.length - 1].split(SymbolExpUtil.SYMBOL_VERTICALBAR);
            }
            String str4 = null;
            String str5 = null;
            for (int i = 0; i < split2.length; i++) {
                if (TextUtils.equals(OP_CONF, split2[i])) {
                    str5 = getSafelyString(split, i);
                } else if (TextUtils.equals(WORK_CONF, split2[i])) {
                    str4 = getSafelyString(split, i);
                } else {
                    hashMap.put(split2[i], getSafelyString(split, i));
                }
            }
            return doParseSeqResult(str4, str5, str2, str, hashMap);
        } catch (Throwable th) {
            StringBuilder a2 = Yb.a("handle bx data fail: ");
            a2.append(Arrays.toString(th.getStackTrace()));
            return a.a(a2.toString(), str);
        }
    }

    public static a getSeqResultByOpConf(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5e770d62", new Object[]{str, str2, map, map2});
        }
        a aVar = new a();
        HashMap hashMap = new HashMap();
        ArrayList<String> arrayList = new ArrayList();
        for (String str3 : map.keySet()) {
            if (!map2.containsKey(str3)) {
                hashMap.put(str3, map.get(str3));
            } else {
                List parseArray = JSON.parseArray(JsonUtils.toJSONString(map2.get(str3)), OpConfItemValue.class);
                if (parseArray != null && !parseArray.isEmpty()) {
                    hashMap.put(str3, map.get(str3));
                    List<OpResult> handle = handle(parseArray, str3, map.get(str3));
                    if (handle != null) {
                        for (OpResult opResult : handle) {
                            if (!opResult.del) {
                                hashMap.put(opResult.name, opResult.value);
                            } else {
                                arrayList.add(str3);
                            }
                        }
                    }
                } else {
                    hashMap.put(str3, map.get(str3));
                }
            }
        }
        for (String str4 : arrayList) {
            hashMap.remove(str4);
        }
        aVar.f3623a = str2;
        aVar.b = hashMap;
        aVar.d = true;
        aVar.e = str;
        return aVar;
    }

    public static List<OpResult> handle(List<OpConfItemValue> list, String str, Object obj) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e76ad4c1", new Object[]{list, str, obj});
        }
        if (!(obj instanceof String)) {
            str2 = JsonUtils.toJSONString(obj);
        } else {
            str2 = (String) obj;
        }
        C1222jb c1222jb = new C1222jb(str, str2);
        for (OpConfItemValue opConfItemValue : list) {
            AbstractC1219ib a2 = AbstractC1219ib.c.a(opConfItemValue);
            if (a2 != null) {
                c1222jb.a(a2);
            }
        }
        try {
            c1222jb.b();
        } catch (Throwable unused) {
        }
        return c1222jb.a();
    }

    public static a parseByBroadcastFeature(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ad5e8945", new Object[]{str, str2});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return a.a("parseByBroadcastFeature feature is null", "");
            }
            Map<String, Object> map = JsonUtils.toMap(str);
            if (map != null && !map.isEmpty()) {
                String str4 = null;
                if (map.containsKey(OP_CONF)) {
                    str3 = (String) map.get(OP_CONF);
                    map.remove(OP_CONF);
                } else {
                    str3 = null;
                }
                if (map.containsKey(WORK_CONF)) {
                    str4 = (String) map.get(WORK_CONF);
                    map.remove(WORK_CONF);
                }
                return doParseSeqResult(str4, str3, str2, str, map);
            }
            return a.a("parseByBroadcastFeature to map is fail", str);
        } catch (Throwable th) {
            StringBuilder a2 = Yb.a("handle bx data fail, parse by broadcast feature: ");
            a2.append(Arrays.toString(th.getStackTrace()));
            return a.a(a2.toString(), str);
        }
    }

    public static a parseByGetFeature(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e68f86da", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return a.a("ori feature is null", str);
        }
        BxData bxData = (BxData) JsonUtils.parseObject(str, (Class<Object>) BxData.class);
        if (bxData == null) {
            return a.a("BxData parseObject fail", str);
        }
        return bxData.getSeqResult(bxData.getFeatureData(str2), str);
    }

    public static a returnOriginResult(String str, String str2, Map<String, Object> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("37bb18be", new Object[]{str, str2, map, str3});
        }
        a aVar = new a();
        aVar.f3623a = str2;
        aVar.b = map;
        aVar.c = str3;
        aVar.d = true;
        aVar.e = str;
        return aVar;
    }
}
