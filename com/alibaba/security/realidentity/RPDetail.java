package com.alibaba.security.realidentity;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RPDetail {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String code;
    public Bitmap faceImage;
    public String msg;
    public String subCode;

    public RPDetail(String str, String str2, String str3, Bitmap bitmap) {
        this.code = str;
        this.subCode = str2;
        this.msg = str3;
        this.faceImage = bitmap;
    }

    public String getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this}) : this.code;
    }

    public Bitmap getFaceImage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("357f78ad", new Object[]{this}) : this.faceImage;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a817838e", new Object[]{this}) : this.msg;
    }

    public String getSubCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3be7742", new Object[]{this}) : this.subCode;
    }

    public void setCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f1cac0", new Object[]{this, str});
        } else {
            this.code = str;
        }
    }

    public void setFaceImage(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca62e4b", new Object[]{this, bitmap});
        } else {
            this.faceImage = bitmap;
        }
    }

    public void setMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965d110", new Object[]{this, str});
        } else {
            this.msg = str;
        }
    }

    public void setSubCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b13f9dc", new Object[]{this, str});
        } else {
            this.subCode = str;
        }
    }
}
