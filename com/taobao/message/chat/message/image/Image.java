package com.taobao.message.chat.message.image;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class Image {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bigUrl;
    public int downloadProgress;
    public int downloadStatus;
    public boolean hasGoods;
    public int height;
    public String originalUrl;
    public String previewUrl;
    public String type;
    public int width;

    static {
        kge.a(-532184189);
    }

    public Image(String str, int i, int i2) {
        this(str, str, i, i2);
    }

    public Image(String str, String str2, int i, int i2) {
        this(str, str2, "", i, i2);
    }

    public Image(String str, String str2, String str3, int i, int i2) {
        this.previewUrl = str;
        this.bigUrl = str2;
        this.originalUrl = str3;
        this.height = i2;
        this.width = i;
        if (TextUtils.isEmpty(str)) {
            this.previewUrl = this.bigUrl;
        }
        if (TextUtils.isEmpty(str)) {
            this.previewUrl = str3;
        }
        this.previewUrl = rectifyImageUrl(str);
        this.bigUrl = rectifyImageUrl(str2);
        this.originalUrl = rectifyImageUrl(str3);
    }

    private String rectifyImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9220fe3", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.startsWith("https://interface.im.taobao.com") && !str.startsWith("https://interfacepre.im.taobao.com")) {
            return str;
        }
        return "http" + str.substring(5);
    }
}
