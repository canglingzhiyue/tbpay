package com.etao.feimagesearch.history;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.o;
import com.etao.feimagesearch.util.i;
import com.taobao.taobao.R;
import java.net.URLEncoder;
import tb.cou;
import tb.coy;
import tb.cpk;
import tb.cuk;
import tb.kge;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1050810104);
    }

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        o.a();
        if (com.etao.feimagesearch.config.b.dn()) {
            return c(context);
        }
        return 0L;
    }

    private static long c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb92", new Object[]{context})).longValue();
        }
        try {
            HistoryResult b = a.a().b();
            if (b.resultData != null && !b.resultData.isEmpty()) {
                return a.a().a(b);
            }
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static HistoryResult a(Context context, String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HistoryResult) ipChange.ipc$dispatch("35dbe605", new Object[]{context, str, new Boolean(z), new Integer(i)}) : a.a().a(str, z, i);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            a.a().c();
        }
    }

    public static void a(Context context, AuctionItemVO auctionItemVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed8182a", new Object[]{context, auctionItemVO});
        } else {
            a.a().a(auctionItemVO);
        }
    }

    public static void a(Activity activity, AuctionItemVO auctionItemVO, String str, PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20bd4d36", new Object[]{activity, auctionItemVO, str, photoFrom});
            return;
        }
        o.a();
        coy.b(cpk.ALBUM_PAGE_NAME, "PicHistoryClick", new String[0]);
        if (auctionItemVO.isVideo) {
            if (auctionItemVO.fileUrl == null || !i.c(auctionItemVO.fileUrl)) {
                cuk.a(activity, com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19036), 0);
                return;
            }
            cou.a(activity, Uri.parse("https://m.taobao.com/video_imagesearch").buildUpon().appendQueryParameter("videoUrl", URLEncoder.encode(auctionItemVO.fileUrl)).build().toString());
        }
        if (StringUtils.isEmpty(str)) {
            str = "unknown";
        }
        if (photoFrom == null) {
            photoFrom = PhotoFrom.Values.HISTORY;
        }
        IrpParamModel irpParamModel = new IrpParamModel(str);
        irpParamModel.setPicUrl(auctionItemVO.picPath);
        irpParamModel.setPhotoFrom(photoFrom);
        cou.a(activity, irpParamModel);
    }
}
