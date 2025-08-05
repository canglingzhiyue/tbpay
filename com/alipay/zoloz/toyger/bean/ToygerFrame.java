package com.alipay.zoloz.toyger.bean;

import android.graphics.Bitmap;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.zoloz.toyger.algorithm.TGFaceAttr;
import com.alipay.zoloz.toyger.algorithm.TGFaceState;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.upload.UploadContent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class ToygerFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Bitmap bestBitmap;
    public Map<String, Object> extInfo;
    public UploadContent uploadContent;
    public FrameType frameType = FrameType.INIT;
    public ToygerError error = ToygerError.NORMAL;
    public TGFrame tgFrame = new TGFrame();
    public TGFaceState tgFaceState = new TGFaceState();
    public TGFaceAttr tgFaceAttr = new TGFaceAttr();

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ToygerFrame{frameType=");
        sb.append(this.frameType);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", tgFrame=");
        String str = "***";
        String str2 = "null";
        sb.append(this.tgFrame != null ? str : str2);
        sb.append(", tgFaceState=");
        sb.append(this.tgFaceState != null ? str : str2);
        sb.append(", tgFaceAttr=");
        sb.append(this.tgFaceAttr != null ? str : str2);
        sb.append(", uploadContent=");
        sb.append(this.uploadContent);
        sb.append(", bestBitmap=");
        if (this.bestBitmap == null) {
            str = str2;
        }
        sb.append(str);
        sb.append(", extInfo=");
        Map<String, Object> map = this.extInfo;
        if (map != null) {
            str2 = StringUtil.collection2String(map.keySet());
        }
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }
}
