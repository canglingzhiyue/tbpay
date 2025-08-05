package com.ap.zlz.toyger.zdoc;

import android.graphics.Rect;
import com.alipay.zoloz.toyger.ToygerBaseService;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;
import tb.rrv;

/* loaded from: classes3.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BLOB_META_BIS_TOKEN = "bis_token";
    public static final String BLOB_META_INVTP_TYPE = "invtp_type";
    public static final String BLOB_META_RETRY = "blob_meta_retry";

    static {
        kge.a(2174244);
    }

    public static HashMap<String, Object> a(TGFrame tGFrame, ToygerDocBlobConfig toygerDocBlobConfig, Rect rect, int i, String str, String str2) {
        try {
            Constructor<?> declaredConstructor = Class.forName("com.ap.zlz.toyger.zdoc.DocBlobManagerJson").getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            b bVar = (b) declaredConstructor.newInstance(new Object[0]);
            bVar.setCropRect(rect);
            bVar.setBlobConfig(toygerDocBlobConfig);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ToygerDocInfo(tGFrame, new c()));
            byte[] generateBlob = bVar.generateBlob(arrayList, null);
            byte[] key = bVar.getKey();
            HashMap<String, Object> hashMap = new HashMap<>(6);
            hashMap.put("content", generateBlob);
            hashMap.put("key", key);
            hashMap.put(ToygerBaseService.KEY_RES_9_IS_UTF8, true);
            hashMap.put(rrv.PAGE_NUMBER, Integer.toString(toygerDocBlobConfig.pageNo));
            hashMap.put(rrv.PRE_COMPRESS_SIZE, Long.toString(tGFrame.data.length));
            hashMap.put(rrv.POST_COMPRESS_SIZE, Long.toString(bVar.getPicSize()));
            return hashMap;
        } catch (Throwable unused) {
            d.class.getName();
            return null;
        }
    }
}
