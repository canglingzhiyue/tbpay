package com.taobao.browser.jsbridge.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class ActionBarMenuItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int iconResId = -1;
    public int iconFontId = -1;
    public Bitmap iconBitemap = null;
    public String title = "";
    public String href = "";
    public Intent data = null;
    public boolean stretch = false;

    static {
        kge.a(-888082377);
    }

    public boolean setIconBitmap(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0bdd309", new Object[]{this, str, new Float(f)})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String replace = str.replace(' ', '+');
        try {
            byte[] decode = Base64.decode(replace, 0);
            this.iconBitemap = BrowserUtil.a(BitmapFactory.decodeByteArray(decode, 0, decode.length), (int) (f / 2.0f));
            if (this.iconBitemap == null) {
                k.a("ActionBarMenuItem", replace + "is not a base64 bitmap data");
            }
        } catch (IllegalArgumentException unused) {
            k.a("ActionBarMenuItem", "base64 to byteArr decode fail");
        }
        return this.iconBitemap != null;
    }

    public int setIconResId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94f08524", new Object[]{this, str})).intValue();
        }
        int i = -1;
        if ("tb_icon_navibar_default_right".equals(str)) {
            i = R.drawable.tb_icon_navibar_default_right;
        }
        this.iconResId = i;
        return i;
    }

    public int setIconFontId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60e1ae69", new Object[]{this, str})).intValue();
        }
        this.iconFontId = BrowserUtil.a(str);
        return this.iconFontId;
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }
}
