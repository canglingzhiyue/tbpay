package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.model.b;
import com.etao.feimagesearch.newresult.perf.a;
import com.etao.feimagesearch.pipline.d;
import com.etao.feimagesearch.util.PicParamUtils;
import com.etao.feimagesearch.util.l;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class cpf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(827031527);
    }

    public static void a(Uri uri, Bitmap bitmap, int i, PhotoFrom photoFrom, b bVar, Activity activity, int i2, int i3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92fda3a", new Object[]{uri, bitmap, new Integer(i), photoFrom, bVar, activity, new Integer(i2), new Integer(i3), str});
            return;
        }
        IrpParamModel irpParamModel = new IrpParamModel(bVar);
        irpParamModel.setPhotoFrom(photoFrom);
        irpParamModel.updateSessionId();
        d.a(uri, bitmap, i, photoFrom, bVar, irpParamModel.getSessionId(), i2, i3, str);
        if (!StringUtils.isEmpty(bVar.getSellerId())) {
            cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_TAKE.getPageName(), StatisticalDataPoint.DataPoint.SEARCH_FROM_SHOP.name(), new String[0]);
        }
        cou.a(activity, irpParamModel);
    }

    public static void a(Activity activity, Bitmap bitmap, boolean z, b bVar, Map<String, String> map, Map<String, String> map2, int i, PhotoFrom.Values values, boolean z2) {
        int i2;
        int i3 = i;
        IpChange ipChange = $ipChange;
        int i4 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9a6b3", new Object[]{activity, bitmap, new Boolean(z), bVar, map, map2, new Integer(i3), values, new Boolean(z2)});
            return;
        }
        a.H();
        if (i3 < 0) {
            i4 = 0;
        }
        if (z2) {
            i3 = bitmap.hashCode();
            i2 = i4 | 16;
        } else {
            i2 = i4;
        }
        if (!StringUtils.isEmpty(bVar.getSellerId())) {
            cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_TAKE.getPageName(), StatisticalDataPoint.DataPoint.SEARCH_FROM_SHOP.name(), new String[0]);
        }
        IrpParamModel irpParamModel = new IrpParamModel(bVar);
        irpParamModel.setPhotoFrom(values);
        irpParamModel.updateSessionId();
        String a2 = com.etao.feimagesearch.mnn.b.Companion.a().a();
        HashMap hashMap = map == null ? new HashMap() : map;
        cot.a("Dynamic", "prepareForV2SRP", values.getValue());
        if (com.etao.feimagesearch.config.b.bv() && !StringUtils.isEmpty(a2)) {
            hashMap.put(com.etao.feimagesearch.mnn.b.EXTRA_INFO_KEY, a2);
        }
        hashMap.put(cpe.KEY_EXTRA_VERIFY, values.getValue());
        d.a(bitmap, null, PicParamUtils.Companion.a(z, values), bVar, irpParamModel.getSessionId(), hashMap, map2, "true".equals(com.etao.feimagesearch.config.b.k("irpMock")), Integer.valueOf(i3), i2, values);
        cou.a(activity, irpParamModel);
    }

    public static void a(Activity activity, Bitmap bitmap, String str, PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8d3ee6", new Object[]{activity, bitmap, str, photoFrom});
            return;
        }
        a.H();
        String a2 = l.a(activity, bitmap, 90);
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        IrpParamModel irpParamModel = new IrpParamModel(str);
        irpParamModel.setPhotoFrom(photoFrom);
        irpParamModel.updateSessionId();
        String a3 = com.etao.feimagesearch.mnn.b.Companion.a().a();
        HashMap hashMap = new HashMap(10);
        if (com.etao.feimagesearch.config.b.bv() && !StringUtils.isEmpty(a3)) {
            hashMap.put(com.etao.feimagesearch.mnn.b.EXTRA_INFO_KEY, a3);
        }
        d.a(bitmap, a2, irpParamModel, irpParamModel.getSessionId(), hashMap);
        cou.a(activity, irpParamModel);
    }
}
