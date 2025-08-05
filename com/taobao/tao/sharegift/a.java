package com.taobao.tao.sharegift;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import java.util.List;
import tb.kge;
import tb.nyl;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1113773794);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String a2 = nyl.a("shareGiftConfig", null);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            List<SharePasteImageConfig> parseArray = JSON.parseArray(a2, SharePasteImageConfig.class);
            TBShareContent j = e.b().j();
            if (parseArray == null) {
                return null;
            }
            for (SharePasteImageConfig sharePasteImageConfig : parseArray) {
                if (TextUtils.equals(sharePasteImageConfig.bizID, j.businessId)) {
                    return sharePasteImageConfig.sharepasteimage;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
