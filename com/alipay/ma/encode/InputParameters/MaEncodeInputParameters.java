package com.alipay.ma.encode.InputParameters;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.d;

/* loaded from: classes3.dex */
public class MaEncodeInputParameters {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int qrSize;
    public int rotation;
    public int version;
    public int type = 0;
    public String publicData = null;
    public String errorMsg = "";
    public char errorCorrectionLevel = d.LEVEL_L;

    public MaEncodeInputParameters() {
        this.qrSize = 0;
        this.version = 0;
        this.rotation = 0;
        this.rotation = 0;
        this.qrSize = 0;
        this.version = 4;
    }

    public boolean isLegal() {
        StringBuilder sb;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32224ba", new Object[]{this})).booleanValue();
        }
        if (this.qrSize <= 0) {
            sb = new StringBuilder();
            sb.append(this.errorMsg);
            str = "ERROR: qrSize <=0 ";
        } else if (this.publicData != null) {
            return true;
        } else {
            sb = new StringBuilder();
            sb.append(this.errorMsg);
            str = "ERROR: publicData cant be null \n";
        }
        sb.append(str);
        this.errorMsg = sb.toString();
        return false;
    }
}
