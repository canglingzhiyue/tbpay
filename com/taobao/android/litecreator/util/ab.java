package com.taobao.android.litecreator.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.util.List;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class ab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public interface a<T> {
        void a(T t);
    }

    static {
        kge.a(-2018248375);
    }

    public static <T> void a(List<T> list, a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d23621", new Object[]{list, aVar});
        } else if (list != null && list.size() > 0 && aVar != null) {
            for (T t : list) {
                aVar.a(t);
            }
        }
    }

    public static <T> void a(List<T> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6e9779", new Object[]{list, new Integer(i), new Integer(i2)});
        } else if (list == null || list.size() <= 1 || list.size() <= i || list.size() <= i2) {
        } else {
            T t = list.get(i);
            list.remove(i);
            list.add(i2, t);
        }
    }

    public static String a(List<?> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{list});
        }
        if (list == null || list.size() <= 0) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
        return riy.ARRAY_START_STR + TextUtils.join(",", list) + riy.ARRAY_END_STR;
    }
}
