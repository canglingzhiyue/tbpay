package com.taobao.tao.detail.uimodel.ebook;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.text.DecimalFormat;
import tb.kge;
import tb.mto;
import tb.tpc;

/* loaded from: classes8.dex */
public class EbookVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String author;
    public boolean hasBuy;
    public boolean isSupported;
    private String size;

    static {
        kge.a(-1228969362);
        kge.a(1028243835);
    }

    public EbookVO() {
        tpc.a("com.taobao.tao.detail.uimodel.ebook.EbookVO");
    }

    public String getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b58ca6e2", new Object[]{this}) : formatSize(this.size);
    }

    public void setSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908775d4", new Object[]{this, str});
        } else {
            this.size = str;
        }
    }

    private String formatSize(String str) {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d97e9a97", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            d = Double.parseDouble(str);
        } catch (Exception unused) {
            d = mto.a.GEO_NOT_SUPPORT;
        }
        return new DecimalFormat("0.00").format((d / 1024.0d) / 1024.0d);
    }
}
