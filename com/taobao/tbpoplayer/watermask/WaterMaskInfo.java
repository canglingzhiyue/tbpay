package com.taobao.tbpoplayer.watermask;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class WaterMaskInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean enable = false;
    public String imgCode;
    public String imgUrl;
    public List<Scene> whitePageList;

    /* loaded from: classes9.dex */
    public static class Scene implements Serializable {
        public String alpha;
        public String filer;
        public List<String> uris;

        static {
            kge.a(2116617535);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1200245687);
        kge.a(1028243835);
    }

    public boolean isValid() {
        List<Scene> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.enable && !TextUtils.isEmpty(this.imgUrl) && !TextUtils.isEmpty(this.imgCode) && (list = this.whitePageList) != null && !list.isEmpty();
    }
}
