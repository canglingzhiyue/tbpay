package com.alibaba.security.wukong.bx.workconf;

import com.alibaba.security.ccrc.common.keep.IKeep;
import com.alibaba.security.ccrc.service.build.C1228lb;
import com.alibaba.security.ccrc.service.build.C1231mb;
import com.alibaba.security.ccrc.service.build.C1234nb;
import com.alibaba.security.ccrc.service.build.InterfaceC1225kb;
import com.alibaba.security.wukong.bx.algo.BxData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BaseWorkConfHandler implements InterfaceC1225kb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static class WorkConfResult implements IKeep {
        public String featureNeedDelete;
        public Map<String, Object> finalResult;
    }

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;

        /* renamed from: a  reason: collision with root package name */
        public static final String f3624a = "toFilter";
        public static final String b = "toGroup";
        public static final String c = "toCopy";

        public static BaseWorkConfHandler a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseWorkConfHandler) ipChange.ipc$dispatch("a7d0c166", new Object[]{str});
            }
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1176843068) {
                if (hashCode != -869368688) {
                    if (hashCode == 2135539155 && str.equals(f3624a)) {
                        c2 = 0;
                    }
                } else if (str.equals(c)) {
                    c2 = 2;
                }
            } else if (str.equals(b)) {
                c2 = 1;
            }
            if (c2 == 0) {
                return new C1231mb();
            }
            if (c2 == 1) {
                return new C1234nb();
            }
            if (c2 == 2) {
                return new C1228lb();
            }
            return null;
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1225kb
    public Map<String, Object> a(Map<String, Object> map, Map<String, Object> map2, List<BxData.OpConfItemValue> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6619832e", new Object[]{this, map, map2, list}) : (list == null || list.isEmpty()) ? map2 : b(map, map2, list);
    }

    public abstract Map<String, Object> b(Map<String, Object> map, Map<String, Object> map2, List<BxData.OpConfItemValue> list);

    public static <T> List<T> a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("18196f83", new Object[]{obj});
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException("The provided object is not a List.");
    }
}
