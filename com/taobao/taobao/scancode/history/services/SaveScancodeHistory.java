package com.taobao.taobao.scancode.history.services;

import android.taobao.util.k;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.scancode.history.object.Product;
import com.taobao.taobao.scancode.history.object.ScanDo;
import java.util.Date;
import tb.cot;
import tb.eby;
import tb.kge;
import tb.oxy;
import tb.oyg;
import tb.oys;

/* loaded from: classes8.dex */
public class SaveScancodeHistory extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1986608914);
    }

    public static /* synthetic */ Object ipc$super(SaveScancodeHistory saveScancodeHistory, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        oys.a().a("Save_history_plugin", "params", str2);
        if (!str.equals("saveBarcodeHistory")) {
            return false;
        }
        saveBarcodeHistory(wVCallBackContext, str2);
        return true;
    }

    @WindVaneInterface
    public void saveBarcodeHistory(Object obj, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ba357e", new Object[]{this, obj, str});
            return;
        }
        cot.c(oxy.TAG, "save Barcode History begin! " + str);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject == null) {
                return;
            }
            try {
                i = Integer.parseInt(parseObject.getString("type"));
            } catch (NumberFormatException unused) {
                i = 1;
            }
            handleSaveBarcodeHistory(parseObject.getString("code"), parseObject.getString("title"), parseObject.getString(eby.KEY_PIC_URL), parseObject.getString("price"), i);
        } catch (Exception e) {
            k.a(oxy.TAG, e.getMessage());
        }
    }

    private void handleSaveBarcodeHistory(String str, String str2, String str3, String str4, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1298bb", new Object[]{this, str, str2, str3, str4, new Integer(i)});
            return;
        }
        String str5 = "handle Save Barcode History. barCode=" + str + ", title=" + str2 + ", picUrl " + str3;
        ScanDo scanDo = new ScanDo();
        scanDo.setNewLogic(true);
        scanDo.setType(1);
        Product product = new Product();
        product.setType(i);
        product.setPic(str3);
        product.setTitle(str2);
        if (!StringUtils.isEmpty(str4)) {
            product.setPrice("￥" + str4);
        }
        scanDo.setProduct(product);
        scanDo.setLink(str);
        scanDo.setTime(new Date().getTime());
        oyg.a(Globals.getApplication(), scanDo);
    }
}
