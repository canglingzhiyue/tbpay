package com.etao.feimagesearch.cip.capture.components;

import android.graphics.Bitmap;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes3.dex */
public class AlbumImageVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Bitmap bitmap;
    public Uri imgUri;
    public String orientation;
    public String id = "";
    public String imgFilePath = "";
    public String imgName = "";
    public String imgSize = "";
    public String imgWidth = "-1";
    public String imgHeight = "-1";
    public String lastUpdateTime = "-1";
    public boolean needShow = false;

    static {
        kge.a(-853504703);
        kge.a(1028243835);
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        if (StringUtils.isEmpty(this.orientation)) {
            return 0;
        }
        try {
            return Integer.parseInt(this.orientation);
        } catch (Exception unused) {
            return 0;
        }
    }
}
