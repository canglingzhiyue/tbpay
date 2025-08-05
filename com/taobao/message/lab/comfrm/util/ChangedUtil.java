package com.taobao.message.lab.comfrm.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.datasdk.facade.model.ResultChange;
import com.taobao.message.datasdk.facade.model.ResultData;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class ChangedUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1181157563);
    }

    public static <T, INDEX> boolean reload(List<ResultChange<T, INDEX>> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b7ade95", new Object[]{list})).booleanValue() : !filter(list, new int[]{3}).isEmpty();
    }

    public static <T, INDEX> List<ResultData<T>> insertOrUpdate(List<ResultChange<T, INDEX>> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("72a2f34a", new Object[]{list}) : filter(list, new int[]{0, 1});
    }

    public static <T, INDEX> List<ResultData<T>> insert(List<ResultChange<T, INDEX>> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e6230a76", new Object[]{list}) : filter(list, new int[]{0});
    }

    private static <T, INDEX> List<ResultData<T>> filter(List<ResultChange<T, INDEX>> list, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4bb94089", new Object[]{list, iArr});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (ResultChange<T, INDEX> resultChange : list) {
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (iArr[i] == resultChange.getType()) {
                        arrayList.add(resultChange.getResultData());
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return arrayList;
    }
}
