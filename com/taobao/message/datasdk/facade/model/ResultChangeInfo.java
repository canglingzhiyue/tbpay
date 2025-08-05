package com.taobao.message.datasdk.facade.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class ResultChangeInfo<DATA, INDEX> implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<ResultData<DATA>> allDatas;
    private Map<String, Object> context;
    private boolean newHasMore;
    private boolean oldHasMore;
    private List<Reason> reasons;
    private List<ResultChange<DATA, INDEX>> resultChanges;

    static {
        kge.a(588477180);
        kge.a(-723128125);
        kge.a(1028243835);
    }

    public ResultChangeInfo(List<ResultData<DATA>> list, List<ResultChange<DATA, INDEX>> list2, List<Reason> list3, Map<String, Object> map, boolean z, boolean z2) {
        if (list != null) {
            this.allDatas = Collections.unmodifiableList(list);
        }
        if (list2 != null) {
            this.resultChanges = Collections.unmodifiableList(list2);
        }
        if (list3 != null) {
            this.reasons = Collections.unmodifiableList(list3);
        }
        if (map != null) {
            this.context = Collections.unmodifiableMap(map);
        }
        this.newHasMore = z2;
        this.oldHasMore = z;
    }

    public List<ResultData<DATA>> getAllDatas() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3df40fc2", new Object[]{this}) : this.allDatas;
    }

    public List<ResultChange<DATA, INDEX>> getResultChanges() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("752e7cb0", new Object[]{this}) : this.resultChanges;
    }

    public List<Reason> getReasons() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("936eefc7", new Object[]{this}) : this.reasons;
    }

    public boolean isOldHasMore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3820bd3d", new Object[]{this})).booleanValue() : this.oldHasMore;
    }

    public boolean isNewHasMore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("62dd0c24", new Object[]{this})).booleanValue() : this.newHasMore;
    }

    public Map<String, Object> getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7ab803b5", new Object[]{this}) : this.context;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ResultChangeInfo{allDatas size =");
        List<ResultData<DATA>> list = this.allDatas;
        sb.append(list == null ? 0 : list.size());
        sb.append(", resultChanges size =");
        List<ResultChange<DATA, INDEX>> list2 = this.resultChanges;
        if (list2 != null) {
            i = list2.size();
        }
        sb.append(i);
        sb.append(", oldHasMore=");
        sb.append(this.oldHasMore);
        sb.append(", newHasMore=");
        sb.append(this.newHasMore);
        sb.append(", context=");
        sb.append(this.context);
        sb.append('}');
        return sb.toString();
    }
}
