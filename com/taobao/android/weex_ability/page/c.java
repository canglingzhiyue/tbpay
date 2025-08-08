package com.taobao.android.weex_ability.page;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.b;
import com.taobao.taobao.R;
import tb.jvj;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f15963a = -1;
    public int b = -1;
    public Bitmap c = null;
    public String d = "";
    public String e = "";
    public Intent f = null;
    public boolean g = false;
    public b.a h;

    static {
        kge.a(-340563847);
    }

    public boolean a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123a1d2", new Object[]{this, str, new Float(f)})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String replace = str.replace(' ', '+');
        try {
            byte[] decode = Base64.decode(replace, 0);
            this.c = jvj.a(BitmapFactory.decodeByteArray(decode, 0, decode.length), (int) (f / 2.0f));
            if (this.c == null) {
                com.taobao.android.weex_framework.util.g.f("MSActionBarMenuItem", replace + "is not a base64 bitmap data");
            }
        } catch (IllegalArgumentException unused) {
            com.taobao.android.weex_framework.util.g.f("MSActionBarMenuItem", "base64 to byteArr decode fail");
        }
        return this.c != null;
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        int i = -1;
        if ("tb_icon_navibar_default_right".equals(str)) {
            i = R.drawable.tb_icon_navibar_default_right;
        }
        this.f15963a = i;
        return i;
    }

    public int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{this, context, str})).intValue();
        }
        this.b = jvj.a(context, str);
        return this.b;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }
}
